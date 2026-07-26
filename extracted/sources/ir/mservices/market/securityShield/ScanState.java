package ir.mservices.market.securityShield;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ScanState {
    public static final ScanState a;
    public static final ScanState b;
    public static final ScanState c;
    public static final /* synthetic */ ScanState[] d;

    static {
        ScanState scanState = new ScanState("SCANNING", 0);
        a = scanState;
        ScanState scanState2 = new ScanState("SAFE", 1);
        b = scanState2;
        ScanState scanState3 = new ScanState("HARMFUL", 2);
        c = scanState3;
        ScanState[] scanStateArr = {scanState, scanState2, scanState3};
        d = scanStateArr;
        kotlin.enums.a.a(scanStateArr);
    }

    public static ScanState valueOf(String str) {
        return (ScanState) Enum.valueOf(ScanState.class, str);
    }

    public static ScanState[] values() {
        return (ScanState[]) d.clone();
    }
}
