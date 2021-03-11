package behavioral.command.commands;

import behavioral.command.Blog;

public class BlockSubscriberAction implements Action {
    Blog blog;

    public BlockSubscriberAction(Blog blog) {
        this.blog = blog;
    }

    @Override
    public void execute() {
        blog.blockSubscriber();
    }
}
