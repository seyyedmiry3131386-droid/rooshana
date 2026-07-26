package androidx.compose.ui.node;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
final class NodeMeasuringIntrinsics$IntrinsicWidthHeight {
    public static final NodeMeasuringIntrinsics$IntrinsicWidthHeight a;
    public static final NodeMeasuringIntrinsics$IntrinsicWidthHeight b;
    public static final /* synthetic */ NodeMeasuringIntrinsics$IntrinsicWidthHeight[] c;

    static {
        NodeMeasuringIntrinsics$IntrinsicWidthHeight nodeMeasuringIntrinsics$IntrinsicWidthHeight = new NodeMeasuringIntrinsics$IntrinsicWidthHeight("Width", 0);
        a = nodeMeasuringIntrinsics$IntrinsicWidthHeight;
        NodeMeasuringIntrinsics$IntrinsicWidthHeight nodeMeasuringIntrinsics$IntrinsicWidthHeight2 = new NodeMeasuringIntrinsics$IntrinsicWidthHeight("Height", 1);
        b = nodeMeasuringIntrinsics$IntrinsicWidthHeight2;
        NodeMeasuringIntrinsics$IntrinsicWidthHeight[] nodeMeasuringIntrinsics$IntrinsicWidthHeightArr = {nodeMeasuringIntrinsics$IntrinsicWidthHeight, nodeMeasuringIntrinsics$IntrinsicWidthHeight2};
        c = nodeMeasuringIntrinsics$IntrinsicWidthHeightArr;
        kotlin.enums.a.a(nodeMeasuringIntrinsics$IntrinsicWidthHeightArr);
    }

    public static NodeMeasuringIntrinsics$IntrinsicWidthHeight valueOf(String str) {
        return (NodeMeasuringIntrinsics$IntrinsicWidthHeight) Enum.valueOf(NodeMeasuringIntrinsics$IntrinsicWidthHeight.class, str);
    }

    public static NodeMeasuringIntrinsics$IntrinsicWidthHeight[] values() {
        return (NodeMeasuringIntrinsics$IntrinsicWidthHeight[]) c.clone();
    }
}
