/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package web.vew.testid;

import entities.Testid;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.context.FacesContext;
import javax.faces.context.Flash;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import logic.TestidLogic;

/**
 *
 * @author tinh.nuguen
 */
@Named(value = "TestidConfirmBean")
 @ViewScoped
public class TestidConfirmBean implements Serializable {
           @Inject
      
    private TestidLogic testidLogic;
    private Testid m = new Testid ();
 

    public Testid getM() {
        return m;
    }

    public void setM(Testid m) {
        this.m = m;
    }
    

    public String getData() {
        Flash flash = FacesContext.getCurrentInstance().getExternalContext().getFlash();

        this.m = (Testid)flash.get("msg");
        return "/testid/confirm_p";
        
    }
//       public List<Testid> find_p(){
//        Flash flash = FacesContext.getCurrentInstance().getExternalContext().getFlash();
//
//        this.m = (Testid)flash.get("msg");
//            return testidLogic.findInf().getTestid();
//    } 
    public String deleteInf_p() {
        this.testidLogic.deleteInf_p(m);
        return "/testid/input";
    } 

}