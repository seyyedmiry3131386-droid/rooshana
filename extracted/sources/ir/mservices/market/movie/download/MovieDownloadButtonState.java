package ir.mservices.market.movie.download;

import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class MovieDownloadButtonState {
    public static final MovieDownloadButtonState a;
    public static final MovieDownloadButtonState b;
    public static final /* synthetic */ MovieDownloadButtonState[] c;

    static {
        MovieDownloadButtonState movieDownloadButtonState = new MovieDownloadButtonState("LOADING", 0);
        a = movieDownloadButtonState;
        MovieDownloadButtonState movieDownloadButtonState2 = new MovieDownloadButtonState("BUTTON", 1);
        b = movieDownloadButtonState2;
        MovieDownloadButtonState[] movieDownloadButtonStateArr = {movieDownloadButtonState, movieDownloadButtonState2};
        c = movieDownloadButtonStateArr;
        a.a(movieDownloadButtonStateArr);
    }

    public static MovieDownloadButtonState valueOf(String str) {
        return (MovieDownloadButtonState) Enum.valueOf(MovieDownloadButtonState.class, str);
    }

    public static MovieDownloadButtonState[] values() {
        return (MovieDownloadButtonState[]) c.clone();
    }
}
