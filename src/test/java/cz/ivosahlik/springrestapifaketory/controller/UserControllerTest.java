package cz.ivosahlik.springrestapifaketory.controller;

import cz.ivosahlik.springrestapifaketory.service.ApiService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.WebTestClient;


/**
 * Intellij Idea
 * Created by ivosahlik on 09/04/2018
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserControllerTest {

    @Autowired
    ApplicationContext applicationContext;

    WebTestClient webTestClient;

    @Before
    public void setUp() throws Exception {
        webTestClient = WebTestClient.bindToApplicationContext(applicationContext).build();

    }

    @Test
    public void index() {
        webTestClient.get().uri("/").exchange().expectStatus().isOk();
    }
}