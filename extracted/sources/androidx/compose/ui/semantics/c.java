package androidx.compose.ui.semantics;

import androidx.compose.ui.node.m;
import defpackage.c26;
import defpackage.dp2;
import defpackage.en7;
import defpackage.gx4;
import defpackage.in7;
import defpackage.jn7;
import defpackage.nn7;
import defpackage.sy6;
import defpackage.ti1;
import defpackage.tx8;
import defpackage.v97;
import defpackage.y40;
import defpackage.z17;
import defpackage.zb5;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public final gx4 a;
    public final boolean b;
    public final androidx.compose.ui.node.h c;
    public final en7 d;
    public boolean e;
    public c f;
    public final int g;

    public c(gx4 gx4Var, boolean z, androidx.compose.ui.node.h hVar, en7 en7Var) {
        this.a = gx4Var;
        this.b = z;
        this.c = hVar;
        this.d = en7Var;
        this.g = hVar.b;
    }

    public static /* synthetic */ List j(int i, c cVar) {
        return cVar.i((i & 1) != 0 ? !cVar.b : false, (i & 2) == 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [gx4] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [gx4] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v9 */
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
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v7 */
    public final sy6 a(m mVar) {
        ?? J;
        c cVarL = l();
        if (cVarL == null) {
            return sy6.e;
        }
        gx4 gx4Var = (gx4) cVarL.c.H.g;
        if ((gx4Var.d & 8) != 0) {
            loop0: while (gx4Var != null) {
                if ((gx4Var.c & 8) != 0) {
                    J = gx4Var;
                    ?? zb5Var = 0;
                    while (J != 0) {
                        if (J instanceof in7) {
                            if (((in7) J).h()) {
                                break loop0;
                            }
                        } else if ((J.c & 8) != 0 && (J instanceof ti1)) {
                            gx4 gx4Var2 = ((ti1) J).p;
                            int i = 0;
                            J = J;
                            zb5Var = zb5Var;
                            while (gx4Var2 != null) {
                                if ((gx4Var2.c & 8) != 0) {
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
                if ((gx4Var.d & 8) == 0) {
                    break;
                }
                gx4Var = gx4Var.f;
            }
            J = 0;
        } else {
            J = 0;
        }
        in7 in7Var = (in7) J;
        m mVarE = in7Var != null ? y40.E(in7Var, 8) : null;
        return mVarE == null ? cVarL.a(mVar) : mVarE.I(mVar, true);
    }

    public final c b(v97 v97Var, dp2 dp2Var) {
        en7 en7Var = new en7();
        en7Var.c = false;
        en7Var.d = false;
        dp2Var.invoke(en7Var);
        c cVar = new c(new jn7(dp2Var), false, new androidx.compose.ui.node.h(this.g + (v97Var != null ? 1000000000 : 2000000000), true), en7Var);
        cVar.e = true;
        cVar.f = this;
        return cVar;
    }

    public final void c(androidx.compose.ui.node.h hVar, ArrayList arrayList) {
        zb5 zb5VarK = hVar.K();
        Object[] objArr = zb5VarK.a;
        int i = zb5VarK.c;
        for (int i2 = 0; i2 < i; i2++) {
            androidx.compose.ui.node.h hVar2 = (androidx.compose.ui.node.h) objArr[i2];
            if (hVar2.U() && !hVar2.R) {
                if (hVar2.H.f(8)) {
                    arrayList.add(z17.a(hVar2, this.b));
                } else {
                    c(hVar2, arrayList);
                }
            }
        }
    }

    public final m d() {
        if (!this.e) {
            in7 in7VarF = f();
            return in7VarF != null ? y40.E(in7VarF, 8) : (androidx.compose.ui.node.e) this.c.H.d;
        }
        c cVarL = l();
        if (cVarL != null) {
            return cVarL.d();
        }
        return null;
    }

    public final void e(ArrayList arrayList, ArrayList arrayList2) {
        q(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            c cVar = (c) arrayList.get(size2);
            if (cVar.n()) {
                arrayList2.add(cVar);
            } else if (!cVar.d.d) {
                cVar.e(arrayList, arrayList2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [gx4] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [gx4] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13, types: [gx4] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16, types: [gx4] */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v3, types: [zb5] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [zb5] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15, types: [zb5] */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18, types: [zb5] */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r8v10 */
    public final in7 f() {
        ?? J;
        boolean z = this.d.c;
        androidx.compose.ui.node.h hVar = this.c;
        ?? r5 = 0;
        r5 = 0;
        r5 = 0;
        r5 = 0;
        if (z) {
            gx4 gx4Var = (gx4) hVar.H.g;
            if ((gx4Var.d & 8) != 0) {
                J = 0;
                while (gx4Var != null) {
                    if ((gx4Var.c & 8) != 0) {
                        ?? J2 = gx4Var;
                        ?? zb5Var = 0;
                        while (J2 != 0) {
                            if (J2 instanceof in7) {
                                in7 in7Var = (in7) J2;
                                if (in7Var.h()) {
                                    if (in7Var.m0()) {
                                        return in7Var;
                                    }
                                    if (J == 0) {
                                        J = in7Var;
                                    }
                                }
                            } else if ((J2.c & 8) != 0 && (J2 instanceof ti1)) {
                                gx4 gx4Var2 = ((ti1) J2).p;
                                int i = 0;
                                J2 = J2;
                                zb5Var = zb5Var;
                                while (gx4Var2 != null) {
                                    if ((gx4Var2.c & 8) != 0) {
                                        i++;
                                        zb5Var = zb5Var;
                                        if (i == 1) {
                                            J2 = gx4Var2;
                                        } else {
                                            if (zb5Var == 0) {
                                                zb5Var = new zb5(0, new gx4[16]);
                                            }
                                            if (J2 != 0) {
                                                zb5Var.b(J2);
                                                J2 = 0;
                                            }
                                            zb5Var.b(gx4Var2);
                                        }
                                    }
                                    gx4Var2 = gx4Var2.f;
                                    J2 = J2;
                                    zb5Var = zb5Var;
                                }
                                if (i == 1) {
                                }
                            }
                            J2 = y40.j(zb5Var);
                        }
                    }
                    if ((gx4Var.d & 8) == 0) {
                        break;
                    }
                    gx4Var = gx4Var.f;
                    J = J;
                }
                r5 = J;
            }
        } else {
            gx4 gx4Var3 = (gx4) hVar.H.g;
            if ((gx4Var3.d & 8) != 0) {
                loop3: while (gx4Var3 != null) {
                    if ((gx4Var3.c & 8) != 0) {
                        J = gx4Var3;
                        ?? zb5Var2 = 0;
                        while (J != 0) {
                            if (J instanceof in7) {
                                if (((in7) J).h()) {
                                    r5 = J;
                                }
                            } else if ((J.c & 8) != 0 && (J instanceof ti1)) {
                                gx4 gx4Var4 = ((ti1) J).p;
                                int i2 = 0;
                                J = J;
                                zb5Var2 = zb5Var2;
                                while (gx4Var4 != null) {
                                    if ((gx4Var4.c & 8) != 0) {
                                        i2++;
                                        zb5Var2 = zb5Var2;
                                        if (i2 == 1) {
                                            J = gx4Var4;
                                        } else {
                                            if (zb5Var2 == 0) {
                                                zb5Var2 = new zb5(0, new gx4[16]);
                                            }
                                            if (J != 0) {
                                                zb5Var2.b(J);
                                                J = 0;
                                            }
                                            zb5Var2.b(gx4Var4);
                                        }
                                    }
                                    gx4Var4 = gx4Var4.f;
                                    J = J;
                                    zb5Var2 = zb5Var2;
                                }
                                if (i2 == 1) {
                                }
                            }
                            J = y40.j(zb5Var2);
                        }
                    }
                    if ((gx4Var3.d & 8) == 0) {
                        break;
                    }
                    gx4Var3 = gx4Var3.f;
                }
            }
        }
        return (in7) r5;
    }

    public final sy6 g() {
        m mVarD = d();
        if (mVarD != null) {
            if (!mVarD.J0().n) {
                mVarD = null;
            }
            if (mVarD != null) {
                return c26.t(mVarD).I(mVarD, true);
            }
        }
        return sy6.e;
    }

    public final sy6 h() {
        m mVarD = d();
        if (mVarD != null) {
            if (!mVarD.J0().n) {
                mVarD = null;
            }
            if (mVarD != null) {
                return c26.n(mVarD, true);
            }
        }
        return sy6.e;
    }

    public final List i(boolean z, boolean z2) {
        if (!z && this.d.d) {
            return EmptyList.a;
        }
        ArrayList arrayList = new ArrayList();
        if (!n()) {
            return q(arrayList, z2);
        }
        ArrayList arrayList2 = new ArrayList();
        e(arrayList, arrayList2);
        return arrayList2;
    }

    public final en7 k() {
        boolean zN = n();
        en7 en7Var = this.d;
        if (!zN) {
            return en7Var;
        }
        en7 en7VarC = en7Var.c();
        p(new ArrayList(), en7VarC);
        return en7VarC;
    }

    public final c l() {
        androidx.compose.ui.node.h hVarF;
        c cVar = this.f;
        if (cVar != null) {
            return cVar;
        }
        androidx.compose.ui.node.h hVar = this.c;
        boolean z = this.b;
        if (z) {
            hVarF = hVar.F();
            while (hVarF != null) {
                en7 en7VarH = hVarF.H();
                if (en7VarH != null && en7VarH.c) {
                    break;
                }
                hVarF = hVarF.F();
            }
            hVarF = null;
        } else {
            hVarF = null;
        }
        if (hVarF == null) {
            androidx.compose.ui.node.h hVarF2 = hVar.F();
            while (true) {
                if (hVarF2 == null) {
                    hVarF = null;
                    break;
                }
                if (hVarF2.H.f(8)) {
                    hVarF = hVarF2;
                    break;
                }
                hVarF2 = hVarF2.F();
            }
        }
        if (hVarF == null) {
            return null;
        }
        return z17.a(hVarF, z);
    }

    public final en7 m() {
        return this.d;
    }

    public final boolean n() {
        return this.b && this.d.c;
    }

    public final boolean o() {
        if (this.e || !j(4, this).isEmpty()) {
            return false;
        }
        androidx.compose.ui.node.h hVarF = this.c.F();
        while (true) {
            if (hVarF == null) {
                hVarF = null;
                break;
            }
            en7 en7VarH = hVarF.H();
            if (en7VarH != null && en7VarH.c) {
                break;
            }
            hVarF = hVarF.F();
        }
        return hVarF == null;
    }

    public final void p(ArrayList arrayList, en7 en7Var) {
        if (this.d.d) {
            return;
        }
        q(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            c cVar = (c) arrayList.get(size2);
            if (!cVar.n()) {
                en7Var.e(cVar.d);
                cVar.p(arrayList, en7Var);
            }
        }
    }

    public final List q(ArrayList arrayList, boolean z) {
        if (this.e) {
            return EmptyList.a;
        }
        c(this.c, arrayList);
        if (z) {
            g gVar = d.y;
            en7 en7Var = this.d;
            final v97 v97Var = (v97) b.a(en7Var, gVar);
            if (v97Var != null && en7Var.c && !arrayList.isEmpty()) {
                arrayList.add(b(v97Var, new dp2() { // from class: androidx.compose.ui.semantics.SemanticsNode$emitFakeNodes$fakeNode$1
                    {
                        super(1);
                    }

                    @Override // defpackage.dp2
                    public final Object invoke(Object obj) {
                        f.f((nn7) obj, v97Var.a);
                        return tx8.a;
                    }
                }));
            }
            g gVar2 = d.a;
            if (en7Var.a.c(gVar2) && !arrayList.isEmpty() && en7Var.c) {
                List list = (List) b.a(en7Var, gVar2);
                final String str = list != null ? (String) kotlin.collections.a.p0(list) : null;
                if (str != null) {
                    arrayList.add(0, b(null, new dp2() { // from class: androidx.compose.ui.semantics.SemanticsNode$emitFakeNodes$fakeNode$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // defpackage.dp2
                        public final Object invoke(Object obj) {
                            f.d((nn7) obj, str);
                            return tx8.a;
                        }
                    }));
                }
            }
        }
        return arrayList;
    }
}
