package defpackage;

import ir.mservices.market.social.list.search.SearchProfileListViewModel;
import ir.mservices.market.social.list.search.app.data.ProfileApplicationsDto;
import ir.mservices.market.social.list.search.movie.data.ProfileMoviesDto;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class fj7 implements dp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ SearchProfileListViewModel b;

    public /* synthetic */ fj7(SearchProfileListViewModel searchProfileListViewModel, int i) {
        this.a = i;
        this.b = searchProfileListViewModel;
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return SearchProfileListViewModel.searchMovie$lambda$0(this.b, (ProfileMoviesDto) obj);
            default:
                return SearchProfileListViewModel.searchApp$lambda$0(this.b, (ProfileApplicationsDto) obj);
        }
    }
}
