/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeria.repository;

import java.util.List;
import org.springframework.stereotype.Repository;
import pizzeria.entity.Ingredient;

@Repository
public class IngredientRepoImpl extends HibernateUtil<Ingredient>implements IngredientRepo {

    @Override
    public List<Ingredient> findAll() {
        return super.findAll("Ingredient.findAll");
    }

    @Override
    public Ingredient findById(int id) {
        return super.findById("Ingredient.findById","id", id);
    }
    
    
    
}
