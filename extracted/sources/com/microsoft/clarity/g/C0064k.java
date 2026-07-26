package com.microsoft.clarity.g;

import android.graphics.Rect;
import android.view.ViewTreeObserver;
import defpackage.js3;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.microsoft.clarity.g.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0064k {
    public final WeakReference a;
    public boolean b;
    public Rect c;
    public Rect d;
    public final ViewTreeObserver.OnDrawListener e;
    public long f;

    public C0064k(WeakReference weakReference, Rect rect, Rect rect2, ViewTreeObserver.OnDrawListener onDrawListener) {
        js3.p(weakReference, "ref");
        js3.p(onDrawListener, "onDrawListener");
        this.a = weakReference;
        this.b = true;
        this.c = rect;
        this.d = rect2;
        this.e = onDrawListener;
        this.f = 0L;
    }
}
