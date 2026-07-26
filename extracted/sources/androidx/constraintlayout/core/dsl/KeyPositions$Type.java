package androidx.constraintlayout.core.dsl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class KeyPositions$Type {
    public static final /* synthetic */ KeyPositions$Type[] a = {new KeyPositions$Type("CARTESIAN", 0), new KeyPositions$Type("SCREEN", 1), new KeyPositions$Type("PATH", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    KeyPositions$Type EF5;

    public static KeyPositions$Type valueOf(String str) {
        return (KeyPositions$Type) Enum.valueOf(KeyPositions$Type.class, str);
    }

    public static KeyPositions$Type[] values() {
        return (KeyPositions$Type[]) a.clone();
    }
}
