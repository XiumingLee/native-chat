package cn.xiuminglee.chat.ui.view.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Xiuming Lee
 * @description 登录窗体的控制管理类
 */
public class LoginController extends AbstractLoginInit implements LoginMethod {
    private static final Logger LOG = LoggerFactory.getLogger(LoginController.class);
    
    private LoginView loginView;
    private LoginEventDefine loginEventDefine;

    public LoginController(LoginEvent loginEvent) {
        super(loginEvent);
    }

    @Override
    public void initView() {
        loginView = new LoginView(this, loginEvent);
    }

    @Override
    public void initEventDefine() {
        loginEventDefine = new LoginEventDefine(this, loginEvent, this);
    }

    @Override
    public void doShow() {
        super.show();
    }

    @Override
    public void doLoginError() {
        LOG.error("登陆失败，执行提示操作");
    }

    @Override
    public void doLoginSuccess() {
        LOG.info("登陆成功，执行跳转操作");
        System.out.println();
        // 关闭原窗口
        close();
    }
}
