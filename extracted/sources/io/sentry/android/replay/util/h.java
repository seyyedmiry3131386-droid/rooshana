package io.sentry.android.replay.util;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.compose.ui.node.Owner;
import defpackage.f88;
import defpackage.js3;
import defpackage.y;
import io.sentry.SentryLevel;
import io.sentry.android.replay.w;
import io.sentry.u0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h {
    public static final void a(View view, ViewTreeObserver.OnDrawListener onDrawListener) {
        js3.p(onDrawListener, "listener");
        if (view == null || view.getViewTreeObserver() == null || !view.getViewTreeObserver().isAlive()) {
            return;
        }
        try {
            view.getViewTreeObserver().addOnDrawListener(onDrawListener);
        } catch (IllegalStateException unused) {
        }
    }

    public static final Pair b(View view) {
        if (!view.isAttachedToWindow()) {
            return new Pair(Boolean.FALSE, null);
        }
        if (view.getWindowVisibility() != 0) {
            return new Pair(Boolean.FALSE, null);
        }
        Object parent = view;
        while (parent instanceof View) {
            float transitionAlpha = Build.VERSION.SDK_INT >= 29 ? ((View) parent).getTransitionAlpha() : 1.0f;
            View view2 = (View) parent;
            if (view2.getAlpha() <= 0.0f || transitionAlpha <= 0.0f || view2.getVisibility() != 0) {
                return new Pair(Boolean.FALSE, null);
            }
            parent = view2.getParent();
        }
        Rect rect = new Rect();
        return new Pair(Boolean.valueOf(view.getGlobalVisibleRect(rect, new Point())), rect);
    }

    public static final void c(View view, w wVar) {
        if (view == null || view.getViewTreeObserver() == null || !view.getViewTreeObserver().isAlive()) {
            return;
        }
        try {
            view.getViewTreeObserver().removeOnPreDrawListener(wVar);
        } catch (IllegalStateException unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(View view, io.sentry.android.replay.viewhierarchy.f fVar, y yVar, u0 u0Var, List list) {
        androidx.compose.ui.node.h root;
        js3.p(yVar, "options");
        js3.p(u0Var, "logger");
        if (view instanceof ViewGroup) {
            Object obj = io.sentry.android.replay.viewhierarchy.a.a;
            if (f88.c0(view.getClass().getName(), "AndroidComposeView", false)) {
                try {
                    Owner owner = view instanceof Owner ? (Owner) view : null;
                    if (owner != null && (root = owner.getRoot()) != null) {
                        io.sentry.android.replay.viewhierarchy.a.b(root, fVar, true, yVar, u0Var);
                        return;
                    }
                } catch (Throwable th) {
                    u0Var.e(SentryLevel.ERROR, th, "Error traversing Compose tree. Most likely you're using an unsupported version of\nandroidx.compose.ui:ui. The minimum supported version is 1.5.0. If it's a newer\nversion, please open a github issue with the version you're using, so we can add\nsupport for it.", new Object[0]);
                }
            }
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 0) {
                return;
            }
            ArrayList arrayList = new ArrayList(viewGroup.getChildCount());
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt != null) {
                    io.sentry.android.replay.viewhierarchy.f fVarW = io.sentry.config.a.w(childAt, fVar, viewGroup.indexOfChild(childAt), yVar);
                    arrayList.add(fVarW);
                    if (list != null && (fVarW instanceof io.sentry.android.replay.viewhierarchy.d) && fVarW.e) {
                        list.add(fVarW);
                    }
                    d(childAt, fVarW, yVar, u0Var, list);
                }
            }
            fVar.g = arrayList;
        }
    }
}
