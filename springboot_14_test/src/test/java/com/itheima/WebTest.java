package com.itheima;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.ContentResultMatchers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.result.StatusResultMatchers;

/**
 * @author: Java_cmr
 * @Date: 2023/3/3 - 15:17
 */

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class WebTest {

    @Test
    void test(@Autowired MockMvc mvc) throws Exception {
        MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.get("/books");
        ResultActions perform = mvc.perform(builder);
    }

    @Test
    void testStatus(@Autowired MockMvc mvc) throws Exception {
        MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.get("/books");
        ResultActions perform = mvc.perform(builder);

        //本次调用预期值
        StatusResultMatchers status = MockMvcResultMatchers.status();
        //成功时预期值
        ResultMatcher ok = status.isOk();

        perform.andExpect(ok);
    }

    @Test
    void testBody(@Autowired MockMvc mvc) throws Exception {
        MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.get("/books");
        ResultActions perform = mvc.perform(builder);

        //本次调用预期值
        ContentResultMatchers content = MockMvcResultMatchers.content();
        //成功时预期值
        ResultMatcher springboot = content.string("springboot");

        perform.andExpect(springboot);
    }

    @Test
    void testJson(@Autowired MockMvc mvc) throws Exception {
        MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.get("/books");
        ResultActions perform = mvc.perform(builder);

        //本次调用预期值
        ContentResultMatchers content = MockMvcResultMatchers.content();
        //成功时预期值
        ResultMatcher json = content.json("{\"id\":1,\"name\":\"aa\",\"type\":\"bb\",\"description\":\"cc\"}");

        perform.andExpect(json);
    }

}
