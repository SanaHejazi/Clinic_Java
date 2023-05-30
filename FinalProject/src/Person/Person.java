package Person;
public class Person
{
    protected String Name;
    protected String Family;
    protected int ID;
    protected String Phone;
    protected int Age;
    protected String gender;
    public Person(String name, String family, int ID, String phone, int age, String gender) {
        Name = name;
        Family = family;
        this.ID = ID;
        Phone = phone;
        Age = age;
        this.gender = gender;
    }

    public String getName() {
        return Name;
    }

    public String getFamily() {
        return Family;
    }

    public int getID() {
        return ID;
    }

    public String getPhone() {
        return Phone;
    }

    public int getAge() {
        return Age;
    }

    public String getGender() {
        return gender;
    }
}
