import java.util.ArrayList;

public class PersonFactory {

    private ArrayList<Person> allPersons;

    public PersonFactory() {
        allPersons = new ArrayList<>();
    }
    public void addPerson(Person person) {
        int i = 0;
        for(Person p : allPersons){
            if(person.getLastName(). compareTo(p.getLastName()) < 0){
                break;
            }
            i++;
        }
        allPersons.add(i, person);
    }
    public ArrayList<Person> under18() {
        ArrayList<Person> under18List = new ArrayList<>();
        for (Person p : allPersons){
            if(p.getAge() < 18){
                under18List.add(p);
            }
        }
        return under18List;
    }
    public boolean checkLastName(String lastName) {
        for (Person p : allPersons) {
            if (p.getLastName().equals(lastName)) {
                return true;
            }
        }
        return false;
    }
}
