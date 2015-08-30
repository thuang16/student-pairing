import java.util.*;
public class groupingDriver
{
  public static void main(String args [])
  {
    int valid = 1;
    Scanner kb = new Scanner(System.in);
    menu start = new menu();
  System.out.println("Hi, what would you like to do?");
 
  //basically loops back to the menu unless students are split into groups
  while(valid == 1)
  {
    System.out.println("type \"add\" to add students, \"drop\" to drop students, \"view\" to see all current students, or \"group\" to organize students into groups.");
  valid = start.run(kb.nextLine());
 
  //loops back if an invalid command is entered
  while (valid == 0)
  {
    System.out.println("please enter a valid comand");
  valid = start.run(kb.nextLine());
              }
  }
  
  }
}