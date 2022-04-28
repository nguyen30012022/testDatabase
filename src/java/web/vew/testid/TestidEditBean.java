/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package web.vew.testid;

import entities.Testid;
import java.io.Serializable;
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
@Named(value = "TestidEditBean")
 @ViewScoped
public class TestidEditBean implements Serializable {

    @Inject

    private TestidLogic testLogic;
   
    private Testid m = new Testid ();

    public Testid getM() {
        return m;
    }

    public void setM(Testid m) {
        this.m = m;
    }
 
   

    public void  deleteInf_p(Testid m) {
        this.testLogic.deleteInf_p(m);
    } 

//    public String pullValuesFromFlash() {      
//        Flash flash = FacesContext.getCurrentInstance().getExternalContext().getFlash();
//        flash.put("msg", m);
//        return "/message/confirm_m";
//
//    }

    public void getData2(Testid m) {
        Flash flash = FacesContext.getCurrentInstance().getExternalContext().getFlash();

        this.m = (Testid)flash.get("msg1");
        
    }

            public String editInf_p(){
        Flash flash = FacesContext.getCurrentInstance().getExternalContext().getFlash();

        this.m = (Testid)flash.get("msg1");
        this.testLogic.editInf_p(this.m);
        return "/index";
    } 
}

