package com.microsoft.clarity.k;

import android.os.Handler;
import android.os.Looper;
import android.view.Window;
import com.microsoft.clarity.i.C0079a;
import com.microsoft.clarity.models.LogLevel;
import com.microsoft.clarity.models.ingest.analytics.AnalyticsEvent;
import com.microsoft.clarity.models.observers.ScreenMetadata;
import com.microsoft.clarity.models.observers.UserInteraction;
import com.microsoft.clarity.models.viewhierarchy.EditTextInfo;
import defpackage.js3;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class s {
    public ScreenMetadata c;
    public boolean d;
    public EditTextInfo e;
    public final ArrayList a = new ArrayList();
    public final Handler b = new Handler(Looper.getMainLooper());
    public final r f = new r(this);

    public final void a(Window window) {
        js3.p(window, "window");
        LogLevel logLevel = com.microsoft.clarity.q.l.a;
        com.microsoft.clarity.q.l.b("Clear window callback for " + window + '.');
        int iHashCode = window.hashCode();
        Runnable runnable = (Runnable) this.f.a.get(Integer.valueOf(iHashCode));
        if (runnable != null) {
            this.b.removeCallbacks(runnable);
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof q) {
            window.setCallback(((q) callback).b);
        }
        q qVar = (q) this.f.b.get(Integer.valueOf(iHashCode));
        if (qVar != null) {
            qVar.d = false;
        }
        r rVar = this.f;
        rVar.b.remove(Integer.valueOf(iHashCode));
        rVar.c.remove(Integer.valueOf(iHashCode));
        rVar.a.remove(Integer.valueOf(iHashCode));
        rVar.d.remove(Integer.valueOf(iHashCode));
    }

    public final void a(AnalyticsEvent analyticsEvent) {
        if (!js3.i(analyticsEvent.getScreenMetadata(), this.c)) {
            com.microsoft.clarity.q.l.b("Dropping analytics event from an old screen.");
            return;
        }
        if (this.d) {
            return;
        }
        for (C0079a c0079a : this.a) {
            c0079a.getClass();
            c0079a.a.i.add(new UserInteraction(analyticsEvent));
        }
    }
}
