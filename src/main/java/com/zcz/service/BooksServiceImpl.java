package com.zcz.service;

import com.zcz.dao.BookMapper;
import com.zcz.pojo.Books;

import java.util.List;

/**
 * @Description: Bools业务实现层
 * @ClassName: BooksServiceImpl
 * @Author: ZCZ
 * @Date 2023年03月19日 22:53
 **/
public class BooksServiceImpl implements BooksService{
    // service层调用dao层： 组合Dao
    private BookMapper bookMapper;
    public void setBookMapper(BookMapper bookMapper){
        this.bookMapper=bookMapper;
    }

    public int addBookById(Books books) {
        return bookMapper.addBookById(books);
    }

    public int delBookById(int id) {
        return bookMapper.delBookById(id);
    }

    public int updateBookById(Books books) {
        return bookMapper.updateBookById(books);
    }

    public Books queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    public List<Books> queryBookByName(String bookName) {
        return bookMapper.queryBookByName(bookName);
    }

    public List<Books> queryAllBooks() {
        return bookMapper.queryAllBooks();

    }
}
