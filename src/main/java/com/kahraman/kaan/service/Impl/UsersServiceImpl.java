package com.kahraman.kaan.service.Impl;

import com.kahraman.kaan.entity.Users;
import com.kahraman.kaan.repository.UsersRepository;
import com.kahraman.kaan.service.UsersService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Data
@Service

public class UsersServiceImpl implements UsersService {
    private final UsersRepository usersRepository;

    @Override
    public Users createUser(Users users) {
        return usersRepository.save(users);
    }

    @Override
    public List<Users> getUsers() {
        return usersRepository.findAll();
    }

    @Override
    public Users getUsers(Long id) {
        Optional<Users> getUsers = usersRepository.findById(id);
        if (getUsers.isPresent()){
            return getUsers.get();
        }
        return null;
    }

    @Override
    public Users updateUsers(Long id, Users users) {
        Optional<Users> updateUsers = usersRepository.findById(id);
        if (updateUsers.isPresent()){
            updateUsers.get().setPropertyId(users.getPropertyId());
            updateUsers.get().setPropertyOwners(users.getPropertyOwners());
            return usersRepository.save(updateUsers.get());
        }
        return null;
    }

    @Override
    public Boolean deleteUsers(Long id) {
        Optional<Users> deleteUsers = usersRepository.findById(id);
        if (deleteUsers.isPresent()){
            usersRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
