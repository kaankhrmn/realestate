package com.kahraman.kaan.service.Impl;

import com.kahraman.kaan.entity.Attachments;
import com.kahraman.kaan.repository.AttachmentsRepository;
import com.kahraman.kaan.service.AttachmentsService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.aspectj.weaver.bcel.AtAjAttributes;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Data
public class AttachmentsServiceImpl implements AttachmentsService {

    private final AttachmentsRepository attachmentsRepository;

    @Override
    public Attachments creatAttachments(Attachments attachments) {
        return attachmentsRepository.save(attachments);
    }

    @Override
    public List<Attachments> getAttachments() {
        return attachmentsRepository.findAll();
    }

    @Override
    public Attachments getAttachments(Long id) {
        Optional<Attachments> attachments = attachmentsRepository.findById(id);
        if (attachments.isPresent()){
            return attachments.get();
        }
        return null;
    }

    @Override
    public Attachments updateAttachments(Long id, Attachments attachments) {
        Optional<Attachments> result = attachmentsRepository.findById(id);
        if (result.isPresent()){
            result.get().setContractId(attachments.getContractId());
            result.get().setAttachments(attachments.getAttachments());
            result.get().setDescription(attachments.getDescription());
            result.get().setSessionid(attachments.getSessionid());
            result.get().setPropertyId(attachments.getPropertyId());
            return attachmentsRepository.save(result.get());
        }
        return null;
    }

    @Override
    public Boolean deleteAttachments(Long id) {
        Optional<Attachments> attachments = attachmentsRepository.findById(id);
        if (attachments.isPresent()){
            attachmentsRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
