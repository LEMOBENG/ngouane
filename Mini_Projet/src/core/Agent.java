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
public class Agent extends Contact{
    private double salaire;
    private String statut;
    private String categorie;
    private int indiceSalaire;
    private String occupation;
	
    public Agent(String code,String nom,Date dateNaissance,String address,String email,String telNumber,double salaire,String statut,String categorie,int indiceSalaire,String occupation) {
            super(code,nom,dateNaissance,address,email,telNumber);
            this.salaire=salaire;
            this.statut=statut;
            this.categorie=categorie;
            this.indiceSalaire=indiceSalaire;
            this.occupation=occupation;
    }
	
    public double getSalaire() {
            return salaire;
    }
	
    public void setSalaire(double salaire) {
            this.salaire=salaire;
    }
	
    public String getStatut() {
            return statut;
    }
	
    public void setStatut(String statut) {
            this.statut=statut;
    }
	
    public String getCategorie() {
            return categorie;
    }
	
    public void setCategorie(String categorie) {
            this.categorie=categorie;
    }
	
    public int getIndiceSalaire() {
            return indiceSalaire;
    }
	
    public void setIndiceSalaire(int indiceSalaire) {
            this.indiceSalaire=indiceSalaire;
    }
	
    public String getOccupation() {
            return occupation;
    }
	
    public void setOccupation(String occupation) {
            this.occupation=occupation;
    }
	
   /* @Override
	
    public void insererContact(Connection connection) {
            //inserer les donnees de l agent dans la table Agent de la base de donnees
            try{
                String sql="INSERT INTO etudiant(code,nom,dateNaissance,address,email,telNumber,cycle,niveau) VALUES()";
                PreparedStatement statement=connection.prepareStatement(sql);
                statement.setString(1,this.getCode());
                statement.setString(2,this.getNom());
                statement.setDate(3,(java.sql.Date) this.getDateNaissance());
                statement.setString(4,this.getAddress());
                statement.setString(5,this.getEmail());
                statement.setString(6,this.getTelNumber());
                statement.executeUpdate();   
            }catch(SQLException e){
                e.printStackTrace();
            }
    }*/


}


