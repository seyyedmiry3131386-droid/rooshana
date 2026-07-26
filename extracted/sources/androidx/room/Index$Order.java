package androidx.room;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class Index$Order {
    public static final /* synthetic */ Index$Order[] a;

    static {
        Index$Order[] index$OrderArr = {new Index$Order("ASC", 0), new Index$Order("DESC", 1)};
        a = index$OrderArr;
        kotlin.enums.a.a(index$OrderArr);
    }

    public static Index$Order valueOf(String str) {
        return (Index$Order) Enum.valueOf(Index$Order.class, str);
    }

    public static Index$Order[] values() {
        return (Index$Order[]) a.clone();
    }
}
