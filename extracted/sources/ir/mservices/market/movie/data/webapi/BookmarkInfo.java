package ir.mservices.market.movie.data.webapi;

import defpackage.vo7;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class BookmarkInfo implements Serializable {

    @vo7("isBookmarked")
    private boolean isBookmarked;

    public BookmarkInfo(boolean z) {
        this.isBookmarked = z;
    }

    public final boolean isBookmarked() {
        return this.isBookmarked;
    }

    public final void setBookmarked(boolean z) {
        this.isBookmarked = z;
    }
}
