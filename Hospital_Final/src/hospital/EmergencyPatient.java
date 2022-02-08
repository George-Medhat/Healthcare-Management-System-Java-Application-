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
public class EmergencyPatient extends Patient {
    
        public EmergencyPatient(){
            super();
}
        
        public EmergencyPatient(String Name, String ID,String Address, String Number,  boolean Gender, String Symptoms, boolean PaymentMethod,String Diagnosis){
        super(Name,  ID, Address,  Number,  Gender,  Symptoms,  PaymentMethod, Diagnosis, true) ;
    }

}
