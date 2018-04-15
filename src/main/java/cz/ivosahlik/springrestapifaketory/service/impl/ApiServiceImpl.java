package cz.ivosahlik.springrestapifaketory.service.impl;

import cz.ivosahlik.springrestapifaketory.api.User;
import cz.ivosahlik.springrestapifaketory.api.UserDataDto;
import cz.ivosahlik.springrestapifaketory.service.ApiService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

/**
 * Intellij Idea
 * Created by ivosahlik on 09/04/2018
 */
@Slf4j
@Service
public class ApiServiceImpl implements ApiService {

    private RestTemplate restTemplate;

    private static final String LIMIT_PARAM = "limit";

    @Value("${user.api.url}")
    private String userApiUrl;

    @Value("${user.api.uri}")
    private String userApiUri;

    public ApiServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public List<User> getUsers(Integer limit) {
        log.debug("limit: {} " + limit);
        UserDataDto userDataDto = restTemplate.getForObject( userApiUrl + limit, UserDataDto.class);
        return userDataDto.getData();
    }

    @Override
    public List<User> getUsersUri(Integer limit) {
        log.debug("limit: {} " + limit);
        UriComponentsBuilder uriComponentsBuilder = UriComponentsBuilder.fromUriString(userApiUri).queryParam(LIMIT_PARAM, limit);
        UserDataDto userDataDto = restTemplate.getForObject(uriComponentsBuilder.toUriString(), UserDataDto.class);
        return userDataDto.getData();
    }


}
