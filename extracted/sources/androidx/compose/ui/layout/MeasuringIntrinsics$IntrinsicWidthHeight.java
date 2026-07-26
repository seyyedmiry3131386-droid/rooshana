package androidx.compose.ui.layout;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
final class MeasuringIntrinsics$IntrinsicWidthHeight {
    public static final MeasuringIntrinsics$IntrinsicWidthHeight a;
    public static final MeasuringIntrinsics$IntrinsicWidthHeight b;
    public static final /* synthetic */ MeasuringIntrinsics$IntrinsicWidthHeight[] c;

    static {
        MeasuringIntrinsics$IntrinsicWidthHeight measuringIntrinsics$IntrinsicWidthHeight = new MeasuringIntrinsics$IntrinsicWidthHeight("Width", 0);
        a = measuringIntrinsics$IntrinsicWidthHeight;
        MeasuringIntrinsics$IntrinsicWidthHeight measuringIntrinsics$IntrinsicWidthHeight2 = new MeasuringIntrinsics$IntrinsicWidthHeight("Height", 1);
        b = measuringIntrinsics$IntrinsicWidthHeight2;
        MeasuringIntrinsics$IntrinsicWidthHeight[] measuringIntrinsics$IntrinsicWidthHeightArr = {measuringIntrinsics$IntrinsicWidthHeight, measuringIntrinsics$IntrinsicWidthHeight2};
        c = measuringIntrinsics$IntrinsicWidthHeightArr;
        kotlin.enums.a.a(measuringIntrinsics$IntrinsicWidthHeightArr);
    }

    public static MeasuringIntrinsics$IntrinsicWidthHeight valueOf(String str) {
        return (MeasuringIntrinsics$IntrinsicWidthHeight) Enum.valueOf(MeasuringIntrinsics$IntrinsicWidthHeight.class, str);
    }

    public static MeasuringIntrinsics$IntrinsicWidthHeight[] values() {
        return (MeasuringIntrinsics$IntrinsicWidthHeight[]) c.clone();
    }
}
