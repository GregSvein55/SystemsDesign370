

/**
 * CoffeeMaker constructor 
 * 
 * The inventory should be created and filled up.
 */

public class CoffeeMaker1 {
	
	
	public static final int MAX_NUM_RECIPES = 4; // Maximum number of recipes
	public static final int MAX_INVENTORY = 20;
	private Recipe[] recipeArray; // This is the array of recipes
	private int numRecipes = 0;
	private Inventory1 inventory; // This is our inventory in the coffee maker
	
	/**
	 * Constructor for the coffee maker
	 * The inventory should be created and filled.
	 */
	public CoffeeMaker1() {
		//Setup inventory
		recipeArray = new Recipe[MAX_NUM_RECIPES];

		// Fill up the inventory in the coffee maker.
		inventory = new Inventory1();
		inventory.setMilk(20);
		inventory.setSugar(20);
		inventory.setCoffee(20);


	}

	
	/**
	 * Getter of the property <tt>inventory</tt>
	 *
	 * @return Returns the inventory.
	 */
	public Inventory1 getInventory() {
		return inventory;
	}

	/**
	 * addRecipe Method
	 *
	 * @param Recipe
	 *            Will add a recipe if possible
	 * @return true or false
	 */
	public boolean addRecipe(Recipe rAdd) {

		/**
		 * Test to see if we can add this recipe. The criteria is: The name can
		 * not exist There must be an empty spot
		 */

		return false;

	}

	/**
	 * getRecipe Method
	 *
	 * @param Recipe
	 *            name String
	 * @return Recipe or NULL
	 */
	public Recipe getRecipe(String recipeName) {
		for (int i = 0; i < MAX_NUM_RECIPES; ++i) {
			if(recipeArray[i] != null)
			{
				if (recipeArray[i].getRecipeName() != null) {
					if (recipeArray[i].getRecipeName().equals(recipeName)) {
						/** The name exists */
						return recipeArray[i];
					}
				}
			}
		}

		return null;
	}

	/**
	 * deleteRecipe Method
	 *
	 * @param Recipe
	 *            Will delete a recipe if possible
	 * @return true or false
	 */
	public boolean deleteRecipe(String recipeName) {

		return false;
	}


	/**
	 * makeCoffee Method
	 *
	 * @param recipeName
	 *            Will make the coffee if the recipe is there
	 * @return true or false
	 */
	public boolean makeCoffee(String recipeName) {

		return false;
	}


	public static void main(String[] args)
	{

		System.out.println("Create the Coffee Maker and test it's features here:");

	}

}
