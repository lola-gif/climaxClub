package ClubC;

import java.time.LocalDate;

class teamPlayers extends Member {

    boolean teamPlayers;

    public void setTeamPlayers(boolean teamPlayers) {
        this.teamPlayers = teamPlayers;
    }
    public boolean getTeamPlayer() {
        return teamPlayers;
    }
    String firstName;
    String lastName;
    String gender;
    String nationality;
    LocalDate DOB;
    int age;

    public teamPlayers(String firstName, String lastName, String gender, String nationality, String DOB, int age) {
        super(firstName,lastName,gender, nationality, DOB, age);
    }
}
