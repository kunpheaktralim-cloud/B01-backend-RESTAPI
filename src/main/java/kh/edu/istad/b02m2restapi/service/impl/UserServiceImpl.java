package kh.edu.istad.b02m2restapi.service.impl;

import kh.edu.istad.b02m2restapi.model.User;
import kh.edu.istad.b02m2restapi.repository.UserRepository;
import kh.edu.istad.b02m2restapi.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public List<User> getAll() {
        return userRepository.selectAll();
    }


    @Override
    public User getById(UUID id) {
        return userRepository.selectById(id)
                .orElseThrow();
    }

    @Override
    public User create(User user) {
        userRepository.insert(user);
        return user;
    }

    @Override
    public void delete(UUID id) {
        userRepository.delete(id);
    }
}