package com.microsoft.clarity.a;

import com.microsoft.clarity.ClarityConfig;
import defpackage.bp2;
import defpackage.tx8;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.microsoft.clarity.a.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0045d extends Lambda implements bp2 {
    public final /* synthetic */ ClarityConfig a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0045d(ClarityConfig clarityConfig, String str) {
        super(0);
        this.a = clarityConfig;
        this.b = str;
    }

    @Override // defpackage.bp2
    public final Object invoke() {
        this.a.userId = this.b;
        return tx8.a;
    }
}
