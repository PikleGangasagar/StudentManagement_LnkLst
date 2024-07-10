package Assignments;

import java.util.Scanner;
public class StudentManagementSystemMain {

	public static void main(String[] args) 
	{
		int ch,e;
		Scanner in = new Scanner(System.in);
        StudentManagementSystem obj = new StudentManagementSystem();
        
        obj.create_list();//user given size :list
        do {
            System.out.println("\nStudent List\n-----\n1.Insert records\n2.Delete by rollno\n3.Search by rollno\n4.Update record\n5.Print\n0.Exit\n:");
            ch = in.nextInt();
            switch (ch) {
            
                case 1:
                    
                    System.out.println("Enter roll no.: ");
                    int rollno = in.nextInt();
                    in.nextLine();
                    
                    System.out.println("Enter name: ");
                    String name = in.nextLine();
                    
                    System.out.println("Enter gender: ");
                    char gender = in.next().trim().charAt(0);
                    in.nextLine();
                   
                    obj.insert_record(rollno, name, gender);
                    break;
                case 2:
                    System.out.println("Enter rollno to delete: ");
                    e = in.nextInt();
                    obj.delete_key(e);
                    break;
                case 3:
                	 System.out.println("Search rollno: ");
                     e = in.nextInt();
                     obj.search_list(e);
                    break;
                case 4:
                	System.out.println("Enter roll no.: ");
                	e = in.nextInt();
                	obj.update_record(e);
                case 5:
                    obj.print_list();
                    break;
                case 0:
                    System.out.println("Exiting.....");
                    break;
                default:
                    System.out.println("Wrong option selected");
                    break;
            }
        } while (ch != 0);
    }
}

