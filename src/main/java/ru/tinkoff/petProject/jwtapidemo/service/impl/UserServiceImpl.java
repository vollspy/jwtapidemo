package ru.tinkoff.petProject.jwtapidemo.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import ru.tinkoff.petProject.jwtapidemo.model.Role;
import ru.tinkoff.petProject.jwtapidemo.model.User;
import ru.tinkoff.petProject.jwtapidemo.repository.RoleRepository;
import ru.tinkoff.petProject.jwtapidemo.repository.UserRepository;
import ru.tinkoff.petProject.jwtapidemo.service.UserService;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class UserServiceImpl implements UserService {


    private final UserRepository userRepository;

    private final RoleRepository roleRepository;

    private final BCryptPasswordEncoder passwordEncoder;

    @Autowired
    public UserServiceImpl(UserRepository userRepository, RoleRepository roleRepository, BCryptPasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public User register(User user) {
        Role roleUser = roleRepository.findByName("ROLE_USER");
        List<Role> userRoles = new ArrayList<>();
        userRoles.add(roleUser);


        return null;
    }

    @Override
    public List<User> getAll() {
        return null;
    }

    @Override
    public User findByUsername(String username) {
        return null;
    }

    @Override
    public User findById(Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
