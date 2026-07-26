package coil3.decode;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class DataSource {
    public static final DataSource a;
    public static final DataSource b;
    public static final DataSource c;
    public static final DataSource d;
    public static final /* synthetic */ DataSource[] e;

    static {
        DataSource dataSource = new DataSource("MEMORY_CACHE", 0);
        a = dataSource;
        DataSource dataSource2 = new DataSource("MEMORY", 1);
        b = dataSource2;
        DataSource dataSource3 = new DataSource("DISK", 2);
        c = dataSource3;
        DataSource dataSource4 = new DataSource("NETWORK", 3);
        d = dataSource4;
        DataSource[] dataSourceArr = {dataSource, dataSource2, dataSource3, dataSource4};
        e = dataSourceArr;
        kotlin.enums.a.a(dataSourceArr);
    }

    public static DataSource valueOf(String str) {
        return (DataSource) Enum.valueOf(DataSource.class, str);
    }

    public static DataSource[] values() {
        return (DataSource[]) e.clone();
    }
}
