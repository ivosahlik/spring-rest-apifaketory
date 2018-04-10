package cz.ivosahlik.springrestapifaketory.service;

import cz.ivosahlik.springrestapifaketory.api.User;

import java.util.List;

/**
 * Intellij Idea
 * Created by ivosahlik on 09/04/2018
 */
public interface ApiService {

    List<User> getUsers(Integer limit);

    List<User> getUsersUri(Integer limit);

}
