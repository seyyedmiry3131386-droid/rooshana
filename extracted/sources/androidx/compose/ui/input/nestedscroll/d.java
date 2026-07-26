package androidx.compose.ui.input.nestedscroll;

import androidx.compose.ui.node.h;
import defpackage.cc7;
import defpackage.dp2;
import defpackage.e71;
import defpackage.fs8;
import defpackage.gx4;
import defpackage.hm5;
import defpackage.js3;
import defpackage.nr5;
import defpackage.rn3;
import defpackage.ti1;
import defpackage.ue8;
import defpackage.y40;
import defpackage.z4;
import defpackage.zb5;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes.dex */
public final class d extends gx4 implements fs8, hm5 {
    public hm5 o;
    public a p;
    public d q;
    public final String r;

    public d(hm5 hm5Var, a aVar) {
        this.o = hm5Var;
        this.p = aVar == null ? new a() : aVar;
        this.r = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13, types: [gx4] */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16, types: [gx4] */
    /* JADX WARN: Type inference failed for: r4v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [zb5] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [zb5] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v7 */
    public final e71 C0() {
        d dVar;
        fs8 fs8Var;
        z4 z4Var;
        if (this.n) {
            if (!this.a.n) {
                rn3.b("visitAncestors called on an unattached node");
            }
            gx4 gx4Var = this.a.e;
            h hVarH = y40.H(this);
            loop0: while (true) {
                if (hVarH == null) {
                    fs8Var = null;
                    break;
                }
                if ((((gx4) hVarH.H.g).d & 262144) != 0) {
                    while (gx4Var != null) {
                        if ((gx4Var.c & 262144) != 0) {
                            ?? J = gx4Var;
                            ?? zb5Var = 0;
                            while (J != 0) {
                                if (J instanceof fs8) {
                                    fs8Var = (fs8) J;
                                    if (js3.i(l(), fs8Var.l()) && d.class == fs8Var.getClass()) {
                                        break loop0;
                                    }
                                } else if ((J.c & 262144) != 0 && (J instanceof ti1)) {
                                    gx4 gx4Var2 = ((ti1) J).p;
                                    int i = 0;
                                    J = J;
                                    zb5Var = zb5Var;
                                    while (gx4Var2 != null) {
                                        if ((gx4Var2.c & 262144) != 0) {
                                            i++;
                                            zb5Var = zb5Var;
                                            if (i == 1) {
                                                J = gx4Var2;
                                            } else {
                                                if (zb5Var == 0) {
                                                    zb5Var = new zb5(0, new gx4[16]);
                                                }
                                                if (J != 0) {
                                                    zb5Var.b(J);
                                                    J = 0;
                                                }
                                                zb5Var.b(gx4Var2);
                                            }
                                        }
                                        gx4Var2 = gx4Var2.f;
                                        J = J;
                                        zb5Var = zb5Var;
                                    }
                                    if (i == 1) {
                                    }
                                }
                                J = y40.j(zb5Var);
                            }
                        }
                        gx4Var = gx4Var.e;
                    }
                }
                hVarH = hVarH.F();
                gx4Var = (hVarH == null || (z4Var = hVarH.H) == null) ? null : (ue8) z4Var.f;
            }
            dVar = (d) fs8Var;
        } else {
            dVar = null;
        }
        e71 e71VarC0 = dVar != null ? dVar.C0() : null;
        if (e71VarC0 != null && js3.C(e71VarC0)) {
            return e71VarC0;
        }
        e71 e71Var = this.p.d;
        if (e71Var != null) {
            return e71Var;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [gx4] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [gx4] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [zb5] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [zb5] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v7 */
    @Override // defpackage.hm5
    public final long G(int i, long j) {
        z4 z4Var;
        boolean z = this.n;
        d dVar = null;
        fs8 fs8Var = null;
        dVar = null;
        if (z && z) {
            if (!this.a.n) {
                rn3.b("visitAncestors called on an unattached node");
            }
            gx4 gx4Var = this.a.e;
            h hVarH = y40.H(this);
            loop0: while (true) {
                if (hVarH == null) {
                    break;
                }
                if ((((gx4) hVarH.H.g).d & 262144) != 0) {
                    while (gx4Var != null) {
                        if ((gx4Var.c & 262144) != 0) {
                            ?? J = gx4Var;
                            ?? zb5Var = 0;
                            while (J != 0) {
                                if (J instanceof fs8) {
                                    fs8 fs8Var2 = (fs8) J;
                                    if (js3.i(l(), fs8Var2.l()) && d.class == fs8Var2.getClass()) {
                                        fs8Var = fs8Var2;
                                        break loop0;
                                    }
                                } else if ((J.c & 262144) != 0 && (J instanceof ti1)) {
                                    gx4 gx4Var2 = ((ti1) J).p;
                                    int i2 = 0;
                                    J = J;
                                    zb5Var = zb5Var;
                                    while (gx4Var2 != null) {
                                        if ((gx4Var2.c & 262144) != 0) {
                                            i2++;
                                            zb5Var = zb5Var;
                                            if (i2 == 1) {
                                                J = gx4Var2;
                                            } else {
                                                if (zb5Var == 0) {
                                                    zb5Var = new zb5(0, new gx4[16]);
                                                }
                                                if (J != 0) {
                                                    zb5Var.b(J);
                                                    J = 0;
                                                }
                                                zb5Var.b(gx4Var2);
                                            }
                                        }
                                        gx4Var2 = gx4Var2.f;
                                        J = J;
                                        zb5Var = zb5Var;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                J = y40.j(zb5Var);
                            }
                        }
                        gx4Var = gx4Var.e;
                    }
                }
                hVarH = hVarH.F();
                gx4Var = (hVarH == null || (z4Var = hVarH.H) == null) ? null : (ue8) z4Var.f;
            }
            dVar = (d) fs8Var;
        }
        long jG = dVar != null ? dVar.G(i, j) : 0L;
        return nr5.g(jG, this.o.G(i, nr5.f(j, jG)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x00f9, code lost:
    
        if (r3 == r5) goto L76;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11, types: [gx4] */
    /* JADX WARN: Type inference failed for: r10v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8, types: [gx4] */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [zb5] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6, types: [zb5] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r13v7 */
    @Override // defpackage.hm5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c0(long r17, defpackage.g51 r19) {
        /*
            Method dump skipped, instruction units count: 291
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.nestedscroll.d.c0(long, g51):java.lang.Object");
    }

    @Override // defpackage.fs8
    public final Object l() {
        return this.r;
    }

    @Override // defpackage.gx4
    public final void s0() {
        a aVar = this.p;
        aVar.a = this;
        aVar.b = null;
        this.q = null;
        aVar.c = new NestedScrollNode$updateDispatcherFields$1(this);
        aVar.d = o0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.compose.ui.input.nestedscroll.d] */
    /* JADX WARN: Type inference failed for: r3v10, types: [gx4] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13, types: [gx4] */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [zb5] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [zb5] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r8v7 */
    @Override // defpackage.hm5
    public final long u(long j, int i, long j2) {
        z4 z4Var;
        long jU = this.o.u(j, i, j2);
        boolean z = this.n;
        fs8 fs8Var = null;
        if (z && z) {
            if (!this.a.n) {
                rn3.b("visitAncestors called on an unattached node");
            }
            gx4 gx4Var = this.a.e;
            h hVarH = y40.H(this);
            loop0: while (true) {
                if (hVarH == null) {
                    break;
                }
                if ((((gx4) hVarH.H.g).d & 262144) != 0) {
                    while (gx4Var != null) {
                        if ((gx4Var.c & 262144) != 0) {
                            ?? J = gx4Var;
                            ?? zb5Var = 0;
                            while (J != 0) {
                                if (J instanceof fs8) {
                                    fs8 fs8Var2 = (fs8) J;
                                    if (js3.i(l(), fs8Var2.l()) && d.class == fs8Var2.getClass()) {
                                        fs8Var = fs8Var2;
                                        break loop0;
                                    }
                                } else if ((J.c & 262144) != 0 && (J instanceof ti1)) {
                                    gx4 gx4Var2 = ((ti1) J).p;
                                    int i2 = 0;
                                    J = J;
                                    zb5Var = zb5Var;
                                    while (gx4Var2 != null) {
                                        if ((gx4Var2.c & 262144) != 0) {
                                            i2++;
                                            zb5Var = zb5Var;
                                            if (i2 == 1) {
                                                J = gx4Var2;
                                            } else {
                                                if (zb5Var == 0) {
                                                    zb5Var = new zb5(0, new gx4[16]);
                                                }
                                                if (J != 0) {
                                                    zb5Var.b(J);
                                                    J = 0;
                                                }
                                                zb5Var.b(gx4Var2);
                                            }
                                        }
                                        gx4Var2 = gx4Var2.f;
                                        J = J;
                                        zb5Var = zb5Var;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                J = y40.j(zb5Var);
                            }
                        }
                        gx4Var = gx4Var.e;
                    }
                }
                hVarH = hVarH.F();
                gx4Var = (hVarH == null || (z4Var = hVarH.H) == null) ? null : (ue8) z4Var.f;
            }
            fs8Var = (d) fs8Var;
        }
        ?? r0 = fs8Var;
        return nr5.g(jU, r0 != 0 ? r0.u(nr5.g(j, jU), i, nr5.f(j2, jU)) : 0L);
    }

    @Override // defpackage.gx4
    public final void u0() {
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        cc7.G(this, new dp2() { // from class: androidx.compose.ui.input.nestedscroll.NestedScrollNodeKt$findNearestAttachedAncestor$1
            {
                super(1);
            }

            @Override // defpackage.dp2
            public final Object invoke(Object obj) {
                boolean z;
                Object obj2 = (fs8) obj;
                if (((gx4) obj2).a.n) {
                    ref$ObjectRef.a = obj2;
                    z = false;
                } else {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        });
        d dVar = (d) ((fs8) ref$ObjectRef.a);
        this.q = dVar;
        a aVar = this.p;
        aVar.b = dVar;
        if (aVar.a == this) {
            aVar.a = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v16, types: [gx4] */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r14v20 */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8, types: [gx4] */
    /* JADX WARN: Type inference failed for: r14v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8, types: [zb5] */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v6, types: [zb5] */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r16v9 */
    /* JADX WARN: Type inference failed for: r7v12 */
    @Override // defpackage.hm5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object v(long r20, long r22, defpackage.g51 r24) {
        /*
            Method dump skipped, instruction units count: 373
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.nestedscroll.d.v(long, long, g51):java.lang.Object");
    }
}
