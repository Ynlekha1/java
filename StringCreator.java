public class StringCreator{
	public static void main(String [] args)
	{
		String mainDish = "biryani";
        String dessert = "tiramisu";
        String beverage = "tea";
        String fruit = "Mango";
        String vegetable = "potato";
        String snack = "chips";
        String protein = "egg";  
        String grain = "rice";
        String spice = "turmeric";
        String cuisine = "Indian";
	
        String entree = new String("biryani"); 
        String sweet = new String("tiramisu"); 
        String drink = new String("tea"); 
        String berry = new String("Mango"); 
        String foodstuf = new String("potato"); 
        String treat = new String("chips"); 
        String proteinSource = new String("egg"); 
        String seed = new String("rice"); 
        String flavoring = new String("turmeric"); 
        String style = new String("Indian"); 

        System.out.println(mainDish.equals(entree));
        System.out.println(dessert.equals(sweet));
        System.out.println(beverage.equals(drink));
        System.out.println(fruit.equals(berry));
        System.out.println(vegetable.equals(foodstuf));
        System.out.println(snack.equals(treat));
        System.out.println(protein.equals(proteinSource));
        System.out.println(grain.equals(seed));
        System.out.println(spice.equals(flavoring));
        System.out.println(cuisine.equals(style));



          char[] reverseString = mainDish.toCharArray();

          for (int i = 0; i < reverseString.length; i++)
           {
            System.out.print(reverseString[i]); 
           }


        System.out.println("");

       
           for (int i = reverseString.length - 1; i >= 0; i--) 
           {
            System.out.print(reverseString[i]); 
           }


}

}