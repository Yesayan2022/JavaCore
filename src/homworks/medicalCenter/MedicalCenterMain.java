package homworks.medicalCenter;

import homworks.medicalCenter.model.Doctor;
import homworks.medicalCenter.model.Patient;
import homworks.medicalCenter.storage.PersonStorage;
import homworks.medicalCenter.util.DateUtil;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class MedicalCenterMain implements Commands {

    private static Scanner scanner = new Scanner(System.in);
    private static PersonStorage personStorage = new PersonStorage();

    public static void main(String[] args) throws ParseException {
        boolean IsRun = true;

        while (IsRun) {
            printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case Exit:
                    IsRun = false;
                    break;
                case Add_Doctor:
                    addDoctor();
                    break;
                case Search_Doctor_By_Profession:
                    searchDoctorByProfession();
                    break;
                case Delete_Doctor_By_Id:
                    deleteDoctorById();
                    break;
                case Change_Doctor_By_Id:
                    changeDoctorById();
                    break;
                case Add_Patient:
                    addPatient();
                    break;
                case Print_All_Patients_By_Doctor:
                    printAllPatientsByDoctor();
                    break;
                case Print_Todays_Patients:
                    personStorage.printTodaysPatients();
                    break;
                default:
                    System.out.println("Wrong command!");
            }
        }
    }

    private static void printAllPatientsByDoctor() {
        personStorage.printDoctors();
        System.out.println("Please choose doctor id");
        String doctorId = scanner.nextLine();
        Doctor doctorById = personStorage.getDoctorById(doctorId);
        if (doctorById != null){
            personStorage.printAllPatientByDoctor(doctorById);
        } else {
            System.out.println("doctor with " + doctorId+ "Does not exist!");

        }
    }

    private static void addPatient() throws ParseException {
        personStorage.printDoctors();
        System.out.println("Please choose doctor id");
        String doctorId = scanner.nextLine();
        Doctor doctorById = personStorage.getDoctorById(doctorId);
        if (doctorById != null) {
            System.out.println("Please input id,name,surname,phone,registerDate(29-11-2023 20:00)");
            String patientDataStr = scanner.nextLine();
            String[] patientData = patientDataStr.split(",");
            try {
                Date registerDate = DateUtil.stringToDateTime(patientData[4]);
                if (personStorage.isDoctorAvailable(doctorById, registerDate)) {

                    Patient patient = new Patient();
                    patient.setId(patientData[0]);
                    patient.setName(patientData[1]);
                    patient.setSurname(patientData[2]);
                    patient.setPhone(patientData[3]);
                    patient.setDoctor(doctorById);
                    patient.setRegisterdate(patient.getRegisterdate());
                    personStorage.add(patient);
                    System.out.println("Patient registered!");
                } else {
                    System.out.println("doctor is unavailable in that time,please choose another time.");
                }
            } catch (ParseException e) {
                System.out.println("Incorrect date time format, please try again.");
            }
        } else {
            System.out.println("doctor with " + doctorId+ "Does not exist!");
        }

    }

    private static void changeDoctorById() {
        personStorage.printDoctors();
        System.out.println("Please change doctor  id");
        String doctorId = scanner.nextLine();
        Doctor doctorById = personStorage.getDoctorById(doctorId);
        if (doctorById != null) {
            System.out.println("Please input name,surnaem,phone,email,profession");
            String doctorDateStr = scanner.nextLine();
            String[] doctorData = doctorDateStr.split(",");
            doctorById.setName(doctorData[0]);
            doctorById.setSurname(doctorData[1]);
            doctorById.setPhone(doctorData[2]);
            doctorById.setEmail(doctorData[3]);
            doctorById.setProfession(doctorData[4]);
            System.out.println("Doctor changed");

        } else {
            System.out.println("doctor with " + doctorId + "does not exist.");
        }
    }

    private static void deleteDoctorById() {
        personStorage.printDoctors();
        System.out.println("Please change doctor  id");
        String doctorId = scanner.nextLine();
        Doctor doctorById = personStorage.getDoctorById(doctorId);
        if (doctorById != null) {
            personStorage.deleteDoctorById(doctorId);
        } else {
            System.out.println("doctor with " + doctorId + "does not exist.");
        }
    }

    private static void searchDoctorByProfession() {
        System.out.println("Please input profession");
        String profession = scanner.nextLine();
        personStorage.searchDoctorByProfession(profession);
    }


    private static void addDoctor() {
        System.out.println("Please input Doctor Id,name,surnaem,phone,email,profession");
        String doctorDateStr = scanner.nextLine();
        String[] doctorData = doctorDateStr.split(",");
        String doctorId = doctorData[0];
        Doctor doctorById = personStorage.getDoctorById(doctorId);
        if (doctorById == null) {
            Doctor doctor = new Doctor();
            doctor.setId(doctorId);
            doctor.setName(doctorData[1]);
            doctor.setSurname(doctorData[2]);
            doctor.setPhone(doctorData[3]);
            doctor.setEmail(doctorData[4]);
            doctor.setProfession(doctorData[5]);
            personStorage.add(doctor);
            System.out.println("Doctor added");
        } else {
            System.out.println("doctor with " + doctorId + " already exist");
        }
    }

    private static void printCommands() {
        System.out.println("Please input 0 for exit");
        System.out.println("Please input 1 for Add_Doctor");
        System.out.println("Please input 2 for Search_Docrot_By_Profession");
        System.out.println("Please input 3 for Delet_Doctor_By_ID");
        System.out.println("Please input 4 for Change_docotor_By_ID");
        System.out.println("Please input 5 for Add_Patient");
        System.out.println("Please input 6 for Print_All_Patient_By_Docotor");
        System.out.println("Please input 7 for Print_All_Patinents");
    }
}
