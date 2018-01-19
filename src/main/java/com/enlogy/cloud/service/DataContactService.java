package com.enlogy.cloud.service;

import com.enlogy.cloud.entity.DataContact;

import java.util.List;

public interface DataContactService {
    void  writeContactToMysql(String json);
    List<DataContact> findAllFromDataContact();
}
