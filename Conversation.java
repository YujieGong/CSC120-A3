import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
/**
* The conversation implements an application that
* carries a simple back and forth conversation with users  
*
* @author  Yujie Gong
* @since   2022-09-25
*/

class Conversation {
  public static void main(String[] arguments) {
    Scanner question1 = new Scanner (System.in);
    System.out.println("How many rounds?");
    ArrayList<String> TRANSCRIPT = new ArrayList<String>();
    TRANSCRIPT.add("TRANSCRIPT:");
    String rounds = question1.nextLine();
    int number_of_rounds = Integer.parseInt(rounds);
    
    System.out.println("Hi there, what is on your mind?");


    
    for(int i = number_of_rounds; i > 0; i--){
      Scanner question2 = new Scanner (System.in);
      String input2 = question2.nextLine();
      TRANSCRIPT.add(input2);
      if (input2.contains(".")|input2.contains("?")|input2.contains("!")){
        // input2 = input2.replaceAll("\\.","");
        input2 = input2.replaceAll("\\.","").replaceAll("\\?", "").replaceAll("\\!", "");
      }
      

      String[] words = input2.split(" ");

      List<String> list = Arrays.asList(words);
      
      
      Boolean word_found = false;
      
      if (list.contains("I")){
        int index1 = list.indexOf("I");
        list.set(index1, "You");
        word_found = true;
      } else if (list.contains("You")){
        int index4 = list.indexOf("You");
        list.set(index4, "I");
        word_found = true;
     
      } if (list.contains("you")){
          int index10 = list.indexOf("you");
          list.set(index10, "I");
          word_found = true;
      
      } if (list.contains("me")){
          int index2 = list.indexOf("me");
          list.set(index2, "you");
          word_found = true;

      } if (list.contains("am")){
        int index3 = list.indexOf("am");
        list.set(index3, "are");
        word_found = true;
      } else if (list.contains("are")){
        int index9 = list.indexOf("are");
        list.set(index9, "am");
        word_found = true;

      } if (list.contains("my")){
        int index5 = list.indexOf("my");
        list.set(index5, "your");
        word_found = true;
      } else if (list.contains("your")){
        int index6 = list.indexOf("your");
        list.set(index6, "my" );
        word_found = true;
     
      } if (list.contains("I'm")){
        int index7 = list.indexOf("I'm");
        list.set(index7, "You're");
        word_found = true;
      } else if (list.contains("You're")){
        int index8 = list.indexOf("You're");
        list.set(index8, "I'm");
        word_found = true;
      }
    

      if (! word_found){
      System.out.println("Talk about something else");
      TRANSCRIPT.add("Talk about something else");

    }
      else{
      String Reply = String.join(" ", list);
      System.out.println(Reply+"?");
      TRANSCRIPT.add(Reply+"?");

      }
    }
      System.out.println("Bye");
      TRANSCRIPT.add("Bye");
      String transcript = String.join("\n", TRANSCRIPT);
      System.out.println("\n"+transcript);
    }  
  }


      
      
      
     
      
      
    
    

   
     
      


    
 
