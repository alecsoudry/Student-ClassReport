/* Author: Alec Soudry
 * Date Written: 2/16/22
 * This portion of the application creates a class wherein we make an array allowing user input of student data. Using
 * the scanner we ask questions to be input sequentially until the final prompt has been answered and is sent back to
 * the Student class to be printed.
 */


import java.util.Scanner;

public class ClassReport { 

    static Scanner sc=new Scanner(System.in);
        
    public Student[] StudentArray(int count) {
                
                Student[] std=new Student[count];
                String fname,lname,ID, major;
                float GPA;
                for(int i=0;i<count;i++) {
                        System.out.println("\nSTUDENT "+(i+1));
                        System.out.print("Enter first name: ");
                        fname=sc.next();
                        if (fname.equals("default") || fname.equals("Default")) {
                        	Student s = new Student();
                            System.out.println(s);
                        }
                        else {
                        System.out.print("Enter last name: ");
                        lname=sc.next();
                        System.out.print("Enter ID: ");
                        ID=sc.next();
                        System.out.print("Enter Major: ");
                        major=sc.next();
                        System.out.print("Enter GPA: ");
                        GPA=sc.nextFloat();
                        sc.nextLine();
                        
                        std[i]=new Student(fname,lname,ID,major,GPA);
                        }
                }
                System.out.println("Last Name First Name Student ID");
                return std;
        }
    
    public void StudentArray2(Student[] std) {
        System.out.println(" ");
        for(int i=0;i<std.length;i++) {
                System.out.println(std[i]);
        }
    }
    
    public static void main(String[] args) {
    	ClassReport CR = new ClassReport();
    	System.out.print("How many student's data would you like to enter? ");
    	int cnt=sc.nextInt();
    	sc.nextLine();
    	Student[] students = CR.StudentArray(cnt);
    	CR.StudentArray2(students);
                
        }
        
}