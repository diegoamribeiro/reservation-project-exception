package application;

import model.entities.Reservation;
import model.exceptions.DomainException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.print("Room number: ");
            int roomNumber = scanner.nextInt();
            System.out.print("Check-in date: ");
            Date checkIn = simpleDateFormat.parse(scanner.next());
            System.out.print("Check-out date: ");
            Date checkOut = simpleDateFormat.parse(scanner.next());

            Reservation reservation = new Reservation(roomNumber, checkIn, checkOut);
            System.out.println("Reservation: " + reservation);

            System.out.println();
            System.out.println("enter data to update reservation: ");
            System.out.print("Check-in date: ");
            checkIn = simpleDateFormat.parse(scanner.next());
            System.out.print("Check-out date: ");
            checkOut = simpleDateFormat.parse(scanner. next());

            reservation.updateDates(checkIn, checkOut);

            System.out.println("Reservation: " + reservation);
        }catch (ParseException e){
            System.out.println("Invalid Date format! ");
        }catch (DomainException e){
            System.out.println("Error in reservation: " + e.getMessage());
        }catch (RuntimeException e){
            System.out.println("Unexpected error! ");
        }



        scanner.close();


    }

}
