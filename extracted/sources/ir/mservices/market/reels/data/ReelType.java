package ir.mservices.market.reels.data;

import defpackage.r22;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ReelType {
    private static final /* synthetic */ r22 $ENTRIES;
    private static final /* synthetic */ ReelType[] $VALUES;
    public static final ReelType REELS = new ReelType("REELS", 0);
    public static final ReelType ADS = new ReelType("ADS", 1);
    public static final ReelType NONE = new ReelType("NONE", 2);

    private static final /* synthetic */ ReelType[] $values() {
        return new ReelType[]{REELS, ADS, NONE};
    }

    static {
        ReelType[] reelTypeArr$values = $values();
        $VALUES = reelTypeArr$values;
        $ENTRIES = a.a(reelTypeArr$values);
    }

    private ReelType(String str, int i) {
    }

    public static r22 getEntries() {
        return $ENTRIES;
    }

    public static ReelType valueOf(String str) {
        return (ReelType) Enum.valueOf(ReelType.class, str);
    }

    public static ReelType[] values() {
        return (ReelType[]) $VALUES.clone();
    }
}
