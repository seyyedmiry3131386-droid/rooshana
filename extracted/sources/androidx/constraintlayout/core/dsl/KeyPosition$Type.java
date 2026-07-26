package androidx.constraintlayout.core.dsl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class KeyPosition$Type {
    public static final /* synthetic */ KeyPosition$Type[] a = {new KeyPosition$Type("CARTESIAN", 0), new KeyPosition$Type("SCREEN", 1), new KeyPosition$Type("PATH", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    KeyPosition$Type EF5;

    public static KeyPosition$Type valueOf(String str) {
        return (KeyPosition$Type) Enum.valueOf(KeyPosition$Type.class, str);
    }

    public static KeyPosition$Type[] values() {
        return (KeyPosition$Type[]) a.clone();
    }
}
