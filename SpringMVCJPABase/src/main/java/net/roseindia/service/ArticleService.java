package net.roseindia.service;

import java.util.List;

import net.roseindia.model.Article;

public interface ArticleService {

	public void addArticle(Article article);
	
	public void transact(List<Article> articleList);

	public List<Article> listArticles();	
	
}