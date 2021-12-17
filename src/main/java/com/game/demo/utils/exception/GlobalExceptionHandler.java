package com.game.demo.utils.exception;

import com.game.demo.utils.api.CommonResult;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.sql.SQLIntegrityConstraintViolationException;

/**
 * <p></p>
 *
 * @author: tzy
 * @date: 2021/12/9 13:02
 */

@ControllerAdvice
public class GlobalExceptionHandler {

    @ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR)
    @ResponseBody
    @ExceptionHandler(value = ApiException.class)
    public CommonResult<String> handle(ApiException e) {
        if (e.getErrorCode() != null) {
            return CommonResult.failed(e.getErrorCode());
        }
        return CommonResult.failed(e.getMessage());
    }

    @ResponseStatus(code = HttpStatus.NOT_FOUND)
    @ResponseBody
    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public CommonResult<String> handleValidException(MethodArgumentNotValidException e) {
        BindingResult bindingResult = e.getBindingResult();
        String message = null;
        if (bindingResult.hasErrors()) {
            FieldError fieldError = bindingResult.getFieldError();
            if (fieldError != null) {
                message = fieldError.getField()+fieldError.getDefaultMessage();
            }
        }
        return CommonResult.validateFailed(message);
    }


    @ResponseStatus(code = HttpStatus.NOT_FOUND)
    @ResponseBody
    @ExceptionHandler(value = BindException.class)
    public CommonResult<String> handleValidException(BindException e) {
        // TODO 提取错误信息?
        BindingResult bindingResult = e.getBindingResult();
        String message = null;
        if (bindingResult.hasErrors()) {
            FieldError fieldError = bindingResult.getFieldError();
            if (fieldError != null) {
                message = fieldError.getField()+fieldError.getDefaultMessage();
            }
        }
        return CommonResult.validateFailed(message);
    }

    @ResponseStatus(code = HttpStatus.NOT_FOUND)
    @ResponseBody
    @ExceptionHandler(value = DuplicateKeyException.class)
    public CommonResult<String> handleValidException(DuplicateKeyException e) {
        String a = e.getCause().getMessage();
        int b = a.lastIndexOf("'", a.length() - 2);
        String c = a.substring(b + 1, a.length() - 1);
        SQLDuplicateKeyExceptionConstants message = SQLDuplicateKeyExceptionConstants.analysis(c);
        if (message == null){
            throw new RuntimeException("请输入对应的SQLDuplicateKeyExceptionConstants类");
        }
        return CommonResult.validateFailed(message.getResult());
    }


    // TODO 待优化
    @ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR)
    @ResponseBody
    @ExceptionHandler(value = RuntimeException.class)
    public CommonResult<String> handleValidException(RuntimeException e) {
        return CommonResult.validateFailed(e.getMessage());
    }
}
