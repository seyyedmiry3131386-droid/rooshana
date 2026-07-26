package com.microsoft.clarity.a;

import com.microsoft.clarity.ClarityConfig;
import com.microsoft.clarity.models.ApplicationFramework;
import defpackage.bp2;
import defpackage.tx8;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.microsoft.clarity.a.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0042a extends Lambda implements bp2 {
    public final /* synthetic */ ClarityConfig a;
    public final /* synthetic */ ApplicationFramework b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0042a(ClarityConfig clarityConfig, ApplicationFramework applicationFramework) {
        super(0);
        this.a = clarityConfig;
        this.b = applicationFramework;
    }

    @Override // defpackage.bp2
    public final Object invoke() {
        this.a.applicationFramework = this.b;
        return tx8.a;
    }
}
