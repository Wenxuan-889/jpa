package wx0725.top;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import wx0725.top.domain.ArticleMain;
import wx0725.top.domain.CommentMain;
import wx0725.top.mapper.ArticleMapper;
import wx0725.top.mapper.CommentMapper;

/**
 * @author WEN
 * @version 1.0
 * @description: Wen Xuan
 * @date 2021/3/20 下午 15:20
 * @link http://wx0725.top
 */

public class MybatisTest {


    /**
     * 注解 操作 MyBatis
     */
    @Autowired
    private CommentMapper commentMapper;

    @Test
    public void selectComment() {
        CommentMain commentMain = commentMapper.findById(1);
        System.out.println(commentMain);
    }

    /**
     * XML 文件 操作 MyBatis
     */
    @Autowired
    private ArticleMapper articleMapper;

    @Test
    public void selectArticle() {
        ArticleMain articleMain = articleMapper.selectArticle(1);
        System.out.println(articleMain);
    }
}
