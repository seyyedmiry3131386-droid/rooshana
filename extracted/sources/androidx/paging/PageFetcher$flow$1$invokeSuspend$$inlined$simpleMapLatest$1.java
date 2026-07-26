package androidx.paging;

import defpackage.a06;
import defpackage.bz5;
import defpackage.g51;
import defpackage.gf2;
import defpackage.i30;
import defpackage.nc2;
import defpackage.rp2;
import defpackage.t15;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.ze2;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.paging.PageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$1", f = "PageFetcher.kt", l = {91}, m = "invokeSuspend", v = 1)
public final class PageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$1 extends SuspendLambda implements rp2 {
    public int a;
    public /* synthetic */ ze2 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ k d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$1(g51 g51Var, k kVar) {
        super(3, g51Var);
        this.d = kVar;
    }

    @Override // defpackage.rp2
    public final Object a(Object obj, Object obj2, Object obj3) {
        PageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$1 pageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$1 = new PageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$1((g51) obj3, this.d);
        pageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$1.b = (ze2) obj;
        pageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$1.c = obj2;
        return pageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$1.invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            ze2 ze2Var = this.b;
            bz5 bz5Var = (bz5) this.c;
            gf2 gf2Var = new gf2(bz5Var.a.k, new PageFetcher$flow$1$3$downstreamFlow$1(2, null), 4);
            k kVar = this.d;
            a06 a06Var = new a06(gf2Var, new nc2(kVar, kVar.d), new t15(4, bz5Var.a), i30.e);
            this.a = 1;
            if (ze2Var.emit(a06Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        return tx8.a;
    }
}
