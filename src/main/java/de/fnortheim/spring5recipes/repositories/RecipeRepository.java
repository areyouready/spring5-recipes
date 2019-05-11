package de.fnortheim.spring5recipes.repositories;

import de.fnortheim.spring5recipes.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * created by sebastian on May, 2019
 */
public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
