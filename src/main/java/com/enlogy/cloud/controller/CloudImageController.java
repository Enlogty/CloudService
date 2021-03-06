package com.enlogy.cloud.controller;

import com.enlogy.cloud.entity.CloudImage;
import com.enlogy.cloud.service.CloudImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(value = "/image")
public class CloudImageController {

    @Autowired
    private CloudImageService service;
    @GetMapping(value = "/findall")
    public List<CloudImage> findAll(){
        return service.findAll();
    }

    @PostMapping(value = "/insert")
    public CloudImage insert(@RequestParam(value = "mynumber")String localNumber ,@RequestParam(value = "path")String path , @RequestParam(value = "url") String url,@RequestParam(value = "type") String type){
        return service.insert(localNumber,path,url,type);
    }
}
