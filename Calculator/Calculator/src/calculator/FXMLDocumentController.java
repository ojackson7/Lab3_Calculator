/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.net.URL;
import java.text.DecimalFormat;
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
    double parenValue = 0.0;
    double parenValue2 = 0.0;
    int operationID = 0;
    int parenOpID = 0;
    boolean input = false;
    boolean parenFlag = false;
    
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
        input = true;
            // Check if ERROR was displayed and clear
            if(display.getText().equals("ERROR")){
                display.setText("");
            }
            // Display digit
            display.setText(display.getText() + "0");
        }else if(event.getSource() == one){
        input = true;
            // Check if ERROR was displayed and clear
            if(display.getText().equals("ERROR")){
                display.setText("");
            }
            // Display digit
            display.setText(display.getText() + "1");
        }else if(event.getSource() == two){
        input = true;
            // Check if ERROR was displayed and clear
            if(display.getText().equals("ERROR")){
                display.setText("");
            }
            // Display digit
            display.setText(display.getText() + "2");
        }else if(event.getSource() == three){
        input = true;
            // Check if ERROR was displayed and clear
            if(display.getText().equals("ERROR")){
                display.setText("");
            }
            // Display digit
            display.setText(display.getText() + "3");
        }else if(event.getSource() == four){
        input = true;
            // Check if ERROR was displayed and clear
            if(display.getText().equals("ERROR")){
                display.setText("");
            }
            // Display digit
            display.setText(display.getText() + "4");
        }else if(event.getSource() == five){
        input = true;
            // Check if ERROR was displayed and clear
            if(display.getText().equals("ERROR")){
                display.setText("");
            }
            // Display digit
            display.setText(display.getText() + "5");
        }else if(event.getSource() == six){
        input = true;
            // Check if ERROR was displayed and clear
            if(display.getText().equals("ERROR")){
                display.setText("");
            }
            // Display digit
            display.setText(display.getText() + "6");
        }else if(event.getSource() == seven){
        input = true;
            // Check if ERROR was displayed and clear
            if(display.getText().equals("ERROR")){
                display.setText("");
            }
            // Display digit
            display.setText(display.getText() + "7");
        }else if(event.getSource() == eight){
        input = true;
            // Check if ERROR was displayed and clear
            if(display.getText().equals("ERROR")){
                display.setText("");
            }
            // Display digit
            display.setText(display.getText() + "8");
        }else if(event.getSource() == nine){
        input = true;
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
            boolean decFound = false;
            for(int i = 0; i < display.getText().length(); i++){
                if(display.getText().charAt(i) == '.'){
                    decFound = true;
                }
            }
            if(!decFound){
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
            parenValue = 0.0;
            input = false;
            parenFlag = false;
        }else if(event.getSource() == parentheses){
            // Check if ERROR was displayed and clear
            if(display.getText().equals("ERROR")){
                display.setText("");
            }
            // Parentheses have been called
            if(!parenFlag){
                parenFlag = true; // Parentheses opened
            }else{                
                // Display answer for parentheses
                display.setText(String.valueOf(calculate()));
                
                // Display ERROR instead of Infinity if result is too large
                if(display.getText().equals("Infinity")){
                    display.setText("ERROR");
                }
                
                // Close parentheses
                parenFlag = false;
            }
        }else if(event.getSource() == divide){
            // Check if ERROR was displayed and clear
            if(display.getText().equals("ERROR")){
                display.setText("");
            }
            // Check if in parentheses
            if(parenFlag){
                // Save to parenValue
                parenValue = Double.parseDouble(display.getText());
            }else{
                // Save display to value and clear
                value = Double.parseDouble(display.getText());
            }
            display.setText("");
            // Set operationIDs for divide
            if(parenFlag){
                parenOpID = 1;
            }else{
                operationID = 1;
            }
        }else if(event.getSource() == multiply){
            // Check if ERROR was displayed and clear
            if(display.getText().equals("ERROR")){
                display.setText("");
            }
            // Check if in parentheses
            if(parenFlag){
                // Save to parenValue
                parenValue = (double)Double.parseDouble(display.getText());
            }else{
                // Save display to value and clear
                value = (double)Double.parseDouble(display.getText());
            }
            display.setText("");
            // Set operationID for multiply
            if(parenFlag){
                parenOpID = 2;
            }else{
                operationID = 2;
            }
        }else if(event.getSource() == minus){
            // Check if ERROR was displayed and clear
            if(display.getText().equals("ERROR")){
                display.setText("");
            }
            // Check if in parentheses
            if(parenFlag){
                // Save to parenValue
                parenValue = Double.parseDouble(display.getText());
            }else{
                // Save display to value and clear
                value = Double.parseDouble(display.getText());
            }
            display.setText("");
            // Set operationID for minus
            if(parenFlag){
                parenOpID = 3;
            }else{
                operationID = 3;
            }
        }else if(event.getSource() == plus){
            // Check if ERROR was displayed and clear
            if(display.getText().equals("ERROR")){
                display.setText("");
            }
            // Check if in parentheses
            if(parenFlag){
                // Save to parenValue
                parenValue = Double.parseDouble(display.getText());
            }else{
                // Save display to value and clear
                value = Double.parseDouble(display.getText());
            }
            display.setText("");
            // Set operationID for plus
            if(parenFlag){
                parenOpID = 4;
            }else{
                operationID = 4;
            }
        }else if(event.getSource() == power){
            // Check if ERROR was displayed and clear
            if(display.getText().equals("ERROR")){
                display.setText("");
            }
            // Save display to value and clear
            value = Double.parseDouble(display.getText());
            display.setText("");
            // Set operationID for power
            if(parenFlag){
                parenOpID = 5;
            }else{
                operationID = 5;
            }
        }else if(event.getSource() == equal){
            // Check if ERROR was displayed and clear
            if(display.getText().equals("ERROR")){
                display.setText("");
            }
            // Display answer
            display.setText(String.valueOf(calculate()));
            
            // Display ERROR instead of Infinity if result is too large
            if(display.getText().equals("Infinity")){
                display.setText("ERROR");
            }
        }
    }
    
    public double calculate(){
        double result = 0.0;
        
        // Save second operand
        double value2 = (double)Double.parseDouble(display.getText());
        
        // Format for end result
        DecimalFormat resultForm = new DecimalFormat("#.####");
        
        // Determine what operation to do
        int id;
        if(parenFlag){
            id = parenOpID;
        }else{
            id = operationID;
        }
        switch(id){
            case 1: // Division
                if(value2 == 0){
                    display.setText("ERROR");
                }else{
                    // Perform operation
                    if(parenFlag){
                        result = parenValue / value2;
                    }else{
                        result = value / value2;                    
                    }
                }
                break;
            case 2: // Multiply
                // Perform operation
                if(parenFlag){
                    result = parenValue * value2;
                }else{
                    result = value * value2;
                }
                break;
            case 3: // Minus
                // Perform operation
                if(parenFlag){
                    result = parenValue - value2;
                }else{
                    result = value - value2;
                }
                break;
            case 4: // Plus
                // Perform operation
                if(parenFlag){
                    result = parenValue + value2;
                }else{
                    result = value + value2;
                }
                break;
            case 5: // Power
                // Perform operation
                result = Math.pow(value, value2);
                break;
        }
        return Double.valueOf(resultForm.format(result));
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}
