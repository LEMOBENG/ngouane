/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class Repertoire {
    private List<Contact> listeContacts;
	
    public Repertoire() {
            listeContacts=new ArrayList<>();
    }
	
    public void ajouterContact(Contact contact) {
            listeContacts.add(contact);
    }
	
    public void supprimerContact(Contact contact) {
            listeContacts.remove(contact);
    }
	
    public void modifierContact(Contact contact) {
            //modifier les donnees du contact dans la collection
    }
	
    public void rechercherContact(Contact nom) {
            //rechercher le contact dans la collection et le renvoyer
            
    }

    public static void main(String[] args) {
            // TODO Auto-generated method stub
           
    }
    
    public List<Contact> getListeContacts(){
        return listeContacts;
    }
  
}


