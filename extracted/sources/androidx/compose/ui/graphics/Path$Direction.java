package androidx.compose.ui.graphics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class Path$Direction {
    public static final /* synthetic */ Path$Direction[] a;

    static {
        Path$Direction[] path$DirectionArr = {new Path$Direction("CounterClockwise", 0), new Path$Direction("Clockwise", 1)};
        a = path$DirectionArr;
        kotlin.enums.a.a(path$DirectionArr);
    }

    public static Path$Direction valueOf(String str) {
        return (Path$Direction) Enum.valueOf(Path$Direction.class, str);
    }

    public static Path$Direction[] values() {
        return (Path$Direction[]) a.clone();
    }
}
