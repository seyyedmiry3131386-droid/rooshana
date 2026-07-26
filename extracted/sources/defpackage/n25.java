package defpackage;

import ir.mservices.market.movie.download.core.model.MovieDownloadMetaData;
import ir.mservices.market.movie.download.core.source.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes3.dex */
public final class n25 {
    public final a a;

    public n25(a aVar) {
        js3.p(aVar, "neneMovieDownloadSource");
        this.a = aVar;
    }

    public final List a() {
        a aVar = this.a;
        List listF = aVar.a.a.c.f();
        if (listF.isEmpty()) {
            return EmptyList.a;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = listF.iterator();
        while (it.hasNext()) {
            j25 j25VarA = aVar.a((bs1) it.next());
            if (j25VarA != null) {
                arrayList.add(j25VarA);
            }
        }
        return kotlin.collections.a.i0(arrayList);
    }

    public final void b(MovieDownloadMetaData movieDownloadMetaData) {
        js3.p(movieDownloadMetaData, "movieDownloadMetaData");
        a aVar = this.a;
        aVar.getClass();
        j25 j25VarA = aVar.a(aVar.a.b((movieDownloadMetaData.a + "/" + movieDownloadMetaData.f) + "/media"));
        if (j25VarA != null) {
            j25VarA.a(new ss1(new r79(aVar.e)));
        }
    }
}
