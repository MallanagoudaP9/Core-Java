package fidelity.filehandling;

import java.io.*;

class Flight implements Serializable {

 private int flightID;
 private String name;
 private String source;
 private String destination;

 public Flight(int flightID, String name, String source, String destination) {
     this.flightID = flightID;
     this.name = name;
     this.source = source;
     this.destination = destination;
 }

  public int getFlightID() {
     return flightID;
 }

 public String getName() {
     return name;
 }

 public String getSource() {
     return source;
 }

 public String getDestination() {
     return destination;
 }

 @Override
 public String toString() {
     return flightID + ", " + name + ", " + source + ", " + destination;
 }
}

public class FHFlight {

 public static void main(String[] args) {

     try {

          Flight f1 = new Flight(1099, "IndiGo", "Bengaluru", "Hubli");

         ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("flight.dat"));
         oos.writeObject(f1);
         oos.close();

         FileWriter fw = new FileWriter("flight.txt");
         fw.write("FlightID, Name, Source, Destination\n");
         fw.write(f1.getFlightID() + ", "
                 + f1.getName() + ", "
                 + f1.getSource() + ", "
                 + f1.getDestination());
         fw.close();

         FileReader fr = new FileReader("flight.txt");
         int ch;

         System.out.println("Data from flight.txt:");
         while ((ch = fr.read()) != -1) {
             System.out.print((char) ch);
         }
         fr.close();

     } catch (Exception e) {
         System.out.println("Error: " + e.getMessage());
     }
 }
}
