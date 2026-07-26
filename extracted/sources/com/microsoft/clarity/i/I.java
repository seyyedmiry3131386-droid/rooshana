package com.microsoft.clarity.i;

import com.microsoft.clarity.models.ingest.analytics.GAIDEvent;
import com.microsoft.clarity.models.ingest.analytics.GAIDOptOutEvent;
import com.microsoft.clarity.models.observers.ScreenMetadata;
import defpackage.bp2;
import defpackage.tx8;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class I extends Lambda implements bp2 {
    public final /* synthetic */ P a;
    public final /* synthetic */ String b;
    public final /* synthetic */ ScreenMetadata c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(P p, String str, ScreenMetadata screenMetadata) {
        super(0);
        this.a = p;
        this.b = str;
        this.c = screenMetadata;
    }

    @Override // defpackage.bp2
    public final Object invoke() {
        if (this.a.c().getAdsStorage()) {
            String string = this.a.h.c.getString("GAID", null);
            this.a.h.a(this.b);
            if (string != null && !string.equals(this.b)) {
                this.a.b(new GAIDOptOutEvent(System.currentTimeMillis(), this.c, string));
            }
            if (this.b != null) {
                this.a.b(new GAIDEvent(System.currentTimeMillis(), this.c, this.b));
            }
        }
        return tx8.a;
    }
}
