import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;
import java.util.*;
import java.io.*;

/**
 * @author: RootkitNeo
 * Dialog che permette la scelta della dimensione dell'etichetta
 * e permette l'inserimento di un immagine quando la dimensione è >=30
 */

class JOptionChooser extends JDialog implements ChangeListener,ActionListener {
  private JTextField percorso;
  private JButton seleziona,conferma;
  private JSpinner dimensione_etichetta;
  private JFileChooser fileChooser;
  private TestCampoMinato tcm;
  
  JOptionChooser(TestCampoMinato tcm, String title, boolean value) {
    super(tcm,title,value);
    this.tcm = tcm;
    fileChooser = new JFileChooser();
    
    JPanel pannello = new JPanel(new GridLayout(3,2));
	
	JPanel immagine = new JPanel(new FlowLayout());
	JLabel percorso1 = new JLabel("Percorso del File: ");
    percorso = new JTextField(30);
    JScrollPane scrollPane = new JScrollPane(percorso);
	immagine.add(percorso1);
	immagine.add(percorso);
    
	JPanel bottoni = new JPanel(new FlowLayout());
    seleziona = new JButton("Scegli Immagine..");
    if(tcm.getEtichetta() >= 30) seleziona.setEnabled(true);
	else seleziona.setEnabled(false);
    conferma = new JButton("Conferma");
	bottoni.add(seleziona);
	bottoni.add(conferma);
	
	JPanel etichetta = new JPanel(new FlowLayout());
	JLabel scegli_dimensione = new JLabel("Dimensione Etichette:");
	// valore iniziale, valore minimo, valore massimo, incremento al click
    SpinnerModel dimensione_etich = new SpinnerNumberModel(tcm.getEtichetta(),20,60,5);
	// Ascolto i cambi di stato
    dimensione_etich.addChangeListener(this);
	// creo un JSpinner con il Model indicato precedentemente.
    dimensione_etichetta = new JSpinner(dimensione_etich);
	etichetta.add(scegli_dimensione);
    etichetta.add(dimensione_etichetta);
	
	// Ascolto su questi componenti
    seleziona.addActionListener(this);
    conferma.addActionListener(this);
    
	pannello.add(immagine);
	pannello.add(bottoni);
	pannello.add(etichetta);
    add(pannello);
	
	setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);
  }
  
  public void actionPerformed(ActionEvent ae) {
    JButton bottone = (JButton) ae.getSource();
    
    if(bottone == seleziona) {
	  // Ottengo il valore corrispondente al tipo di operazione
      int scelta = fileChooser.showOpenDialog(this);
	  
	  // Apertura file..
      if(scelta == JFileChooser.APPROVE_OPTION) {
        File file = fileChooser.getSelectedFile();
        percorso.setText(file.getPath());
		// Caricamento immagine
        tcm.setTipoMina(new ImageIcon(file.getPath()));
      }
      else {
	    // La finestra è stata chiusa. Setto l'immagine su null
	    ImageIcon ii = null; 
		tcm.setTipoMina(ii); 
	  }
    } // Pressione su conferma
    else if(bottone == conferma) {
      SpinnerModel numberModel = dimensione_etichetta.getModel();
	  // ottengo il valore dello Spinner
      Integer v = (Integer) numberModel.getValue();
      tcm.setEtichetta(v);
      dispose();
    }
  }
  
  public void stateChanged(ChangeEvent ce) {
    SpinnerModel numberModel = dimensione_etichetta.getModel();
    Integer v = (Integer) numberModel.getValue();
    if(v >= 30) { seleziona.setEnabled(true);}
    else { seleziona.setEnabled(false); tcm.setTipoMina("*"); ImageIcon ii = null; tcm.setTipoMina(ii);}
  }
}
