  /*******************
Name: Matas Backevicius

Date: May 11, 2021

Notes: build a loterry application with the loop and the array focusing on Math.random and math.ceil
*******************/
 
 
 
 
  public class LottoWinner {              /* class name declaraiton */
	
   
	   public static void main(String[] args)
            {
		int[] a = {1,5,9,2,13};          /*    identify all the elements in the array */
      
      
      int n = (int)(Math.random() * 99);     /*  call the function math.random 
                                                      and declare it as n variable*/
     
      
       if(a[0] == 0)a[0]=n;       /*    Knowing any given value or
                                        an element from variable 'a' is
                                      equal to 'n' so that number is a random numbe */
      
      System.out.println("Winning numbers are: ");
      for (int i = 0; i < 4; i++)
      {                                /*  print a statemnt with the loop of four random numbers*/
      
       if (a[0] != 1)
       {                            /* declare a condition
                               the first number or the element [0] in the array 'a' 
                        must not be number 1, then there will be no random numbers in the ouput */
       break;
       
       }
       
       
       
      else if (a[0] == 1)           /*  here another condition 
                                             and this one will give random number in the output */
                       /*   this condition must be met in order for the loop to not break
                       and print 4 random numbers*/                      
     
       
      
     
     
      System.out.println(a[i] + Math.ceil(n));
  
                  /* final print of the loop calling for 
                  the array variable which is 'a' and adding it to the int 'n' 
                  representing four random given/chosen numbers */
      
            }
      
         }

     
      }
     
      
      
      
             
      
        
         
	
   
 
 

      
      
       
      
      
      
    
  




