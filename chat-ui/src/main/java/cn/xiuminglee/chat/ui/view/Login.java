package cn.xiuminglee.chat.ui.view;

import cn.xiuminglee.chat.ui.common.PropertiesUtil;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

/**
 * @author Xiuming Lee
 * @description 登录页面
 */
public class Login extends Stage {

    private static final String RESOURCE_NAME = "/fxml/login/login.fxml";
    private Parent root;

    public Login() {
        try {
            root = FXMLLoader.load(getClass().getResource(RESOURCE_NAME));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scene scene = new Scene(root);
        scene.setFill(Color.TRANSPARENT);
        setScene(scene);
        initStyle(StageStyle.TRANSPARENT);
        setResizable(false);
    }
}
