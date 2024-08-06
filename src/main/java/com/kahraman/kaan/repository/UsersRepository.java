package com.kahraman.kaan.repository;

import com.kahraman.kaan.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users , Long> {
}
