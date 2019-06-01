package de.fnortheim.spring5recipes.services;

import de.fnortheim.spring5recipes.domain.Recipe;
import de.fnortheim.spring5recipes.repositories.RecipeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * created by sebastian on May, 2019
 */
@Slf4j
@Service
public class RecipeServiceImpl implements RecipeService {

    private RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public Iterable<Recipe> getRecipes() {

        return this.recipeRepository.findAll();
    }
}
