package de.fnortheim.spring5recipes.repositories;

import de.fnortheim.spring5recipes.domain.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * created by sebastian on May, 2019
 */
public interface CategoryRepository extends CrudRepository<Category, Long> {

    Optional<Category> findByDescription(String description);
}
