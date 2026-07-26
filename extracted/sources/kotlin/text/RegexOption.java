package kotlin.text;

import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class RegexOption {
    public static final /* synthetic */ RegexOption[] a;

    static {
        RegexOption[] regexOptionArr = {new RegexOption("IGNORE_CASE", 0, 2), new RegexOption("MULTILINE", 1, 8), new RegexOption("LITERAL", 2, 16), new RegexOption("UNIX_LINES", 3, 1), new RegexOption("COMMENTS", 4, 4), new RegexOption("DOT_MATCHES_ALL", 5, 32), new RegexOption("CANON_EQ", 6, 128)};
        a = regexOptionArr;
        a.a(regexOptionArr);
    }

    public RegexOption(String str, int i, int i2) {
    }

    public static RegexOption valueOf(String str) {
        return (RegexOption) Enum.valueOf(RegexOption.class, str);
    }

    public static RegexOption[] values() {
        return (RegexOption[]) a.clone();
    }
}
