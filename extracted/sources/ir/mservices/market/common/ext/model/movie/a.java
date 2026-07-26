package ir.mservices.market.common.ext.model.movie;

import defpackage.bp2;
import defpackage.nm5;
import ir.mservices.market.model.paging.b;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements bp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ nm5 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Object d;

    public /* synthetic */ a(nm5 nm5Var, String str, Object obj, int i) {
        this.a = i;
        this.b = nm5Var;
        this.c = str;
        this.d = obj;
    }

    @Override // defpackage.bp2
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new b(new ExtensionMoviesRepositoryImpl$getExtensionBanners$1$1(this.b, this.c, this.d, null));
            default:
                return new b(new ExtensionMoviesRepositoryImpl$getExtensionMovies$1$1(this.b, this.c, (ir.mservices.market.viewModel.a) this.d, null));
        }
    }
}
