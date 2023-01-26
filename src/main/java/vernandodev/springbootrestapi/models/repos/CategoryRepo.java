package vernandodev.springbootrestapi.models.repos;

import jakarta.websocket.server.PathParam;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import vernandodev.springbootrestapi.models.entities.Category;
import vernandodev.springbootrestapi.models.entities.Product;

public interface CategoryRepo extends CrudRepository<Category, Long> {
    @Query("SELECT p FROM Product p WHERE p.name = :name") // anotasi query untuk custom query, JPAQL
    public Product findProductByName(@PathParam("name") String name);
}
