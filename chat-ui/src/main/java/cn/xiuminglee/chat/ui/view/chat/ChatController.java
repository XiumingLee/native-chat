package cn.xiuminglee.chat.ui.view.chat;

/**
 * @author Xiuming Lee
 * @description
 */
public class ChatController extends AbstractChatInit implements ChatMethod {

    private ChatEventDefine chatEventDefine;

    @Override
    public void initView() {

    }

    @Override
    public void initEventDefine() {
        this.chatEventDefine = new ChatEventDefine(this);
    }

    @Override
    public void doShow() {
        // 父类Stage的方法
        super.show();
    }
}
