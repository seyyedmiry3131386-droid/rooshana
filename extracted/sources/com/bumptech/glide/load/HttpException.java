package com.bumptech.glide.load;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class HttpException extends IOException {
    private static final long serialVersionUID = 1;

    public HttpException(int i, IOException iOException, String str) {
        super(str + ", status code: " + i, iOException);
    }
}
