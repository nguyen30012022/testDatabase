/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

import dao.TestidDao;
import dto.DataTranferObject;
import entities.Testid;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author tinh.nuguen
 */
@Stateless
public class TestidLogic {
  @Inject
    private TestidDao testidDao;
  
    public DataTranferObject findInf(){
        DataTranferObject indexPageDto = new DataTranferObject();
        indexPageDto.setTestid(testidDao.findAll());
        return indexPageDto;    
    }  

    public void editInf_p(Testid c){
        this.testidDao.edit(c); 
    } 
    public void deleteInf_p(Testid c){
        testidDao.remove(c);
    }
        public void addInf_p(Testid c){
        this.testidDao.create(c); 
    }


}
