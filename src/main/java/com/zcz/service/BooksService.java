package com.zcz.service;

import com.zcz.pojo.Books;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * @Description: Books业务层
 * @InterfaceName: BooksService
 * @Author: ZCZ
 * @Date 2023年03月19日 22:52
 **/
public interface BooksService {
    /**
     * @Description: 添加书籍
     * @Date: 2023/3/19
     * @Param: [books]
     * @return: int
     **/
    int addBookById(Books books);

    /***
     * @Description: 通过Id删除一本书
     * @Date: 2023/3/19
     * @Param: [id]
     * @return: int
     **/
    int delBookById( int id);

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
    Books queryBookById( int id);

    /***
     * @Description: 查询全部的书
     * @Date: 2023/3/19
     * @Param: []
     * @return: java.util.List<com.zcz.pojo.Books>
     **/
    List<Books> queryAllBooks();

    /**
     * @Description: 根据书籍名称查询对应书籍
     * @Date: 2023/3/23
     * @Param: [bookName]
     * @return: java.util.List<com.zcz.pojo.Books>
     **/
    List<Books> queryBookByName( String bookName);
}
