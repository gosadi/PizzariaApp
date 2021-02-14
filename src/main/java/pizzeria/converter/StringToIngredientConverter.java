/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeria.converter;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import pizzeria.entity.Ingredient;
import pizzeria.service.IngredientService;

/**
 *
 * @author alkinoos
 */
@Component
public class StringToIngredientConverter implements Converter <List<String>, List<Ingredient>>{
    
    @Autowired
    IngredientService service;

    @Override
    public List<Ingredient> convert(List<String> source) {
        List<Ingredient> ingrId = new ArrayList();
        for(String ingr : source){
         int id = Integer.parseInt(ingr);
         Ingredient ingredient = service.findById(id);
         ingrId.add(ingredient);
         
        }
        return ingrId;
    }

    

    
    
    

    
    
}
