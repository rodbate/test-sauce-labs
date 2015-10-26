
package com.test.controller;

import com.test.Application;
import com.test.repository.UserRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.http.MediaType;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import javax.transaction.Transactional;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@SpringApplicationConfiguration(classes = Application.class)
public class UserControllerTest {

    @Autowired
    private UserController userController;
    @Autowired
    private WebApplicationContext wac;
    @Autowired
    private UserRepository userRepository;

    private MockMvc mockMvc;

    private Logger _log = LoggerFactory.getLogger(UserControllerTest.class);

    @Before
    public void setUp(){
        this.mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
    }


    @Test
    @Transactional
    @Rollback
    public void testRegister() throws Exception{

       String requestBody = "{\"username\":\"rodbate\",\"password\":\"123456\"}";
        MvcResult result = mockMvc.perform(post("/user").contentType(MediaType.APPLICATION_JSON).content(requestBody))
                .andExpect(status().isOk())
                .andReturn();

        _log.info("result : "+result.getResponse().getContentAsString());


    }
}

