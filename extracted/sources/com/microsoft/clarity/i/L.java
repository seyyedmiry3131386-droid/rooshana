package com.microsoft.clarity.i;

import com.microsoft.clarity.models.ingest.analytics.VariableEvent;
import com.microsoft.clarity.models.observers.ScreenMetadata;
import defpackage.bp2;
import defpackage.tx8;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class L extends Lambda implements bp2 {
    public final /* synthetic */ P a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Set c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(P p, String str, Set set) {
        super(0);
        this.a = p;
        this.b = str;
        this.c = set;
    }

    @Override // defpackage.bp2
    public final Object invoke() {
        P p = this.a;
        ScreenMetadata screenMetadata = p.v;
        if (screenMetadata != null) {
            p.b(new VariableEvent(p.r, screenMetadata, kotlin.collections.b.M(new Pair(this.b, this.c))));
        }
        this.a.D.put(this.b, this.c);
        return tx8.a;
    }
}
