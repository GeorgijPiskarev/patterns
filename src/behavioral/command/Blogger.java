package behavioral.command;

import behavioral.command.commands.BlockSubscriberAction;
import behavioral.command.commands.CommentAction;
import behavioral.command.commands.EditCommentAction;
import behavioral.command.commands.EditMainTextAction;

public class Blogger {
    BlockSubscriberAction blockSubscriberAction;
    CommentAction commentAction;
    EditCommentAction editCommentAction;
    EditMainTextAction editMainTextAction;

    public Blogger(BlockSubscriberAction blockSubscriberAction, CommentAction commentAction, EditCommentAction editCommentAction, EditMainTextAction editMainTextAction) {
        this.blockSubscriberAction = blockSubscriberAction;
        this.commentAction = commentAction;
        this.editCommentAction = editCommentAction;
        this.editMainTextAction = editMainTextAction;
    }

    void blockSubscriber() {
        blockSubscriberAction.execute();
    }

    void comment() {
        commentAction.execute();
    }

    void editComment() {
        editCommentAction.execute();
    }

    void editMainText() {
        editMainTextAction.execute();
    }
}
