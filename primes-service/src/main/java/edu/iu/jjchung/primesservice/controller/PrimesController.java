package edu.iu.jjchung.primesservice.controller;

import edu.iu.jjchung.primesservice.service.IPrimesService;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/primes")
public class PrimesController {
    IPrimesService primesService;
    public PrimesController(IPrimesService primesService){
        this.primesService = primesService;
    }


    @GetMapping("/{n}")
    public boolean isPrime(@PathVariable int n){
        return primesService.isPrime(n);
    }
}