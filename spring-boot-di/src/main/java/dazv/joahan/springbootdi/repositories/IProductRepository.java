package dazv.joahan.springbootdi.repositories;

import dazv.joahan.springbootdi.models.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> findAll();
    Product findById(Long id);

}
