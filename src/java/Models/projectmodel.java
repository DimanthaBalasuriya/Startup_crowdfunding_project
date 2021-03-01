/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author CASSIE
 */
public class projectmodel {

    private String pID;
    private String pTitle;
    private String pDescription;
    private String pShow;
    private String pIntrest;

    public projectmodel(String pID, String pTitle, String pDescription, String pShow, String pIntrest) {
        this.pID = pID;
        this.pTitle = pTitle;
        this.pDescription = pDescription;
        this.pShow = pShow;
        this.pIntrest = pIntrest;
    }

    public String getpID() {
        return pID;
    }

    public void setpID(String pID) {
        this.pID = pID;
    }

    public String getpTitle() {
        return pTitle;
    }

    public void setpTitle(String pTitle) {
        this.pTitle = pTitle;
    }

    public String getpDescription() {
        return pDescription;
    }

    public void setpDescription(String pDescription) {
        this.pDescription = pDescription;
    }

    public String getpShow() {
        return pShow;
    }

    public void setpShow(String pShow) {
        this.pShow = pShow;
    }

    public void setpIntrest(String pIntrest) {
        this.pIntrest = pIntrest;
    }

    public String getpIntrest() {
        return pIntrest;
    }

}
