package androidx.compose.ui.layout;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
final class MeasuringIntrinsics$IntrinsicMinMax {
    public static final MeasuringIntrinsics$IntrinsicMinMax a;
    public static final MeasuringIntrinsics$IntrinsicMinMax b;
    public static final /* synthetic */ MeasuringIntrinsics$IntrinsicMinMax[] c;

    static {
        MeasuringIntrinsics$IntrinsicMinMax measuringIntrinsics$IntrinsicMinMax = new MeasuringIntrinsics$IntrinsicMinMax("Min", 0);
        a = measuringIntrinsics$IntrinsicMinMax;
        MeasuringIntrinsics$IntrinsicMinMax measuringIntrinsics$IntrinsicMinMax2 = new MeasuringIntrinsics$IntrinsicMinMax("Max", 1);
        b = measuringIntrinsics$IntrinsicMinMax2;
        MeasuringIntrinsics$IntrinsicMinMax[] measuringIntrinsics$IntrinsicMinMaxArr = {measuringIntrinsics$IntrinsicMinMax, measuringIntrinsics$IntrinsicMinMax2};
        c = measuringIntrinsics$IntrinsicMinMaxArr;
        kotlin.enums.a.a(measuringIntrinsics$IntrinsicMinMaxArr);
    }

    public static MeasuringIntrinsics$IntrinsicMinMax valueOf(String str) {
        return (MeasuringIntrinsics$IntrinsicMinMax) Enum.valueOf(MeasuringIntrinsics$IntrinsicMinMax.class, str);
    }

    public static MeasuringIntrinsics$IntrinsicMinMax[] values() {
        return (MeasuringIntrinsics$IntrinsicMinMax[]) c.clone();
    }
}
