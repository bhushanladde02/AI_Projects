package sample_agents;
import java.util.Scanner;

public class SimpleAIAgent {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! I'm your AI agent. Type 'exit' to quit.");

        while (true) {
            System.out.print("You: ");
            String input = scanner.nextLine().toLowerCase();

            if (input.equals("exit")) {
                System.out.println("Agent: Goodbye!");
                break;
            }

            String response = getResponse(input);
            System.out.println("Agent: " + response);
        }

        scanner.close();
    }

    private static String getResponse(String input) {
        if (input.contains("hello") || input.contains("hi")) {
            return "Hello! How can I assist you today?";
        } else if (input.contains("weather")) {
            return "I can't check live weather, but it's always a good idea to carry an umbrella!";
        } else if (input.contains("time")) {
            return "Time flies! Consider checking your system clock 😊";
        } else if (input.contains("your name")) {
            return "I'm a simple AI agent written in Java!";
        } else {
            return "I'm not sure how to respond to that. Can you rephrase?";
        }
    }
}