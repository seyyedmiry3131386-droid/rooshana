package androidx.compose.foundation.lazy;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.c;
import androidx.compose.runtime.g;
import androidx.compose.ui.node.h;
import defpackage.a44;
import defpackage.ab5;
import defpackage.ai0;
import defpackage.b34;
import defpackage.bh7;
import defpackage.bn6;
import defpackage.c08;
import defpackage.c26;
import defpackage.d34;
import defpackage.d40;
import defpackage.dp2;
import defpackage.dw1;
import defpackage.f34;
import defpackage.g34;
import defpackage.li1;
import defpackage.m22;
import defpackage.ml9;
import defpackage.n08;
import defpackage.ok4;
import defpackage.ql3;
import defpackage.qm5;
import defpackage.r79;
import defpackage.s08;
import defpackage.sf1;
import defpackage.sy0;
import defpackage.te;
import defpackage.th0;
import defpackage.tx8;
import defpackage.un3;
import defpackage.us3;
import defpackage.v24;
import defpackage.v34;
import defpackage.w34;
import defpackage.wb5;
import defpackage.x34;
import defpackage.xk;
import defpackage.y34;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
public final class b implements bh7 {
    public static final bn6 x = ok4.M(new us3(4), new sy0(13));
    public final sf1 a;
    public boolean b;
    public v34 c;
    public boolean d;
    public final ai0 e;
    public final wb5 f;
    public final ab5 g;
    public float h;
    public final c i;
    public final boolean j;
    public h k;
    public final y34 l;
    public final d40 m;
    public final v24 n;
    public final qm5 o;
    public final g34 p;
    public final r79 q;
    public final d34 r;
    public final wb5 s;
    public final wb5 t;
    public final wb5 u;
    public final wb5 v;
    public final androidx.compose.foundation.lazy.layout.c w;

    public b(int i, int i2) {
        sf1 sf1Var = new sf1();
        sf1Var.a = -1;
        sf1Var.d = -1;
        this.a = sf1Var;
        ai0 ai0Var = new ai0();
        ai0Var.b = g.e(i);
        ai0Var.c = g.e(i2);
        ai0Var.e = new b34(i, 30, 100);
        this.e = ai0Var;
        this.f = g.g(a44.a, th0.p);
        this.g = new ab5();
        this.i = new c(new m22(14, this));
        this.j = true;
        this.l = new y34(this);
        this.m = new d40();
        this.n = new v24();
        this.o = new qm5(25);
        this.p = new g34(new x34(this, i));
        this.q = new r79(24, this);
        this.r = new d34();
        this.s = ml9.m();
        Boolean bool = Boolean.FALSE;
        this.t = g.h(bool);
        this.u = g.h(bool);
        this.v = ml9.m();
        this.w = new androidx.compose.foundation.lazy.layout.c();
    }

    public static Object i(b bVar, int i, SuspendLambda suspendLambda) {
        bVar.getClass();
        Object objC = bVar.c(MutatePriority.a, new LazyListState$scrollToItem$2(bVar, i, null), suspendLambda);
        return objC == CoroutineSingletons.a ? objC : tx8.a;
    }

    @Override // defpackage.bh7
    public final boolean a() {
        return this.i.a();
    }

