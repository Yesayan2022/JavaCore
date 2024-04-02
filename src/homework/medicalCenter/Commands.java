package homework.medicalCenter;

public interface Commands {
    String Exit = "0";
    String Add_Doctor = "1";
    String Search_Doctor_By_Profession = "2";
    String Delete_Doctor_By_Id = "3";
    String Change_Doctor_By_Id = "4";
    String Add_Patient = "5";
    String Print_All_Patients_By_Doctor = "6";
    String Print_Todays_Patients = "7";

    static void printCommands() {
        System.out.println("Please input " + Exit + " for ");
        System.out.println("Please input " + Add_Doctor + " for Add_Doctor");
        System.out.println("Please input " + Search_Doctor_By_Profession + " for Search_Doctor_By_Profession");
        System.out.println("Please input " + Delete_Doctor_By_Id + " for Delete_Doctor_By_Id");
        System.out.println("Please input " + Change_Doctor_By_Id + " for Change_Doctor_By_Id");
        System.out.println("Please input " + Add_Patient + " for Add_Patient");
        System.out.println("Please input " + Print_All_Patients_By_Doctor + " for Print_All_Patients_By_Doctor");
        System.out.println("Please input " + Print_Todays_Patients + " for Print_Todays_Patients");

    }

}
