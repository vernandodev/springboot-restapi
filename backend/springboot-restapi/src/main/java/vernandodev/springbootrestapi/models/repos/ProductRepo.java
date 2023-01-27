package vernandodev.springbootrestapi.models.repos;

import jakarta.websocket.server.PathParam;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.RequestBody;
import vernandodev.springbootrestapi.models.entities.Product;

import java.util.List;

public interface ProductRepo extends CrudRepository<Product, Long> {

    //custom function di dalam productRepo
    List<Product> findByNameContains(String name);

    @Query("SELECT p FROM Product p WHERE p.name = :name") // annotation query for custom query, JPAQL
    public Product findProductByName(@PathParam("name") String name);

    @Query("SELECT p FROM Product p WHERE p.name LIKE :name") // annotation query for custom query, JPAQL
    public List<Product> findProductByNameLike(@PathParam("name") String name);

    @Query("SELECT p FROM Product p WHERE p.category.id = :categoryId")
    public List<Product> getProductByCategory(@PathParam("categoryId") Long categoryId);
}
