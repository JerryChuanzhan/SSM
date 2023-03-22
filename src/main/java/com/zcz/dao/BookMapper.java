package com.zcz.dao;

import com.zcz.pojo.Books;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.PathVariable;

import java.awt.print.Book;
import java.util.List;

/**
 * @Description: BookMapper
 * @InterfaceName: BookMapper
 * @Author: ZCZ
 * @Date 2023年03月19日 22:28
 **/
public interface BookMapper {
    /**
     * @Description: 通过Id添加一本书
     * @Date: 2023/3/19
     * @Param: [id]
     * @return: int
     **/
    int addBookById(Books books);

    /***
     * @Description: 通过Id删除一本书
     * @Date: 2023/3/19
     * @Param: [id]
     * @return: int
     **/
    int delBookById(@Param("bookId") int id);

    /***
     * @Description: 更新对应id书的信息
     * @Date: 2023/3/19
     * @Param: [id]
     * @return: int
     **/
    int updateBookById(Books books);

    /***
     * @Description: 通过id查询对应书
     * @Date: 2023/3/19
     * @Param: [id]
     * @return: com.zcz.pojo.Books
     **/
    Books queryBookById(@Param("bookId") int id);

    /***
     * @Description: 查询全部的书
     * @Date: 2023/3/19 
     * @Param: []
     * @return: java.util.List<com.zcz.pojo.Books>
     **/
    List<Books> queryAllBooks();

    /**
     * @Description: 根据书籍名称查询对应书籍
     * @Date: 2023/3/22
     * @Param: [bookName]
     * @return: java.util.List<com.zcz.pojo.Books>
     **/
    List<Books> queryBookByName(@PathVariable("bookName") String bookName);
}
