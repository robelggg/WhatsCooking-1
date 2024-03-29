package com.whatscooking.application.utilities.api;

import com.whatscooking.application.utilities.api.modal.recipe.AccountRecipesModal;
import com.whatscooking.application.utilities.api.modal.recipe.AddRecipeModal;
import com.whatscooking.application.utilities.api.modal.recipe.FavoriteRecipeModal;
import com.whatscooking.application.utilities.api.modal.recipe.RecipeImageModal;
import com.whatscooking.application.utilities.api.modal.registration.LoginModal;
import com.whatscooking.application.utilities.api.modal.registration.RegisterModal;
import com.whatscooking.application.utilities.api.response.recipe.AddRecipeResponse;
import com.whatscooking.application.utilities.api.response.recipe.RecipeImageResponse;
import com.whatscooking.application.utilities.api.response.recipe.RecipesResponse;
import com.whatscooking.application.utilities.api.response.registration.LoginResponse;
import com.whatscooking.application.utilities.api.response.registration.RegisterResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface RetrofitAPI {

    @POST("api/login")
    Call<LoginResponse> loginUser(@Body LoginModal loginModal);

    @POST("api/register")
    Call<RegisterResponse> registerUser(@Body RegisterModal registerModal);

    @POST("api/recipes/getAllRecipesByAccount")
    Call<RecipesResponse> getRecipesForAccount(@Body AccountRecipesModal accountRecipesModal);

    @POST("api/recipes/getAllRecipes")
    Call<RecipesResponse> getRecipes();

    @POST("api/recipes/addRecipe")
    Call<AddRecipeResponse> addRecipe(@Body AddRecipeModal addRecipeModal);

    @POST("api/recipes/getRecipeImage")
    Call<RecipeImageResponse> getRecipeImage(@Body RecipeImageModal addRecipeModal);

    @POST("api/recipes/addRecipeToFavorites")
    Call<AddRecipeResponse> addRecipeToFavorites(@Body FavoriteRecipeModal favoriteRecipeModal);

    @POST("api/recipes/getAllFavoriteRecipesByAccount")
    Call<RecipesResponse> getFavoriteRecipesByAccount(@Body AccountRecipesModal favoriteRecipeModal);
}
