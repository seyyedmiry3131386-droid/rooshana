package io.noties.markwon.core;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class CoreProps$ListItemType {
    public static final CoreProps$ListItemType a;
    public static final CoreProps$ListItemType b;
    public static final /* synthetic */ CoreProps$ListItemType[] c;

    static {
        CoreProps$ListItemType coreProps$ListItemType = new CoreProps$ListItemType("BULLET", 0);
        a = coreProps$ListItemType;
        CoreProps$ListItemType coreProps$ListItemType2 = new CoreProps$ListItemType("ORDERED", 1);
        b = coreProps$ListItemType2;
        c = new CoreProps$ListItemType[]{coreProps$ListItemType, coreProps$ListItemType2};
    }

    public static CoreProps$ListItemType valueOf(String str) {
        return (CoreProps$ListItemType) Enum.valueOf(CoreProps$ListItemType.class, str);
    }

    public static CoreProps$ListItemType[] values() {
        return (CoreProps$ListItemType[]) c.clone();
    }
}
