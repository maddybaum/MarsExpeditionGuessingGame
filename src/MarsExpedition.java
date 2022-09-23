import java.util.Scanner;

public class MarsExpedition {

    public MarsExpedition() {
        Scanner input = new Scanner(System.in);
        System.out.println("Expedition prep program starting");
        System.out.println("Booting up...");
        System.out.println("...");
        System.out.println("...");
        System.out.println("Ready");
        System.out.println("Hello user, what is your name?");

        String userName = input.nextLine();
        System.out.println("Hi " + userName + "welcome to the Expedition Prep Program \n. Are you ready to head out into the new world? \n Type Y or N");
        String excited = input.nextLine();
        if (excited.equalsIgnoreCase("Y")) {
            System.out.println("I knew you would say that. You are team leader for a reason");
        } else {
            System.out.println("Too bad. You are team leader. You have to go anyways");
        }
        System.out.println("How many people do you want on your expedition team?");
        int teamSize = input.nextInt();
        input.nextLine();
        if (teamSize > 2) {
            System.out.println("That's too many people. We can only send 2 more members");
            teamSize = 2;
        } else if (teamSize < 2) {
            System.out.println("That's not enough people. We need you and 2 more members");
            teamSize = 2;
        } else if (teamSize == 2) {
            System.out.println("That's a perfect sized team. Great job.");
        }
        System.out.println("You are allowed to bring one weapon with you. You know, just in case. What do you want to bring?");
        String weapon = input.nextLine();
        System.out.println("Nice choice. You will be bringing " + weapon + " with you.");
        System.out.println("You have three choices of vehicles. \n A: Mars Rover \n B: Chevy Silverado \n C: Honda Civic ");
        String vehicleChoice = input.nextLine();
        String vehicle = null;
        if (vehicleChoice.equalsIgnoreCase("A")) {
            vehicle = "Mars Rover";
        } else if (vehicleChoice.equalsIgnoreCase("B")) {
            vehicle = "Chevy Silverado";
        } else if (vehicleChoice.equalsIgnoreCase("C")) {
            vehicle = "Honda Civic";
        } else {
            vehicle = "Your feet";
        }
        System.out.println("Your expedition team is now ready. \n Led by " + userName + " with " + teamSize + " teammates \n " + "To explore the sruface of Mars using vehicle "
                + vehicle + "\n Exploration team heads out in \n");
        System.out.println("5");
        System.out.println("4");
        System.out.println("3");
        System.out.println("2");
        System.out.println("1");
        System.out.println("GO GO GO");
    }
}