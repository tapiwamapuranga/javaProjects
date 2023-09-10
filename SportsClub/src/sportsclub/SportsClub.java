/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sportsclub;
import java.util.Scanner;
/**
 *
 * @author TapiwaMAlvernMapuranga
 */

class football extends SportsClub
{
     void play()
    {
        System.out.println("Am now playing football");
    }
}
class cricket extends SportsClub
{
     void play()
    {
         System.out.println("Am now playing cricket");
    }
}
class rugby extends SportsClub
{
     void play()
    {
         System.out.println("Am now playing rugby");
    }
}
        
public class SportsClub
{
    void play()
    {
        System.out.println("Am ready to play!! ");
    }

    public static void main(String[] args)
    {
       Scanner input=new Scanner(System.in);
       SportsClub player1=new SportsClub();
       cricket player2=new cricket();
       football player3=new football();
       rugby player4=new rugby();
       player1.play();
       player2.play();
       player3.play();
       player4.play();
    }
    
}
