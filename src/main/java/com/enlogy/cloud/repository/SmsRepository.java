package com.enlogy.cloud.repository;

import com.enlogy.cloud.entity.Sms;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SmsRepository extends JpaRepository<Sms,Integer>{
}
