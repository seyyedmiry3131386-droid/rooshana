package com.microsoft.clarity.k;

import com.microsoft.clarity.i.C0080b;
import com.microsoft.clarity.models.telemetry.ErrorType;
import defpackage.dp2;
import defpackage.js3;
import defpackage.tx8;
import java.util.Iterator;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class C extends Lambda implements dp2 {
    public final /* synthetic */ G a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(G g) {
        super(1);
        this.a = g;
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        Exception exc = (Exception) obj;
        js3.p(exc, "it");
        G g = this.a;
        ErrorType errorType = ErrorType.WebViewChannelMessageProcessing;
        Iterator it = g.b.iterator();
        while (it.hasNext()) {
            ((C0080b) it.next()).a(exc, errorType);
        }
        return tx8.a;
    }
}
