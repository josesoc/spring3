package net.roseindia.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.roseindia.model.Article;
import net.roseindia.service.ArticleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/articles")
public class ArticleController {

	
	private ArticleService articleService;
	
	@Autowired
	public ArticleController(ArticleService articleService) {
		this.articleService = articleService;
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView saveArticle(@ModelAttribute(" article") Article  article,
			BindingResult result) {
		 articleService.addArticle( article);
		return new ModelAndView("redirect:/articles.html");
	}	
	

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView listArticles() {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("articles",  articleService.listArticles());

		return new ModelAndView("articlesList", model);
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public ModelAndView addArticle(@ModelAttribute("article") Article article, BindingResult result) {
		return new ModelAndView("addArticle");
	}
	
	@RequestMapping(value = "/transact", method = RequestMethod.GET)
	public ModelAndView transact() {
		
		List<Article> articleList=new ArrayList<Article>();
		Article article1=new Article();
		article1.setArticleName("transact1");
		article1.setArticleDesc("desc transact1");
		
		Article article2=new Article();
		article2.setArticleName("transact2");
		article2.setArticleDesc("desc adsfasfas af asf asdf asf asdf adsfasdf asf asf asf asdf sadfasdf asfasfas  fsasas sa");
		
		articleList.add(article1);
		articleList.add(article2);		
		
		articleService.transact(articleList);
		
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("articles",  articleService.listArticles());
		return new ModelAndView("articlesList", model);
	}

}