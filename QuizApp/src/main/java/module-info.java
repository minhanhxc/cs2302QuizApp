module com.minhanh.quizapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.minhanh.quizapp to javafx.fxml;
    exports com.minhanh.quizapp;
}
