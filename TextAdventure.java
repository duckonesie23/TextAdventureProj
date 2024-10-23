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
    System.out.println("You are about to play a day in my life...\nDon't worry about being perfect just do what you would do.\n1 - continue\n");

    // get user input and go to the appropriate zone based on their input
    // ADD CODE HERE
    inputInt= inScanner.nextInt();
    if(inputInt == 1){
      enterZone1();
    }

  }

  private void enterZone1()
  {
    console.setImage("bedroom.jpg");

    System.out.println("\nYour alarm goes off. The bed you lay in is the perfect temperature, and the light outside is dark. Do you…"+
      "\n1 - Get out of bed\n2 - Try to sleep for five more minutes\n");
    int inputInt = inScanner.nextInt();
    ourHero.setOption(1, inputInt);
    switch(inputInt){
      case 1:
        System.out.println("You wake up on schedule, giving yourself ample time to fix your hair and wash your face.\n"+
        "A delicious breakfast is served to you.\nHome-made waffles, juicy fruits and freshly cooked sausages waft their aromas around the kitchen.\nYou\'re thankful that you\'re lucky enough to get your food served to you.\nYou enjoy your meal and feel more energized.\n"+
        "The bus stops in front of you and you climb on.");
        enterZone2();
        break;
      case 2:
        if((int)(Math.random()*2)==0){
          System.out.println("You decide to get a few more minutes of precious sleep.\n"+
          "However, you wake up the panicked calls of your parents.\nChecking the time on your phone, you realized you slept in for 30 minutes.");
        }else{
          System.out.println("You decide to get a few more minutes of precious sleep.\n"+
          "Waking up a couple minutes later, you groggily get out of bed and stumble into the kitchen.\nHome-made waffles, juicy fruits and freshly cooked sausages waft their aromas around the kitchen.\nYou\'re thankful that you\'re lucky enough to get your food served to you.\nYou enjoy your meal and feel more energized.\n"+
          "The bus stops in front of you and you climb on.");
        }
        enterZone2();
        break;
    }
    

  }

  private void enterZone2()
  {
    console.setImage("schoolbus.jpg");

    System.out.println("\nThe bus hums and sways as it takes its route. Solid rays of light sneak their way into the bus. Do you…."+
      "\n1 - Socialize\n2 - Study for your test\n3 - Space out\n");
    int inputInt = inScanner.nextInt();
    ourHero.setOption(2, inputInt);
    if(inputInt==1){
      System.out.println("You decide to wait a bit until your friend arrives.\nAs the bus comes closer to her stop, you scooch over and make some room.\nShe sits down next to you and talk about your weekends while listening to whatever silly song she comes up with.");
        enterZone3();
    }else if(inputInt==2){
      System.out.println("You decide to study for your upcoming tests.\nNow you won\'t be cooked for your math test!");
        enterZone3();
    }else{
      System.out.println("You decide you need a little more of a brain break before school starts.\nYou pop in your earbuds and max out the volume.\nWhile lip syncing to the lyrics you look around hoping nobody\'s watching the faces you make. ");
        enterZone3();
    }
    }

  private void enterZone3()
  {
    console.setImage("hallway.jpg");

    System.out.println("\nThe hallways are cramped and stuffy and lockers take up a chunk of the hallway but nobody even uses them. Do you…"+
      "\n1 - Loiter around\n2 - Speedwalk to class\n3 - Trip your friend\n");
    int inputInt = inScanner.nextInt();
    ourHero.setOption(3, inputInt);
    switch (inputInt) {
      case 1:
        System.out.println("You meet up with a friend in the hallway.\n" + //
        "You wander around slowly, trying to not look suspicious but also not get to class too fast.\n" + //
        "Taking sips at each water fountain and turning left wherever you\'re supposed to turn right.\n" + //
        "As you laugh and make jokes you cover your mouth to not disturb the other classes.");
        enterZone4();
        break;
        case 2:
          System.out.println("You attempt to speedwalk to your next class.\n" + //
                        "You weave between the groups of students and get caught up behind a slow slow slow group of freshmen.\n" + //
                        "You slow down to their pace and look at the time, only a minute left!\n" + //
                        "You push on through them while apologizing and barely make it to your next class on time.");
          enterZone4();
          break;
        case 3:
          System.out.println("You recognize your friend in the hallway from their backpack.\n" + //
                        "Slowly you creep over to them trying not to alert them.\n" + //
                        "Your eyes are laser focused on their foot, trying to time your kick.\n1 - continue\n");
                        inputInt = inScanner.nextInt();
                        if(inputInt == 1){
                          if((int)(Math.random())==0){
                            System.out.println("You kick!\nA perfect connection is made with the tip of your shoe and the bottom of their feet sending them flying.\nYou laugh it off and walk to your next class.");
                          }else{
                            System.out.println("But right before you kick they turn around.\n\"What do you think you\'re doing\" they say sarcastically."+
                            "\n\"Nothinggggg\" you respond and walk to class together.");
                          }
                        }
                        enterZone4();
                        break;

    }
  }

  private void enterZone4()
  {
    console.setImage("classroom.jpg");

    System.out.println("\nYou make it to class. Do you... \n"+
    "1 - Pay attention\n2 - Sleep\n");
    int inputInt = inScanner.nextInt();
    ourHero.setOption(4, inputInt);
    switch (inputInt) {
      case 1:
        System.out.println("You stay awake and pay attention to the entire lecture.\nGood job! Now you won't have to do as much studying.");
        enterZone5();
        break;
      case 2:
        System.out.println("You doze off during class...\nMiraculously, you're not caught by the teacher.\nBut now you don't have a clue on how to do the homework.");
        enterZone6();
        break;
    }
  }

  private void enterZone5()
  {
    console.setImage("afterschool.jpg");

    System.out.println("\nSchool\'s finally done! But there\'s no rush to go home, enjoy yourself a bit and maybe get some food? Do you…"+
      "\n1 - Go to the Cafeteria\n2 -  Go to the Plaza\n");
    int inputInt = inScanner.nextInt();
    ourHero.setOption(5, inputInt);
    switch(inputInt){
      case 1:
        System.out.println("You decide to hang out at the cafeteria.\n" + //
                    "The cafeteria is packed, people are lined up to buy ramen and cookies at the Crescendo Cafe, some people are waiting for their practice to start, and some are getting a jump on their homework.\n" + //
                    "You strike up conversations with all your friends that pass by, from your volleyball friends to those who are about to walk home to your other robotics friends.");
        enterZone6();
        break;
      case 2:
        System.out.println("You make the trek to the plaza down the street.\n" + //
                    "Luckily, you didn\'t get run over at the intersection by all the cars barelling down the road.\n" + //
                    "The CVS is nice cool and air conditioned, you grab a drink and some candy before heading to subway and ordering an italian footlong sandwich.");
                    enterZone6();
                    break;
    }
  }

  private void enterZone6()
  {
    console.setImage("home.jpg");

    System.out.println("\nNow you\'re home after a long day… what now?"+
      "\n1 - Play your instrument\n2 - Play some games\n");
    int inputInt = inScanner.nextInt();
    ourHero.setOption(6, inputInt);
    switch(inputInt){
      case 1:
        System.out.println("You decide to pick up your instrument, a bright blue bass guitar.\n" + //
                    "You play a song on your phone and listen carefully.\n" + //
                    "While fiddling with your instrument, you try play the song by ear! You play along to a variety of artists in different genres.\n" + //
                    "Some R&B, some grentperez, a bit of Jazz, Rex Orange County, and of course some rock.");
                    gameEnd();
                    break;
      case 2:
        System.out.println("You run downstairs and log onto your PC and hit up your friends to see if they\'re available.\n" + //
                    "Eventually you find a group to play with, hopefully you won\'t stay up too late…");
                    gameEnd();
                    break;
    }
    
  }

  private void gameEnd()
  {
    if(ourHero.getHealth() <= 0){
      System.out.println("You pass out...\n Don't overwork yourself.");
    }
    else if(ourHero.getOption(4)==2&&ourHero.getOption(3)==1){
      System.out.println("Even though you slacked off a bit, you had a long day.\nSleep overtakes you and you are prepared for the next day.");
    }
    else if(ourHero.getOption(2) != 1){
      System.out.println("As you lay in bed you think about the day you had.\nHopefully tomorrow will be as good.");
    }else{
      System.out.println("Although you didn\'talk much, you had a long and fufilling day.\nYou get into bed excited for the next day");
    }

    inScanner.close();
  }
}