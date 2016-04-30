import java.util.HashMap;

public class Main {
public static void main(String[] args) {
	Student studentA = new Student("George", "Washington", 23);
	Student studentB = new Student("John", "Adams", 25);
	Student studentC = new Student("Thomas", "Jefferson", 27);
	Student[] course1 = {studentA, studentB};
	Student[] course2 = {studentA,studentB,studentC};
	Integer output = getIntersection(course1,course2);
	System.out.println(output);
}
private static Integer getIntersection(Student[] course1, Student[] course2) {
	HashMap<Student,Integer> intersectionMap = new HashMap<>();
	for(int i=0;i<course1.length;i++){
		intersectionMap.put(course1[i], 1);
	}
	for(int j=0;j<course2.length;j++){
		intersectionMap.put(course2[j], 1);
	}
	return ((course1.length+course2.length)-intersectionMap.size());
}
}
