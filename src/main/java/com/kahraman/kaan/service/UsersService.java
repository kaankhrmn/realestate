package com.kahraman.kaan.service;

import com.kahraman.kaan.entity.Users;

import java.util.List;

public interface UsersService {
    Users createUser(Users users);
    List<Users> getUsers();
    Users getUsers(Long id);
    Users updateUsers(Long id , Users users);
    Boolean deleteUsers(Long id);
}
