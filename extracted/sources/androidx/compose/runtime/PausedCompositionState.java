package androidx.compose.runtime;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class PausedCompositionState {
    public static final PausedCompositionState a;
    public static final PausedCompositionState b;
    public static final PausedCompositionState c;
    public static final PausedCompositionState d;
    public static final PausedCompositionState e;
    public static final PausedCompositionState f;
    public static final PausedCompositionState g;
    public static final /* synthetic */ PausedCompositionState[] h;

    static {
        PausedCompositionState pausedCompositionState = new PausedCompositionState("Invalid", 0);
        a = pausedCompositionState;
        PausedCompositionState pausedCompositionState2 = new PausedCompositionState("Cancelled", 1);
        b = pausedCompositionState2;
        PausedCompositionState pausedCompositionState3 = new PausedCompositionState("InitialPending", 2);
        c = pausedCompositionState3;
        PausedCompositionState pausedCompositionState4 = new PausedCompositionState("RecomposePending", 3);
        d = pausedCompositionState4;
        PausedCompositionState pausedCompositionState5 = new PausedCompositionState("Recomposing", 4);
        e = pausedCompositionState5;
        PausedCompositionState pausedCompositionState6 = new PausedCompositionState("ApplyPending", 5);
        f = pausedCompositionState6;
        PausedCompositionState pausedCompositionState7 = new PausedCompositionState("Applied", 6);
        g = pausedCompositionState7;
        PausedCompositionState[] pausedCompositionStateArr = {pausedCompositionState, pausedCompositionState2, pausedCompositionState3, pausedCompositionState4, pausedCompositionState5, pausedCompositionState6, pausedCompositionState7};
        h = pausedCompositionStateArr;
        kotlin.enums.a.a(pausedCompositionStateArr);
    }

    public static PausedCompositionState valueOf(String str) {
        return (PausedCompositionState) Enum.valueOf(PausedCompositionState.class, str);
    }

    public static PausedCompositionState[] values() {
        return (PausedCompositionState[]) h.clone();
    }
}
