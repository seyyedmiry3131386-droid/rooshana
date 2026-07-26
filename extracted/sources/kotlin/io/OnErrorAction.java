package kotlin.io;

import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class OnErrorAction {
    public static final /* synthetic */ OnErrorAction[] a;

    static {
        OnErrorAction[] onErrorActionArr = {new OnErrorAction("SKIP", 0), new OnErrorAction("TERMINATE", 1)};
        a = onErrorActionArr;
        a.a(onErrorActionArr);
    }

    public static OnErrorAction valueOf(String str) {
        return (OnErrorAction) Enum.valueOf(OnErrorAction.class, str);
    }

    public static OnErrorAction[] values() {
        return (OnErrorAction[]) a.clone();
    }
}
