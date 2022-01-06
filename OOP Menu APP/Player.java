public class Player{
    
private String name;
private String position;
private String specialty;



//constructor
public Player(String name, String position, String specialty) {                                                                                          
    this.name = name;
    this.position = position;
    this.specialty = specialty;
}
    public void describe() {
        System.out.println("Player: " + name + " Position: " + position + " Specialty: " + specialty);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return this.position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getSpecialty() {
        return this.specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
   
   
    
}



