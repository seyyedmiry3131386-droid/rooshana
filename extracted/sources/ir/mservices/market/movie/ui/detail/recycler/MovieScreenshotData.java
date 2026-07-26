package ir.mservices.market.movie.ui.detail.recycler;

import defpackage.g32;
import defpackage.is3;
import defpackage.js3;
import defpackage.js6;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.movie.data.webapi.ScreenshotDto;

/* JADX INFO: loaded from: classes3.dex */
public final class MovieScreenshotData implements MyketRecyclerData, g32 {
    public static final int d = js6.holder_movie_screenshot;
    public final ScreenshotDto a;
    public final int b;
    public final String c;

    public MovieScreenshotData(ScreenshotDto screenshotDto, int i) {
        js3.p(screenshotDto, "screenshotDto");
        this.a = screenshotDto;
        this.b = i;
        long j = is3.p + 1;
        is3.p = j;
        this.c = String.valueOf(j);
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return d;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!MovieScreenshotData.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        js3.n(obj, "null cannot be cast to non-null type ir.mservices.market.movie.ui.detail.recycler.MovieScreenshotData");
        MovieScreenshotData movieScreenshotData = (MovieScreenshotData) obj;
        return js3.i(this.a, movieScreenshotData.a) && js3.i(this.c, movieScreenshotData.c);
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return this.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.c;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
