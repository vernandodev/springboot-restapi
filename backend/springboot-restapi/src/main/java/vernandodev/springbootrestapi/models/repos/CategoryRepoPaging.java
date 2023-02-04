package vernandodev.springbootrestapi.models.repos;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import vernandodev.springbootrestapi.models.entities.Category;

public interface CategoryRepoPaging extends PagingAndSortingRepository<Category, Long> {
    Page<Category> findByNameContains(String name, Pageable pageable);
}
