package androidx.compose.material3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
final class SliderComponents {
    public static final /* synthetic */ SliderComponents[] a;

    static {
        SliderComponents[] sliderComponentsArr = {new SliderComponents("THUMB", 0), new SliderComponents("TRACK", 1)};
        a = sliderComponentsArr;
        kotlin.enums.a.a(sliderComponentsArr);
    }

    public static SliderComponents valueOf(String str) {
        return (SliderComponents) Enum.valueOf(SliderComponents.class, str);
    }

    public static SliderComponents[] values() {
        return (SliderComponents[]) a.clone();
    }
}
