package ir.mservices.market.download.movie;

import defpackage.g51;
import defpackage.tx8;
import defpackage.ze2;
import ir.mservices.market.download.movie.MovieRecentDownloadAction;
import ir.mservices.market.movie.download.core.model.MovieDownloadMetaData;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements ze2 {
    public final /* synthetic */ MovieDownloadRecyclerListFragment a;

    public a(MovieDownloadRecyclerListFragment movieDownloadRecyclerListFragment) {
        this.a = movieDownloadRecyclerListFragment;
    }

    @Override // defpackage.ze2
    public final Object emit(Object obj, g51 g51Var) {
        MovieDownloadMetaData movieDownloadMetaData = (MovieDownloadMetaData) obj;
        int i = MovieDownloadRecyclerListFragment.l1;
        ((MovieRecentDownloadViewModel) this.a.j1.getValue()).r(new MovieRecentDownloadAction.UpdateNotEnoughStorageFlowAction(movieDownloadMetaData.l, movieDownloadMetaData.f));
        return tx8.a;
    }
}
