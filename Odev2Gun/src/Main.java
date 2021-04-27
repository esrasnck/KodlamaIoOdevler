
public class Main {

	public static void main(String[] args) {
	
		Course course = new Course();
		course.id =1;
		course.name ="C# ve Angular";
		course.teacherName="Engin Demirog";
		
		Course course1 = new Course();
		course1.id =2;
		course1.name="Java ve React";
		course1.teacherName="Engin Demirog";
		
		
		Course[] courses = {course, course1};
		
		for (Course course3 : courses) {
			System.out.println("kurs adı : " + course3.name + "Eğitmen Adı : " + course3.teacherName);
		}
		
		System.out.println("------------------------------------------------------------------------");
		
		
		CourseManager courseManager = new CourseManager();
		
		courseManager.add(course);
		courseManager.delete(course1);
		
		System.out.println("------------------------------------------------------------------------");
		
		
		Student student = new Student(1,"Esra","Sancak","esrasancak@gmail.com","1234");
		
		Student student1 = new Student();
		student1.firstName ="Kübram";
		student1.lastName ="Terzi";
		student1.email ="canimKubram@gmail.com";
		student1.passWord= "1234";
		
	    
		Student [] students = {student,student1};
		for (Student student2 : students) {
			
			System.out.println(student2.firstName + " isimli " + student2.lastName +  " soyadlı ");
			
		}
		
		System.out.println("------------------------------------------------------------------------");
		
		
		Teacher teacher = new Teacher(1,"Engin","Demirog","Microsoft Certified Trainer");
		
		System.out.println("Egitmen : " + teacher.firstName + " " + teacher.lastName + " | Unvani : " + teacher.title );
		
		System.out.println("------------------------------------------------------------------------");
	}

}
