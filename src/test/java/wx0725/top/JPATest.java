package wx0725.top;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;
import wx0725.top.domain.Discuss;
import wx0725.top.repository.DiscussRepository;
import static org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers.startsWith;

import java.util.List;
import java.util.Optional;

/**
 * @author WEN
 * @version 1.0
 * @description: Wen Xuan
 * @date 2021/3/20 下午 15:19
 * @link http://wx0725.top
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class JPATest {

    @Autowired
    private DiscussRepository discussRepository;

    @Test
    public void selectDiscussComment() {
        Optional<Discuss> optional = discussRepository.findById(1);
        if (optional.isPresent()) {
            System.out.println(optional.get());
        }
    }

    @Test
    public void selectCommentByKeys() {
        List<Discuss> list = discussRepository.findByAuthorNotNull();
        System.out.println(list);
    }

    @Test
    public void selectCommentPaged() {
        Pageable pageable = PageRequest.of(0, 3);
        List<Discuss> list = discussRepository.getDiscussPaged(1, pageable);
        System.out.println(list);
    }

    @Test
    public void selectCommentByExample() {
        Discuss discuss = new Discuss();
        discuss.setAuthor("文轩");
        Example<Discuss> example = Example.of(discuss);
        List<Discuss> list = discussRepository.findAll(example);
        System.out.println(list);
    }

    @Test
    public void selectCommentByExampleMatcher() {
        Discuss discuss = new Discuss();
        discuss.setAuthor("流星蝴蝶没有剑");
        ExampleMatcher exampleMatcher = ExampleMatcher.matching().withMatcher("author", startsWith());
        Example<Discuss> example = Example.of(discuss, exampleMatcher);
        List<Discuss> list = discussRepository.findAll(example);
        System.out.println(list);
    }
}
