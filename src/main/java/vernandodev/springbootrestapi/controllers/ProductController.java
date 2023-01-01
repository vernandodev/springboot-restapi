package vernandodev.springbootrestapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vernandodev.springbootrestapi.models.entities.Product;
import vernandodev.springbootrestapi.services.ProductService;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    // first inject services
    @Autowired
    private ProductService productService;

    @PostMapping
    public Product create(@RequestBody Product product) {
        return productService.save(product);
    }

    @GetMapping
    public Iterable<Product> findAll() {
        return productService.findAll();
    }
}
