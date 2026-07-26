package com.bumptech.glide.load;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class DataSource {
    public static final DataSource a;
    public static final DataSource b;
    public static final DataSource c;
    public static final DataSource d;
    public static final DataSource e;
    public static final /* synthetic */ DataSource[] f;

    static {
        DataSource dataSource = new DataSource("LOCAL", 0);
        a = dataSource;
        DataSource dataSource2 = new DataSource("REMOTE", 1);
        b = dataSource2;
        DataSource dataSource3 = new DataSource("DATA_DISK_CACHE", 2);
        c = dataSource3;
        DataSource dataSource4 = new DataSource("RESOURCE_DISK_CACHE", 3);
        d = dataSource4;
        DataSource dataSource5 = new DataSource("MEMORY_CACHE", 4);
        e = dataSource5;
        f = new DataSource[]{dataSource, dataSource2, dataSource3, dataSource4, dataSource5};
    }

    public static DataSource valueOf(String str) {
        return (DataSource) Enum.valueOf(DataSource.class, str);
    }

    public static DataSource[] values() {
        return (DataSource[]) f.clone();
    }
}
