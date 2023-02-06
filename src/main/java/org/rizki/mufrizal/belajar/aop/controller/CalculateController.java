package org.rizki.mufrizal.belajar.aop.controller;

import org.rizki.mufrizal.belajar.aop.service.CalculateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculateController {

    @Autowired
    private CalculateService calculateService;

    @GetMapping(value = "/sum")
    public ResponseEntity<?> sum(@RequestParam("a") int a, @RequestParam("b") int b) {
        return new ResponseEntity<>(calculateService.sum(a, b), HttpStatus.OK);
    }

}