package Person;

public class Nurse extends Person
{
    protected String WorkXP;
    public Nurse(String name, String family, int ID, String phone, int age, String gender,String WorkXP) {
        super(name, family, ID, phone, age, gender);
        this.WorkXP=WorkXP;
    }
}
