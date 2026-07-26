package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ge0 {
    public og a = null;
    public ue b = null;
    public vm0 c = null;
    public eh d = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ge0)) {
            return false;
        }
        ge0 ge0Var = (ge0) obj;
        return js3.i(this.a, ge0Var.a) && js3.i(this.b, ge0Var.b) && js3.i(this.c, ge0Var.c) && js3.i(this.d, ge0Var.d);
    }

    public final int hashCode() {
        og ogVar = this.a;
        int iHashCode = (ogVar == null ? 0 : ogVar.hashCode()) * 31;
        ue ueVar = this.b;
        int iHashCode2 = (iHashCode + (ueVar == null ? 0 : ueVar.hashCode())) * 31;
        vm0 vm0Var = this.c;
        int iHashCode3 = (iHashCode2 + (vm0Var == null ? 0 : vm0Var.hashCode())) * 31;
        eh ehVar = this.d;
        return iHashCode3 + (ehVar != null ? ehVar.hashCode() : 0);
    }

    public final String toString() {
        return "BorderCache(imageBitmap=" + this.a + ", canvas=" + this.b + ", canvasDrawScope=" + this.c + ", borderPath=" + this.d + ')';
    }
}
