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
import pizzeria.entity.Ingredient;
import pizzeria.repository.IngredientRepo;

@Transactional
@Service
public class IngredientServiceImpl implements IngredientService {

    @Autowired
    IngredientRepo ingredientRepo; //edo kalesame to INTERFACE anti tou class
    
    @Override
    public List<Ingredient> findAll() {
        return  ingredientRepo.findAll();
    }
    
}
