/*
    This class is a small vector exercise
     and was based on a 10-room accommodation
     and it must show which ones are already being used
      and the person's information.
      CHeck HostelInfo.Java
 */
package codes;

import util.HostelInfo;

import java.util.Scanner;

public class Hostel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        int[] rooms = new int[9];

        System.out.println("-----------------------------------------------");
        System.out.println();
        System.out.println("Welcome to the Unnamed hostel in Foz do Iguaçu!");
        System.out.println();
        System.out.println("-----------------------------------------------");

        System.out.print("How many rooms will be rented? ");
        n = sc.nextInt();

        HostelInfo[] administration = new HostelInfo[n];

        for (int i = 0; i<administration.length; i++){
            sc.nextLine();
            System.out.println("--------------------------------");
            System.out.print("Guest Name: ");
            String name = sc.nextLine();
            System.out.print("Guest Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int room = sc.nextInt();
            administration[i] = new HostelInfo(name,email,room);
            System.out.println("--------------------------------");
        }
        int room = 0;
        String email = null;
        String name = null;

        for (int i= 0; i < administration.length; i++){
            room = administration[i].getRoomNumber();
            email = administration[i].getGuestEmail();
            name = administration[i].getGuestName();
            System.out.println("Busy Rooms:");
            System.out.println("--------------------------------");
            System.out.println("Room: " + administration.length);
            System.out.println();
            System.out.println("Name: " + name);
            System.out.println();
            System.out.println("Email: " + email);
            System.out.println("--------------------------------");
        }



    }
}
