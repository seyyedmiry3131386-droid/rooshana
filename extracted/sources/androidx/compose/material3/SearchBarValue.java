package androidx.compose.material3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class SearchBarValue {
    public static final /* synthetic */ SearchBarValue[] a;

    static {
        SearchBarValue[] searchBarValueArr = {new SearchBarValue("Collapsed", 0), new SearchBarValue("Expanded", 1)};
        a = searchBarValueArr;
        kotlin.enums.a.a(searchBarValueArr);
    }

    public static SearchBarValue valueOf(String str) {
        return (SearchBarValue) Enum.valueOf(SearchBarValue.class, str);
    }

    public static SearchBarValue[] values() {
        return (SearchBarValue[]) a.clone();
    }
}
