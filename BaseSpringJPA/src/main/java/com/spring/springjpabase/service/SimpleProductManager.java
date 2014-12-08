package com.spring.springjpabase.service;

import java.util.List;
import com.spring.springjpabase.domain.Product;

public class SimpleProductManager implements ProductManager {

	private static final long serialVersionUID = 1L;
	
	private List<Product> products;

	@Override
    public List<Product> getProducts() {
		//throw new UnsupportedOperationException(); 
        return products;      
    }

	@Override
    public void increasePrice(int percentage) {
        //throw new UnsupportedOperationException();  
		if (products != null) {
            for (Product product : products) {
                double newPrice = product.getPrice().doubleValue() * 
                                    (100 + percentage)/100;
                product.setPrice(newPrice);
            }
        }  
	}
	
    public void setProducts(List<Product> products) {
    	//throw new UnsupportedOperationException(); 
        this.products = products;       
    }
}
