package androidx.paging;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ActiveFlowTracker$FlowType {
    public static final /* synthetic */ ActiveFlowTracker$FlowType[] a;

    static {
        ActiveFlowTracker$FlowType[] activeFlowTracker$FlowTypeArr = {new ActiveFlowTracker$FlowType("PAGED_DATA_FLOW", 0), new ActiveFlowTracker$FlowType("PAGE_EVENT_FLOW", 1)};
        a = activeFlowTracker$FlowTypeArr;
        kotlin.enums.a.a(activeFlowTracker$FlowTypeArr);
    }

    public static ActiveFlowTracker$FlowType valueOf(String str) {
        return (ActiveFlowTracker$FlowType) Enum.valueOf(ActiveFlowTracker$FlowType.class, str);
    }

    public static ActiveFlowTracker$FlowType[] values() {
        return (ActiveFlowTracker$FlowType[]) a.clone();
    }
}
