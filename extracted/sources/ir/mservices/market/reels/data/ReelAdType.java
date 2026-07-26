package ir.mservices.market.reels.data;

import defpackage.r22;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ReelAdType {
    private static final /* synthetic */ r22 $ENTRIES;
    private static final /* synthetic */ ReelAdType[] $VALUES;
    public static final ReelAdType APP = new ReelAdType("APP", 0);
    public static final ReelAdType LINK = new ReelAdType("LINK", 1);
    public static final ReelAdType NONE = new ReelAdType("NONE", 2);

    private static final /* synthetic */ ReelAdType[] $values() {
        return new ReelAdType[]{APP, LINK, NONE};
    }

    static {
        ReelAdType[] reelAdTypeArr$values = $values();
        $VALUES = reelAdTypeArr$values;
        $ENTRIES = a.a(reelAdTypeArr$values);
    }

    private ReelAdType(String str, int i) {
    }

    public static r22 getEntries() {
        return $ENTRIES;
    }

    public static ReelAdType valueOf(String str) {
        return (ReelAdType) Enum.valueOf(ReelAdType.class, str);
    }

    public static ReelAdType[] values() {
        return (ReelAdType[]) $VALUES.clone();
    }
}
