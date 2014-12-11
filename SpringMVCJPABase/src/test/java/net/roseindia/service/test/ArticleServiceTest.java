package net.roseindia.service.test;

import java.util.List;

import net.roseindia.model.Article;
import net.roseindia.service.ArticleService;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Unit test for simple App.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/applicationContext.xml" })
public class ArticleServiceTest {

    @Autowired
    private ArticleService articleService;

    @BeforeClass
    public static void startUpFwk() {
      
    }

    @org.junit.Test
    public void testObtenerListaPolizas() {
        
    	List<Article> articles=articleService.listArticles();
    	
    	Assert.assertNotNull(articles);
    	Assert.assertTrue(articles.size() >= 0);
    }
}
