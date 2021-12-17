package com.game.demo.common.security.ban;

import com.game.demo.common.security.annotion.BanUserSign;

/**
 * <p></p>
 *
 * @author: tzy
 * @date: 2021/12/17 19:16
 */

public interface AbstractBanUser {

    /**
     * 输入token将token保存到黑名单中使其作废
     * @param token
     */
    public Boolean set(String token);

    /**
     * 验证token是否存在黑名单中
     * @param token
     */
    public Boolean get(String token);
}
