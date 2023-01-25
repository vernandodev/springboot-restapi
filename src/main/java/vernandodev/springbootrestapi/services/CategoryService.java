package vernandodev.springbootrestapi.services;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vernandodev.springbootrestapi.models.entities.Category;
import vernandodev.springbootrestapi.models.repos.CategoryRepo;

import java.util.Optional;

@Service
@Transactional
public class CategoryService {
    @Autowired // for injector
    private CategoryRepo categoryRepo;

    public Category save(Category category){
        return categoryRepo.save(category);
    }

    public Category findOne(Long id){
        Optional<Category> category = categoryRepo.findById(id);
        if(!category.isPresent()){
            return null;
        }
        return category.get();
    }

    public Iterable<Category> findAll(){
        return categoryRepo.findAll();
    }

    public void removeOne(Long id){
        categoryRepo.deleteById(id);
    }
}
