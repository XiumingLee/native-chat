package cn.xiuminglee.chat.ui;

import cn.xiuminglee.chat.ui.view.Login;
import javafx.application.Application;
import javafx.stage.Stage;

/**
 * @author Xiuming Lee
 * @description
 */
public class ChatUiApplication extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Login login = new Login();
        login.show();
    }
}
