package cn.xiuminglee.chat.ui.view.login;

/**
 * @author Xiuming Lee
 * @description 页面展示元素和事件定义
 */
public class LoginView {
    private AbstractLoginInit loginInit;
    private LoginEvent loginEvent;

    public LoginView(AbstractLoginInit loginInit, LoginEvent loginEvent) {
        this.loginInit = loginInit;
        this.loginEvent = loginEvent;
    }
}
