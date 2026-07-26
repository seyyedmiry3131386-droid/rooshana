package androidx.constraintlayout.core.dsl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class KeyCycles$Wave {
    public static final /* synthetic */ KeyCycles$Wave[] a = {new KeyCycles$Wave("SIN", 0), new KeyCycles$Wave("SQUARE", 1), new KeyCycles$Wave("TRIANGLE", 2), new KeyCycles$Wave("SAW", 3), new KeyCycles$Wave("REVERSE_SAW", 4), new KeyCycles$Wave("COS", 5)};

    /* JADX INFO: Fake field, exist only in values array */
    KeyCycles$Wave EF5;

    public static KeyCycles$Wave valueOf(String str) {
        return (KeyCycles$Wave) Enum.valueOf(KeyCycles$Wave.class, str);
    }

    public static KeyCycles$Wave[] values() {
        return (KeyCycles$Wave[]) a.clone();
    }
}
