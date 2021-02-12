/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeria.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pizzeria.entity.Ingredient;
import pizzeria.entity.Payment;
import pizzeria.entity.Sizes;
import pizzeria.service.IngredientService;
import pizzeria.service.PaymentService;
import pizzeria.service.SizesService;


@Controller
@RequestMapping("/orders")
public class OrdersController {
    
    //1)gia na fero ta sizes apo to service
    @Autowired
    SizesService sizesService;
    //2)gia na fero ta ingredients apo to service
    @Autowired
    IngredientService ingredientService;
    //3)gia na fero ta payments apo to service
    @Autowired
    PaymentService paymentService;
    
    //1)
    @ModelAttribute("sizes")
    public List<Sizes> getSizes(){
        return sizesService.findAll();
    }
    //2)
    @ModelAttribute("ingredients")
    public List<Ingredient> getIngredients(){
        return ingredientService.findAll();
    }
    //3)
    @ModelAttribute("payments")
    public List<Payment> getPayments(){
        return paymentService.findAll();
    }
    
    
    @GetMapping("/pizza")
    public String showPizzaForm(){
        return "pizza/orderForm";
    }
    
    @PostMapping("/pizza")
    public String showOrder(){
        return null;
    }
}
