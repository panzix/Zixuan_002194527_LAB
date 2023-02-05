/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.util.ArrayList;
/**
 *
 * @author Panzi
 */
public class VitalSignHistory {
    ArrayList<Observation> vitalSignHistory;
    

    public VitalSignHistory(){
        this.vitalSignHistory = new ArrayList<Observation>();
    }

    public ArrayList<Observation> getVitalSignHistory() {
        return vitalSignHistory;
    }

    public void setVitalSignHistory(ArrayList<Observation> vitalSignHistory) {
        this.vitalSignHistory = vitalSignHistory;
    }

    public Observation findObservation(int id){
        for(Observation o : this.vitalSignHistory){
           if(o.getObservationId()==id){
               return o;
           }
        }
        return null;
    }

    // not used
    public void removeObservation(int id){
        for(Observation o : this.vitalSignHistory){
           if(o.getObservationId()==id){
               this.vitalSignHistory.remove(o);
               break;
           }
        }
    }

    public Observation createObservation(int observationId, double bloodPressure, double temperature){
        Observation observation = new Observation();

        observation.setObservationId(observationId);
        observation.setBloodPressure(bloodPressure);
        observation.setTemperature(temperature);

        this.vitalSignHistory.add(observation);
        return observation;
    }

    public boolean checkObservationIdUnique(int id){
        //validate unique
        for(Observation o : this.vitalSignHistory){
             if(o.getObservationId() == id){
                 return false;
             }
        }
        return true;
    }
}
