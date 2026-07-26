package coil3.size;

import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class Scale {
    public static final Scale a;
    public static final Scale b;
    public static final /* synthetic */ Scale[] c;

    static {
        Scale scale = new Scale("FILL", 0);
        a = scale;
        Scale scale2 = new Scale("FIT", 1);
        b = scale2;
        Scale[] scaleArr = {scale, scale2};
        c = scaleArr;
        a.a(scaleArr);
    }

    public static Scale valueOf(String str) {
        return (Scale) Enum.valueOf(Scale.class, str);
    }

    public static Scale[] values() {
        return (Scale[]) c.clone();
    }
}
