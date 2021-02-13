/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeria.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pizzeria.entity.Sizes;
import pizzeria.repository.SizesRepo;


@Transactional
@Service
public class SizesServiceImpl implements SizesService {

    @Autowired
    SizesRepo sizesRepo; //edo kalesame to INTERFACE anti tou class
    
    @Override
    public List<Sizes> findAll() {
        return sizesRepo.findAll();
    }

    @Override
    public Sizes findById(int id) {
        return sizesRepo.findById(id);
    }
    
}
