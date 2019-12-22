package com.robot_turtle;

import java.lang.reflect.Array;

public class Board extends Jeu {
    public int nbrJoueur;
    private int nbrMur;
    private int nbrJoyaux;
    private int nbrMurGlace;
    private int taille;
    private char [][] plateau;

    public Board(){
    }

    public Board(int nbrJoueur, int nbrMur,int taille,int nbrJoyaux,int nbrMurGlace){
        this.nbrJoueur=nbrJoueur;
        this.nbrMur=nbrMur;
        this.taille=taille;
        this.nbrJoyaux=nbrJoyaux;
        this.nbrMurGlace=nbrMurGlace;


    }

    public void initPlacement(){
        plateau = new char [8][8];


        for (int i=0; i<8 ;i++){
            for(int j=0;j<8;j++){
                plateau[i][j]=' ';

            }
        }
        plateau[0][0]='0';

    }

    public char[][] getPlateau (){ return plateau;}
    public void initCarte(){

    }
    public void affichage(){

    }



    public int getNbrJoueur() {
        return nbrJoueur;
    }

    public void setNbrJoueur(int nbrJoueur) {
        this.nbrJoueur = nbrJoueur;
    }

    public int getNbrJoyaux() {
        return nbrJoyaux;
    }

    public void setNbrJoyaux(int nbrJoyaux) {
        this.nbrJoyaux = nbrJoyaux;
    }

    public int getNbrMur() {
        return nbrMur;
    }

    public void setNbrMur(int nbrMur) {
        this.nbrMur = nbrMur;
    }

    public int getNbrMurGlace() {
        return nbrMurGlace;
    }

    public void setNbrMurGlace(int nbrMurGlace) {
        this.nbrMurGlace = nbrMurGlace;
    }

    public int getTaille() {
        return taille;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }

}
