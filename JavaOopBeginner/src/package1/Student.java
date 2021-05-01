package package1;

public class Student extends User {

	private String[] selectedCourses;
	private String notes;
	
	
	
	
	public String[] getSelectedCourses() {
		return selectedCourses;
	}
	public void setSelectedCourses(String[]  selectedCourses) {
		
		this.selectedCourses = selectedCourses;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	
	
	
}
