package behavioral.command;

import behavioral.command.commands.CommentAction;
import behavioral.command.commands.EditCommentAction;

public class Subscriber {
    CommentAction commentAction;
    EditCommentAction editCommentAction;

    public Subscriber(CommentAction commentAction, EditCommentAction editCommentAction) {
        this.commentAction = commentAction;
        this.editCommentAction = editCommentAction;
    }

    void comment() {
        commentAction.execute();
    }

    void editComment() {
        editCommentAction.execute();
    }
}
