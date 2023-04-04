package com.projeto.Layout;
/*
Put header here


 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class FXMLController implements Initializable {
	
	@FXML
	private TextField tfNome, tfNota1, tfNota2;
	
	@FXML
	private RadioButton rdMasculino, rdFeminino;
	
	@FXML
	private CheckBox cdDisciplina1, cdDisciplina2, cdDisciplina3;
	
	@FXML
	private Button btnCalcular;
	
	//para gerenciar a seleção exclusiva do radio button
	private ToggleGroup toggleGroup;
	
	@FXML
	public void clickBtnCalcular(ActionEvent e) {
		System.out.println(tfNome.getText());
		float n1 = Float.parseFloat(tfNota1.getText());
		float n2 = Float.parseFloat(tfNota2.getText());
		float media = (n1+n2)/2;
		System.out.println("Média: "+media);
	}

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    	this.toggleGroup = new ToggleGroup();
    	rdMasculino.setToggleGroup(toggleGroup);
    	rdFeminino.setToggleGroup(toggleGroup);
    }    
}
