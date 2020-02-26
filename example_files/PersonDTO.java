package at.cgsit.training.examples.simpleflow.dto;

public class PersonDTO {

    private int id;

    private String name;

  public PersonDTO(int i, String s) {
    this.id = i;
    this.name = s;
  }

  public PersonDTO() {
  }


    public int getId() {
      return id;
    }
    public void setId(int id) {
      this.id = id;
    }
    public String getName() {
      return name;
    }
    public void setName(String name) {
      this.name = name;
    }

    @Override
    public String toString() {
      return "[id="+id+",name="+name+"]";
    }
  }
