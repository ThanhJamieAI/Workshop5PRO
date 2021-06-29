/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author GMT
 */
import DTO.*;
     
public class Tester {
    public static void main(String[] args) {
        Colony obj1 = new BeeColony(2000, "honey", "land");
        System.out.println("____________________");
        System.out.println(obj1);
        obj1.grow();
        obj1.reproduce();
        
        University obj2 = new FPTUniversity(100000, "FPT", "CanTho");
        System.out.println("____________________");
        System.out.println(obj2);
        obj2.enroll();
        obj2.educate();
        
        Role obj3 = new BeeColony(300, "wasp", "land");
        System.out.println("____________________");
        System.out.println(obj3);
        obj3.createWorker();

        University df = new FPTUniversity(1000000, "FPT", "HCM");
        System.out.println("____________________");
        System.out.println(df);
        df.enroll();
        df.educate();
    }
}
