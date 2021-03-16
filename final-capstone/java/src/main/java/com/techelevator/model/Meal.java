package com.techelevator.model;

public class Meal
{
	private int mealPlanId;
	private int mealId;
	private int recipeId;
	private String recipeName;
	private String mealCategory;
	private String dayOfWeek;
	
	public Meal()
	{
		
	}
	
	public Meal(int mealplanId, int mealId, int recipeId, String recipeName, String mealCategory, String dayOfWeek)
	{
		this.mealPlanId = mealplanId;
		this.mealId = mealId;
		this.recipeId = recipeId;
		this.recipeName = recipeName;
		this.mealCategory = mealCategory;
		this.dayOfWeek = dayOfWeek;
	}
	
	public int getMealPlanId()
	{
		return mealPlanId;
	}
	
	public void setMealPlanId(int mealPlanId)
	{
		this.mealPlanId = mealPlanId;
	}
	
	public int getMealId()
	{
		return mealId;
	}
	
	public void setMealId(int mealId)
	{
		this.mealId = mealId;
	}
	
	public int getRecipeId()
	{
		return recipeId;
	}
	
	public void setRecipeId(int recipeId)
	{
		this.recipeId = recipeId;
	}
	
	public String getRecipeName()
	{
		return recipeName;
	}
	
	public void setRecipeName(String recipeName)
	{
		this.recipeName = recipeName;
	}
	
	public String getMealCategory()
	{
		return mealCategory;
	}
	
	public void setMealCategory(String mealCategory)
	{
		this.mealCategory = mealCategory;
	}
	
	public String getDayOfWeek()
	{
		return dayOfWeek;
	}
	
	public void setDayOfWeek(String dayOfWeek)
	{
		this.dayOfWeek = dayOfWeek;
	}
	
	@Override
	public String toString()
	{
		return "Meal{" +
				"mealPlanId = " + mealPlanId +
				"mealId" + mealId +
				"recipeId" + recipeId +
				"recipeName" + recipeName +
				"mealCategory" + mealCategory +
				"dayOfWeek" + dayOfWeek +
				"}";
	}
	
	
}
