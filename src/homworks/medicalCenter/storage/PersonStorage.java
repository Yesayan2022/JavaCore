package homworks.medicalCenter.storage;

import homworks.medicalCenter.model.Doctor;
import homworks.medicalCenter.model.Patient;
import homworks.medicalCenter.model.Person;
import homworks.medicalCenter.util.DateUtil;

import java.util.Date;

public class PersonStorage {
    private Person[] persons = new Person[10];
    private int size;

    public void add(Person person) {
        if (persons.length == size) {
            extend();
        }
        persons[size++] = person;
    }


    public void printDoctors() {
        for (int i = 0; i < size; i++) {
            Person person = persons[i];
            if (person instanceof Doctor) {
                System.out.println(person);
            }
        }
    }

    public void searchDoctorByProfession(String profession) {
        for (int i = 0; i < size; i++) {
            Person person = persons[i];
            if (person instanceof Doctor) {
                Doctor doctor = (Doctor) person;
                if (doctor.getProfession().equals(profession)) {
                    System.out.println(doctor);
                }
            }
        }
    }

    public void deleteDoctorById(String id) {
        for (int i = 0; i < size; i++) {
            Person person = persons[i];
            if (person.getId().equals(id)
                    && person instanceof Doctor) {
                deleteByIndex(i);
            }
        }
    }


    public Doctor getDoctorById(String id) {
        for (int i = 0; i < size; i++) {
            Person person = persons[i];
            if (person.getId().equals(id) &&
                    person instanceof Doctor) {
                return (Doctor) person;
            }
        }
        return null;
    }

    public void printAllPatientByDoctor(Doctor doctor) {
        for (int i = 0; i < size; i++) {
            Person person = persons[i];
            if (person instanceof Patient) {
                Patient patient = (Patient) person;
                if (patient.getDoctor().equals(doctor)) {
                    System.out.println(patient);
                }
            }
        }
    }

    public void printTodaysPatients() {
        Date today = new Date();
        for (int i = 0; i < size; i++) {
            if (persons[i] instanceof Patient) {
                Patient patient = (Patient) persons[i];
                if (DateUtil.isSameDay(today, patient.getRegisterdate())) {
                    System.out.println(patient);
                }

            }
        }

    }

    private void deleteByIndex(int i) {
        for (int j = i; j < size; j++) {
            persons[j] = persons[j + 1];
        }
        size--;
    }

    private void extend() {
        Person[] tmp = new Person[persons.length + 10];
        System.arraycopy(persons, 0, tmp, 0, persons.length);
        persons = tmp;
    }

    public boolean isDoctorAvailable(Doctor doctor, Date registerDate) {
        for (int i = 0; i < size; i++) {
            Person person = persons[i];
            if (person instanceof Patient) {
                Patient patient = (Patient) person;
                if (patient.getDoctor().equals(doctor) &&
                        patient.getRegisterdate().equals(registerDate)) {
                    return false;
                }
            }
        }
        return true;
    }
}
