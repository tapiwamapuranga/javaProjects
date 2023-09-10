/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metest;
import java.util.Scanner;
/**
 *
 * @author TapiwaMalvernMapuranga
 */
class Vehicle
{
    
    Scanner input=new Scanner(System.in);
    void move()
    {
        String in=input.nextLine();
        while(in!=null)
        {
            for(int i=1;1<=13;i++)
            {
              for(int j=1;j<=10;j++) 
              {
                 
                  if(in=="w")
                  {
                      System.out.println("0");
                  }
                  else if(in=="s")
                  {
                      System.out.println("x");
                  }
              }
            }
        }
    }
}
public class MEtest 
{

    public static void main(String[] args) 
    {
       Vehicle car=new Vehicle();
       car.move();
    }
    
}
