import java.util.*;
public class menu{
  //declarations
    roster toast = new roster();
    Scanner kb = new Scanner(System.in);
    Boolean end = false;
    
    //chooses what to do between adding/dropping students, seeing list of students, and grouping students
    public int run(String response){
    if (response.equals("add"))
    {
      while (!end)
      {
        System.out.println("please type in the student's name then press enter.");
        System.out.println("type \"end\" when finished adding students.");
        response = kb.nextLine();
        if (response.equals("end"))
        {
          end = true;
          return 1;
        }
        else
           toast.write(response);
      }
    }
    else if(response.equals("view"))
    {
      toast.show();
      System.out.println("type \"menu\" to return to menu.");
      if (kb.nextLine().equals("menu"))
        return 1;
  }
    else if(response.equals("drop"))
    {
    while (!end)
      {
        System.out.println("please type in the student's name then press enter.");
        System.out.println("type \"end\" when finished dropping students.");
        response = kb.nextLine();
        if (response.equals("end"))
        {
          end = true;
        return 1;
        }
        else
        {
           if(toast.delete(response))
        System.out.println("deleted");
          else
          System.out.println("name not found");
        }
      }
    }
    else if (response.equals("group"))
               {
      System.out.println("How many students per group?");
        toast.pair(kb.nextInt());
    }
    else
      return 0;
    return 2;
}
}