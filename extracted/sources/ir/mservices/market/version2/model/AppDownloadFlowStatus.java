package ir.mservices.market.version2.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class AppDownloadFlowStatus {
    public static final AppDownloadFlowStatus a;
    public static final AppDownloadFlowStatus b;
    public static final AppDownloadFlowStatus c;
    public static final AppDownloadFlowStatus d;
    public static final AppDownloadFlowStatus e;
    public static final AppDownloadFlowStatus f;
    public static final AppDownloadFlowStatus g;
    public static final /* synthetic */ AppDownloadFlowStatus[] h;

    static {
        AppDownloadFlowStatus appDownloadFlowStatus = new AppDownloadFlowStatus("INCOMPATIBLE", 0);
        a = appDownloadFlowStatus;
        AppDownloadFlowStatus appDownloadFlowStatus2 = new AppDownloadFlowStatus("DOWNLOAD_AVAILABLE", 1);
        b = appDownloadFlowStatus2;
        AppDownloadFlowStatus appDownloadFlowStatus3 = new AppDownloadFlowStatus("UPDATE_AVAILABLE", 2);
        c = appDownloadFlowStatus3;
        AppDownloadFlowStatus appDownloadFlowStatus4 = new AppDownloadFlowStatus("DOWNLOAD_IN_PROGRESS", 3);
        d = appDownloadFlowStatus4;
        AppDownloadFlowStatus appDownloadFlowStatus5 = new AppDownloadFlowStatus("INSTALLABLE", 4);
        e = appDownloadFlowStatus5;
        AppDownloadFlowStatus appDownloadFlowStatus6 = new AppDownloadFlowStatus("INSTALL_IN_PROGRESS", 5);
        f = appDownloadFlowStatus6;
        AppDownloadFlowStatus appDownloadFlowStatus7 = new AppDownloadFlowStatus("INSTALLED", 6);
        g = appDownloadFlowStatus7;
        h = new AppDownloadFlowStatus[]{appDownloadFlowStatus, appDownloadFlowStatus2, appDownloadFlowStatus3, appDownloadFlowStatus4, appDownloadFlowStatus5, appDownloadFlowStatus6, appDownloadFlowStatus7};
    }

    public static AppDownloadFlowStatus valueOf(String str) {
        return (AppDownloadFlowStatus) Enum.valueOf(AppDownloadFlowStatus.class, str);
    }

    public static AppDownloadFlowStatus[] values() {
        return (AppDownloadFlowStatus[]) h.clone();
    }
}
