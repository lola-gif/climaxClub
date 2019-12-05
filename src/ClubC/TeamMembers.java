package ClubC;

import java.util.ArrayList;

public class TeamMembers {
    private ArrayList<Member> tango = new ArrayList<>();

    public void createTeam(String typeOfTeam, int teamSize) {
        ArrayList<Member> memb = Team.getMembers();

        boolean x = true;
        int i = 0;

        switch (typeOfTeam) {
            case "M":

                while (x) {

                    if (memb.get(i).getGender() == ("Male") &&
                            memb.get(i).getAge() > 25) {
                        teamPlayers player = new
                                teamPlayers(memb.get(i).getFirstName(), memb.get(i).getLastName(), memb.get(i).getGender(),
                                memb.get(i).getNationality(), memb.get(i).getDOB(), memb.get(i).getAge());
                        tango.add(player);
                        i++;
                        if (teamSize == tango.size()) {
                            x = false;

                        }
                    } else {
                        i++;
                    }
                }
            case "m":
                while (x) {

                    if (memb.get(i).getGender() == ("Male") &&
                            memb.get(i).getAge() < 26) {
                        teamPlayers player = new
                                teamPlayers(memb.get(i).getFirstName(), memb.get(i).getLastName(), memb.get(i).getGender(),
                                memb.get(i).getNationality(), memb.get(i).getDOB(), memb.get(i).getAge());
                        tango.add(player);
                        i++;

                        if (teamSize == tango.size()) {
                            x = false;
                        }

                    } else {
                        i++;
                    }

                }
            case "F":
                while (x) {
                    if (memb.get(i).getGender() == ("Female") &&
                            memb.get(i).getAge() < 26) {
                        teamPlayers player = new
                                teamPlayers(memb.get(i).getFirstName(), memb.get(i).getLastName(), memb.get(i).getGender(),
                                memb.get(i).getNationality(), memb.get(i).getDOB(), memb.get(i).getAge());
                        tango.add(player);
                        i++;
                        if (teamSize == tango.size()) {
                            x = false;

                        }
                    } else {
                        i++;
                    }
                }
            case "f":
                while (x) {
                    if (memb.get(i).getGender() == ("Female") &&
                            memb.get(i).getAge() < 26) {
                        teamPlayers player = new
                                teamPlayers(memb.get(i).getFirstName(), memb.get(i).getLastName(), memb.get(i).getGender(),
                                memb.get(i).getNationality(), memb.get(i).getDOB(), memb.get(i).getAge());
                        tango.add(player);
                        i++;
                        if (teamSize == tango.size()) {
                            x = false;

                        }
                    } else {
                        i++;
                    }
                }
            case "X":
                while (x) {
                    if (memb.get(i).getGender().contains("ale") &&
                            memb.get(i).getAge() > 25) {
                        teamPlayers player = new
                                teamPlayers(memb.get(i).getFirstName(), memb.get(i).getLastName(), memb.get(i).getGender(),
                                memb.get(i).getNationality(), memb.get(i).getDOB(), memb.get(i).getAge());
                        tango.add(player);
                        i++;
                        if (teamSize == tango.size()) {
                            x = false;
                        }
                    } else {
                        i++;
                    }
                }
            case "x":
                while (x) {
                    if (memb.get(i).getGender().contains("ale") &&
                            memb.get(i).getAge() > 25) {
                        teamPlayers player = new
                                teamPlayers(memb.get(i).getFirstName(), memb.get(i).getLastName(), memb.get(i).getGender(),
                                memb.get(i).getNationality(), memb.get(i).getDOB(), memb.get(i).getAge());
                        tango.add(player);
                        i++;
                        if (teamSize == tango.size()) {
                            x = false;
                        }
                    } else {
                        i++;
                    }
                }
        }
        System.out.println("Team members are:");
            String cName = "";
            int newmax = 0;
            for (Member p : tango) {
                System.out.println(p.getFirstName()+" "+ p.getLastName()+" "+ p.getGender()+ " " +p.getAge());
                int max = p.getAge();
                if (max > newmax) {

                    cName = p.getFirstName(

                    ) + " "+p.getLastName();
                    newmax = max;

                }

            }
            System.out.println("The coach for this team is " + cName);

        }
    }





