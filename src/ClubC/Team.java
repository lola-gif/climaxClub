package ClubC;

import java.util.ArrayList;
import java.util.Scanner;

public class Team {
    public static ArrayList<Member>  members;
    public static ArrayList<Member> getMembers() {
        return members;
    }
    public static void main (String[] args){
    members = new ArrayList<Member>();
    members.add(new Member("Julie", "Trimnell", "05/05/1990", "Female", "British" ,29));
    members.add(new Member("June", "Tracy", "10/05/1991", "Female","British", 28));
    members.add(new Member("Henry", "Alexander", "14/04/1991", "Male","British", 28));
    members.add(new Member("Carol", "Alexander", "14/06/1991", "Female","British", 28));
    members.add(new Member("Rose", "Henley", "12/06/1993", "Female","British", 26));
    members.add(new Member("Steven", "Clucth", "14/06/1991", "Male","British", 28));
    members.add(new Member("Carol", "Gary", "23/06/1987", "Female","British", 32));
    members.add(new Member("Janet", "Leer", "27/06/1991", "Female","British", 28));
    members.add(new Member("Dave", "Hope", "30/01/1985", "Male","British", 34));
    members.add(new Member("Faith", "Ramos", "27/06/1991", "Female","British",28));
    members.add(new Member("Grace", "Neburago", "31/08/1985", "Female","British",34));
    members.add(new Member("Richard", "Nettle", "17/06/2001", "Male","British",18));
    members.add(new Member("Celia", "Alexander", "22/07/1981", "Female","British", 38));
    members.add(new Member("Mark", "Leary", "14/06/1993", "Male","Irish",26));
    members.add(new Member("Adam", "Housely", "18/06/1994", "Male","Irish", 25));
    members.add(new Member("Ann", "Whitaker", "26/06/1990", "Female","British", 29));
    members.add(new Member("Lola", "Triumph", "12/07/1985", "Female","British", 34));
    members.add(new Member("Graham", "Bragg", "20/06/1980", "Male","British",39));
    members.add(new Member("Max", "Paul", "14/06/1994", "Male","British", 25));
    members.add(new Member("Luke", "Harriman", "21/06/1996", "Male","British", 27));
    members.add(new Member("Karl", "Max", "20/06/1995", "Male","British", 24));
    members.add(new Member("Luke", "Stone", "21/06/1994", "Male","British", 25));
    members.add(new Member("Luke", "Hendrix", "30/06/1990", "Male","British", 29));
    members.add(new Member("John", "Harris", "21/06/1996", "Male","British", 23));
    members.add(new Member("Dave", "Kettle", "13/06/1992", "Male","British", 27));
    members.add(new Member("Karen", "Love", "28/06/1985", "Female","British", 34));
    members.add(new Member("Chris", "Glory", "11/06/1982", "Male","British",37));
    members.add(new Member("Enid", "Blthe", "23/05/1996", "Female","British", 37));
    members.add(new Member("Fred", "Lock", "21/06/1996", "Male","British", 27));
    members.add(new Member("Gen", "Rest", "21/06/1995", "Female","British", 24));
    members.add(new Member("Romeo", "Juliet", "21/11/1996", "Female","British", 27));
    members.add(new Member("Winy", "Hot", "21/06/1996", "Female","British", 23));
    members.add(new Member("Folu", "Great", "21/06/1996", "Female","British",  23));
    members.add(new Member("Ola", "Dube", "21/06/1996", "Male","British", 23));
    members.add(new Member("Rosey", "Thorne", "21/06/1999", "Female","British",20));

    int x = 1;
    do {
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("What type of team will you like ?");
            System.out.println("Enter 'M'(for Male over 25) or 'm' (for male under 25)");
            System.out.println("Enter 'F' (for FEMALE over 25) or 'f' (for female under 25)");
            System.out.println("Enter 'X' (for MIXED over 25) or 'x' (for mixed under 25)");
            String typeOfTeam = input.nextLine();
            System.out.println("Numbers of people in the team ? ");
            int teamSize = input.nextInt();

            TeamMembers team = new TeamMembers();
            x = 2;
            if (typeOfTeam.contentEquals("M") ||
                    typeOfTeam.contentEquals("m") ||
                    typeOfTeam.contentEquals("F") ||
                    typeOfTeam.contentEquals("f") ||
                    typeOfTeam.contentEquals("X") ||
                    typeOfTeam.contentEquals("x")) {
                try {
                    team.createTeam(typeOfTeam, teamSize);
                } catch (Exception e) {
                    System.out.println("There are not enough members available to create a team of " + teamSize);
                    System.out.println("Please retry");
                    System.out.println();
                    x = 1;
                }
            } else {
                System.out.println("Invalid team option please enter valid option !");
                System.out.println();
                x = 1;
            }
        } catch (Exception e) {
            System.out.println("Please enter  number of team");
            System.out.println();
        }
    }
    while (x == 1);
        }
    }



