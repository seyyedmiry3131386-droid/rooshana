package androidx.compose.ui.node;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
final class LookaheadPassDelegate$PlacedState {
    public static final LookaheadPassDelegate$PlacedState a;
    public static final LookaheadPassDelegate$PlacedState b;
    public static final LookaheadPassDelegate$PlacedState c;
    public static final /* synthetic */ LookaheadPassDelegate$PlacedState[] d;

    static {
        LookaheadPassDelegate$PlacedState lookaheadPassDelegate$PlacedState = new LookaheadPassDelegate$PlacedState("IsPlacedInLookahead", 0);
        a = lookaheadPassDelegate$PlacedState;
        LookaheadPassDelegate$PlacedState lookaheadPassDelegate$PlacedState2 = new LookaheadPassDelegate$PlacedState("IsPlacedInApproach", 1);
        b = lookaheadPassDelegate$PlacedState2;
        LookaheadPassDelegate$PlacedState lookaheadPassDelegate$PlacedState3 = new LookaheadPassDelegate$PlacedState("IsNotPlaced", 2);
        c = lookaheadPassDelegate$PlacedState3;
        LookaheadPassDelegate$PlacedState[] lookaheadPassDelegate$PlacedStateArr = {lookaheadPassDelegate$PlacedState, lookaheadPassDelegate$PlacedState2, lookaheadPassDelegate$PlacedState3};
        d = lookaheadPassDelegate$PlacedStateArr;
        kotlin.enums.a.a(lookaheadPassDelegate$PlacedStateArr);
    }

    public static LookaheadPassDelegate$PlacedState valueOf(String str) {
        return (LookaheadPassDelegate$PlacedState) Enum.valueOf(LookaheadPassDelegate$PlacedState.class, str);
    }

    public static LookaheadPassDelegate$PlacedState[] values() {
        return (LookaheadPassDelegate$PlacedState[]) d.clone();
    }
}
