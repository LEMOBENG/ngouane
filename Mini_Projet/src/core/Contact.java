/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

import java.util.Date;

/**
 *
 * @author HP
 */
public class Contact {
    private String code;
    private String nom;
    private Date dateNaissance;
    private String address;
    private String email;
    private String telNumber;
	
    public Contact(String code,String nom,Date dateNaissance,String address,String email,String telNumber) {
            this.code=code;
            this.nom=nom;
            this.dateNaissance=dateNaissance;
            this.address=address;
            this.email=email;
            this.telNumber=telNumber;
    }
	
    public String getCode() {
            return code;
    }
	
    public void setCode(String code) {
            this.code=code;
    }
	
    public String getNom() {
            return nom;
    }
	
    public void setNom(String nom) {
            this.nom=nom;
    }
	
    public Date getDateNaissance() {
            return dateNaissance;
    }
	
    public void setDateNaisance(Date dateNaissance) {
            this.dateNaissance=dateNaissance;
    }
	
    public String getAddress() {
            return address;
    }
	
    public void setAddress(String address) {
            this.address=address;
    }
	
    public String getEmail() {
            return email;
    }
	
    public void setEmail(String email) {
            this.email=email;
    }
	
    public String getTelNumber() {
            return telNumber;
    }
	
    public void setTelNumber(String telNumber) {
            this.telNumber=telNumber;
    }
    
    
    
	
	//Methode abstraite pour inserer un contact dans la base de donnees
	
    //public abstract void insererContact(Connection connection);


} 



    


    

