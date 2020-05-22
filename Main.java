import java.util.*;
public class Main{
  public static void main(String agrs[]){
    Scanner sc=new Scanner(System.in);
    int no=Integer.parseInt(sc.nextLine());
    int c1=0;
    int c2=0;
    String temp;
    String[] st=new String[no];
    for(int i=0;i<no;i++){
      st[i]=sc.nextLine();
      st[i]=st[i].toUpperCase();
      if(st[i].equals("YES"))
        c1++;
      else if(st[i].equals("NO"))
        c2++;
      else
        {
          c1=0;
          c2=0;
          break;
         // System.out.println("Invalid");
        }
    }
    if(c1>0||c2>0)
    { 
      System.out.println("YES "+c1);
      System.out.println("NO"+c2);
    }
    else
          System.out.println("Invalid");
  }
}