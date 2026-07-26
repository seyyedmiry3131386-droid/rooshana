package com.microsoft.clarity.c;

import defpackage.js3;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends Exception {
    public final String a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String str) {
        super(str);
        js3.p(str, "message");
        this.a = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.a;
    }
}
