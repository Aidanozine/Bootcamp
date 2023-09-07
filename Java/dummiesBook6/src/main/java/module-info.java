module com.example.dummiesbook6 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.dummiesbook6 to javafx.fxml;
    exports com.example.dummiesbook6.chapter1;
    opens com.example.dummiesbook6.chapter1 to javafx.fxml;
    exports com.example.dummiesbook6.chapter2;
    opens com.example.dummiesbook6.chapter2 to javafx.fxml;
    exports com.example.dummiesbook6.chapter3;
    opens com.example.dummiesbook6.chapter3 to javafx.fxml;
    exports com.example.dummiesbook6.chapter4;
    opens com.example.dummiesbook6.chapter4 to javafx.fxml;
}