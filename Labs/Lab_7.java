import java.util.Scanner;

public class lab_7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // room and if they are to be
        boolean[] roomStates = {true, false, false, false}; // spawn, puzzle room 1, puzzle room 2, goal

        // what room u in
        int currentRoom = 0;

        // problems and answers, dont cheat
        String[] problems = {
            "9 + 10",
            "give me extra credit",
            "6.9!, round to nearest hundredths"
        };
        String[] answers = {"19", "yes", "4122.71"};

        while (currentRoom < roomStates.length) {
            displayRoom(currentRoom, roomStates, problems);

            // Display valid actions
            System.out.println("you can: ");
            if (currentRoom > 0) {
                System.out.println("1 : back");
            }
            if (currentRoom < roomStates.length - 1 && !roomStates[currentRoom + 1]) {
                System.out.println("2 : next");
            }
            if (currentRoom < roomStates.length - 1 && roomStates[currentRoom]) {
                System.out.println("3 : solve");
            }
            System.out.print("Enter your choice: ");

            // gotta know what they type yk
            int choice = scanner.nextInt();

            // uhhh, based on user input it does something
            switch (choice) {
                case 1:
                    if (currentRoom > 0) {
                        currentRoom--;
                    } else {
                        System.out.println("no, you can't go back to spawn");
                    }
                    break;
                case 2:
                    if (currentRoom < roomStates.length - 1 && !roomStates[currentRoom + 1]) {
                        currentRoom++;
                    } else {
                        System.out.println("no, either the next room is locked or you have schizo");
                    }
                    break;
                case 3:
                    if (currentRoom == 0) {
                        System.out.println("Welcome to the Puzzle Chamber, where an otherworldly glow bathes the room,\n" +
                                           "and mystic symbols adorn the walls. A central pedestal cradles an ancient artifact,\n" +
                                           "surrounded by a challenging puzzle that promises to unlock cosmic secrets. The air hums\n" +
                                           "with anticipation, as if the room itself challenges you to prove your wit. Step boldly\n" +
                                           "into the realm of intellect, intrepid adventurer, and may the arcane wisdom concealed\n" +
                                           "within the Puzzle Chamber reveal itself to those worthy of its secrets.");

                        System.out.println("type 2 to begin");
                    } else if (currentRoom < roomStates.length - 1 && roomStates[currentRoom]) {
                        System.out.println("Problem: " + problems[currentRoom]);
                        System.out.print("enter your answer: ");
                        String userAnswer = scanner.next().toLowerCase(); // Ignore case
                        if (userAnswer.equals(answers[currentRoom].toLowerCase())) {
                            roomStates[currentRoom + 1] = true;
                            System.out.println("tian cai, you're right!");
                        } else {
                            System.out.println("idiot.");
                        }
                    } else {
                        System.out.println("sooo, there is not a problem to solve");
                    }
                    break;
                default:
                    System.out.println("that was not a option.");
            }
        }

        System.out.println("you finished!, give me money");
        System.out.println("leave.");

        scanner.close();
    }

    private static void displayRoom(int currentRoom, boolean[] roomStates, String[] problems) {
        System.out.println("\nYou are in Room " + (currentRoom + 1) + ":");
        System.out.println("Status: " + (roomStates[currentRoom] ? "Unlocked" : "Locked"));
        
        // check if the room has a problem to display
        if (currentRoom < roomStates.length && currentRoom < problems.length) {
            System.out.println("Problem: " + problems[currentRoom]);
        }
    }
}


