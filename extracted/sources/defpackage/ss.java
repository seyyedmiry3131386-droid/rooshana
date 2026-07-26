package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ss {
    public final String a;
    public final int b;

    public ss(String str, int i) {
        this.a = str;
        this.b = i;
        if (i != 1 && i != 2) {
            throw new IllegalArgumentException("Scope undefined.");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ss)) {
            return false;
        }
        ss ssVar = (ss) obj;
        return this.a.equals(ssVar.a) && this.b == ssVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return bl4.z(new StringBuilder("AppSetId: id="), this.a, ", scope=", this.b == 1 ? "SCOPE_APP" : "SCOPE_DEVELOPER");
    }
}
