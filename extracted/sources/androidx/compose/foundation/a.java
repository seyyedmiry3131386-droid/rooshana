package androidx.compose.foundation;

import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import defpackage.ab5;
import defpackage.ad3;
import defpackage.bp2;
import defpackage.br9;
import defpackage.bt2;
import defpackage.cc7;
import defpackage.db5;
import defpackage.dh6;
import defpackage.e3;
import defpackage.e51;
import defpackage.fs8;
import defpackage.hn3;
import defpackage.hy3;
import defpackage.ie4;
import defpackage.in7;
import defpackage.it0;
import defpackage.jr5;
import defpackage.js3;
import defpackage.li1;
import defpackage.m;
import defpackage.m01;
import defpackage.n;
import defpackage.nn7;
import defpackage.nr5;
import defpackage.ox3;
import defpackage.pg;
import defpackage.qj6;
import defpackage.qq4;
import defpackage.rf0;
import defpackage.ri1;
import defpackage.rj6;
import defpackage.ro8;
import defpackage.th0;
import defpackage.ti1;
import defpackage.tx8;
import defpackage.um3;
import defpackage.v69;
import defpackage.v97;
import defpackage.vg6;
import defpackage.wt3;
import defpackage.xg7;
import defpackage.y97;
import defpackage.zc3;
import defpackage.zm3;
import java.util.ArrayList;
import kotlin.jvm.internal.Ref$BooleanRef;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends ti1 implements dh6, hy3, in7, fs8, m01, jr5, hn3 {
    public static final th0 L = new th0(24);
    public ri1 A;
    public rj6 B;
    public zc3 C;
    public final db5 D;
    public long E;
    public rj6 F;
    public ab5 G;
    public boolean H;
    public qq4 I;
    public li1 J;
    public final th0 K;
    public ab5 q;
    public um3 r;
    public boolean s;
    public String t;
    public v97 u;
    public boolean v;
    public bp2 w;
    public final h x;
    public um3 y;
    public androidx.compose.ui.input.pointer.f z;

    public a(ab5 ab5Var, um3 um3Var, boolean z, boolean z2, String str, v97 v97Var, bp2 bp2Var) {
        this.q = ab5Var;
        this.r = um3Var;
        this.s = z;
        this.t = str;
        this.u = v97Var;
        this.v = z2;
        this.w = bp2Var;
        this.x = new h(ab5Var, 0, new AbstractClickableNode$focusableNode$1(1, this, a.class, "onFocusChange", "onFocusChange(Z)V", 0));
        int i = ie4.a;
        this.D = new db5(6);
        this.E = 0L;
        ab5 ab5Var2 = this.q;
        this.G = ab5Var2;
        this.H = ab5Var2 == null;
        this.K = L;
    }

    @Override // defpackage.dh6
    public void B() {
        zc3 zc3Var;
        ab5 ab5Var = this.q;
        if (ab5Var != null && (zc3Var = this.C) != null) {
            ab5Var.b(new ad3(zc3Var));
        }
        this.C = null;
        androidx.compose.ui.input.pointer.f fVar = this.z;
        if (fVar != null) {
            fVar.B();
        }
    }

    @Override // defpackage.in7
    public final /* synthetic */ boolean C() {
        return false;
    }

    public abstract androidx.compose.ui.input.pointer.f G0();

    public final boolean H0() {
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        cc7.F(this, xg7.p, new n(23, ref$BooleanRef));
        if (ref$BooleanRef.a) {
            return true;
        }
        int i = it0.b;
        ViewParent parent = rf0.J(this).getParent();
        while (parent != null && (parent instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
            parent = viewGroup.getParent();
        }
        return false;
    }

    @Override // defpackage.dh6
    public final /* synthetic */ void I() {
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void I0() {
        /*
            r17 = this;
            r0 = r17
            ab5 r1 = r0.q
            db5 r2 = r0.D
            if (r1 == 0) goto L76
            rj6 r3 = r0.B
            if (r3 == 0) goto L14
            qj6 r4 = new qj6
            r4.<init>(r3)
            r1.b(r4)
        L14:
            rj6 r3 = r0.F
            if (r3 == 0) goto L20
            qj6 r4 = new qj6
            r4.<init>(r3)
            r1.b(r4)
        L20:
            zc3 r3 = r0.C
            if (r3 == 0) goto L2c
            ad3 r4 = new ad3
            r4.<init>(r3)
            r1.b(r4)
        L2c:
            java.lang.Object[] r3 = r2.c
            long[] r4 = r2.a
            int r5 = r4.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L76
            r6 = 0
            r7 = r6
        L37:
            r8 = r4[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L71
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L51:
            if (r12 >= r10) goto L6f
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L6b
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r3[r13]
            rj6 r13 = (defpackage.rj6) r13
            qj6 r14 = new qj6
            r14.<init>(r13)
            r1.b(r14)
        L6b:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L51
        L6f:
            if (r10 != r11) goto L76
        L71:
            if (r7 == r5) goto L76
            int r7 = r7 + 1
            goto L37
        L76:
            r1 = 0
            r0.B = r1
            r0.F = r1
            r0.C = r1
            r2.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.a.I0():void");
    }

    public final void J0(boolean z) {
        ab5 ab5Var = this.q;
        if (ab5Var != null) {
            li1 li1Var = this.J;
            if (li1Var == null || !li1Var.b()) {
                rj6 rj6Var = z ? this.F : this.B;
                if (rj6Var != null) {
                    qj6 qj6Var = new qj6(rj6Var);
                    wt3 wt3Var = (wt3) ((e51) o0()).a.r0(th0.n);
                    bt2.G(o0(), null, null, new AbstractClickableNode$handlePressInteractionCancel$1$1$1(ab5Var, qj6Var, wt3Var != null ? wt3Var.s0(new m(ab5Var, qj6Var, 0)) : null, null), 3);
                }
            } else {
                li1 li1Var2 = this.J;
                if (li1Var2 != null) {
                    li1Var2.g(null);
                }
            }
            if (z) {
                this.F = null;
            } else {
                this.B = null;
            }
        }
    }

    public final void K0(long j, boolean z) {
        ab5 ab5Var = this.q;
        if (ab5Var != null) {
            li1 li1Var = this.J;
            if (li1Var == null || !li1Var.b()) {
                rj6 rj6Var = z ? this.F : this.B;
                if (rj6Var != null) {
                    bt2.G(o0(), null, null, new AbstractClickableNode$handlePressInteractionRelease$1$2$1(null, ab5Var, rj6Var), 3);
                }
            } else {
                li1Var.g(null);
                bt2.G(o0(), null, null, new AbstractClickableNode$handlePressInteractionRelease$1$1(li1Var, j, ab5Var, null), 3);
            }
            if (z) {
                this.F = null;
            } else {
                this.B = null;
            }
        }
    }

    public final void L0(long j, boolean z) {
        ab5 ab5Var = this.q;
        if (ab5Var != null) {
            rj6 rj6Var = new rj6(j);
            if (H0()) {
                this.J = bt2.G(o0(), null, null, new AbstractClickableNode$handlePressInteractionStart$1$1(ab5Var, rj6Var, z, this, null), 3);
                return;
            }
            if (z) {
                this.F = rj6Var;
            } else {
                this.B = rj6Var;
            }
            bt2.G(o0(), null, null, new AbstractClickableNode$handlePressInteractionStart$1$2(null, ab5Var, rj6Var), 3);
        }
    }

    public final void M0() {
        if (this.A != null) {
            return;
        }
        um3 um3Var = this.s ? this.y : this.r;
        if (um3Var != null) {
            if (this.q == null) {
                this.q = new ab5();
            }
            this.x.H0(this.q);
            ab5 ab5Var = this.q;
            js3.m(ab5Var);
            ri1 ri1VarA = um3Var.a(ab5Var);
            C0(ri1VarA);
            this.A = ri1VarA;
        }
    }

    public void N0() {
    }

    public abstract boolean O0(KeyEvent keyEvent);

    @Override // defpackage.hn3
    public final void P(pg pgVar, PointerEventPass pointerEventPass) {
        ArrayList arrayList = (ArrayList) pgVar.c;
        M0();
        if (this.v) {
            if (this.I == null) {
                this.I = new qq4(this);
            }
            qq4 qq4Var = this.I;
            if (qq4Var != null) {
                bp2 bp2Var = this.w;
                a aVar = (a) qq4Var.a;
                int i = 0;
                if (pointerEventPass != PointerEventPass.b) {
                    if (pointerEventPass != PointerEventPass.c || ((zm3) qq4Var.b) == null) {
                        return;
                    }
                    int size = arrayList.size();
                    while (i < size) {
                        zm3 zm3Var = (zm3) arrayList.get(i);
                        if (zm3Var.i && !zm3Var.equals((zm3) qq4Var.b)) {
                            qq4Var.C();
                            return;
                        }
                        i++;
                    }
                    return;
                }
                zm3 zm3Var2 = (zm3) qq4Var.b;
                if (zm3Var2 == null) {
                    int size2 = arrayList.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        zm3 zm3Var3 = (zm3) arrayList.get(i2);
                        if (!zm3Var3.h && zm3Var3.d) {
                            zm3 zm3Var4 = (zm3) arrayList.get(0);
                            qq4Var.b = zm3Var4;
                            aVar.L0(zm3Var4.c, true);
                            zm3Var4.i = true;
                            return;
                        }
                    }
                    return;
                }
                long j = zm3Var2.c;
                int size3 = arrayList.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    zm3 zm3Var5 = (zm3) arrayList.get(i3);
                    if (zm3Var5.h && zm3Var5.d) {
                        if (Math.abs(nr5.d(nr5.f(((zm3) arrayList.get(0)).c, j))) > ((v69) y97.t(aVar, androidx.compose.ui.platform.l.s)).f()) {
                            qq4Var.C();
                            return;
                        }
                        return;
                    }
                }
                int size4 = arrayList.size();
                for (int i4 = 0; i4 < size4; i4++) {
                    zm3 zm3Var6 = (zm3) arrayList.get(i4);
                    if (zm3Var6.i || !zm3Var6.h || zm3Var6.d) {
                        int size5 = arrayList.size();
                        while (i < size5) {
                            if (((zm3) arrayList.get(i)).i) {
                                qq4Var.C();
                                return;
                            }
                            i++;
                        }
                        return;
                    }
                }
                ((zm3) arrayList.get(0)).i = true;
                aVar.K0(j, true);
                bp2Var.invoke();
                qq4Var.b = null;
            }
        }
    }

    public abstract void P0(KeyEvent keyEvent);

    /* JADX WARN: Removed duplicated region for block: B:39:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Q0(defpackage.ab5 r4, defpackage.um3 r5, boolean r6, boolean r7, java.lang.String r8, defpackage.v97 r9, defpackage.bp2 r10) {
        /*
            r3 = this;
            ab5 r0 = r3.G
            boolean r0 = defpackage.js3.i(r0, r4)
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L13
            r3.I0()
            r3.G = r4
            r3.q = r4
            r4 = r1
            goto L14
        L13:
            r4 = r2
        L14:
            um3 r0 = r3.r
            boolean r0 = defpackage.js3.i(r0, r5)
            if (r0 != 0) goto L1f
            r3.r = r5
            r4 = r1
        L1f:
            boolean r5 = r3.s
            if (r5 == r6) goto L2b
            r3.s = r6
            if (r6 == 0) goto L2a
            r3.Y()
        L2a:
            r4 = r1
        L2b:
            boolean r5 = r3.v
            androidx.compose.foundation.h r6 = r3.x
            if (r5 == r7) goto L42
            if (r7 == 0) goto L37
            r3.C0(r6)
            goto L3d
        L37:
            r3.D0(r6)
            r3.I0()
        L3d:
            defpackage.t17.f(r3)
            r3.v = r7
        L42:
            java.lang.String r5 = r3.t
            boolean r5 = defpackage.js3.i(r5, r8)
            if (r5 != 0) goto L4f
            r3.t = r8
            defpackage.t17.f(r3)
        L4f:
            v97 r5 = r3.u
            boolean r5 = defpackage.js3.i(r5, r9)
            if (r5 != 0) goto L5c
            r3.u = r9
            defpackage.t17.f(r3)
        L5c:
            r3.w = r10
            boolean r5 = r3.H
            ab5 r7 = r3.G
            if (r7 != 0) goto L66
            r8 = r1
            goto L67
        L66:
            r8 = r2
        L67:
            if (r5 == r8) goto L75
            if (r7 != 0) goto L6c
            r2 = r1
        L6c:
            r3.H = r2
            if (r2 != 0) goto L75
            ri1 r5 = r3.A
            if (r5 != 0) goto L75
            goto L76
        L75:
            r1 = r4
        L76:
            if (r1 == 0) goto L8b
            ri1 r4 = r3.A
            if (r4 != 0) goto L80
            boolean r5 = r3.H
            if (r5 != 0) goto L8b
        L80:
            if (r4 == 0) goto L85
            r3.D0(r4)
        L85:
            r4 = 0
            r3.A = r4
            r3.M0()
        L8b:
            ab5 r4 = r3.q
            r6.H0(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.a.Q0(ab5, um3, boolean, boolean, java.lang.String, v97, bp2):void");
    }

    @Override // defpackage.hn3
    public final void V() {
        qq4 qq4Var = this.I;
        if (qq4Var != null) {
            qq4Var.C();
        }
    }

    @Override // defpackage.jr5
    public final void Y() {
        if (this.s) {
            br9.G(this, new defpackage.l(this, 0));
        }
    }

    @Override // defpackage.dh6
    public final /* synthetic */ boolean e0() {
        return false;
    }

    @Override // defpackage.in7
    public final /* synthetic */ boolean h() {
        return true;
    }

    @Override // defpackage.hy3
    public final boolean i(KeyEvent keyEvent) {
        return false;
    }

    @Override // defpackage.dh6
    public final void i0() {
        B();
    }

    @Override // defpackage.in7
    public final void k0(nn7 nn7Var) {
        v97 v97Var = this.u;
        if (v97Var != null) {
            androidx.compose.ui.semantics.f.f(nn7Var, v97Var.a);
        }
        String str = this.t;
        defpackage.l lVar = new defpackage.l(this, 1);
        ox3[] ox3VarArr = androidx.compose.ui.semantics.f.a;
        nn7Var.a(androidx.compose.ui.semantics.a.b, new e3(str, lVar));
        if (this.v) {
            this.x.k0(nn7Var);
        } else {
            nn7Var.a(androidx.compose.ui.semantics.d.i, tx8.a);
        }
        F0(nn7Var);
    }

    @Override // defpackage.fs8
    public final Object l() {
        return this.K;
    }

    @Override // defpackage.dh6
    public final long m() {
        return ro8.a;
    }

    @Override // defpackage.in7
    public final boolean m0() {
        return true;
    }

    @Override // defpackage.gx4
    public final boolean p0() {
        return false;
    }

    @Override // defpackage.gx4
    public final void s0() {
        Y();
        if (!this.H) {
            M0();
        }
        if (this.v) {
            C0(this.x);
        }
    }

    @Override // defpackage.dh6
    public void t(vg6 vg6Var, PointerEventPass pointerEventPass, long j) {
        androidx.compose.ui.input.pointer.f fVarG0;
        long j2 = ((j >> 33) << 32) | (((j << 32) >> 33) & 4294967295L);
        this.E = (((long) Float.floatToRawIntBits((int) (j2 & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (j2 >> 32))) << 32);
        M0();
        if (this.v && pointerEventPass == PointerEventPass.b) {
            int i = vg6Var.f;
            if (i == 4) {
                bt2.G(o0(), null, null, new AbstractClickableNode$onPointerEvent$1(this, null), 3);
            } else if (i == 5) {
                bt2.G(o0(), null, null, new AbstractClickableNode$onPointerEvent$2(this, null), 3);
            }
        }
        if (this.z == null && (fVarG0 = G0()) != null) {
            C0(fVarG0);
            this.z = fVarG0;
        }
        androidx.compose.ui.input.pointer.f fVar = this.z;
        if (fVar != null) {
            fVar.t(vg6Var, pointerEventPass, j);
        }
    }

    @Override // defpackage.gx4
    public final void t0() {
        B();
    }

    @Override // defpackage.gx4
    public final void u0() {
        I0();
        if (this.G == null) {
            this.q = null;
        }
        ri1 ri1Var = this.A;
        if (ri1Var != null) {
            D0(ri1Var);
        }
        this.A = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d4, code lost:
    
        if (((r7 & ((~r7) << 6)) & r14) == 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d6, code lost:
    
        r16 = -1;
     */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.hy3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean x(android.view.KeyEvent r24) {
        /*
            Method dump skipped, instruction units count: 300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.a.x(android.view.KeyEvent):boolean");
    }

    public void F0(nn7 nn7Var) {
    }
}
