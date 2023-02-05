package vernandodev.springbootrestapi.services;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import vernandodev.springbootrestapi.models.entities.Category;
import vernandodev.springbootrestapi.models.repos.CategoryRepoCrud;
import vernandodev.springbootrestapi.models.repos.CategoryRepoPaging;

import java.util.Optional;

@Service
@Transactional
public class CategoryService {
    @Autowired // for injector
    private CategoryRepoCrud categoryRepoCrud;
    @Autowired
    private CategoryRepoPaging categoryRepoPaging;

    public Category save(Category category){
        return categoryRepoCrud.save(category);
    }

    public Category findOne(Long id){
        Optional<Category> category = categoryRepoCrud.findById(id);
        if(!category.isPresent()){
            return null;
        }
        return category.get();
    }

    public Iterable<Category> findAll(){
        return categoryRepoCrud.findAll();
    }

    public void removeOne(Long id){
        categoryRepoCrud.deleteById(id);
    }

    public Iterable<Category> findByName(String name, Pageable pageable){
        return categoryRepoPaging.findByNameContains(name, pageable);
    }

    public Iterable<Category> saveBatch(Iterable<Category> categories){
        return categoryRepoCrud.saveAll(categories);
    }
}
