package behavioral.command.commands;

import behavioral.command.Blog;

public class EditMainTextAction implements Action {
    Blog blog;

    public EditMainTextAction(Blog blog) {
        this.blog = blog;
    }

    @Override
    public void execute() {
        blog.editMainText();
    }
}
