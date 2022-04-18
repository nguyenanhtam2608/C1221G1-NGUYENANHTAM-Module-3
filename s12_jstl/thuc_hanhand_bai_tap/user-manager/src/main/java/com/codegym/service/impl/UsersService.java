package com.codegym.service.impl;

import com.codegym.model.User;
import com.codegym.repository.IUsersRepository;
import com.codegym.repository.impl.UsersRepository;
import com.codegym.service.IUsersService;

import java.sql.SQLException;
import java.util.List;

public class UsersService implements IUsersService {
    IUsersRepository iUsersRepository = new UsersRepository();


    @Override
    public List<User> selectAllUsers() {
        return iUsersRepository.selectAllUsers();
    }

    @Override
    public void insertUser(User user) throws SQLException {

    }

    @Override
    public User selectUser(int id) {
        return iUsersRepository.selectUser(id);
    }

    @Override
    public boolean deleteUser(int id) throws SQLException {
        return false;
    }

    @Override
    public boolean updateUser(User user) throws SQLException {
        return false;
    }

    @Override
    public List<User> searchCountry(String country) {
        return iUsersRepository.searchCountry(country);
    }

    @Override
    public List<User> sortName() {
        return iUsersRepository.sortName();
    }
}
