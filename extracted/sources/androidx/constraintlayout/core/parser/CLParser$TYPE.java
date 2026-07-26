package androidx.constraintlayout.core.parser;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
final class CLParser$TYPE {
    public static final /* synthetic */ CLParser$TYPE[] a = {new CLParser$TYPE("UNKNOWN", 0), new CLParser$TYPE("OBJECT", 1), new CLParser$TYPE("ARRAY", 2), new CLParser$TYPE("NUMBER", 3), new CLParser$TYPE("STRING", 4), new CLParser$TYPE("KEY", 5), new CLParser$TYPE("TOKEN", 6)};

    /* JADX INFO: Fake field, exist only in values array */
    CLParser$TYPE EF5;

    public static CLParser$TYPE valueOf(String str) {
        return (CLParser$TYPE) Enum.valueOf(CLParser$TYPE.class, str);
    }

    public static CLParser$TYPE[] values() {
        return (CLParser$TYPE[]) a.clone();
    }
}
