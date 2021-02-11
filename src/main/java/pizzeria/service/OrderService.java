/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeria.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pizzeria.entity.Order;

/**
 *
 * @author alkinoos
 */
//@Transactional
@Service
public class OrderService {
    
    
    private Order order;
    
    public List<String> getPaymentMethod(){
        List<String> payments = new ArrayList<>();
        payments.add("credit card");
        payments.add("cash");
        payments.add("bank");
        return payments;
    }
    
    
}
