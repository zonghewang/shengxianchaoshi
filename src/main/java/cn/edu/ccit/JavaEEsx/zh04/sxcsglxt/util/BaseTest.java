package cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.util;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;





@RunWith(JUnit4ClassRunner.class)
@WebAppConfiguration("src/main/resouces")
@ContextConfiguration(locations={"classpath:spring/spring-service.xml",
		"classpath:spring/spring-mvc.xml",
		//"classpath:spring/spring-shiro.xml",
		"classpath:spring/spring-mybatis.xml"
		})
public class BaseTest extends log4jConfig{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected Logger log = LoggerFactory.getLogger(getClass());
    
    @Test
    public void test(){
        System.out.println("aa杀杀杀a");
    }
}