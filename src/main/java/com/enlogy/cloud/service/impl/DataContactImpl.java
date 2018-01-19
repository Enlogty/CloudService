package com.enlogy.cloud.service.impl;

import com.enlogy.cloud.entity.DataContact;
import com.enlogy.cloud.repository.DataContactRepository;
import com.enlogy.cloud.service.DataContactService;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataContactImpl implements DataContactService{

    @Autowired
    private DataContactRepository repository;
    @Override
    public void writeContactToMysql(String json) {
        Gson gson = new Gson();
        List<DataContact> contacts  = gson.fromJson(json, new TypeToken<List<DataContact>>() {
        }.getType());
        for (DataContact contact : contacts){
            repository.save(contact);
        }
    }

    @Override
    public List<DataContact> findAllFromDataContact() {
        return repository.findAll();
    }
}
