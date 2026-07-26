package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class m97 {
    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof m97);
    }

    public final int hashCode() {
        return Float.floatToIntBits(0.1f) + dw1.g(0.08f, dw1.g(0.1f, Float.floatToIntBits(0.16f) * 31, 31), 31);
    }

    public final String toString() {
        return "RippleAlpha(draggedAlpha=0.16, focusedAlpha=0.1, hoveredAlpha=0.08, pressedAlpha=0.1)";
    }
}
