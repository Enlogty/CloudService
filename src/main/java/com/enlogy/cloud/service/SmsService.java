package com.enlogy.cloud.service;

import com.enlogy.cloud.entity.Sms;

import java.util.List;

public interface SmsService {
    List<Sms> queryAll(String localNumber);
    String insertSmsToDB(String localNumber,String address,long date,int type,String body);
}
