
package student;

public class Student {

    public static void main(String[] args) {
        char[] myWorld = new char[7];
        myWorld[0]='s';
        myWorld[1]='t';
        myWorld[2]='u';
        myWorld[3]='d';
        myWorld[4]='e';
        myWorld[5]='n';
        myWorld[6]='t';
        
        for(int i =0 ;i<myWorld.length;i++){
        System.out.print(myWorld[i]);
        }
        
        System.out.println(" ");
        
         System.out.print("Reversed order : ");
        for(int i = myWorld.length-1 ;i>=0;i--){
        System.out.println(myWorld[i]);
        }
    }

  
  
    
}
