/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testprac;

/**
 *
 * @author thabo
 */
public class TicketSales extends Ticket 
{

    public TicketSales(String customerName, String movieTitle, int customerAge, double moviePrice) {
        super(customerName, movieTitle, customerAge, moviePrice);
    }

    @Override
    public void print_tickets() {
        double discount = 0;
        double totalPrice = this.moviePrice;
        if (this.customerAge >= 65) 
        {
            discount = 0.1;
            totalPrice = this.moviePrice * 0.9;
        }
        System.out.println("Customer: " + this.customerName +  "\n"
                + "Movie: " + this.movieTitle + "\n"
                + "Cost: " + this.moviePrice + "\n"
                + "Discount: " + discount +  "\n"
                + "Total: " + totalPrice);
    }
    
}
