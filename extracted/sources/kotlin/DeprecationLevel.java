package kotlin;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class DeprecationLevel {
    public static final DeprecationLevel a;
    public static final /* synthetic */ DeprecationLevel[] b;

    static {
        DeprecationLevel deprecationLevel = new DeprecationLevel("WARNING", 0);
        a = deprecationLevel;
        DeprecationLevel[] deprecationLevelArr = {deprecationLevel, new DeprecationLevel("ERROR", 1), new DeprecationLevel("HIDDEN", 2)};
        b = deprecationLevelArr;
        kotlin.enums.a.a(deprecationLevelArr);
    }

    public static DeprecationLevel valueOf(String str) {
        return (DeprecationLevel) Enum.valueOf(DeprecationLevel.class, str);
    }

    public static DeprecationLevel[] values() {
        return (DeprecationLevel[]) b.clone();
    }
}
