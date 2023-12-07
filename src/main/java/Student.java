    // Implement your Student class here

import java.util.Date;

public class Student extends User{


    private static int idSeed = 10000;
    
    private StudyCourse degree;


    private static String degreeDescriptions[] = new String[] {
            "Mechanical Engineering, B.Sc.", 
            "Mechatronic Systems Engineering, B.Sc.",
            "Electrical and Electronics Engineering, B.Sc.",
            "Industrial Engineering, B.Sc.",
            "Biomaterials Science, B.Sc.",
            "Science Communication and Bionics, B.A./B.Sc.",
            "Mechanical Engineering, M.Sc.",
            "Bionics, M.Sc."
    };


    private Student(){
        
    }

    Student(String name, String familyName){
        super(String.valueOf(idSeed++), name, familyName);
    }

    Student(String name, String familyName, Date date){
        super(String.valueOf(idSeed++), name, familyName, date);
    }

    public StudyCourse getDegree(){
        return this.degree;
    }

    public String getDegreeDescription(){

        if(this.degree == null){
            return "No course assigned";
        }

        return degreeDescriptions[this.degree.ordinal()];
    }

    public void setDegree(StudyCourse degree){
        this.degree = degree;
    }   
    
    public void setDegree(String degree){
        
       this.degree = StudyCourse.valueOf(degree);

    }


}
