package coil3.request;

import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class CachePolicy {
    public static final CachePolicy c;
    public static final CachePolicy d;
    public static final /* synthetic */ CachePolicy[] e;
    public final boolean a;
    public final boolean b;

    static {
        CachePolicy cachePolicy = new CachePolicy(0, "ENABLED", true, true);
        c = cachePolicy;
        CachePolicy cachePolicy2 = new CachePolicy(1, "READ_ONLY", true, false);
        CachePolicy cachePolicy3 = new CachePolicy(2, "WRITE_ONLY", false, true);
        CachePolicy cachePolicy4 = new CachePolicy(3, "DISABLED", false, false);
        d = cachePolicy4;
        CachePolicy[] cachePolicyArr = {cachePolicy, cachePolicy2, cachePolicy3, cachePolicy4};
        e = cachePolicyArr;
        a.a(cachePolicyArr);
    }

    public CachePolicy(int i, String str, boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public static CachePolicy valueOf(String str) {
        return (CachePolicy) Enum.valueOf(CachePolicy.class, str);
    }

    public static CachePolicy[] values() {
        return (CachePolicy[]) e.clone();
    }
}
