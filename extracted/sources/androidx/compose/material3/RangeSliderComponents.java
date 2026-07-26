package androidx.compose.material3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
final class RangeSliderComponents {
    public static final /* synthetic */ RangeSliderComponents[] a;

    static {
        RangeSliderComponents[] rangeSliderComponentsArr = {new RangeSliderComponents("ENDTHUMB", 0), new RangeSliderComponents("STARTTHUMB", 1), new RangeSliderComponents("TRACK", 2)};
        a = rangeSliderComponentsArr;
        kotlin.enums.a.a(rangeSliderComponentsArr);
    }

    public static RangeSliderComponents valueOf(String str) {
        return (RangeSliderComponents) Enum.valueOf(RangeSliderComponents.class, str);
    }

    public static RangeSliderComponents[] values() {
        return (RangeSliderComponents[]) a.clone();
    }
}
