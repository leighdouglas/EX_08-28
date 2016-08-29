package nyc.c4q.leighdouglas;

public class Student {

    public static void main(String[] args){

    }

    private String firstName;
    private String lastName;
    private int idNumber;
    private String threeFavoriteFoods;

    public void student(){
        firstName = "First Name";
        lastName = "Last Name";
        idNumber = 0000;
        threeFavoriteFoods = "First food, Second food, Third food"; //default constructor
    }

    public void student(String a, String b){
        firstName = a;
        lastName = b;
    }

    public void student(String a, String b, int c){
        firstName = a;
        lastName = b;
        idNumber = c;
    }

    public void student(String a, String b, int c, String d){
        firstName = a;
        lastName = b;
        idNumber = c;
        threeFavoriteFoods = d;
    }
    void setStudentFirstName(String studentFirstName){
        firstName = studentFirstName;
    }
    void setStudentLastName(String studentLastName){
        lastName = studentLastName;
    }
    void setStudentIDNum(int studentIDNum){
        idNumber = studentIDNum;
    }
    void setStudentFavFoods(String studentFavFoods){
        threeFavoriteFoods = studentFavFoods;
    }
    public String getStudentFirstName(){
        return firstName;
    }

    public String getStudentLastName(){
        return lastName;
    }

    public int getStudentIDNum(){
        return idNumber;
    }

    public String getStudentFavFoods(){
        return threeFavoriteFoods;
    }

}
