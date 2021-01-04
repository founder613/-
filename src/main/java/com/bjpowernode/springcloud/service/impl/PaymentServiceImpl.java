package com.bjpowernode.springcloud.service.impl;

import javax.annotation.Resource;
import com.bjpowernode.springcloud.dao.PaymentDao;
import com.bjpowernode.springcloud.entities.Payment;
import com.bjpowernode.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(long id) {
        return paymentDao.getPaymentById(id);
    }

}
