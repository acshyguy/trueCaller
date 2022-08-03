package africa.semicolon;

import africa.semicolon.controllers.UserController;
import africa.semicolon.dtos.requests.AddContactRequest;
import africa.semicolon.dtos.requests.RegisterRequest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

//import static jdk.internal.org.jline.keymap.KeyMap.display;

@SpringBootApplication
public class Main {

    private static UserController userController=new UserController();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //prompt user wt menu
        //if user selects a, b, c, d direct them


        SpringApplication.run(Main.class, args);
        displayMainManu();


    }

    private static void displayMainManu() {
        String mainMenuPrompt = """
                WELCOME TO TRUE CALLER
                1-> Create an Account
                2-> Add contact to a user
                3-> Find contact belonging to user
                """;

        String userInput = input(mainMenuPrompt);
        switch (userInput.charAt(0)) {
            case '1' -> createAccount();
            case '2' -> addContactToUser();
            case '3' -> findContactBelongingToUser();
        }

    }

    private static String input(String prompt) {
        System.out.println(prompt);
        return scanner.nextLine();
    }


    private static void findContactBelongingToUser() {
        var contacts=userController.findAllcontacts(scanner("Enter your email: "));
        contacts.forEach(contact -> System.out.println(contact.toString()));
        displayMainManu();

    }

    // Second stage after Create method
    private static void addContactToUser() {
        AddContactRequest contactRequest=new AddContactRequest();
        contactRequest.setFirstName(scanner("Enter contact's first name: "));
        contactRequest.setLastName(scanner("Enter contact's last name: "));
        contactRequest.setPhoneNumber(scanner("Enter contact's phone number: "));
        contactRequest.setEmail(scanner("Enter contact's email: "));
        contactRequest.setUserEmail(scanner("Enter your email: "));
        userController.addContact(contactRequest);
        displayMainManu();
    }

    // First stage after Main
    private static void createAccount(){
        RegisterRequest request=new RegisterRequest();
        request.setFirstName(scanner("Enter first name: "));
        request.setLastName(scanner("Enter last name: "));
        request.setPhoneNumber(scanner("Enter phone number: "));
        request.setPassword(scanner("Enter password: "));
        request.setEmail(scanner("Enter email: "));
        userController.registerUser(request);
        System.out.println(("Done!"));
        System.out.println(("Do you want to create new account?"));
        displayMainManu();
    }

    public static String scanner(String prompt){
        System.out.println(prompt);
        return scanner.nextLine();
    }

}
