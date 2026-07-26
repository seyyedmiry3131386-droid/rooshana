package com.microsoft.clarity.i;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.microsoft.clarity.SessionStartedCallback;
import com.microsoft.clarity.g.C0074v;
import com.microsoft.clarity.g.C0075w;
import com.microsoft.clarity.g.C0076x;
import com.microsoft.clarity.g.h0;
import com.microsoft.clarity.k.InterfaceC0098d;
import com.microsoft.clarity.models.telemetry.ErrorType;
import defpackage.js3;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public final class t implements com.microsoft.clarity.l.b {
    public final q a;
    public final P b;
    public final h0 c;

    public t(Context context, q qVar, P p, h0 h0Var, InterfaceC0098d interfaceC0098d) {
        js3.p(context, "context");
        js3.p(qVar, "captureManager");
        js3.p(p, "sessionManager");
        js3.p(h0Var, "telemetryTracker");
        js3.p(interfaceC0098d, "lifecycleObserver");
        this.a = qVar;
        this.b = p;
        this.c = h0Var;
        com.microsoft.clarity.q.l.d("Register callback.");
        ((com.microsoft.clarity.k.l) interfaceC0098d).b.add(this);
        r rVar = new r(this);
        com.microsoft.clarity.q.l.b("Register a callback.");
        qVar.k.add(rVar);
    }

    @Override // com.microsoft.clarity.l.a
    public final void a(Exception exc, ErrorType errorType) {
        js3.p(exc, "exception");
        js3.p(errorType, "errorType");
    }

    public final void b(View view) {
        js3.p(view, "view");
        q qVar = this.a;
        C0076x c0076x = qVar.l;
        c0076x.getClass();
        kotlin.collections.a.C0(c0076x.g, new C0075w(view));
        c0076x.h.add(new WeakReference(view));
        qVar.a(true);
    }

    @Override // com.microsoft.clarity.l.b
    public final void onActivityDestroyed(Activity activity2) {
        js3.p(activity2, "activity");
    }

    @Override // com.microsoft.clarity.l.b
    public final void onActivityPaused(Activity activity2) {
        js3.p(activity2, "activity");
        this.c.a();
    }

    @Override // com.microsoft.clarity.l.b
    public final void onActivityResumed(Activity activity2) {
        js3.p(activity2, "activity");
    }

    public final void a(View view) {
        js3.p(view, "view");
        q qVar = this.a;
        C0076x c0076x = qVar.l;
        c0076x.getClass();
        kotlin.collections.a.C0(c0076x.h, new C0074v(view));
        c0076x.g.add(new WeakReference(view));
        qVar.a(true);
    }

    public final void a(SessionStartedCallback sessionStartedCallback) {
        String strA;
        js3.p(sessionStartedCallback, "callback");
        P p = this.b;
        synchronized (p.m) {
            try {
                if (p.l == null && (strA = u.a(p)) != null) {
                    sessionStartedCallback.invoke((Object) strA);
                    p.m = strA;
                }
                p.l = sessionStartedCallback;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
