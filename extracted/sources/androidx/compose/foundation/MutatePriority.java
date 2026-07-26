package androidx.compose.foundation;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class MutatePriority {
    public static final MutatePriority a;
    public static final MutatePriority b;
    public static final MutatePriority c;
    public static final /* synthetic */ MutatePriority[] d;

    static {
        MutatePriority mutatePriority = new MutatePriority("Default", 0);
        a = mutatePriority;
        MutatePriority mutatePriority2 = new MutatePriority("UserInput", 1);
        b = mutatePriority2;
        MutatePriority mutatePriority3 = new MutatePriority("PreventUserInput", 2);
        c = mutatePriority3;
        MutatePriority[] mutatePriorityArr = {mutatePriority, mutatePriority2, mutatePriority3};
        d = mutatePriorityArr;
        kotlin.enums.a.a(mutatePriorityArr);
    }

    public static MutatePriority valueOf(String str) {
        return (MutatePriority) Enum.valueOf(MutatePriority.class, str);
    }

    public static MutatePriority[] values() {
        return (MutatePriority[]) d.clone();
    }
}
