import java.util.*;

public class Player
{
  String name;
  int health;
  double gold;
  int monstersDefeated;
  boolean alive;
  int option1;
  int option2;
  int option3;
  int option4;
  int option5;
  int option6;

  public Player(String playerName, int startingHealth, double startingGold)
  {
    name = playerName;
    health = startingHealth;
    gold = startingGold;
    alive = true;
  }
  public String getName()
  {
    return name;
  }

  public void changeName(String newName)
  {
    name = newName;
  }

  public int getHealth()
  {
    return health;
  }

  public void setHealth(int newHealth)
  {
    health = newHealth;
  }

  public double getGold()
  {
    return gold;
  }

  public void setGold(double newAmount)
  {
    gold = newAmount;
  }

  public int getMonstersDefeated()
  {
    return monstersDefeated;
  }

  public void defeatMonster()
  {
    monstersDefeated++;
  }
  public int getOption(int num){
    switch(num){
      case 1:
        return option1;
      case 2:
        return option2;
      case 3:
        return option3;
      case 4:
        return option4;
      case 5:
        return option5;
      case 6:
        return option6;
    }
    return 0;
  }
  public void setOption(int zonenum,int choicenum){
    switch(zonenum){
      case 1:
        option1 = choicenum;
      case 2:
        option2 = choicenum;
      case 3:
      option3 = choicenum;
      case 4:
      option4 = choicenum;
      case 5:
      option5 = choicenum;
      case 6:
      option6 = choicenum;
    }
  }
}