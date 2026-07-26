package ir.mservices.market.securityShield;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ProcessState {
    public static final ProcessState a;
    public static final ProcessState b;
    public static final ProcessState c;
    public static final ProcessState d;
    public static final /* synthetic */ ProcessState[] e;

    static {
        ProcessState processState = new ProcessState("GET_HARMFUL_APP", 0);
        a = processState;
        ProcessState processState2 = new ProcessState("GET_DATA_FROM_SERVER", 1);
        b = processState2;
        ProcessState processState3 = new ProcessState("GET_DATA_FINISHED", 2);
        c = processState3;
        ProcessState processState4 = new ProcessState("DEVICE_IS_SECURE", 3);
        d = processState4;
        ProcessState[] processStateArr = {processState, processState2, processState3, processState4};
        e = processStateArr;
        kotlin.enums.a.a(processStateArr);
    }

    public static ProcessState valueOf(String str) {
        return (ProcessState) Enum.valueOf(ProcessState.class, str);
    }

    public static ProcessState[] values() {
        return (ProcessState[]) e.clone();
    }
}
