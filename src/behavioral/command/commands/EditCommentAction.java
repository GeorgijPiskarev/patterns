package behavioral.command.commands;

import behavioral.command.Blog;

public class EditCommentAction implements Action {
    Blog blog;

    public EditCommentAction(Blog blog) {
        this.blog = blog;
    }

    @Override
    public void execute() {
        blog.editComment();
    }
}
