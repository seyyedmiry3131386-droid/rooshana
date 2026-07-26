package kotlin.io.path;

import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class OnErrorResult {
    public static final /* synthetic */ OnErrorResult[] a;

    static {
        OnErrorResult[] onErrorResultArr = {new OnErrorResult("SKIP_SUBTREE", 0), new OnErrorResult("TERMINATE", 1)};
        a = onErrorResultArr;
        a.a(onErrorResultArr);
    }

    public static OnErrorResult valueOf(String str) {
        return (OnErrorResult) Enum.valueOf(OnErrorResult.class, str);
    }

    public static OnErrorResult[] values() {
        return (OnErrorResult[]) a.clone();
    }
}
