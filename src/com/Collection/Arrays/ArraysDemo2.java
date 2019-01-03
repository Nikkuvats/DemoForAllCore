package com.Collection.Arrays;

class Teacher {
	
	String name;
	String subject;
	
	Teacher(String name, String subject) {
	
		this.name = name;
		this.subject = subject;
	}
}

class Student {
	
	String name;
	int rollno;
	
	Student(String name, int rollno) {
	this.name = name;
	this.rollno = rollno;	
	}

	public Student() {
		
	}
}

class ArraysDemo2 {
	public static String college = "Uttar Pradesh Technical University";
	
	public static void main(String[] args) {
	
		
		Teacher[] teachers = new Teacher[5];
		teachers[0] = new Teacher("Rajesh", "Computer Science");
		teachers[1] = new Teacher("Durga", "Programming");
		teachers[2] = new Teacher("Kumar", "Electical");
		teachers[3] = new Teacher("Chetan", "History");
		teachers[4] = new Teacher("Mandeep", "Math");
	
	//  teachers[4] = new Teacher("Mandeep", "Math"); RE: Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 
		
		for (int i = 0; i < teachers.length; i++) {
			System.out.println("Name : " + teachers[i].name + " Subject :  " + teachers[i].subject + " College : " + college);
		}
		
		
		Student[] students = new Student[5];
		students[0] = new Student("Anant", 12121);
		students[1] = new Student("Aayush", 12122);
		students[2] = new Student("Nikku", 12123);
		students[3] = new Student("Shivam", 12124);
		students[4] = new Student("Vinay",12125);
		
	//	students[5] = new Student("Austerlia", 21216);  RE: Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException:
		
		for (int i = 0; i < students.length; i++) {
			System.out.println("Name : " + students[i].name + " RollNo :  " + students[i].rollno + " College : " + college);
		}
	
	//	Homogeneous data element issue we can solve by the help of object Array
		
		Object[] objects = new Object[2];
		objects[0] = new Student("Anant",23231);
		objects[1] = new Teacher("Durga", "ComputerScience");
		
		for (int i = 0; i < objects.length; i++) {
			
			System.out.println(objects[i].getClass().getName().length());
		}		
	}
}