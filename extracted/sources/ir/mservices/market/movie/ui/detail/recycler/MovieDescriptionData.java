package ir.mservices.market.movie.ui.detail.recycler;

import defpackage.g32;
import defpackage.h45;
import defpackage.is3;
import defpackage.js3;
import defpackage.js6;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.version2.webapi.responsedto.ConfirmDTO;

/* JADX INFO: loaded from: classes3.dex */
public final class MovieDescriptionData implements MyketRecyclerData, h45, g32 {
    public static final int d = js6.movie_description;
    public final String a;
    public boolean b;
    public final String c;

    public MovieDescriptionData(String str) {
        js3.p(str, ConfirmDTO.INPUT_TYPE_TEXT);
        this.a = str;
        long j = is3.p + 1;
        is3.p = j;
        this.c = String.valueOf(j);
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return d;
    }

    @Override // defpackage.h45
    public final String a() {
        return "movie_description";
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!MovieDescriptionData.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        js3.n(obj, "null cannot be cast to non-null type ir.mservices.market.movie.ui.detail.recycler.MovieDescriptionData");
        return js3.i(this.c, ((MovieDescriptionData) obj).c);
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return this.c;
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
