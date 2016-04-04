import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;
import java.util.*;
import java.io.*;

/**
 * @author: RootkitNeo
 * Classe che crea 2 matrici, effettua una "vista" dei click,
 * e inserisce le mine ed i relativi numeri attorno ad una mina
 */

class MatriceCampo {
  // La matrice la tratto come un quadrato, per cui,
  // righe viene usato sia per le Righe che per le Colonne
  private int righe;
  // Numero di mine
  private int n_mine;
  // Colonne matrice
  private int colonne;
  // Mappa utilizzata per verificare cosa contiene
  // una precisa etichetta
  private int matrice[][];
  // Mappa contenente le posizioni cliccate
  private boolean matrice_click[][];
  
  // Costruttore
  MatriceCampo(int righe,int colonne,int n_mine) {
    this.righe = righe;
	this.colonne = colonne;
	this.n_mine = n_mine;
	
	// Creo una matrice di righe*righe incaricata a contenere
	// tutti gli elementi.
	matrice = new int[righe][colonne];
	matrice_click = new boolean[righe][colonne];
  }
  
  // posizione cliccata
  void setStateTrue(int r,int c) {
    matrice_click[r][c] = true;
  }
  boolean getPosizioneClick(int r, int c) {
    return matrice_click[r][c];
  }
  
  // Setto un nuovo numeri di righe ed inizializzo la matrice
  void setMatrice(int righe,int colonne) {
    this.righe = righe;
	this.colonne = colonne;
	matrice = new int[righe][colonne];
	matrice_click = new boolean[righe][colonne];
  }
  
  // Ottieni il numero di righe
  int getRighe() {
    return righe;
  }
  int getColonne() {
    return colonne;
  }
  
  // setta il nuovo numero di mine
  void setMine(int n_mine) {
    this.n_mine = n_mine;
  }
  
  // Ottieni il numero di mine
  int getMine() {
    return n_mine;
  }
  
  // Ottieni la matrice contenente la mappatura delle mine
  int[][] getMatrice() {
    return matrice;
  }
  // Ottieni l'elemento della matrice in posizione x,y
  int getElementoMatrice(int x,int y) {
    int n=0;
	try {
	  n = matrice[x][y];
	} catch(ArrayIndexOutOfBoundsException ex) {}
	return n;
  }
  
  // Inserisce le mine nella matrice
  void inserisciMine() {
    boolean esegui = true;
	Random r = new Random();
	
	int len = 0;
	while(esegui) {
	  int riga = r.nextInt(righe);
	  int colonna = r.nextInt(colonne);
	  matrice[riga][colonna] = -1; // mina
	  
	  len++;
	  if(len == n_mine) esegui = false;
	}
  }
  
  // Inserisce i numeri attorno a ciascuna mina
  // [puo' essere decisamente migliorato]
  void inserisciNumeri() {
    for(int i=0; i<righe; i++) {
	  for(int j=0; j<colonne; j++) {
	    if(matrice[i][j] == -1) {
	      // n,m-1
		  if((j > 0) && (matrice[i  ][j-1] != -1)) matrice[i  ][j-1] += 1;
		  // n-1,m
		  if((i > 0) && (matrice[i-1][j  ] != -1)) matrice[i-1][j  ] += 1;
		  // n-1,m+1
		  if((i > 0) && (j < (colonne-1)) && (matrice[i-1][j+1] != -1)) matrice[i-1][j+1] += 1;
		  // n-1,m-1
		  if((i > 0) && (j > 0) && (matrice[i-1][j-1] != -1)) matrice[i-1][j-1] += 1;
		  // n,m+1
		  if((j < (colonne-1)) && (matrice[i  ][j+1] != -1)) matrice[i  ][j+1] += 1;
		  // n+1,m
		  if((i < (righe-1)) && (matrice[i+1][j  ] != -1)) matrice[i+1][j  ] += 1;
		  // n+1,m-1
		  if((i < (righe-1)) && (j > 0) && (matrice[i+1][j-1] != -1)) matrice[i+1][j-1] += 1;
		  // n+1,m+1
		  if((i < (righe-1)) && (j < (colonne-1)) && (matrice[i+1][j+1] != -1)) matrice[i+1][j+1] += 1;
		}
	  }
	}
  }
  
  // Azzero i click sulla matrice.
  void azzeraClick() {
    for(int i=0; i<righe; i++) {
	  for(int j=0; j<colonne; j++) {
	    matrice_click[i][j] = false;
	  }
	}
  }
		
} // end class
