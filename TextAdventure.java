import java.util.*;

public class TextAdventure 
{
  FancyConsole console;
  Scanner inScanner;
  Player ourHero;

  public TextAdventure()
  {
    console = new FancyConsole("Great Text Adventure!", 600, 600);
    inScanner = new Scanner(System.in);

    // feel free to change the player's starting values
    ourHero = new Player("Bob", 100, 0);
  }

  public void play()
  {
    String input;
    int inputInt;
    // start of adventure. You can change this if you like
    console.setImage("distantcity.jpg");

    // ask the user for their name.
    System.out.println("What is your name?\n");
    input = inScanner.nextLine();
    ourHero.changeName(input);
    // describe the starting situation. Feel free to change this
    System.out.println("You wake up to find yourself on the edge of a shadowy forest with the sun nearly set. \nYou see what looks like a city in the distance. \nWhat would you like to do? \ncity: go towards the city\nforest: turn around and re-enter the forest\nnap: go back to sleep\n" + ourHero.getName() + ": ");

    // get user input and go to the appropriate zone based on their input
    // ADD CODE HERE
    inputInt= inScanner.nextInt();
    switch(inputInt){
      case 1:
        enterZone1();
        break;
      case 2:
        enterZone2();
        break;
      case 3:
        enterZone3();
        break;
      case 4:
        enterZone4();
        break;
      case 5:
        enterZone5();
        break;
      case 6:
      enterZone6();
        break;
    }

  }

  private void enterZone1()
  {
    console.setImage("distantcity.jpg");

    System.out.println("Description");
    int inputInt = inScanner.nextInt();

  }

  private void enterZone2()
  {
    console.setImage("distantcity.jpg");

    System.out.println("Description");
    int inputInt = inScanner.nextInt();
    
  }

  private void enterZone3()
  {
    console.setImage("distantcity.jpg");

    System.out.println("Description");
    int inputInt = inScanner.nextInt();
    
  }

  private void enterZone4()
  {
    console.setImage("distantcity.jpg");

    System.out.println("Description");
    int inputInt = inScanner.nextInt();
    
  }

  private void enterZone5()
  {
    console.setImage("distantcity.jpg");

    System.out.println("Description");
    int inputInt = inScanner.nextInt();
    
  }

  private void enterZone6()
  {
    console.setImage("distantcity.jpg");

    System.out.println("Description");
    int inputInt = inScanner.nextInt();
    
  }

  private void gameEnd()
  {
    // ADD CODE HERE

    inScanner.close();
  }
}