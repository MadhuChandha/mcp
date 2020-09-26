/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.ArrayList;
public class longeststring
{
	public static void main(String[] args) {

    // Declare an array list of Strings
      ArrayList<String> S = new ArrayList<>();
   // Add names to ArrayList
      S.add("madhuchandha");
      S.add("poorni");
      S.add("ram");
      compare c=new compare();//object creation
      System.out.println(c.findlongest(s));//calling of method
	}
}

   class compare
   {
       String findlongest(ArrayList<String>s)//method
       {
           String get=s.get(0);
           int max=get.length();//initializing maximum to length of the array
           for(int i=0;i<4;i++)
           {
              int a;
              a=s.get(i+1).length();
              if(max<a)
              {
               max=s.get(i+1).length();
               get=s.get(i+1);
               
               }
               return get;
            }
            return null;
       }
   }
   
   