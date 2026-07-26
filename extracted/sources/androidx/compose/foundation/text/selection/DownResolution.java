package androidx.compose.foundation.text.selection;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
final class DownResolution {
    public static final DownResolution a;
    public static final DownResolution b;
    public static final DownResolution c;
    public static final DownResolution d;
    public static final /* synthetic */ DownResolution[] e;

    static {
        DownResolution downResolution = new DownResolution("Up", 0);
        a = downResolution;
        DownResolution downResolution2 = new DownResolution("Drag", 1);
        b = downResolution2;
        DownResolution downResolution3 = new DownResolution("Timeout", 2);
        c = downResolution3;
        DownResolution downResolution4 = new DownResolution("Cancel", 3);
        d = downResolution4;
        DownResolution[] downResolutionArr = {downResolution, downResolution2, downResolution3, downResolution4};
        e = downResolutionArr;
        kotlin.enums.a.a(downResolutionArr);
    }

    public static DownResolution valueOf(String str) {
        return (DownResolution) Enum.valueOf(DownResolution.class, str);
    }

    public static DownResolution[] values() {
        return (DownResolution[]) e.clone();
    }
}
