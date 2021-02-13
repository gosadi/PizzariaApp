/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeria.repository;

import java.util.List;
import org.springframework.stereotype.Repository;
import pizzeria.entity.Sizes;


@Repository
public class SizesRepoImpl extends HibernateUtil<Sizes>implements SizesRepo{
    
    @Override
    public List<Sizes> findAll() {
        return super.findAll("Sizes.findAll");
    }

    @Override
    public Sizes findById(int id) {
        return super.findById("Sizes.findById",id);
    }
    
}
