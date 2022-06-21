package com.example.services;


import com.example.dao.UserDAOImpl;
import com.example.dao.UserDao;
import com.example.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserServiceImpl {
    private final UserDao  userDao;

    @Autowired
    public UserServiceImpl(UserDAOImpl userDao) {
        this.userDao = userDao;
    }

    @Transactional
    public void addUser(User user) {
        userDao.addUser(user);
    }
    @Transactional
    public void updateUser(User user) {
        userDao.updateUser(user);
    }
    @Transactional
    public void removeUser(int id) {
       userDao.removeUser(id);
    }
    public User getUserById(int id) {
       return userDao.getUserById(id);

    }
    public List<User> listUsers(){
        return userDao.listUsers();
    }
}
