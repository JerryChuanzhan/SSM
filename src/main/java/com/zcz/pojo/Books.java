package com.zcz.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description: Books实体类
 * @ClassName: Books
 * @Author: ZCZ
 * @Date 2023年03月19日 22:11
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Books {
    /**
     * 书id
     */
    private Integer bookID;
    /**
     * 书名
     */
    private String bookName;
    /**
     * 数量
     */
    private Integer bookCounts;
    /**
     * 描述
     */
    private String detail;

}
