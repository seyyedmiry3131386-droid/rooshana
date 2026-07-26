package com.microsoft.clarity.c;

import defpackage.js3;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String str) {
        super(str);
        js3.p(str, "message");
    }
}
