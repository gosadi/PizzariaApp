/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeria.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import pizzeria.entity.Sizes;
import pizzeria.service.SizesService;

@Component
public class StringToSizeConverter implements Converter<String, Sizes>{

    @Autowired
    SizesService service;
    @Override
    public Sizes convert(String s) {
        int id = Integer.parseInt(s);
        Sizes size = service.findById(id);
        return size;
    }
    
}
