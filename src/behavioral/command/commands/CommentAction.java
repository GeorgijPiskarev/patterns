package behavioral.command.commands;

import behavioral.command.Blog;

public class CommentAction implements Action {
    Blog blog;

    public CommentAction(Blog blog) {
        this.blog = blog;
    }

    @Override
    public void execute() {
        blog.comment();
    }
}
