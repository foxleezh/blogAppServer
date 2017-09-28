package com.app.server.util;

import com.sun.istack.internal.Nullable;

public class Util {
    public static boolean isEmpty(@Nullable CharSequence str) {
        if (str == null || str.length() == 0)
            return true;
        else
            return false;
    }
}
