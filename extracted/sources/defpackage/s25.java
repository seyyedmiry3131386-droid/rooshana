package defpackage;

import ir.mservices.market.movie.download.core.model.MovieDownloadMetaData;

/* JADX INFO: loaded from: classes3.dex */
public final class s25 extends u25 {
    public final MovieDownloadMetaData a;

    public s25(MovieDownloadMetaData movieDownloadMetaData) {
        this.a = movieDownloadMetaData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s25) && js3.i(this.a, ((s25) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Finished(movieDownloadMetaData=" + this.a + ")";
    }
}
