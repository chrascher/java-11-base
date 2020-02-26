package at.cgsit.training.examples.simpleflow.helper;

import at.cgsit.training.examples.simpleflow.dto.PersonDTO;

import java.util.ArrayList;
import java.util.List;

public class PersonFactoryHelper {

    public static List<PersonDTO> getPersons() {

      PersonDTO e1 = new PersonDTO(1, "David");
      PersonDTO e2 = new PersonDTO(2, "Chris");
      PersonDTO e3 = new PersonDTO(3, "Doris");
      PersonDTO e4 = new PersonDTO(4, "Hermann");
      PersonDTO e5 = new PersonDTO(5, "Max");

      List<PersonDTO> persons = new ArrayList<>();
      persons.add(e1);
      persons.add(e2);
      persons.add(e3);
      persons.add(e4);
      persons.add(e5);

      for(int i = 6; i<300; i++) {
          persons.add( new PersonDTO(i, "dfdf"));
      }

      return persons;
    }
  }


