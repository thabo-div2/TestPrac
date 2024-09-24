/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testprac;

import java.util.Scanner;

/**
 *
 * @author Thabo Setsubi st10445734@vcconnnect.edu.za ST10445734
 */
public class TestPrac {

    //This is the main method
    //------------------------------------------------------------------------//
    public static void main(String[] args) {
        Question1();
        Question2();
    }
    
    public static void Question1() 
    {
        int[][] carSales = {{25, 15, 35},{25, 55, 35},{11, 20, 45},{17, 27, 25}};
        int[] totalSales = new int[4];
        int tSales = 0;
        String[] cars = {"SUV", "Coupe", "Sedan", "Van"};
        String status;
        
        System.out.printf("************************************************%n");
        System.out.printf("Vehicle Sales Report%n");
        System.out.printf("************************************************%n");
        
        System.out.printf("%-10S %4S %4S %4S %n", " ", "JAN", "FEB", "MAR");
        for (int i = 0; i < carSales.length; i++) 
        {
            System.out.printf("%-10S %4d %4d %4d %n", cars[i], carSales[i][0], carSales[i][1], carSales[i][2]);
            tSales = 0;
            for (int j = 0; j < carSales[i].length; j++) 
            {
                tSales = tSales + carSales[i][j];
                
            }
            totalSales[i] = tSales;
        }
        System.out.printf("************************************************%n");
        System.out.printf("Vehicle Total Sales%n");
        System.out.printf("************************************************%n");
        for (int k = 0; k < totalSales.length; k++) 
        {
            if (totalSales[k] >= 100) 
            {
                status = "Gold Star";
            }
            else
            {
                status = "Silver Star";
            }
            System.out.printf("%-10S %4d (%-4s) %n", cars[k], totalSales[k], status);
        }
        System.out.printf("************************************************%n");
    }
    
    public static void Question2() 
    {
        Scanner scan = new Scanner(System.in);
        String name;
        String movieTitle;
        int age;
        double cost;
        
        System.out.println("Enter the customer name: ");
        name = scan.next();
        
        System.out.println("Enter the movie: ");
        movieTitle = scan.next();
        
        scan.nextLine();
        
        System.out.println("Enter the customer age: ");
        age = scan.nextInt();
        
        System.out.println("Enter the movie cost: ");
        cost = scan.nextDouble();
        
        TicketSales newTicket = new TicketSales(name, movieTitle, age, cost);
        
        newTicket.print_tickets();
    }
}
