/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Mother;

import java.util.ArrayList;

/**
 *
 * @author nupur
 */
public class ChildDirectory {
    private ArrayList<Child> childList;
 public ChildDirectory(){
     childList = new ArrayList<>();
 }

    public ArrayList<Child> getChildList() {
        return childList;
    }

   
  public Child addChild(String name,int age,String cn,int cAge, int weight){
      Child child = new Child(name,age,cn,cAge,weight);
      child.setName(name);
      child.setAge(age);
      child.setBabyName(cn);
      child.setBabyAge(cAge);
      child.setBabyWeight(weight);
     childList.add(child);
      return child;
  } 
}
