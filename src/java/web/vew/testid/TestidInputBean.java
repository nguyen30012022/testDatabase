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
@Named(value = "TestidInputBean")
 @ViewScoped
public class TestidInputBean implements Serializable {

        @Inject
      
    private TestidLogic testidLogic;
   
    private Testid c = new Testid ();

    public TestidLogic getTestidLogic() {
        return testidLogic;
    }

    public void setTestidLogic(TestidLogic testidLogic) {
        this.testidLogic = testidLogic;
    }

    public Testid getC() {
        return c;
    }

    public void setC(Testid c) {
        this.c = c;
    }

  
  
    public String pullValuesFromFlash() {      
        Flash flash = FacesContext.getCurrentInstance().getExternalContext().getFlash();
        flash.put("msg", c);
//        this.productLogic.addInf_p(this.c);
        return "/testid/confirm_p";

    }
        public String deleteInf_p() {
        this.testidLogic.deleteInf_p(c);
        return "/index";
    }
}