package cn.xiuminglee.chat.ui;

import javafx.application.Application;

/**
 * @author Xiuming Lee
 * @description 由于JDK11不包含FX。ChatUiApplication继承了JavaFX的Application。
 *              > 直接将`ChatUiApplication`指定为主入口会报错。
 *              > 利用App类转接一层。
 */
public class App {
    public static void main(String[] args) {
        Application.launch(ChatUiApplication.class);
    }
}
