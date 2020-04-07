package cn.xiuminglee.chat.ui;

import cn.xiuminglee.chat.ui.view.login.LoginController;
import cn.xiuminglee.chat.ui.view.login.LoginMethod;
import javafx.application.Application;
import javafx.stage.Stage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Xiuming Lee
 * @description
 */
public class ChatUiApplication extends Application {
    private static final Logger LOG = LoggerFactory.getLogger(ChatUiApplication.class);

    @Override
    public void start(Stage primaryStage) {
        LoginMethod login = new LoginController((userId, userPassword) -> {
            LOG.info("登陆 userId：{},userPassword：{}",userId,userPassword);
        });

        login.doShow();
        LOG.info("程序启动完成！");
    }
}
