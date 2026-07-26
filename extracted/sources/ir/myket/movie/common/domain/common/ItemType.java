package ir.myket.movie.common.domain.common;

import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ItemType {
    public static final ItemType a;
    public static final /* synthetic */ ItemType[] b;

    static {
        ItemType itemType = new ItemType("MOVIE", 0);
        ItemType itemType2 = new ItemType("BANNER", 1);
        ItemType itemType3 = new ItemType("CHARACTER_BANNER", 2);
        ItemType itemType4 = new ItemType("SCREENSHOT", 3);
        ItemType itemType5 = new ItemType("RECOMMENDATION", 4);
        ItemType itemType6 = new ItemType("EPISODE", 5);
        a = itemType6;
        ItemType[] itemTypeArr = {itemType, itemType2, itemType3, itemType4, itemType5, itemType6};
        b = itemTypeArr;
        a.a(itemTypeArr);
    }

    public static ItemType valueOf(String str) {
        return (ItemType) Enum.valueOf(ItemType.class, str);
    }

    public static ItemType[] values() {
        return (ItemType[]) b.clone();
    }
}
