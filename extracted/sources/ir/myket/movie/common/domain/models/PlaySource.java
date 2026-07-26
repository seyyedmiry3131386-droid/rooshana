package ir.myket.movie.common.domain.models;

import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class PlaySource {
    public static final /* synthetic */ PlaySource[] a;

    static {
        PlaySource[] playSourceArr = {new PlaySource("DETAIL", 0), new PlaySource("PLAYER", 1)};
        a = playSourceArr;
        a.a(playSourceArr);
    }

    public static PlaySource valueOf(String str) {
        return (PlaySource) Enum.valueOf(PlaySource.class, str);
    }

    public static PlaySource[] values() {
        return (PlaySource[]) a.clone();
    }
}
