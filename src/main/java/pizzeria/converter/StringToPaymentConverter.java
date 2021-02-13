/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeria.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import pizzeria.entity.Payment;
import pizzeria.service.PaymentService;

@Component
public class StringToPaymentConverter implements Converter<String, Payment>{

    @Autowired
    PaymentService service;
    
    @Override
    public Payment convert(String s) {
        int id = Integer.parseInt(s);
        Payment payment = service.findById(id);
        return payment;
    }
    
}
