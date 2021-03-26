package wx0725.top.mapper;

import org.apache.ibatis.annotations.Mapper;
import wx0725.top.domain.ArticleMain;

/**
 * 使用 XML映射
 */
public interface ArticleMapper {
    public ArticleMain selectArticle(Integer id);
    public int updateArticle(ArticleMain articleMain);
}
