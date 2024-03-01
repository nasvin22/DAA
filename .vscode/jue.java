import java.util.List;
import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;
class java{
    public static void main(String[] args){

        Comparator<String> com=new Comparator()
        {
          public int Compare(String i,String j){
              if(i.length()>j.length())
              return 1;
              else
              return -1;
          }

        };

      List<String> li=new ArrayList<>();
      li.add("Nasvin Bhai");
      li.add("Vishwa the don");
      li.add("Mukesh the Crickter");
   
      Collections.sort(li);
      System.out.println(li);
      
    }
}