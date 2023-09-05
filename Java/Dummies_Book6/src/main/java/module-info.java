module com.example.dummies_book6 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.book6.chapter1 to javafx.fxml;
    exports com.example.book6.chapter1;
}