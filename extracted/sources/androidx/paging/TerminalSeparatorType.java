package androidx.paging;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class TerminalSeparatorType {
    public static final TerminalSeparatorType a;
    public static final /* synthetic */ TerminalSeparatorType[] b;

    static {
        TerminalSeparatorType terminalSeparatorType = new TerminalSeparatorType("FULLY_COMPLETE", 0);
        a = terminalSeparatorType;
        TerminalSeparatorType[] terminalSeparatorTypeArr = {terminalSeparatorType, new TerminalSeparatorType("SOURCE_COMPLETE", 1)};
        b = terminalSeparatorTypeArr;
        kotlin.enums.a.a(terminalSeparatorTypeArr);
    }

    public static TerminalSeparatorType valueOf(String str) {
        return (TerminalSeparatorType) Enum.valueOf(TerminalSeparatorType.class, str);
    }

    public static TerminalSeparatorType[] values() {
        return (TerminalSeparatorType[]) b.clone();
    }
}
