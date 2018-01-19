package com.enlogy.cloud.controller;

import com.enlogy.cloud.entity.DataContact;
import com.enlogy.cloud.service.DataContactService;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DataContactController {
    @Autowired
    private DataContactService service;

    @PostMapping(value = "/uploadContactData")
    public void writeContactToMysql(@RequestParam(value = "data") String data){
        service.writeContactToMysql(data);
    }

    @GetMapping(value = "/downloadContactData")
    public List<DataContact> queryAllFromDataContact(){
        return service.findAllFromDataContact();
    }
}
