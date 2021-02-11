/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeria.controller;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pizzeria.entity.Order;
import pizzeria.service.OrderService;

/**
 *
 * @author alkinoos
 */
@Controller
@RequestMapping("/order")
public class OrderController {

    @Autowired
    OrderService orderService;
    
    @GetMapping("/pizza")
    public String orderPizza(@ModelAttribute(name = "paraggelia") Order order) {
        return "pizza/orderForm";
    }
    
    @PostMapping("/pizza")
    public String showOrderList(@Valid @ModelAttribute(name = "paraggelia")Order order) {
        return "redirect:pizza/orderList";
    }

    //emfanisi listas ton payments
    @ModelAttribute(name = "listOfPayments")
    public List<String> getPayments() {
        return orderService.getPaymentMethod();
    }

    
}
