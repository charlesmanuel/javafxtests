module com.mycompany.officialtest {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.officialtest to javafx.fxml;
    exports com.mycompany.officialtest;
}