/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeria.service;

import java.util.List;
import pizzeria.entity.Sizes;

public interface SizesService {
    
    List<Sizes> findAll();

    public Sizes findById(int id);
}
