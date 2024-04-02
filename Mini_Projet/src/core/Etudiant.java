/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

/**
 *
 * @author HP
 */
public class Etudiant extends Contact{
    private String cycle;
    private String niveau;
    public Etudiant(String code,String nom,Date dateNaissance,String address,String email,String telNumber,String cycle,String niveau) {
            super(code,nom,dateNaissance,address,email,telNumber);
            this.cycle=cycle;
            this.niveau=niveau;
    }
	
    public String getCycle() {
            return cycle;
    }
	
    public void setCycle(String cycle) {
            this.cycle=cycle;
    }
	
    public String getNiveau() {
            return niveau;
    }
	
    public void setNiveau(String niveau) {
            this.niveau=niveau;
    }
	/*
    @Override
    public void insererContact(Connection connection) {
            //inserer les donnees de l etudiant dans la table Etudiant de la base de donnees
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
    }
*/
   

}


    
    

