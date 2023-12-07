import java.util.Date;

public class Professor extends User {
    
    private Faculty faculty = Faculty.TUB;
    private Campus campus= Campus.KLE;
    private int phone = 0;  

    private Professor(){

    }
    public Professor(String id,String name, String familyName){
        super(id, name, familyName);
    }

    public Professor(String id, String name, String familyName, Date date){
        super(id, name, familyName, date);
    }

    public void setFaculty(Faculty faculty){
        this.faculty = faculty;

        switch (this.faculty) {
            case TUB:
            case LS:
            case GO:
                this.campus = Campus.KLE;
                break;
            case KU:
                this.campus = Campus.KL;
                break;
            default:
                break;
        }
    }  

    public Faculty getFaculty(){
        return this.faculty;
    }

    public String getFacultyString(){

        String facultyString = "";

        switch(this.faculty){
            case TUB:
                facultyString = "Technology and Bionics";
                break;
            case LS:
                facultyString = "Life Sciences";
                break;
            case GO:
                facultyString = "Society and Economics";
                break;
            case KU:
                facultyString = "Communication and Environment";
                break;
        }
        return facultyString;
    }

    public void setPhone(int phone){
        this.phone = phone;
    }

    public String getPhone(){
        String phone = "";
        switch (this.campus) {
            case KLE:
                phone = "+49 2821 806 73 " + this.phone;
                break;
            case KL:
                phone = "+49 2842 908 " + this.phone;
                break;
            default:
                break;
        }
        return phone;
    }

}
