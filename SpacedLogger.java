package codingAssignments;
//Step 3: Create the SpacedLogger class
class SpacedLogger implements Logger {
 // Helper method to add spaces between characters
 private String addSpaces(String message) {
     return message.replaceAll("", " ").trim();
 }

 // Step 5a: Implement the log method
 @Override
 public void log(String message) {
     System.out.println(addSpaces(message));
 }

 // Step 5b: Implement the error method
 @Override
 public void error(String message) {
     System.out.println("SMILE :-) : " + addSpaces(message));
 }
}