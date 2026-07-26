package ir.myket.movie.common.domain.models;

import defpackage.r22;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class MovieType {
    public static final MovieType a;
    public static final MovieType b;
    public static final MovieType c;
    public static final MovieType d;
    public static final /* synthetic */ MovieType[] e;
    public static final /* synthetic */ r22 f;

    static {
        MovieType movieType = new MovieType("MOVIE", 0);
        a = movieType;
        MovieType movieType2 = new MovieType("SERIES", 1);
        b = movieType2;
        MovieType movieType3 = new MovieType("LIVE24", 2);
        c = movieType3;
        MovieType movieType4 = new MovieType("UNDEFINED", 3);
        d = movieType4;
        MovieType[] movieTypeArr = {movieType, movieType2, movieType3, movieType4};
        e = movieTypeArr;
        f = a.a(movieTypeArr);
    }

    public static MovieType valueOf(String str) {
        return (MovieType) Enum.valueOf(MovieType.class, str);
    }

    public static MovieType[] values() {
        return (MovieType[]) e.clone();
    }
}
