package ir.mservices.market.social.welcome;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class StepState {
    public static final StepState a;
    public static final StepState b;
    public static final /* synthetic */ StepState[] c;

    static {
        StepState stepState = new StepState("PREVIOUS", 0);
        a = stepState;
        StepState stepState2 = new StepState("CURRENT", 1);
        b = stepState2;
        StepState[] stepStateArr = {stepState, stepState2, new StepState("NEXT", 2)};
        c = stepStateArr;
        kotlin.enums.a.a(stepStateArr);
    }

    public static StepState valueOf(String str) {
        return (StepState) Enum.valueOf(StepState.class, str);
    }

    public static StepState[] values() {
        return (StepState[]) c.clone();
    }
}
