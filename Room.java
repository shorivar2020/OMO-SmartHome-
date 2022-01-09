import java.util.ArrayList;
import java.util.List;

public class Room {
    private String name;
    private List<Device> devices = new ArrayList<>();
    private List<Person> people = new ArrayList<>();
    private List<Pet> pets = new ArrayList<>();

    public List<Person> getPeople() {
        return people;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public List<Device> getDevices() {
        return devices;
    }

    public Room addPerson(Person person){
        peple.add(person);
        return this;
    }

    public Room addPet(Pet pet){
        pets.add(pet);
        return this;
    }

    public void removePerson(Person person){
        people.remove(person);
    }

    public void removePet(Pet pet){
        pets.remove(pet);
    }
}