package ir.mservices.market.version2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ApplicationLauncher$OnMyketFirstRunEvent$VersionChangeMode {
    public static final ApplicationLauncher$OnMyketFirstRunEvent$VersionChangeMode a;
    public static final ApplicationLauncher$OnMyketFirstRunEvent$VersionChangeMode b;
    public static final ApplicationLauncher$OnMyketFirstRunEvent$VersionChangeMode c;
    public static final ApplicationLauncher$OnMyketFirstRunEvent$VersionChangeMode d;
    public static final /* synthetic */ ApplicationLauncher$OnMyketFirstRunEvent$VersionChangeMode[] e;

    static {
        ApplicationLauncher$OnMyketFirstRunEvent$VersionChangeMode applicationLauncher$OnMyketFirstRunEvent$VersionChangeMode = new ApplicationLauncher$OnMyketFirstRunEvent$VersionChangeMode("FRESH_INSTALL", 0);
        a = applicationLauncher$OnMyketFirstRunEvent$VersionChangeMode;
        ApplicationLauncher$OnMyketFirstRunEvent$VersionChangeMode applicationLauncher$OnMyketFirstRunEvent$VersionChangeMode2 = new ApplicationLauncher$OnMyketFirstRunEvent$VersionChangeMode("UPGRADE", 1);
        b = applicationLauncher$OnMyketFirstRunEvent$VersionChangeMode2;
        ApplicationLauncher$OnMyketFirstRunEvent$VersionChangeMode applicationLauncher$OnMyketFirstRunEvent$VersionChangeMode3 = new ApplicationLauncher$OnMyketFirstRunEvent$VersionChangeMode("DOWNGRADE", 2);
        c = applicationLauncher$OnMyketFirstRunEvent$VersionChangeMode3;
        ApplicationLauncher$OnMyketFirstRunEvent$VersionChangeMode applicationLauncher$OnMyketFirstRunEvent$VersionChangeMode4 = new ApplicationLauncher$OnMyketFirstRunEvent$VersionChangeMode("UNKNOWN", 3);
        d = applicationLauncher$OnMyketFirstRunEvent$VersionChangeMode4;
        e = new ApplicationLauncher$OnMyketFirstRunEvent$VersionChangeMode[]{applicationLauncher$OnMyketFirstRunEvent$VersionChangeMode, applicationLauncher$OnMyketFirstRunEvent$VersionChangeMode2, applicationLauncher$OnMyketFirstRunEvent$VersionChangeMode3, applicationLauncher$OnMyketFirstRunEvent$VersionChangeMode4};
    }

    public static ApplicationLauncher$OnMyketFirstRunEvent$VersionChangeMode valueOf(String str) {
        return (ApplicationLauncher$OnMyketFirstRunEvent$VersionChangeMode) Enum.valueOf(ApplicationLauncher$OnMyketFirstRunEvent$VersionChangeMode.class, str);
    }

    public static ApplicationLauncher$OnMyketFirstRunEvent$VersionChangeMode[] values() {
        return (ApplicationLauncher$OnMyketFirstRunEvent$VersionChangeMode[]) e.clone();
    }
}
