package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.koin.core.error.ClosedScopeException;
import org.koin.core.logger.Level;

/* JADX INFO: loaded from: classes3.dex */
public final class lf7 {
    public final to6 a;
    public final String b;
    public final boolean c;
    public final yu8 d;
    public final mz3 e;
    public final ArrayList f;
    public Object g;
    public final LinkedHashSet h;
    public ThreadLocal i;
    public boolean j;

    public lf7(to6 to6Var, String str, yu8 yu8Var, mz3 mz3Var, int i) {
        boolean z = (i & 4) == 0;
        yu8Var = (i & 8) != 0 ? null : yu8Var;
        js3.p(to6Var, "scopeQualifier");
        js3.p(str, "id");
        this.a = to6Var;
        this.b = str;
        this.c = z;
        this.d = yu8Var;
        this.e = mz3Var;
        this.f = new ArrayList();
        this.h = new LinkedHashSet();
    }

    public final void a() {
        o06 o06Var = new o06(18, this);
        synchronized (this) {
            o06Var.invoke();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.ps0 r8, defpackage.b26 r9, defpackage.to6 r10) {
        /*
            r7 = this;
            mz3 r0 = r7.e
            av r0 = r0.a
            org.koin.core.logger.Level r1 = org.koin.core.logger.Level.a
            r0.getClass()
            org.koin.core.logger.Level r2 = org.koin.core.logger.Level.e
            int r1 = r2.compareTo(r1)
            if (r1 > 0) goto La4
            java.lang.String r1 = ""
            r2 = 39
            if (r10 == 0) goto L2a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = " with qualifier '"
            r3.<init>(r4)
            r3.append(r10)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            if (r3 != 0) goto L2b
        L2a:
            r3 = r1
        L2b:
            boolean r4 = r7.c
            if (r4 == 0) goto L30
            goto L3d
        L30:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = " - scope:'"
            r1.<init>(r4)
            java.lang.String r4 = r7.b
            java.lang.String r1 = defpackage.bl4.y(r1, r4, r2)
        L3d:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "|- '"
            r4.<init>(r5)
            java.lang.String r6 = defpackage.ax3.a(r8)
            r4.append(r6)
            r4.append(r2)
            r4.append(r3)
            r4.append(r1)
            java.lang.String r1 = "..."
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r0.getClass()
            java.lang.String r2 = "msg"
            defpackage.js3.p(r1, r2)
            long r3 = defpackage.rx4.a()
            java.lang.Object r9 = r7.d(r8, r9, r10)
            long r3 = defpackage.sl8.a(r3)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>(r5)
            java.lang.String r8 = defpackage.ax3.a(r8)
            r10.append(r8)
            java.lang.String r8 = "' in "
            r10.append(r8)
            int r8 = defpackage.qx1.d
            kotlin.time.DurationUnit r8 = kotlin.time.DurationUnit.c
            long r3 = defpackage.qx1.h(r3, r8)
            double r3 = (double) r3
            r5 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r3 = r3 / r5
            r10.append(r3)
            java.lang.String r8 = " ms"
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            r0.getClass()
            defpackage.js3.p(r8, r2)
            return r9
        La4:
            java.lang.Object r8 = r7.d(r8, r9, r10)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lf7.b(ps0, b26, to6):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.ry0 r6) throws org.koin.core.error.NoDefinitionFoundException {
        /*
            r5 = this;
            mz3 r0 = r5.e
            do3 r0 = r0.b
            r0.getClass()
            r1 = 1
            java.lang.Object r0 = r0.B(r5, r6, r1)
            if (r0 != 0) goto L57
            java.lang.Object r0 = r6.d
            to6 r0 = (defpackage.to6) r0
            r1 = 39
            if (r0 == 0) goto L29
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = " and qualifier '"
            r2.<init>(r3)
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            if (r0 != 0) goto L2b
        L29:
            java.lang.String r0 = ""
        L2b:
            org.koin.core.error.NoDefinitionFoundException r2 = new org.koin.core.error.NoDefinitionFoundException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "No definition found for type '"
            r3.<init>(r4)
            java.lang.Object r6 = r6.c
            ps0 r6 = (defpackage.ps0) r6
            java.lang.String r6 = defpackage.ax3.a(r6)
            r3.append(r6)
            r3.append(r1)
            r3.append(r0)
            java.lang.String r6 = ". Check your Modules configuration and add missing type and/or qualifier!"
            r3.append(r6)
            java.lang.String r6 = r3.toString()
            java.lang.String r0 = "msg"
            defpackage.js3.p(r6, r0)
            r2.<init>(r6)
            throw r2
        L57:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lf7.c(ry0):java.lang.Object");
    }

    public final Object d(ps0 ps0Var, b26 b26Var, to6 to6Var) throws ClosedScopeException {
        ov ovVar;
        if (this.j) {
            String str = "Scope '" + this.b + "' is closed";
            js3.p(str, "msg");
            throw new ClosedScopeException(str);
        }
        mz3 mz3Var = this.e;
        ry0 ry0Var = new ry0(mz3Var.a, this, ps0Var, to6Var, b26Var);
        if (b26Var == null) {
            return c(ry0Var);
        }
        av avVar = mz3Var.a;
        Level level = Level.a;
        avVar.getClass();
        if (Level.e.compareTo(level) <= 0) {
            js3.p("| >> parameters " + b26Var, "msg");
        }
        ThreadLocal threadLocal = this.i;
        if (threadLocal == null || (ovVar = (ov) threadLocal.get()) == null) {
            ovVar = new ov();
            ThreadLocal threadLocal2 = new ThreadLocal();
            this.i = threadLocal2;
            threadLocal2.set(ovVar);
        }
        ovVar.addFirst(b26Var);
        try {
            return c(ry0Var);
        } finally {
            avVar.t("| << parameters");
            if (!ovVar.isEmpty()) {
                ovVar.removeFirst();
            }
            if (ovVar.isEmpty()) {
                ThreadLocal threadLocal3 = this.i;
                if (threadLocal3 != null) {
                    threadLocal3.remove();
                }
                this.i = null;
            }
        }
    }

    public final String toString() {
        return dw1.s(new StringBuilder("['"), this.b, "']");
    }
}
