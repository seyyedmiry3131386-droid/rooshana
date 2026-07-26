package androidx.compose.foundation.text.selection;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class Direction {
    public static final /* synthetic */ Direction[] a;

    static {
        Direction[] directionArr = {new Direction("BEFORE", 0), new Direction("ON", 1), new Direction("AFTER", 2)};
        a = directionArr;
        kotlin.enums.a.a(directionArr);
    }

    public static Direction valueOf(String str) {
        return (Direction) Enum.valueOf(Direction.class, str);
    }

    public static Direction[] values() {
        return (Direction[]) a.clone();
    }
}
