/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeria.repository;

import java.util.List;
import org.springframework.stereotype.Repository;
import pizzeria.entity.Payment;

@Repository
public class PaymentRepoImpl extends HibernateUtil<Payment>implements PaymentRepo {

    @Override
    public List<Payment> findAll() {
        return super.findAll("Payment.findAll");
    }
    
}
