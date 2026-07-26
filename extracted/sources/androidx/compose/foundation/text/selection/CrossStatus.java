package androidx.compose.foundation.text.selection;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class CrossStatus {
    public static final CrossStatus a;
    public static final CrossStatus b;
    public static final CrossStatus c;
    public static final /* synthetic */ CrossStatus[] d;

    static {
        CrossStatus crossStatus = new CrossStatus("CROSSED", 0);
        a = crossStatus;
        CrossStatus crossStatus2 = new CrossStatus("NOT_CROSSED", 1);
        b = crossStatus2;
        CrossStatus crossStatus3 = new CrossStatus("COLLAPSED", 2);
        c = crossStatus3;
        CrossStatus[] crossStatusArr = {crossStatus, crossStatus2, crossStatus3};
        d = crossStatusArr;
        kotlin.enums.a.a(crossStatusArr);
    }

    public static CrossStatus valueOf(String str) {
        return (CrossStatus) Enum.valueOf(CrossStatus.class, str);
    }

    public static CrossStatus[] values() {
        return (CrossStatus[]) d.clone();
    }
}
