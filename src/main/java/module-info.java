module edu.utsa.cs3443.fall2026demoproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens edu.utsa.cs3443.fall2026demoproject to javafx.fxml;
    exports edu.utsa.cs3443.fall2026demoproject;
}