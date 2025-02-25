import java.util.*;

/**
 * The SortedStack program demonstrates how to insert integers into a Stack
 * while maintaining the sorted order using a temporary list for sorting.
 * It also allows for user input via the command line, then displays the
 * sorted stack of integers
 */
public class SortedStack {

    /**
     * Inserts an integer into a stack while maintaining the stack's sorted order.
     * The stack is sorted after all integers are inserted using a temporary list.
     *
     * Code Reuse:
     * - Uses the stack's pop and push methods repeatedly.
     * - Uses a temporary list (ArrayList) to store popped elements before reinserting.
     * - Follows a similar approach to sorted linked list insertions.
     *
     * @param stack The Stack that stores the integers
     * @param data  The integer to be inserted
     */
    public static void insertSorted(Stack<Integer> stack, int data) {
        // Temporary list to hold the current elements of the stack
        List<Integer> tempList = new ArrayList<>();

        // Move elements from stack to the temporary list
        while (!stack.isEmpty() && stack.peek() > data) {
            tempList.add(stack.pop());
        }

        // Push the new data onto the stack
        stack.push(data);

        // Push elements back from the temporary list to the stack
        for (int i = tempList.size() - 1; i >= 0; i--) {
            stack.push(tempList.get(i));
        }
    }

    /**
     * Prints the elements of the provided stack.
     *
     * Code Reuse:
     * - Uses enhanced for-loop to print elements.
     * - Follows standard output format seen in other stack programs.
     *
     * @param stack The stack to print
     */
    public static void printStack(Stack<Integer> stack) {
        // Print each element of the stack
        for (int num : stack) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    /**
     * The main method handles reading user input from the command line
     * and inserting the integers into the sorted stack. The user can type
     * "exit" to stop entering numbers. The program then prints the sorted
     * stack after all inputs have been processed.
     *
     * Code Reuse:
     * - Uses Scanner to read input
     * - Uses loop structure similar to other stack input programs.
     * - Shares input validation with other user input programs.
     *
     * @param args Command line arguments (not used)
     */
    public static void main(String[] args) {
        // Create a Stack to store integers
        Stack<Integer> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter numbers (type 'exit' to stop):");

        // Continue reading inputs until "exit" is entered
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                // If the input is an integer, insert it into the sorted stack
                int num = scanner.nextInt();
                insertSorted(stack, num);
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

        // Print the sorted stack
        System.out.println("Sorted Stack:");
        printStack(stack);
    }
}

/**
 * To compile and run the program, follow these steps:
 * <p>
 * 1. Compile the program:
 *    <code>javac SortedStack.java</code>
 * <p>
 * 2. Run the compiled program:
 *    <code>java SortedStack</code>
 * <p>
 * 3. To generate Javadoc for this program, use the following command:
 *    <code>javadoc -d docs SortedStack.java</code>
 */
