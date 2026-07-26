package kotlinx.coroutines.flow;

import defpackage.e71;
import defpackage.g51;
import defpackage.pw6;
import defpackage.qk6;
import defpackage.rp2;
import defpackage.rv6;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.vy2;
import defpackage.ze2;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2", f = "Delay.kt", l = {412}, m = "invokeSuspend")
final class FlowKt__DelayKt$sample$2 extends SuspendLambda implements rp2 {
    public Ref$ObjectRef a;
    public pw6 b;
    public int c;
    public /* synthetic */ Object d;
    public /* synthetic */ Object e;
    public final /* synthetic */ rv6 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$sample$2(rv6 rv6Var, g51 g51Var) {
        super(3, g51Var);
        this.f = rv6Var;
    }

    @Override // defpackage.rp2
    public final Object a(Object obj, Object obj2, Object obj3) {
        FlowKt__DelayKt$sample$2 flowKt__DelayKt$sample$2 = new FlowKt__DelayKt$sample$2(this.f, (g51) obj3);
        flowKt__DelayKt$sample$2.d = (e71) obj;
        flowKt__DelayKt$sample$2.e = (ze2) obj2;
        return flowKt__DelayKt$sample$2.invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        pw6 pw6Var;
        Ref$ObjectRef ref$ObjectRef;
        ze2 ze2Var;
        pw6 pw6VarC;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.c;
        if (i == 0) {
            kotlin.b.b(obj);
            e71 e71Var = (e71) this.d;
            ze2 ze2Var2 = (ze2) this.e;
            qk6 qk6VarC = kotlinx.coroutines.channels.b.c(e71Var, -1, new FlowKt__DelayKt$sample$2$values$1(this.f, null), 1);
            Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
            pw6Var = qk6VarC;
            ref$ObjectRef = ref$ObjectRef2;
            ze2Var = ze2Var2;
            pw6VarC = kotlinx.coroutines.channels.b.c(e71Var, 0, new FlowKt__DelayKt$fixedPeriodTicker$1(2, null), 1);
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pw6VarC = this.b;
            ref$ObjectRef = this.a;
            pw6Var = (pw6) this.e;
            ze2Var = (ze2) this.d;
            kotlin.b.b(obj);
        }
        while (ref$ObjectRef.a != vy2.h) {
            kotlinx.coroutines.selects.b bVar = new kotlinx.coroutines.selects.b(getContext());
            bVar.j(pw6Var.h(), new FlowKt__DelayKt$sample$2$1$1(ref$ObjectRef, pw6VarC, null));
            bVar.j(pw6VarC.e(), new FlowKt__DelayKt$sample$2$1$2(null, ze2Var, ref$ObjectRef));
            this.d = ze2Var;
            this.e = pw6Var;
            this.a = ref$ObjectRef;
            this.b = pw6VarC;
            this.c = 1;
            if (bVar.g(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return tx8.a;
    }
}
