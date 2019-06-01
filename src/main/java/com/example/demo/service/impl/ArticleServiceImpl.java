package com.example.demo.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.example.demo.dao.ArticleMapper;
import com.example.demo.model.Article;
import com.example.demo.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 文章表 服务实现类
 * </p>
 *
 * @author huzhiting123
 * @since 2019-06-01
 */
@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements ArticleService {

	@Autowired
	private ArticleMapper articleMapper;

	@Override
	public List<Article> searchArticle(Article article,Map<String,Object> params) {
		EntityWrapper wrapper=new EntityWrapper();
		wrapper.setEntity(article);
		//1. 根据某列单个条件查询
		//wrapper.eq("site",article.getSite());
		//2. 多个条件组合查询
		//wrapper.allEq(params);
		//3. 模糊查询
		//wrapper.like(true,"title",article.getTitle());
		//wrapper.notLike("content",article.getContent());
		//4. in条件查询
		wrapper.in("status","0,2");
		//5. 排序
		wrapper.orderBy("update_time",false);
		List<Article> articleList=articleMapper.selectList(wrapper);
		if(articleList!=null && articleList.size()>0){
			return articleList;
		}else{
			return Collections.emptyList();
		}
	}
}
