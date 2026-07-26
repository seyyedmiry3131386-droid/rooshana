package ir.mservices.market.version2.manager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class AppManager$StartFlowResult {
    public static final AppManager$StartFlowResult a;
    public static final AppManager$StartFlowResult b;
    public static final AppManager$StartFlowResult c;
    public static final AppManager$StartFlowResult d;
    public static final /* synthetic */ AppManager$StartFlowResult[] e;

    static {
        AppManager$StartFlowResult appManager$StartFlowResult = new AppManager$StartFlowResult("DOWNLOAD_NOT_STARTED", 0);
        a = appManager$StartFlowResult;
        AppManager$StartFlowResult appManager$StartFlowResult2 = new AppManager$StartFlowResult("DOWNLOAD_STARTED", 1);
        b = appManager$StartFlowResult2;
        AppManager$StartFlowResult appManager$StartFlowResult3 = new AppManager$StartFlowResult("START_PURCHASE_FLOW", 2);
        c = appManager$StartFlowResult3;
        AppManager$StartFlowResult appManager$StartFlowResult4 = new AppManager$StartFlowResult("NOT_ENOUGH_SPACE", 3);
        d = appManager$StartFlowResult4;
        AppManager$StartFlowResult[] appManager$StartFlowResultArr = {appManager$StartFlowResult, appManager$StartFlowResult2, appManager$StartFlowResult3, appManager$StartFlowResult4};
        e = appManager$StartFlowResultArr;
        kotlin.enums.a.a(appManager$StartFlowResultArr);
    }

    public static AppManager$StartFlowResult valueOf(String str) {
        return (AppManager$StartFlowResult) Enum.valueOf(AppManager$StartFlowResult.class, str);
    }

    public static AppManager$StartFlowResult[] values() {
        return (AppManager$StartFlowResult[]) e.clone();
    }
}
