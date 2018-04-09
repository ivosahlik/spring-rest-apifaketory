package cz.ivosahlik.springrestapifaketory.service.impl;

import cz.ivosahlik.springrestapifaketory.api.User;
import cz.ivosahlik.springrestapifaketory.api.UserData;
import cz.ivosahlik.springrestapifaketory.service.ApiService;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Intellij Idea
 * Created by ivosahlik on 09/04/2018
 */
@Service
public class ApiServiceImpl implements ApiService {

    private RestTemplate restTemplate;

    private static final String BASEURL = "http://apifaketory.com/api/user?limit=";


    public ApiServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public List<User> getUsers(Integer limit) {
        UserData userData = restTemplate.getForObject(BASEURL, UserData.class);
        return userData.getUser();
    }
}
