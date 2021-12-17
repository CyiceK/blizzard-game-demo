package com.game.demo.utils.exception;

import java.util.Arrays;

/**
 * <p></p>
 *
 * @author: tzy
 * @date: 2021/12/17 12:03
 */
public enum SQLDuplicateKeyExceptionConstants {

    INDEX_EMAIL("user.INDEX_EMAIL", "邮箱重复"), INDEX_PHONE("user.INDEX_PHONE", "电话号码重复");

    private String index;

    private String result;

    SQLDuplicateKeyExceptionConstants(String index, String result){
        this.index = index;
        this.result = result;
    }

    SQLDuplicateKeyExceptionConstants(String index){
        this.index = index;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "SQLDuplicateKeyExceptionConstants{" +
                "index='" + index + '\'' +
                ", result='" + result + '\'' +
                '}';
    }

    public static SQLDuplicateKeyExceptionConstants analysis(String message){
        for (SQLDuplicateKeyExceptionConstants sqlDuplicateKeyExceptionConstants : SQLDuplicateKeyExceptionConstants.values()){
            if (sqlDuplicateKeyExceptionConstants.index.equals(message)){
                return sqlDuplicateKeyExceptionConstants;
            }
        }
        return null;
    }


}
