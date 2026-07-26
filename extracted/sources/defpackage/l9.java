package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class l9 implements n9 {
    public final boolean a;

    public l9(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l9) && this.a == ((l9) obj).a;
    }

    public final int hashCode() {
        return this.a ? 1231 : 1237;
    }

    public final String toString() {
        return bl4.x("SetAdPlayerIsErrorOccurred(isErrorOccurred=", ")", this.a);
    }
}
