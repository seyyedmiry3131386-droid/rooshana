package androidx.paging;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class DataSource$KeyType {
    public static final /* synthetic */ DataSource$KeyType[] a;

    static {
        DataSource$KeyType[] dataSource$KeyTypeArr = {new DataSource$KeyType("POSITIONAL", 0), new DataSource$KeyType("PAGE_KEYED", 1), new DataSource$KeyType("ITEM_KEYED", 2)};
        a = dataSource$KeyTypeArr;
        kotlin.enums.a.a(dataSource$KeyTypeArr);
    }

    public static DataSource$KeyType valueOf(String str) {
        return (DataSource$KeyType) Enum.valueOf(DataSource$KeyType.class, str);
    }

    public static DataSource$KeyType[] values() {
        return (DataSource$KeyType[]) a.clone();
    }
}
