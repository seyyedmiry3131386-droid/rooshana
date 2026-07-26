package androidx.compose.ui.focus;

import androidx.compose.ui.node.h;
import defpackage.dp2;
import defpackage.ew;
import defpackage.gx4;
import defpackage.js3;
import defpackage.km0;
import defpackage.og2;
import defpackage.qg2;
import defpackage.rn3;
import defpackage.sy6;
import defpackage.ti1;
import defpackage.tv8;
import defpackage.ue8;
import defpackage.wa0;
import defpackage.y40;
import defpackage.yg2;
import defpackage.z4;
import defpackage.zb5;
import defpackage.zk8;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    /* JADX WARN: Removed duplicated region for block: B:38:0x0080 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean a(androidx.compose.ui.focus.d r7, defpackage.dp2 r8) {
        /*
            androidx.compose.ui.focus.FocusStateImpl r0 = r7.H0()
            int r0 = r0.ordinal()
            if (r0 == 0) goto L8d
            r1 = 3
            r2 = 0
            r3 = 2
            r4 = 1
            if (r0 == r4) goto L39
            if (r0 == r3) goto L8d
            if (r0 != r1) goto L33
            boolean r0 = r(r7, r8)
            if (r0 != 0) goto L81
            og2 r0 = r7.E0()
            boolean r0 = r0.a
            if (r0 == 0) goto L2f
            androidx.compose.ui.focus.FocusOwnerImpl$focusSearch$1 r8 = (androidx.compose.ui.focus.FocusOwnerImpl$focusSearch$1) r8
            java.lang.Object r7 = r8.invoke(r7)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            goto L30
        L2f:
            r7 = r2
        L30:
            if (r7 == 0) goto L80
            goto L81
        L33:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        L39:
            androidx.compose.ui.focus.d r0 = defpackage.zk8.E(r7)
            java.lang.String r5 = "ActiveParent must have a focusedChild"
            if (r0 == 0) goto L87
            androidx.compose.ui.focus.FocusStateImpl r6 = r0.H0()
            int r6 = r6.ordinal()
            if (r6 == 0) goto L82
            if (r6 == r4) goto L5d
            if (r6 == r3) goto L82
            if (r6 == r1) goto L57
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        L57:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>(r5)
            throw r7
        L5d:
            boolean r1 = a(r0, r8)
            if (r1 != 0) goto L81
            boolean r7 = j(r7, r0, r3, r8)
            if (r7 != 0) goto L81
            og2 r7 = r0.E0()
            boolean r7 = r7.a
            if (r7 == 0) goto L80
            androidx.compose.ui.focus.FocusOwnerImpl$focusSearch$1 r8 = (androidx.compose.ui.focus.FocusOwnerImpl$focusSearch$1) r8
            java.lang.Object r7 = r8.invoke(r0)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L80
            goto L81
        L80:
            return r2
        L81:
            return r4
        L82:
            boolean r7 = j(r7, r0, r3, r8)
            return r7
        L87:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>(r5)
            throw r7
        L8d:
            boolean r7 = r(r7, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.e.a(androidx.compose.ui.focus.d, dp2):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
    
        if (r11 >= r2) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        if (r10 <= r7) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0041, code lost:
    
        if (r9 >= r6) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
    
        if (r8 <= r5) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004a, code lost:
    
        if (r21 != 3) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004d, code lost:
    
        if (r21 != 4) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004f, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0050, code lost:
    
        if (r21 != 3) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0052, code lost:
    
        r1 = r11 - r19.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0057, code lost:
    
        if (r21 != 4) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0059, code lost:
    
        r1 = r19.a - r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005d, code lost:
    
        if (r21 != 5) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005f, code lost:
    
        r1 = r9 - r19.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0064, code lost:
    
        if (r21 != 6) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0066, code lost:
    
        r1 = r19.b - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006d, code lost:
    
        if (r1 >= 0.0f) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006f, code lost:
    
        r1 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0071, code lost:
    
        if (r21 != 3) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0073, code lost:
    
        r11 = r11 - r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0075, code lost:
    
        if (r21 != 4) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0077, code lost:
    
        r11 = r2 - r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x007a, code lost:
    
        if (r21 != 5) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x007c, code lost:
    
        r11 = r9 - r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x007f, code lost:
    
        if (r21 != 6) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0081, code lost:
    
        r11 = r6 - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0087, code lost:
    
        if (r11 >= 1.0f) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0089, code lost:
    
        r11 = 1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x008c, code lost:
    
        if (r1 >= r11) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x008e, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x008f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0095, code lost:
    
        throw new java.lang.IllegalStateException("This function should only be used for 2-D focus search");
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x009b, code lost:
    
        throw new java.lang.IllegalStateException("This function should only be used for 2-D focus search");
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x009c, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean b(defpackage.sy6 r18, defpackage.sy6 r19, defpackage.sy6 r20, int r21) {
        /*
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            boolean r4 = c(r3, r2, r0)
            float r5 = r2.b
            float r6 = r2.d
            float r7 = r2.a
            float r2 = r2.c
            float r8 = r0.d
            float r9 = r0.b
            float r10 = r0.c
            float r11 = r0.a
            r12 = 0
            if (r4 != 0) goto La3
            boolean r0 = c(r3, r1, r0)
            if (r0 != 0) goto L27
            goto La3
        L27:
            java.lang.String r4 = "This function should only be used for 2-D focus search"
            r13 = 6
            r14 = 5
            r15 = 4
            r18 = 1
            r0 = 3
            if (r3 != r0) goto L36
            int r16 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r16 < 0) goto L9c
            goto L4a
        L36:
            if (r3 != r15) goto L3d
            int r16 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r16 > 0) goto L9c
            goto L4a
        L3d:
            if (r3 != r14) goto L44
            int r16 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r16 < 0) goto L9c
            goto L4a
        L44:
            if (r3 != r13) goto L9d
            int r16 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r16 > 0) goto L9c
        L4a:
            if (r3 != r0) goto L4d
            goto L4f
        L4d:
            if (r3 != r15) goto L50
        L4f:
            return r18
        L50:
            if (r3 != r0) goto L57
            float r1 = r1.c
            float r1 = r11 - r1
            goto L69
        L57:
            if (r3 != r15) goto L5d
            float r1 = r1.a
            float r1 = r1 - r10
            goto L69
        L5d:
            if (r3 != r14) goto L64
            float r1 = r1.d
            float r1 = r9 - r1
            goto L69
        L64:
            if (r3 != r13) goto L96
            float r1 = r1.b
            float r1 = r1 - r8
        L69:
            r16 = 0
            int r17 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r17 >= 0) goto L71
            r1 = r16
        L71:
            if (r3 != r0) goto L75
            float r11 = r11 - r7
            goto L83
        L75:
            if (r3 != r15) goto L7a
            float r11 = r2 - r10
            goto L83
        L7a:
            if (r3 != r14) goto L7f
            float r11 = r9 - r5
            goto L83
        L7f:
            if (r3 != r13) goto L90
            float r11 = r6 - r8
        L83:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r2 >= 0) goto L8a
            r11 = r0
        L8a:
            int r0 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r0 >= 0) goto L8f
            return r18
        L8f:
            return r12
        L90:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r4)
            throw r0
        L96:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r4)
            throw r0
        L9c:
            return r18
        L9d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r4)
            throw r0
        La3:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.e.b(sy6, sy6, sy6, int):boolean");
    }

    public static final boolean c(int i, sy6 sy6Var, sy6 sy6Var2) {
        if (i == 3 || i == 4) {
            return sy6Var.d > sy6Var2.b && sy6Var.b < sy6Var2.d;
        }
        if (i == 5 || i == 6) {
            return sy6Var.c > sy6Var2.a && sy6Var.a < sy6Var2.c;
        }
        throw new IllegalStateException("This function should only be used for 2-D focus search");
    }

    public static final boolean d(d dVar, boolean z) {
        int iOrdinal = dVar.H0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                d dVarE = zk8.E(dVar);
                if (!(dVarE != null ? d(dVarE, z) : true)) {
                    return false;
                }
                dVar.D0(FocusStateImpl.b, FocusStateImpl.c);
                return true;
            }
            if (iOrdinal == 2) {
                return z;
            }
            if (iOrdinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return true;
    }

    public static final void e(d dVar, zb5 zb5Var) {
        if (!dVar.a.n) {
            rn3.b("visitChildren called on an unattached node");
        }
        zb5 zb5Var2 = new zb5(0, new gx4[16]);
        gx4 gx4Var = dVar.a;
        gx4 gx4Var2 = gx4Var.f;
        if (gx4Var2 == null) {
            y40.g(zb5Var2, gx4Var);
        } else {
            zb5Var2.b(gx4Var2);
        }
        while (true) {
            int i = zb5Var2.c;
            if (i == 0) {
                return;
            }
            gx4 gx4VarJ = (gx4) zb5Var2.l(i - 1);
            if ((gx4VarJ.d & 1024) == 0) {
                y40.g(zb5Var2, gx4VarJ);
            } else {
                while (true) {
                    if (gx4VarJ == null) {
                        break;
                    }
                    if ((gx4VarJ.c & 1024) != 0) {
                        zb5 zb5Var3 = null;
                        while (gx4VarJ != null) {
                            if (gx4VarJ instanceof d) {
                                d dVar2 = (d) gx4VarJ;
                                if (dVar2.n && !y40.H(dVar2).R) {
                                    if (dVar2.E0().a) {
                                        zb5Var.b(dVar2);
                                    } else {
                                        e(dVar2, zb5Var);
                                    }
                                }
                            } else if ((gx4VarJ.c & 1024) != 0 && (gx4VarJ instanceof ti1)) {
                                int i2 = 0;
                                for (gx4 gx4Var3 = ((ti1) gx4VarJ).p; gx4Var3 != null; gx4Var3 = gx4Var3.f) {
                                    if ((gx4Var3.c & 1024) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            gx4VarJ = gx4Var3;
                                        } else {
                                            if (zb5Var3 == null) {
                                                zb5Var3 = new zb5(0, new gx4[16]);
                                            }
                                            if (gx4VarJ != null) {
                                                zb5Var3.b(gx4VarJ);
                                                gx4VarJ = null;
                                            }
                                            zb5Var3.b(gx4Var3);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            gx4VarJ = y40.j(zb5Var3);
                        }
                    } else {
                        gx4VarJ = gx4VarJ.f;
                    }
                }
            }
        }
    }

    public static final d f(zb5 zb5Var, sy6 sy6Var, int i) {
        sy6 sy6VarH;
        if (i == 3) {
            sy6VarH = sy6Var.h((sy6Var.c - sy6Var.a) + 1, 0.0f);
        } else if (i == 4) {
            sy6VarH = sy6Var.h(-((sy6Var.c - sy6Var.a) + 1), 0.0f);
        } else if (i == 5) {
            sy6VarH = sy6Var.h(0.0f, (sy6Var.d - sy6Var.b) + 1);
        } else {
            if (i != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            sy6VarH = sy6Var.h(0.0f, -((sy6Var.d - sy6Var.b) + 1));
        }
        Object[] objArr = zb5Var.a;
        int i2 = zb5Var.c;
        d dVar = null;
        for (int i3 = 0; i3 < i2; i3++) {
            d dVar2 = (d) objArr[i3];
            if (zk8.L(dVar2)) {
                sy6 sy6VarC = zk8.C(dVar2);
                if (k(sy6VarC, sy6VarH, sy6Var, i)) {
                    dVar = dVar2;
                    sy6VarH = sy6VarC;
                }
            }
        }
        return dVar;
    }

    public static final boolean g(d dVar, int i, dp2 dp2Var) {
        sy6 sy6Var;
        zb5 zb5Var = new zb5(0, new d[16]);
        e(dVar, zb5Var);
        int i2 = zb5Var.c;
        if (i2 <= 1) {
            d dVar2 = (d) (i2 == 0 ? null : zb5Var.a[0]);
            if (dVar2 != null) {
                return ((Boolean) dp2Var.invoke(dVar2)).booleanValue();
            }
        } else {
            if (i == 7) {
                i = 4;
            }
            if (i == 4 || i == 6) {
                sy6 sy6VarC = zk8.C(dVar);
                float f = sy6VarC.a;
                float f2 = sy6VarC.b;
                sy6Var = new sy6(f, f2, f, f2);
            } else {
                if (i != 3 && i != 5) {
                    throw new IllegalStateException("This function should only be used for 2-D focus search");
                }
                sy6 sy6VarC2 = zk8.C(dVar);
                float f3 = sy6VarC2.c;
                float f4 = sy6VarC2.d;
                sy6Var = new sy6(f3, f4, f3, f4);
            }
            d dVarF = f(zb5Var, sy6Var, i);
            if (dVarF != null) {
                return ((Boolean) dp2Var.invoke(dVarF)).booleanValue();
            }
        }
        return false;
    }

    public static final boolean h(d dVar, dp2 dp2Var) {
        int iOrdinal = dVar.H0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                d dVarE = zk8.E(dVar);
                if (dVarE != null) {
                    return h(dVarE, dp2Var) || j(dVar, dVarE, 1, dp2Var);
                }
                throw new IllegalStateException("ActiveParent must have a focusedChild");
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return dVar.E0().a ? ((Boolean) ((FocusOwnerImpl$focusSearch$1) dp2Var).invoke(dVar)).booleanValue() : s(dVar, dp2Var);
                }
                throw new NoWhenBranchMatchedException();
            }
        }
        return s(dVar, dp2Var);
    }

    public static final boolean i(final int i, final dp2 dp2Var, final sy6 sy6Var, final d dVar) {
        if (t(i, dp2Var, sy6Var, dVar)) {
            return true;
        }
        final d dVarF = ((c) y40.I(dVar).getFocusOwner()).f();
        Boolean bool = (Boolean) tv8.w(dVar, i, new dp2() { // from class: androidx.compose.ui.focus.TwoDimensionalFocusSearchKt$generateAndSearchChildren$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.dp2
            public final Object invoke(Object obj) {
                wa0 wa0Var = (wa0) obj;
                d dVar2 = dVar;
                if (dVarF != ((c) y40.I(dVar2).getFocusOwner()).f()) {
                    return Boolean.TRUE;
                }
                boolean zT = e.t(i, dp2Var, sy6Var, dVar2);
                Boolean boolValueOf = Boolean.valueOf(zT);
                if (zT || !wa0Var.a()) {
                    return boolValueOf;
                }
                return null;
            }
        });
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean j(final d dVar, final d dVar2, final int i, final dp2 dp2Var) {
        if (u(dVar, dVar2, i, dp2Var)) {
            return true;
        }
        final d dVarF = ((c) y40.I(dVar).getFocusOwner()).f();
        Boolean bool = (Boolean) tv8.w(dVar, i, new dp2() { // from class: androidx.compose.ui.focus.OneDimensionalFocusSearchKt$generateAndSearchChildren$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.dp2
            public final Object invoke(Object obj) {
                wa0 wa0Var = (wa0) obj;
                d dVar3 = dVar;
                if (dVarF != ((c) y40.I(dVar3).getFocusOwner()).f()) {
                    return Boolean.TRUE;
                }
                boolean zU = e.u(dVar3, dVar2, i, dp2Var);
                Boolean boolValueOf = Boolean.valueOf(zU);
                if (zU || !wa0Var.a()) {
                    return boolValueOf;
                }
                return null;
            }
        });
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean k(sy6 sy6Var, sy6 sy6Var2, sy6 sy6Var3, int i) {
        if (!l(i, sy6Var, sy6Var3)) {
            return false;
        }
        if (l(i, sy6Var2, sy6Var3) && !b(sy6Var3, sy6Var, sy6Var2, i)) {
            return !b(sy6Var3, sy6Var2, sy6Var, i) && m(i, sy6Var3, sy6Var) < m(i, sy6Var3, sy6Var2);
        }
        return true;
    }

    public static final boolean l(int i, sy6 sy6Var, sy6 sy6Var2) {
        if (i == 3) {
            float f = sy6Var2.c;
            float f2 = sy6Var2.a;
            float f3 = sy6Var.c;
            return (f > f3 || f2 >= f3) && f2 > sy6Var.a;
        }
        if (i == 4) {
            float f4 = sy6Var2.a;
            float f5 = sy6Var2.c;
            float f6 = sy6Var.a;
            return (f4 < f6 || f5 <= f6) && f5 < sy6Var.c;
        }
        if (i == 5) {
            float f7 = sy6Var2.d;
            float f8 = sy6Var2.b;
            float f9 = sy6Var.d;
            return (f7 > f9 || f8 >= f9) && f8 > sy6Var.b;
        }
        if (i != 6) {
            throw new IllegalStateException("This function should only be used for 2-D focus search");
        }
        float f10 = sy6Var2.b;
        float f11 = sy6Var2.d;
        float f12 = sy6Var.b;
        return (f10 < f12 || f11 <= f12) && f11 < sy6Var.d;
    }

    public static final long m(int i, sy6 sy6Var, sy6 sy6Var2) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        if (i == 3) {
            f = sy6Var.a;
            f2 = sy6Var2.c;
        } else if (i == 4) {
            f = sy6Var2.a;
            f2 = sy6Var.c;
        } else if (i == 5) {
            f = sy6Var.b;
            f2 = sy6Var2.d;
        } else {
            if (i != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            f = sy6Var2.b;
            f2 = sy6Var.d;
        }
        float f7 = f - f2;
        if (f7 < 0.0f) {
            f7 = 0.0f;
        }
        long j = (long) f7;
        if (i == 3 || i == 4) {
            float f8 = sy6Var.b;
            f3 = 2;
            f4 = ((sy6Var.d - f8) / f3) + f8;
            f5 = sy6Var2.b;
            f6 = sy6Var2.d;
        } else {
            if (i != 5 && i != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            float f9 = sy6Var.a;
            f3 = 2;
            f4 = ((sy6Var.c - f9) / f3) + f9;
            f5 = sy6Var2.a;
            f6 = sy6Var2.c;
        }
        long j2 = (long) (f4 - (((f6 - f5) / f3) + f5));
        return (j2 * j2) + (((long) 13) * j * j);
    }

    public static final CustomDestinationResult n(d dVar, int i) {
        int iOrdinal = dVar.H0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                d dVarE = zk8.E(dVar);
                if (dVarE == null) {
                    throw new IllegalArgumentException("ActiveParent with no focused child");
                }
                CustomDestinationResult customDestinationResultN = n(dVarE, i);
                CustomDestinationResult customDestinationResult = CustomDestinationResult.a;
                if (customDestinationResultN == customDestinationResult) {
                    customDestinationResultN = null;
                }
                if (customDestinationResultN != null) {
                    return customDestinationResultN;
                }
                if (dVar.q) {
                    return customDestinationResult;
                }
                dVar.q = true;
                try {
                    og2 og2VarE0 = dVar.E0();
                    km0 km0Var = new km0(i);
                    c cVar = (c) y40.I(dVar).getFocusOwner();
                    d dVarF = cVar.f();
                    og2VarE0.k.invoke(km0Var);
                    d dVarF2 = cVar.f();
                    if (!km0Var.b) {
                        return (dVarF == dVarF2 || dVarF2 == null) ? customDestinationResult : qg2.d == qg2.c ? CustomDestinationResult.b : CustomDestinationResult.c;
                    }
                    qg2 qg2Var = qg2.b;
                    return CustomDestinationResult.b;
                } finally {
                    dVar.q = false;
                }
            }
            if (iOrdinal == 2) {
                return CustomDestinationResult.b;
            }
            if (iOrdinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return CustomDestinationResult.a;
    }

    public static final CustomDestinationResult o(d dVar, int i) {
        if (!dVar.r) {
            dVar.r = true;
            try {
                og2 og2VarE0 = dVar.E0();
                km0 km0Var = new km0(i);
                c cVar = (c) y40.I(dVar).getFocusOwner();
                d dVarF = cVar.f();
                og2VarE0.j.invoke(km0Var);
                d dVarF2 = cVar.f();
                if (km0Var.b) {
                    qg2 qg2Var = qg2.b;
                    return CustomDestinationResult.b;
                }
                if (dVarF != dVarF2 && dVarF2 != null) {
                    return qg2.d == qg2.c ? CustomDestinationResult.b : CustomDestinationResult.c;
                }
            } finally {
                dVar.r = false;
            }
        }
        return CustomDestinationResult.a;
    }

    public static final CustomDestinationResult p(d dVar, int i) {
        gx4 gx4VarJ;
        z4 z4Var;
        int iOrdinal = dVar.H0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                d dVarE = zk8.E(dVar);
                if (dVarE != null) {
                    return n(dVarE, i);
                }
                throw new IllegalArgumentException("ActiveParent with no focused child");
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                if (!dVar.a.n) {
                    rn3.b("visitAncestors called on an unattached node");
                }
                gx4 gx4Var = dVar.a.e;
                h hVarH = y40.H(dVar);
                loop0: while (true) {
                    if (hVarH == null) {
                        gx4VarJ = null;
                        break;
                    }
                    if ((((gx4) hVarH.H.g).d & 1024) != 0) {
                        while (gx4Var != null) {
                            if ((gx4Var.c & 1024) != 0) {
                                gx4VarJ = gx4Var;
                                zb5 zb5Var = null;
                                while (gx4VarJ != null) {
                                    if (gx4VarJ instanceof d) {
                                        break loop0;
                                    }
                                    if ((gx4VarJ.c & 1024) != 0 && (gx4VarJ instanceof ti1)) {
                                        int i2 = 0;
                                        for (gx4 gx4Var2 = ((ti1) gx4VarJ).p; gx4Var2 != null; gx4Var2 = gx4Var2.f) {
                                            if ((gx4Var2.c & 1024) != 0) {
                                                i2++;
                                                if (i2 == 1) {
                                                    gx4VarJ = gx4Var2;
                                                } else {
                                                    if (zb5Var == null) {
                                                        zb5Var = new zb5(0, new gx4[16]);
                                                    }
                                                    if (gx4VarJ != null) {
                                                        zb5Var.b(gx4VarJ);
                                                        gx4VarJ = null;
                                                    }
                                                    zb5Var.b(gx4Var2);
                                                }
                                            }
                                        }
                                        if (i2 == 1) {
                                        }
                                    }
                                    gx4VarJ = y40.j(zb5Var);
                                }
                            }
                            gx4Var = gx4Var.e;
                        }
                    }
                    hVarH = hVarH.F();
                    gx4Var = (hVarH == null || (z4Var = hVarH.H) == null) ? null : (ue8) z4Var.f;
                }
                d dVar2 = (d) gx4VarJ;
                if (dVar2 == null) {
                    return CustomDestinationResult.a;
                }
                int iOrdinal2 = dVar2.H0().ordinal();
                if (iOrdinal2 == 0) {
                    return o(dVar2, i);
                }
                if (iOrdinal2 == 1) {
                    return p(dVar2, i);
                }
                if (iOrdinal2 == 2) {
                    return CustomDestinationResult.b;
                }
                if (iOrdinal2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                CustomDestinationResult customDestinationResultP = p(dVar2, i);
                CustomDestinationResult customDestinationResult = customDestinationResultP != CustomDestinationResult.a ? customDestinationResultP : null;
                return customDestinationResult == null ? o(dVar2, i) : customDestinationResult;
            }
        }
        return CustomDestinationResult.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:150:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x022a A[ADDED_TO_REGION, LOOP:9: B:152:0x022a->B:159:0x023e, LOOP_START, PHI: r12
      0x022a: PHI (r12v3 int) = (r12v2 int), (r12v4 int) binds: [B:151:0x0228, B:159:0x023e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x024d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean q(final androidx.compose.ui.focus.d r18) {
        /*
            Method dump skipped, instruction units count: 604
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.e.q(androidx.compose.ui.focus.d):boolean");
    }

    public static final boolean r(d dVar, dp2 dp2Var) {
        Object[] objArr = new d[16];
        if (!dVar.a.n) {
            rn3.b("visitChildren called on an unattached node");
        }
        zb5 zb5Var = new zb5(0, new gx4[16]);
        gx4 gx4Var = dVar.a;
        gx4 gx4Var2 = gx4Var.f;
        if (gx4Var2 == null) {
            y40.g(zb5Var, gx4Var);
        } else {
            zb5Var.b(gx4Var2);
        }
        int i = 0;
        while (true) {
            int i2 = zb5Var.c;
            if (i2 == 0) {
                break;
            }
            gx4 gx4VarJ = (gx4) zb5Var.l(i2 - 1);
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
                                d dVar2 = (d) gx4VarJ;
                                int i3 = i + 1;
                                if (objArr.length < i3) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i3, length * 2)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i] = dVar2;
                                i = i3;
                            } else if ((gx4VarJ.c & 1024) != 0 && (gx4VarJ instanceof ti1)) {
                                int i4 = 0;
                                for (gx4 gx4Var3 = ((ti1) gx4VarJ).p; gx4Var3 != null; gx4Var3 = gx4Var3.f) {
                                    if ((gx4Var3.c & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            gx4VarJ = gx4Var3;
                                        } else {
                                            if (zb5Var2 == null) {
                                                zb5Var2 = new zb5(0, new gx4[16]);
                                            }
                                            if (gx4VarJ != null) {
                                                zb5Var2.b(gx4VarJ);
                                                gx4VarJ = null;
                                            }
                                            zb5Var2.b(gx4Var3);
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
        ew.T0(objArr, yg2.b, 0, i);
        int i5 = i - 1;
        if (i5 < objArr.length) {
            while (i5 >= 0) {
                d dVar3 = (d) objArr[i5];
                if (zk8.L(dVar3) && a(dVar3, dp2Var)) {
                    return true;
                }
                i5--;
            }
        }
        return false;
    }

    public static final boolean s(d dVar, dp2 dp2Var) {
        Object[] objArr = new d[16];
        if (!dVar.a.n) {
            rn3.b("visitChildren called on an unattached node");
        }
        zb5 zb5Var = new zb5(0, new gx4[16]);
        gx4 gx4Var = dVar.a;
        gx4 gx4Var2 = gx4Var.f;
        if (gx4Var2 == null) {
            y40.g(zb5Var, gx4Var);
        } else {
            zb5Var.b(gx4Var2);
        }
        int i = 0;
        while (true) {
            int i2 = zb5Var.c;
            if (i2 == 0) {
                break;
            }
            gx4 gx4VarJ = (gx4) zb5Var.l(i2 - 1);
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
                                d dVar2 = (d) gx4VarJ;
                                int i3 = i + 1;
                                if (objArr.length < i3) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i3, length * 2)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i] = dVar2;
                                i = i3;
                            } else if ((gx4VarJ.c & 1024) != 0 && (gx4VarJ instanceof ti1)) {
                                int i4 = 0;
                                for (gx4 gx4Var3 = ((ti1) gx4VarJ).p; gx4Var3 != null; gx4Var3 = gx4Var3.f) {
                                    if ((gx4Var3.c & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            gx4VarJ = gx4Var3;
                                        } else {
                                            if (zb5Var2 == null) {
                                                zb5Var2 = new zb5(0, new gx4[16]);
                                            }
                                            if (gx4VarJ != null) {
                                                zb5Var2.b(gx4VarJ);
                                                gx4VarJ = null;
                                            }
                                            zb5Var2.b(gx4Var3);
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
        ew.T0(objArr, yg2.b, 0, i);
        for (int i5 = 0; i5 < i; i5++) {
            d dVar3 = (d) objArr[i5];
            if (zk8.L(dVar3) && h(dVar3, dp2Var)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean t(int i, dp2 dp2Var, sy6 sy6Var, d dVar) {
        d dVarF;
        zb5 zb5Var = new zb5(0, new d[16]);
        if (!dVar.a.n) {
            rn3.b("visitChildren called on an unattached node");
        }
        zb5 zb5Var2 = new zb5(0, new gx4[16]);
        gx4 gx4Var = dVar.a;
        gx4 gx4Var2 = gx4Var.f;
        if (gx4Var2 == null) {
            y40.g(zb5Var2, gx4Var);
        } else {
            zb5Var2.b(gx4Var2);
        }
        while (true) {
            int i2 = zb5Var2.c;
            if (i2 == 0) {
                break;
            }
            gx4 gx4VarJ = (gx4) zb5Var2.l(i2 - 1);
            if ((gx4VarJ.d & 1024) == 0) {
                y40.g(zb5Var2, gx4VarJ);
            } else {
                while (true) {
                    if (gx4VarJ == null) {
                        break;
                    }
                    if ((gx4VarJ.c & 1024) != 0) {
                        zb5 zb5Var3 = null;
                        while (gx4VarJ != null) {
                            if (gx4VarJ instanceof d) {
                                d dVar2 = (d) gx4VarJ;
                                if (dVar2.n) {
                                    zb5Var.b(dVar2);
                                }
                            } else if ((gx4VarJ.c & 1024) != 0 && (gx4VarJ instanceof ti1)) {
                                int i3 = 0;
                                for (gx4 gx4Var3 = ((ti1) gx4VarJ).p; gx4Var3 != null; gx4Var3 = gx4Var3.f) {
                                    if ((gx4Var3.c & 1024) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            gx4VarJ = gx4Var3;
                                        } else {
                                            if (zb5Var3 == null) {
                                                zb5Var3 = new zb5(0, new gx4[16]);
                                            }
                                            if (gx4VarJ != null) {
                                                zb5Var3.b(gx4VarJ);
                                                gx4VarJ = null;
                                            }
                                            zb5Var3.b(gx4Var3);
                                        }
                                    }
                                }
                                if (i3 == 1) {
                                }
                            }
                            gx4VarJ = y40.j(zb5Var3);
                        }
                    } else {
                        gx4VarJ = gx4VarJ.f;
                    }
                }
            }
        }
        while (zb5Var.c != 0 && (dVarF = f(zb5Var, sy6Var, i)) != null) {
            if (dVarF.E0().a) {
                return ((Boolean) ((FocusOwnerImpl$focusSearch$1) dp2Var).invoke(dVarF)).booleanValue();
            }
            if (i(i, dp2Var, sy6Var, dVarF)) {
                return true;
            }
            zb5Var.k(dVarF);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x00fe, code lost:
    
        return true;
     */
    /* JADX WARN: Removed duplicated region for block: B:129:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x019b A[EDGE_INSN: B:157:0x019b->B:127:0x019b BREAK  A[LOOP:5: B:89:0x012c->B:162:0x012c], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x012e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean u(androidx.compose.ui.focus.d r12, androidx.compose.ui.focus.d r13, int r14, defpackage.dp2 r15) {
        /*
            Method dump skipped, instruction units count: 444
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.e.u(androidx.compose.ui.focus.d, androidx.compose.ui.focus.d, int, dp2):boolean");
    }

    public static final Boolean v(int i, dp2 dp2Var, sy6 sy6Var, d dVar) {
        int iOrdinal = dVar.H0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                d dVarE = zk8.E(dVar);
                if (dVarE == null) {
                    throw new IllegalStateException("ActiveParent must have a focusedChild");
                }
                int iOrdinal2 = dVarE.H0().ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 1) {
                        Boolean boolV = v(i, dp2Var, sy6Var, dVarE);
                        if (!js3.i(boolV, Boolean.FALSE)) {
                            return boolV;
                        }
                        if (sy6Var == null) {
                            if (dVarE.H0() != FocusStateImpl.b) {
                                throw new IllegalStateException("Searching for active node in inactive hierarchy");
                            }
                            d dVarA = zk8.A(dVarE);
                            if (dVarA == null) {
                                throw new IllegalStateException("ActiveParent must have a focusedChild");
                            }
                            sy6Var = zk8.C(dVarA);
                        }
                        return Boolean.valueOf(i(i, dp2Var, sy6Var, dVar));
                    }
                    if (iOrdinal2 != 2) {
                        if (iOrdinal2 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        throw new IllegalStateException("ActiveParent must have a focusedChild");
                    }
                }
                if (sy6Var == null) {
                    sy6Var = zk8.C(dVarE);
                }
                return Boolean.valueOf(i(i, dp2Var, sy6Var, dVar));
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return dVar.E0().a ? (Boolean) ((FocusOwnerImpl$focusSearch$1) dp2Var).invoke(dVar) : sy6Var == null ? Boolean.valueOf(g(dVar, i, dp2Var)) : Boolean.valueOf(t(i, dp2Var, sy6Var, dVar));
                }
                throw new NoWhenBranchMatchedException();
            }
        }
        return Boolean.valueOf(g(dVar, i, dp2Var));
    }
}
