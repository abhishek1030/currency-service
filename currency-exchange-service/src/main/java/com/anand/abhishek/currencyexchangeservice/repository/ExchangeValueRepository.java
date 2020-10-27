package com.anand.abhishek.currencyexchangeservice.repository;

import com.anand.abhishek.currencyexchangeservice.beans.ExchangeValue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue,Long> {

    ExchangeValue findByFromAndTo(String from,String to);
}
