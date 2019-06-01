package com.example.demo.service;

import com.baomidou.mybatisplus.service.IService;
import com.example.demo.model.Article;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 文章表 服务类
 * </p>
 *
 * @author huzhiting123
 * @since 2019-06-01
 */
public interface ArticleService extends IService<Article> {

	List<Article> searchArticle(Article article,Map<String,Object> params);

}
