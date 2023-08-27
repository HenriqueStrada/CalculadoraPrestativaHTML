module com.example.calculadora_prestativa {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.calculadora_prestativa to javafx.fxml;
    exports com.example.calculadora_prestativa;
    exports com.example.calculadora_prestativa.util;
    opens com.example.calculadora_prestativa.util to javafx.fxml;
}