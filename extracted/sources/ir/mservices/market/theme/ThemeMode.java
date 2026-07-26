package ir.mservices.market.theme;

import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ThemeMode {
    public static final ThemeMode a;
    public static final ThemeMode b;
    public static final /* synthetic */ ThemeMode[] c;

    static {
        ThemeMode themeMode = new ThemeMode("ORIGINAL", 0);
        a = themeMode;
        ThemeMode themeMode2 = new ThemeMode("NIGHT_MODE", 1);
        b = themeMode2;
        ThemeMode[] themeModeArr = {themeMode, themeMode2};
        c = themeModeArr;
        a.a(themeModeArr);
    }

    public static ThemeMode valueOf(String str) {
        return (ThemeMode) Enum.valueOf(ThemeMode.class, str);
    }

    public static ThemeMode[] values() {
        return (ThemeMode[]) c.clone();
    }
}
