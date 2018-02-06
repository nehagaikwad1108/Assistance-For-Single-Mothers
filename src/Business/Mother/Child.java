/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Mother;

/**
 *
 * @author nupur
 */
public class Child extends Mother{
    private String babyName;
    private int babyAge;
    private int babyWeight;

   
    public Child(String name,int age,String babyName,int babyAge,int babyWeight) {
        super(name,age);
      this.babyAge=babyAge;
      this.babyName=babyName;
      this.babyWeight=babyWeight;
        
    }
    public int getBabyWeight() {
        return babyWeight;
    }

    public void setBabyWeight(int babyWeight) {
        this.babyWeight = babyWeight;
    }
    public String getBabyName() {
        return babyName;
    }

    public void setBabyName(String babyName) {
        this.babyName = babyName;
    }

    public int getBabyAge() {
        return babyAge;
    }

    public void setBabyAge(int babyAge) {
        this.babyAge = babyAge;
    }
    
}
