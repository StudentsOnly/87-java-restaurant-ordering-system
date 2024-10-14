## Exercise: Ticket Reservation System

### Objective:

Develop a Java program for a Ticket Reservation System that leverages Enums to represent different seat classes. This exercise aims to reinforce your understanding of Enums and object-oriented programming principles. By completing this exercise, you will enhance your skills in Java, particularly in designing and implementing systems with multiple interacting classes.

### Instructions:

1.	Create Enum for Seat Classes:
    -	Define an Enum named SeatClass that includes classes such as FIRST_CLASS, BUSINESS_CLASS, and ECONOMY_CLASS.
2.	Create Passenger Class:
    -	Implement a Passenger class with the following attributes:
        -	passengerName (String)
        -	seatClass (SeatClass Enum)
        -	ticketPrice (double)
3.	Create Flight Class:
    -	Develop a Flight class to manage the reservation system. It should include the following methods:
        -	reserveSeat: Reserves a seat for a passenger, setting the ticket price based on the seat class.
        -	cancelReservation: Cancels a reservation by passenger name.
        -	displayPassengerList: Displays the list of passengers and their reserved seats.
4.	Main Class:
    -	Create a Main class to demonstrate the functionality of your Ticket Reservation System. Instantiate the Flight class, reserve seats for different passengers, cancel a reservation, and display the updated passenger list.
5.	Extra Challenge:
    -	Implement a method in the Flight class to calculate the total revenue generated from ticket sales.
