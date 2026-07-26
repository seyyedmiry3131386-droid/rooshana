package com.microsoft.clarity.k;

import com.microsoft.clarity.i.C0079a;
import com.microsoft.clarity.models.telemetry.ErrorType;
import defpackage.dp2;
import defpackage.js3;
import defpackage.tx8;
import java.util.Iterator;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class p extends Lambda implements dp2 {
    public final /* synthetic */ s a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(s sVar) {
        super(1);
        this.a = sVar;
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        Exception exc = (Exception) obj;
        js3.p(exc, "it");
        s sVar = this.a;
        ErrorType errorType = ErrorType.CapturingTouchEvent;
        Iterator it = sVar.a.iterator();
        while (it.hasNext()) {
            ((C0079a) it.next()).a(exc, errorType);
        }
        return tx8.a;
    }
}
