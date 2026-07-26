package androidx.compose.material3;

import androidx.compose.foundation.MutatePriority;
import defpackage.b08;
import defpackage.bp2;
import defpackage.dh4;
import defpackage.dp2;
import defpackage.s08;
import defpackage.sc2;
import defpackage.sk;
import defpackage.tu1;
import defpackage.tx8;
import defpackage.xu7;
import defpackage.yu7;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
public final class n {
    public final boolean a;
    public final dp2 b;
    public sk c;
    public final androidx.compose.material3.internal.d d;
    public sc2 e;
    public sc2 f;

    public n(boolean z, bp2 bp2Var, bp2 bp2Var2, SheetValue sheetValue, dp2 dp2Var) {
        this.a = z;
        this.b = dp2Var;
        if (z && sheetValue == SheetValue.c) {
            throw new IllegalArgumentException("The initial value must not be set to PartiallyExpanded if skipPartiallyExpanded is set to true.");
        }
        this.c = xu7.a;
        this.d = new androidx.compose.material3.internal.d(sheetValue, new tu1(4, bp2Var), bp2Var2, new yu7(0, this), dp2Var);
        this.e = new b08(0);
        this.f = new b08(0);
    }

    public static Object a(n nVar, SheetValue sheetValue, sc2 sc2Var, SuspendLambda suspendLambda) {
        Object objB = nVar.d.b(sheetValue, MutatePriority.a, new SheetState$animateTo$2(nVar, nVar.d.j.h(), sc2Var, null), suspendLambda);
        return objB == CoroutineSingletons.a ? objB : tx8.a;
    }

    public final Object b(SuspendLambda suspendLambda) {
        Object objA;
        SheetValue sheetValue = SheetValue.b;
        return (((Boolean) this.b.invoke(sheetValue)).booleanValue() && (objA = a(this, sheetValue, this.e, suspendLambda)) == CoroutineSingletons.a) ? objA : tx8.a;
    }

    public final Object c(SuspendLambda suspendLambda) {
        Object objA;
        SheetValue sheetValue = SheetValue.a;
        return (((Boolean) this.b.invoke(sheetValue)).booleanValue() && (objA = a(this, sheetValue, this.f, suspendLambda)) == CoroutineSingletons.a) ? objA : tx8.a;
    }

    public final boolean d() {
        return ((s08) this.d.g).getValue() != SheetValue.a;
    }

    public final Object e(SuspendLambda suspendLambda) {
        Object objA;
        if (this.a) {
            throw new IllegalStateException("Attempted to animate to partial expanded when skipPartiallyExpanded was enabled. Set skipPartiallyExpanded to false to use this function.");
        }
        SheetValue sheetValue = SheetValue.c;
        return (((Boolean) this.b.invoke(sheetValue)).booleanValue() && (objA = a(this, sheetValue, this.f, suspendLambda)) == CoroutineSingletons.a) ? objA : tx8.a;
    }

    public final Object f(SuspendLambda suspendLambda) {
        Object objA;
        dh4 dh4VarD = this.d.d();
        SheetValue sheetValue = SheetValue.c;
        if (!dh4VarD.a.containsKey(sheetValue)) {
            sheetValue = SheetValue.b;
        }
        return (((Boolean) this.b.invoke(sheetValue)).booleanValue() && (objA = a(this, sheetValue, this.e, suspendLambda)) == CoroutineSingletons.a) ? objA : tx8.a;
    }
}
