package kotlinx.coroutines;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class CoroutineStart {
    public static final CoroutineStart a;
    public static final CoroutineStart b;
    public static final CoroutineStart c;
    public static final CoroutineStart d;
    public static final /* synthetic */ CoroutineStart[] e;

    static {
        CoroutineStart coroutineStart = new CoroutineStart("DEFAULT", 0);
        a = coroutineStart;
        CoroutineStart coroutineStart2 = new CoroutineStart("LAZY", 1);
        b = coroutineStart2;
        CoroutineStart coroutineStart3 = new CoroutineStart("ATOMIC", 2);
        c = coroutineStart3;
        CoroutineStart coroutineStart4 = new CoroutineStart("UNDISPATCHED", 3);
        d = coroutineStart4;
        CoroutineStart[] coroutineStartArr = {coroutineStart, coroutineStart2, coroutineStart3, coroutineStart4};
        e = coroutineStartArr;
        kotlin.enums.a.a(coroutineStartArr);
    }

    public static CoroutineStart valueOf(String str) {
        return (CoroutineStart) Enum.valueOf(CoroutineStart.class, str);
    }

    public static CoroutineStart[] values() {
        return (CoroutineStart[]) e.clone();
    }
}
