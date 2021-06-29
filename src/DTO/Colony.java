/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author GMT
 */
public class Colony extends Organization{
    private String place;

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }
    
    public Colony(){
        super();
        this.place  = "";
    }

    public Colony(String place, int size) {
        super(size);
        this.place = place;
    }
    @Override
    public void communicateByTool(){
        System.out.println("The colony communicate by sound");
    }
    public void grow(){
        System.out.println("An annual cycle of growth that begin in string");
    }
    public void reproduce(){
        System.out.println("Colony can reproduce itself through a process");
    }
    public String toString(){
        return ("The colony size is "+this.getSize() + ", the colony place is:"+this.getPlace());
    }
}
