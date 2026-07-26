package androidx.compose.foundation.layout;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class Direction {
    public static final Direction a;
    public static final Direction b;
    public static final Direction c;
    public static final /* synthetic */ Direction[] d;

    static {
        Direction direction = new Direction("Vertical", 0);
        a = direction;
        Direction direction2 = new Direction("Horizontal", 1);
        b = direction2;
        Direction direction3 = new Direction("Both", 2);
        c = direction3;
        Direction[] directionArr = {direction, direction2, direction3};
        d = directionArr;
        kotlin.enums.a.a(directionArr);
    }

    public static Direction valueOf(String str) {
        return (Direction) Enum.valueOf(Direction.class, str);
    }

    public static Direction[] values() {
        return (Direction[]) d.clone();
    }
}
