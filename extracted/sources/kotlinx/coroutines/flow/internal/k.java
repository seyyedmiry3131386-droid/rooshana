package kotlinx.coroutines.flow.internal;

import defpackage.b47;
import defpackage.bf2;
import defpackage.g51;
import defpackage.rp2;
import defpackage.tx8;
import defpackage.xe2;
import defpackage.ze2;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements xe2 {
    public final /* synthetic */ SuspendLambda a;

    /* JADX WARN: Multi-variable type inference failed */
    public k(rp2 rp2Var) {
        this.a = (SuspendLambda) rp2Var;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, rp2] */
    @Override // defpackage.xe2
    public final Object a(ze2 ze2Var, g51 g51Var) {
        FlowCoroutineKt$scopedFlow$1$1 flowCoroutineKt$scopedFlow$1$1 = new FlowCoroutineKt$scopedFlow$1$1(this.a, ze2Var, null);
        bf2 bf2Var = new bf2(g51Var.getContext(), g51Var, 0);
        Object objU = b47.u(bf2Var, true, bf2Var, flowCoroutineKt$scopedFlow$1$1);
        return objU == CoroutineSingletons.a ? objU : tx8.a;
    }
}
