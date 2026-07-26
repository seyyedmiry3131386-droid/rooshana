package com.microsoft.clarity.a;

import com.microsoft.clarity.ClarityConfig;
import com.microsoft.clarity.models.LogLevel;
import defpackage.bp2;
import defpackage.tx8;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.microsoft.clarity.a.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0044c extends Lambda implements bp2 {
    public final /* synthetic */ ClarityConfig a;
    public final /* synthetic */ LogLevel b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0044c(ClarityConfig clarityConfig, LogLevel logLevel) {
        super(0);
        this.a = clarityConfig;
        this.b = logLevel;
    }

    @Override // defpackage.bp2
    public final Object invoke() {
        this.a.logLevel = this.b;
        return tx8.a;
    }
}
