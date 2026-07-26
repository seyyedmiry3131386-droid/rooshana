package androidx.compose.ui.platform;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public abstract class u {
    public static final ViewGroup.LayoutParams a = new ViewGroup.LayoutParams(-2, -2);

    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final androidx.compose.ui.platform.t a(androidx.compose.ui.platform.AbstractComposeView r6, defpackage.d01 r7, androidx.compose.runtime.internal.a r8) {
        /*
            java.util.concurrent.atomic.AtomicBoolean r0 = defpackage.wt2.a
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            r3 = 0
            if (r0 == 0) goto L3d
            r0 = 6
            kotlinx.coroutines.channels.a r0 = defpackage.dt2.b(r2, r0, r3)
            c24 r2 = androidx.compose.ui.platform.h.m
            java.lang.Object r2 = r2.getValue()
            w61 r2 = (defpackage.w61) r2
            e51 r2 = defpackage.js3.a(r2)
            androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1 r4 = new androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1
            r4.<init>(r0, r3)
            r5 = 3
            defpackage.bt2.G(r2, r3, r3, r4, r5)
            androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$2 r2 = new androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$2
            r2.<init>()
            java.lang.Object r0 = defpackage.g08.c
            monitor-enter(r0)
            java.util.List r4 = defpackage.g08.i     // Catch: java.lang.Throwable -> L3a
            java.util.ArrayList r2 = kotlin.collections.a.A0(r2, r4)     // Catch: java.lang.Throwable -> L3a
            defpackage.g08.i = r2     // Catch: java.lang.Throwable -> L3a
            monitor-exit(r0)
            defpackage.g08.a()
            goto L3d
        L3a:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        L3d:
            int r0 = r6.getChildCount()
            if (r0 <= 0) goto L50
            android.view.View r0 = r6.getChildAt(r1)
            boolean r1 = r0 instanceof androidx.compose.ui.platform.AndroidComposeView
            if (r1 == 0) goto L4e
            androidx.compose.ui.platform.AndroidComposeView r0 = (androidx.compose.ui.platform.AndroidComposeView) r0
            goto L54
        L4e:
            r0 = r3
            goto L54
        L50:
            r6.removeAllViews()
            goto L4e
        L54:
            if (r0 != 0) goto L6c
            androidx.compose.ui.platform.AndroidComposeView r0 = new androidx.compose.ui.platform.AndroidComposeView
            android.content.Context r1 = r6.getContext()
            w61 r2 = r7.k()
            r0.<init>(r1, r2)
            android.view.View r1 = r0.getView()
            android.view.ViewGroup$LayoutParams r2 = androidx.compose.ui.platform.u.a
            r6.addView(r1, r2)
        L6c:
            dp2 r6 = androidx.compose.ui.platform.o.a
            android.view.View r6 = r0.getView()
            int r1 = defpackage.ur6.wrapped_composition_tag
            java.lang.Object r6 = r6.getTag(r1)
            boolean r1 = r6 instanceof androidx.compose.ui.platform.t
            if (r1 == 0) goto L7f
            r3 = r6
            androidx.compose.ui.platform.t r3 = (androidx.compose.ui.platform.t) r3
        L7f:
            if (r3 != 0) goto L9d
            androidx.compose.ui.platform.t r3 = new androidx.compose.ui.platform.t
            sk6 r6 = new sk6
            androidx.compose.ui.node.h r1 = r0.getRoot()
            r6.<init>(r1)
            j01 r1 = new j01
            r1.<init>(r7, r6)
            r3.<init>(r0, r1)
            android.view.View r6 = r0.getView()
            int r1 = defpackage.ur6.wrapped_composition_tag
            r6.setTag(r1, r3)
        L9d:
            r3.b(r8)
            w61 r6 = r0.getCoroutineContext()
            w61 r8 = r7.k()
            boolean r6 = defpackage.js3.i(r6, r8)
            if (r6 != 0) goto Lb5
            w61 r6 = r7.k()
            r0.setCoroutineContext(r6)
        Lb5:
            rg9 r6 = new rg9
            r6.<init>(r7)
            r0.setFrameEndScheduler$ui(r6)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.u.a(androidx.compose.ui.platform.AbstractComposeView, d01, androidx.compose.runtime.internal.a):androidx.compose.ui.platform.t");
    }
}
