package com.bjpowernode.springcloud.service;

import com.bjpowernode.springcloud.entities.Payment;
import org.springframework.web.bind.annotation.PathVariable;

public interface PaymentService {
    public int create(Payment payment);
    public Payment getPaymentById(@PathVariable("id") long id);

}
