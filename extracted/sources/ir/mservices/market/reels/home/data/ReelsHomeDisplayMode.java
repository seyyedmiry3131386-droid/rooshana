package ir.mservices.market.reels.home.data;

import defpackage.r22;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ReelsHomeDisplayMode {
    private static final /* synthetic */ r22 $ENTRIES;
    private static final /* synthetic */ ReelsHomeDisplayMode[] $VALUES;
    public static final ReelsHomeDisplayMode LARGE = new ReelsHomeDisplayMode("LARGE", 0);
    public static final ReelsHomeDisplayMode SMALL = new ReelsHomeDisplayMode("SMALL", 1);

    private static final /* synthetic */ ReelsHomeDisplayMode[] $values() {
        return new ReelsHomeDisplayMode[]{LARGE, SMALL};
    }

    static {
        ReelsHomeDisplayMode[] reelsHomeDisplayModeArr$values = $values();
        $VALUES = reelsHomeDisplayModeArr$values;
        $ENTRIES = a.a(reelsHomeDisplayModeArr$values);
    }

    private ReelsHomeDisplayMode(String str, int i) {
    }

    public static r22 getEntries() {
        return $ENTRIES;
    }

    public static ReelsHomeDisplayMode valueOf(String str) {
        return (ReelsHomeDisplayMode) Enum.valueOf(ReelsHomeDisplayMode.class, str);
    }

    public static ReelsHomeDisplayMode[] values() {
        return (ReelsHomeDisplayMode[]) $VALUES.clone();
    }
}
