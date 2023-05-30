package Person;

import Person.Person;

import java.util.Scanner;

public class Doctor extends Person
{
    Scanner sc=new Scanner(System.in);
    private String Certificate;
    private boolean Office;
    private String Address;



    public Doctor(String name, String family, int ID, String phone, int age, String gender,String certificate,boolean office) {
        super(name, family, ID, phone, age, gender);
        Certificate=certificate;
        if (office==true)
        {
            System.out.println("Please Enter Your Office Address");
            String address=sc.nextLine();
            Address=address;
        }
        else
        {
         Address="-";
        }
    }

    public String getCertificate() {
        return Certificate;
    }

    public boolean isOffice() {
        return Office;
    }

    public String getAddress() {
        return Address;
    }
}
