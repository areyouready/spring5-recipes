package de.fnortheim.spring5recipes.services;

import de.fnortheim.spring5recipes.domain.Recipe;

/**
 * created by sebastian on May, 2019
 */
public interface RecipeService {

    Iterable<Recipe> getRecipes();
}
