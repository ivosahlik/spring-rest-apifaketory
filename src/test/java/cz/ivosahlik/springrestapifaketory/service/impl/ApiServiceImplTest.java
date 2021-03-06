package cz.ivosahlik.springrestapifaketory.service.impl;

import cz.ivosahlik.springrestapifaketory.api.User;
import cz.ivosahlik.springrestapifaketory.service.ApiService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Intellij Idea
 * Created by ivosahlik on 09/04/2018
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ApiServiceImplTest {

    @Autowired
    ApiService apiService;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void getUsers() {
        List<User> list = apiService.getUsers(3);
        assertEquals(4, list.size());
    }

    @Test
    public void getUsersUri() {
        List<User> list = apiService.getUsers(5);
        assertEquals(6, list.size());
    }
}