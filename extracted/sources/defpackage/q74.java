package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class q74 extends r74 {
    public final String a;
    public final ui8 b;

    public q74(String str, ui8 ui8Var) {
        this.a = str;
        this.b = ui8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q74)) {
            return false;
        }
        q74 q74Var = (q74) obj;
        return js3.i(this.a, q74Var.a) && js3.i(this.b, q74Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        ui8 ui8Var = this.b;
        return (iHashCode + (ui8Var != null ? ui8Var.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return bl4.y(new StringBuilder("LinkAnnotation.Url(url="), this.a, ')');
    }
}
