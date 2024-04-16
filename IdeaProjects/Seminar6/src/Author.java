//Ushtrimi 4.
//Krijoni klasen Author, qe permban
//o fusha private name, email dhe gender
//o metodat get dhe set per keto fusha.
public class Author {
    private String name;
    private String email;
    private String gender;

    public Author(String name, String email, String gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public String getGender(){
        return gender;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setGender(){
        this.gender = gender;
    }
}
