import java.util.Scanner ;
/**
 *lests the user know what docound they get how much they save and the final price
 * @author jason
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // input scanner for user input
    Scanner input = new Scanner(System.in);

    //asks user for input
    System.out.println("Please enter the amount the customer spent");
   
    //user input 
    double  cost = input.nextDouble();

      double save = (cost* 0.1);
    
      double total = (cost- save);
    
      double save20 = (cost* 0.2);
    
      double total20 = (cost- save20);

       double save30 = (cost* 0.3);
    
      double total30 = (cost- save30);

      double save40 = (cost* 0.4);
    
      double total40 = (cost- save40);
    
    //10% discount
      if (cost <= 40.00){
     System.out.println("They will receive 10% off. "+ "they will save " + save + "$" + " The new total " + total +"$" );}
     
     //20% discound
      else if (cost <= 80.01){
     System.out.println("They will receive 20% off."+ save20 + "$" + " The new total " + total20 +"$");}
     
     //30% off
     else if (cost<= 120){
     System.out.println("They will receive 30% off."+ save30 + "$" + " The new total " + total30 +"$");}
     
     //40%off
     else if (cost>= 120.01){
     System.out.println("They will receive 40% off."+ save40 + "$" + " The new total " + total40 +"$");}
    
    


    
  }
}
