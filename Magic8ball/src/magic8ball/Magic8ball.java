package magic8ball;

        // To get input from the user. 
    import java.util.Scanner; 

        // To generate random number. 
    import java.util.Random;

    // The main class is called Magic8ball. 
public class Magic8ball {
    public static void main(String[] args) {
        
            // For reading user input.
        Scanner scan = new Scanner(System.in);
        
            // For generating random numbers.
        Random randomInt = new Random();
        
           // Welcomes the user.
        System.out.println("Welcome to Oracle of Fate. Believe or not, this magic ball knows all the answers.");
        
             // Ask user's name.
        System.out.print("Input your name: ");
        String name = scan.nextLine();
        
             // Format with an uppercase first letter and lowercase for the rest.
        name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
        
             // Declare Variables for Question.
        String question;   
        int random = randomInt.nextInt(20)+1;
        String answer;
        
             // Prompt User for Question
        System.out.println("Hello " + name + "! Ask your question: ");
        question = scan.nextLine();  
        
             // Assign Answers Based on Random Number
        if (random  == 1) {
            answer = "\033[1;32mIT IS CERTAIN\033[0m";
        } else if (random == 2) {
            answer = "\033[1;32mIT IS DECIDEDLY SO\033[0m";
        } else if (random == 3) {
            answer = "\033[1;32mWITHOUT A DOUBT\033[0m";
        } else if (random == 4) {
            answer = "\033[1;32mYES, DEFINITELY\033[0m";
        } else if (random == 5) {
            answer = "\033[1;32mYOU MAY RELY ON IT\033[0m";
        } else if (random == 6) {
            answer = "\033[1;32mAS I SEE IT, YES\033[0m";
        } else if (random == 7) {
            answer = "\033[1;32mMOST LIKELY\033[0m";
        } else if (random == 8) {
            answer = "\033[1;32mOUTLOOK GOOD\033[0m";
        } else if (random == 9) {
            answer = "\033[1;32mYES\033[0m";
        } else if (random == 10) {
            answer = "\033[1;32mSIGNS POINT TO YES\033[0m";
        } else if (random == 11) {
            answer = "REPLY HAZY TRY AGAIN";
        } else if (random == 12) {
            answer = "ASK AGAIN LATER";
        } else if (random == 13) {
            answer = "BETTER NOT TELL YOU NOW";
        } else if (random == 14) {
            answer = "CANNOT PREDICT NOW";
        } else if (random == 15) {
            answer = "CONCENTRATE AND ASK AGAIN";
        } else if (random == 16) {
            answer = "\033[1;31mDON'T COUNT ON IT\033[0m";
        } else if (random == 17) {
            answer = "\033[1;31mMY REPLY IS NO\033[0m";
        } else if (random == 18) {
            answer = "\033[1;31mMY SOURCES SAY NO\033[0m";
        } else if (random == 19) {
            answer = "\033[1;31mOUTLOOK NOT SO GOOD\033[0m";
        } else {
            answer = "\033[1;31mVERY DOUBTFUL\033[0m";
    }
             // Display the Answer
        System.out.println(answer);
       
      
    }
    
}
        
    
    

