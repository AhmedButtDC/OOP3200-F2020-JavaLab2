//Group:            15
//Name:             Ahmed Butt, Michai Pryce
//Student ID:       100770449, 100668094
//Last Modified:    November 22, 2020
//Project:          OOP3200-F2020-JavaLab2

package ca.durhamcollege;

import java.time.LocalDate;

public class Main
{
    public static void main(String[] args)
    {
        //DISPLAYING DIFFERENT WorkTickets
        WorkTicket workTicket;

        //Default Constructor
        workTicket = new WorkTicket();
        System.out.println("\nDefault Constructor\n-------------------\n" + workTicket.toString());

        //Parameterized Constructor (fail and success)
        System.out.println("\nParameterized Constructor (Fail)\n--------------------------------");
        workTicket = new WorkTicket(-1,  "1", -1,-1,-1, ".");

        workTicket = new WorkTicket(1, "1ABC", 2010,1,1, "Needs assistance.");
        System.out.println("\nParameterized Constructor (Success)\n-----------------------------------\n" + workTicket.toString());

        //Setters and Getters (fail and success)
        System.out.println("\nSetters (Fail)\n--------------");
        workTicket.setWorkTicketNumber(-1);
        workTicket.setClientID("");
        workTicket.setWorkTicketDate(1,-1,-1);
        workTicket.setDescription("");

        System.out.println("Setters (Success)\n-----------------");
        workTicket.setWorkTicketNumber(2);
        workTicket.setClientID("2ABC");
        workTicket.setWorkTicketDate(2011,5,20);
        workTicket.setDescription("Needs immediate assistance.");

        System.out.println("Work Ticket #:  " + workTicket.getWorkTicketNumber());
        System.out.println("Client ID:      " + workTicket.getClientID());
        System.out.println("Date:           " + workTicket.getWorkTicketDate());
        System.out.println("Description:    " + workTicket.getDescription() + "\n");

        //SetWorkTicket (fail and success)
        System.out.println("SetWorkTicket() (Fail)\n----------------------");
        if (workTicket.SetWorkTicket(-1,"3ABC", 2020, 11, 18, "Solve the problem."))
        {
            System.out.println("Ticket has been set!\n");
        }
        else
        {
            System.out.println("Failed to set ticket.\n");
        }

        System.out.println("SetWorkTicket() (Success)\n-------------------------");
        if (workTicket.SetWorkTicket(3,"3ABC", 2020, 11, 18, "Solve the problem."))
        {
            System.out.println("Ticket has been set!\n");
        }
        else
        {
            System.out.println("Failed to set ticket.\n");
        }

        System.out.println(workTicket.toString());
    }
}
