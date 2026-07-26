package io.sentry.android.replay.gestures;

import android.view.View;
import android.view.Window;
import defpackage.dp2;
import defpackage.js3;
import defpackage.m91;
import io.sentry.SentryLevel;
import io.sentry.android.replay.ReplayIntegration;
import io.sentry.android.replay.d;
import io.sentry.b6;
import io.sentry.r;
import io.sentry.util.AutoClosableReentrantLock;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements d {
    public final b6 a;
    public final ReplayIntegration b;
    public final ArrayList c = new ArrayList();
    public final AutoClosableReentrantLock d = new AutoClosableReentrantLock();
    public final WeakHashMap e = new WeakHashMap();
    public final AutoClosableReentrantLock f = new AutoClosableReentrantLock();

    public b(b6 b6Var, ReplayIntegration replayIntegration) {
        this.a = b6Var;
        this.b = replayIntegration;
    }

    public final void a(View view) throws Exception {
        WeakHashMap weakHashMap = this.e;
        Window windowF = io.sentry.config.a.F(view);
        b6 b6Var = this.a;
        if (windowF == null) {
            b6Var.getLogger().i(SentryLevel.DEBUG, "Window is invalid, not tracking gestures", new Object[0]);
            return;
        }
        AutoClosableReentrantLock autoClosableReentrantLock = this.f;
        r rVarA = autoClosableReentrantLock.a();
        try {
            WeakReference weakReference = (WeakReference) weakHashMap.get(windowF);
            if ((weakReference != null ? (a) weakReference.get() : null) != null) {
                m91.i(rVarA, null);
                return;
            }
            m91.i(rVarA, null);
            a aVar = new a(b6Var, this.b, windowF.getCallback());
            windowF.setCallback(aVar);
            rVarA = autoClosableReentrantLock.a();
            try {
                weakHashMap.put(windowF, new WeakReference(aVar));
                m91.i(rVarA, null);
            } finally {
            }
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }

    @Override // io.sentry.android.replay.d
    public final void b(final View view, boolean z) throws Exception {
        js3.p(view, "root");
        r rVarA = this.d.a();
        ArrayList arrayList = this.c;
        try {
            if (z) {
                arrayList.add(new WeakReference(view));
                a(view);
            } else {
                d(view);
                kotlin.collections.a.B0(new dp2() { // from class: io.sentry.android.replay.gestures.GestureRecorder$onRootViewsChanged$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // defpackage.dp2
                    public final Object invoke(Object obj) {
                        WeakReference weakReference = (WeakReference) obj;
                        js3.p(weakReference, "it");
                        return Boolean.valueOf(js3.i(weakReference.get(), view));
                    }
                }, arrayList);
            }
            m91.i(rVarA, null);
        } finally {
        }
    }

    public final void c() throws Exception {
        ArrayList arrayList = this.c;
        r rVarA = this.d.a();
        try {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                View view = (View) ((WeakReference) it.next()).get();
                if (view != null) {
                    d(view);
                }
            }
            arrayList.clear();
            m91.i(rVarA, null);
        } finally {
        }
    }

    public final void d(View view) throws Exception {
        r rVarA;
        Window windowF = io.sentry.config.a.F(view);
        if (windowF == null) {
            this.a.getLogger().i(SentryLevel.DEBUG, "Window was null in stopGestureTracking", new Object[0]);
            return;
        }
        Window.Callback callback = windowF.getCallback();
        if (callback instanceof a) {
            windowF.setCallback(((a) callback).a);
            rVarA = this.f.a();
            try {
                m91.i(rVarA, null);
                return;
            } finally {
                try {
                    throw th;
                } finally {
                }
            }
        }
        rVarA = this.f.a();
        try {
            WeakReference weakReference = (WeakReference) this.e.get(windowF);
            a aVar = weakReference != null ? (a) weakReference.get() : null;
            m91.i(rVarA, null);
            if (aVar != null) {
                aVar.c = null;
            }
        } catch (Throwable th) {
        }
    }
}
