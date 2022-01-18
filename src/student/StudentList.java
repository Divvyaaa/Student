
package student;
public class StudentList {
     public static void main(String[] args) {
     Students[] studentList = new Students[4];
     
     studentList[0]= new Students("s1","A");
     studentList[1]= new Students("s2","B");
     studentList[2]= new Students("s3","C");
    
     for(int i=0;i<studentList.length;i++){
System.out.println(studentList[i].getStudentId());
System.out.println(studentList[i].getStudentName());

System.out.println(" ");
}
}
 }