package com.kahraman.kaan.controller;

import com.kahraman.kaan.entity.Attachments;
import com.kahraman.kaan.service.AttachmentsService;
import lombok.Data;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
@RequestMapping("/attachments")
@Data

public class AttachmentsController {

    private final AttachmentsService attachmentsService;

    public AttachmentsController(AttachmentsService attachmentsService) {
        this.attachmentsService = attachmentsService;
    }

    @PostMapping("/create")
    public ResponseEntity<Attachments> createAttachments(@RequestBody Attachments attachments){
        Attachments result = attachmentsService.creatAttachments(attachments);
        return ResponseEntity.ok(result);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Attachments>> getAll(){
       List<Attachments> result = attachmentsService.getAttachments();
        return ResponseEntity.ok(result);
    }

    @GetMapping("/getById/{id}")
    public ResponseEntity<Attachments> getByid(@PathVariable ("id") Long id){
        Attachments result = attachmentsService.getAttachments(id);
        return ResponseEntity.ok(result);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Attachments> updateAttachments(@PathVariable ("id") Long id , @RequestBody Attachments attachments){
        Attachments result = attachmentsService.updateAttachments(id,attachments);
        return ResponseEntity.ok(result);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Boolean> deleteAttachments(@PathVariable ("id") Long id){
        Boolean result = attachmentsService.deleteAttachments(id);
        return ResponseEntity.ok(result);
    }


}
