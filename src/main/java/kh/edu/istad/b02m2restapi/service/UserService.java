package kh.edu.istad.b02m2restapi.service;

import kh.edu.istad.b02m2restapi.model.User;

import java.util.List;
import java.util.UUID;

public interface UserService {

    // YOUR LOGIC
    List<User> getAll();

    User getById(UUID id);

    User create(User user);

    void delete(UUID id);

}