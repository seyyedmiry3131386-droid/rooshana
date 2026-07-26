package ir.mservices.market.appDetail;

import defpackage.js3;
import ir.mservices.market.movie.data.webapi.MovieFullDto;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class MovieToolbarData implements Serializable {
    public final String a;
    public final String b;
    public final String c;

    public MovieToolbarData(MovieFullDto movieFullDto) {
        String title = movieFullDto.getTitle();
        String posterUrl = movieFullDto.getPosterUrl();
        String secondaryTitle = movieFullDto.getSecondaryTitle();
        js3.p(title, "title");
        js3.p(posterUrl, "posterUrl");
        this.a = title;
        this.b = posterUrl;
        this.c = secondaryTitle;
    }
}
