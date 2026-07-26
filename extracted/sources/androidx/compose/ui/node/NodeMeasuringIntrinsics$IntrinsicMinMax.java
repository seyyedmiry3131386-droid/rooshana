package androidx.compose.ui.node;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
final class NodeMeasuringIntrinsics$IntrinsicMinMax {
    public static final NodeMeasuringIntrinsics$IntrinsicMinMax a;
    public static final NodeMeasuringIntrinsics$IntrinsicMinMax b;
    public static final /* synthetic */ NodeMeasuringIntrinsics$IntrinsicMinMax[] c;

    static {
        NodeMeasuringIntrinsics$IntrinsicMinMax nodeMeasuringIntrinsics$IntrinsicMinMax = new NodeMeasuringIntrinsics$IntrinsicMinMax("Min", 0);
        a = nodeMeasuringIntrinsics$IntrinsicMinMax;
        NodeMeasuringIntrinsics$IntrinsicMinMax nodeMeasuringIntrinsics$IntrinsicMinMax2 = new NodeMeasuringIntrinsics$IntrinsicMinMax("Max", 1);
        b = nodeMeasuringIntrinsics$IntrinsicMinMax2;
        NodeMeasuringIntrinsics$IntrinsicMinMax[] nodeMeasuringIntrinsics$IntrinsicMinMaxArr = {nodeMeasuringIntrinsics$IntrinsicMinMax, nodeMeasuringIntrinsics$IntrinsicMinMax2};
        c = nodeMeasuringIntrinsics$IntrinsicMinMaxArr;
        kotlin.enums.a.a(nodeMeasuringIntrinsics$IntrinsicMinMaxArr);
    }

    public static NodeMeasuringIntrinsics$IntrinsicMinMax valueOf(String str) {
        return (NodeMeasuringIntrinsics$IntrinsicMinMax) Enum.valueOf(NodeMeasuringIntrinsics$IntrinsicMinMax.class, str);
    }

    public static NodeMeasuringIntrinsics$IntrinsicMinMax[] values() {
        return (NodeMeasuringIntrinsics$IntrinsicMinMax[]) c.clone();
    }
}
