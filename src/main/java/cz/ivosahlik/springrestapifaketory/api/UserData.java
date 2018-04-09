package cz.ivosahlik.springrestapifaketory.api;

import java.util.List;

/**
 * Intellij Idea
 * Created by ivosahlik on 09/04/2018
 */
public class UserData {

    private List<User> data;

    public List<User> getUser() {
        return data;
    }

    public void setUser(List<User> data) {
        this.data = data;
    }
}
