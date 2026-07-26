package ir.myket.player.viewmodel;

import defpackage.g51;
import defpackage.nl;
import defpackage.tb1;
import defpackage.ze2;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.myket.player.viewmodel.PlayerViewModel$special$$inlined$transform$1$1", f = "PlayerViewModel.kt", l = {41, 47}, m = "emit", v = 1)
public final class PlayerViewModel$special$$inlined$transform$1$1$1 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ nl c;
    public ze2 d;
    public Object e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerViewModel$special$$inlined$transform$1$1$1(nl nlVar, g51 g51Var) {
        super(g51Var);
        this.c = nlVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
