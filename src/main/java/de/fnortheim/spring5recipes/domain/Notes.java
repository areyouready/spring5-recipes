package de.fnortheim.spring5recipes.domain;

import javax.persistence.*;

/**
 * created by sebastian on May, 2019
 */
@Entity
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne // no cascade here beacause if a note is deleted teh recipe should not be deleted
    private Recipe recipe;

    @Lob // Large object (in case of String CLob => Character Large Object). If not annotated max length is 255
    private String recipeNotes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public String getRecipeNotes() {
        return recipeNotes;
    }

    public void setRecipeNotes(String recipeNotes) {
        this.recipeNotes = recipeNotes;
    }
}
