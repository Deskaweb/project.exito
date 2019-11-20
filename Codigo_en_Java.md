# project.exito
package basicJavaExercises;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class WhereToEat {

	public static void main(String[] args) {
		String[] pizzaLimerickArr={"Pizza Hut", "Milano", "Apache", "Papa Johns", "Domino's"};
		String[] burgersLimerickArr={"Burger King", "Supermacs", "McDonalds"};
		String[] restaurantLimerickArr={"Lana", "Marco Polo", "Bella Italia", "La Cuccina", "CoqBull", "Texas Steakhouse"};
		String[] pizzaWaterfordArr={"Roberto's","Domino's", "Apache", "Papa Johns"};
		String[] burgersWaterfordArr={"Supermacs", "McDonalds", "Homemade Burgers"};
		String[] restaurantWaterfordArr={"360 Cookhouse", "Coach House Coffee", "Burzza", "Italian Place", "Momo", "No.9 Cafe", "Cafe Lucia"};
		String[] pizzaCorkArr={"Four Star Pizza","Domino's", "Apache"};
		String[] burgersCorkArr={"Mcdonalds", "Burger King", "Bunsen", "West Cork Burger Company"};
		String[] restaurantCorkArr={"Capitan America's", "Liberty Grill", "Tequila Jacks", "14A", "SpitJack", "SoHo", "Elbow Lane", "Ramen", "Nando's", "Amicus", "Oyster Tavern"};
		String categoryLimerick;
		String categoryWaterford;
		String categoryCork;
        String city;
        String options;
        Random r=new Random();
        int randomNumber = 0;
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("Do we want a random place or view all options? Please write random or view");
        options = input.next();
        
        if (options.equals("view")){
        	System.out.println("What city are we in? ");
            city = input.next();
            
            switch (city){
            
            	case "Limerick":
            		System.out.println("What type of food do we want? (Pizza, Burgers, or Restaurant): ");
                    categoryLimerick = input.next();
                    input.close();
                    
                    if (categoryLimerick.equals("Pizza")){
                        System.out.format("The options are: "+ Arrays.toString(pizzaLimerickArr));
                    }
                    
                    if (categoryLimerick.equals("Burgers")){
                        System.out.format("The options are: "+ Arrays.toString(burgersLimerickArr));
                    }
                    
                    if (categoryLimerick.equals("Restaurant")){
                        System.out.format("The options are: "+ Arrays.toString(restaurantLimerickArr));
                    }
                    
                    break;
                    
            	case "Waterford":
            		System.out.println("What type of food do we want? (Pizza, Burgers, or Restaurant): ");
                    categoryWaterford = input.next();
                    input.close();
                    
                    if (categoryWaterford.equals("Pizza")){
                        System.out.format("The options are: "+ Arrays.toString(pizzaWaterfordArr));
                    }
                    
                    if (categoryWaterford.equals("Burgers")){
                        System.out.format("The options are: "+ Arrays.toString(burgersWaterfordArr));
                    }
                    
                    if (categoryWaterford.equals("Restaurant")){
                        System.out.format("The options are: "+ Arrays.toString(restaurantWaterfordArr));
                    }
                    
                    break;
                    
            	case "Cork":
            		System.out.println("What type of food do we want? (Pizza, Burgers, or Restaurant): ");
                    categoryCork = input.next();
                    input.close();
                    
                    if (categoryCork.equals("Pizza")){
                    	randomNumber=r.nextInt(pizzaCorkArr.length);
                        System.out.format("The options are: "+ Arrays.toString(pizzaCorkArr));
                    }
                    
                    if (categoryCork.equals("Burgers")){
                    	randomNumber=r.nextInt(burgersCorkArr.length);
                        System.out.format("The options are: "+ Arrays.toString(burgersCorkArr));
                    }
                    
                    if (categoryCork.equals("Restaurant")){
                    	randomNumber=r.nextInt(restaurantCorkArr.length);
                        System.out.format("The options are: "+ Arrays.toString(restaurantCorkArr));
                    }
                    
                    break;
                    
            	default: 
            		System.out.println("Sorry, only operating in Limerick, Waterford, and Cork");
            		break;
            
            }
        	
        	
        }
        
        
        
        else if (options.equals("random")){
        System.out.println("What city are we in? ");
        city = input.next();
        
        switch (city){
        
        	case "Limerick":
        		System.out.println("What type of food do we want? (Pizza, Burgers, or Restaurant): ");
                categoryLimerick = input.next();
                input.close();
                
                if (categoryLimerick.equals("Pizza")){
                	randomNumber=r.nextInt(pizzaLimerickArr.length);
                    System.out.format("Juan and Caoimhe are gonna eat at: "+ pizzaLimerickArr[randomNumber]);
                }
                
                if (categoryLimerick.equals("Burgers")){
                	randomNumber=r.nextInt(burgersLimerickArr.length);
                    System.out.format("Juan and Caoimhe are gonna eat at: "+ burgersLimerickArr[randomNumber]);
                }
                
                if (categoryLimerick.equals("Restaurant")){
                	randomNumber=r.nextInt(restaurantLimerickArr.length);
                    System.out.format("Juan and Caoimhe are gonna eat at: "+ restaurantLimerickArr[randomNumber]);
                }
                
                break;
                
        	case "Waterford":
        		System.out.println("What type of food do we want? (Pizza, Burgers, or Restaurant): ");
                categoryWaterford = input.next();
                input.close();
                
                if (categoryWaterford.equals("Pizza")){
                	randomNumber=r.nextInt(pizzaWaterfordArr.length);
                    System.out.format("Juan and Caoimhe are gonna eat at: "+ pizzaWaterfordArr[randomNumber]);
                }
                
                if (categoryWaterford.equals("Burgers")){
                	randomNumber=r.nextInt(burgersWaterfordArr.length);
                    System.out.format("Juan and Caoimhe are gonna eat at: "+ burgersWaterfordArr[randomNumber]);
                }
                
                if (categoryWaterford.equals("Restaurant")){
                	randomNumber=r.nextInt(restaurantWaterfordArr.length);
                    System.out.format("Juan and Caoimhe are gonna eat at: "+ restaurantWaterfordArr[randomNumber]);
                }
                
                break;
                
        	case "Cork":
        		System.out.println("What type of food do we want? (Pizza, Burgers, or Restaurant): ");
                categoryCork = input.next();
                input.close();
                
                if (categoryCork.equals("Pizza")){
                	randomNumber=r.nextInt(pizzaCorkArr.length);
                    System.out.format("Juan and Caoimhe are gonna eat at: "+ pizzaCorkArr[randomNumber]);
                }
                
                if (categoryCork.equals("Burgers")){
                	randomNumber=r.nextInt(burgersCorkArr.length);
                    System.out.format("Juan and Caoimhe are gonna eat at: "+ burgersCorkArr[randomNumber]);
                }
                
                if (categoryCork.equals("Restaurant")){
                	randomNumber=r.nextInt(restaurantCorkArr.length);
                    System.out.format("Juan and Caoimhe are gonna eat at: "+ restaurantCorkArr[randomNumber]);
                }
                
                break;
                
        	default: 
        		System.out.println("Sorry, only operating in Limerick, Waterford, and Cork");
        		break;
        
        }
	}
        
        
        
	}

}
