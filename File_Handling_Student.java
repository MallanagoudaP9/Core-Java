/*
You are given a text file named: students.txt

rollNo,name,marks
101,Rahul,78
102,Anita,85
103,Kiran,42
104,Pooja,90

(1) File operations
a) Create a File object for students.txt.
b) Check whether the file exists.
c) If the file does NOT exist, display the message as "students.txt file not found" and terminate the program.

(2) Reading data using FileReader
a) Read the contents of students.txt using FileReader only.
b) Read the file character by character.

(3) Extract student records
a) Split the data line by line.
b) For each line, extract:
roll number
name
marks
c) Store the extracted values in suitable variables

*/

package fidelity.filehandling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
 
public class FileHandlingStudent {
 
    public static void main(String[] args) {
 
        File file = new File("/home/labuser/Desktop/Java/students.txt");
 
        if (!file.exists()) {
            System.out.println("students.txt file not found");
            return;
        }
 
        try {
            FileReader fr = new FileReader(file);
            StringBuilder data = new StringBuilder();
 
            int ch;
            while ((ch = fr.read()) != -1) {
                data.append((char) ch);
            }
            fr.close();
            String[] lines = data.toString().split("\n");
 
            for (int i = 1; i < lines.length; i++) {  
                String line = lines[i].trim();
 
                if (!line.isEmpty()) {
 
                    String[] parts = line.split(",");
 
                    int rollNo = Integer.parseInt(parts[0].trim());
                    String name = parts[1].trim();
                    int marks = Integer.parseInt(parts[2].trim());
 
                    System.out.println("Roll No: " + rollNo);
                    System.out.println("Name   : " + name);
                    System.out.println("Marks  : " + marks);
                    System.out.println("---------------------");
                }
            }
 
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}

Output:

Roll No: 101
Name   : Rahul
Marks  : 78
---------------------
Roll No: 102
Name   : Anita
Marks  : 85
---------------------
Roll No: 103
Name   : Kiran
Marks  : 42
---------------------
Roll No: 104
Name   : Pooja
Marks  : 90
---------------------
