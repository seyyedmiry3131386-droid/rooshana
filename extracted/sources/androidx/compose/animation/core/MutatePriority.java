package androidx.compose.animation.core;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class MutatePriority {
    public static final MutatePriority a;
    public static final /* synthetic */ MutatePriority[] b;

    static {
        MutatePriority mutatePriority = new MutatePriority("Default", 0);
        a = mutatePriority;
        MutatePriority[] mutatePriorityArr = {mutatePriority, new MutatePriority("UserInput", 1), new MutatePriority("PreventUserInput", 2)};
        b = mutatePriorityArr;
        kotlin.enums.a.a(mutatePriorityArr);
    }

    public static MutatePriority valueOf(String str) {
        return (MutatePriority) Enum.valueOf(MutatePriority.class, str);
    }

    public static MutatePriority[] values() {
        return (MutatePriority[]) b.clone();
    }
}
