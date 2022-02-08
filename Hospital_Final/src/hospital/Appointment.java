/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

/**
 *
 * @author dell
 */

public class Appointment {
    private String DateOfApp;
    private Patient PatientOfApp;
    private Doctor DoctorOfApp;
    private static int AppointmentNo= 0;
    private static String[] DateOfAppArray = new String[100];
    private static String[] AppPatientsArray = new String[100];
    private static String[] AppDoctorsArray = new String[100];
    
    public Appointment(String DateOfApp,Patient PatientOfApp,Doctor DoctorOfApp) {

    this.DateOfApp=DateOfApp;
    this.PatientOfApp=PatientOfApp;
    this.DoctorOfApp=DoctorOfApp;
    DateOfAppArray[AppointmentNo]=this.DateOfApp;
    AppPatientsArray[AppointmentNo]=this.PatientOfApp.GetName();
    AppDoctorsArray[AppointmentNo]=this.DoctorOfApp.GetName();
    AppointmentNo=AppointmentNo+1;
    }
    
    public void SetDateOfApp(String DateOfApp){
    this.DateOfApp=DateOfApp;
    }
    
    public void SetPatientOfApp(Patient PatientOfApp){
    this.PatientOfApp=PatientOfApp;
    }
    
    public void SetDoctorOfApp(Doctor DoctorOfApp){
    this.DoctorOfApp=DoctorOfApp;
    }
    
    
    public String GetDateOfApp(){
    return(this.DateOfApp);
    }
    
    
    public Patient GetPatientOfApp(){
    return(this.PatientOfApp);
    }

    
    public Doctor GetDoctorOfApp(){
    return(this.DoctorOfApp);
    }
    
    public void PrintAppointment(){
    

        
    System.out.println("Date is   "  + DateOfApp);
    System.out.println("Patient Name is    "  + PatientOfApp.GetName());
    System.out.println("Doctor Name is    "  + DoctorOfApp.GetName());
    System.out.println("/////////////////////////////////////////////////////////////////////////////");

}
    
        public static void AllAppointmentsPrint(){
    
    System.out.println("Number of Appointments is   "  + AppointmentNo); 
    System.out.println("/////////////////////////////////////////////////////////////////////////////");
        for(int i=1;i<= AppointmentNo; i++){
                System.out.println("Appointment Number:    "  + i); 
    System.out.println("Date is   "  + DateOfAppArray[i-1]);
    System.out.println("Patient Name is    "  + AppPatientsArray[i-1]);
    System.out.println("Doctor Name is    "  + AppDoctorsArray[i-1]);
    System.out.println("/////////////////////////////////////////////////////////////////////////////");
        }
}
    
    
}
