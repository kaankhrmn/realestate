package com.kahraman.kaan.service;

import com.kahraman.kaan.entity.TitleDeed;

import java.util.List;

public interface TitleDeedService {

    TitleDeed createTitleDeed(TitleDeed titleDeed);
    List<TitleDeed> getTitleDeed();
    TitleDeed getTitleDeed(Long id);
    TitleDeed updateTitleDeed(Long id , TitleDeed titleDeed);
    Boolean deleteTitleDeed(Long id);

}
