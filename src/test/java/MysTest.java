import com.zcz.pojo.Books;
import com.zcz.service.BooksService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description: 测试
 * @ClassName: MysTest
 * @Author: ZCZ
 * @Date 2023年03月21日 23:42
 **/
public class MysTest {

    @Test
    public void test(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BooksService booksServiceImpl = (BooksService) context.getBean("BooksServiceImpl");
        for (Books queryAllBook : booksServiceImpl.queryAllBooks()) {
            System.out.println(queryAllBook);
        }
    }
}
