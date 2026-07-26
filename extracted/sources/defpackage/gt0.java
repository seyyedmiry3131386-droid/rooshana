package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gt0 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || gt0.class != obj.getClass()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.floatToIntBits(1.0f) + dw1.g(1.0f, dw1.g(1.0f, dw1.g(1.1f, Float.floatToIntBits(1.0f) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "ClickableSurfaceScale(scale=1.0, focusedScale=1.1,pressedScale=1.0, disabledScale=1.0, focusedDisabledScale=1.0)";
    }
}
