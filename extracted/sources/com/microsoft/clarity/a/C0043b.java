package com.microsoft.clarity.a;

import com.microsoft.clarity.ClarityConfig;
import defpackage.bp2;
import defpackage.qp2;
import defpackage.tx8;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.microsoft.clarity.a.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0043b extends Lambda implements bp2 {
    public final /* synthetic */ ClarityConfig a;
    public final /* synthetic */ qp2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0043b(ClarityConfig clarityConfig, qp2 qp2Var) {
        super(0);
        this.a = clarityConfig;
        this.b = qp2Var;
    }

    @Override // defpackage.bp2
    public final Object invoke() {
        this.a.customSignalsCallback = this.b;
        return tx8.a;
    }
}
