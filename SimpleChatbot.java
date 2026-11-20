
import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class SimpleChatbot {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        String name = "";

        System.out.println("==================================");
        System.out.println("       WELCOME TO CHATBOT");
        System.out.println("==================================");

        System.out.println("Bot: Hello! I am your chatbot.");
        System.out.println("Bot: Type 'help' for commands.");
        System.out.println("Bot: Type 'bye' to exit.");

        while (true) {

            System.out.print("\nYou: ");
            String input = sc.nextLine().toLowerCase().trim();

            
            if (input.equals("hello") ||
                input.equals("hi") ||
                input.equals("hey")) {

                System.out.println("Bot: Hello! How can I help you?");
            }

            
            else if (input.contains("your name")) {

                System.out.println("Bot: I am a Simple Rule-Based Chatbot.");
            }

            else if (input.contains("how are you")) {

                System.out.println("Bot: I am fine. Thank you!");
            }

           
            else if (input.startsWith("my name is ")) {

                name = input.substring(11).trim();
                System.out.println("Bot: Nice to meet you, " + name + "!");
            }

            else if (input.contains("what is my name")) {

                if (!name.isEmpty()) {
                    System.out.println("Bot: Your name is " + name + ".");
                } else {
                    System.out.println("Bot: Please tell me your name first.");
                }
            }

            else if (input.contains("java") ||
                     input.contains("programming")) {

                System.out.println(
                    "Bot: Java is a popular object-oriented programming language."
                );
            }

            else if (input.contains("date")) {

                System.out.println(
                    "Bot: Today's date is " + LocalDate.now()
                );
            }

            else if (input.contains("time")) {

                DateTimeFormatter format =
                    DateTimeFormatter.ofPattern("hh:mm a");

                System.out.println(
                    "Bot: Current time is " + LocalTime.now().format(format)
                );
            }

            else if (input.contains("joke")) {

                String[] jokes = {
                    "Why do programmers prefer dark mode? Because light attracts bugs!",
                    "Why was the computer cold? Because it left its Windows open!",
                    "Why did the computer go to the doctor? Because it had a virus!"
                };

                System.out.println(
                    "Bot: " + jokes[random.nextInt(jokes.length)]
                );
            }

            else if (input.contains("thank")) {

                System.out.println("Bot: You are welcome!");
            }

            else if (input.equals("help")) {

                System.out.println("Bot: You can ask me:");
                System.out.println("1. Hello");
                System.out.println("2. What is your name?");
                System.out.println("3. How are you?");
                System.out.println("4. What is my name?");
                System.out.println("5. Tell me about Java");
                System.out.println("6. What is the date?");
                System.out.println("7. What is the time?");
                System.out.println("8. Tell me a joke");
                System.out.println("9. Bye");
            }

            else if (input.equals("bye") ||
                     input.equals("exit")) {

                System.out.println("Bot: Goodbye! Have a nice day!");
                break;
            }

            else {

                System.out.println(
                    "Bot: Sorry, I don't understand. Type 'help'."
                );
            }
        }

        System.out.println("\nChatbot session ended.");

        sc.close();
    }
}
