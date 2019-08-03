package com.example.services;

import com.example.commands.IngredientCommand;

public interface IngredientService {

    IngredientCommand findCommandByRecipeIdAndIngredientId(Long recipeId, Long ingredientId);
    IngredientCommand saveIngredientCommand(IngredientCommand command);

    void deleteById(Long recipeId, Long ingredientId);
}
