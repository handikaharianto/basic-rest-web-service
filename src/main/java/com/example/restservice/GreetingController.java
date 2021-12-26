package com.example.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

// GreetingController is used to handle the HTTP requests
// The controllers are identified with the @RestController annotation.
// @RestController is a shorthand for including both @Controller & @ResponseBody
@RestController
public class GreetingController {
    private static final String template = "Hello, %s!";
    // Create an object of AtomicLong class with the initial value of 0
    private final AtomicLong counter = new AtomicLong();

    // @GetMapping annotation ensures that HTTP GET request to /greeting are mapped to the
    // greeting() method
    @GetMapping("/greeting")
    // @RequestParam binds the value of the query string parameter 'name' into the 'name' parameter
    // of the 'greeting()' method.
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {

        // this object data will be written directly to the HTTP response as JSON.
        // every method within a controller class will return a domain object (in this case, a Greeting object)
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}

