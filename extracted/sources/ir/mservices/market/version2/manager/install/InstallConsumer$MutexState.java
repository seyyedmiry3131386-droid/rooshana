package ir.mservices.market.version2.manager.install;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class InstallConsumer$MutexState {
    public static final InstallConsumer$MutexState a;
    public static final InstallConsumer$MutexState b;
    public static final InstallConsumer$MutexState c;
    public static final InstallConsumer$MutexState d;
    public static final /* synthetic */ InstallConsumer$MutexState[] e;

    static {
        InstallConsumer$MutexState installConsumer$MutexState = new InstallConsumer$MutexState("NORMAL", 0);
        a = installConsumer$MutexState;
        InstallConsumer$MutexState installConsumer$MutexState2 = new InstallConsumer$MutexState("WAIT", 1);
        b = installConsumer$MutexState2;
        InstallConsumer$MutexState installConsumer$MutexState3 = new InstallConsumer$MutexState("WAIT_ACTIVITY", 2);
        c = installConsumer$MutexState3;
        InstallConsumer$MutexState installConsumer$MutexState4 = new InstallConsumer$MutexState("WAIT_DIALOG", 3);
        d = installConsumer$MutexState4;
        e = new InstallConsumer$MutexState[]{installConsumer$MutexState, installConsumer$MutexState2, installConsumer$MutexState3, installConsumer$MutexState4, new InstallConsumer$MutexState("DESTROY_ACTIVITY", 4)};
    }

    public static InstallConsumer$MutexState valueOf(String str) {
        return (InstallConsumer$MutexState) Enum.valueOf(InstallConsumer$MutexState.class, str);
    }

    public static InstallConsumer$MutexState[] values() {
        return (InstallConsumer$MutexState[]) e.clone();
    }
}
