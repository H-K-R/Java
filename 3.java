//Inheritance in Java Programming
 
class Person
{
	String name;
}
 
class Teacher extends Person 
{
	String course;
 
	Teacher(){
 
	}
	Teacher(String nm, String cs){
		name=nm;
		course=cs;
	}
 
	void print(){
		System.out.println("I am a Teacher");
		System.out.println("Name: "+name);
		System.out.println("My Course: "+course);
	}
}
class Student extends Person
{
	int id;
 
	Student(){
 
	}
	Student(String nm, int n){
		name=nm;
		id=n;
	}
 
	void print(){
		System.out.println("I am a Student");
		System.out.println("Name: "+name);
		System.out.println("My ID: "+id);
	}
 
	public static void main(String args[])
	{
		Student s = new Student("Yeahia Sarker", 10005);
		Teacher t = new Teacher("Abir Hasan", "CSE 123");
 
		s.print();
		t.print();
	}
}