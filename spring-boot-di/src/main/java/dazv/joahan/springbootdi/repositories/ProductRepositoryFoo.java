package dazv.joahan.springbootdi.repositories;

import dazv.joahan.springbootdi.models.Product;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;


import java.util.Collections;
import java.util.List;

@Primary
@Repository
public class ProductRepositoryFoo extends ProductRepository {

    @Override
    public List<Product> findAll() {
        return Collections.singletonList(new Product(1L, "PC COMPLETA", 600L));
    }

    @Override
    public Product findById(Long id) {
        return new Product(id, "PC COMPLETA", 600L);
    }
}
