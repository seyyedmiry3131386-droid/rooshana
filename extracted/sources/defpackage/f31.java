package defpackage;

import android.view.View;
import androidx.constraintlayout.core.widgets.ConstraintAnchor$Type;
import androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour;
import androidx.constraintlayout.core.widgets.analyzer.a;
import androidx.constraintlayout.core.widgets.analyzer.d;
import androidx.constraintlayout.core.widgets.analyzer.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class f31 {
    public int A;
    public float B;
    public int[] C;
    public float D;
    public boolean E;
    public boolean F;
    public boolean G;
    public int H;
    public int I;
    public final v21 J;
    public final v21 K;
    public final v21 L;
    public final v21 M;
    public final v21 N;
    public final v21 O;
    public final v21 P;
    public final v21 Q;
    public final v21[] R;
    public final ArrayList S;
    public final boolean[] T;
    public ConstraintWidget$DimensionBehaviour[] U;
    public f31 V;
    public int W;
    public int X;
    public float Y;
    public int Z;
    public int a0;
    public ko0 b;
    public int b0;
    public ko0 c;
    public int c0;
    public int d0;
    public int e0;
    public float f0;
    public float g0;
    public View h0;
    public int i0;
    public String j;
    public boolean j0;
    public boolean k;
    public String k0;
    public boolean l;
    public int l0;
    public boolean m;
    public int m0;
    public boolean n;
    public final float[] n0;
    public int o;
    public final f31[] o0;
    public int p;
    public final f31[] p0;
    public int q;
    public f31 q0;
    public int r;
    public f31 r0;
    public int s;
    public int s0;
    public final int[] t;
    public int t0;
    public int u;
    public int v;
    public float w;
    public int x;
    public int y;
    public float z;
    public boolean a = false;
    public d d = null;
    public e e = null;
    public final boolean[] f = {true, true};
    public boolean g = true;
    public int h = -1;
    public int i = -1;

    public f31() {
        new HashMap();
        this.k = false;
        this.l = false;
        this.m = false;
        this.n = false;
        this.o = -1;
        this.p = -1;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = new int[2];
        this.u = 0;
        this.v = 0;
        this.w = 1.0f;
        this.x = 0;
        this.y = 0;
        this.z = 1.0f;
        this.A = -1;
        this.B = 1.0f;
        this.C = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.D = Float.NaN;
        this.E = false;
        this.G = false;
        this.H = 0;
        this.I = 0;
        v21 v21Var = new v21(this, ConstraintAnchor$Type.a);
        this.J = v21Var;
        v21 v21Var2 = new v21(this, ConstraintAnchor$Type.b);
        this.K = v21Var2;
        v21 v21Var3 = new v21(this, ConstraintAnchor$Type.c);
        this.L = v21Var3;
        v21 v21Var4 = new v21(this, ConstraintAnchor$Type.d);
        this.M = v21Var4;
        v21 v21Var5 = new v21(this, ConstraintAnchor$Type.e);
        this.N = v21Var5;
        v21 v21Var6 = new v21(this, ConstraintAnchor$Type.g);
        this.O = v21Var6;
        v21 v21Var7 = new v21(this, ConstraintAnchor$Type.h);
        this.P = v21Var7;
        v21 v21Var8 = new v21(this, ConstraintAnchor$Type.f);
        this.Q = v21Var8;
        this.R = new v21[]{v21Var, v21Var3, v21Var2, v21Var4, v21Var5, v21Var8};
        ArrayList arrayList = new ArrayList();
        this.S = arrayList;
        this.T = new boolean[2];
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour = ConstraintWidget$DimensionBehaviour.a;
        this.U = new ConstraintWidget$DimensionBehaviour[]{constraintWidget$DimensionBehaviour, constraintWidget$DimensionBehaviour};
        this.V = null;
        this.W = 0;
        this.X = 0;
        this.Y = 0.0f;
        this.Z = -1;
        this.a0 = 0;
        this.b0 = 0;
        this.c0 = 0;
        this.f0 = 0.5f;
        this.g0 = 0.5f;
        this.i0 = 0;
        this.j0 = false;
        this.k0 = null;
        this.l0 = 0;
        this.m0 = 0;
        this.n0 = new float[]{-1.0f, -1.0f};
        this.o0 = new f31[]{null, null};
        this.p0 = new f31[]{null, null};
        this.q0 = null;
        this.r0 = null;
        this.s0 = -1;
        this.t0 = -1;
        arrayList.add(v21Var);
        arrayList.add(v21Var2);
        arrayList.add(v21Var3);
        arrayList.add(v21Var4);
        arrayList.add(v21Var6);
        arrayList.add(v21Var7);
        arrayList.add(v21Var8);
        arrayList.add(v21Var5);
    }

    public static void H(int i, int i2, String str, StringBuilder sb) {
        if (i == i2) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(i);
        sb.append(",\n");
    }

    public static void I(StringBuilder sb, String str, float f, float f2) {
        if (f == f2) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(f);
        sb.append(",\n");
    }

    public static void p(StringBuilder sb, String str, int i, int i2, int i3, int i4, int i5, float f, ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour) {
        sb.append(str);
        sb.append(" :  {\n");
        String string = constraintWidget$DimensionBehaviour.toString();
        if (!"FIXED".equals(string)) {
            o40.I("      behavior", " :   ", string, ",\n", sb);
        }
        H(i, 0, "      size", sb);
        H(i2, 0, "      min", sb);
        H(i3, Integer.MAX_VALUE, "      max", sb);
        H(i4, 0, "      matchMin", sb);
        H(i5, 0, "      matchDef", sb);
        I(sb, "      matchPercent", f, 1.0f);
        sb.append("    },\n");
    }

    public static void q(StringBuilder sb, String str, v21 v21Var) {
        if (v21Var.f == null) {
            return;
        }
        t61.y(sb, "    ", str, " : [ '");
        sb.append(v21Var.f);
        sb.append("'");
        if (v21Var.h != Integer.MIN_VALUE || v21Var.g != 0) {
            sb.append(",");
            sb.append(v21Var.g);
            if (v21Var.h != Integer.MIN_VALUE) {
                sb.append(",");
                sb.append(v21Var.h);
                sb.append(",");
            }
        }
        sb.append(" ] ,\n");
    }

    public final boolean A() {
        return this.g && this.i0 != 8;
    }

    public boolean B() {
        if (this.k) {
            return true;
        }
        return this.J.c && this.L.c;
    }

    public boolean C() {
        if (this.l) {
            return true;
        }
        return this.K.c && this.M.c;
    }

    public void D() {
        this.J.j();
        this.K.j();
        this.L.j();
        this.M.j();
        this.N.j();
        this.O.j();
        this.P.j();
        this.Q.j();
        this.V = null;
        this.D = Float.NaN;
        this.W = 0;
        this.X = 0;
        this.Y = 0.0f;
        this.Z = -1;
        this.a0 = 0;
        this.b0 = 0;
        this.c0 = 0;
        this.d0 = 0;
        this.e0 = 0;
        this.f0 = 0.5f;
        this.g0 = 0.5f;
        ConstraintWidget$DimensionBehaviour[] constraintWidget$DimensionBehaviourArr = this.U;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour = ConstraintWidget$DimensionBehaviour.a;
        constraintWidget$DimensionBehaviourArr[0] = constraintWidget$DimensionBehaviour;
        constraintWidget$DimensionBehaviourArr[1] = constraintWidget$DimensionBehaviour;
        this.h0 = null;
        this.i0 = 0;
        this.l0 = 0;
        this.m0 = 0;
        float[] fArr = this.n0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.o = -1;
        this.p = -1;
        int[] iArr = this.C;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.r = 0;
        this.s = 0;
        this.w = 1.0f;
        this.z = 1.0f;
        this.v = Integer.MAX_VALUE;
        this.y = Integer.MAX_VALUE;
        this.u = 0;
        this.x = 0;
        this.A = -1;
        this.B = 1.0f;
        boolean[] zArr = this.f;
        zArr[0] = true;
        zArr[1] = true;
        this.G = false;
        boolean[] zArr2 = this.T;
        zArr2[0] = false;
        zArr2[1] = false;
        this.g = true;
        int[] iArr2 = this.t;
        iArr2[0] = 0;
        iArr2[1] = 0;
        this.h = -1;
        this.i = -1;
    }

    public final void E() {
        f31 f31Var = this.V;
        if (f31Var != null && (f31Var instanceof g31)) {
            ((g31) f31Var).getClass();
        }
        ArrayList arrayList = this.S;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((v21) arrayList.get(i)).j();
        }
    }

    public final void F() {
        this.k = false;
        this.l = false;
        this.m = false;
        this.n = false;
        ArrayList arrayList = this.S;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            v21 v21Var = (v21) arrayList.get(i);
            v21Var.c = false;
            v21Var.b = 0;
        }
    }

    public void G(wv8 wv8Var) {
        this.J.k();
        this.K.k();
        this.L.k();
        this.M.k();
        this.N.k();
        this.Q.k();
        this.O.k();
        this.P.k();
    }

    public final void J(int i) {
        this.c0 = i;
        this.E = i > 0;
    }

    public final void K(int i, int i2) {
        if (this.k) {
            return;
        }
        this.J.l(i);
        this.L.l(i2);
        this.a0 = i;
        this.W = i2 - i;
        this.k = true;
    }

    public final void L(int i, int i2) {
        if (this.l) {
            return;
        }
        this.K.l(i);
        this.M.l(i2);
        this.b0 = i;
        this.X = i2 - i;
        if (this.E) {
            this.N.l(i + this.c0);
        }
        this.l = true;
    }

    public final void M(int i) {
        this.X = i;
        int i2 = this.e0;
        if (i < i2) {
            this.X = i2;
        }
    }

    public final void N(ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour) {
        this.U[0] = constraintWidget$DimensionBehaviour;
    }

    public final void O(ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour) {
        this.U[1] = constraintWidget$DimensionBehaviour;
    }

    public final void P(int i) {
        this.W = i;
        int i2 = this.d0;
        if (i < i2) {
            this.W = i2;
        }
    }

    public void Q(boolean z, boolean z2) {
        int i;
        int i2;
        d dVar = this.d;
        boolean z3 = z & dVar.g;
        e eVar = this.e;
        boolean z4 = z2 & eVar.g;
        int i3 = dVar.h.g;
        int i4 = eVar.h.g;
        int i5 = dVar.i.g;
        int i6 = eVar.i.g;
        int i7 = i6 - i4;
        if (i5 - i3 < 0 || i7 < 0 || i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE) {
            i5 = 0;
            i6 = 0;
            i3 = 0;
            i4 = 0;
        }
        int i8 = i5 - i3;
        int i9 = i6 - i4;
        if (z3) {
            this.a0 = i3;
        }
        if (z4) {
            this.b0 = i4;
        }
        if (this.i0 == 8) {
            this.W = 0;
            this.X = 0;
            return;
        }
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour = ConstraintWidget$DimensionBehaviour.a;
        if (z3) {
            if (this.U[0] == constraintWidget$DimensionBehaviour && i8 < (i2 = this.W)) {
                i8 = i2;
            }
            this.W = i8;
            int i10 = this.d0;
            if (i8 < i10) {
                this.W = i10;
            }
        }
        if (z4) {
            if (this.U[1] == constraintWidget$DimensionBehaviour && i9 < (i = this.X)) {
                i9 = i;
            }
            this.X = i9;
            int i11 = this.e0;
            if (i9 < i11) {
                this.X = i11;
            }
        }
    }

    public void R(l74 l74Var, boolean z) {
        int i;
        int i2;
        e eVar;
        d dVar;
        l74Var.getClass();
        int iN = l74.n(this.J);
        int iN2 = l74.n(this.K);
        int iN3 = l74.n(this.L);
        int iN4 = l74.n(this.M);
        if (z && (dVar = this.d) != null) {
            a aVar = dVar.h;
            if (aVar.j) {
                a aVar2 = dVar.i;
                if (aVar2.j) {
                    iN = aVar.g;
                    iN3 = aVar2.g;
                }
            }
        }
        if (z && (eVar = this.e) != null) {
            a aVar3 = eVar.h;
            if (aVar3.j) {
                a aVar4 = eVar.i;
                if (aVar4.j) {
                    iN2 = aVar3.g;
                    iN4 = aVar4.g;
                }
            }
        }
        int i3 = iN4 - iN2;
        if (iN3 - iN < 0 || i3 < 0 || iN == Integer.MIN_VALUE || iN == Integer.MAX_VALUE || iN2 == Integer.MIN_VALUE || iN2 == Integer.MAX_VALUE || iN3 == Integer.MIN_VALUE || iN3 == Integer.MAX_VALUE || iN4 == Integer.MIN_VALUE || iN4 == Integer.MAX_VALUE) {
            iN = 0;
            iN2 = 0;
            iN3 = 0;
            iN4 = 0;
        }
        int i4 = iN3 - iN;
        int i5 = iN4 - iN2;
        this.a0 = iN;
        this.b0 = iN2;
        if (this.i0 == 8) {
            this.W = 0;
            this.X = 0;
            return;
        }
        ConstraintWidget$DimensionBehaviour[] constraintWidget$DimensionBehaviourArr = this.U;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour = constraintWidget$DimensionBehaviourArr[0];
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour2 = ConstraintWidget$DimensionBehaviour.a;
        if (constraintWidget$DimensionBehaviour == constraintWidget$DimensionBehaviour2 && i4 < (i2 = this.W)) {
            i4 = i2;
        }
        if (constraintWidget$DimensionBehaviourArr[1] == constraintWidget$DimensionBehaviour2 && i5 < (i = this.X)) {
            i5 = i;
        }
        this.W = i4;
        this.X = i5;
        int i6 = this.e0;
        if (i5 < i6) {
            this.X = i6;
        }
        int i7 = this.d0;
        if (i4 < i7) {
            this.W = i7;
        }
        int i8 = this.v;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour3 = ConstraintWidget$DimensionBehaviour.c;
        if (i8 > 0 && constraintWidget$DimensionBehaviour == constraintWidget$DimensionBehaviour3) {
            this.W = Math.min(this.W, i8);
        }
        int i9 = this.y;
        if (i9 > 0 && this.U[1] == constraintWidget$DimensionBehaviour3) {
            this.X = Math.min(this.X, i9);
        }
        int i10 = this.W;
        if (i4 != i10) {
            this.h = i10;
        }
        int i11 = this.X;
        if (i5 != i11) {
            this.i = i11;
        }
    }

    public final void a(g31 g31Var, l74 l74Var, HashSet hashSet, int i, boolean z) {
        if (z) {
            if (!hashSet.contains(this)) {
                return;
            }
            rf0.m(g31Var, l74Var, this);
            hashSet.remove(this);
            b(l74Var, g31Var.X(64));
        }
        if (i == 0) {
            HashSet hashSet2 = this.J.a;
            if (hashSet2 != null) {
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    ((v21) it.next()).d.a(g31Var, l74Var, hashSet, i, true);
                }
            }
            HashSet hashSet3 = this.L.a;
            if (hashSet3 != null) {
                Iterator it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    ((v21) it2.next()).d.a(g31Var, l74Var, hashSet, i, true);
                }
                return;
            }
            return;
        }
        HashSet hashSet4 = this.K.a;
        if (hashSet4 != null) {
            Iterator it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                ((v21) it3.next()).d.a(g31Var, l74Var, hashSet, i, true);
            }
        }
        HashSet hashSet5 = this.M.a;
        if (hashSet5 != null) {
            Iterator it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                ((v21) it4.next()).d.a(g31Var, l74Var, hashSet, i, true);
            }
        }
        HashSet hashSet6 = this.N.a;
        if (hashSet6 != null) {
            Iterator it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                ((v21) it5.next()).d.a(g31Var, l74Var, hashSet, i, true);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0546  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x0597  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x05a7  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x05a9  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x05ac  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x05e4  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x066b  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x0671  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x06cf  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0109  */
    /* JADX WARN: Type inference failed for: r10v30 */
    /* JADX WARN: Type inference failed for: r10v36 */
    /* JADX WARN: Type inference failed for: r10v37 */
    /* JADX WARN: Type inference failed for: r12v26 */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r12v39 */
    /* JADX WARN: Type inference failed for: r12v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r18v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r19v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v11 */
    /* JADX WARN: Type inference failed for: r19v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r19v5 */
    /* JADX WARN: Type inference failed for: r20v10 */
    /* JADX WARN: Type inference failed for: r20v6 */
    /* JADX WARN: Type inference failed for: r20v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r27v3 */
    /* JADX WARN: Type inference failed for: r27v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r27v7 */
    /* JADX WARN: Type inference failed for: r27v8 */
    /* JADX WARN: Type inference failed for: r27v9 */
    /* JADX WARN: Type inference failed for: r36v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r4v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r59v0, types: [f31] */
    /* JADX WARN: Type inference failed for: r9v14, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(defpackage.l74 r60, boolean r61) {
        /*
            Method dump skipped, instruction units count: 1926
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f31.b(l74, boolean):void");
    }

    public boolean c() {
        return this.i0 != 8;
    }

    /* JADX WARN: Removed duplicated region for block: B:217:0x03b6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x048e A[PHI: r3
      0x048e: PHI (r3v17 int) = (r3v16 int), (r3v21 int), (r3v21 int), (r3v21 int) binds: [B:280:0x047e, B:282:0x0484, B:283:0x0486, B:285:0x048a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:290:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x04cf A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:337:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:345:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(defpackage.l74 r30, boolean r31, boolean r32, boolean r33, boolean r34, defpackage.m18 r35, defpackage.m18 r36, androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r37, boolean r38, defpackage.v21 r39, defpackage.v21 r40, int r41, int r42, int r43, int r44, float r45, boolean r46, boolean r47, boolean r48, boolean r49, boolean r50, int r51, int r52, int r53, int r54, float r55, boolean r56) {
        /*
            Method dump skipped, instruction units count: 1320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f31.d(l74, boolean, boolean, boolean, boolean, m18, m18, androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour, boolean, v21, v21, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    public final void e(v21 v21Var, v21 v21Var2, int i) {
        if (v21Var.d == this) {
            f(v21Var.e, v21Var2.d, v21Var2.e, i);
        }
    }

    public final void f(ConstraintAnchor$Type constraintAnchor$Type, f31 f31Var, ConstraintAnchor$Type constraintAnchor$Type2, int i) {
        boolean z;
        ConstraintAnchor$Type constraintAnchor$Type3 = ConstraintAnchor$Type.h;
        ConstraintAnchor$Type constraintAnchor$Type4 = ConstraintAnchor$Type.g;
        ConstraintAnchor$Type constraintAnchor$Type5 = ConstraintAnchor$Type.a;
        ConstraintAnchor$Type constraintAnchor$Type6 = ConstraintAnchor$Type.b;
        ConstraintAnchor$Type constraintAnchor$Type7 = ConstraintAnchor$Type.c;
        ConstraintAnchor$Type constraintAnchor$Type8 = ConstraintAnchor$Type.d;
        ConstraintAnchor$Type constraintAnchor$Type9 = ConstraintAnchor$Type.f;
        if (constraintAnchor$Type == constraintAnchor$Type9) {
            if (constraintAnchor$Type2 != constraintAnchor$Type9) {
                if (constraintAnchor$Type2 == constraintAnchor$Type5 || constraintAnchor$Type2 == constraintAnchor$Type7) {
                    f(constraintAnchor$Type5, f31Var, constraintAnchor$Type2, 0);
                    f(constraintAnchor$Type7, f31Var, constraintAnchor$Type2, 0);
                    j(constraintAnchor$Type9).a(f31Var.j(constraintAnchor$Type2), 0);
                    return;
                } else {
                    if (constraintAnchor$Type2 == constraintAnchor$Type6 || constraintAnchor$Type2 == constraintAnchor$Type8) {
                        f(constraintAnchor$Type6, f31Var, constraintAnchor$Type2, 0);
                        f(constraintAnchor$Type8, f31Var, constraintAnchor$Type2, 0);
                        j(constraintAnchor$Type9).a(f31Var.j(constraintAnchor$Type2), 0);
                        return;
                    }
                    return;
                }
            }
            v21 v21VarJ = j(constraintAnchor$Type5);
            v21 v21VarJ2 = j(constraintAnchor$Type7);
            v21 v21VarJ3 = j(constraintAnchor$Type6);
            v21 v21VarJ4 = j(constraintAnchor$Type8);
            boolean z2 = true;
            if ((v21VarJ == null || !v21VarJ.h()) && (v21VarJ2 == null || !v21VarJ2.h())) {
                f(constraintAnchor$Type5, f31Var, constraintAnchor$Type5, 0);
                f(constraintAnchor$Type7, f31Var, constraintAnchor$Type7, 0);
                z = true;
            } else {
                z = false;
            }
            if ((v21VarJ3 == null || !v21VarJ3.h()) && (v21VarJ4 == null || !v21VarJ4.h())) {
                f(constraintAnchor$Type6, f31Var, constraintAnchor$Type6, 0);
                f(constraintAnchor$Type8, f31Var, constraintAnchor$Type8, 0);
            } else {
                z2 = false;
            }
            if (z && z2) {
                j(constraintAnchor$Type9).a(f31Var.j(constraintAnchor$Type9), 0);
                return;
            } else if (z) {
                j(constraintAnchor$Type4).a(f31Var.j(constraintAnchor$Type4), 0);
                return;
            } else {
                if (z2) {
                    j(constraintAnchor$Type3).a(f31Var.j(constraintAnchor$Type3), 0);
                    return;
                }
                return;
            }
        }
        if (constraintAnchor$Type == constraintAnchor$Type4 && (constraintAnchor$Type2 == constraintAnchor$Type5 || constraintAnchor$Type2 == constraintAnchor$Type7)) {
            v21 v21VarJ5 = j(constraintAnchor$Type5);
            v21 v21VarJ6 = f31Var.j(constraintAnchor$Type2);
            v21 v21VarJ7 = j(constraintAnchor$Type7);
            v21VarJ5.a(v21VarJ6, 0);
            v21VarJ7.a(v21VarJ6, 0);
            j(constraintAnchor$Type4).a(v21VarJ6, 0);
            return;
        }
        if (constraintAnchor$Type == constraintAnchor$Type3 && (constraintAnchor$Type2 == constraintAnchor$Type6 || constraintAnchor$Type2 == constraintAnchor$Type8)) {
            v21 v21VarJ8 = f31Var.j(constraintAnchor$Type2);
            j(constraintAnchor$Type6).a(v21VarJ8, 0);
            j(constraintAnchor$Type8).a(v21VarJ8, 0);
            j(constraintAnchor$Type3).a(v21VarJ8, 0);
            return;
        }
        if (constraintAnchor$Type == constraintAnchor$Type4 && constraintAnchor$Type2 == constraintAnchor$Type4) {
            j(constraintAnchor$Type5).a(f31Var.j(constraintAnchor$Type5), 0);
            j(constraintAnchor$Type7).a(f31Var.j(constraintAnchor$Type7), 0);
            j(constraintAnchor$Type4).a(f31Var.j(constraintAnchor$Type2), 0);
            return;
        }
        if (constraintAnchor$Type == constraintAnchor$Type3 && constraintAnchor$Type2 == constraintAnchor$Type3) {
            j(constraintAnchor$Type6).a(f31Var.j(constraintAnchor$Type6), 0);
            j(constraintAnchor$Type8).a(f31Var.j(constraintAnchor$Type8), 0);
            j(constraintAnchor$Type3).a(f31Var.j(constraintAnchor$Type2), 0);
            return;
        }
        v21 v21VarJ9 = j(constraintAnchor$Type);
        v21 v21VarJ10 = f31Var.j(constraintAnchor$Type2);
        if (v21VarJ9.i(v21VarJ10)) {
            ConstraintAnchor$Type constraintAnchor$Type10 = ConstraintAnchor$Type.e;
            if (constraintAnchor$Type == constraintAnchor$Type10) {
                v21 v21VarJ11 = j(constraintAnchor$Type6);
                v21 v21VarJ12 = j(constraintAnchor$Type8);
                if (v21VarJ11 != null) {
                    v21VarJ11.j();
                }
                if (v21VarJ12 != null) {
                    v21VarJ12.j();
                }
            } else if (constraintAnchor$Type == constraintAnchor$Type6 || constraintAnchor$Type == constraintAnchor$Type8) {
                v21 v21VarJ13 = j(constraintAnchor$Type10);
                if (v21VarJ13 != null) {
                    v21VarJ13.j();
                }
                v21 v21VarJ14 = j(constraintAnchor$Type9);
                if (v21VarJ14.f != v21VarJ10) {
                    v21VarJ14.j();
                }
                v21 v21VarF = j(constraintAnchor$Type).f();
                v21 v21VarJ15 = j(constraintAnchor$Type3);
                if (v21VarJ15.h()) {
                    v21VarF.j();
                    v21VarJ15.j();
                }
            } else if (constraintAnchor$Type == constraintAnchor$Type5 || constraintAnchor$Type == constraintAnchor$Type7) {
                v21 v21VarJ16 = j(constraintAnchor$Type9);
                if (v21VarJ16.f != v21VarJ10) {
                    v21VarJ16.j();
                }
                v21 v21VarF2 = j(constraintAnchor$Type).f();
                v21 v21VarJ17 = j(constraintAnchor$Type4);
                if (v21VarJ17.h()) {
                    v21VarF2.j();
                    v21VarJ17.j();
                }
            }
            v21VarJ9.a(v21VarJ10, i);
        }
    }

    public void g(f31 f31Var, HashMap map) {
        this.o = f31Var.o;
        this.p = f31Var.p;
        this.r = f31Var.r;
        this.s = f31Var.s;
        int[] iArr = f31Var.t;
        int i = iArr[0];
        int[] iArr2 = this.t;
        iArr2[0] = i;
        iArr2[1] = iArr[1];
        this.u = f31Var.u;
        this.v = f31Var.v;
        this.x = f31Var.x;
        this.y = f31Var.y;
        this.z = f31Var.z;
        this.A = f31Var.A;
        this.B = f31Var.B;
        int[] iArr3 = f31Var.C;
        this.C = Arrays.copyOf(iArr3, iArr3.length);
        this.D = f31Var.D;
        this.E = f31Var.E;
        this.F = f31Var.F;
        this.J.j();
        this.K.j();
        this.L.j();
        this.M.j();
        this.N.j();
        this.O.j();
        this.P.j();
        this.Q.j();
        this.U = (ConstraintWidget$DimensionBehaviour[]) Arrays.copyOf(this.U, 2);
        this.V = this.V == null ? null : (f31) map.get(f31Var.V);
        this.W = f31Var.W;
        this.X = f31Var.X;
        this.Y = f31Var.Y;
        this.Z = f31Var.Z;
        this.a0 = f31Var.a0;
        this.b0 = f31Var.b0;
        this.c0 = f31Var.c0;
        this.d0 = f31Var.d0;
        this.e0 = f31Var.e0;
        this.f0 = f31Var.f0;
        this.g0 = f31Var.g0;
        this.h0 = f31Var.h0;
        this.i0 = f31Var.i0;
        this.j0 = f31Var.j0;
        this.k0 = f31Var.k0;
        this.l0 = f31Var.l0;
        this.m0 = f31Var.m0;
        float[] fArr = f31Var.n0;
        float f = fArr[0];
        float[] fArr2 = this.n0;
        fArr2[0] = f;
        fArr2[1] = fArr[1];
        f31[] f31VarArr = f31Var.o0;
        f31 f31Var2 = f31VarArr[0];
        f31[] f31VarArr2 = this.o0;
        f31VarArr2[0] = f31Var2;
        f31VarArr2[1] = f31VarArr[1];
        f31[] f31VarArr3 = f31Var.p0;
        f31 f31Var3 = f31VarArr3[0];
        f31[] f31VarArr4 = this.p0;
        f31VarArr4[0] = f31Var3;
        f31VarArr4[1] = f31VarArr3[1];
        f31 f31Var4 = f31Var.q0;
        this.q0 = f31Var4 == null ? null : (f31) map.get(f31Var4);
        f31 f31Var5 = f31Var.r0;
        this.r0 = f31Var5 != null ? (f31) map.get(f31Var5) : null;
    }

    public final void h(l74 l74Var) {
        l74Var.k(this.J);
        l74Var.k(this.K);
        l74Var.k(this.L);
        l74Var.k(this.M);
        if (this.c0 > 0) {
            l74Var.k(this.N);
        }
    }

    public final void i() {
        if (this.d == null) {
            this.d = new d(this);
        }
        if (this.e == null) {
            this.e = new e(this);
        }
    }

    public v21 j(ConstraintAnchor$Type constraintAnchor$Type) {
        switch (constraintAnchor$Type.ordinal()) {
            case 0:
                return null;
            case 1:
                return this.J;
            case 2:
                return this.K;
            case 3:
                return this.L;
            case 4:
                return this.M;
            case 5:
                return this.N;
            case 6:
                return this.Q;
            case 7:
                return this.O;
            case 8:
                return this.P;
            default:
                throw new AssertionError(constraintAnchor$Type.name());
        }
    }

    public final ConstraintWidget$DimensionBehaviour k(int i) {
        if (i == 0) {
            return this.U[0];
        }
        if (i == 1) {
            return this.U[1];
        }
        return null;
    }

    public final int l() {
        if (this.i0 == 8) {
            return 0;
        }
        return this.X;
    }

    public final f31 m(int i) {
        v21 v21Var;
        v21 v21Var2;
        if (i != 0) {
            if (i == 1 && (v21Var2 = (v21Var = this.M).f) != null && v21Var2.f == v21Var) {
                return v21Var2.d;
            }
            return null;
        }
        v21 v21Var3 = this.L;
        v21 v21Var4 = v21Var3.f;
        if (v21Var4 == null || v21Var4.f != v21Var3) {
            return null;
        }
        return v21Var4.d;
    }

    public final f31 n(int i) {
        v21 v21Var;
        v21 v21Var2;
        if (i != 0) {
            if (i == 1 && (v21Var2 = (v21Var = this.K).f) != null && v21Var2.f == v21Var) {
                return v21Var2.d;
            }
            return null;
        }
        v21 v21Var3 = this.J;
        v21 v21Var4 = v21Var3.f;
        if (v21Var4 == null || v21Var4.f != v21Var3) {
            return null;
        }
        return v21Var4.d;
    }

    public void o(StringBuilder sb) {
        sb.append("  " + this.j + ":{\n");
        StringBuilder sb2 = new StringBuilder("    actualWidth:");
        sb2.append(this.W);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("    actualHeight:" + this.X);
        sb.append("\n");
        sb.append("    actualLeft:" + this.a0);
        sb.append("\n");
        sb.append("    actualTop:" + this.b0);
        sb.append("\n");
        q(sb, "left", this.J);
        q(sb, "top", this.K);
        q(sb, "right", this.L);
        q(sb, "bottom", this.M);
        q(sb, "baseline", this.N);
        q(sb, "centerX", this.O);
        q(sb, "centerY", this.P);
        int i = this.W;
        int i2 = this.d0;
        int i3 = this.C[0];
        int i4 = this.u;
        int i5 = this.r;
        float f = this.w;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour = this.U[0];
        float[] fArr = this.n0;
        float f2 = fArr[0];
        p(sb, "    width", i, i2, i3, i4, i5, f, constraintWidget$DimensionBehaviour);
        int i6 = this.X;
        int i7 = this.e0;
        int i8 = this.C[1];
        int i9 = this.x;
        int i10 = this.s;
        float f3 = this.z;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour2 = this.U[1];
        float f4 = fArr[1];
        p(sb, "    height", i6, i7, i8, i9, i10, f3, constraintWidget$DimensionBehaviour2);
        float f5 = this.Y;
        int i11 = this.Z;
        if (f5 != 0.0f) {
            sb.append("    dimensionRatio");
            sb.append(" :  [");
            sb.append(f5);
            sb.append(",");
            sb.append(i11);
            sb.append("");
            sb.append("],\n");
        }
        I(sb, "    horizontalBias", this.f0, 0.5f);
        I(sb, "    verticalBias", this.g0, 0.5f);
        H(this.l0, 0, "    horizontalChainStyle", sb);
        H(this.m0, 0, "    verticalChainStyle", sb);
        sb.append("  }");
    }

    public final int r() {
        if (this.i0 == 8) {
            return 0;
        }
        return this.W;
    }

    public final int s() {
        f31 f31Var = this.V;
        return (f31Var == null || !(f31Var instanceof g31)) ? this.a0 : ((g31) f31Var).B0 + this.a0;
    }

    public final int t() {
        f31 f31Var = this.V;
        return (f31Var == null || !(f31Var instanceof g31)) ? this.b0 : ((g31) f31Var).C0 + this.b0;
    }

    public String toString() {
        StringBuilder sbC = bl4.C("");
        sbC.append(this.k0 != null ? dw1.s(new StringBuilder("id: "), this.k0, " ") : "");
        sbC.append("(");
        sbC.append(this.a0);
        sbC.append(", ");
        sbC.append(this.b0);
        sbC.append(") - (");
        sbC.append(this.W);
        sbC.append(" x ");
        return dw1.k(this.X, ")", sbC);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x003a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean u(int r5) {
        /*
            r4 = this;
            r0 = 2
            r1 = 0
            r2 = 1
            if (r5 != 0) goto L1b
            v21 r5 = r4.J
            v21 r5 = r5.f
            if (r5 == 0) goto Ld
            r5 = r2
            goto Le
        Ld:
            r5 = r1
        Le:
            v21 r3 = r4.L
            v21 r3 = r3.f
            if (r3 == 0) goto L16
            r3 = r2
            goto L17
        L16:
            r3 = r1
        L17:
            int r5 = r5 + r3
            if (r5 >= r0) goto L3b
            goto L3a
        L1b:
            v21 r5 = r4.K
            v21 r5 = r5.f
            if (r5 == 0) goto L23
            r5 = r2
            goto L24
        L23:
            r5 = r1
        L24:
            v21 r3 = r4.M
            v21 r3 = r3.f
            if (r3 == 0) goto L2c
            r3 = r2
            goto L2d
        L2c:
            r3 = r1
        L2d:
            int r5 = r5 + r3
            v21 r3 = r4.N
            v21 r3 = r3.f
            if (r3 == 0) goto L36
            r3 = r2
            goto L37
        L36:
            r3 = r1
        L37:
            int r5 = r5 + r3
            if (r5 >= r0) goto L3b
        L3a:
            return r2
        L3b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f31.u(int):boolean");
    }

    public final boolean v(int i, int i2) {
        v21 v21Var;
        v21 v21Var2;
        v21 v21Var3;
        v21 v21Var4;
        if (i == 0) {
            v21 v21Var5 = this.J;
            v21 v21Var6 = v21Var5.f;
            if (v21Var6 == null || !v21Var6.c || (v21Var4 = (v21Var3 = this.L).f) == null || !v21Var4.c) {
                return false;
            }
            return (v21Var4.d() - v21Var3.e()) - (v21Var5.e() + v21Var5.f.d()) >= i2;
        }
        v21 v21Var7 = this.K;
        v21 v21Var8 = v21Var7.f;
        if (v21Var8 == null || !v21Var8.c || (v21Var2 = (v21Var = this.M).f) == null || !v21Var2.c) {
            return false;
        }
        return (v21Var2.d() - v21Var.e()) - (v21Var7.e() + v21Var7.f.d()) >= i2;
    }

    public final void w(ConstraintAnchor$Type constraintAnchor$Type, f31 f31Var, ConstraintAnchor$Type constraintAnchor$Type2, int i, int i2) {
        j(constraintAnchor$Type).b(f31Var.j(constraintAnchor$Type2), i, i2, true);
    }

    public final boolean x(int i) {
        v21 v21Var;
        v21 v21Var2;
        int i2 = i * 2;
        v21[] v21VarArr = this.R;
        v21 v21Var3 = v21VarArr[i2];
        v21 v21Var4 = v21Var3.f;
        return (v21Var4 == null || v21Var4.f == v21Var3 || (v21Var2 = (v21Var = v21VarArr[i2 + 1]).f) == null || v21Var2.f != v21Var) ? false : true;
    }

    public final boolean y() {
        v21 v21Var = this.J;
        v21 v21Var2 = v21Var.f;
        if (v21Var2 != null && v21Var2.f == v21Var) {
            return true;
        }
        v21 v21Var3 = this.L;
        v21 v21Var4 = v21Var3.f;
        return v21Var4 != null && v21Var4.f == v21Var3;
    }

    public final boolean z() {
        v21 v21Var = this.K;
        v21 v21Var2 = v21Var.f;
        if (v21Var2 != null && v21Var2.f == v21Var) {
            return true;
        }
        v21 v21Var3 = this.M;
        v21 v21Var4 = v21Var3.f;
        return v21Var4 != null && v21Var4.f == v21Var3;
    }
}
