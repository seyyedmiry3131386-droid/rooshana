package ir.mservices.market.version2.manager.install;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class InstallQueue$InstallState {
    public static final InstallQueue$InstallState a;
    public static final InstallQueue$InstallState b;
    public static final InstallQueue$InstallState c;
    public static final /* synthetic */ InstallQueue$InstallState[] d;

    static {
        InstallQueue$InstallState installQueue$InstallState = new InstallQueue$InstallState("INSTALL_IN_PRE_PROCESS", 0);
        a = installQueue$InstallState;
        InstallQueue$InstallState installQueue$InstallState2 = new InstallQueue$InstallState("INSTALL_IN_QUEUE", 1);
        b = installQueue$InstallState2;
        InstallQueue$InstallState installQueue$InstallState3 = new InstallQueue$InstallState("INSTALL_IN_PROGRESS", 2);
        c = installQueue$InstallState3;
        InstallQueue$InstallState[] installQueue$InstallStateArr = {installQueue$InstallState, installQueue$InstallState2, installQueue$InstallState3};
        d = installQueue$InstallStateArr;
        kotlin.enums.a.a(installQueue$InstallStateArr);
    }

    public static InstallQueue$InstallState valueOf(String str) {
        return (InstallQueue$InstallState) Enum.valueOf(InstallQueue$InstallState.class, str);
    }

    public static InstallQueue$InstallState[] values() {
        return (InstallQueue$InstallState[]) d.clone();
    }
}
