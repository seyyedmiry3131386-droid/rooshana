package ir.mservices.market.appUsage.data;

import defpackage.r22;
import defpackage.rs6;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class SortMode {
    public static final SortMode b;
    public static final /* synthetic */ SortMode[] c;
    public static final /* synthetic */ r22 d;
    public final int a;

    static {
        SortMode sortMode = new SortMode("SIZE", 0, rs6.size);
        b = sortMode;
        SortMode[] sortModeArr = {sortMode, new SortMode("NAME", 1, rs6.apps_name), new SortMode("LAST_USED", 2, rs6.last_used_time)};
        c = sortModeArr;
        d = a.a(sortModeArr);
    }

    public SortMode(String str, int i, int i2) {
        this.a = i2;
    }

    public static SortMode valueOf(String str) {
        return (SortMode) Enum.valueOf(SortMode.class, str);
    }

    public static SortMode[] values() {
        return (SortMode[]) c.clone();
    }
}
