package com.kdfood.product;

import java.util.List;

import com.kdfood.product.Product;

public interface ProductDAO
{
	public void insert(Product c);
	public void update(Product c);
	public void delete(int cid);
	
	public Product getProduct(int cid);
	public List<Product> getAllProducts();
	public Product getProductWithMaxId();
	
}