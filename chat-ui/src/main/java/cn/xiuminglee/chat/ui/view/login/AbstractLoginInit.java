package cn.xiuminglee.chat.ui.view.login;

import cn.xiuminglee.chat.ui.view.AbstractUiObject;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.stage.StageStyle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

/**
 * @author Xiuming Lee
 * @description
 */
public abstract class AbstractLoginInit extends AbstractUiObject {
    private static final Logger LOG = LoggerFactory.getLogger(AbstractLoginInit.class);

    private static final String RESOURCE_NAME = "/fxml/login/login.fxml";

    protected LoginEvent loginEvent;

    /** 登陆窗口最小化 */
    public Button loginMin;
    /** 登陆窗口退出 */
    public Button loginClose;
    /** 登陆按钮 */
    public Button loginButton;
    /** 用户账户 */
    public TextField userId;
    /** 用户密码 */
    public PasswordField userPassword;


    AbstractLoginInit(LoginEvent loginEvent) {
        this.loginEvent = loginEvent;
        try {
            root = FXMLLoader.load(getClass().getResource(RESOURCE_NAME));
        } catch (IOException e) {
            LOG.error("加载登录页fxml文件失败！",e);
        }

        Scene scene = new Scene(root);
        scene.setFill(Color.TRANSPARENT);
        setScene(scene);
        initStyle(StageStyle.TRANSPARENT);
        setResizable(false);

        obtain();
        initView();
        initEventDefine();
    }

    /** 获取相关元素 */
    private void obtain() {
        loginMin = $("login_min", Button.class);
        loginClose = $("login_close", Button.class);
        loginButton = $("login_button", Button.class);
        userId = $("userId", TextField.class);
        userPassword = $("userPassword", PasswordField.class);
    }
}
