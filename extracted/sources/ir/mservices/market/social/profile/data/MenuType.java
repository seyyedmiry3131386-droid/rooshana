package ir.mservices.market.social.profile.data;

import defpackage.r22;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class MenuType {
    private static final /* synthetic */ r22 $ENTRIES;
    private static final /* synthetic */ MenuType[] $VALUES;
    public static final MenuType ARTICLE = new MenuType("ARTICLE", 0, "articles");
    public static final MenuType OTHER = new MenuType("OTHER", 1, "other");
    private final String value;

    private static final /* synthetic */ MenuType[] $values() {
        return new MenuType[]{ARTICLE, OTHER};
    }

    static {
        MenuType[] menuTypeArr$values = $values();
        $VALUES = menuTypeArr$values;
        $ENTRIES = a.a(menuTypeArr$values);
    }

    private MenuType(String str, int i, String str2) {
        this.value = str2;
    }

    public static r22 getEntries() {
        return $ENTRIES;
    }

    public static MenuType valueOf(String str) {
        return (MenuType) Enum.valueOf(MenuType.class, str);
    }

    public static MenuType[] values() {
        return (MenuType[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
