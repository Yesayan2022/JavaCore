package homework.medicalCenter.model;

import java.util.Objects;

public class Patient extends Person{
    private Doctor doctor;
    private String registerdate;

    public Patient(String id, String name, String surename, String email, String phone, Doctor doctor, String registerdate) {
        super(id, name, surename, email, phone);
        this.doctor = doctor;
        this.registerdate = registerdate;
    }

    public Patient() {
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public String getRegisterdate() {
        return registerdate;
    }

    public void setRegisterdate(String registerdate) {
        this.registerdate = registerdate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Patient patient = (Patient) o;

        if (!Objects.equals(doctor, patient.doctor)) return false;
        return Objects.equals(registerdate, patient.registerdate);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (doctor != null ? doctor.hashCode() : 0);
        result = 31 * result + (registerdate != null ? registerdate.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "doctor=" + doctor +
                ", registerdate='" + registerdate + '\'' +
                '}';
    }
}
