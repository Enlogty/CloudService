package com.enlogy.cloud.controller;

import com.enlogy.cloud.bean.UpdateUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.RequestMappingInfo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

@RestController
public class UpdateController {

//    @GetMapping(value = "/retrofit")
//    public StringBean testRetrofit(){
//        StringBean sb = new StringBean();
//        sb.setContent("This is Retrofit !!!");
//        return sb;
//    }rxretrofit
    @GetMapping(value = "/updateApk")
    public UpdateUrl updateApk(@RequestParam (value = "versionCode")int versionCode){
       int newApkVersionCode = 1;
        String url = "http://39.108.5.202:8008/files/communicationassistant.apk";
        UpdateUrl updateUrl = new UpdateUrl();
        if (versionCode != newApkVersionCode )
        {
            updateUrl.setBody(url);
            return updateUrl;
        }else {
            updateUrl.setBody("fail");
            return updateUrl;
        }

    }

}
