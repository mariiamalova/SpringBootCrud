package com.example.services;


import com.example.model.User;
import com.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserServiceImpl {
    private final  UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public void addUser(User user) {
        userRepository.save(user);
    }
    public void updateUser(User user) {
        userRepository.save(user);
    }
    public void removeUser(int id) {
       userRepository.deleteById(id);
    }
    public User getUserById(int id) {
        return userRepository.getOne(id);
    }
    public List<User> listUsers() {
         return userRepository.findAll();
    }
}
