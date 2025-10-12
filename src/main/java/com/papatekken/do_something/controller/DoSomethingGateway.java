package com.papatekken.do_something.controller;

import org.springframework.validation.annotation.Validated;

@RestController
@Validated
public class DoSomethingGateway {

    @GetMapping("/greeting")
    public ResponseEntity<String> greeting(){
        return ResponseEntity.ok("hello world");
    }
}
