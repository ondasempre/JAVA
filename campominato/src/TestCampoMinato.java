import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;
import java.util.*;
import java.io.*;

/**
 * @author: Marco `RootkitNeo`
 * @version: 0.9 Beta Version
 * 
 * La seguente classe mappa le label mostra il contenuto
 * alla coordinata x,y
 * 
 * LICENSE
 *  IL SOFTWARE È RILASCIATO ENTRO I TERMINI DELLA LICENZA GNU/GPL V.3
 *
 */
class TestCampoMinato extends JFrame implements ActionListener {
  // Mappa delle label
  JLabel label[][];
  // Pannello contenente le Label
  JPanel pannello;
  // oggetto che mi permette di manipolare
  // la "mappa" contenente la disposizione
  // di mine, numeri e ce lle vuote.
  private MatriceCampo mc;
  private int righe =9,colonne = 20, mine =20,etichetta=30;
  private String mina = "*";
  // Riferimento al mio dialog
  private JOptionChooser joc;
  private JLabel mostra_mine; // Mostra il numero di mine
  // Controllare qui, se è null utilizzare String mina
  private ImageIcon image = null;
  
  private int tot = 0;
  
  private boolean perso = false;
  
  TestCampoMinato() {
  
    pannello = new JPanel();
	// Setto un layout di righe * colonne
	pannello.setLayout(new GridLayout(righe,colonne));
	
	mc = new MatriceCampo(righe,colonne,mine);
	label = new JLabel[righe][colonne];
	
	// Inizializzazione matrici
	mc.inserisciMine();
	mc.inserisciNumeri();
	inserisciLabel();
	// Fine inizializzazione
	
	JToolBar toolBar = new JToolBar();
	mostra_mine = new JLabel("Mine: "+mine);
	mostra_mine.setFont(new Font("Monospace",Font.BOLD,18));
	toolBar.add(mostra_mine);
	toolBar.addSeparator(new Dimension(200,0));
	
	add(pannello);
	getContentPane().add(toolBar,BorderLayout.NORTH);
	
	// Ascolto i click che avvengono sul pannello
	pannello.addMouseListener(new MouseListener() {
	  public void mouseReleased(MouseEvent me) {
	    if(perso) return;
	    
	    int x = me.getX();
		int y = me.getY();
		// Ottengo la posizione del click
		int y1 = x/etichetta;
		int x1 = y/etichetta;
		
		
		// Ottengo l'elemento associato all'indice del click
		int xy = mc.getElementoMatrice(x1,y1);
		x1 = (x1==righe) ? (x1-1) : x1;
		y1 = (y1==colonne) ? (y1-1) : y1;
		JLabel l = label[x1][y1];
		
		mc.setStateTrue(x1,y1);
		l.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED,new Color(255,255,255),new Color(0,0,0)));
		
		if(xy==-1) {
		  
	      l.setBorder(BorderFactory.createLineBorder(Color.RED));
		  
		  if(image == null) {
		    l.setText(mina);
		    for(int i=0; i<righe; i++) {
		      for(int j=0; j<colonne; j++) {
			    if(mc.getElementoMatrice(i,j) == -1) {
			      label[i][j].setText(mina);
			    }
			  }
		    }
		  } else {
		    l.setIcon(image);
		    for(int i=0; i<righe; i++) {
		      for(int j=0; j<colonne; j++) {
			    if(mc.getElementoMatrice(i,j) == -1) {
			      label[i][j].setIcon(image);
			    }
			  }
		    }
		  }
		  perso = true;
		  JOptionPane.showMessageDialog(null,"Hai Perso!","Hai perso!",JOptionPane.WARNING_MESSAGE);
		  
		}
		else if(xy > 0) {
		  int n = mc.getElementoMatrice(x1,y1);
		  l.setText(""+n);
		  
		  switch(n) {
		    case 1:
			l.setForeground(Color.GREEN);
			break;
			case 2:
			l.setForeground(Color.BLUE);
			break;
			case 3:
			l.setForeground(Color.RED);
			break;
			case 4:
			l.setForeground(new Color(255,100,100));
			break;
			case 5:
			l.setForeground(new Color(100,100,255));
			break;
			case 6:
			l.setForeground(new Color(100,255,100));
			break;
			default:
			l.setForeground(new Color(240,149,200));
			break;
		  }
		}
		else if(xy == 0) {
		  l.setText(" ");
	    }
	  }
	  
	  public void mouseClicked(MouseEvent me) {}
	  public void mousePressed(MouseEvent me) {}
	  public void mouseEntered(MouseEvent me) {}
	  public void mouseExited(MouseEvent me) {}
	});
	
	JMenuBar barra = new JMenuBar();
	setJMenuBar(barra);
	
	JMenu file = new JMenu("File");
	JMenuItem nuova = new JMenuItem("Nuova Partita");
	JMenuItem noob = new JMenuItem("Principiante (9*20)");
	JMenuItem medio = new JMenuItem("Intermedio (16*16)");
	JMenuItem difficile = new JMenuItem("Difficile (20*40)");
	
	JMenu opzioni = new JMenu("Opzioni");
	JMenuItem impostazioni = new JMenuItem("Impostazioni..");
	
	JMenu info = new JMenu("Info");
	JMenuItem autore = new JMenuItem("Info");

	// Offire anche il cambio dimensioni etichette.

	// Setto le difficoltà
	nuova.addActionListener(new ActionListener() {
	  public void actionPerformed(ActionEvent ae) {
	    pannello.removeAll();
	    mc.setMatrice(righe,colonne);
	    label = new JLabel[righe][colonne];
	    pannello.setLayout(new GridLayout(righe,colonne));
	    
	    mc.inserisciMine();
	    mc.inserisciNumeri();
		mc.azzeraClick();
	    inserisciLabel();
	    pannello.validate();
	    
	    mostra_mine.setText("Mine: "+mine);
	  }
	});
	
	noob.addActionListener(new ActionListener() {
	  public void actionPerformed(ActionEvent ae) {
	    pannello.removeAll();
	    mc.setMatrice(9,20);
	    mc.setMine(20);
	    righe = 9;
		colonne = 20;
	    mine = 20;
	    
	    label = new JLabel[righe][colonne];
	    pannello.setLayout(new GridLayout(righe,colonne));
	    
	    mc.inserisciMine();
	    mc.inserisciNumeri();
		mc.azzeraClick();
	    inserisciLabel();
	    pannello.validate();
	    pack();
	    
	    mostra_mine.setText("Mine: "+mine);
	  }
	});
	
	medio.addActionListener(new ActionListener() {
	  public void actionPerformed(ActionEvent ae) {
	    pannello.removeAll();
	    mc.setMatrice(16,16);
	    mc.setMine(40);
	    righe = 16;
		colonne = 16;
	    mine = 40;
	    
	    label = new JLabel[righe][colonne];
	    pannello.setLayout(new GridLayout(righe,colonne));
	    
	    mc.inserisciMine();
	    mc.inserisciNumeri();
		mc.azzeraClick();
	    inserisciLabel();
	    pannello.validate();
	    pack();
	    
	    mostra_mine.setText("Mine: "+mine);
	  }
	});
	
    difficile.addActionListener(new ActionListener() {
	  public void actionPerformed(ActionEvent ae) {
	    pannello.removeAll();
	    mc.setMatrice(20,40);
	    mc.setMine(220);
	    righe = 20;
		colonne = 40;
	    mine = 220;
	    
	    label = new JLabel[righe][colonne];
	    pannello.setLayout(new GridLayout(righe,colonne));
	    
	    mc.inserisciMine();
	    mc.inserisciNumeri();
		mc.azzeraClick();
	    inserisciLabel();
	    pannello.validate();
	    pack();
	    
	    mostra_mine.setText("Mine: "+mine);
	  }
	});
	// ..fine difficolta'
	impostazioni.addActionListener(this);
	
	// Info
	autore.addActionListener(new ActionListener() {
	  public void actionPerformed(ActionEvent ae) {
	    JOptionPane.showMessageDialog(null,"<html>(C) Marco `RootkitNeo'`<br><br><center>L'autore e' "+ 
	     "disponibile presso il forum:<br>http://solopc.forumcommunity.net/</center></html>",null,JOptionPane.PLAIN_MESSAGE);
	  }
	});
	
   	file.add(nuova);
   	file.addSeparator();
   	file.add(noob);
   	file.addSeparator();
   	file.add(medio);
   	file.addSeparator();
   	file.add(difficile);
   	
   	opzioni.add(impostazioni);
   	
   	info.add(autore);
   	
	barra.add(file);
	barra.add(opzioni);
	barra.add(info);
	    
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
  
  // Apro il JDialog
  public void actionPerformed(ActionEvent ae) {
    joc = new JOptionChooser(this,"Scegli",true);
    joc.pack();
	joc.setVisible(true);
  }
  
  // Metodo che setta il tipo della mina come String
  void setTipoMina(String tipo) {
    mina = tipo;
  }
  // Versione sovraccaricata del metodo che setta il tipo di mina, come immagine
  void setTipoMina(ImageIcon ii) {
    image = ii;
  }
    
  void setEtichetta(int value) {
    etichetta = value;
    
    pannello.removeAll();
    
    mc.setMatrice(righe,colonne);
    mc.setMine(mine);
    
    label = new JLabel[righe][colonne];
	pannello.setLayout(new GridLayout(righe,colonne));
	    
	mc.inserisciMine();
	mc.inserisciNumeri();
    mc.azzeraClick();
    inserisciLabel();
	pannello.validate();
	pack();
  }
  int getEtichetta() {
    return etichetta;
  }
  
  // Setta la dimensione delle etichette se l'utente cambia
  // quest'ultima
  private void setDimensionLabel(int dimension) {
    etichetta = dimension;
    for(int i=0; i<righe; i++) {
      for(int j=0; j<colonne; j++) {
        label[i][j].setPreferredSize(new Dimension(etichetta,etichetta));
      }
    }
  }
    
  private void inserisciLabel() {
  	for(int i=0; i<righe; i++) {
	  for(int j=0; j<colonne; j++) {
	    label[i][j] = new JLabel("");
		label[i][j].setBorder(BorderFactory.createRaisedBevelBorder());
        label[i][j].setPreferredSize(new Dimension(etichetta,etichetta));
        label[i][j].setHorizontalAlignment(JLabel.CENTER);
        pannello.add(label[i][j]);
	  }
	}
	
	perso = false;
  }
  
  public static void makeGUI() {
    TestCampoMinato tcm = new TestCampoMinato();
	tcm.pack();
	tcm.setResizable(false);
	tcm.setVisible(true);
  }
  
  public static void main(String args[]) {
    try {
      SwingUtilities.invokeAndWait( new Runnable() {
        public void run() {
	      makeGUI();
	    }
      });
    } catch(Exception exc) {}
  }
}
