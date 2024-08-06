package com.kahraman.kaan.service.Impl;

import com.kahraman.kaan.entity.TitleDeed;
import com.kahraman.kaan.repository.TitleDeedRepository;
import com.kahraman.kaan.service.TitleDeedService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor

public class TitleDeedServiceImpl implements TitleDeedService {

    private final TitleDeedRepository titleDeedRepository;


    @Override
    public TitleDeed createTitleDeed(TitleDeed titleDeed) {
        return titleDeedRepository.save(titleDeed);
    }

    @Override
    public List<TitleDeed> getTitleDeed() {
        return titleDeedRepository.findAll();
    }

    @Override
    public TitleDeed getTitleDeed(Long id) {
        Optional<TitleDeed> titleDeed = titleDeedRepository.findById(id);
        if (titleDeed.isPresent()){
            return titleDeed.get();
        }
        return null;
    }

    @Override
    public TitleDeed updateTitleDeed(Long id, TitleDeed titleDeed) {
        Optional<TitleDeed> resultTitleDeed = titleDeedRepository.findById(id);
        if (resultTitleDeed.isPresent()){
            resultTitleDeed.get().setRegistrationId(titleDeed.getRegistrationId());
            resultTitleDeed.get().setOwnerName(titleDeed.getOwnerName());
            resultTitleDeed.get().setOtherPartners(titleDeed.getOtherPartners());
            resultTitleDeed.get().setDescription(titleDeed.getDescription());
            resultTitleDeed.get().setAdress(titleDeed.getAdress());
            resultTitleDeed.get().setCountry(titleDeed.getCountry());
            resultTitleDeed.get().setCounty(titleDeed.getCounty());
            resultTitleDeed.get().setCity(titleDeed.getCity());
            resultTitleDeed.get().setDistrict(titleDeed.getDistrict());
            resultTitleDeed.get().setDistrictId(titleDeed.getDistrictId());
            resultTitleDeed.get().setInternalCode(titleDeed.getInternalCode());
            resultTitleDeed.get().setM2(titleDeed.getM2());
            resultTitleDeed.get().setStatus(titleDeed.getStatus());
            return  titleDeedRepository.save(resultTitleDeed.get());
        }
        return null;
    }

    @Override
    public Boolean deleteTitleDeed(Long id) {
        Optional<TitleDeed> titleDeed = titleDeedRepository.findById(id);
        if (titleDeed.isPresent()){
            titleDeedRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
