/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeria.repository;

import java.util.List;
import pizzeria.entity.Payment;


public interface PaymentRepo {
    List<Payment> findAll();

    public Payment findById(int id);
}
