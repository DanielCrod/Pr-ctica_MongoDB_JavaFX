module com.mycompany.practica_mongodb_javafx {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.practica_mongodb_javafx to javafx.fxml;
    exports com.mycompany.practica_mongodb_javafx;
}
