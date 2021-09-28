package com.daeso.nar01.contoroller;

import java.util.concurrent.atomic.AtomicLong;

import com.daeso.nar01.model.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }

    @GetMapping("/aa")
    public Greeting aa() {
        return new Greeting(1l,"qwerqwer");
    }

    @GetMapping("/bb")
    public Greeting bb() {
        return new Greeting(1l,"bbbbbb");
    }
}
