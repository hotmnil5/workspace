package com.green.DataPractice.controller;

import com.green.DataPractice.vo.DeliveryVO;
import com.green.DataPractice.vo.OrderVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class OderController {
    // 주문정보 페이지
    @GetMapping("/ord")
    public String ord(){
        return "order";
    }
    // 배달정보 페이지
    @PostMapping("/del")
    public String del(OrderVO orderVO){
        return "delivery";
    }
    // 주문정보 확인 페이지
    @PostMapping("/info")
    public String info(OrderVO orderVO, DeliveryVO deliveryVo){
        return "order_info";
    }
}
