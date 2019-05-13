package de.fnortheim.spring5recipes.controllers;

import de.fnortheim.spring5recipes.domain.Category;
import de.fnortheim.spring5recipes.domain.UnitOfMeasure;
import de.fnortheim.spring5recipes.repositories.CategoryRepository;
import de.fnortheim.spring5recipes.repositories.UnitOfMeasureRepository;
import de.fnortheim.spring5recipes.services.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Optional;

/**
 * created by sebastian on Apr, 2019
 */
@Controller
public class IndexController {

    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;
    private RecipeService recipeService;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository,
                           RecipeService recipeService) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
        this.recipeService = recipeService;
    }

    @GetMapping({"", "/", "/index"})
    public String getIndexPage(Model model) {

        final Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
        final Optional<UnitOfMeasure> uomOptional = unitOfMeasureRepository.findByDescription("Teaspoon");

        System.out.println("Get category  Id is: " + categoryOptional.get().getId());
        System.out.println("Get uom Id is: " + uomOptional.get().getId());

        model.addAttribute("recipes", recipeService.getRecipes());

        return "index";
    }
}
