package loopyplanet;

    import java.util.Scanner;    //importing the java library, provides collections framework, formatted printing and scanning, array manipulation utilities, event model, date and time facilitie
                                 //allows for user input
public class LoopyPlanet {       //this is the class, wraps the code in brackets 
    
    public static void main(String[] args) {        //this is the method, starting point
        
        Scanner input = new Scanner(System.in);      //This string is for prompting the user to enter another item, making a new scanner to gather user input 
                                                     // input is the variable, can be named anything, it is calling the new scanner, which is calling the library 
        //variable to store the user selection
        int option;    
        
        //I need to change the value of option without having to redefine it - I need to use a loop
        
        //this is where I store the values/variables for the menu items
        double yourWeight;
        double newWeight;
        
        
        //Displays menu to the user0
        System.out.println("Menu of Planets");
        System.out.println("1. Jupiter");
        System.out.println("2. Mars");
        System.out.println("3. Mercury");
        System.out.println("4. Neptune");
        System.out.println("5. Pluto");
        System.out.println("6. Saturn");
        System.out.println("7. Uranus");
        System.out.println("8. Venus");
        System.out.println("9. Quit");
        
            
        
            System.out.println("Enter your menu choice:");
        
            option = input.nextInt(); //Assigns input from user to option variable 
           
            outerloop:   //this is the point break outerloop; uses to break the loop statement    
            
    do{             // this is a do while loop, this loop will execute a function while another statement is true
                    // while the option value is between 1 and 10, then the doo loop executes the switch statements 
   
        
        switch (option){        // the switch statement is going to go through the cases depending on what the user picks as long as the option is between 1 and 10 
            
            case 1: 
                System.out.println("Enter your weight on Earth (lbs):");
                yourWeight = input.nextDouble();            // this line allows the user to input their weight 
                                                            //I want to multiply the value of the menu choice by the user input. Have to assign a value to each planet 
                newWeight = yourWeight * 2.64;              //this is the calculation performed
                System.out.println("your weight on Jupiter is:");
                    
                System.out.println(newWeight);
        
             break outerloop; //this acts as a pointer to outside the loop, breaks out 
            
            case 2:
                    System.out.print("Please enter your weight on Earth");
                    yourWeight = input.nextDouble();
                    
                    newWeight = yourWeight * 0.38;
                    System.out.println("your weight on Mars is:");
                    System.out.println(newWeight);
            
                    break outerloop;
                    
            case 3:
                    System.out.print("Please enter your weight on Earth");
                    yourWeight = input.nextDouble();
                    
                    newWeight = yourWeight * 0.37;
                    System.out.println("your weight on Mercury is:");
                    
                    System.out.println(newWeight);
                    
                    break outerloop;
                    
            case 4:
                    System.out.print("Please enter your weight on Earth");
                    yourWeight = input.nextDouble();
                    
                    newWeight = yourWeight * 1.12;
                    System.out.println("your weight on Neptune is:");
                    System.out.println(newWeight);

                    break outerloop;
                    
            case 5:
                    System.out.print("Please enter your weight on Earth");
                    yourWeight = input.nextDouble();
                    
                    newWeight = yourWeight * 0.04;
                    System.out.println("your weight on Pluto is:");
                    System.out.println(newWeight);
                    
                    break outerloop;

            case 6:
                    System.out.print("Please enter your weight on Earth");
                    yourWeight = input.nextDouble();
                    
                    newWeight = yourWeight * 1.15;
                    System.out.println("your weight on Saturn is:");
                    System.out.println(newWeight);       
                    
                    break outerloop;
                    
            case 7:
                    System.out.print("Please enter your weight on Earth");
                    yourWeight = input.nextDouble();
                    
                    newWeight = yourWeight * 1.15;
                    System.out.println("your weight on Uranus is:");
                    System.out.println(newWeight);
                    
                    break outerloop;
         
            case 8:
                    System.out.print("Please enter your weight on Earth");
                    yourWeight = input.nextDouble();
                    
                    newWeight = yourWeight * 0.88;
                    System.out.println("your weight on Venus is:");
                    System.out.println(newWeight);
        
                    break outerloop;
                    
            default:
                
            System.out.println("Sorry, incorrect option. Try again!");
    } 
        
    }           
         while ( option > 1 && option < 10 ) ;
    
    }  
    
}
