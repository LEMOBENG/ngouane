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
public class Enseignant extends Contact {
     private String statut;
	
    public Enseignant(String code,String nom,Date dateNaissance,String address,String email,String telNumber,String statut) {
            super(code,nom,dateNaissance,address,email,telNumber);
            this.statut=statut;
    }
	
    public String getStatut() {
            return statut;
    }
	
    public void setStatut(String statut) {
            this.statut=statut;
    }
	/*
    @Override
    public void insererContact(Connection connection) {
            //inserer les donnees de l enseignant dans la table Enseignant de la base de donnees
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
    


    