    @Override // defpackage.bh7
    public final boolean b() {
        return ((Boolean) ((s08) this.u).getValue()).booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
    
        if (r5.i.c(r6, r7, r0) == r1) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.bh7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(androidx.compose.foundation.MutatePriority r6, defpackage.qp2 r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof androidx.compose.foundation.lazy.LazyListState$scroll$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.lazy.LazyListState$scroll$1 r0 = (androidx.compose.foundation.lazy.LazyListState$scroll$1) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            androidx.compose.foundation.lazy.LazyListState$scroll$1 r0 = new androidx.compose.foundation.lazy.LazyListState$scroll$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            kotlin.b.b(r8)
            goto L6e
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            kotlin.coroutines.jvm.internal.SuspendLambda r6 = r0.b
            r7 = r6
            qp2 r7 = (defpackage.qp2) r7
            androidx.compose.foundation.MutatePriority r6 = r0.a
            kotlin.b.b(r8)
            goto L5e
        L3d:
            kotlin.b.b(r8)
            wb5 r8 = r5.f
            s08 r8 = (defpackage.s08) r8
            java.lang.Object r8 = r8.getValue()
            v34 r2 = defpackage.a44.a
            if (r8 != r2) goto L5e
            r0.a = r6
            r8 = r7
            kotlin.coroutines.jvm.internal.SuspendLambda r8 = (kotlin.coroutines.jvm.internal.SuspendLambda) r8
            r0.b = r8
            r0.e = r4
            d40 r8 = r5.m
            java.lang.Object r8 = r8.k(r0)
            if (r8 != r1) goto L5e
            goto L6d
        L5e:
            r8 = 0
            r0.a = r8
            r0.b = r8
            r0.e = r3
            androidx.compose.foundation.gestures.c r8 = r5.i
            java.lang.Object r6 = r8.c(r6, r7, r0)
            if (r6 != r1) goto L6e
        L6d:
            return r1
        L6e:
            tx8 r6 = defpackage.tx8.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.b.c(androidx.compose.foundation.MutatePriority, qp2, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // defpackage.bh7
    public final boolean d() {
        return ((Boolean) ((s08) this.t).getValue()).booleanValue();
    }

    @Override // defpackage.bh7
    public final float e(float f) {
        return this.i.e(f);
    }

    public final void f(v34 v34Var, boolean z, boolean z2) {
        String str;
        long j;
        List list = v34Var.k;
        int i = v34Var.n;
        int i2 = v34Var.b;
        w34 w34Var = v34Var.a;
        this.p.e = list.size();
        androidx.compose.foundation.lazy.layout.c cVar = this.w;
        ai0 ai0Var = this.e;
        if (!z && this.b) {
            this.c = v34Var;
            c08 c08VarK = ql3.k();
            dp2 dp2VarE = c08VarK != null ? c08VarK.e() : null;
            c08 c08VarM = ql3.m(c08VarK);
            try {
                if (((Number) ((s08) cVar.b.b).getValue()).floatValue() != 0.0f && w34Var != null && w34Var.a == ai0Var.q() && i2 == ai0Var.r()) {
                    li1 li1Var = cVar.a;
                    if (li1Var != null) {
                        li1Var.g(null);
                    }
                    cVar.b = new xk(c26.h, Float.valueOf(0.0f), null, 60);
                }
                return;
            } finally {
                ql3.u(c08VarK, c08VarM, dp2VarE);
            }
        }
        if (z) {
            this.b = true;
        }
        ((s08) this.u).setValue(Boolean.valueOf(((w34Var != null ? w34Var.a : 0) == 0 && i2 == 0) ? false : true));
        ((s08) this.t).setValue(Boolean.valueOf(v34Var.c));
        this.h -= v34Var.d;
        ((s08) this.f).setValue(v34Var);
        if (z2) {
            ai0Var.getClass();
            if (!(((float) i2) >= 0.0f)) {
                un3.c("scrollOffset should be non-negative");
            }
            ((n08) ai0Var.c).i(i2);
        } else {
            w34 w34Var2 = (w34) kotlin.collections.a.p0(list);
            w34 w34Var3 = (w34) kotlin.collections.a.v0(list);
            if (w34Var2 != null) {
                str = "scrollOffset should be non-negative";
                j = w34Var2.a;
            } else {
                str = "scrollOffset should be non-negative";
                j = -1;
            }
            te.Y(j, "firstVisibleItem:index");
            te.Y(w34Var3 != null ? w34Var3.a : -1L, "lastVisibleItem:index");
            ai0Var.getClass();
            ai0Var.d = w34Var != null ? w34Var.g : null;
            if (ai0Var.a || i > 0) {
                ai0Var.a = true;
                if (!(((float) i2) >= 0.0f)) {
                    un3.c(str);
                }
                ai0Var.A(w34Var != null ? w34Var.a : 0, i2);
            }
            if (this.j) {
                sf1 sf1Var = this.a;
                int i3 = sf1Var.a;
                boolean z3 = sf1Var.c;
                if (i3 != -1 && !list.isEmpty() && i3 != sf1.a(v34Var, z3)) {
                    sf1Var.a = -1;
                    f34 f34Var = sf1Var.b;
                    if (f34Var != null) {
                        f34Var.cancel();
                    }
                    sf1Var.b = null;
                }
                int i4 = sf1Var.d;
                if (i4 != -1 && sf1Var.e != 0.0f && i4 != i && !list.isEmpty()) {
                    int iA = sf1.a(v34Var, sf1Var.e < 0.0f);
                    if (iA >= 0 && iA < i) {
                        sf1Var.a = iA;
                        sf1Var.b = dw1.E(this.q, iA);
                    }
                }
                sf1Var.d = i;
            }
        }
        if (z) {
            cVar.a(v34Var.f, v34Var.i, v34Var.h);
        }
    }

    public final v34 g() {
        return (v34) ((s08) this.f).getValue();
    }

    public final void h(float f, v34 v34Var) {
        f34 f34Var;
        f34 f34Var2;
        if (this.j) {
            List list = v34Var.k;
            List list2 = v34Var.k;
            boolean zIsEmpty = list.isEmpty();
            sf1 sf1Var = this.a;
            if (!zIsEmpty) {
                boolean z = f < 0.0f;
                int iA = sf1.a(v34Var, z);
                if (iA >= 0 && iA < v34Var.n) {
                    if (iA != sf1Var.a) {
                        if (sf1Var.c != z) {
                            sf1Var.a = -1;
                            f34 f34Var3 = sf1Var.b;
                            if (f34Var3 != null) {
                                f34Var3.cancel();
                            }
                            sf1Var.b = null;
                        }
                        sf1Var.c = z;
                        sf1Var.a = iA;
                        sf1Var.b = dw1.E(this.q, iA);
                    }
                    if (z) {
                        w34 w34Var = (w34) kotlin.collections.a.u0(list2);
                        if (((w34Var.j + w34Var.k) + v34Var.q) - v34Var.m < (-f) && (f34Var2 = sf1Var.b) != null) {
                            f34Var2.a();
                        }
                    } else if (v34Var.l - ((w34) kotlin.collections.a.o0(list2)).j < f && (f34Var = sf1Var.b) != null) {
                        f34Var.a();
                    }
                }
            }
            sf1Var.e = f;
        }
    }
}
