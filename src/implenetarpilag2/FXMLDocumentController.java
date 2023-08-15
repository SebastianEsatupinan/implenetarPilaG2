/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implenetarpilag2;

import datos.Producto;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import modelo.Pila;

/**
 *
 * @author sebastian.esatupinan
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label TituloL;
    
    @FXML
    private Label NombrePTXT;
    
    @FXML
    private Label CodigoPTXT;
     
    @FXML
    private Label ValorPTXT;
      
    @FXML
    private TextField NombreTF;
    
    @FXML
    private TextField CodigoTF;
    
    @FXML
    private TextField ValorTF;
    
    @FXML
    private MenuBar menuBar1;
    
    @FXML
    private TextArea textAreaP;
    
    
    Pila<Producto> pilaP1;
    
     
    @FXML
    private void apilarProducto(ActionEvent event) {
       String nombre = NombreTF.getText();
       String Codigo = CodigoTF.getText();
       Double valor = Double.parseDouble(ValorTF.getText());
       
       Producto obj = new Producto(nombre, Codigo, valor);
       
       pilaP1.apilar(obj);
    }
    
    @FXML
    private void MostrarDatosPila(ActionEvent event) {
        pilaP1.toString();
    }
    
    
    @FXML
    private void DesapilarP(ActionEvent event) {
        pilaP1.desapilar();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        pilaP1 = new Pila<>();
    }    
    
}
