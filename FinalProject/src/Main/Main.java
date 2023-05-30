package Main;


import Clinic.Clinic;

public class Main {
    public static void main(String[] args)
    {
        Clinic parsKhazar=new Clinic("ParsKhazar");
        parsKhazar.RegisterDoctor("Ali","Rezaee","09366014436",23,"Male","Master",false);
        parsKhazar.RegisterPatients("Ali","Rezaee","09366014436",23,"Male","Estefragh",false);

        parsKhazar.DoctorInfoWhitId(1);
        parsKhazar.PatientInfoWhitId(1);

    }
}