package cn.xiuminglee.chat.ui.view.login;

/**
 * @author Xiuming Lee
 * @description 窗体事件
 */
public class LoginEventDefine {

    private AbstractLoginInit loginInit;
    private LoginEvent loginEvent;
    private LoginMethod loginMethod;

    public LoginEventDefine(AbstractLoginInit loginInit, LoginEvent loginEvent, LoginMethod loginMethod) {
        this.loginInit = loginInit;
        this.loginEvent = loginEvent;
        this.loginMethod = loginMethod;

        loginInit.move();
        min();
        quit();
        doEventLogin();
    }

    /** 事件；最小化 */
    private void min() {
        loginInit.loginMin.setOnAction(event -> {
            loginInit.setIconified(true);
        });
    }

    /** 事件；退出 */
    private void quit() {
        loginInit.loginClose.setOnAction(event -> {
            loginInit.close();
            System.exit(0);
        });
    }

    /** 事件；登陆 */
    private void doEventLogin() {
        loginInit.loginButton.setOnAction(event -> {
            loginEvent.doLoginCheck(loginInit.userId.getText(), loginInit.userPassword.getText());
        });
    }
}
