package vernandodev.springbootrestapi.models.repos;

import jakarta.websocket.server.PathParam;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import vernandodev.springbootrestapi.models.entities.Product;
import vernandodev.springbootrestapi.models.entities.Supplier;

import java.util.List;

public interface ProductRepo extends CrudRepository<Product, Long> {

    // By using a manually defined query
    // custom function in productRepo
    List<Product> findByNameContains(String name);

    @Query("SELECT p FROM Product p WHERE p.name = :name") // annotation query for custom query, JPAQL
    public Product findProductByName(@PathParam("name") String name);

    @Query("SELECT p FROM Product p WHERE p.name LIKE :name") // annotation query for custom query, JPAQL
    public List<Product> findProductByNameLike(@PathParam("name") String name);

    @Query("SELECT p FROM Product p WHERE p.category.id = :categoryId")
    public List<Product> findProductByCategory(@PathParam("categoryId") Long categoryId);

    @Query("SELECT p FROM Product p WHERE :supplier MEMBER OF p.suppliers")
    public List<Product> findProductBySupplier(@PathParam("supplier") Supplier supplier);

    // Method warisan / Derived query jpa
}
