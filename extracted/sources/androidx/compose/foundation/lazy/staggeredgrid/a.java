package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.gestures.c;
import androidx.compose.runtime.g;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import defpackage.bh7;
import defpackage.d40;
import defpackage.e44;
import defpackage.f44;
import defpackage.m22;
import defpackage.ml9;
import defpackage.ok4;
import defpackage.pa2;
import defpackage.pg;
import defpackage.s08;
import defpackage.sy0;
import defpackage.th0;
import defpackage.us3;
import defpackage.v24;
import defpackage.vy2;
import defpackage.wb5;
import java.util.LinkedHashMap;
import java.util.List;
import kotlinx.coroutines.channels.BufferOverflow;

/* JADX INFO: loaded from: classes.dex */
public final class a implements bh7 {
    public static final /* synthetic */ int n = 0;
    public boolean a;
    public e44 b;
    public final pa2 c;
    public final wb5 d = g.g(f44.a, th0.p);
    public final pg e = new pg(7);
    public final wb5 f;
    public final wb5 g;
    public final d40 h;
    public final boolean i;
    public final c j;
    public float k;
    public final wb5 l;
    public final androidx.compose.foundation.lazy.layout.c m;

    static {
        ok4.M(new us3(6), new sy0(15));
    }

    public a(int[] iArr, int[] iArr2) {
        this.c = new pa2(iArr, iArr2, new LazyStaggeredGridState$scrollPosition$1(2, this, a.class, "fillNearestIndices", "fillNearestIndices(II)[I", 0));
        Boolean bool = Boolean.FALSE;
        this.f = g.h(bool);
        this.g = g.h(bool);
        this.h = new d40();
        this.i = true;
        new pa2(29);
        this.j = new c(new m22(16, this));
        new LinkedHashMap();
        vy2.e(0, 1, BufferOverflow.b);
        new SnapshotStateList();
        new v24();
        this.l = ml9.m();
        ml9.m();
        this.m = new androidx.compose.foundation.lazy.layout.c();
    }

    @Override // defpackage.bh7
    public final boolean a() {
        return this.j.a();
    }

    @Override // defpackage.bh7
    public final boolean b() {
        return ((Boolean) ((s08) this.g).getValue()).booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
    
        if (r5.j.c(r6, r7, r0) == r1) goto L23;
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
            boolean r0 = r8 instanceof androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$scroll$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$scroll$1 r0 = (androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$scroll$1) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$scroll$1 r0 = new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$scroll$1
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
            wb5 r8 = r5.d
            s08 r8 = (defpackage.s08) r8
            java.lang.Object r8 = r8.getValue()
            e44 r2 = defpackage.f44.a
            if (r8 != r2) goto L5e
            r0.a = r6
            r8 = r7
            kotlin.coroutines.jvm.internal.SuspendLambda r8 = (kotlin.coroutines.jvm.internal.SuspendLambda) r8
            r0.b = r8
            r0.e = r4
            d40 r8 = r5.h
            java.lang.Object r8 = r8.k(r0)
            if (r8 != r1) goto L5e
            goto L6d
        L5e:
            r8 = 0
            r0.a = r8
            r0.b = r8
            r0.e = r3
            androidx.compose.foundation.gestures.c r8 = r5.j
            java.lang.Object r6 = r8.c(r6, r7, r0)
            if (r6 != r1) goto L6e
        L6d:
            return r1
        L6e:
            tx8 r6 = defpackage.tx8.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.staggeredgrid.a.c(androidx.compose.foundation.MutatePriority, qp2, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // defpackage.bh7
    public final boolean d() {
        return ((Boolean) ((s08) this.f).getValue()).booleanValue();
    }

    @Override // defpackage.bh7
    public final float e(float f) {
        return this.j.e(f);
    }

    public final void f(float f, e44 e44Var) {
        if (this.i) {
            List list = e44Var.i;
            if (list.isEmpty()) {
                return;
            }
            if (f < 0.0f) {
                kotlin.collections.a.u0(list).getClass();
                throw new ClassCastException();
            }
            kotlin.collections.a.o0(list).getClass();
            throw new ClassCastException();
        }
    }
}
