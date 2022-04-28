/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

import entities.Testid;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author tinh.nuguen
 */
public class DataTranferObject implements Serializable {

    private List<Testid> testid;

    public List<Testid> getTestid() {
        return testid;
    }

    public void setTestid(List<Testid> testid) {
        this.testid = testid;
    }




   
}


