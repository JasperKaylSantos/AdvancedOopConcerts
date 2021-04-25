import java.io.InputStream;
import java.util.*;
public class UseInsurance {
   
    public static void main(String args[]) {
      
        Scanner input = new Scanner(System.in);
        int insurance;
        System.out.println("Enter (1) for Life Insurance or (2) for Health Insurance: ");
        String userInput =input.next();
        insurance =Integer.parseInt(userInput);
        if (insurance == 1)
           insuranceLife();
        else
           insuranceHealth();
    }
    private static Scanner newScanner(InputStream in) {

        return null;
    }
  
    public static void insuranceLife() {
        Life life = new Life();
        life.setCost();
        life.display();
    }
  
    public static void insuranceHealth() {
        Health health = new Health();
        health.setCost();
        health.display();
    }
}