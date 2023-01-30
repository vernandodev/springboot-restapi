package vernandodev.springbootrestapi.services;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vernandodev.springbootrestapi.models.entities.Product;
import vernandodev.springbootrestapi.models.entities.Supplier;
import vernandodev.springbootrestapi.models.repos.ProductRepo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ProductService {

    @Autowired
    private SupplierService supplierService;
    @Autowired // dependecies injection
    private ProductRepo productRepo;

    public Product save(Product product) {
        return productRepo.save(product);
    }

    public Product findOne(Long id) {
        Optional<Product> temp = productRepo.findById(id);
        if(!temp.isPresent()) {
            return null;
        }
        return temp.get();
    }

    public Iterable<Product> findAll() {
        return productRepo.findAll();
    }

    public void removeOne(Long id) {
        productRepo.deleteById(id);
    }

    public List<Product> findByName(String name) {
        return productRepo.findByNameContains(name);
    }

    // method add supplier
    public void addSupplier(Supplier supplier, Long productId){
        Product product = findOne(productId);
        if(product == null){
            throw new RuntimeException("Product with id : " + productId + " not found");
        }
        product.getSuppliers().add(supplier);
        save(product);
    }

    // CUSTOM QUERY
    public Product findProductByName(String name){
        return productRepo.findProductByName(name);
    }

    public List<Product> findProductByNameLike(String name){
        return productRepo.findProductByNameLike("%"+name+"%");
    }

    public List<Product> findProductByCategory(Long categoryId){
        return productRepo.findProductByCategory(categoryId);
    }

    public List<Product> findProductBySupplier(Long supplierId) {
        Supplier supplier = supplierService.findOne(supplierId);
        if(supplier == null){
            return new ArrayList<Product>();
        }
        return productRepo.findProductBySupplier(supplier);
    }

}
