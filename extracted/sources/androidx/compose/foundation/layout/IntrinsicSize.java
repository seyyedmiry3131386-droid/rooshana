package androidx.compose.foundation.layout;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class IntrinsicSize {
    public static final IntrinsicSize a;
    public static final IntrinsicSize b;
    public static final /* synthetic */ IntrinsicSize[] c;

    static {
        IntrinsicSize intrinsicSize = new IntrinsicSize("Min", 0);
        a = intrinsicSize;
        IntrinsicSize intrinsicSize2 = new IntrinsicSize("Max", 1);
        b = intrinsicSize2;
        IntrinsicSize[] intrinsicSizeArr = {intrinsicSize, intrinsicSize2};
        c = intrinsicSizeArr;
        kotlin.enums.a.a(intrinsicSizeArr);
    }

    public static IntrinsicSize valueOf(String str) {
        return (IntrinsicSize) Enum.valueOf(IntrinsicSize.class, str);
    }

    public static IntrinsicSize[] values() {
        return (IntrinsicSize[]) c.clone();
    }
}
