package com.microsoft.clarity.i;

import com.microsoft.clarity.models.ingest.analytics.VariableEvent;
import com.microsoft.clarity.models.observers.ScreenMetadata;
import defpackage.a77;
import defpackage.bp2;
import defpackage.tx8;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class K extends Lambda implements bp2 {
    public final /* synthetic */ P a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(P p, String str) {
        super(0);
        this.a = p;
        this.b = str;
    }

    @Override // defpackage.bp2
    public final Object invoke() {
        ScreenMetadata screenMetadata;
        P p = this.a;
        if (p.o == null && (screenMetadata = p.v) != null) {
            p.b(new VariableEvent(p.r, screenMetadata, kotlin.collections.b.M(new Pair("sessionId", a77.p(this.b)))));
        }
        this.a.o = this.b;
        return tx8.a;
    }
}
