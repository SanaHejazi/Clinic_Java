package Person;

import java.util.Scanner;

public class Patient extends Person
{
    protected String Sickness;
    Scanner sc=new Scanner(System.in);

    protected boolean PreviousIllness;
    protected String previousIllness;

    public Patient(String name, String family, int ID, String phone, int age, String gender,String Sickness,boolean PreviousIllness) {
        super(name, family, ID, phone, age, gender);
        this.Sickness=Sickness;
        if (PreviousIllness==true)
        {
            System.out.println("Please Enter Your Office illness");
            String illness=sc.nextLine();
            previousIllness=illness;
        }
        else
        {
            previousIllness="Nothing";
        }
    }

    public String getSickness() {
        return Sickness;
    }

    public boolean isPreviousIllness() {
        return PreviousIllness;
    }

    public String getPreviousIllness() {
        return previousIllness;
    }
}
