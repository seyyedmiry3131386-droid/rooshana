package kotlinx.coroutines.channels;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class TickerMode {
    public static final /* synthetic */ TickerMode[] a;

    static {
        TickerMode[] tickerModeArr = {new TickerMode("FIXED_PERIOD", 0), new TickerMode("FIXED_DELAY", 1)};
        a = tickerModeArr;
        kotlin.enums.a.a(tickerModeArr);
    }

    public static TickerMode valueOf(String str) {
        return (TickerMode) Enum.valueOf(TickerMode.class, str);
    }

    public static TickerMode[] values() {
        return (TickerMode[]) a.clone();
    }
}
