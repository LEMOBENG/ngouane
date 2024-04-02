
import core.Contact;
import core.Enseignant;
import core.Etudiant;
import core.Repertoire;
import core.Agent;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class MainApplication {
    public static void main(String[] args){
        //creation d un repertoire
        Repertoire repertoire=new Repertoire();
        
        //creation de quelques contacts
        Contact contact1=new Contact("01","ELSA SNOW",null,null,null,null);
        Etudiant etudiant1=new Etudiant("02","FLAKE Elsy",null,null,null,null,"cycle A","Niveau 1");
        Enseignant enseignant1=new Enseignant("03","Carina Queen",null,null,null,null,"Medecin");
        Agent agent1=new Agent("04","Kalaba Eva",null,null,null,null,150000.0,"agent administratif","categorie B",5,"Maire");
        
        //ajout des contacts au repertoire
        repertoire.ajouterContact(contact1);
        repertoire.ajouterContact(etudiant1);
        repertoire.ajouterContact(enseignant1);
        repertoire.ajouterContact(agent1);
        
        
        //recherche d un contact par nom
        contact1.setNom("Carina Queen");
        Contact contactTrouve=repertoire.rechercherContact("Carina Queen");
        if(contactTrouve!=null){
            System.out.println("Contact trouve:"+contactTrouve.getNom());
            
        }else{
            System.out.println("Contact non trouve.");
        }
        
        //suppression d un contact
        repertoire.supprimerContact(agent1);
        
        //Modification d un contact
        contact1.setNom("FLAKE Elsy");
        repertoire.modifierContact(contact1);
    }
}
        
        
        
        
        
        
        

        
        
        
        