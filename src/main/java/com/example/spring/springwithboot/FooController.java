package com.example.spring.springwithboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FooController {

    private final FooRepository fooRepository;

    public FooController(FooRepository fooRepository) {
        this.fooRepository = fooRepository;
    }

    @GetMapping("/foos")
    public List<Foo> foos() {
        List<Foo> all = fooRepository.findAll();
        return all;
    }
}
