package com.game.demo.utils.exception;

import com.game.demo.utils.api.IErrorCode;

/**
 * <p></p>
 *
 * @author: tzy
 * @date: 2021/12/9 13:02
 */
public class Asserts {
    public static void fail(String message) {
        throw new ApiException(message);
    }

    public static void fail(IErrorCode errorCode) {
        throw new ApiException(errorCode);
    }
}
