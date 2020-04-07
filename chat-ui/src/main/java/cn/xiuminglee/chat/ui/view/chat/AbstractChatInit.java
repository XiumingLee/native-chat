package cn.xiuminglee.chat.ui.view.chat;

import cn.xiuminglee.chat.ui.view.AbstractUiObject;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.StageStyle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

/**
 * @author Xiuming Lee
 * @description 聊天窗口初始化
 */
public abstract class AbstractChatInit extends AbstractUiObject {
    private static final Logger LOG = LoggerFactory.getLogger(AbstractChatInit.class);

    private static final String RESOURCE_NAME = "/fxml/chat/chat.fxml";


    public AbstractChatInit(){
        try {
            root = FXMLLoader.load(getClass().getResource(RESOURCE_NAME));
        } catch (IOException e) {
            LOG.error("聊天窗口组件fxml文件加载失败！",e);
        }
        Scene scene = new Scene(root);
        scene.setFill(Color.TRANSPARENT);
        setScene(scene);
        initStyle(StageStyle.TRANSPARENT);
        setResizable(false);

        // 初始化事件定义组件
        initEventDefine();
    }

}
