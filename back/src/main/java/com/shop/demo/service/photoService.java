package com.shop.demo.service;


import com.shop.demo.entity.Picture;

import java.util.List;

public interface photoService {
    List<Picture> getPicture(String commodityID);
    int addPicture(Picture addpicture);
}
