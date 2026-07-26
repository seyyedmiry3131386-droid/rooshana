package com.microsoft.clarity.k;

import com.microsoft.clarity.models.telemetry.ErrorType;
import defpackage.dp2;
import defpackage.js3;
import defpackage.tx8;
import java.util.Iterator;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends Lambda implements dp2 {
    public final /* synthetic */ l a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(l lVar) {
        super(1);
        this.a = lVar;
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        Exception exc = (Exception) obj;
        js3.p(exc, "it");
        l lVar = this.a;
        ErrorType errorType = ErrorType.ActivityLifecycle;
        Iterator it = lVar.b.iterator();
        while (it.hasNext()) {
            ((com.microsoft.clarity.l.b) it.next()).a(exc, errorType);
        }
        return tx8.a;
    }
}
