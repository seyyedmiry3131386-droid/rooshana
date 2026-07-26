package defpackage;

import androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour;
import androidx.constraintlayout.core.widgets.analyzer.f;
import androidx.constraintlayout.widget.b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class g31 extends f31 {
    public final l74 A0;
    public int B0;
    public int C0;
    public int D0;
    public int E0;
    public jo0[] F0;
    public jo0[] G0;
    public int H0;
    public boolean I0;
    public boolean J0;
    public WeakReference K0;
    public WeakReference L0;
    public WeakReference M0;
    public WeakReference N0;
    public final HashSet O0;
    public final ea0 P0;
    public ArrayList u0 = new ArrayList();
    public final wv8 v0 = new wv8(this);
    public final xj1 w0;
    public int x0;
    public fa0 y0;
    public boolean z0;

    public g31() {
        xj1 xj1Var = new xj1();
        xj1Var.b = true;
        xj1Var.c = true;
        xj1Var.f = new ArrayList();
        new ArrayList();
        xj1Var.h = null;
        xj1Var.i = new ea0();
        xj1Var.g = new ArrayList();
        xj1Var.d = this;
        xj1Var.e = this;
        this.w0 = xj1Var;
        this.y0 = null;
        this.z0 = false;
        this.A0 = new l74();
        this.D0 = 0;
        this.E0 = 0;
        this.F0 = new jo0[4];
        this.G0 = new jo0[4];
        this.H0 = 257;
        this.I0 = false;
        this.J0 = false;
        this.K0 = null;
        this.L0 = null;
        this.M0 = null;
        this.N0 = null;
        this.O0 = new HashSet();
        this.P0 = new ea0();
    }

    public static void W(f31 f31Var, fa0 fa0Var, ea0 ea0Var) {
        int i;
        int i2;
        if (fa0Var == null) {
            return;
        }
        int i3 = f31Var.i0;
        int[] iArr = f31Var.t;
        if (i3 == 8 || (f31Var instanceof aw2) || (f31Var instanceof l50)) {
            ea0Var.e = 0;
            ea0Var.f = 0;
            return;
        }
        ConstraintWidget$DimensionBehaviour[] constraintWidget$DimensionBehaviourArr = f31Var.U;
        ea0Var.a = constraintWidget$DimensionBehaviourArr[0];
        ea0Var.b = constraintWidget$DimensionBehaviourArr[1];
        ea0Var.c = f31Var.r();
        ea0Var.d = f31Var.l();
        ea0Var.i = false;
        ea0Var.j = 0;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour = ea0Var.a;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour2 = ConstraintWidget$DimensionBehaviour.c;
        boolean z = constraintWidget$DimensionBehaviour == constraintWidget$DimensionBehaviour2;
        boolean z2 = ea0Var.b == constraintWidget$DimensionBehaviour2;
        boolean z3 = z && f31Var.Y > 0.0f;
        boolean z4 = z2 && f31Var.Y > 0.0f;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour3 = ConstraintWidget$DimensionBehaviour.b;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour4 = ConstraintWidget$DimensionBehaviour.a;
        if (z && f31Var.u(0) && f31Var.r == 0 && !z3) {
            ea0Var.a = constraintWidget$DimensionBehaviour3;
            if (z2 && f31Var.s == 0) {
                ea0Var.a = constraintWidget$DimensionBehaviour4;
            }
            z = false;
        }
        if (z2 && f31Var.u(1) && f31Var.s == 0 && !z4) {
            ea0Var.b = constraintWidget$DimensionBehaviour3;
            if (z && f31Var.r == 0) {
                ea0Var.b = constraintWidget$DimensionBehaviour4;
            }
            z2 = false;
        }
        if (f31Var.B()) {
            ea0Var.a = constraintWidget$DimensionBehaviour4;
            z = false;
        }
        if (f31Var.C()) {
            ea0Var.b = constraintWidget$DimensionBehaviour4;
            z2 = false;
        }
        if (z3) {
            if (iArr[0] == 4) {
                ea0Var.a = constraintWidget$DimensionBehaviour4;
            } else if (!z2) {
                if (ea0Var.b == constraintWidget$DimensionBehaviour4) {
                    i2 = ea0Var.d;
                } else {
                    ea0Var.a = constraintWidget$DimensionBehaviour3;
                    ((b) fa0Var).b(f31Var, ea0Var);
                    i2 = ea0Var.f;
                }
                ea0Var.a = constraintWidget$DimensionBehaviour4;
                ea0Var.c = (int) (f31Var.Y * i2);
            }
        }
        if (z4) {
            if (iArr[1] == 4) {
                ea0Var.b = constraintWidget$DimensionBehaviour4;
            } else if (!z) {
                if (ea0Var.a == constraintWidget$DimensionBehaviour4) {
                    i = ea0Var.c;
                } else {
                    ea0Var.b = constraintWidget$DimensionBehaviour3;
                    ((b) fa0Var).b(f31Var, ea0Var);
                    i = ea0Var.e;
                }
                ea0Var.b = constraintWidget$DimensionBehaviour4;
                if (f31Var.Z == -1) {
                    ea0Var.d = (int) (i / f31Var.Y);
                } else {
                    ea0Var.d = (int) (f31Var.Y * i);
                }
            }
        }
        ((b) fa0Var).b(f31Var, ea0Var);
        f31Var.P(ea0Var.e);
        f31Var.M(ea0Var.f);
        f31Var.E = ea0Var.h;
        f31Var.J(ea0Var.g);
        ea0Var.j = 0;
    }

    @Override // defpackage.f31
    public final void D() {
        this.A0.t();
        this.B0 = 0;
        this.C0 = 0;
        this.u0.clear();
        super.D();
    }

    @Override // defpackage.f31
    public final void G(wv8 wv8Var) {
        super.G(wv8Var);
        int size = this.u0.size();
        for (int i = 0; i < size; i++) {
            ((f31) this.u0.get(i)).G(wv8Var);
        }
    }

    @Override // defpackage.f31
    public final void Q(boolean z, boolean z2) {
        super.Q(z, z2);
        int size = this.u0.size();
        for (int i = 0; i < size; i++) {
            ((f31) this.u0.get(i)).Q(z, z2);
        }
    }

    public final void S(f31 f31Var, int i) {
        if (i == 0) {
            int i2 = this.D0 + 1;
            jo0[] jo0VarArr = this.G0;
            if (i2 >= jo0VarArr.length) {
                this.G0 = (jo0[]) Arrays.copyOf(jo0VarArr, jo0VarArr.length * 2);
            }
            jo0[] jo0VarArr2 = this.G0;
            int i3 = this.D0;
            jo0VarArr2[i3] = new jo0(f31Var, 0, this.z0);
            this.D0 = i3 + 1;
            return;
        }
        if (i == 1) {
            int i4 = this.E0 + 1;
            jo0[] jo0VarArr3 = this.F0;
            if (i4 >= jo0VarArr3.length) {
                this.F0 = (jo0[]) Arrays.copyOf(jo0VarArr3, jo0VarArr3.length * 2);
            }
            jo0[] jo0VarArr4 = this.F0;
            int i5 = this.E0;
            jo0VarArr4[i5] = new jo0(f31Var, 1, this.z0);
            this.E0 = i5 + 1;
        }
    }

    public final void T(l74 l74Var) {
        g31 g31Var;
        l74 l74Var2;
        boolean zX = X(64);
        b(l74Var, zX);
        int size = this.u0.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            f31 f31Var = (f31) this.u0.get(i);
            boolean[] zArr = f31Var.T;
            zArr[0] = false;
            zArr[1] = false;
            if (f31Var instanceof l50) {
                z = true;
            }
        }
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                f31 f31Var2 = (f31) this.u0.get(i2);
                if (f31Var2 instanceof l50) {
                    l50 l50Var = (l50) f31Var2;
                    for (int i3 = 0; i3 < l50Var.v0; i3++) {
                        f31 f31Var3 = l50Var.u0[i3];
                        if (l50Var.x0 || f31Var3.c()) {
                            int i4 = l50Var.w0;
                            if (i4 == 0 || i4 == 1) {
                                f31Var3.T[0] = true;
                            } else if (i4 == 2 || i4 == 3) {
                                f31Var3.T[1] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = this.O0;
        hashSet.clear();
        for (int i5 = 0; i5 < size; i5++) {
            f31 f31Var4 = (f31) this.u0.get(i5);
            f31Var4.getClass();
            boolean z2 = f31Var4 instanceof sa9;
            if (z2 || (f31Var4 instanceof aw2)) {
                if (z2) {
                    hashSet.add(f31Var4);
                } else {
                    f31Var4.b(l74Var, zX);
                }
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                sa9 sa9Var = (sa9) ((f31) it.next());
                for (int i6 = 0; i6 < sa9Var.v0; i6++) {
                    if (hashSet.contains(sa9Var.u0[i6])) {
                        sa9Var.b(l74Var, zX);
                        hashSet.remove(sa9Var);
                        break;
                    }
                }
            }
            if (size2 == hashSet.size()) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((f31) it2.next()).b(l74Var, zX);
                }
                hashSet.clear();
            }
        }
        boolean z3 = l74.q;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour = ConstraintWidget$DimensionBehaviour.b;
        if (z3) {
            HashSet<f31> hashSet2 = new HashSet();
            for (int i7 = 0; i7 < size; i7++) {
                f31 f31Var5 = (f31) this.u0.get(i7);
                f31Var5.getClass();
                if (!(f31Var5 instanceof sa9) && !(f31Var5 instanceof aw2)) {
                    hashSet2.add(f31Var5);
                }
            }
            g31Var = this;
            l74Var2 = l74Var;
            g31Var.a(this, l74Var2, hashSet2, this.U[0] == constraintWidget$DimensionBehaviour ? 0 : 1, false);
            for (f31 f31Var6 : hashSet2) {
                rf0.m(this, l74Var2, f31Var6);
                f31Var6.b(l74Var2, zX);
            }
        } else {
            g31Var = this;
            l74Var2 = l74Var;
            for (int i8 = 0; i8 < size; i8++) {
                f31 f31Var7 = (f31) g31Var.u0.get(i8);
                if (f31Var7 instanceof g31) {
                    ConstraintWidget$DimensionBehaviour[] constraintWidget$DimensionBehaviourArr = f31Var7.U;
                    ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour2 = constraintWidget$DimensionBehaviourArr[0];
                    ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour3 = constraintWidget$DimensionBehaviourArr[1];
                    ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour4 = ConstraintWidget$DimensionBehaviour.a;
                    if (constraintWidget$DimensionBehaviour2 == constraintWidget$DimensionBehaviour) {
                        f31Var7.N(constraintWidget$DimensionBehaviour4);
                    }
                    if (constraintWidget$DimensionBehaviour3 == constraintWidget$DimensionBehaviour) {
                        f31Var7.O(constraintWidget$DimensionBehaviour4);
                    }
                    f31Var7.b(l74Var2, zX);
                    if (constraintWidget$DimensionBehaviour2 == constraintWidget$DimensionBehaviour) {
                        f31Var7.N(constraintWidget$DimensionBehaviour2);
                    }
                    if (constraintWidget$DimensionBehaviour3 == constraintWidget$DimensionBehaviour) {
                        f31Var7.O(constraintWidget$DimensionBehaviour3);
                    }
                } else {
                    rf0.m(this, l74Var2, f31Var7);
                    if (!(f31Var7 instanceof sa9) && !(f31Var7 instanceof aw2)) {
                        f31Var7.b(l74Var2, zX);
                    }
                }
            }
        }
        if (g31Var.D0 > 0) {
            bt2.g(this, l74Var2, null, 0);
        }
        if (g31Var.E0 > 0) {
            bt2.g(this, l74Var2, null, 1);
        }
    }

    public final boolean U(int i, boolean z) {
        boolean z2;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour;
        boolean z3;
        xj1 xj1Var = this.w0;
        ArrayList<f> arrayList = (ArrayList) xj1Var.f;
        g31 g31Var = (g31) xj1Var.d;
        boolean z4 = false;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviourK = g31Var.k(0);
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviourK2 = g31Var.k(1);
        int iS = g31Var.s();
        int iT = g31Var.t();
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour2 = ConstraintWidget$DimensionBehaviour.a;
        if (z && (constraintWidget$DimensionBehaviourK == (constraintWidget$DimensionBehaviour = ConstraintWidget$DimensionBehaviour.b) || constraintWidget$DimensionBehaviourK2 == constraintWidget$DimensionBehaviour)) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z3 = z;
                    break;
                }
                f fVar = (f) it.next();
                if (fVar.f == i && !fVar.k()) {
                    z3 = false;
                    break;
                }
            }
            if (i == 0) {
                if (z3 && constraintWidget$DimensionBehaviourK == constraintWidget$DimensionBehaviour) {
                    g31Var.N(constraintWidget$DimensionBehaviour2);
                    g31Var.P(xj1Var.e(g31Var, 0));
                    g31Var.d.e.d(g31Var.r());
                }
            } else if (z3 && constraintWidget$DimensionBehaviourK2 == constraintWidget$DimensionBehaviour) {
                g31Var.O(constraintWidget$DimensionBehaviour2);
                g31Var.M(xj1Var.e(g31Var, 1));
                g31Var.e.e.d(g31Var.l());
            }
        }
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour3 = ConstraintWidget$DimensionBehaviour.d;
        if (i == 0) {
            ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour4 = g31Var.U[0];
            if (constraintWidget$DimensionBehaviour4 == constraintWidget$DimensionBehaviour2 || constraintWidget$DimensionBehaviour4 == constraintWidget$DimensionBehaviour3) {
                int iR = g31Var.r() + iS;
                g31Var.d.i.d(iR);
                g31Var.d.e.d(iR - iS);
                z2 = true;
            }
            z2 = false;
        } else {
            ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour5 = g31Var.U[1];
            if (constraintWidget$DimensionBehaviour5 == constraintWidget$DimensionBehaviour2 || constraintWidget$DimensionBehaviour5 == constraintWidget$DimensionBehaviour3) {
                int iL = g31Var.l() + iT;
                g31Var.e.i.d(iL);
                g31Var.e.e.d(iL - iT);
                z2 = true;
            }
            z2 = false;
        }
        xj1Var.i();
        for (f fVar2 : arrayList) {
            if (fVar2.f == i && (fVar2.b != g31Var || fVar2.g)) {
                fVar2.e();
            }
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                z4 = true;
                break;
            }
            f fVar3 = (f) it2.next();
            if (fVar3.f == i && (z2 || fVar3.b != g31Var)) {
                if (!fVar3.h.j || !fVar3.i.j || (!(fVar3 instanceof ko0) && !fVar3.e.j)) {
                    break;
                }
            }
        }
        g31Var.N(constraintWidget$DimensionBehaviourK);
        g31Var.O(constraintWidget$DimensionBehaviourK2);
        return z4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:226:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x0640  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0672  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x06c0  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x06d1  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x06e1  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x06eb  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x0708  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x081a  */
    /* JADX WARN: Removed duplicated region for block: B:493:0x0857  */
    /* JADX WARN: Removed duplicated region for block: B:499:0x0871 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:514:0x08d9  */
    /* JADX WARN: Removed duplicated region for block: B:517:0x08eb  */
    /* JADX WARN: Removed duplicated region for block: B:520:0x0907  */
    /* JADX WARN: Removed duplicated region for block: B:521:0x0913  */
    /* JADX WARN: Removed duplicated region for block: B:523:0x0916  */
    /* JADX WARN: Removed duplicated region for block: B:535:0x094e A[PHI: r14 r25
      0x094e: PHI (r14v7 ??) = (r14v6 ??), (r14v10 ??), (r14v10 ??), (r14v10 ??) binds: [B:522:0x0914, B:530:0x0936, B:531:0x0938, B:533:0x093e] A[DONT_GENERATE, DONT_INLINE]
      0x094e: PHI (r25v6 boolean) = (r25v5 boolean), (r25v7 boolean), (r25v7 boolean), (r25v7 boolean) binds: [B:522:0x0914, B:530:0x0936, B:531:0x0938, B:533:0x093e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:537:0x0954  */
    /* JADX WARN: Removed duplicated region for block: B:538:0x0956  */
    /* JADX WARN: Removed duplicated region for block: B:542:0x0966  */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v29 */
    /* JADX WARN: Type inference failed for: r14v30 */
    /* JADX WARN: Type inference failed for: r14v31 */
    /* JADX WARN: Type inference failed for: r14v32 */
    /* JADX WARN: Type inference failed for: r14v33 */
    /* JADX WARN: Type inference failed for: r14v34 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v23 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v85 */
    /* JADX WARN: Type inference failed for: r15v86 */
    /* JADX WARN: Type inference failed for: r15v87 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r34v0, types: [f31, g31] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void V() {
        /*
            Method dump skipped, instruction units count: 2422
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g31.V():void");
    }

    public final boolean X(int i) {
        return (this.H0 & i) == i;
    }

    @Override // defpackage.f31
    public final void o(StringBuilder sb) {
        sb.append(this.j + ":{\n");
        StringBuilder sb2 = new StringBuilder("  actualWidth:");
        sb2.append(this.W);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("  actualHeight:" + this.X);
        sb.append("\n");
        Iterator it = this.u0.iterator();
        while (it.hasNext()) {
            ((f31) it.next()).o(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }
}
