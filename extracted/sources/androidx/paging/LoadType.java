package androidx.paging;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class LoadType {
    public static final LoadType a;
    public static final LoadType b;
    public static final LoadType c;
    public static final /* synthetic */ LoadType[] d;

    static {
        LoadType loadType = new LoadType("REFRESH", 0);
        a = loadType;
        LoadType loadType2 = new LoadType("PREPEND", 1);
        b = loadType2;
        LoadType loadType3 = new LoadType("APPEND", 2);
        c = loadType3;
        LoadType[] loadTypeArr = {loadType, loadType2, loadType3};
        d = loadTypeArr;
        kotlin.enums.a.a(loadTypeArr);
    }

    public static LoadType valueOf(String str) {
        return (LoadType) Enum.valueOf(LoadType.class, str);
    }

    public static LoadType[] values() {
        return (LoadType[]) d.clone();
    }
}
