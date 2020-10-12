package com.example.demo;

import static org.springframework.http.HttpStatus.OK;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ola-mundo")
public class TesteController {
  @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
  @ResponseStatus(OK)
  public String get() {
    return "olá mundo";
  }
}
