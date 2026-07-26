package ir.myket.player.ui.client.state;

import defpackage.tb1;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.myket.player.ui.client.state.PlayerActionFlow", f = "PlayerControllerActions.kt", l = {53}, m = "collectAction", v = 1)
final class PlayerActionFlow$collectAction$1 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ a b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerActionFlow$collectAction$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        this.b.a(null, this);
        return CoroutineSingletons.a;
    }
}
