package com.enlogy.cloud.service;

import com.enlogy.cloud.entity.CloudImage;

import java.util.List;

public interface CloudImageService {
    List<CloudImage> findAll();
    CloudImage insert(String localNumber,String path,String url,String type);
}
