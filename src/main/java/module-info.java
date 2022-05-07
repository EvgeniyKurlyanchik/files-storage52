module ru.gb {
    requires javafx.controls;
    requires javafx.fxml;
    requires lombok;
    requires io.netty.transport;
    requires io.netty.codec;

    opens ru.gb.commons to javafx.fxml;
    exports ru.gb.commons;
    exports ru.gb.commons.client;
    opens ru.gb.commons.client to javafx.fxml;
}
