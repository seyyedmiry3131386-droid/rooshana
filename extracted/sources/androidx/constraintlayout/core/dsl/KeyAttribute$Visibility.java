package androidx.constraintlayout.core.dsl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class KeyAttribute$Visibility {
    public static final /* synthetic */ KeyAttribute$Visibility[] a = {new KeyAttribute$Visibility("VISIBLE", 0), new KeyAttribute$Visibility("INVISIBLE", 1), new KeyAttribute$Visibility("GONE", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    KeyAttribute$Visibility EF5;

    public static KeyAttribute$Visibility valueOf(String str) {
        return (KeyAttribute$Visibility) Enum.valueOf(KeyAttribute$Visibility.class, str);
    }

    public static KeyAttribute$Visibility[] values() {
        return (KeyAttribute$Visibility[]) a.clone();
    }
}
