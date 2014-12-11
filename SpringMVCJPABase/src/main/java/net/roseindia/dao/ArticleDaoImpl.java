package net.roseindia.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import net.roseindia.model.Article;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

@Repository("articleDao")
public class ArticleDaoImpl implements ArticleDao {

	private EntityManager em;
	
	@PersistenceContext
    public void setEntityManager(EntityManager em) {
        this.em = em;
    }

	// To Save the article detail
	public void saveArticle(Article article) {
		article.setAddedDate(new Date());
		em.persist(article);
	}
	
	// To get list of all articles
	@SuppressWarnings("unchecked")
	public List<Article> listArticles() {
		Session session = (Session) em.getDelegate();
		return (List<Article>) session.createCriteria(Article.class).list();
	}
}