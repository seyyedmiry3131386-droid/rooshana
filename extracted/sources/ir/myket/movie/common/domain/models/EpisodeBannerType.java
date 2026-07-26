package ir.myket.movie.common.domain.models;

import defpackage.r22;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class EpisodeBannerType {
    public static final EpisodeBannerType a;
    public static final EpisodeBannerType b;
    public static final /* synthetic */ EpisodeBannerType[] c;
    public static final /* synthetic */ r22 d;

    static {
        EpisodeBannerType episodeBannerType = new EpisodeBannerType("PORTRAIT", 0);
        EpisodeBannerType episodeBannerType2 = new EpisodeBannerType("LANDSCAPE", 1);
        a = episodeBannerType2;
        EpisodeBannerType episodeBannerType3 = new EpisodeBannerType("UNSPECIFIED", 2);
        b = episodeBannerType3;
        EpisodeBannerType[] episodeBannerTypeArr = {episodeBannerType, episodeBannerType2, episodeBannerType3};
        c = episodeBannerTypeArr;
        d = a.a(episodeBannerTypeArr);
    }

    public static EpisodeBannerType valueOf(String str) {
        return (EpisodeBannerType) Enum.valueOf(EpisodeBannerType.class, str);
    }

    public static EpisodeBannerType[] values() {
        return (EpisodeBannerType[]) c.clone();
    }
}
