/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author Oscar
 */
public class FXMLDocumentController implements Initializable {
    
    double value = 0.0;
    double result = 0.0;
    int operationID = 0;
    
    private Label label;
    @FXML
    private Button plus_minus;
    @FXML
    private Button divide;
    @FXML
    private Button seven;
    @FXML
    private Button eight;
    @FXML
    private Button nine;
    @FXML
    private Button multiply;
    @FXML
    private Button four;
    @FXML
    private Button five;
    @FXML
    private Button six;
    @FXML
    private Button minus;
    @FXML
    private Button one;
    @FXML
    private Button two;
    @FXML
    private Button three;
    @FXML
    private Button plus;
    @FXML
    private Button clear;
    @FXML
    private Button zero;
    @FXML
    private Button decimal;
    @FXML
    private Button equal;
    @FXML
    private TextField display;
    @FXML
    private Button parentheses;
    @FXML
    private Button power;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        if(event.getSource() == zero){
            // Check if ERROR was displayed and clear
            if(display.getText().equals("ERROR")){
                display.setText("");
            }
            // Display digit
            display.setText(display.getText() + "0");
        }else if(event.getSource() == one){
            // Check if ERROR was displayed and clear
            if(display.getText().equals("ERROR")){
                display.setText("");
            }
            // Display digit
            display.setText(display.getText() + "1");
        }else if(event.getSource() == two){
            // Check if ERROR was displayed and clear
            if(display.getText().equals("ERROR")){
                display.setText("");
            }
            // Display digit
            display.setText(display.getText() + "2");
        }else if(event.getSource() == three){
            // Check if ERROR was displayed and clear
            if(display.getText().equals("ERROR")){
                display.setText("");
            }
            // Display digit
            display.setText(display.getText() + "3");
        }else if(event.getSource() == four){
            // Check if ERROR was displayed and clear
            if(display.getText().equals("ERROR")){
                display.setText("");
            }
            // Display digit
            display.setText(display.getText() + "4");
        }else if(event.getSource() == five){
            // Check if ERROR was displayed and clear
            if(display.getText().equals("ERROR")){
                display.setText("");
            }
            // Display digit
            display.setText(display.getText() + "5");
        }else if(event.getSource() == six){
            // Check if ERROR was displayed and clear
            if(display.getText().equals("ERROR")){
                display.setText("");
            }
            // Display digit
            display.setText(display.getText() + "6");
        }else if(event.getSource() == seven){
            // Check if ERROR was displayed and clear
            if(display.getText().equals("ERROR")){
                display.setText("");
            }
            // Display digit
            display.setText(display.getText() + "7");
        }else if(event.getSource() == eight){
            // Check if ERROR was displayed and clear
            if(display.getText().equals("ERROR")){
                display.setText("");
            }
            // Display digit
            display.setText(display.getText() + "8");
        }else if(event.getSource() == nine){
            // Check if ERROR was displayed and clear
            if(display.getText().equals("ERROR")){
                display.setText("");
            }
            // Display digit
            display.setText(display.getText() + "9");
        }else if(event.getSource() == decimal){
            // Check if ERROR was displayed and clear
            if(display.getText().equals("ERROR")){
                display.setText("");
            }
            //Check if already a decimal number
            boolean found = false;
            for(int i = 0; i < display.getText().length(); i++){
                if(display.getText().charAt(i) == '.'){
                    found = true;
                }
            }
            if(!found){
                    display.setText(display.getText() + ".");
            }// Else do nothing
        }else if(event.getSource() == plus_minus){
            // Check if ERROR was displayed and clear
            if(display.getText().equals("ERROR")){
                display.setText("");
            }
            // Convert to negative or positive then display
            double temp = -1 * Double.parseDouble(display.getText());
            display.setText(String.valueOf(temp));
        }else if(event.getSource() == clear){
            // Clear screen and variables
            display.setText("");
            operationID = 0;
            value = 0.0;
            result = 0.0;
        }else if(event.getSource() == divide){
            // Check if ERROR was displayed and clear
            if(display.getText().equals("ERROR")){
                display.setText("");
            }
            // Save display to value and clear
            value = Double.parseDouble(display.getText());
            display.setText("");
            // Set operationID for divide
            operationID = 1;
        }else if(event.getSource() == multiply){
            // Check if ERROR was displayed and clear
            if(display.getText().equals("ERROR")){
                display.setText("");
            }
            // Save display to value and clear
            value = Double.parseDouble(display.getText());
            display.setText("");
            // Set operationID for multiply
            operationID = 2;
        }else if(event.getSource() == minus){
            // Check if ERROR was displayed and clear
            if(display.getText().equals("ERROR")){
                display.setText("");
            }
            // Save display to value and clear
            value = Double.parseDouble(display.getText());
            display.setText("");
            // Set operationID for minus
            operationID = 3;
        }else if(event.getSource() == plus){
            // Check if ERROR was displayed and clear
            if(display.getText().equals("ERROR")){
                display.setText("");
            }
            // Save display to value and clear
            value = Double.parseDouble(display.getText());
            display.setText("");
            // Set operationID for plus
            operationID = 4;
        }else if(event.getSource() == power){
            // Check if ERROR was displayed and clear
            if(display.getText().equals("ERROR")){
                display.setText("");
            }
            // Save display to value and clear
            value = Double.parseDouble(display.getText());
            display.setText("");
            // Set operationID for power
            operationID = 5;
        }else if(event.getSource() == equal){
            // Check if ERROR was displayed and clear
            if(display.getText().equals("ERROR")){
                display.setText("");
            }
            // Save second operand
            double value2 = Double.parseDouble(display.getText());
            switch(operationID){
                case 1: // Division
                    if(value2 == 0){
                        display.setText("ERROR");
                    }else{
                        // Perform operation and display
                        result = value / value2;
                        display.setText(String.valueOf(result));
                    }
                    break;
                case 2: // Multiply
                    // Perform operation and display
                    result = value * value2;
                    display.setText(String.valueOf(result));
                    break;
                case 3: // Minus
                    // Perform operation and display
                    result = value - value2;
                    display.setText(String.valueOf(result));
                    break;
                case 4: // Plus
                    // Perform operation and display
                    result = value + value2;
                    display.setText(String.valueOf(result));
                    break;
                case 5: // Power
                    // Perform operation and display
                    result = Math.pow(value, value2);
                    display.setText(String.valueOf(result));
                    // Display ERROR instead of Infinity
                    if(display.getText().equals("Infinity")){
                        display.setText("ERROR");
                    }
                    break;
            }
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}
