package codingAssignments;
//Step 6: Create the App class
public class App {
 public static void main(String[] args) {
     // Step 6a: Instantiate AsteriskLogger and SpacedLogger
     Logger asteriskLogger = new AsteriskLogger();
     Logger spacedLogger = new SpacedLogger();

     // Step 6b: Test the methods with sample input
     String testMessage = "You Passed";

     System.out.println("Testing AsteriskLogger:");
     asteriskLogger.log(testMessage);
     asteriskLogger.error(testMessage);

     System.out.println("\nTesting SpacedLogger:");
     spacedLogger.log(testMessage);
     spacedLogger.error(testMessage);
 }
}
