package androidx.paging;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class DiffingChangePayload {
    public static final DiffingChangePayload a;
    public static final DiffingChangePayload b;
    public static final DiffingChangePayload c;
    public static final /* synthetic */ DiffingChangePayload[] d;

    static {
        DiffingChangePayload diffingChangePayload = new DiffingChangePayload("ITEM_TO_PLACEHOLDER", 0);
        a = diffingChangePayload;
        DiffingChangePayload diffingChangePayload2 = new DiffingChangePayload("PLACEHOLDER_TO_ITEM", 1);
        b = diffingChangePayload2;
        DiffingChangePayload diffingChangePayload3 = new DiffingChangePayload("PLACEHOLDER_POSITION_CHANGE", 2);
        c = diffingChangePayload3;
        DiffingChangePayload[] diffingChangePayloadArr = {diffingChangePayload, diffingChangePayload2, diffingChangePayload3};
        d = diffingChangePayloadArr;
        kotlin.enums.a.a(diffingChangePayloadArr);
    }

    public static DiffingChangePayload valueOf(String str) {
        return (DiffingChangePayload) Enum.valueOf(DiffingChangePayload.class, str);
    }

    public static DiffingChangePayload[] values() {
        return (DiffingChangePayload[]) d.clone();
    }
}
