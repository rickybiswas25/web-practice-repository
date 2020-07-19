package deb.practice.spring.security.configuration;

import deb.practice.spring.security.service.StudentUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * Created by Deb
 * Date : 16/07/2020.
 */
@EnableWebSecurity
@Configuration
public class StudentSecurityConfiguration extends WebSecurityConfigurerAdapter {
    private final StudentUserService userService;

    @Autowired
    public StudentSecurityConfiguration(StudentUserService userService) {
        this.userService = userService;
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userService)
                .passwordEncoder(new BCryptPasswordEncoder(15));
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();
        http.authorizeRequests()
                .anyRequest().authenticated()
                .and()
                .formLogin().permitAll()
                .and()
                .logout()
                .clearAuthentication(true)
                .deleteCookies("JSESSIONID");
    }
}
