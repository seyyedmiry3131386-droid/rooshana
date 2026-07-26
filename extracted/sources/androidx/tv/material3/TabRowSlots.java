package androidx.tv.material3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
final class TabRowSlots {
    public static final TabRowSlots a;
    public static final /* synthetic */ TabRowSlots[] b;

    /* JADX INFO: Fake field, exist only in values array */
    TabRowSlots EF0;

    static {
        TabRowSlots tabRowSlots = new TabRowSlots("Tabs", 0);
        TabRowSlots tabRowSlots2 = new TabRowSlots("Indicator", 1);
        a = tabRowSlots2;
        b = new TabRowSlots[]{tabRowSlots, tabRowSlots2, new TabRowSlots("Separator", 2)};
    }

    public static TabRowSlots valueOf(String str) {
        return (TabRowSlots) Enum.valueOf(TabRowSlots.class, str);
    }

    public static TabRowSlots[] values() {
        return (TabRowSlots[]) b.clone();
    }
}
