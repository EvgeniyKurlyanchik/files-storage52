module ru.gb {
    requires javafx.controls;
    requires javafx.fxml;

    opens ru.gb.commons to javafx.fxml;
    exports ru.gb.commons;
}
