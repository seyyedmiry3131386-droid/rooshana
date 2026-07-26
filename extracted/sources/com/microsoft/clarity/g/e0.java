package com.microsoft.clarity.g;

import com.microsoft.clarity.models.LogLevel;
import defpackage.dp2;
import defpackage.js3;
import defpackage.tx8;
import defpackage.wu8;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class e0 extends Lambda implements dp2 {
    public static final e0 a = new e0();

    public e0() {
        super(1);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        Exception exc = (Exception) obj;
        js3.p(exc, "it");
        LogLevel logLevel = com.microsoft.clarity.q.l.a;
        if (com.microsoft.clarity.q.l.a(LogLevel.Error)) {
            com.microsoft.clarity.q.l.c(exc.getMessage());
            com.microsoft.clarity.q.l.c(wu8.I(exc));
        }
        return tx8.a;
    }
}
