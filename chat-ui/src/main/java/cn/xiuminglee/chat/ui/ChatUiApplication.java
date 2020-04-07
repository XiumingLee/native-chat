package cn.xiuminglee.chat.ui;

import cn.xiuminglee.chat.ui.view.chat.ChatController;
import cn.xiuminglee.chat.ui.view.chat.ChatMethod;
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
        ChatMethod chat = new ChatController();

        chat.doShow();
        LOG.info("程序启动完成！");
    }
}
