package com.example.demo.service.impl;

import com.example.demo.model.Article;
import com.example.demo.service.ArticleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by hzt on 2019/6/1 0001.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ArticleServiceImplTest {

	@Autowired
	private ArticleService articleService;

	@Test
	public void testSearchArticle() throws Exception {
		Article article=new Article();
		//1. 单个条件查询（站点编码为"INFO")
		//article.setSite("INFO");
		//2. 多个条件组合查询（文章栏目编号为1且站点编码为"LIFE")
		Map<String,Object> params=new HashMap<>();
//		params.put("site","LIFE");
//		params.put("cat_id","1");
		//3. 模糊查询（"%车%"、"%车"、"车%"）
		//article.setTitle("'头条'");
		//article.setStatus(0);
		List<Article> articleList=articleService.searchArticle(article,params);
		if(articleList.size()>0){
			for (Article ac:articleList) {
				System.out.println("查询结果：文章编号：" + ac.getId() + " 文章标题：" + ac.getTitle() +
						" 更新时间：" + ac.getUpdateTime() + " 文章状态：" + ac.getStatus());
			}
		}
	}
}