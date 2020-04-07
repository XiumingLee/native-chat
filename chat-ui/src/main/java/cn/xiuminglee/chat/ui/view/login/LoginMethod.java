package cn.xiuminglee.chat.ui.view.login;

/**
 * @author Xiuming Lee
 * @description 登录窗体方法接口
 */
public interface LoginMethod {
    /**
     * 打开登陆窗口
     */
    void doShow();

    /**
     * 登陆失败
     */
    void doLoginError();

    /**
     * 登陆成功；跳转聊天窗口 [关闭登陆窗口，打开新窗口]
     */
    void doLoginSuccess();
}
