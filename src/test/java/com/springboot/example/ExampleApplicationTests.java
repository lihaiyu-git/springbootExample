package com.springboot.example;

import com.ExampleApplication;
import com.springboot.dao.UserDao;
import com.springboot.service.UserService;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ExampleApplication.class)//springboot
//@SpringBootTest(classes = MockServletContext.class)
@WebAppConfiguration
public class ExampleApplicationTests {

	private MockMvc mvc;
	private Mock mock;

	@Autowired
	private UserService userService;
	@Autowired
	private UserDao userDao;

	@Test
	@Transactional
	public void testUser1(){
		userDao.insert("haha",2);
		userDao.insert("haha",2);
		//userDao.insert("haha",2);
		//int count = userDao.insert("dd",2);
		//System.out.println("----------"+count+"------------");
	}

//	@Before
//	public void setUp() throws Exception {
//		mvc = MockMvcBuilders.standaloneSetup(new TestController()).build();
//	}
//
//	@Ignore
//	@Test
//	public void getHello() throws Exception {
//		mvc.perform(MockMvcRequestBuilders.post("/hello").accept(MediaType.APPLICATION_JSON))
//				.andExpect(status().isOk())
//				.andDo(MockMvcResultHandlers.print())
//				//.andExpect(content().string(equalTo("Hello Wordd")))
//				.andReturn().getResponse().getContentAsString();
//	}

	@Before
	public void setUp() throws Exception {

		//mvc = MockMvcBuilders.standaloneSetup(new UserController()).build();
	}

	@Ignore
	@Test
	public void testUser(){
		int count = userService.count();
		System.out.println("----------"+count+"------------");

	}

	/*@Ignore
	@Test
	public void testUserController() throws Exception {
		// 测试UserController
		RequestBuilder request = null;

		//1、get查一下user列表，应该为空
		request = get("/users/");
		mvc.perform(request).andExpect(status().isOk()).andExpect(content().string(equalTo("[]")));

		// 2、post提交一个user
		request = post("/users/")
				.param("id", "2")
				.param("name", "李海宇")
				.param("age", "30");
		mvc.perform(request).andExpect(content().string(equalTo("success")));

		request = post("/users/")
				.param("id", "1")
				.param("name", "李海宇")
				.param("age", "30");
		mvc.perform(request).andExpect(content().string(equalTo("success")));

		// 3、get获取user列表，应该有刚才插入的数据
		request = get("/users/");
		mvc.perform(request)
				.andExpect(status().isOk())
				.andDo(MockMvcResultHandlers.print());
				//.andExpect(content().string(equalTo("[{\"id\":1,\"name\":\"测试大师\",\"age\":20}]")));

		// 4、put修改id为1的user
		request = put("/users/1")
				.param("name", "测试终极大师")
				.param("age", "30");
		mvc.perform(request).andExpect(content().string(equalTo("success")));

		// 5、get一个id为1的user
		request = get("/users/1");
		mvc.perform(request).andExpect(content().string(equalTo("{\"id\":1,\"name\":\"测试终极大师\",\"age\":30}")));

		// 6、del删除id为1的user
		request = delete("/users/1");
		mvc.perform(request).andExpect(content().string(equalTo("success")));

		// 7、get查一下user列表，应该为空
		request = get("/users/");
		mvc.perform(request).andExpect(status().isOk()).andExpect(content().string(equalTo("[]")));
	}*/

}

