package com.kahraman.kaan.service;

import com.kahraman.kaan.entity.Attachments;

import java.util.List;

public interface AttachmentsService {
    Attachments creatAttachments(Attachments attachments);
    List<Attachments> getAttachments();
    Attachments getAttachments(Long id);
    Attachments updateAttachments(Long id , Attachments attachments);
    Boolean deleteAttachments(Long id);
}
