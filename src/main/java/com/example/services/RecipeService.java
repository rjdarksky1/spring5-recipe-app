package com.example.services;

import com.example.commands.RecipeCommand;
import com.example.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    // todo refactor Command
    Set<Recipe> getRecipes();
    Recipe findById(Long l);
    RecipeCommand findCommandById(Long l);
    RecipeCommand saveRecipeCommand(RecipeCommand command);
    void deleteById(Long idToDelete);

}
