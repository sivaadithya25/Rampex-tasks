package Calender.main;

import Calender.model.*;
import Calender.service.CalendarService;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        CalendarService service = new CalendarService();
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter number of events: ");
            if(!sc.hasNextInt()){
                System.out.println("No input provided. Exiting.");
                return;
            }
            int n = sc.nextInt();
            sc.nextLine();
            for(int i=0;i<n;i++){

                System.out.println("\n1. Normal Event  2. Reminder Event");
                if(!sc.hasNextInt()){
                System.out.println("Invalid input. Stopped event entry.");
                break;
                }
                int choice=sc.nextInt();
                sc.nextLine();

                System.out.print("Enter title: ");
                if(!sc.hasNextLine()){
                    System.out.println("Missing title input. Stopped event entry.");
                    break;
                }
                String title=sc.nextLine();
                System.out.print("Enter_date(YYYY-MM-DD):");
                if(!sc.hasNextLine()){
                    System.out.println("Missing date input. Stopped event entry.");
                    break;
                }
                String date=sc.nextLine();
                System.out.print("Enter time: ");
                if(!sc.hasNextLine()){
                    System.out.println("Missing time input. Stopped event entry.");
                    break;
                }
                String time=sc.nextLine();

                if(choice==1){
                    service.addEvent(new Event(title,date,time));
                } 
                else{
                    System.out.print("Enter reminder time: ");
                    if (!sc.hasNextLine()){
                        System.out.println("Missing reminder input. Skipping this event.");
                        continue;
                    }
                    String rtime=sc.nextLine();
                    service.addEvent(new ReminderEvent(title,date,time,rtime));
                }
            }
        }service.showEvents();
    }
}