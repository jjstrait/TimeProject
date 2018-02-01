/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timeproject;

/**
 *
 * @author jstra
 */
public class TimeService {
    private String firstTime;
    private String secondTime;
    
    public TimeService(String firstTime, String secondTime){
        setFirstTime(firstTime);
        setSecondTime(secondTime);
    }
    
    public String getDifferanceInTime() throws Exception{
        String[] firstParts = splitTime(firstTime);
        String[] secondParts = splitTime(secondTime);
        
        int hourDiff = (Integer.parseInt(firstParts[0]) - Integer.parseInt(secondParts[0]));
        int minDiff = (Integer.parseInt(firstParts[1]) - Integer.parseInt(secondParts[1]));
        if(hourDiff<0){
        hourDiff = hourDiff *-1;
        }
        if(Integer.parseInt(firstParts[1])<Integer.parseInt(secondParts[1])){
            minDiff = 60+minDiff;
            hourDiff-=1;
        }
        
        
        
        if(minDiff < 10){
        return hourDiff + ":0" + minDiff; 
        }
        
        return hourDiff + ":" + minDiff; 
    }
    
    
    
    
    public String[] splitTime(String time) throws Exception,NullPointerException{
        
        if(!time.contains(":")){
            throw new Exception("Time did not contain ':'");
        }
         String[] parts = time.split(":");
        
        if(parts[0].trim().length() == 0){
            throw new NullPointerException("Invalid time: Hours null");
        }
        if(parts[1].trim().length() == 0){
            throw new NullPointerException("Invalid time: Minutes null");
        }
        
        return parts;
    }

    public String getFirstTime() {
        return firstTime;
    }

    public void setFirstTime(String firstTime) throws NullPointerException{
        if(firstTime == null || firstTime.trim().length() == 0){
            throw new NullPointerException("Invalid time: Time is null");
        }
        //splitTime(firstTime);

        this.firstTime = firstTime;
    }

    public String getSecondTime() {
        return secondTime;
    }

    public void setSecondTime(String secondTime) throws NullPointerException {
        if(secondTime == null || secondTime.trim().length() == 0){
            throw new NullPointerException("Invalid time: Time is null");
        }
        this.secondTime = secondTime;
    }
    
    
    
    
}
