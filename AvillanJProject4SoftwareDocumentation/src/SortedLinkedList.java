//J Avillan Software and Documentation Project 4
import java.util.*;

/**
 * The SortedLinkedList program demonstrates how to insert integers into a LinkedList in a sorted manner
 * using the Collections Framework. It also allows for user input via the command line, then displays
 * the sorted list of integers
 * <p>
 * This program reads integer values from the user input, sorts them using a LinkedList, and outputs the sorted
 * list to the console
 */
public class SortedLinkedList {

    /**
     * Inserts an integer into a list while maintaining the list's sorted order.
     * The list is sorted after each insertion using the Collections.sort method
     * <p>
     * Reuse Example 1: This method reuses the Collections.sort method to ensure that the list stays sorted
     * after every insertion, without needing to write custom sorting logic
     *
     * @param list The LinkedList that stores the integers
     * @param data The integer to be inserted
     */
    public static void insertSorted(List<Integer> list, int data) {
        // Insert the data into the list
        list.add(data);
        // Reuse Example 2: Reuse of the Collections.sort method to ensure the list is sorted
        Collections.sort(list);
    }

    /**
     * Prints the elements of the provided list
     * This method iterates through the list and prints each element to the console
     * <p>
     * Reuse Example 3: Reuse of the for-each loop construct
     *
     * @param list The list to print
     */
    public static void printList(List<Integer> list) {
        // Print each element of the list
        for (int num : list) {  // Reused pattern for looping through collections
            System.out.print(num + " ");
        }
        System.out.println();
    }

    /**
     * The main method handles reading user input from the command line and inserting the integers
     * into the sorted linked list. It will repeatedly ask for integers and insert them into the list
     * The user can type "exit" to stop entering numbers
     * <p>
     * Reuse Example 4: Reuse of the Scanner to handle user input. This approach to reading inputs is common in
     * console-based programs
     * <p>
     * The program then prints the sorted list after all inputs have been processed
     *
     * @param args Command line arguments (not used)
     */
    public static void main(String[] args) {
        // Create a LinkedList to store integers
        List<Integer> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);  // Reused pattern for reading input from console

        System.out.println("Enter numbers (type 'exit' to stop):");

        // Continue reading inputs until "exit" is entered
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                // If the input is an integer, insert it into the sorted list
                int num = scanner.nextInt();
                insertSorted(list, num);  // Reuse of the insertSorted method
            } else {
                // If the input is "exit", break the loop and stop taking input
                String input = scanner.next();
                if (input.equalsIgnoreCase("exit")) {
                    break;
                }
                // If the input is invalid, prompt the user again
                System.out.println("Invalid input. Please enter an integer or 'exit'.");
            }
        }
        // Close the scanner after use
        scanner.close();

        // Print the sorted list
        System.out.println("Sorted List:");
        printList(list);  // Reuse of the printList method to display the result
    }
}

/**
 * To compile and run the program, follow these steps:
 * <p>
 * 1. Compile the program:
 *    <code>javac SortedLinkedList.java</code>
 * <p>
 * 2. Run the compiled program:
 *    <code>java SortedLinkedList</code>
 * <p>
 * 3. To generate Javadoc for this program, use the following command:
 *    <code>javadoc -d docs SortedLinkedList.java</code>
 */
