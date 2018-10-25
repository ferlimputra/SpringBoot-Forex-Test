package com.in28minutes.springboot.microservice.example.forex.repository;

import com.in28minutes.springboot.microservice.example.forex.entity.ExchangeValue;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long> {
    public ExchangeValue findByFromAndTo(String from, String to);
}