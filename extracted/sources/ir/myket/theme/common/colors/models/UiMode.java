package ir.myket.theme.common.colors.models;

import defpackage.r22;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class UiMode {
    public static final UiMode a;
    public static final UiMode b;
    public static final UiMode c;
    public static final /* synthetic */ UiMode[] d;
    public static final /* synthetic */ r22 e;

    static {
        UiMode uiMode = new UiMode("DARK", 0);
        a = uiMode;
        UiMode uiMode2 = new UiMode("LIGHT", 1);
        b = uiMode2;
        UiMode uiMode3 = new UiMode("AUTO", 2);
        c = uiMode3;
        UiMode[] uiModeArr = {uiMode, uiMode2, uiMode3};
        d = uiModeArr;
        e = a.a(uiModeArr);
    }

    public static UiMode valueOf(String str) {
        return (UiMode) Enum.valueOf(UiMode.class, str);
    }

    public static UiMode[] values() {
        return (UiMode[]) d.clone();
    }
}
