package Question3;

import java.util.Scanner;

public class Question3 {
	
	
	public static void main(String args[]) {
		
            int y, c, R, d, m = 0, M;
            int A, B, C, D;
 
              Scanner sc = new Scanner(System.in);
 
              System.out.println("enter the value of M:");
              M = sc.nextInt();
              
              System.out.println("enter the year of century:");
              y = sc.nextInt();
              
              System.out.println("enter the previous century:");
              c = sc.nextInt();
              
  
              System.out.println("enter the day of the month:");
 
              d = sc.nextInt();
  
              if (M == 1 || M == 2)
   
            	  m = M + 10;
  
              else if (M >= 3)
   
            	  m = M - 2;
  
              
              A = (13 * m - 1) / 5;
 
  
              B = y / 4;
 
 
              C = c / 4;
  
  
              D = A + B + C + d + y - 2 * c;
  
  
              R = D % 7;
  
              switch (R) {
              case 0:
            	  System.out.println("sunday");
            	  break;
              case 1:
            	  System.out.println("monday");
            	  break;
              case 2:
            	  System.out.println("tuesday");
            	  break;
              case 3:
            	  System.out.println("wednesday");
            	  break;
              case 4:
            	  System.out.println("thursday");
            	  break;
              case 5:
            	  System.out.println("friday");
            	  break;
              default:
            	  System.out.println("saturday");
                }
  
              sc.close();
           }
	}