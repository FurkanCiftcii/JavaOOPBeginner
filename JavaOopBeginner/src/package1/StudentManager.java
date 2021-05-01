package package1;

public class StudentManager extends UserManager {
	
	
	
	
	public void addNotes(Student student,String notes ) {
		
		student.setNotes(notes);
		System.out.println(student.getNotes()+"this message");
		
	}
	
	public void addCourse(Student user,String[]courses) {
		
		user.setSelectedCourses(courses);
		
	}
	
	

}
