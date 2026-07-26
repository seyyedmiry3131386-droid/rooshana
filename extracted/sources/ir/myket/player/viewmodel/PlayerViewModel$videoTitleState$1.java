package ir.myket.player.viewmodel;

import defpackage.b32;
import defpackage.g51;
import defpackage.js3;
import defpackage.rp2;
import defpackage.t61;
import defpackage.tb1;
import defpackage.tx8;
import ir.myket.player.domain.models.PlayerMovieData;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.myket.player.viewmodel.PlayerViewModel$videoTitleState$1", f = "PlayerViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
final class PlayerViewModel$videoTitleState$1 extends SuspendLambda implements rp2 {
    public /* synthetic */ b32 a;
    public /* synthetic */ PlayerMovieData b;

    @Override // defpackage.rp2
    public final Object a(Object obj, Object obj2, Object obj3) {
        PlayerViewModel$videoTitleState$1 playerViewModel$videoTitleState$1 = new PlayerViewModel$videoTitleState$1(3, (g51) obj3);
        playerViewModel$videoTitleState$1.a = (b32) obj;
        playerViewModel$videoTitleState$1.b = (PlayerMovieData) obj2;
        return playerViewModel$videoTitleState$1.invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String strJ;
        b32 b32Var = this.a;
        PlayerMovieData playerMovieData = this.b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        kotlin.b.b(obj);
        String str = playerMovieData.d.c;
        String str2 = b32Var != null ? b32Var.c : null;
        js3.p(str, "<this>");
        return (str2 == null || (strJ = t61.j(str, " - ", str2)) == null) ? str : strJ;
    }
}
