/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedBeans;

import java.awt.event.ActionEvent;
import javax.annotation.ManagedBean;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

/**
 *
 * @author Zhang
 */
@Named(value = "testManagedBean")
@ManagedBean
@ApplicationScoped
public class TestManagedBean {
    
    private String unchangedValue = "This is unchanged";
    
    private String changedValue = "This should change";
    
    private String formInput = "";

    /**
     * Creates a new instance of TestManagedBean
     */
    public TestManagedBean() {
    }
    
    public void updateBean() {
        System.out.println("Updated Value!");
        //Do something;
        this.changedValue = this.formInput;
        this.formInput = "";
    }

    public String getUnchangedValue() {
        return unchangedValue;
    }

    public void setUnchangedValue(String unchangedValue) {
        this.unchangedValue = unchangedValue;
    }

    public String getChangedValue() {
        return changedValue;
    }

    public void setChangedValue(String changedValue) {
        this.changedValue = changedValue;
    }

    public String getFormInput() {
        return formInput;
    }

    public void setFormInput(String formInput) {
        this.formInput = formInput;
    }
    
    
    
}
