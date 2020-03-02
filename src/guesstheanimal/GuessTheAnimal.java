
package guesstheanimal;

import java.io.IOException;

public class GuessTheAnimal {

    public static void main(String[] args) 
            //Game that guesses your animal
    {
        System.out.println("Choose one of these animals:");
        System.out.println("Lizard, aligator, leopard, dragon, fish, lion, wolf, hermit crab, snail, cheetah, frog, tiger, unicorn, rat, rhino, cat, turtle, snake, armadillo, panda, brown bear, bunny, monkey or dog.");
        System.out.print("Do you have scales? (y for yes, n for no).\n");
	String str = read();
	if (str.charAt(0) == 'y')
	{
            System.out.print("Are you found in rivers? (y for yes, n for no).\n");
            str = read();
            if (str.charAt(0) == 'y')
            {
                System.out.print("Do you have sharp teeth? (y for yes, n for no).\n");
                 str = read();
                if (str.charAt(0) == 'y')
                {
                    System.out.println("You are an alligator.");
                }else {
                    System.out.println("You are a fish.");
                }    
            }else {
                System.out.print("can you fly? (y for yes, n for no).\n");
                 str = read();
                if (str.charAt(0) == 'y')
                {
                    System.out.println("You are a dragon.");
                        }else {
                            System.out.print("do you have legs? (y for yes, n for no).\n");
                            str = read();
                            if (str.charAt(0) == 'y')
                            {
                                System.out.println("You are a lizard.");
                            }else {
                                System.out.println("You are a snake.");
                    }  
                }   
            }    
        }else {
            System.out.print("Do you live in a shell? (y for yes, n for no).\n");
             str = read();
            if (str.charAt(0) == 'y')
            {
                System.out.print("Are you found in water? (y for yes, n for no).\n");
                 str = read();
                if (str.charAt(0) == 'y')
                {
                    System.out.print("Are a reptile? (y for yes, n for no).\n");
                 str = read();
                    if (str.charAt(0) == 'y')
                    {
                        System.out.println("You are a turtle.");
                    }else {
                        System.out.println("You are a hermit crab.");
                    }  
                }else {
                    System.out.print("Do you leave a trail of slime? (y for yes, n for no).\n");
                 str = read();
                    if (str.charAt(0) == 'y')
                    {
                        System.out.println("You are a snail");
                    }else {
                        System.out.println("You are an armidillo ");
                    }  
                }    
            }else {
                System.out.print("Do you have a horn? (y for yes, n for no).\n");
                 str = read();
                if (str.charAt(0) == 'y')
                {
                    System.out.print("Are you real? (y for yes, n for no).\n");
                 str = read();
                    if (str.charAt(0) == 'y')
                    {
                        System.out.println("You are a rhino.");
                    }else {
                        System.out.println("You are a unicorn.");
                    }  
                }else {
                    System.out.print("Do you like to eat cheese? (y for yes, n for no).\n");
                 str = read();
                    if (str.charAt(0) == 'y')
                    {
                        System.out.println("You are a rat.");
                    }else {
                        System.out.print("Do you use a litterbox? (y for yes, n for no).\n");
                    str = read();
                        if (str.charAt(0) == 'y')
                        {
                            System.out.println("You are a cat.");
                        }else {
                            System.out.print("Are you a type of bear? (y for yes, n for no).\n");
                            str = read();
                            if (str.charAt(0) == 'y')
                            {
                            System.out.print("Do you have white and black fur? (y for yes, n for no).\n");
                            str = read();
                                if (str.charAt(0) == 'y')
                                {
                                    System.out.println("You are a panda.");
                                }else {
                                    System.out.println("You are a brown bear.");
                                }  
                            }else {
                        System.out.print("Do you like to go on walks? (y for yes, n for no).\n");
                        str = read();
                        if (str.charAt(0) == 'y')
                        {
                        System.out.println("You are a dog.");
                        }else {
                            System.out.print("Do you eat carrots? (y for yes, n for no).\n");
                            str = read();
                            if (str.charAt(0) == 'y')
                            {
                            System.out.println("You are a bunny.");
                            }else {
                                System.out.print("Do you eat bananas? (y for yes, n for no).\n");
                              str = read();
                             if (str.charAt(0) == 'y')
                                    {
                         System.out.println("You are a monkey.");
                          }else {
                          System.out.print("Are you a predetor? (y for yes, n for no).\n");
                         str = read();
                      if (str.charAt(0) == 'y')
                    {
                        System.out.print("Are you part of the big cat family? (y for yes, n for no).\n");
                    str = read();
                    if (str.charAt(0) == 'y')
                    {
                        System.out.print("Are you found in the jungle? (y for yes, n for no).\n");
                     str = read();
                    if (str.charAt(0) == 'y')
                    {
                        System.out.println("You are a tiger.");
                    }else {
                       System.out.print("Do you have spots? (y for yes, n for no).\n");
                    str = read();
                    if (str.charAt(0) == 'y')
                    {
                        System.out.print("Are you really fast? (y for yes, n for no).\n");
                    str = read();
                    if (str.charAt(0) == 'y')
                    {
                        System.out.println("You are a cheetah.");
                    }else {
                        System.out.println("You are a leopard.");
                    }  
                    }else {
                        System.out.println("You are a lion.");
                    }  
                    }  
                    }else {
                        System.out.println("You are a wolf.");
                    }  
                    }else {
                        System.out.println("You are a frog.");
                    }  
                    }  
                    }  
                    }  
                    }  
                    }  
                    }  
                }   
            }    
        }
         

    }
///////////////////////////////////////////////////

    public static String read()
    {
        byte [] buffer = new byte[10];
        try
        {
            int numBytes = System.in.read(buffer);
        }
        catch(IOException e)
        {
            System.out.print("Error: " + e);
            System.exit(1);
        }
        String str = new String(buffer);
        return (str);
    }

}
