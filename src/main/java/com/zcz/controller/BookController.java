package com.zcz.controller;

import com.zcz.pojo.Books;
import com.zcz.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description: Book控制器
 * @ClassName: BookController
 * @Author: ZCZ
 * @Date 2023年03月21日 23:24
 **/
@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    @Qualifier("BooksServiceImpl")
    private BooksService booksService;
    // 查询全部的书籍，并且返回到一个书籍展示页面
    @RequestMapping("/allBook")
    public String list(Model model){
        List<Books> books = booksService.queryAllBooks();
        model.addAttribute("list",books);
        return "allBook";
    }
    // 跳转到增加书籍页面
    @RequestMapping("/toAddBook")
    public String toAddPager(){
        return "addBook";
    }

    // 添加书籍的请求
    @RequestMapping("/addBook")
    public String addBook(Books books){
        System.out.println("addBooks->"+books);
        int flag = booksService.addBookById(books);
        return "redirect:/book/allBook";// 重定向@RequestMapping("/allBook")请求
    }
    // 跳转到修改页面
    @RequestMapping("/toUpdBook")
    public String toUpaPager(int id,Model model){
        Books books = booksService.queryBookById(id);
        model.addAttribute("book",books);
        return "updBook";
    }
    // 修改书籍的请求
    @RequestMapping("/updBook")
    public String updBook(Books books){

        System.out.println("updBooks->"+books);
        int flag = booksService.updateBookById(books);
        return "redirect:/book/allBook";// 重定向@RequestMapping("/allBook")请求
    }

    // 删除书籍的请求
    @RequestMapping("/del/{BookId}")
    public String delBook(@PathVariable("BookId") int id){
        int flag = booksService.delBookById(id);
        return "redirect:/book/allBook";// 重定向@RequestMapping("/allBook")请求
    }

    // 根据书籍名称搜索书籍的请求
    @RequestMapping("/queryBookByName")
    public String queryBookByName(String queryBookName,Model model){
        List<Books> books = booksService.queryBookByName(queryBookName);
        model.addAttribute("list",books);
        return "/allBook";// 重定向@RequestMapping("/allBook")请求
    }

    // // 跳转到修改页面
    // @RequestMapping(value = "/{id}")
    // public String toAllPager(@PathVariable("page") String toPage){
    //     return toPage;
    // }

}
