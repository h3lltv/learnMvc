package zabudskiy.springlearn.domain.util;

import zabudskiy.springlearn.domain.User;

public abstract class MessageHelper {
    public static String getAuthorName(User author){
        return author !=null ? author.getUsername() : "<none>";
    }
}
