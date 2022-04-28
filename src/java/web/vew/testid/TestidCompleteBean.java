/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package web.vew.testid;

import entities.Testid;
import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.context.Flash;
import javax.inject.Inject;
import javax.inject.Named;
import logic.TestidLogic;

/**
 *
 * @author tinh.nuguen
 */
@Named(value = "TestidCompleteBean")
@SessionScoped
public class TestidCompleteBean implements Serializable{
    @Inject
      
    private TestidLogic testidLogic;

    private Testid m = new Testid ();

    public Testid getM() {
        return m;
    }

    public void setM(Testid m) {
        this.m = m;
    }
     
    public String addInf_p(){
        Flash flash = FacesContext.getCurrentInstance().getExternalContext().getFlash();

        this.m = (Testid)flash.get("msg");
               
        this.testidLogic.addInf_p(this.m);
        return "complete_p";
    } 
    
    
}

