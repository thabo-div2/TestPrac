/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testprac;

/**
 *
 * @author Thabo Setsubi st10445734@vcconnnect.edu.za ST10445734
 */
public abstract class Ticket implements iTickets {
    String customerName;
    String movieTitle;
    int customerAge;
    double moviePrice;
    
    public Ticket(String customerName, String movieTitle, int customerAge, double moviePrice) {
        this.customerName = customerName;
        this.movieTitle = movieTitle;
        this.customerAge = customerAge;
        this.moviePrice = moviePrice;
    }
    public String getCustomerName() {
        return customerName;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public int getCustomerAge() {
        return customerAge;
    }

    public double getMoviePrice() {
        return moviePrice;
    }
    
}


