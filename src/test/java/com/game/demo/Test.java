package com.game.demo;

import com.game.demo.utils.exception.SQLDuplicateKeyExceptionConstants;

import java.util.Arrays;

/**
 * <p></p>
 *
 * @author: tzy
 * @date: 2021/12/17 12:28
 */
public class Test {
    public static void main(String[] args) {
        //SQLDuplicateKeyExceptionConstants commonConstant = SQLDuplicateKeyExceptionConstants.valueOf("user.INDEX_EMAIL");
        //System.out.println(Arrays.toString(SQLDuplicateKeyExceptionConstants.values()));
        ;
        System.out.println(SQLDuplicateKeyExceptionConstants.valueOf("INDEX_EMAIL"));
        //System.out.println(SQLDuplicateKeyExceptionConstants.INDEX_EMAIL);
    }
}
