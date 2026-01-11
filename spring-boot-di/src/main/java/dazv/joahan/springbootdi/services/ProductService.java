package dazv.joahan.springbootdi.services;

import dazv.joahan.springbootdi.models.Product;
import dazv.joahan.springbootdi.repositories.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class ProductService implements IProductService{

    private IProductRepository repository;

    @Autowired
    public ProductService(@Qualifier("productRepository") IProductRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Product> findAll() {
        return repository.findAll().stream().map(p -> {
            Double priceTax = p.getPrice() * 1.25d;
            //Product newProduct = new Product(p.getId() , p.getName(), priceTax.longValue());
            Product newProduct = (Product) p.clone();
            newProduct.setPrice(priceTax.longValue());
            return newProduct;
        }).collect(Collectors.toList());
    }

    @Override
    public Product findById(Long id) {
            return repository.findById((long) id);
    }



}
