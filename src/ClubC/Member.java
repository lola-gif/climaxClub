package ClubC;

public class Member {
    String firstName;
    String lastName;
    String DOB;
    String nationality;
    String gender;
    int age;


    public Member(String firstName, String lastName, String DOB, String gender, String nationality,
                  int age) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.DOB = DOB;
        this.nationality = nationality;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDOB() {
        return DOB;
    }
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;

    }
    public int indexOf (Member p) {
        //TODO Auto-generated method stub
        return 0;
    }
}


