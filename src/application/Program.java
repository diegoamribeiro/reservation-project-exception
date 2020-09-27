package application;

import model.entities.Reservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Room number: ");
        int roomNumber = scanner.nextInt();
        System.out.print("Check-in date: ");
        Date checkIn = simpleDateFormat.parse(scanner.next());
        System.out.print("Check-out date: ");
        Date checkOut = simpleDateFormat.parse(scanner.next());

        if (!checkOut.after(checkIn)){
            System.out.println("Error in reservation: check-out must be after check-in date!");
        }else {
            Reservation reservation = new Reservation(roomNumber, checkIn, checkOut);
            System.out.println("Reservation: " + reservation);

            System.out.println();
            System.out.println("enter data to update reservation: ");
            System.out.print("Check-in date: ");
            checkIn = simpleDateFormat.parse(scanner.next());
            System.out.print("Check-out date: ");
            checkOut = simpleDateFormat.parse(scanner. next());


                String error = reservation.updateDates(checkIn, checkOut);
                if (error != null){
                    System.out.println("Error in reservation: " + error);
                }
                System.out.println("Reservation: " + reservation);
            }

        scanner.close();


    }

}
