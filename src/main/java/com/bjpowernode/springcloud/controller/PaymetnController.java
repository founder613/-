package com.bjpowernode.springcloud.controller;

import com.bjpowernode.springcloud.entities.CommonResult;
import com.bjpowernode.springcloud.entities.Payment;
import com.bjpowernode.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @ProjectName: dljd
 * @Package: com.liusp.controller
 * @Description: java类作用描述
 * @Author: Andy
 * @CreateDate: 2021/1/4 10:21
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2021
 */
@RestController
@Slf4j  //打印日志
public class PaymetnController {
    @Value("${server.port}")
    private String serverPort;
    @Resource
    private PaymentService paymentService;

    @PostMapping("/payment/create")
    public CommonResult create(@RequestBody Payment payment) {
        log.info("参数获取"+payment);
        int result =paymentService.create(payment);

        log.info("插入结果："+result);
        if(result>0) {
            return new CommonResult(200,"插入数据成功"+serverPort,result);
        }else {
            return new CommonResult(444,"插入数据失败"+serverPort,null);
        }

    }
    @RequestMapping("/payment/get/{id}")
    public  CommonResult<Payment>  getPaymentById(@PathVariable("id") Long id) {

        Payment payment =paymentService.getPaymentById(id);
        //记录日志
        log.info("插入结果："+payment);
        if(payment !=null) {
            return new CommonResult(200,"查询成功"+serverPort,payment);
        }else {
            return new CommonResult(444,"查询失败"+serverPort+id,null);
        }

    }


}