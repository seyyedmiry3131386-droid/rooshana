package ir.myket.player.domain.models;

import defpackage.r22;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class AdType {
    public static final AdType a;
    public static final AdType b;
    public static final /* synthetic */ AdType[] c;
    public static final /* synthetic */ r22 d;

    static {
        AdType adType = new AdType("APP", 0);
        a = adType;
        AdType adType2 = new AdType("LINK", 1);
        AdType adType3 = new AdType("NONE", 2);
        b = adType3;
        AdType[] adTypeArr = {adType, adType2, adType3};
        c = adTypeArr;
        d = a.a(adTypeArr);
    }

    public static AdType valueOf(String str) {
        return (AdType) Enum.valueOf(AdType.class, str);
    }

    public static AdType[] values() {
        return (AdType[]) c.clone();
    }
}
