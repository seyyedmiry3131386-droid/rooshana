package ir.myket.player.viewmodel;

import defpackage.fl7;
import defpackage.g51;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.myket.player.viewmodel.OtherEpisodesViewModel$special$$inlined$filterIsInstance$1$2", f = "OtherEpisodesViewModel.kt", l = {50}, m = "emit", v = 1)
public final class OtherEpisodesViewModel$special$$inlined$filterIsInstance$1$2$1 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ fl7 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OtherEpisodesViewModel$special$$inlined$filterIsInstance$1$2$1(fl7 fl7Var, g51 g51Var) {
        super(g51Var);
        this.c = fl7Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        this.c.emit(null, this);
        return tx8.a;
    }
}
