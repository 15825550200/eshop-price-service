package com.roncoo.eshop.product.service;

import com.roncoo.eshop.product.model.ProductPrice;

public interface ProductPriceService {

	public void add(ProductPrice productPrice);

	public void update(ProductPrice productPrice);

	public void delete(Long id);

	public ProductPrice findById(Long id);
}
