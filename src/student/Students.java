


package student;
/*
Date:Jan 25, 2022
Author:Divya Srinivasan

*/
public class Students {
    private String studentId;
    private String studentName;
    private String address;


public Students(String studentId, String studentName){
     this.studentId = studentId;
     this.studentName = studentName;
     }   

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

}
