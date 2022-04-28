/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package web.vew;

import entities.Testid;
import java.io.Serializable;
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
@Named(value = "IndexBackingBean")
//@SessionScoped
 @ViewScoped
public class IndexBackingBean implements Serializable {

    @Inject
    private TestidLogic testidLogic;
   
    private Testid m = new Testid ();



    public Testid getM() {
        return m;
    }

    public void setM(Testid m) {
        this.m = m;
    }
  


    
     public List<Testid> find_m(){
            return testidLogic.findInf().getTestid();
    }



      public String pullValuesFromFlash_m(Testid m) {      
        Flash flash = FacesContext.getCurrentInstance().getExternalContext().getFlash();
        flash.put("msg1", m);
        return "/testid/edit_p";
    }
}
