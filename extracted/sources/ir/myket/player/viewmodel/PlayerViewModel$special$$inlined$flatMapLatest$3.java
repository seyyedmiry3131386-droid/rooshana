package ir.myket.player.viewmodel;

import defpackage.g51;
import defpackage.rp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.yr2;
import defpackage.ze2;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.myket.player.viewmodel.PlayerViewModel$special$$inlined$flatMapLatest$3", f = "PlayerViewModel.kt", l = {189}, m = "invokeSuspend", v = 1)
public final class PlayerViewModel$special$$inlined$flatMapLatest$3 extends SuspendLambda implements rp2 {
    public int a;
    public /* synthetic */ ze2 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ e d;
    public final /* synthetic */ yr2 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerViewModel$special$$inlined$flatMapLatest$3(g51 g51Var, e eVar, yr2 yr2Var) {
        super(3, g51Var);
        this.d = eVar;
        this.e = yr2Var;
    }

    @Override // defpackage.rp2
    public final Object a(Object obj, Object obj2, Object obj3) {
        PlayerViewModel$special$$inlined$flatMapLatest$3 playerViewModel$special$$inlined$flatMapLatest$3 = new PlayerViewModel$special$$inlined$flatMapLatest$3((g51) obj3, this.d, this.e);
        playerViewModel$special$$inlined$flatMapLatest$3.b = (ze2) obj;
        playerViewModel$special$$inlined$flatMapLatest$3.c = obj2;
        return playerViewModel$special$$inlined$flatMapLatest$3.invokeSuspend(tx8.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00a5  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r1 = r14.a
            r2 = 1
            if (r1 == 0) goto L16
            if (r1 != r2) goto Le
            kotlin.b.b(r15)
            goto Lba
        Le:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L16:
            kotlin.b.b(r15)
            ze2 r15 = r14.b
            java.lang.Object r1 = r14.c
            kotlin.Pair r1 = (kotlin.Pair) r1
            java.lang.Object r3 = r1.a
            r10 = r3
            ir.myket.movie.common.domain.models.AdInfo r10 = (ir.myket.movie.common.domain.models.AdInfo) r10
            java.lang.Object r1 = r1.b
            java.lang.String r1 = (java.lang.String) r1
            r3 = 0
            if (r10 == 0) goto La5
            ir.myket.player.viewmodel.e r11 = r14.d
            java.util.LinkedHashSet r4 = r11.o
            int r5 = r10.a
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r5)
            boolean r4 = r4.contains(r6)
            if (r4 == 0) goto L3d
            goto La5
        L3d:
            yr2 r4 = r14.e
            vz4 r4 = r4.v
            r9 = r4
            wz4 r9 = (defpackage.wz4) r9
            ir.myket.network.server.c r5 = r9.b
            ug1 r4 = defpackage.up1.a
            kf1 r12 = defpackage.kf1.c
            java.util.Map r8 = kotlin.collections.b.I()
            char[] r4 = new char[r2]
            r6 = 47
            r7 = 0
            r4[r7] = r6
            java.lang.String r6 = "/v2/video/ads/"
            java.util.List r4 = defpackage.f88.z0(r6, r4)
            java.util.Iterator r4 = r4.iterator()
        L5f:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L9d
            java.lang.Object r6 = r4.next()
            java.lang.String r6 = (java.lang.String) r6
            boolean r7 = defpackage.f88.n0(r6)
            if (r7 != 0) goto L5f
            h11 r13 = r5.f
            ir.myket.player.data.repositories.MovieAdRepositoryImpl$getMovieAds$$inlined$flowSafeCall$default$1 r4 = new ir.myket.player.data.repositories.MovieAdRepositoryImpl$getMovieAds$$inlined$flowSafeCall$default$1
            r7 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10)
            kotlinx.coroutines.flow.internal.d r4 = kotlinx.coroutines.flow.d.C(r13, r4)
            ir.myket.player.data.repositories.MovieAdRepositoryImpl$getMovieAds$$inlined$flowSafeCall$default$2 r5 = new ir.myket.player.data.repositories.MovieAdRepositoryImpl$getMovieAds$$inlined$flowSafeCall$default$2
            r6 = 3
            r5.<init>(r6, r3)
            gf2 r6 = new gf2
            r6.<init>(r4, r5, r2)
            ir.myket.player.data.repositories.MovieAdRepositoryImpl$getMovieAds$$inlined$flowSafeCall$default$3 r4 = new ir.myket.player.data.repositories.MovieAdRepositoryImpl$getMovieAds$$inlined$flowSafeCall$default$3
            r5 = 2
            r4.<init>(r5, r3)
            gf2 r5 = new gf2
            r5.<init>(r6, r4)
            xe2 r4 = kotlinx.coroutines.flow.d.t(r5, r12)
            lg6 r5 = new lg6
            r5.<init>(r4, r11, r10, r1)
            goto Lad
        L9d:
            java.util.NoSuchElementException r15 = new java.util.NoSuchElementException
            java.lang.String r0 = "Collection contains no element matching the predicate."
            r15.<init>(r0)
            throw r15
        La5:
            d9 r5 = new d9
            r1 = 5
            tb r4 = defpackage.tb.a
            r5.<init>(r1, r4)
        Lad:
            r14.b = r3
            r14.c = r3
            r14.a = r2
            java.lang.Object r15 = kotlinx.coroutines.flow.d.m(r15, r5, r14)
            if (r15 != r0) goto Lba
            return r0
        Lba:
            tx8 r15 = defpackage.tx8.a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.myket.player.viewmodel.PlayerViewModel$special$$inlined$flatMapLatest$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
