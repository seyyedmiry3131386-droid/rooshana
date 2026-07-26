package kotlinx.coroutines.flow.internal;

import defpackage.e71;
import defpackage.g51;
import defpackage.pw6;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.ze2;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collect$2", f = "ChannelFlow.kt", l = {119}, m = "invokeSuspend")
final class ChannelFlow$collect$2 extends SuspendLambda implements qp2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ze2 c;
    public final /* synthetic */ a d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelFlow$collect$2(ze2 ze2Var, a aVar, g51 g51Var) {
        super(2, g51Var);
        this.c = ze2Var;
        this.d = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        ChannelFlow$collect$2 channelFlow$collect$2 = new ChannelFlow$collect$2(this.c, this.d, g51Var);
        channelFlow$collect$2.b = obj;
        return channelFlow$collect$2;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((ChannelFlow$collect$2) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        tx8 tx8Var = tx8.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            return tx8Var;
        }
        kotlin.b.b(obj);
        pw6 pw6VarI = this.d.i((e71) this.b);
        this.a = 1;
        Object objN = kotlinx.coroutines.flow.d.n(this.c, pw6VarI, true, this);
        if (objN != coroutineSingletons) {
            objN = tx8Var;
        }
        return objN == coroutineSingletons ? coroutineSingletons : tx8Var;
    }
}
