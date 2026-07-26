package androidx.compose.material3;

import androidx.compose.foundation.MutatePriority;
import defpackage.om0;
import defpackage.s08;
import defpackage.tx8;
import defpackage.yb5;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
public final class p {
    public final androidx.compose.foundation.l a;
    public final yb5 b = new yb5(Boolean.FALSE);
    public om0 c;

    public p(androidx.compose.foundation.l lVar) {
        this.a = lVar;
    }

    public final void a() {
        ((s08) this.b.d).setValue(Boolean.FALSE);
    }

    public final boolean b() {
        yb5 yb5Var = this.b;
        return ((Boolean) ((s08) yb5Var.c).getValue()).booleanValue() || ((Boolean) ((s08) yb5Var.d).getValue()).booleanValue();
    }

    public final Object c(MutatePriority mutatePriority, SuspendLambda suspendLambda) {
        Object objB = this.a.b(mutatePriority, new TooltipStateImpl$show$2(this, new TooltipStateImpl$show$cancellableShow$1(this, null), mutatePriority, null), suspendLambda);
        return objB == CoroutineSingletons.a ? objB : tx8.a;
    }
}
