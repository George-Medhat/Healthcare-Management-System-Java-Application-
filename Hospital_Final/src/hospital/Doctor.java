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
public class Doctor {
    private String Name;
    private String ID;
    private String Address;
    private String Number;
    private String Speciality;
    private static int DoctorNo=0;
    private static String[] DoctorArray = new String[100];
    
    public Doctor(){
        
    }
    public Doctor(String Name, String ID,String Address, String Number, String Speciality){
        this.Name = Name;
        this.ID = ID;
        this.Address = Address;
        this.Speciality = Speciality;
        this.Number = Number;
        
        DoctorArray[DoctorNo]= new String(this.Name);
        DoctorNo=DoctorNo+1;
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
    public void SetSpeciality(String Speciality){
        this.Speciality = Speciality;
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
    public String getSpeciality(){
        return Speciality ;
    }
    public static void PrintDoctors(){
        
        System.out.println("Number of Doctors In Hospital :  " + DoctorNo);
        for(int i=1; i <= DoctorNo; i++){
   
        
        System.out.println("Doctor Name " + (i) + " is  " + DoctorArray[i-1]);
       
        }
         System.out.println("/////////////////////////////////////////////////////////////////////////////");
    }
    public static void Delete(int D){
        
        DoctorArray[D-1]= null;
        
        for(int i=(D);(i<DoctorNo);i++){
     
       DoctorArray[i-1]=DoctorArray[i];
       
       
        }
        DoctorNo=DoctorNo-1; 
        
    }
}
