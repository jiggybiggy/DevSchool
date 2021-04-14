package ch.bbw.filestreaming;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class PersonReader {
    private List<Person> personList;

    public PersonReader(){
        personList = new ArrayList<>();

        ClassLoader classLoader = getClass().getClassLoader();
        try {

            BufferedReader bufferedReader = new BufferedReader(
                    new InputStreamReader(
                            classLoader.getResourceAsStream("persons.csv")
                    )
            );

            bufferedReader.readLine(); //erste Zeile überlesen
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] attributes = line.split(";");

                Person person = new Person();
                person.setId( Integer.parseInt(attributes[0]));
                person.setFirstname((attributes[1]));
                person.setLastname((attributes[2]));
                person.setYearOfBirth((attributes[3]));
                person.setCity((attributes[4]));

                System.out.println(line);
            }

            bufferedReader.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public List<Person> getAllPersons() {return persons;}

    public static void main(String[] args) {
        PersonReader personReader = new PersonReader();

    }
}
