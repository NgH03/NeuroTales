package com.bcilab.neurotales.utils;

import com.bcilab.neurotales.model.context.LoginUserContext;

public class UserContextHolder {

    // 使用静态final保证全局唯一
    private static final ThreadLocal<LoginUserContext> contextHolder = new ThreadLocal<>();

    public static void setCurrentUser(LoginUserContext user) {
        contextHolder.set(user);
    }

    public static LoginUserContext getCurrentUser() {
        return contextHolder.get();
    }

    public static void clear(){
        contextHolder.remove();
    }

}
