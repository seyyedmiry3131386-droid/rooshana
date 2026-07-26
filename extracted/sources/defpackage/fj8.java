package defpackage;

import androidx.compose.ui.semantics.a;
import androidx.compose.ui.semantics.d;
import androidx.compose.ui.semantics.f;
import androidx.compose.ui.semantics.g;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class fj8 extends gx4 implements f14, gv1, in7 {
    public String o;
    public gj8 p;
    public oh2 q;
    public int r;
    public boolean s;
    public int t;
    public int u;
    public iv0 v;
    public HashMap w;
    public o16 x;
    public dj8 y;
    public ej8 z;

    @Override // defpackage.in7
    public final /* synthetic */ boolean C() {
        return false;
    }

    public final o16 C0() {
        if (this.x == null) {
            this.x = new o16(this.o, this.p, this.q, this.r, this.s, this.t, this.u);
        }
        o16 o16Var = this.x;
        js3.m(o16Var);
        return o16Var;
    }

    @Override // defpackage.gv1
    public final /* synthetic */ void H() {
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0016  */
    @Override // defpackage.gv1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void T(androidx.compose.ui.node.i r11) {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fj8.T(androidx.compose.ui.node.i):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0010  */
    @Override // defpackage.f14
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(androidx.compose.ui.node.j r1, defpackage.yk4 r2, int r3) {
        /*
            r0 = this;
            ej8 r2 = r0.z
            if (r2 == 0) goto L10
            boolean r3 = r2.c
            if (r3 == 0) goto L9
            goto La
        L9:
            r2 = 0
        La:
            if (r2 == 0) goto L10
            o16 r2 = r2.d
            if (r2 != 0) goto L14
        L10:
            o16 r2 = r0.C0()
        L14:
            r2.d(r1)
            androidx.compose.ui.unit.LayoutDirection r1 = r1.getLayoutDirection()
            n16 r1 = r2.e(r1)
            float r1 = r1.c()
            int r1 = defpackage.d77.a(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fj8.a(androidx.compose.ui.node.j, yk4, int):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0010  */
    @Override // defpackage.f14
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int b(androidx.compose.ui.node.j r2, defpackage.yk4 r3, int r4) {
        /*
            r1 = this;
            ej8 r3 = r1.z
            if (r3 == 0) goto L10
            boolean r0 = r3.c
            if (r0 == 0) goto L9
            goto La
        L9:
            r3 = 0
        La:
            if (r3 == 0) goto L10
            o16 r3 = r3.d
            if (r3 != 0) goto L14
        L10:
            o16 r3 = r1.C0()
        L14:
            r3.d(r2)
            androidx.compose.ui.unit.LayoutDirection r2 = r2.getLayoutDirection()
            int r2 = r3.a(r4, r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fj8.b(androidx.compose.ui.node.j, yk4, int):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0015 A[Catch: all -> 0x004a, TryCatch #0 {all -> 0x004a, blocks: (B:3:0x0005, B:5:0x0009, B:10:0x0011, B:13:0x0019, B:15:0x0028, B:16:0x002b, B:18:0x0036, B:20:0x0042, B:23:0x004c, B:24:0x0073, B:12:0x0015), top: B:29:0x0005 }] */
    @Override // defpackage.f14
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.dl4 c(defpackage.el4 r5, defpackage.yk4 r6, long r7) {
        /*
            r4 = this;
            java.lang.String r0 = "TextStringSimpleNode::measure"
            android.os.Trace.beginSection(r0)
            ej8 r0 = r4.z     // Catch: java.lang.Throwable -> L4a
            if (r0 == 0) goto L15
            boolean r1 = r0.c     // Catch: java.lang.Throwable -> L4a
            if (r1 == 0) goto Le
            goto Lf
        Le:
            r0 = 0
        Lf:
            if (r0 == 0) goto L15
            o16 r0 = r0.d     // Catch: java.lang.Throwable -> L4a
            if (r0 != 0) goto L19
        L15:
            o16 r0 = r4.C0()     // Catch: java.lang.Throwable -> L4a
        L19:
            r0.d(r5)     // Catch: java.lang.Throwable -> L4a
            androidx.compose.ui.unit.LayoutDirection r1 = r5.getLayoutDirection()     // Catch: java.lang.Throwable -> L4a
            boolean r7 = r0.b(r7, r1)     // Catch: java.lang.Throwable -> L4a
            n16 r8 = r0.n     // Catch: java.lang.Throwable -> L4a
            if (r8 == 0) goto L2b
            r8.b()     // Catch: java.lang.Throwable -> L4a
        L2b:
            yg r8 = r0.j     // Catch: java.lang.Throwable -> L4a
            defpackage.js3.m(r8)     // Catch: java.lang.Throwable -> L4a
            pi8 r8 = r8.d     // Catch: java.lang.Throwable -> L4a
            long r0 = r0.l     // Catch: java.lang.Throwable -> L4a
            if (r7 == 0) goto L73
            r7 = 2
            androidx.compose.ui.node.m r2 = defpackage.y40.E(r4, r7)     // Catch: java.lang.Throwable -> L4a
            r2.Q0()     // Catch: java.lang.Throwable -> L4a
            java.util.HashMap r2 = r4.w     // Catch: java.lang.Throwable -> L4a
            if (r2 != 0) goto L4c
            java.util.HashMap r2 = new java.util.HashMap     // Catch: java.lang.Throwable -> L4a
            r2.<init>(r7)     // Catch: java.lang.Throwable -> L4a
            r4.w = r2     // Catch: java.lang.Throwable -> L4a
            goto L4c
        L4a:
            r5 = move-exception
            goto L9b
        L4c:
            pc3 r7 = androidx.compose.ui.layout.a.a     // Catch: java.lang.Throwable -> L4a
            r3 = 0
            float r3 = r8.d(r3)     // Catch: java.lang.Throwable -> L4a
            int r3 = java.lang.Math.round(r3)     // Catch: java.lang.Throwable -> L4a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L4a
            r2.put(r7, r3)     // Catch: java.lang.Throwable -> L4a
            pc3 r7 = androidx.compose.ui.layout.a.b     // Catch: java.lang.Throwable -> L4a
            int r3 = r8.g     // Catch: java.lang.Throwable -> L4a
            int r3 = r3 + (-1)
            float r8 = r8.d(r3)     // Catch: java.lang.Throwable -> L4a
            int r8 = java.lang.Math.round(r8)     // Catch: java.lang.Throwable -> L4a
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L4a
            r2.put(r7, r8)     // Catch: java.lang.Throwable -> L4a
        L73:
            r7 = 32
            long r7 = r0 >> r7
            int r7 = (int) r7     // Catch: java.lang.Throwable -> L4a
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            int r8 = (int) r0     // Catch: java.lang.Throwable -> L4a
            long r0 = defpackage.vy2.y(r7, r7, r8, r8)     // Catch: java.lang.Throwable -> L4a
            b96 r6 = r6.t(r0)     // Catch: java.lang.Throwable -> L4a
            java.util.HashMap r0 = r4.w     // Catch: java.lang.Throwable -> L4a
            defpackage.js3.m(r0)     // Catch: java.lang.Throwable -> L4a
            q r1 = new q     // Catch: java.lang.Throwable -> L4a
            r2 = 12
            r1.<init>(r6, r2)     // Catch: java.lang.Throwable -> L4a
            dl4 r5 = r5.D(r7, r8, r0, r1)     // Catch: java.lang.Throwable -> L4a
            android.os.Trace.endSection()
            return r5
        L9b:
            android.os.Trace.endSection()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fj8.c(el4, yk4, long):dl4");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0010  */
    @Override // defpackage.f14
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int e(androidx.compose.ui.node.j r1, defpackage.yk4 r2, int r3) {
        /*
            r0 = this;
            ej8 r2 = r0.z
            if (r2 == 0) goto L10
            boolean r3 = r2.c
            if (r3 == 0) goto L9
            goto La
        L9:
            r2 = 0
        La:
            if (r2 == 0) goto L10
            o16 r2 = r2.d
            if (r2 != 0) goto L14
        L10:
            o16 r2 = r0.C0()
        L14:
            r2.d(r1)
            androidx.compose.ui.unit.LayoutDirection r1 = r1.getLayoutDirection()
            n16 r1 = r2.e(r1)
            float r1 = r1.d()
            int r1 = defpackage.d77.a(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fj8.e(androidx.compose.ui.node.j, yk4, int):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0010  */
    @Override // defpackage.f14
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int f(androidx.compose.ui.node.j r2, defpackage.yk4 r3, int r4) {
        /*
            r1 = this;
            ej8 r3 = r1.z
            if (r3 == 0) goto L10
            boolean r0 = r3.c
            if (r0 == 0) goto L9
            goto La
        L9:
            r3 = 0
        La:
            if (r3 == 0) goto L10
            o16 r3 = r3.d
            if (r3 != 0) goto L14
        L10:
            o16 r3 = r1.C0()
        L14:
            r3.d(r2)
            androidx.compose.ui.unit.LayoutDirection r2 = r2.getLayoutDirection()
            int r2 = r3.a(r4, r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fj8.f(androidx.compose.ui.node.j, yk4, int):int");
    }

    @Override // defpackage.in7
    public final /* synthetic */ boolean h() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [dp2] */
    /* JADX WARN: Type inference failed for: r0v2, types: [dj8] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    @Override // defpackage.in7
    public final void k0(nn7 nn7Var) {
        dj8 dj8Var = this.y;
        ?? r0 = dj8Var;
        if (dj8Var == null) {
            final int i = 0;
            ?? r02 = new dp2(this) { // from class: dj8
                public final /* synthetic */ fj8 b;

                {
                    this.b = this;
                }

                /* JADX WARN: Removed duplicated region for block: B:27:0x00c9  */
                @Override // defpackage.dp2
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invoke(java.lang.Object r32) {
                    /*
                        Method dump skipped, instruction units count: 320
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.dj8.invoke(java.lang.Object):java.lang.Object");
                }
            };
            this.y = r02;
            r0 = r02;
        }
        ll llVar = new ll(this.o);
        ox3[] ox3VarArr = f.a;
        nn7Var.a(d.B, br9.B(llVar));
        ej8 ej8Var = this.z;
        if (ej8Var != null) {
            boolean z = ej8Var.c;
            g gVar = d.D;
            ox3[] ox3VarArr2 = f.a;
            ox3 ox3Var = ox3VarArr2[17];
            nn7Var.a(gVar, Boolean.valueOf(z));
            ll llVar2 = new ll(ej8Var.b);
            g gVar2 = d.C;
            ox3 ox3Var2 = ox3VarArr2[16];
            nn7Var.a(gVar2, llVar2);
        }
        final int i2 = 1;
        nn7Var.a(a.l, new e3(null, new dp2(this) { // from class: dj8
            public final /* synthetic */ fj8 b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:27:0x00c9  */
            @Override // defpackage.dp2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invoke(java.lang.Object r32) {
                /*
                    Method dump skipped, instruction units count: 320
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.dj8.invoke(java.lang.Object):java.lang.Object");
            }
        }));
        final int i3 = 2;
        nn7Var.a(a.m, new e3(null, new dp2(this) { // from class: dj8
            public final /* synthetic */ fj8 b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:27:0x00c9  */
            @Override // defpackage.dp2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invoke(java.lang.Object r32) {
                /*
                    Method dump skipped, instruction units count: 320
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.dj8.invoke(java.lang.Object):java.lang.Object");
            }
        }));
        nn7Var.a(a.n, new e3(null, new yu7(7, this)));
        f.b(nn7Var, r0);
    }

    @Override // defpackage.in7
    public final /* synthetic */ boolean m0() {
        return false;
    }

    @Override // defpackage.gx4
    public final boolean p0() {
        return false;
    }
}
