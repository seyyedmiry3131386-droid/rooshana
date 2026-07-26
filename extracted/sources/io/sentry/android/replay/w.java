package io.sentry.android.replay;

import android.graphics.Point;
import android.view.View;
import android.view.ViewTreeObserver;
import defpackage.js3;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public final class w implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ x a;
    public final /* synthetic */ View b;

    public w(x xVar, View view) {
        this.a = xVar;
        this.b = view;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        x xVar = this.a;
        Point point = xVar.h;
        WeakReference weakReference = (WeakReference) kotlin.collections.a.v0(xVar.g);
        View view = weakReference != null ? (View) weakReference.get() : null;
        View view2 = this.b;
        if (!js3.i(view2, view)) {
            io.sentry.android.replay.util.h.c(view2, this);
            return true;
        }
        js3.p(view2, "<this>");
        if (view2.getWidth() > 0 && view2.getHeight() > 0) {
            io.sentry.android.replay.util.h.c(view2, this);
            if (view2.getWidth() == point.x && view2.getHeight() == point.y) {
                return true;
            }
            point.set(view2.getWidth(), view2.getHeight());
            xVar.c.l0(view2.getWidth(), view2.getHeight());
        }
        return true;
    }
}
