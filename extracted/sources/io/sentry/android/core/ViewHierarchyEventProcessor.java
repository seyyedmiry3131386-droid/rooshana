package io.sentry.android.core;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.ui.node.Owner;
import defpackage.fv1;
import defpackage.js3;
import defpackage.m91;
import defpackage.ma0;
import io.sentry.SentryLevel;
import io.sentry.c6;
import io.sentry.compose.viewhierarchy.ComposeViewHierarchyExporter;
import io.sentry.g5;
import io.sentry.w4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class ViewHierarchyEventProcessor implements io.sentry.b0 {
    public final SentryAndroidOptions a;
    public final fv1 b;

    public ViewHierarchyEventProcessor(SentryAndroidOptions sentryAndroidOptions) {
        io.sentry.config.a.W(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.a = sentryAndroidOptions;
        this.b = new fv1(3, 2000L);
        if (sentryAndroidOptions.isAttachViewHierarchy()) {
            io.sentry.config.a.a("ViewHierarchy");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(View view, io.sentry.protocol.i0 i0Var, List list) throws Exception {
        if (view instanceof ViewGroup) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ComposeViewHierarchyExporter composeViewHierarchyExporter = (ComposeViewHierarchyExporter) it.next();
                composeViewHierarchyExporter.getClass();
                if (view instanceof Owner) {
                    if (composeViewHierarchyExporter.b == null) {
                        io.sentry.r rVarA = composeViewHierarchyExporter.c.a();
                        try {
                            if (composeViewHierarchyExporter.b == null) {
                                composeViewHierarchyExporter.b = new io.sentry.compose.b(composeViewHierarchyExporter.a);
                            }
                            m91.i(rVarA, null);
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                m91.i(rVarA, th);
                                throw th2;
                            }
                        }
                    }
                    androidx.compose.ui.node.h root = ((Owner) view).getRoot();
                    io.sentry.compose.b bVar = composeViewHierarchyExporter.b;
                    js3.m(bVar);
                    ComposeViewHierarchyExporter.a(bVar, i0Var, root);
                    return;
                }
            }
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            if (childCount == 0) {
                return;
            }
            ArrayList arrayList = new ArrayList(childCount);
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt != null) {
                    io.sentry.protocol.i0 i0VarC = c(childAt);
                    arrayList.add(i0VarC);
                    a(childAt, i0VarC, list);
                }
            }
            i0Var.k = arrayList;
        }
    }

    public static io.sentry.protocol.i0 c(View view) {
        io.sentry.protocol.i0 i0Var = new io.sentry.protocol.i0();
        i0Var.b = io.sentry.config.a.y(view);
        try {
            i0Var.c = io.sentry.android.core.internal.gestures.h.b(view);
        } catch (Throwable unused) {
        }
        i0Var.g = Double.valueOf(view.getX());
        i0Var.h = Double.valueOf(view.getY());
        i0Var.e = Double.valueOf(view.getWidth());
        i0Var.f = Double.valueOf(view.getHeight());
        i0Var.j = Double.valueOf(view.getAlpha());
        int visibility = view.getVisibility();
        if (visibility == 0) {
            i0Var.i = "visible";
        } else if (visibility == 4) {
            i0Var.i = "invisible";
        } else if (visibility == 8) {
            i0Var.i = "gone";
        }
        return i0Var;
    }

    @Override // io.sentry.b0
    public final c6 b(c6 c6Var, io.sentry.h0 h0Var) {
        return c6Var;
    }

    @Override // io.sentry.b0
    public final w4 d(w4 w4Var, io.sentry.h0 h0Var) {
        if (w4Var.g()) {
            SentryAndroidOptions sentryAndroidOptions = this.a;
            if (!sentryAndroidOptions.isAttachViewHierarchy()) {
                sentryAndroidOptions.getLogger().i(SentryLevel.DEBUG, "attachViewHierarchy is disabled.", new Object[0]);
                return w4Var;
            }
            if (!io.sentry.config.a.K(h0Var)) {
                boolean zA = this.b.a();
                sentryAndroidOptions.getBeforeViewHierarchyCaptureCallback();
                if (!zA) {
                    Activity activityA = j0.b.a();
                    List<ComposeViewHierarchyExporter> viewHierarchyExporters = sentryAndroidOptions.getViewHierarchyExporters();
                    io.sentry.util.thread.a threadChecker = sentryAndroidOptions.getThreadChecker();
                    io.sentry.u0 logger = sentryAndroidOptions.getLogger();
                    io.sentry.protocol.h0 h0Var2 = null;
                    if (activityA == null) {
                        logger.i(SentryLevel.INFO, "Missing activity for view hierarchy snapshot.", new Object[0]);
                    } else {
                        Window window = activityA.getWindow();
                        if (window == null) {
                            logger.i(SentryLevel.INFO, "Missing window for view hierarchy snapshot.", new Object[0]);
                        } else {
                            View viewPeekDecorView = window.peekDecorView();
                            if (viewPeekDecorView == null) {
                                logger.i(SentryLevel.INFO, "Missing decor view for view hierarchy snapshot.", new Object[0]);
                            } else {
                                try {
                                    if (threadChecker.c()) {
                                        ArrayList arrayList = new ArrayList(1);
                                        io.sentry.protocol.h0 h0Var3 = new io.sentry.protocol.h0("android_view_system", arrayList);
                                        io.sentry.protocol.i0 i0VarC = c(viewPeekDecorView);
                                        arrayList.add(i0VarC);
                                        a(viewPeekDecorView, i0VarC, viewHierarchyExporters);
                                        h0Var2 = h0Var3;
                                    } else {
                                        CountDownLatch countDownLatch = new CountDownLatch(1);
                                        AtomicReference atomicReference = new AtomicReference(null);
                                        activityA.runOnUiThread(new ma0(atomicReference, viewPeekDecorView, viewHierarchyExporters, countDownLatch, logger, 2));
                                        if (countDownLatch.await(1000L, TimeUnit.MILLISECONDS)) {
                                            h0Var2 = (io.sentry.protocol.h0) atomicReference.get();
                                        }
                                    }
                                } catch (Throwable th) {
                                    logger.f(SentryLevel.ERROR, "Failed to process view hierarchy.", th);
                                }
                            }
                        }
                    }
                    if (h0Var2 != null) {
                        h0Var.e = new io.sentry.a(h0Var2);
                    }
                }
            }
        }
        return w4Var;
    }

    @Override // io.sentry.b0
    public final io.sentry.protocol.d0 g(io.sentry.protocol.d0 d0Var, io.sentry.h0 h0Var) {
        return d0Var;
    }

    @Override // io.sentry.b0
    public final g5 k(g5 g5Var) {
        return g5Var;
    }
}
