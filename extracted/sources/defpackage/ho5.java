package defpackage;

import androidx.compose.ui.focus.a;
import androidx.compose.ui.focus.c;
import androidx.compose.ui.focus.d;
import androidx.compose.ui.node.h;
import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: loaded from: classes.dex */
public abstract class ho5 {
    public static final ib5 a;

    static {
        ib5 ib5Var = xq5.a;
        a = new ib5();
    }

    public static final void a(gx4 gx4Var, int i, int i2) {
        if (!(gx4Var instanceof ti1)) {
            b(gx4Var, i & gx4Var.c, i2);
            return;
        }
        ti1 ti1Var = (ti1) gx4Var;
        int i3 = ti1Var.o;
        b(gx4Var, i3 & i, i2);
        int i4 = (~i3) & i;
        for (gx4 gx4Var2 = ti1Var.p; gx4Var2 != null; gx4Var2 = gx4Var2.f) {
            a(gx4Var2, i4, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(gx4 gx4Var, int i, int i2) {
        if (i2 != 0 || gx4Var.p0()) {
            if ((i & 2) != 0 && (gx4Var instanceof f14)) {
                zk8.J((f14) gx4Var);
                if (i2 == 2) {
                    y40.E(gx4Var, 2).V0();
                }
            }
            if ((i & 128) != 0 && i2 != 2) {
                y40.H(gx4Var).Q();
            }
            if ((4194304 & i) != 0 && i2 != 2) {
                h hVarH = y40.H(gx4Var);
                i14 i14Var = h.S;
                hVarH.r0(false);
            }
            if ((i & 256) != 0 && (gx4Var instanceof rt2)) {
                if (i2 == 1) {
                    h hVarH2 = y40.H(gx4Var);
                    hVarH2.y0(hVarH2.Q + 1);
                } else if (i2 == 2) {
                    y40.H(gx4Var).y0(r0.Q - 1);
                }
                if (i2 != 2) {
                    h hVarH3 = y40.H(gx4Var);
                    if (hVarH3.Q != 0 && !hVarH3.u() && !hVarH3.A() && !hVarH3.P) {
                        AndroidComposeView androidComposeView = (AndroidComposeView) m14.a(hVarH3);
                        hh2 hh2Var = androidComposeView.U.e;
                        hh2Var.getClass();
                        if (hVarH3.Q > 0) {
                            ((zb5) hh2Var.b).b(hVarH3);
                            hVarH3.P = true;
                        }
                        androidComposeView.F(null);
                    }
                }
            }
            if ((i & 4) != 0 && (gx4Var instanceof gv1)) {
                rf0.z((gv1) gx4Var);
            }
            if ((i & 8) != 0 && (gx4Var instanceof in7)) {
                y40.H(gx4Var).t = true;
            }
            if ((i & 64) != 0 && (gx4Var instanceof d26)) {
                y40.H((d26) gx4Var).R();
            }
            if ((i & 2048) != 0 && (gx4Var instanceof pg2)) {
                pg2 pg2Var = (pg2) gx4Var;
                gm0.b = null;
                pg2Var.w(gm0.a);
                if (gm0.b != null) {
                    gx4 gx4Var2 = (gx4) pg2Var;
                    if (!gx4Var2.a.n) {
                        rn3.b("visitChildren called on an unattached node");
                    }
                    zb5 zb5Var = new zb5(0, new gx4[16]);
                    gx4 gx4Var3 = gx4Var2.a;
                    gx4 gx4Var4 = gx4Var3.f;
                    if (gx4Var4 == null) {
                        y40.g(zb5Var, gx4Var3);
                    } else {
                        zb5Var.b(gx4Var4);
                    }
                    while (true) {
                        int i3 = zb5Var.c;
                        if (i3 == 0) {
                            break;
                        }
                        gx4 gx4VarJ = (gx4) zb5Var.l(i3 - 1);
                        if ((gx4VarJ.d & 1024) == 0) {
                            y40.g(zb5Var, gx4VarJ);
                        } else {
                            while (true) {
                                if (gx4VarJ == null) {
                                    break;
                                }
                                if ((gx4VarJ.c & 1024) != 0) {
                                    zb5 zb5Var2 = null;
                                    while (gx4VarJ != null) {
                                        if (gx4VarJ instanceof d) {
                                            d dVar = (d) gx4VarJ;
                                            a aVar = ((c) y40.I(dVar).getFocusOwner()).d;
                                            if (aVar.c.d(dVar)) {
                                                aVar.a();
                                            }
                                        } else if ((gx4VarJ.c & 1024) != 0 && (gx4VarJ instanceof ti1)) {
                                            int i4 = 0;
                                            for (gx4 gx4Var5 = ((ti1) gx4VarJ).p; gx4Var5 != null; gx4Var5 = gx4Var5.f) {
                                                if ((gx4Var5.c & 1024) != 0) {
                                                    i4++;
                                                    if (i4 == 1) {
                                                        gx4VarJ = gx4Var5;
                                                    } else {
                                                        if (zb5Var2 == null) {
                                                            zb5Var2 = new zb5(0, new gx4[16]);
                                                        }
                                                        if (gx4VarJ != null) {
                                                            zb5Var2.b(gx4VarJ);
                                                            gx4VarJ = null;
                                                        }
                                                        zb5Var2.b(gx4Var5);
                                                    }
                                                }
                                            }
                                            if (i4 == 1) {
                                            }
                                        }
                                        gx4VarJ = y40.j(zb5Var2);
                                    }
                                } else {
                                    gx4VarJ = gx4VarJ.f;
                                }
                            }
                        }
                    }
                }
            }
            if ((i & 4096) == 0 || !(gx4Var instanceof fg2)) {
                return;
            }
            fg2 fg2Var = (fg2) gx4Var;
            a aVar2 = ((c) y40.I(fg2Var).getFocusOwner()).d;
            if (aVar2.d.d(fg2Var)) {
                aVar2.a();
            }
        }
    }

    public static final void c(gx4 gx4Var) {
        if (!gx4Var.n) {
            rn3.b("autoInvalidateUpdatedNode called on unattached node");
        }
        a(gx4Var, -1, 0);
    }

    public static final int d(fx4 fx4Var) {
        int i = fx4Var instanceof d14 ? 3 : 1;
        if (fx4Var instanceof rm3) {
            i |= 4;
        }
        if (fx4Var instanceof eu) {
            i |= 8;
        }
        if (fx4Var instanceof fh6) {
            i |= 16;
        }
        if (fx4Var instanceof nj) {
            i |= 64;
        }
        return fx4Var instanceof rg0 ? 524288 | i : i;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int e(defpackage.gx4 r4) {
        /*
            int r0 = r4.c
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.Class r0 = r4.getClass()
            ib5 r1 = defpackage.ho5.a
            int r2 = r1.d(r0)
            if (r2 < 0) goto L16
            int[] r4 = r1.c
            r4 = r4[r2]
            return r4
        L16:
            boolean r2 = r4 instanceof defpackage.f14
            if (r2 == 0) goto L1c
            r2 = 3
            goto L1d
        L1c:
            r2 = 1
        L1d:
            boolean r3 = r4 instanceof defpackage.gv1
            if (r3 == 0) goto L23
            r2 = r2 | 4
        L23:
            boolean r3 = r4 instanceof defpackage.in7
            if (r3 == 0) goto L29
            r2 = r2 | 8
        L29:
            boolean r3 = r4 instanceof defpackage.dh6
            if (r3 == 0) goto L2f
            r2 = r2 | 16
        L2f:
            boolean r3 = r4 instanceof defpackage.lx4
            if (r3 == 0) goto L35
            r2 = r2 | 32
        L35:
            boolean r3 = r4 instanceof defpackage.d26
            if (r3 == 0) goto L3b
            r2 = r2 | 64
        L3b:
            boolean r3 = r4 instanceof defpackage.nt5
            if (r3 == 0) goto L43
            r3 = 4194304(0x400000, float:5.877472E-39)
        L41:
            r2 = r2 | r3
            goto L52
        L43:
            boolean r3 = r4 instanceof defpackage.st5
            if (r3 == 0) goto L4a
            r2 = r2 | 128(0x80, float:1.8E-43)
            goto L52
        L4a:
            boolean r3 = r4 instanceof defpackage.t04
            if (r3 == 0) goto L52
            r3 = 4194432(0x400080, float:5.877651E-39)
            goto L41
        L52:
            boolean r3 = r4 instanceof defpackage.rt2
            if (r3 == 0) goto L58
            r2 = r2 | 256(0x100, float:3.59E-43)
        L58:
            boolean r3 = r4 instanceof defpackage.cu7
            if (r3 == 0) goto L5e
            r2 = r2 | 512(0x200, float:7.17E-43)
        L5e:
            boolean r3 = r4 instanceof androidx.compose.ui.focus.d
            if (r3 == 0) goto L64
            r2 = r2 | 1024(0x400, float:1.435E-42)
        L64:
            boolean r3 = r4 instanceof defpackage.pg2
            if (r3 == 0) goto L6a
            r2 = r2 | 2048(0x800, float:2.87E-42)
        L6a:
            boolean r3 = r4 instanceof defpackage.fg2
            if (r3 == 0) goto L70
            r2 = r2 | 4096(0x1000, float:5.74E-42)
        L70:
            boolean r3 = r4 instanceof defpackage.hy3
            if (r3 == 0) goto L76
            r2 = r2 | 8192(0x2000, float:1.148E-41)
        L76:
            boolean r3 = r4 instanceof androidx.compose.ui.platform.a
            if (r3 == 0) goto L7c
            r2 = r2 | 16384(0x4000, float:2.2959E-41)
        L7c:
            boolean r3 = r4 instanceof defpackage.m01
            if (r3 == 0) goto L84
            r3 = 32768(0x8000, float:4.5918E-41)
            r2 = r2 | r3
        L84:
            boolean r3 = r4 instanceof defpackage.fs8
            if (r3 == 0) goto L8b
            r3 = 262144(0x40000, float:3.67342E-40)
            r2 = r2 | r3
        L8b:
            boolean r3 = r4 instanceof defpackage.rg0
            if (r3 == 0) goto L92
            r3 = 524288(0x80000, float:7.34684E-40)
            r2 = r2 | r3
        L92:
            boolean r3 = r4 instanceof defpackage.hn3
            if (r3 == 0) goto L99
            r3 = 2097152(0x200000, float:2.938736E-39)
            r2 = r2 | r3
        L99:
            boolean r4 = r4 instanceof defpackage.q24
            if (r4 == 0) goto La0
            r4 = 8388608(0x800000, float:1.1754944E-38)
            r2 = r2 | r4
        La0:
            r1.g(r2, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ho5.e(gx4):int");
    }

    public static final int f(gx4 gx4Var) {
        if (!(gx4Var instanceof ti1)) {
            return e(gx4Var);
        }
        ti1 ti1Var = (ti1) gx4Var;
        int iF = ti1Var.o;
        for (gx4 gx4Var2 = ti1Var.p; gx4Var2 != null; gx4Var2 = gx4Var2.f) {
            iF |= f(gx4Var2);
        }
        return iF;
    }

    public static final boolean g(int i) {
        return ((i & 128) != 0) | ((i & 4194304) != 0);
    }
}
