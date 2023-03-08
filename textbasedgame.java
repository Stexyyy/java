//dumb java stuff you have to set up first
import java.util.Scanner;
import java.util.Random;


class Main {
  public static void main(String[] args) {

    Scanner Doggo = new Scanner(System.in); // create this thing to get user input

    System.out.println("Java Text Based Game!"); // prints to screen

    // game variables
    int room = 1;
    String input = "glurbaburbal!"; // dummy value for game loop
    String[] inventory = { " ", " ", " ", " " }; // use this to hold player items

    while (input != "quit") { // OMG GAME LOOP-----------------------------------------

      // print inventory
      System.out.println("Your inventory: ");
      for (int i = 0; i <= 3; i++)
        System.out.println(inventory[i]);

      //print money
       //random int (0-20)\
      Random rand = new Random();
      
      int dabloons = rand.nextInt(20);

      //print out da dabloons
      System.out.println("Money: "+dabloons);

      switch (room) {
        case 1:
          System.out.println("You're in room 1, you can go North, East, South or West");

          if (!inventory[2].equals("moldy chicken nugget")) {
            System.out.println("Ew you got a moldy chicken nugget. You might have a disease now ");
            inventory[2] = "moldy chicken nugget";
          }
          
          input = Doggo.nextLine();
          if (input.equals("East"))
            room = 2;
          else if (input.equals("South"))
            room = 4;
          else if (input.equals("North"))
            room = 8;
          else if (input.equals("West"))
            room = 6;
          break;
        case 2:
          System.out.println("You're in room 2, you can go West or South");
          input = Doggo.nextLine();
          if (input.equals("South"))
            room = 3;
          else if (input.equals("West"))
            room = 1;
          break;
        case 3:
          System.out.println("You're in room 3, you can go North or West");
          // check if they already have the gun, if not tell them they got it
          if (!inventory[0].equals("marshmallow gun")) {
            System.out.println("OMG you got the marshmallow gun!");
            inventory[0] = "marshmallow gun";
          }

          input = Doggo.nextLine();
          if (input.equals("North"))
            room = 2;
          else if (input.equals("West"))
            room = 4;
          break;
        case 4:
          System.out.println("You're in room 4, you can go West, East, or North");

          if (!inventory[1].equals("Key")) {
            System.out.println("OMG you found key!");
            inventory[1] = "Key";
          }
          
          input = Doggo.nextLine();
          if (input.equals("West"))
            room = 5;
          else if (input.equals("East"))
            room = 3;
          else if (input.equals("North"))
            room = 1;
          break;

        case 5:
          System.out.println("You're in room 5, you can go East or North");

          if (!inventory[3].equals("half eaten travis scott burger")) {
            System.out.println("OMG you got a half eaten travis scott burger, maybe you should eat it ");
            inventory[3] = "half eaten travis scott burger";
          }
          
          input = Doggo.nextLine();
          if (input.equals("East"))
            room = 4;
          else if (input.equals("North"))
            room = 6;
          break;

        case 6:
          System.out.println("You're in room 6, you can go East, South or North");

          System.out.println("Money: "+dabloons);
          
          input = Doggo.nextLine();
          if (input.equals("South"))
            room = 5;
            
          else if (input.equals("East"))
            room = 1;
            
          else if (input.equals("North"))   
            if (inventory[1].equals("Key")) {
              System.out.println("The door opens...");
              room = 7;}

          break;
        case 7:
          System.out.println("You're in room 7, you can go East, or South");
          input = Doggo.nextLine();
          if (input.equals("East"))
            room = 8;
          else if (input.equals("South"))
            room = 6;
          break;
          
        case 8:
          System.out.println("You're in room 8, you can go West or South");
          System.out.println("Money: "+dabloons);
          
          input = Doggo.nextLine();
          if(input.equals("West"))
            room = 7;
          else if (input.equals("South"))
            room = 1;
          break;
      }// end bracket for switch
    } // end bracket for OMG GAME
      // LOOP----------------------------------------------------
  }// end bracket for public static void main
}// end bracket for class main
