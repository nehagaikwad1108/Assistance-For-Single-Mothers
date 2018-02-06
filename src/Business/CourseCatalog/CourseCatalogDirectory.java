/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.CourseCatalog;

import Business.CourseCatalog.CourseCatalog;
import java.util.ArrayList;

/**
 *
 * @author NEHA
 */
public class CourseCatalogDirectory {
    private ArrayList<CourseCatalog> courseCatalogList;
    public CourseCatalogDirectory()
            {
     courseCatalogList = new ArrayList<>();
 }

    public ArrayList<CourseCatalog> getCourseCatalogList() {
        return courseCatalogList;
    }

    public CourseCatalog addCourseCatalog(String courseCatalogName,String courseType,int bugdet){
        CourseCatalog courseCatalog = new CourseCatalog();
        courseCatalog.setCourseCategory(courseType);
        courseCatalog.setBudget(bugdet);
        courseCatalog.setCourseName(courseCatalogName);
        courseCatalogList.add(courseCatalog);
        return courseCatalog;
    }
 
}
