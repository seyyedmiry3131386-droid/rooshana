package ir.mservices.market.download.movie.recycler;

import defpackage.fu7;
import defpackage.g32;
import defpackage.js3;
import defpackage.js6;
import defpackage.rm7;
import defpackage.rv6;
import defpackage.u25;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.movie.download.core.model.MovieDownloadMetaData;
import kotlinx.coroutines.flow.i;

/* JADX INFO: loaded from: classes3.dex */
public final class MovieDownloadData implements MyketRecyclerData, g32 {
    public static final int g = js6.holder_movie_download_item;
    public final MovieDownloadMetaData a;
    public final String b;
    public final String c;
    public final boolean d;
    public final rv6 e;
    public final fu7 f;

    public MovieDownloadData(MovieDownloadMetaData movieDownloadMetaData, String str, String str2, boolean z, rv6 rv6Var, i iVar) {
        js3.p(str2, "type");
        js3.p(iVar, "notEnoughStorageFlow");
        this.a = movieDownloadMetaData;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = rv6Var;
        this.f = iVar;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return g;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!MovieDownloadData.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        js3.n(obj, "null cannot be cast to non-null type ir.mservices.market.download.movie.recycler.MovieDownloadData");
        MovieDownloadData movieDownloadData = (MovieDownloadData) obj;
        return this.a.equals(movieDownloadData.a) && js3.i(this.b, movieDownloadData.b) && js3.i(this.c, movieDownloadData.c) && this.d == movieDownloadData.d && js3.i(this.e.a.getValue(), movieDownloadData.e.a.getValue());
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        MovieDownloadMetaData movieDownloadMetaData = this.a;
        js3.p(movieDownloadMetaData, "movieDownloadMetaData");
        return movieDownloadMetaData.a + "/" + movieDownloadMetaData.f;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return ((u25) this.e.a.getValue()).hashCode() + ((rm7.k(this.c, (iHashCode + (str != null ? str.hashCode() : 0)) * 31, 31) + (this.d ? 1231 : 1237)) * 31);
    }
}
