package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class mp3 extends yq2 {
    public final int g;

    public mp3(int i) {
        this.g = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mp3) && this.g == ((mp3) obj).g;
    }

    public final int hashCode() {
        return this.g;
    }

    public final String toString() {
        return bl4.q(this.g, "Failed(status=", ")");
    }
}
