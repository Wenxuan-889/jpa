package wx0725.top.domain;

import java.util.List;

/**
 * 文章实体类
 */
public class ArticleMain {
    private Integer id;

    private String title;

    private String content;

    private List<CommentMain> commentMainList;

    @Override
    public String toString() {
        return "ArticleMain{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", commentMainList=" + commentMainList +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<CommentMain> getCommentMainList() {
        return commentMainList;
    }

    public void setCommentMainList(List<CommentMain> commentMainList) {
        this.commentMainList = commentMainList;
    }
}
