package ir.mservices.market.movie.analytics;

import android.os.Parcelable;
import defpackage.js3;
import defpackage.qt4;
import ir.mservices.market.core.analytics.EventBuilder;

/* JADX INFO: loaded from: classes3.dex */
public final class MovieClickEventBuilder extends EventBuilder {
    public static final Parcelable.Creator<MovieClickEventBuilder> CREATOR = new qt4(1);

    public MovieClickEventBuilder() {
        super("movie_click");
    }

    public final void b(String str) {
        js3.p(str, "clickOn");
        this.c.putString("on", str);
    }
}
