package kotlinx.coroutines.channels;

import defpackage.e71;
import defpackage.g51;
import defpackage.hp0;
import defpackage.jp0;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.wn7;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$trySendBlocking$2", f = "Channels.kt", l = {39}, m = "invokeSuspend")
final class ChannelsKt__ChannelsKt$trySendBlocking$2 extends SuspendLambda implements qp2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ wn7 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelsKt__ChannelsKt$trySendBlocking$2(wn7 wn7Var, g51 g51Var) {
        super(2, g51Var);
        this.c = wn7Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        ChannelsKt__ChannelsKt$trySendBlocking$2 channelsKt__ChannelsKt$trySendBlocking$2 = new ChannelsKt__ChannelsKt$trySendBlocking$2(this.c, g51Var);
        channelsKt__ChannelsKt$trySendBlocking$2.b = obj;
        return channelsKt__ChannelsKt$trySendBlocking$2;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((ChannelsKt__ChannelsKt$trySendBlocking$2) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objA;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        Object hp0Var = tx8.a;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                wn7 wn7Var = this.c;
                this.a = 1;
                if (wn7Var.c(this, hp0Var) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            objA = hp0Var;
        } catch (Throwable th) {
            objA = kotlin.b.a(th);
        }
        if (objA instanceof Result.Failure) {
            hp0Var = new hp0(Result.a(objA));
        }
        return new jp0(hp0Var);
    }
}
