package codingAssignments;
//Step 3: Create the AsteriskLogger class
public class AsteriskLogger implements Logger {
	// Step 4a: Implement the log method
    @Override
    public void log(String message) {
        System.out.println("***" + message + "***");
    }
    // Step 4b: Implement the error method
    @Override
    public void error(String message) {
        String border = "*".repeat(message.length() + 13); // Adjusting length for "ERROR: " and padding
        System.out.println(border);
        System.out.println("***smile :-) : " + message + "***");
        System.out.println(border);
    }
}
