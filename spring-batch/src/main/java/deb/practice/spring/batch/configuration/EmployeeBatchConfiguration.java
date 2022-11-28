package deb.practice.spring.batch.configuration;

import deb.practice.spring.batch.entity.Employee;
import deb.practice.spring.batch.repository.EmployeeRepository;
import deb.practice.spring.batch.service.CustomEmployeeProcessor;
import deb.practice.spring.batch.service.CustomEmployeeReader;
import deb.practice.spring.batch.service.CustomEmployeeWriter;
import deb.practice.spring.batch.service.EmployeeService;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.task.SimpleAsyncTaskExecutor;
import org.springframework.core.task.TaskExecutor;

/**
 * Created by Deb
 * Date : 11/27/2022
 */
@Configuration
@EnableBatchProcessing
public class EmployeeBatchConfiguration {
    private final EmployeeService service;
    private final EmployeeRepository repo;
    private final JobBuilderFactory jobBuilderFactory;
    private final StepBuilderFactory stepBuilderFactory;

    public EmployeeBatchConfiguration(EmployeeService service, EmployeeRepository repo, JobBuilderFactory jobBuilderFactory, StepBuilderFactory stepBuilderFactory) {
        this.service = service;
        this.repo = repo;
        this.jobBuilderFactory = jobBuilderFactory;
        this.stepBuilderFactory = stepBuilderFactory;
    }

    @Bean
    public ItemReader<Employee> itemReader() {
        return new CustomEmployeeReader(this.service);
    }

    @Bean
    public ItemWriter<Employee> itemWriter() {
        return new CustomEmployeeWriter(this.repo);
    }

    @Bean
    public ItemProcessor<Employee, Employee> itemProcessor() {
        return new CustomEmployeeProcessor();
    }

    @Bean
    public Step step() {
        return this.stepBuilderFactory.get("employee-details").<Employee, Employee>chunk(10)
                .reader(itemReader())
                .processor(itemProcessor())
                .writer(itemWriter())
                .taskExecutor(taskExecutor())
                .build();
    }

    @Bean
    public Job job() {
        return this.jobBuilderFactory.get("importEmployeeDetails")
                .flow(step()).end().build();
    }

    @Bean
    public TaskExecutor taskExecutor() {
        SimpleAsyncTaskExecutor asyncTaskExecutor = new SimpleAsyncTaskExecutor();
        asyncTaskExecutor.setConcurrencyLimit(10);
        return asyncTaskExecutor;
    }

}
