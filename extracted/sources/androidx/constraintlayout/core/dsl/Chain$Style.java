package androidx.constraintlayout.core.dsl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class Chain$Style {
    public static final /* synthetic */ Chain$Style[] a = {new Chain$Style("PACKED", 0), new Chain$Style("SPREAD", 1), new Chain$Style("SPREAD_INSIDE", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    Chain$Style EF5;

    public static Chain$Style valueOf(String str) {
        return (Chain$Style) Enum.valueOf(Chain$Style.class, str);
    }

    public static Chain$Style[] values() {
        return (Chain$Style[]) a.clone();
    }
}
