import java.util.Date;

public class User {
    
    private String id;
    private String familyName;
    private String name;

    private Date birthday;

    private Domain domain;

    protected User(){
        
        if (this instanceof Professor) {
            this.domain = Domain.STAFF;
        } else if (this instanceof Student) {
            this.domain = Domain.STUDENT;
        }
    }
    protected User(String id, String name, String familyName){
        this();
        this.id = id;
        this.name = name;
        this.familyName = familyName;
    }
    protected User(String id, String name, String familyName, Date date){
        this(id, name, familyName);
        this.birthday = date;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getFamilyName(){
        return this.familyName;
    }  

    public void setFamilyName(String familyName){
        this.familyName = familyName;
    }

    public String getID() {
        return id;
    }

    public Date getBirthday(){
        return this.birthday;
    }

    public void setBirthday(Date birthday){
        this.birthday = birthday;
    }

    public Domain getDomain(){
        return this.domain;
    }

    public String getFQUN(){
        return this.id + "@" + this.domain.toString().toLowerCase()+".hsrw";
    }

    public String getEmail(){
        
        String email = this.name + "." + this.familyName + "@";
        switch (this.domain) {
            case STUDENT:
                email+="hsrw.org";
                break;
            case STAFF:
                email+="hochschule-rhein-waal.de";
                break;
            default:
                email+="error.org";
                break;
        }
        return email;
    }

}
