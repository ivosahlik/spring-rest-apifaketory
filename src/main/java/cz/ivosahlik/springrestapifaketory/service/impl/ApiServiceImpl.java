package cz.ivosahlik.springrestapifaketory.service.impl;

import cz.ivosahlik.springrestapifaketory.api.User;
import cz.ivosahlik.springrestapifaketory.api.UserData;
import cz.ivosahlik.springrestapifaketory.service.ApiService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Intellij Idea
 * Created by ivosahlik on 09/04/2018
 */
@Slf4j
@Service
public class ApiServiceImpl implements ApiService {

    private RestTemplate restTemplate;

    @Value("${user.api.url}")
    private String userApiUrl;

    public ApiServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public List<User> getUsers(Integer limit) {
        log.debug("limit: {} " + limit);
        UserData userData = restTemplate.getForObject( userApiUrl + limit, UserData.class);
        return userData.getData();
    }
}
