package ir.mservices.market.download.common.model;

import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class MovieDownloadType {
    public static final /* synthetic */ MovieDownloadType[] a;

    static {
        MovieDownloadType[] movieDownloadTypeArr = {new MovieDownloadType("MOVIE_MEDIA", 0), new MovieDownloadType("MOVIE_SUB", 1)};
        a = movieDownloadTypeArr;
        a.a(movieDownloadTypeArr);
    }

    public static MovieDownloadType valueOf(String str) {
        return (MovieDownloadType) Enum.valueOf(MovieDownloadType.class, str);
    }

    public static MovieDownloadType[] values() {
        return (MovieDownloadType[]) a.clone();
    }
}
