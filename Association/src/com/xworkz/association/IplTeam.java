package com.xworkz.association;

class IplTeam {
	
    String name = "IIIIIII";
    int establishedYear;
    String homeVenue;
    String captain;
   
    Franchise franchise = new Franchise("Cricket", 2002, "Banglore", "KingFisher");

    public static void main(String[] args) {
        System.out.println("Running main.....");
        
        IplTeam team1 = new IplTeam("RCB", 2008, "Chinnasawamy Stadium", "Virat Kohli");
        IplTeam team2 = new IplTeam("CSK", 2008, "Chidambaram Stadium", "MS Dhoni");
        team1.printInfo();
        team2.printInfo();
    }

    IplTeam(String name, int establishedYear, String homeVenue, String captain) 
    {
        this.name = name;
        this.establishedYear = establishedYear;
        this.homeVenue = homeVenue;
        this.captain = captain;
    }

    void printInfo() {
        System.out.println("IPL Team Name: " + name);
        System.out.println("Established Year: " + establishedYear);
        System.out.println("Home Venue: " + homeVenue);
        System.out.println("Captain: " + captain);
        franchise.printInfo();
    }
}
