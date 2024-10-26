module com.rolw.tsec {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.rolw.tsec to javafx.fxml;
    exports com.rolw.tsec;
}