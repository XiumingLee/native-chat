package cn.xiuminglee.chat.ui.view.chat;

import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

/**
 * @author Xiuming Lee
 * @description
 */
public class ChatEventDefine {
    private AbstractChatInit chatInit;

    public ChatEventDefine(AbstractChatInit chatInit) {
        this.chatInit = chatInit;

        chatInit.move();

        barChat();           // 设置聊天按钮相关事件
        barFriend();         // 设置好友按钮相关事件
    }


    /**
     * 切换：bar_chat
     */
    private void switchBarChat(Button barChat, Pane groupBarChat, boolean toggle) {
        if (toggle) {
            barChat.setStyle("-fx-background-image: url('/fxml/chat/img/system/chat_2.png')");
            groupBarChat.setVisible(true);
        } else {
            barChat.setStyle("-fx-background-image: url('/fxml/chat/img/system/chat_0.png')");
            groupBarChat.setVisible(false);
        }
    }

    /**
     * 切换：bar_friend
     */
    private void switchBarFriend(Button barFriend, Pane groupBarFriend, boolean toggle) {
        if (toggle) {
            barFriend.setStyle("-fx-background-image: url('/fxml/chat/img/system/friend_2.png')");
            groupBarFriend.setVisible(true);
        } else {
            barFriend.setStyle("-fx-background-image: url('/fxml/chat/img/system/friend_0.png')");
            groupBarFriend.setVisible(false);
        }
    }

    /**
     * 聊天按钮相关事件
     */
    private void barChat() {
        Button barChat = chatInit.$("bar_chat", Button.class);
        Pane groupBarChat = chatInit.$("group_bar_chat", Pane.class);

        barChat.setOnAction(event -> {
            switchBarChat(barChat, groupBarChat, true);
            switchBarFriend(chatInit.$("bar_friend", Button.class), chatInit.$("group_bar_friend", Pane.class), false);
        });

        barChat.setOnMouseEntered(event -> {
            boolean visible = groupBarChat.isVisible();
            if (visible) {
                return;
            }
            barChat.setStyle("-fx-background-image: url('/fxml/chat/img/system/chat_1.png')");
        });

        barChat.setOnMouseExited(event -> {
            boolean visible = groupBarChat.isVisible();
            if (visible) {
                return;
            }
            barChat.setStyle("-fx-background-image: url('/fxml/chat/img/system/chat_0.png')");
        });
    }

    /**
     * 好友按钮相关事件
     */
    private void barFriend() {
        Button barFriend = chatInit.$("bar_friend", Button.class);
        Pane groupBarFriend = chatInit.$("group_bar_friend", Pane.class);

        barFriend.setOnAction(event -> {
            switchBarChat(chatInit.$("bar_chat", Button.class), chatInit.$("group_bar_chat", Pane.class), false);
            switchBarFriend(barFriend, groupBarFriend, true);
        });

        barFriend.setOnMouseEntered(event -> {
            boolean visible = groupBarFriend.isVisible();
            if (visible) {
                return;
            }
            barFriend.setStyle("-fx-background-image: url('/fxml/chat/img/system/friend_1.png')");
        });

        barFriend.setOnMouseExited(event -> {
            boolean visible = groupBarFriend.isVisible();
            if (visible) {
                return;
            }
            barFriend.setStyle("-fx-background-image: url('/fxml/chat/img/system/friend_0.png')");
        });
    }
}
