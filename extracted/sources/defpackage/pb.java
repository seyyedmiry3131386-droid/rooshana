package defpackage;

import android.adservices.adselection.AdSelectionOutcome;
import android.net.Uri;
import ir.mservices.market.movie.data.webapi.MovieDto;

/* JADX INFO: loaded from: classes.dex */
public final class pb {
    public final long a;
    public final Uri b;

    static {
        Uri uri = Uri.EMPTY;
        js3.o(uri, MovieDto.EMPTY_ID);
        new pb(0L, uri);
    }

    public pb(long j, Uri uri) {
        this.a = j;
        this.b = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pb)) {
            return false;
        }
        pb pbVar = (pb) obj;
        return this.a == pbVar.a && js3.i(this.b, pbVar.b);
    }

    public final int hashCode() {
        long j = this.a;
        return this.b.hashCode() + (((int) (j ^ (j >>> 32))) * 31);
    }

    public final String toString() {
        return "AdSelectionOutcome: adSelectionId=" + this.a + ", renderUri=" + this.b;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public pb(AdSelectionOutcome adSelectionOutcome) {
        js3.p(adSelectionOutcome, "response");
        long adSelectionId = adSelectionOutcome.getAdSelectionId();
        Uri renderUri = adSelectionOutcome.getRenderUri();
        js3.o(renderUri, "response.renderUri");
        this(adSelectionId, renderUri);
    }
}
