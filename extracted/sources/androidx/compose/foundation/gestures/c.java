package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import defpackage.bh7;
import defpackage.dp2;
import defpackage.js3;
import defpackage.qp2;
import defpackage.s08;
import defpackage.tx8;
import defpackage.wb5;
import defpackage.xg1;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class c implements bh7 {
    public final dp2 a;
    public final xg1 b = new xg1(this);
    public final androidx.compose.foundation.l c = new androidx.compose.foundation.l();
    public final wb5 d;
    public final wb5 e;
    public final wb5 f;

    public c(dp2 dp2Var) {
        this.a = dp2Var;
        Boolean bool = Boolean.FALSE;
        this.d = androidx.compose.runtime.g.h(bool);
        this.e = androidx.compose.runtime.g.h(bool);
        this.f = androidx.compose.runtime.g.h(bool);
    }

    @Override // defpackage.bh7
    public final boolean a() {
        return ((Boolean) ((s08) this.d).getValue()).booleanValue();
    }

    @Override // defpackage.bh7
    public final /* synthetic */ boolean b() {
        return true;
    }

    @Override // defpackage.bh7
    public final Object c(MutatePriority mutatePriority, qp2 qp2Var, ContinuationImpl continuationImpl) {
        Object objV = js3.v(new DefaultScrollableState$scroll$2(this, mutatePriority, qp2Var, null), continuationImpl);
        return objV == CoroutineSingletons.a ? objV : tx8.a;
    }

    @Override // defpackage.bh7
    public final /* synthetic */ boolean d() {
        return true;
    }

    @Override // defpackage.bh7
    public final float e(float f) {
        return ((Number) this.a.invoke(Float.valueOf(f))).floatValue();
    }
}
