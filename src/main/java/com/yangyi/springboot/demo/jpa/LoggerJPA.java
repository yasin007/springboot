package com.yangyi.springboot.demo.jpa;

import com.yangyi.springboot.demo.entity.LoggerEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface LoggerJPA
        extends JpaRepository<LoggerEntity, Long> {

}