package com.minhanh.quizapp;

import com.minhanh.utils.MyAlert;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class PrimaryController {
    
    public void handleQuestionManagement() throws IOException{
        Scene scene = new Scene(new FXMLLoader(App.class.getResource( "Question.fxml")).load());
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Quiz App");
        stage.show();
        
    }
    
    public void handlePractice(){
        MyAlert.getInstance().showMsg("Practice");
    }
    
    public void handleLogin(){
        MyAlert.getInstance().showMsg("Login");
    }
    public void handleExam(){
        MyAlert.getInstance().showMsg("Exam");
    }
    public void handleSignUp(){
        MyAlert.getInstance().showMsg("SignUp");
    }
}
