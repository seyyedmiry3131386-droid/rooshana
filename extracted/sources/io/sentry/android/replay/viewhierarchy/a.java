package io.sentry.android.replay.viewhierarchy;

import androidx.compose.ui.node.h;
import defpackage.bp2;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import kotlin.LazyThreadSafetyMode;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    public static final Object a = kotlin.a.b(LazyThreadSafetyMode.c, new bp2() { // from class: io.sentry.android.replay.viewhierarchy.ComposeViewHierarchyNode$getCollapsedSemanticsMethod$2
        @Override // defpackage.bp2
        public final Object invoke() {
            try {
                Method declaredMethod = h.class.getDeclaredMethod("getCollapsedSemantics$ui_release", null);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
                return null;
            }
        }
    });
    public static boolean b;
    public static WeakReference c;

    /* JADX WARN: Removed duplicated region for block: B:23:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(defpackage.en7 r3, boolean r4, defpackage.y r5) {
        /*
            if (r3 == 0) goto Lb
            androidx.compose.ui.semantics.g r0 = io.sentry.android.replay.s.a
            java.lang.Object r0 = androidx.compose.ui.semantics.b.a(r3, r0)
            java.lang.String r0 = (java.lang.String) r0
            goto Lc
        Lb:
            r0 = 0
        Lc:
            java.lang.String r1 = "unmask"
            boolean r1 = defpackage.js3.i(r0, r1)
            r2 = 0
            if (r1 == 0) goto L19
            r5.E()
            return r2
        L19:
            java.lang.String r1 = "mask"
            boolean r0 = defpackage.js3.i(r0, r1)
            if (r0 == 0) goto L26
            r5.E()
            r3 = 1
            return r3
        L26:
            if (r4 == 0) goto L2b
            java.lang.String r3 = "android.widget.ImageView"
            goto L4c
        L2b:
            if (r3 == 0) goto L4a
            rb5 r3 = r3.a
            androidx.compose.ui.semantics.g r4 = androidx.compose.ui.semantics.d.B
            boolean r4 = r3.c(r4)
            if (r4 != 0) goto L47
            androidx.compose.ui.semantics.g r4 = androidx.compose.ui.semantics.a.k
            boolean r4 = r3.c(r4)
            if (r4 != 0) goto L47
            androidx.compose.ui.semantics.g r4 = androidx.compose.ui.semantics.d.F
            boolean r3 = r3.c(r4)
            if (r3 == 0) goto L4a
        L47:
            java.lang.String r3 = "android.widget.TextView"
            goto L4c
        L4a:
            java.lang.String r3 = "android.view.View"
        L4c:
            java.lang.Object r4 = r5.b
            java.util.concurrent.CopyOnWriteArraySet r4 = (java.util.concurrent.CopyOnWriteArraySet) r4
            boolean r4 = r4.contains(r3)
            if (r4 == 0) goto L57
            return r2
        L57:
            java.lang.Object r4 = r5.a
            java.util.concurrent.CopyOnWriteArraySet r4 = (java.util.concurrent.CopyOnWriteArraySet) r4
            boolean r3 = r4.contains(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.replay.viewhierarchy.a.a(en7, boolean, y):boolean");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public static void b(androidx.compose.ui.node.h r27, io.sentry.android.replay.viewhierarchy.f r28, boolean r29, defpackage.y r30, io.sentry.u0 r31) {
        /*
            Method dump skipped, instruction units count: 1231
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.replay.viewhierarchy.a.b(androidx.compose.ui.node.h, io.sentry.android.replay.viewhierarchy.f, boolean, y, io.sentry.u0):void");
    }
}
