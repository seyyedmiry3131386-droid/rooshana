package androidx.compose.foundation.layout;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class FlowLayoutOverflow$OverflowType {
    public static final FlowLayoutOverflow$OverflowType a;
    public static final /* synthetic */ FlowLayoutOverflow$OverflowType[] b;

    static {
        FlowLayoutOverflow$OverflowType flowLayoutOverflow$OverflowType = new FlowLayoutOverflow$OverflowType("Visible", 0);
        FlowLayoutOverflow$OverflowType flowLayoutOverflow$OverflowType2 = new FlowLayoutOverflow$OverflowType("Clip", 1);
        a = flowLayoutOverflow$OverflowType2;
        FlowLayoutOverflow$OverflowType[] flowLayoutOverflow$OverflowTypeArr = {flowLayoutOverflow$OverflowType, flowLayoutOverflow$OverflowType2, new FlowLayoutOverflow$OverflowType("ExpandIndicator", 2), new FlowLayoutOverflow$OverflowType("ExpandOrCollapseIndicator", 3)};
        b = flowLayoutOverflow$OverflowTypeArr;
        kotlin.enums.a.a(flowLayoutOverflow$OverflowTypeArr);
    }

    public static FlowLayoutOverflow$OverflowType valueOf(String str) {
        return (FlowLayoutOverflow$OverflowType) Enum.valueOf(FlowLayoutOverflow$OverflowType.class, str);
    }

    public static FlowLayoutOverflow$OverflowType[] values() {
        return (FlowLayoutOverflow$OverflowType[]) b.clone();
    }
}
