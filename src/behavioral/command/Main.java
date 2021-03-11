package behavioral.command;

import behavioral.command.commands.BlockSubscriberAction;
import behavioral.command.commands.CommentAction;
import behavioral.command.commands.EditCommentAction;
import behavioral.command.commands.EditMainTextAction;

public class Main {
    public static void main(String[] args) {
        Blog blog = new Blog();

        Blogger blogger = new Blogger(new BlockSubscriberAction(blog), new CommentAction(blog),
                new EditCommentAction(blog), new EditMainTextAction(blog));
        blogger.editMainText();
        blogger.comment();
        blogger.blockSubscriber();
        blogger.editComment();

        System.out.println();

        Subscriber subscriber = new Subscriber(new CommentAction(blog), new EditCommentAction(blog));
        subscriber.comment();
        subscriber.editComment();
    }
}
