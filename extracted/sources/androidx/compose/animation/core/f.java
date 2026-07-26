package androidx.compose.animation.core;

import defpackage.c26;
import defpackage.dl;
import defpackage.dp2;
import defpackage.kk;
import defpackage.lc8;
import defpackage.lt8;
import defpackage.mt8;
import defpackage.my4;
import defpackage.qp2;
import defpackage.rk;
import defpackage.s08;
import defpackage.sk;
import defpackage.th0;
import defpackage.tx8;
import defpackage.v25;
import defpackage.w61;
import defpackage.xe8;
import defpackage.xk;
import defpackage.y97;
import defpackage.yi6;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    public static final Object a(float f, float f2, float f3, sk skVar, qp2 qp2Var, SuspendLambda suspendLambda) {
        Object objC = c(c26.h, new Float(f), new Float(f2), new Float(f3), skVar, qp2Var, suspendLambda);
        return objC == CoroutineSingletons.a ? objC : tx8.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(defpackage.xk r23, defpackage.kk r24, long r25, final defpackage.dp2 r27, kotlin.coroutines.jvm.internal.ContinuationImpl r28) {
        /*
            Method dump skipped, instruction units count: 431
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.f.b(xk, kk, long, dp2, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static final Object c(mt8 mt8Var, Object obj, Object obj2, Float f, sk skVar, qp2 qp2Var, SuspendLambda suspendLambda) {
        dl dlVarC;
        dp2 dp2Var = mt8Var.a;
        if (f == null || (dlVarC = (dl) dp2Var.invoke(f)) == null) {
            dlVarC = ((dl) dp2Var.invoke(obj)).c();
        }
        dl dlVar = dlVarC;
        Object objB = b(new xk(mt8Var, obj, dlVar, 56), new xe8(skVar, mt8Var, obj, obj2, dlVar), Long.MIN_VALUE, new v25(qp2Var, mt8Var, 22), suspendLambda);
        return objB == CoroutineSingletons.a ? objB : tx8.a;
    }

    public static /* synthetic */ Object d(float f, float f2, lt8 lt8Var, qp2 qp2Var, SuspendLambda suspendLambda, int i) {
        sk skVarC0 = lt8Var;
        if ((i & 8) != 0) {
            skVarC0 = y97.c0(0.0f, 0.0f, null, 7);
        }
        return a(f, f2, 0.0f, skVarC0, qp2Var, suspendLambda);
    }

    public static final Object e(xk xkVar, Object obj, sk skVar, boolean z, dp2 dp2Var, ContinuationImpl continuationImpl) {
        Object objB = b(xkVar, new xe8(skVar, xkVar.a, ((s08) xkVar.b).getValue(), obj, xkVar.c), z ? xkVar.d : Long.MIN_VALUE, dp2Var, continuationImpl);
        return objB == CoroutineSingletons.a ? objB : tx8.a;
    }

    public static /* synthetic */ Object f(xk xkVar, Object obj, sk skVar, boolean z, dp2 dp2Var, ContinuationImpl continuationImpl, int i) {
        if ((i & 2) != 0) {
            skVar = y97.c0(0.0f, 0.0f, null, 7);
        }
        sk skVar2 = skVar;
        if ((i & 4) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            dp2Var = new lc8(2);
        }
        return e(xkVar, obj, skVar2, z2, dp2Var, continuationImpl);
    }

    public static final void g(rk rkVar, long j, float f, kk kkVar, xk xkVar, dp2 dp2Var) {
        long jB = f == 0.0f ? kkVar.b() : (long) ((j - rkVar.c) / f);
        rkVar.g = j;
        ((s08) rkVar.e).setValue(kkVar.f(jB));
        rkVar.f = kkVar.d(jB);
        if (kkVar.e(jB)) {
            rkVar.h = rkVar.g;
            ((s08) rkVar.i).setValue(Boolean.FALSE);
        }
        i(rkVar, xkVar);
        dp2Var.invoke(rkVar);
    }

    public static final float h(w61 w61Var) {
        my4 my4Var = (my4) w61Var.r0(th0.o);
        float fR = my4Var != null ? my4Var.R() : 1.0f;
        if (fR >= 0.0f) {
            return fR;
        }
        yi6.b("negative scale factor");
        return fR;
    }

    public static final void i(rk rkVar, xk xkVar) {
        ((s08) xkVar.b).setValue(((s08) rkVar.e).getValue());
        dl dlVar = xkVar.c;
        dl dlVar2 = rkVar.f;
        int iB = dlVar.b();
        for (int i = 0; i < iB; i++) {
            dlVar.e(i, dlVar2.a(i));
        }
        xkVar.e = rkVar.h;
        xkVar.d = rkVar.g;
        xkVar.f = ((Boolean) ((s08) rkVar.i).getValue()).booleanValue();
    }
}
