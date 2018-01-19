package com.enlogy.cloud.service;

import com.enlogy.cloud.entity.ValidCode;

import java.util.List;

public interface ValidCodeService {
    String validCode(String phoneNumber);
    List<ValidCode>  findAll();
}
