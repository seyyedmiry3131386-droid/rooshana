package com.microsoft.clarity.i;

import android.app.Activity;
import com.microsoft.clarity.models.observers.ScreenMetadata;
import defpackage.bp2;
import defpackage.dp2;
import kotlin.jvm.internal.Ref$LongRef;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: renamed from: com.microsoft.clarity.i.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC0094p implements Runnable {
    public boolean a = true;
    public final /* synthetic */ q b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Activity d;

    public RunnableC0094p(q qVar, int i, Activity activity2) {
        this.b = qVar;
        this.c = i;
        this.d = activity2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Ref$LongRef ref$LongRef = new Ref$LongRef();
        ref$LongRef.a = com.microsoft.clarity.a.L.a;
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.a = new ScreenMetadata("", "", 0);
        com.microsoft.clarity.q.g.a((bp2) new C0091m(this.b, this.c, ref$ObjectRef, this.d, this, ref$LongRef), (dp2) new C0092n(this.b, ref$ObjectRef), new C0093o(this.b, this, ref$LongRef), 18);
    }
}
