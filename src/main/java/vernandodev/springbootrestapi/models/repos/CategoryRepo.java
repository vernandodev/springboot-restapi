package vernandodev.springbootrestapi.models.repos;

import org.springframework.data.repository.CrudRepository;
import vernandodev.springbootrestapi.models.entities.Category;

public interface CategoryRepo extends CrudRepository<Category, Long> {
}
