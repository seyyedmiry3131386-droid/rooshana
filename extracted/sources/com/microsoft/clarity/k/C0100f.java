package com.microsoft.clarity.k;

import android.app.Activity;
import com.microsoft.clarity.models.LogLevel;
import defpackage.bp2;
import defpackage.tx8;
import java.util.Iterator;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.microsoft.clarity.k.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0100f extends Lambda implements bp2 {
    public final /* synthetic */ l a;
    public final /* synthetic */ Activity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0100f(l lVar, Activity activity2) {
        super(0);
        this.a = lVar;
        this.b = activity2;
    }

    @Override // defpackage.bp2
    public final Object invoke() {
        this.a.c.remove(Integer.valueOf(this.b.hashCode()));
        if (this.a.g) {
            LogLevel logLevel = com.microsoft.clarity.q.l.a;
            com.microsoft.clarity.q.l.d(this.b + " is destroyed.");
            Iterator it = this.a.b.iterator();
            while (it.hasNext()) {
                ((com.microsoft.clarity.l.b) it.next()).onActivityDestroyed(this.b);
            }
        }
        return tx8.a;
    }
}
