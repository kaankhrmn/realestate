package com.kahraman.kaan.controller;
import com.kahraman.kaan.entity.Tenant;
import com.kahraman.kaan.entity.Users;
import com.kahraman.kaan.service.UsersService;
import lombok.Data;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Data
@RequestMapping("/users")

public class UsersController {
    private final UsersService usersService;

    public UsersController(UsersService usersService) {
        this.usersService = usersService;
    }

    @PostMapping("/create")
    public ResponseEntity<Users> create(@RequestBody Users users){
        Users result = usersService.createUser(users);
        return ResponseEntity.ok(result);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Users>> getAll(){
       List<Users> result = usersService.getUsers();
        return ResponseEntity.ok(result);
    }

    @GetMapping("/getByid/{id}")
    public ResponseEntity<Users> findByid(@PathVariable ("id") Long id){
        Users result = usersService.getUsers(id);
        return ResponseEntity.ok(result);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Users> updateUsers(@PathVariable ("id") Long id , @RequestBody Users users){
        Users result = usersService.updateUsers(id,users);
        return ResponseEntity.ok(result);
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<Boolean> deleteUsers(@PathVariable ("id") Long id){
        Boolean result = usersService.deleteUsers(id);
        return ResponseEntity.ok(result);
    }
}
