package edu.iu.jjchung.primesservice.repository;

import edu.iu.jjchung.primesservice.model.Customer;

import java.io.IOException;

public interface IAuthenticationRepository {
    boolean save(Customer customer) throws IOException;

    Customer findByUsername(String username) throws IOException;
}