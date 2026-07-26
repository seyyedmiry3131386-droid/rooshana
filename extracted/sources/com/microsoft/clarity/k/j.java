package com.microsoft.clarity.k;

import android.app.Activity;
import com.microsoft.clarity.models.LogLevel;
import defpackage.bp2;
import defpackage.js3;
import defpackage.tx8;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends Lambda implements bp2 {
    public final /* synthetic */ l a;
    public final /* synthetic */ Activity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l lVar, Activity activity2) {
        super(0);
        this.a = lVar;
        this.b = activity2;
    }

    @Override // defpackage.bp2
    public final Object invoke() {
        WeakReference weakReference = this.a.e;
        boolean z = js3.i(weakReference != null ? (Activity) weakReference.get() : null, this.b) && this.a.c.get(Integer.valueOf(this.b.hashCode())) == EnumC0099e.ON_RESUME;
        if (!z) {
            l lVar = this.a;
            Activity activity2 = this.b;
            lVar.getClass();
            js3.p(activity2, "activity");
            lVar.c.put(Integer.valueOf(activity2.hashCode()), EnumC0099e.ON_RESUME);
            lVar.d = new WeakReference(activity2);
        }
        if (this.a.g && !z) {
            LogLevel logLevel = com.microsoft.clarity.q.l.a;
            com.microsoft.clarity.q.l.d(this.b + " is resumed.");
            Iterator it = this.a.b.iterator();
            while (it.hasNext()) {
                ((com.microsoft.clarity.l.b) it.next()).onActivityResumed(this.b);
            }
            this.a.e = new WeakReference(this.b);
        }
        return tx8.a;
    }
}
