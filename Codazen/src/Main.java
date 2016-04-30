import java.util.HashMap;

//Tested for all combinations of students A,B,C given in the sheet. Just add a scanner or buffer read to get user input.
//One Assumption: Same student will not be repeated in Array.
//Time Complexity I think will be O(size of largest array), not sure though, just verify, Space Complexity I don't know how to find.
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
