package org.example.b4;

import org.example.b4.service.DemoService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartupRunner implements CommandLineRunner {

    private final DemoService demoService;

    public StartupRunner(DemoService demoService) {
        this.demoService = demoService;
    }

    @Override
    public void run(String... args) {
        demoService.testLog();
    }
}