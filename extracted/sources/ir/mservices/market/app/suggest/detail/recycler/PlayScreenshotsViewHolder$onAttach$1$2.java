package ir.mservices.market.app.suggest.detail.recycler;

import defpackage.bz6;
import defpackage.e71;
import defpackage.fa2;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.wu0;
import ir.mservices.market.app.detail.data.ScreenshotDto;
import ir.mservices.market.common.ui.recycler.RecyclerItem;
import ir.mservices.market.version2.ui.recycler.filter.GeneralFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.suggest.detail.recycler.PlayScreenshotsViewHolder$onAttach$1$2", f = "HolderPlayScreenshots.kt", l = {141}, m = "invokeSuspend", v = 1)
final class PlayScreenshotsViewHolder$onAttach$1$2 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ fa2 b;
    public final /* synthetic */ PlayScreenshots c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayScreenshotsViewHolder$onAttach$1$2(fa2 fa2Var, PlayScreenshots playScreenshots, g51 g51Var) {
        super(2, g51Var);
        this.b = fa2Var;
        this.c = playScreenshots;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new PlayScreenshotsViewHolder$onAttach$1$2(this.b, this.c, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((PlayScreenshotsViewHolder$onAttach$1$2) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            List list = this.c.a;
            ArrayList arrayList = new ArrayList(wu0.V(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new RecyclerItem(new PlayScreenshotData((ScreenshotDto) it.next())));
            }
            bz6 bz6Var = new bz6(arrayList, (GeneralFilter) null, (qp2) null, 6);
            this.a = 1;
            if (this.b.L(bz6Var, this) == coroutineSingletons) {
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
