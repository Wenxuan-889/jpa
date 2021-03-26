package wx0725.top.repository;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.Transactional;
import wx0725.top.domain.Discuss;

import java.util.List;

/**
 * @author WEN
 * @version 1.0
 * @description: Wen Xuan
 * @date 2021/3/20 下午 13:51
 * @link http://wx0725.top
 */

@EnableJpaRepositories(basePackages = {"wx0725.top.repository"})
public interface DiscussRepository extends JpaRepository<Discuss, Integer> {

    public List<Discuss> findByAuthorNotNull();

    @Query("SELECT c from t_comment c where c.aId = ?1")
    public List<Discuss> getDiscussPaged(Integer aid, Pageable pageable);

    @Query(value = "SELECT * from t_comment c where a_Id = ?1", nativeQuery = true)
    public List<Discuss> getDiscussPaged2(Integer aid, Pageable pageable);

    @Transactional
    @Modifying
    @Query("UPDATE t_comment c SET c.author = ?1 WHERE c.id = ?2")
    public List<Discuss> updateDiscuss(String author, Integer id);

    @Transactional
    @Modifying
    @Query("DELETE FROM t_comment c where c.id = ?1")
    public int deleteDiscuss(Integer id);

}
