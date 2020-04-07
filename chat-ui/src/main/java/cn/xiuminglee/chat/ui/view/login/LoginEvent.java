package cn.xiuminglee.chat.ui.view.login;

/**
 * @author Xiuming Lee
 * @description
 * 登录窗体事件接口
 */
public interface LoginEvent {
    /**
     * 登陆验证
     * @param userId        用户 ID
     * @param userPassword  用户密码
     */
    void doLoginCheck(String userId, String userPassword);
}
