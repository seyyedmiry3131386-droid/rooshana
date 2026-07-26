package ir.myket.player.viewmodel;

import defpackage.g51;
import defpackage.sp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.ze2;
import defpackage.zl6;
import ir.myket.player.domain.models.PlayerMovieData;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.myket.player.viewmodel.PlayerViewModel$adViewStateState$1", f = "PlayerViewModel.kt", l = {743}, m = "invokeSuspend", v = 1)
final class PlayerViewModel$adViewStateState$1 extends SuspendLambda implements sp2 {
    public int a;
    public /* synthetic */ ze2 b;
    public /* synthetic */ zl6 c;
    public /* synthetic */ PlayerMovieData d;
    public final /* synthetic */ e e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerViewModel$adViewStateState$1(g51 g51Var, e eVar) {
        super(4, g51Var);
        this.e = eVar;
    }

    @Override // defpackage.sp2
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        PlayerViewModel$adViewStateState$1 playerViewModel$adViewStateState$1 = new PlayerViewModel$adViewStateState$1((g51) obj4, this.e);
        playerViewModel$adViewStateState$1.b = (ze2) obj;
        playerViewModel$adViewStateState$1.c = (zl6) obj2;
        playerViewModel$adViewStateState$1.d = (PlayerMovieData) obj3;
        return playerViewModel$adViewStateState$1.invokeSuspend(tx8.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007c  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            ir.myket.player.viewmodel.e r0 = r12.e
            java.util.LinkedHashSet r1 = r0.o
            ze2 r2 = r12.b
            zl6 r3 = r12.c
            ir.myket.player.domain.models.PlayerMovieData r4 = r12.d
            kotlin.coroutines.intrinsics.CoroutineSingletons r5 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r6 = r12.a
            r7 = 1
            if (r6 == 0) goto L20
            if (r6 != r7) goto L18
            kotlin.b.b(r13)
            goto L94
        L18:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L20:
            kotlin.b.b(r13)
            ir.myket.movie.common.domain.models.MovieUri r13 = r4.a
            pj3 r13 = r13.h
            r6 = 0
            if (r13 == 0) goto L4a
            java.util.Iterator r13 = r13.iterator()
        L2e:
            boolean r8 = r13.hasNext()
            if (r8 == 0) goto L46
            java.lang.Object r8 = r13.next()
            r9 = r8
            ir.myket.movie.common.domain.models.AdInfo r9 = (ir.myket.movie.common.domain.models.AdInfo) r9
            int r9 = r9.a
            long r10 = r3.a
            int r10 = defpackage.b47.v(r10)
            if (r9 != r10) goto L2e
            goto L47
        L46:
            r8 = r6
        L47:
            ir.myket.movie.common.domain.models.AdInfo r8 = (ir.myket.movie.common.domain.models.AdInfo) r8
            goto L4b
        L4a:
            r8 = r6
        L4b:
            java.lang.String r13 = r3.d
            java.lang.String r3 = r4.b
            boolean r13 = defpackage.js3.i(r13, r3)
            if (r13 == 0) goto L94
            if (r8 == 0) goto L7c
            int r13 = r8.a
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r13)
            boolean r13 = r1.contains(r3)
            if (r13 != 0) goto L7c
            androidx.media3.exoplayer.ExoPlayer r13 = r0.d
            o80 r13 = (defpackage.o80) r13
            boolean r13 = r13.H()
            if (r13 == 0) goto L76
            boolean r13 = r1.isEmpty()
            if (r13 != 0) goto L76
            r13 = r7
            goto L77
        L76:
            r13 = 0
        L77:
            boolean r0 = r0.n
            r13 = r13 ^ r0
            if (r13 == 0) goto L94
        L7c:
            kotlin.Pair r13 = new kotlin.Pair
            ir.myket.player.domain.models.PlayerMovie r0 = r4.d
            java.lang.String r0 = r0.d
            r13.<init>(r8, r0)
            r12.b = r6
            r12.c = r6
            r12.d = r6
            r12.a = r7
            java.lang.Object r13 = r2.emit(r13, r12)
            if (r13 != r5) goto L94
            return r5
        L94:
            tx8 r13 = defpackage.tx8.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.myket.player.viewmodel.PlayerViewModel$adViewStateState$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
