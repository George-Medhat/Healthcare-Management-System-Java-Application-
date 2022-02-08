/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

/**
 *
 * @author Mohamed
 */
public abstract class Patient {
    private String Name;
    private String ID;
    private String Address;
    private String Number;
    private boolean Gender;
    private String Symptoms;
    private boolean PaymentMethod;
    private String Diagnosis;
    private boolean IsEmergency;
    private static int NormalPatientNo=0;
    private static String[] NormalPatientsArray = new String[100];
    private static int EmergencyPatientNo=0;
    private static String[] EmergencyPatientsArray = new String[100];
    
    public Patient(){}
    
    public Patient(String Name, String ID,String Address, String Number, 
            boolean Gender, String Symptoms, boolean PaymentMethod,
            String Diagnosis,boolean IsEmergency){
        this.Name = Name;
        this.ID = ID;
        this.Address = Address;
        this.Number = Number;
        this.Diagnosis = Diagnosis;
        this.Gender = Gender;
        this.Symptoms = Symptoms;
        this.IsEmergency = IsEmergency;
        this.PaymentMethod = PaymentMethod;
        if(IsEmergency==false )
        {
        NormalPatientsArray[NormalPatientNo]= this.Name;
        NormalPatientNo=NormalPatientNo+1;
        }
        else if (IsEmergency==true){
        EmergencyPatientsArray[EmergencyPatientNo]= this.Name;
        EmergencyPatientNo=EmergencyPatientNo+1;
        
        }
        
        
    }
    public void SetName(String Name){
        this.Name = Name;
    }
    public void SetAddress(String Address){
        this.Address = Address;
    }
    public void SetID(String ID){
        this.ID = ID;
    }
    public void SetNumber(String Number){
        this.Number = Number;
    }
    public void SetGender(boolean Gender){
        this.Gender = Gender;
    }
    public void SetSymptoms(String Symptoms){
        this.Symptoms = Symptoms;
    }
    public void SetPaymentMethod(boolean PaymentMethod){
        this.PaymentMethod = PaymentMethod;
    }
    public void SetDiagnosis(String Diagnosis){
        this.Diagnosis = Diagnosis;
    }
    public void SetIsEmergency(boolean IsEmergency){
        this.IsEmergency = IsEmergency;
    }
    
    public String GetName(){
        return Name ;
    }
    public String GetID(){
        return ID ;
    }
    public String GetAddress(){
        return Address ;
    }
    public String GetNumber(){
        return Number ;
    }
    public boolean GetGender(){
        return Gender ;
    }
    public String GetSymptoms(){
        return Symptoms ;
    }
    public boolean GetPaymentMethod(){
        return PaymentMethod ;
    } 
    public String GetDiagnosis(){
        return Diagnosis ;
    }
        public boolean GetIsEmergency(){
        return IsEmergency ;
        }
        
    public static void  PrintPatients(){ // abstract 
        
        System.out.println("Number of Normal Patients In Hospital :  " + NormalPatientNo);
        for(int i=1; i <= NormalPatientNo; i++){
   
        
        System.out.println("Patient Name " + (i) + " is  " + NormalPatientsArray[i-1]);
       
        }
        
        System.out.println("/////////////////////////////////////////////////////////////////////////////");
         
        System.out.println("Number of Emergency Patients In Hospital :  " + EmergencyPatientNo);
        for(int i=1; i <= EmergencyPatientNo; i++){
   
        
        System.out.println("Patient Name " + (i) + " is  " + EmergencyPatientsArray[i-1]);
       
        }
                 System.out.println("/////////////////////////////////////////////////////////////////////////////");
         
    }
    public static void Delete(int D, boolean EmergencyOrNormal){
        
        if(EmergencyOrNormal ==false)
        {

        
        NormalPatientsArray[D-1]= null;
        
        for(int i=(D);(i<NormalPatientNo);i++){
     
       NormalPatientsArray[i-1]=NormalPatientsArray[i];
       
       
        }
        NormalPatientNo=NormalPatientNo-1; 
        }
        
        else if (EmergencyOrNormal ==true) {
         EmergencyPatientsArray[D-1]= null;
        
        for(int i=(D);(i<EmergencyPatientNo);i++){
     
       EmergencyPatientsArray[i-1]=EmergencyPatientsArray[i];
       
       
        }
        EmergencyPatientNo=EmergencyPatientNo-1; 
        }
        
    }
  
}
