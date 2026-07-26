package androidx.compose.material3.internal;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.material3.SheetValue;
import androidx.compose.runtime.internal.AtomicInt;
import defpackage.as3;
import defpackage.bk1;
import defpackage.bp2;
import defpackage.ck1;
import defpackage.dh4;
import defpackage.dp2;
import defpackage.g08;
import defpackage.ie;
import defpackage.je;
import defpackage.js3;
import defpackage.l08;
import defpackage.ok4;
import defpackage.s08;
import defpackage.sk6;
import defpackage.tu1;
import defpackage.tx8;
import defpackage.u08;
import defpackage.wb5;
import defpackage.yu7;
import java.util.Collection;
import java.util.Iterator;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    public final tu1 a;
    public final bp2 b;
    public final yu7 c;
    public final dp2 d;
    public final wb5 g;
    public final l08 i;
    public final l08 j;
    public final wb5 k;
    public final wb5 l;
    public final je m;
    public final as3 e = new as3();
    public final c f = new c(this);
    public final ck1 h = androidx.compose.runtime.g.c(new ie(this, 0));

    public d(SheetValue sheetValue, tu1 tu1Var, bp2 bp2Var, yu7 yu7Var, dp2 dp2Var) {
        this.a = tu1Var;
        this.b = bp2Var;
        this.c = yu7Var;
        this.d = dp2Var;
        this.g = androidx.compose.runtime.g.h(sheetValue);
        androidx.compose.runtime.g.c(new ie(this, 1));
        this.i = androidx.compose.runtime.g.d(Float.NaN);
        sk6 sk6Var = u08.a;
        new AtomicInt(0);
        new bk1(g08.j().g());
        this.j = androidx.compose.runtime.g.d(0.0f);
        this.k = androidx.compose.runtime.g.h(null);
        this.l = androidx.compose.runtime.g.h(new dh4(kotlin.collections.b.I()));
        this.m = new je(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(androidx.compose.foundation.MutatePriority r8, defpackage.rp2 r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$1
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$1 r0 = (androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$1) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$1 r0 = new androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$1
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.c
            dp2 r3 = r7.d
            r4 = 1056964608(0x3f000000, float:0.5)
            r5 = 1
            if (r2 == 0) goto L35
            if (r2 != r5) goto L2d
            kotlin.b.b(r10)     // Catch: java.lang.Throwable -> L2b
            goto L51
        L2b:
            r8 = move-exception
            goto L86
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            kotlin.b.b(r10)
            as3 r10 = r7.e     // Catch: java.lang.Throwable -> L2b
            androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$2 r2 = new androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$2     // Catch: java.lang.Throwable -> L2b
            r6 = 0
            r2.<init>(r6, r9, r7)     // Catch: java.lang.Throwable -> L2b
            r0.c = r5     // Catch: java.lang.Throwable -> L2b
            r10.getClass()     // Catch: java.lang.Throwable -> L2b
            androidx.compose.material3.internal.InternalMutatorMutex$mutate$2 r9 = new androidx.compose.material3.internal.InternalMutatorMutex$mutate$2     // Catch: java.lang.Throwable -> L2b
            r9.<init>(r8, r10, r2, r6)     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r8 = defpackage.js3.v(r9, r0)     // Catch: java.lang.Throwable -> L2b
            if (r8 != r1) goto L51
            return r1
        L51:
            dh4 r8 = r7.d()
            float r9 = r7.e()
            java.lang.Object r8 = r8.a(r9)
            if (r8 == 0) goto L83
            float r9 = r7.e()
            dh4 r10 = r7.d()
            float r10 = r10.d(r8)
            float r9 = r9 - r10
            float r9 = java.lang.Math.abs(r9)
            int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r9 > 0) goto L83
            java.lang.Object r9 = r3.invoke(r8)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L83
            r7.h(r8)
        L83:
            tx8 r8 = defpackage.tx8.a
            return r8
        L86:
            dh4 r9 = r7.d()
            float r10 = r7.e()
            java.lang.Object r9 = r9.a(r10)
            if (r9 == 0) goto Lb8
            float r10 = r7.e()
            dh4 r0 = r7.d()
            float r0 = r0.d(r9)
            float r10 = r10 - r0
            float r10 = java.lang.Math.abs(r10)
            int r10 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r10 > 0) goto Lb8
            java.lang.Object r10 = r3.invoke(r9)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto Lb8
            r7.h(r9)
        Lb8:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.d.a(androidx.compose.foundation.MutatePriority, rp2, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r8, androidx.compose.foundation.MutatePriority r9, defpackage.sp2 r10, kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.d.b(java.lang.Object, androidx.compose.foundation.MutatePriority, sp2, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final Object c(float f, float f2, Object obj) {
        dh4 dh4VarD = d();
        float fD = dh4VarD.d(obj);
        float fFloatValue = ((Number) this.b.invoke()).floatValue();
        if (fD != f && !Float.isNaN(fD)) {
            tu1 tu1Var = this.a;
            if (fD < f) {
                if (f2 >= fFloatValue) {
                    Object objB = dh4VarD.b(f, true);
                    js3.m(objB);
                    return objB;
                }
                Object objB2 = dh4VarD.b(f, true);
                js3.m(objB2);
                if (f >= Math.abs(Math.abs(((Number) tu1Var.invoke(Float.valueOf(Math.abs(dh4VarD.d(objB2) - fD)))).floatValue()) + fD)) {
                    return objB2;
                }
            } else {
                if (f2 <= (-fFloatValue)) {
                    Object objB3 = dh4VarD.b(f, false);
                    js3.m(objB3);
                    return objB3;
                }
                Object objB4 = dh4VarD.b(f, false);
                js3.m(objB4);
                float fAbs = Math.abs(fD - Math.abs(((Number) tu1Var.invoke(Float.valueOf(Math.abs(fD - dh4VarD.d(objB4))))).floatValue()));
                if (f >= 0.0f ? f <= fAbs : Math.abs(f) >= fAbs) {
                    return objB4;
                }
            }
        }
        return obj;
    }

    public final dh4 d() {
        return (dh4) ((s08) this.l).getValue();
    }

    public final float e() {
        return this.i.h();
    }

    public final float f(float f) {
        Float fValueOf;
        float fE = (Float.isNaN(e()) ? 0.0f : e()) + f;
        float fC = d().c();
        Collection collectionValues = d().a.values();
        js3.p(collectionValues, "<this>");
        Iterator it = collectionValues.iterator();
        if (it.hasNext()) {
            float fFloatValue = ((Number) it.next()).floatValue();
            while (it.hasNext()) {
                fFloatValue = Math.max(fFloatValue, ((Number) it.next()).floatValue());
            }
            fValueOf = Float.valueOf(fFloatValue);
        } else {
            fValueOf = null;
        }
        return ok4.s(fE, fC, fValueOf != null ? fValueOf.floatValue() : Float.NaN);
    }

    public final float g() {
        if (Float.isNaN(e())) {
            throw new IllegalStateException("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        }
        return e();
    }

    public final void h(Object obj) {
        ((s08) this.g).setValue(obj);
    }

    public final void i(Object obj) {
        ((s08) this.k).setValue(obj);
    }

    public final Object j(float f, SuspendLambda suspendLambda) {
        Object value = ((s08) this.g).getValue();
        Object objC = c(g(), f, value);
        boolean zBooleanValue = ((Boolean) this.d.invoke(objC)).booleanValue();
        tx8 tx8Var = tx8.a;
        if (zBooleanValue) {
            Object objB = b(objC, MutatePriority.a, new AnchoredDraggableKt$animateTo$2(this, f, null), suspendLambda);
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            if (objB != coroutineSingletons) {
                objB = tx8Var;
            }
            if (objB == coroutineSingletons) {
                return objB;
            }
        } else {
            Object objB2 = b(value, MutatePriority.a, new AnchoredDraggableKt$animateTo$2(this, f, null), suspendLambda);
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.a;
            if (objB2 != coroutineSingletons2) {
                objB2 = tx8Var;
            }
            if (objB2 == coroutineSingletons2) {
                return objB2;
            }
        }
        return tx8Var;
    }
}
