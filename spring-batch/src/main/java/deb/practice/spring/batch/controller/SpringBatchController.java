package deb.practice.spring.batch.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Deb
 * Date : 11/27/2022
 */
@RestController
@RequestMapping("/api")
public class SpringBatchController {
    private static final Logger LOG = LoggerFactory.getLogger(SpringBatchController.class);

    @PostMapping("/runjob")
    public String runJob() {
        LOG.info("Running job.........");
        return "success";
    }
}
