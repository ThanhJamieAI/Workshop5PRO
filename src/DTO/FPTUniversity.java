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
public class FPTUniversity extends University implements Role {

	private String address ;

	//Constructor

    public FPTUniversity() {
        super(null);
    }
        


	public FPTUniversity(int size, String name, String address) {
		super(name, size);
		this.address = address;
	}

	
	//Getter & setter

	public String getPlace() {
		return this.address;
	}

	public void setPlace(String address) {
		this.address = address;
	}
	
	//Method
	
	@Override
	public void createWorker() {
		System.out.println("Providing human resources");
	}

	public String toString() {
		return ("FPTU has four campuses Hanoi, HCM, DaNang, CanTho, QuyNhon"); 
	}
		
}
