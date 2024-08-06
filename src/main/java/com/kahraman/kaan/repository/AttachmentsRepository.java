package com.kahraman.kaan.repository;

import com.kahraman.kaan.entity.Attachments;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AttachmentsRepository extends JpaRepository<Attachments , Long> {

}
