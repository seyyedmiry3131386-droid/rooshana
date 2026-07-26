package androidx.compose.material3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
final class TabSlots {
    public static final /* synthetic */ TabSlots[] a;

    static {
        TabSlots[] tabSlotsArr = {new TabSlots("Tabs", 0), new TabSlots("Divider", 1), new TabSlots("Indicator", 2)};
        a = tabSlotsArr;
        kotlin.enums.a.a(tabSlotsArr);
    }

    public static TabSlots valueOf(String str) {
        return (TabSlots) Enum.valueOf(TabSlots.class, str);
    }

    public static TabSlots[] values() {
        return (TabSlots[]) a.clone();
    }
}
