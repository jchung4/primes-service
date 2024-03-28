package edu.iu.jjchung.primesservice.service;

import edu.iu.jjchung.primesservice.model.Customer;

import java.io.IOException;

public interface IAuthenticationService {

    boolean register(Customer customer) throws IOException;

    boolean login(String username, String password) throws IOException;
}