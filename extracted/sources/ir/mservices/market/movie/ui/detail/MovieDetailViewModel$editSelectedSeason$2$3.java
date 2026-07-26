package ir.mservices.market.movie.ui.detail;

import defpackage.dp2;
import defpackage.js3;
import ir.mservices.market.common.ui.recycler.RecyclerItem;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class MovieDetailViewModel$editSelectedSeason$2$3 extends FunctionReferenceImpl implements dp2 {
    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        RecyclerItem recyclerItem = (RecyclerItem) obj;
        js3.p(recyclerItem, "p0");
        return Boolean.valueOf(((MovieDetailViewModel) this.receiver).isMovieSeasonTitleData(recyclerItem));
    }
}
