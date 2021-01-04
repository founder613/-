package com.bjpowernode.springcloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.PathVariable;

import com.bjpowernode.springcloud.entities.Payment;

@Mapper
public interface PaymentDao {
    public int create(Payment payment);
    public Payment getPaymentById(@PathVariable("id")long id);
}
