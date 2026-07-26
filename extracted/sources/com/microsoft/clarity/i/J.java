package com.microsoft.clarity.i;

import com.microsoft.clarity.models.observers.ScreenMetadata;
import defpackage.dp2;
import defpackage.tx8;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class J extends Lambda implements dp2 {
    public final /* synthetic */ P a;
    public final /* synthetic */ ScreenMetadata b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(P p, ScreenMetadata screenMetadata) {
        super(1);
        this.a = p;
        this.b = screenMetadata;
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        P p = this.a;
        p.F.add(new I(p, (String) obj, this.b));
        return tx8.a;
    }
}
