package androidx.paging;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class CombineSource {
    public static final /* synthetic */ CombineSource[] a;

    static {
        CombineSource[] combineSourceArr = {new CombineSource("INITIAL", 0), new CombineSource("RECEIVER", 1), new CombineSource("OTHER", 2)};
        a = combineSourceArr;
        kotlin.enums.a.a(combineSourceArr);
    }

    public static CombineSource valueOf(String str) {
        return (CombineSource) Enum.valueOf(CombineSource.class, str);
    }

    public static CombineSource[] values() {
        return (CombineSource[]) a.clone();
    }
}
