package java.server.model;

public class CompositeItem extends Item {
	private Item[][] recipe;
	
	public CompositeItem(){
		setRecipe(new Item[3][3]);
	}
	
	public CompositeItem(Item item){
		this();
	}
	
	public CompositeItem(CompositeItem compositeItem){
		this();
	}

	public Item[][] getRecipe() {
		return recipe;
	}

	public void setRecipe(Item[][] recipe) {
		this.recipe = recipe;
	}

	
	
}
