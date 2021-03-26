package wx0725.top.mapper;

import org.apache.ibatis.annotations.*;
import wx0725.top.domain.CommentMain;

/**
 * 使用注解映射
 */
public interface CommentMapper {

    //    查询指定id评论
    @Select("SELECT * FROM t_comment WHERE id=#{id}")
    public CommentMain findById(Integer id);

    //    插入评论
    @Insert(
            "INSERT INTO t_comment(content,author,a_id) " +
                    "VALUES(#{content}, #{author}, #{aId})"
    )
    public int insertComment(CommentMain commentMain);

    //    更新文章
    @Update("UPDATE t_comment SET content=#{content} WHERE id=#{id}")
    public int updateComment(CommentMain commentMain);

    //    删除指定文章
    @Delete("DELETE FROM t_comment WHERE id=#{id}")
    public int delectComment(Integer id);
}
