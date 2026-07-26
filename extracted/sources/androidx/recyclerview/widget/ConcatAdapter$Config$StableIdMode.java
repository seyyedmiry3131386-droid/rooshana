package androidx.recyclerview.widget;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ConcatAdapter$Config$StableIdMode {
    public static final ConcatAdapter$Config$StableIdMode a;
    public static final /* synthetic */ ConcatAdapter$Config$StableIdMode[] b;

    static {
        ConcatAdapter$Config$StableIdMode concatAdapter$Config$StableIdMode = new ConcatAdapter$Config$StableIdMode("NO_STABLE_IDS", 0);
        a = concatAdapter$Config$StableIdMode;
        b = new ConcatAdapter$Config$StableIdMode[]{concatAdapter$Config$StableIdMode, new ConcatAdapter$Config$StableIdMode("ISOLATED_STABLE_IDS", 1), new ConcatAdapter$Config$StableIdMode("SHARED_STABLE_IDS", 2)};
    }

    public static ConcatAdapter$Config$StableIdMode valueOf(String str) {
        return (ConcatAdapter$Config$StableIdMode) Enum.valueOf(ConcatAdapter$Config$StableIdMode.class, str);
    }

    public static ConcatAdapter$Config$StableIdMode[] values() {
        return (ConcatAdapter$Config$StableIdMode[]) b.clone();
    }
}
