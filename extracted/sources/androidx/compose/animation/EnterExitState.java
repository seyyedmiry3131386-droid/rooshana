package androidx.compose.animation;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class EnterExitState {
    public static final EnterExitState a;
    public static final EnterExitState b;
    public static final EnterExitState c;
    public static final /* synthetic */ EnterExitState[] d;

    static {
        EnterExitState enterExitState = new EnterExitState("PreEnter", 0);
        a = enterExitState;
        EnterExitState enterExitState2 = new EnterExitState("Visible", 1);
        b = enterExitState2;
        EnterExitState enterExitState3 = new EnterExitState("PostExit", 2);
        c = enterExitState3;
        EnterExitState[] enterExitStateArr = {enterExitState, enterExitState2, enterExitState3};
        d = enterExitStateArr;
        kotlin.enums.a.a(enterExitStateArr);
    }

    public static EnterExitState valueOf(String str) {
        return (EnterExitState) Enum.valueOf(EnterExitState.class, str);
    }

    public static EnterExitState[] values() {
        return (EnterExitState[]) d.clone();
    }
}
