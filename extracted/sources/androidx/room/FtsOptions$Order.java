package androidx.room;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class FtsOptions$Order {
    public static final /* synthetic */ FtsOptions$Order[] a;

    static {
        FtsOptions$Order[] ftsOptions$OrderArr = {new FtsOptions$Order("ASC", 0), new FtsOptions$Order("DESC", 1)};
        a = ftsOptions$OrderArr;
        kotlin.enums.a.a(ftsOptions$OrderArr);
    }

    public static FtsOptions$Order valueOf(String str) {
        return (FtsOptions$Order) Enum.valueOf(FtsOptions$Order.class, str);
    }

    public static FtsOptions$Order[] values() {
        return (FtsOptions$Order[]) a.clone();
    }
}
