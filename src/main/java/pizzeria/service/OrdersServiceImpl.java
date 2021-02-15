/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pizzeria.entity.Orders;
import pizzeria.repository.OrdersRepo;

/**
 *
 * @author alkinoos
 */
@Transactional
@Service
public class OrdersServiceImpl implements OrdersService{
    
    @Autowired
    OrdersRepo ordersRepo;

    @Override
    public void save(Orders order) {
        ordersRepo.save(order);
    }
    
}
