package defpackage;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.c;

/* JADX INFO: loaded from: classes3.dex */
public final class eq1 implements xe2 {
    public final xe2 a;
    public final dp2 b;
    public final qp2 c;

    public eq1(xe2 xe2Var, dp2 dp2Var, qp2 qp2Var) {
        this.a = xe2Var;
        this.b = dp2Var;
        this.c = qp2Var;
    }

    @Override // defpackage.xe2
    public final Object a(ze2 ze2Var, g51 g51Var) {
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.a = vy2.f;
        Object objA = this.a.a(new c(this, ref$ObjectRef, ze2Var), g51Var);
        return objA == CoroutineSingletons.a ? objA : tx8.a;
    }
}
