package Assignments;

import java.util.Scanner;

public class StudentManagementSystem 
{	
	
		Snode students;
	
		void create_list()
		{
			students = null;
		}
	
		void insert_record(int rollno, String name, char gender)
		{
			Snode s = new Snode(rollno, name, gender);
			
			if(students == null) 
				students = s;
			else
			{
				Snode t = students;
				while(t.next!=null)
					t = t.next;
				t.next = s;	
			}
			System.out.println(s+" record inserted in list");
		}
	
		void print_list()
		{
			if(students==null)
			{
				System.out.println("List empty");
			}
			else
			{
				Snode t = students;
				while(t!=null)
				{
					System.out.println(t);
					t= t.next;
				}
			}
			
		}
		
		void search_list(int rollno)
		{
			if(students==null)
			{
				System.out.println("List empty");
			}
			else
			{
				Snode t = students;
				while(t!=null)
				{
					if(t.rollno == rollno)
					{
						System.out.println("Found in list");
		                 break;
					}
					t= t.next;
				}
				if(t==null)
					System.out.println("Not found in list");
				
			}		
		}
		
		void update_record(int rollno)
		{
			
			if(students==null)
			{
				System.out.println("List empty");
			}
			else
			{
				Snode t = students;
				while(t!=null)
				{
					if(t.rollno == rollno)
					{
						System.out.println(t+ " --- Found in list");
						
						Scanner in = new Scanner(System.in);
						System.out.println("Enter new Name: ");
			            String newName = in.nextLine();
			            
			            System.out.println("Enter new Gender: ");
			            char newGender = in.next().charAt(0);
			            in.nextLine();
				        if (t != null) {
				            t.name = newName;
				            t.gender = newGender;
				            System.out.println("Student record updated.");
				            break;
				        } 
		                 
					}
					t= t.next;
				}
				if(t==null)
					System.out.println("Not found in list");	
			}	
			
		}
		
		void delete_key(int rollno)
		{
			if(students==null)
			{
				System.out.println("Record list empty");
			}
			else
			{
				Snode t = students;
				Snode t2 = students;
				while(t!=null)
				{
					if(t.rollno == rollno)
					{
						System.out.println("Record found");
						break;
					}
					t2=t;
					t= t.next;
				}
				 if(t==null)
		                System.out.println("Not found in list");
		            else //found and check for case
		            {
		                if(t==students)//case 1
		                	students=students.next;
		                else if(t.next==null)//case 2
		                    t2.next=null;
		                else//case 3
		                    t2.next=t.next;
		                System.out.println(t.rollno+" deleted from list");
		            }
			}	
		}
		
		
}
