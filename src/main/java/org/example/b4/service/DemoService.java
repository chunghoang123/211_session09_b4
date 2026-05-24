package org.example.b4.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class DemoService {

    public void testLog() {

        log.debug("Debug message");

        log.info("Info message");

        log.warn("Warn message");

        log.error("Error message");
    }
}