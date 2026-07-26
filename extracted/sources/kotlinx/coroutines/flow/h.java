package kotlinx.coroutines.flow;

import defpackage.g51;
import defpackage.i30;
import defpackage.rp2;
import defpackage.tx8;
import defpackage.xe2;
import defpackage.ze2;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements xe2 {
    public final /* synthetic */ xe2 a;
    public final /* synthetic */ xe2 b;
    public final /* synthetic */ SuspendLambda c;

    /* JADX WARN: Multi-variable type inference failed */
    public h(xe2 xe2Var, xe2 xe2Var2, rp2 rp2Var) {
        this.a = xe2Var;
        this.b = xe2Var2;
        this.c = (SuspendLambda) rp2Var;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, rp2] */
    @Override // defpackage.xe2
    public final Object a(ze2 ze2Var, g51 g51Var) {
        Object objA = kotlinx.coroutines.flow.internal.j.a(g51Var, ze2Var, i30.d, new FlowKt__ZipKt$combine$1$1(this.c, null), new xe2[]{this.a, this.b});
        return objA == CoroutineSingletons.a ? objA : tx8.a;
    }
}
