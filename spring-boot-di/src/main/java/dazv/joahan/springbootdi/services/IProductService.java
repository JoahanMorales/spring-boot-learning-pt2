package dazv.joahan.springbootdi.services;

import dazv.joahan.springbootdi.models.Product;

import java.util.List;

public interface IProductService {

    List<Product> findAll();
    Product findById(Long id);
}
