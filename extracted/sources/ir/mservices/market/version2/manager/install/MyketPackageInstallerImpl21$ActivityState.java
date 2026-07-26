package ir.mservices.market.version2.manager.install;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
final class MyketPackageInstallerImpl21$ActivityState {
    public static final MyketPackageInstallerImpl21$ActivityState a;
    public static final MyketPackageInstallerImpl21$ActivityState b;
    public static final /* synthetic */ MyketPackageInstallerImpl21$ActivityState[] c;

    static {
        MyketPackageInstallerImpl21$ActivityState myketPackageInstallerImpl21$ActivityState = new MyketPackageInstallerImpl21$ActivityState("PAUSE", 0);
        a = myketPackageInstallerImpl21$ActivityState;
        MyketPackageInstallerImpl21$ActivityState myketPackageInstallerImpl21$ActivityState2 = new MyketPackageInstallerImpl21$ActivityState("RESUME", 1);
        b = myketPackageInstallerImpl21$ActivityState2;
        c = new MyketPackageInstallerImpl21$ActivityState[]{myketPackageInstallerImpl21$ActivityState, myketPackageInstallerImpl21$ActivityState2};
    }

    public static MyketPackageInstallerImpl21$ActivityState valueOf(String str) {
        return (MyketPackageInstallerImpl21$ActivityState) Enum.valueOf(MyketPackageInstallerImpl21$ActivityState.class, str);
    }

    public static MyketPackageInstallerImpl21$ActivityState[] values() {
        return (MyketPackageInstallerImpl21$ActivityState[]) c.clone();
    }
}
