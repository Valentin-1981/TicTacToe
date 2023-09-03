module com.mycomp.javafxproject {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.mycomp.javafxproject to javafx.fxml;
    exports com.mycomp.javafxproject;
}