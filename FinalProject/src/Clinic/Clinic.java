package Clinic;

import Person.Doctor;
import Person.Nurse;
import Person.Patient;

import java.util.ArrayList;

public class Clinic
{
    static int i=0;
    public static String ClinicName;
    ArrayList<Doctor> doctors;
    ArrayList<Patient> patients;
    ArrayList<Nurse> nurses;

    public Clinic(String clinicName)
    {
        ClinicName=clinicName;
    }

    public Doctor RegisterDoctor(String name, String family, String phone, int age, String gender,String certificate,boolean office)
    {
        doctors=new ArrayList<>();
        i=i+1;
        Doctor doctor=new Doctor(name, family, i, phone, age, gender, certificate,office);
        doctors.add(doctor);
        return doctor;
    }


    public Patient RegisterPatients(String name, String family, String phone, int age, String gender,String Sickness,boolean PreviousIllness)
    {
        patients=new ArrayList<>();
        i=i+1;
        Patient patient=new Patient(name, family, i, phone, age, gender, Sickness, PreviousIllness);
        patients.add(patient);
        return patient;
    }

    //public Nurse RegisterNurse...


    public String DoctorInfoWhitId(int i)
    {
        for (int a=0;a<doctors.size();a++)
        {
            if (i==doctors.get(a).getID())
            {
                System.out.println("Name :"+doctors.get(a).getName()+"\t"+"Family :"+doctors.get(a).getFamily()
                +"\t"+"Phone :"+doctors.get(a).getPhone()+"\t"+"Age :"+doctors.get(a).getAge()+"\t"+"Certificate :"+doctors.get(a).getCertificate()+
                "\t"+"Office :"+doctors.get(a).isOffice()+"\t"+"Office Address :"+doctors.get(a).getAddress());
            }
        }
        return null;
    }

    public String PatientInfoWhitId(int i)
    {
        for (int a=0;a<patients.size();a++)
        {
            if (i==doctors.get(a).getID())
            {
                System.out.println("Name :"+patients.get(a).getName()+"\t"+"Family :"+patients.get(a).getFamily()
                        +"\t"+"Phone :"+patients.get(a).getPhone()+"\t"+"Age :"+patients.get(a).getAge()+"\t"+"Sickness :"+patients.get(a).getSickness()
                        +"\t"+ "PreviousIllness ="+patients.get(a).isPreviousIllness()+"\t"+"previousIllness :"+patients.get(a).getPreviousIllness());
            }
        }
        return null;
    }
}
