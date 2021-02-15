/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeria.repository;

import pizzeria.entity.Orders;

/**
 *
 * @author alkinoos
 */
public interface OrdersRepo {
    void save(Orders order);
}
