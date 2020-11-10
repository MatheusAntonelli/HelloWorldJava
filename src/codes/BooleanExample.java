package codes;

public class BooleanExample {
    public static void main(String[] args) {
        int doorCount = 0;
        boolean openDoor = true;
        boolean closedDoor = true;
        boolean passedAllDoors;

        if (openDoor){
            System.out.println("You passed the first door!");
            doorCount++;
        }else if (closedDoor){
            System.out.println("Oh no you skipped the second door, no problems let's find another door '_' ");
        }else if (openDoor){
            System.out.println("You passed the third door! ");
            doorCount++;
        }else if (openDoor){
            System.out.println("Congratulations you passed the fourth door");
            doorCount++;
        }

        if (doorCount >= 3){
            passedAllDoors =true;
        }else if (passedAllDoors = true){
            System.out.println("You win");
        }
    }
}
