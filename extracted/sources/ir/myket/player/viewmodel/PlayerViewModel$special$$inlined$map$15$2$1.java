package ir.myket.player.viewmodel;

import defpackage.g51;
import defpackage.mg6;
import defpackage.tb1;
import defpackage.ze2;
import ir.myket.player.domain.models.PlayerMovieData;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.myket.player.viewmodel.PlayerViewModel$special$$inlined$map$15$2", f = "PlayerViewModel.kt", l = {51, 50}, m = "emit", v = 1)
public final class PlayerViewModel$special$$inlined$map$15$2$1 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ mg6 c;
    public ze2 d;
    public PlayerMovieData e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerViewModel$special$$inlined$map$15$2$1(mg6 mg6Var, g51 g51Var) {
        super(g51Var);
        this.c = mg6Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
