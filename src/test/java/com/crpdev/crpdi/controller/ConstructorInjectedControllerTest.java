package com.crpdev.crpdi.controller;

import com.crpdev.crpdi.service.ConstructorInjectedGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectedController(new ConstructorInjectedGreetingService());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}
