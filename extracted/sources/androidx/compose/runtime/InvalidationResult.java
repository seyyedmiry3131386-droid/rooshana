package androidx.compose.runtime;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class InvalidationResult {
    public static final InvalidationResult a;
    public static final InvalidationResult b;
    public static final InvalidationResult c;
    public static final InvalidationResult d;
    public static final /* synthetic */ InvalidationResult[] e;

    static {
        InvalidationResult invalidationResult = new InvalidationResult("IGNORED", 0);
        a = invalidationResult;
        InvalidationResult invalidationResult2 = new InvalidationResult("SCHEDULED", 1);
        b = invalidationResult2;
        InvalidationResult invalidationResult3 = new InvalidationResult("DEFERRED", 2);
        c = invalidationResult3;
        InvalidationResult invalidationResult4 = new InvalidationResult("IMMINENT", 3);
        d = invalidationResult4;
        InvalidationResult[] invalidationResultArr = {invalidationResult, invalidationResult2, invalidationResult3, invalidationResult4};
        e = invalidationResultArr;
        kotlin.enums.a.a(invalidationResultArr);
    }

    public static InvalidationResult valueOf(String str) {
        return (InvalidationResult) Enum.valueOf(InvalidationResult.class, str);
    }

    public static InvalidationResult[] values() {
        return (InvalidationResult[]) e.clone();
    }
}
