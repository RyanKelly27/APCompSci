import java.util.ArrayList;

public class Student {

	private boolean gender;
	private int id;
	private String name;
	private int grade;
	private double gpa;
	private ArrayList<String> schedule;
	private String dateOfBirth;
	private String address;
	private int phone;
	private String email;
	private String gradDate;
	private double credits;
	private ArrayList<Integer> scoresACT;
	private ArrayList<Integer> scoresSAT;
	private ArrayList<String> coursesTaken;
	
	public Student(boolean studentGender, int studentID, String studentName, int studentGrade, double studentGPA, ArrayList<String> studentSchedule, 
			String studentDOB, String studentAddress, int studentPhone, String studentEmail, String studentGradDate, double studentCredits, 
			ArrayList<Integer> studentScoresACT, ArrayList<Integer> studentScoresSAT, ArrayList<String> studentCoursesTaken)
	{
		gender = studentGender;
		id = studentID;
		name = studentName;
		grade = studentGrade;
		gpa = studentGPA;
		schedule = studentSchedule;
		dateOfBirth = studentDOB;
		address = studentAddress;
		phone = studentPhone;
		email = studentEmail;
		gradDate = studentGradDate;
		credits = studentCredits;
		scoresACT = studentScoresACT;
		scoresSAT = studentScoresSAT;
		coursesTaken = studentCoursesTaken;
	}

	public String getGender() {
		if(gender == true)
			return "Male";
		return "Female";
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public ArrayList<String> getSchedule() {
		return schedule;
	}

	public void setSchedule(ArrayList<String> schedule) {
		this.schedule = schedule;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGradDate() {
		return gradDate;
	}

	public void setGradDate(String gradDate) {
		this.gradDate = gradDate;
	}

	public double getCredits() {
		return credits;
	}

	public void setCredits(double credits) {
		this.credits = credits;
	}

	public ArrayList<Integer> getScoresACT() {
		return scoresACT;
	}

	public void setScoresACT(ArrayList<Integer> scoresACT) {
		this.scoresACT = scoresACT;
	}

	public ArrayList<Integer> getScoresSAT() {
		return scoresSAT;
	}

	public void setScoresSAT(ArrayList<Integer> scoresSAT) {
		this.scoresSAT = scoresSAT;
	}

	public ArrayList<String> getCoursesTaken() {
		return coursesTaken;
	}

	public void setCoursesTaken(ArrayList<String> coursesTaken) {
		this.coursesTaken = coursesTaken;
	}
	
	public static void main(String[] args)
	{
		ArrayList<String> roryCourses = new ArrayList();
		roryCourses.add("Early Release");
		ArrayList<Integer> roryACTScores = new ArrayList();
		roryACTScores.add(2);
		ArrayList<Integer> rorySATScores = new ArrayList();
		rorySATScores.add(1601);
		ArrayList<String> roryCoursesTaken = new ArrayList();
		roryCoursesTaken.add("Late Arrival");
		Student rory = new Student(true, 0, "Rory Gilli-Whatever", 8, 4.20, roryCourses, "April 20, 2017", "1234 Generic St", 1234567890, "roryissocool@gmail.com", "2000", 27.0, roryACTScores, rorySATScores, roryCoursesTaken);
		
		ArrayList<String> sinnamonCourses = new ArrayList();
		sinnamonCourses.add("Global Gourmet");
		ArrayList<Integer> sinnamonACTScores = new ArrayList();
		sinnamonACTScores.add(36);
		ArrayList<Integer> sinnamonSATScores = new ArrayList();
		sinnamonSATScores.add(1599);
		ArrayList<String> sinnamonCoursesTaken = new ArrayList();
		sinnamonCoursesTaken.add("Algebra");
		Student sinnamon = new Student(false, 27, "Sinnamon Robot Sasha", 1, 3.65, sinnamonCourses, "January, 27, 1997", "2345 Generic St.", 1876054321, "sinnamoniscoolerthansasha@gmail.com", "2017", 36.0, sinnamonACTScores, sinnamonSATScores, sinnamonCoursesTaken);
		
		
		System.out.println(rory.getGender());
		System.out.println(rory.getId());
		System.out.println(rory.getName());
		System.out.println(rory.getGrade());
		System.out.println(rory.getGpa());
		System.out.println(rory.getSchedule());
		System.out.println(rory.getDateOfBirth());
		System.out.println(rory.getAddress());
		System.out.println(rory.getPhone());
		System.out.println(rory.getEmail());
		System.out.println(rory.getGradDate());
		System.out.println(rory.getCredits());
		System.out.println(rory.getScoresACT());
		System.out.println(rory.getScoresSAT());
		System.out.println(rory.getCoursesTaken());
		
		System.out.println("\n");
		
		System.out.println(sinnamon.getGender());
		System.out.println(sinnamon.getId());
		System.out.println(sinnamon.getName());
		System.out.println(sinnamon.getGrade());
		System.out.println(sinnamon.getGpa());
		System.out.println(sinnamon.getSchedule());
		System.out.println(sinnamon.getDateOfBirth());
		System.out.println(sinnamon.getAddress());
		System.out.println(sinnamon.getPhone());
		System.out.println(sinnamon.getEmail());
		System.out.println(sinnamon.getGradDate());
		System.out.println(sinnamon.getCredits());
		System.out.println(sinnamon.getScoresACT());
		System.out.println(sinnamon.getScoresSAT());
		System.out.println(sinnamon.getCoursesTaken());
		
		
	}
	
}
