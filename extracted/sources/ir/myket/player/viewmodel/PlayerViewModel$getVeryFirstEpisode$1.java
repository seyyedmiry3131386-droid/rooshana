package ir.myket.player.viewmodel;

import defpackage.pj3;
import defpackage.tb1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.myket.player.viewmodel.PlayerViewModel", f = "PlayerViewModel.kt", l = {1394, 1402, 1406}, m = "getVeryFirstEpisode", v = 1)
final class PlayerViewModel$getVeryFirstEpisode$1 extends ContinuationImpl {
    public String a;
    public pj3 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ e d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerViewModel$getVeryFirstEpisode$1(e eVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return e.f(this.d, null, this);
    }
}
