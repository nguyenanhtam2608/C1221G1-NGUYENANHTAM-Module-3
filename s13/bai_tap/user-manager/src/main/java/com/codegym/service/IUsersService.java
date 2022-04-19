package com.codegym.service;

import com.codegym.model.User;

import java.sql.SQLException;
import java.util.List;

public interface IUsersService{
    public List<User> selectAllUsers();

    public void insertUser(User user) throws SQLException;

    public User selectUser(int id);

    public boolean deleteUser(int id) throws SQLException;

    public boolean updateUser(User user) throws SQLException;

    public List<User> searchCountry(String country);
    public List<User> sortName();
    void addUserTransaction(User user, int[] permisions);

    void insertUpdateWithoutTransaction();

    void insertUpdateUseTransaction();
}
