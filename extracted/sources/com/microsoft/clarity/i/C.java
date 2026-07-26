package com.microsoft.clarity.i;

import com.microsoft.clarity.models.ingest.mutation.MutationErrorEvent;
import com.microsoft.clarity.models.observers.ErrorDisplayFrame;
import defpackage.bp2;
import defpackage.tx8;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class C extends Lambda implements bp2 {
    public final /* synthetic */ P a;
    public final /* synthetic */ ErrorDisplayFrame b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(P p, ErrorDisplayFrame errorDisplayFrame) {
        super(0);
        this.a = p;
        this.b = errorDisplayFrame;
    }

    @Override // defpackage.bp2
    public final Object invoke() throws Throwable {
        if (this.a.p != null) {
            long timestamp = this.b.getTimestamp();
            P p = this.a;
            if (timestamp >= p.r) {
                if (p.e()) {
                    com.microsoft.clarity.q.l.b("Dropping Error Frame because current page payload count has been exceeded");
                } else {
                    this.a.a(this.b.getTimestamp(), this.b.getScreenMetadata());
                    this.a.a(new MutationErrorEvent(this.b.getTimestamp(), this.b.getReason()));
                }
            }
        }
        return tx8.a;
    }
}
