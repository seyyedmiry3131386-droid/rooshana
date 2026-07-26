package kotlin.io.encoding;

import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class Base64$PaddingOption {
    public static final /* synthetic */ Base64$PaddingOption[] a;

    static {
        Base64$PaddingOption[] base64$PaddingOptionArr = {new Base64$PaddingOption("PRESENT", 0), new Base64$PaddingOption("ABSENT", 1), new Base64$PaddingOption("PRESENT_OPTIONAL", 2), new Base64$PaddingOption("ABSENT_OPTIONAL", 3)};
        a = base64$PaddingOptionArr;
        a.a(base64$PaddingOptionArr);
    }

    public static Base64$PaddingOption valueOf(String str) {
        return (Base64$PaddingOption) Enum.valueOf(Base64$PaddingOption.class, str);
    }

    public static Base64$PaddingOption[] values() {
        return (Base64$PaddingOption[]) a.clone();
    }
}
