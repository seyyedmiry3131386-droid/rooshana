package ir.mservices.market.social.profile.own;

import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.yx5;
import defpackage.ze2;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.social.profile.own.OwnProfileHeaderViewModel$special$$inlined$transform$1", f = "OwnProfileHeaderViewModel.kt", l = {36}, m = "invokeSuspend", v = 1)
public final class OwnProfileHeaderViewModel$special$$inlined$transform$1 extends SuspendLambda implements qp2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ l c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OwnProfileHeaderViewModel$special$$inlined$transform$1(l lVar, g51 g51Var) {
        super(2, g51Var);
        this.c = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        OwnProfileHeaderViewModel$special$$inlined$transform$1 ownProfileHeaderViewModel$special$$inlined$transform$1 = new OwnProfileHeaderViewModel$special$$inlined$transform$1(this.c, g51Var);
        ownProfileHeaderViewModel$special$$inlined$transform$1.b = obj;
        return ownProfileHeaderViewModel$special$$inlined$transform$1;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((OwnProfileHeaderViewModel$special$$inlined$transform$1) create((ze2) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
            return tx8.a;
        }
        b.b(obj);
        yx5 yx5Var = new yx5((ze2) this.b, 1);
        this.b = null;
        this.a = 1;
        this.c.a(yx5Var, this);
        return coroutineSingletons;
    }
}
