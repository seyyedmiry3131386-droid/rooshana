package ir.myket.player.viewmodel;

import defpackage.a61;
import defpackage.g51;
import defpackage.tb1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.myket.player.viewmodel.PlayerViewModel$adViewStateState$lambda$0$$inlined$map$1$2", f = "PlayerViewModel.kt", l = {50}, m = "emit", v = 1)
public final class PlayerViewModel$adViewStateState$lambda$0$$inlined$map$1$2$1 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ a61 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerViewModel$adViewStateState$lambda$0$$inlined$map$1$2$1(a61 a61Var, g51 g51Var) {
        super(g51Var);
        this.c = a61Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
