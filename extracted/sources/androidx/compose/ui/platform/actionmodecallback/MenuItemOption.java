package androidx.compose.ui.platform.actionmodecallback;

import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class MenuItemOption {
    public static final /* synthetic */ MenuItemOption[] a;

    static {
        MenuItemOption[] menuItemOptionArr = {new MenuItemOption("Copy", 0, 0), new MenuItemOption("Paste", 1, 1), new MenuItemOption("Cut", 2, 2), new MenuItemOption("SelectAll", 3, 3), new MenuItemOption("Autofill", 4, 4)};
        a = menuItemOptionArr;
        a.a(menuItemOptionArr);
    }

    public MenuItemOption(String str, int i, int i2) {
    }

    public static MenuItemOption valueOf(String str) {
        return (MenuItemOption) Enum.valueOf(MenuItemOption.class, str);
    }

    public static MenuItemOption[] values() {
        return (MenuItemOption[]) a.clone();
    }
}
