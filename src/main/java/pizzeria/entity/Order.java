/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeria.entity;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Objects;
import org.springframework.format.annotation.DateTimeFormat;

/**
 *
 * @author alkinoos
 */

public class Order {
    
    private String size;
    private String [] ingredients;
    private String paymentMethod;
    private String name;
    private String age;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate date;

    public Order() {
    }

    public Order(String size, String[] ingredients, String paymentMethod, String name, String age, LocalDate date) {
        this.size = size;
        this.ingredients = ingredients;
        this.paymentMethod = paymentMethod;
        this.name = name;
        this.age = age;
        this.date = date;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(String[] ingredients) {
        this.ingredients = ingredients;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.size);
        hash = 11 * hash + Arrays.deepHashCode(this.ingredients);
        hash = 11 * hash + Objects.hashCode(this.paymentMethod);
        hash = 11 * hash + Objects.hashCode(this.name);
        hash = 11 * hash + Objects.hashCode(this.age);
        hash = 11 * hash + Objects.hashCode(this.date);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Order other = (Order) obj;
        if (!Objects.equals(this.size, other.size)) {
            return false;
        }
        if (!Objects.equals(this.paymentMethod, other.paymentMethod)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.age, other.age)) {
            return false;
        }
        if (!Arrays.deepEquals(this.ingredients, other.ingredients)) {
            return false;
        }
        if (!Objects.equals(this.date, other.date)) {
            return false;
        }
        return true;
    }
    
    
}
