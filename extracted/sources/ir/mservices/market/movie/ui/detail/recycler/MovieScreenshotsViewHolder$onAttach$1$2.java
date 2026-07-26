package ir.mservices.market.movie.ui.detail.recycler;

import defpackage.br9;
import defpackage.bz6;
import defpackage.ds6;
import defpackage.e71;
import defpackage.g51;
import defpackage.l45;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import ir.mservices.market.common.ui.recycler.RecyclerItem;
import ir.mservices.market.movie.data.webapi.ScreenshotDto;
import ir.mservices.market.version2.ui.recycler.filter.GeneralFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.movie.ui.detail.recycler.MovieScreenshotsViewHolder$onAttach$1$2", f = "MovieScreenshots.kt", l = {111}, m = "invokeSuspend", v = 1)
final class MovieScreenshotsViewHolder$onAttach$1$2 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ l45 b;
    public final /* synthetic */ d c;
    public final /* synthetic */ MovieScreenshotsData d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovieScreenshotsViewHolder$onAttach$1$2(l45 l45Var, d dVar, MovieScreenshotsData movieScreenshotsData, g51 g51Var) {
        super(2, g51Var);
        this.b = l45Var;
        this.c = dVar;
        this.d = movieScreenshotsData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new MovieScreenshotsViewHolder$onAttach$1$2(this.b, this.c, this.d, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((MovieScreenshotsViewHolder$onAttach$1$2) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            List list = this.d.a;
            d dVar = this.c;
            int integer = dVar.a.getResources().getInteger(ds6.screen_shot_preview_count) * dVar.C;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            int i2 = 0;
            while (true) {
                RecyclerItem recyclerItem = null;
                if (it.hasNext()) {
                    Object next = it.next();
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        br9.P();
                        throw null;
                    }
                    ScreenshotDto screenshotDto = (ScreenshotDto) next;
                    int i4 = integer - 1;
                    if (i2 < i4) {
                        recyclerItem = new RecyclerItem(new MovieScreenshotData(screenshotDto, 0));
                    } else if (i2 == i4) {
                        recyclerItem = new RecyclerItem(new MovieScreenshotData(screenshotDto, list.size() - integer));
                    }
                    if (recyclerItem != null) {
                        arrayList.add(recyclerItem);
                    }
                    i2 = i3;
                } else {
                    bz6 bz6Var = new bz6(arrayList, (GeneralFilter) null, (qp2) null, 6);
                    this.a = 1;
                    if (this.b.L(bz6Var, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
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
