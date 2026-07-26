package defpackage;

import kotlin.a;

/* JADX INFO: loaded from: classes3.dex */
public final class q22 extends ug6 {
    public final ro7 l;
    public final c24 m;

    public q22(String str, int i) {
        super(str, null, i);
        this.l = ro7.b;
        this.m = a.a(new p22(i, str, this));
    }

    @Override // defpackage.ug6
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof no7)) {
            return false;
        }
        no7 no7Var = (no7) obj;
        return no7Var.getKind() == ro7.b && this.a.equals(no7Var.a()) && js3.i(yq2.M(this), yq2.M(no7Var));
    }

    @Override // defpackage.ug6, defpackage.no7
    public final o37 getKind() {
        return this.l;
    }

    @Override // defpackage.ug6, defpackage.no7
    public final no7 h(int i) {
        return ((no7[]) this.m.getValue())[i];
    }

    @Override // defpackage.ug6
    public final int hashCode() {
        int iHashCode = this.a.hashCode();
        w0 w0Var = new w0(this);
        int iHashCode2 = 1;
        while (w0Var.hasNext()) {
            int i = iHashCode2 * 31;
            String str = (String) w0Var.next();
            iHashCode2 = i + (str != null ? str.hashCode() : 0);
        }
        return (iHashCode * 31) + iHashCode2;
    }

    @Override // defpackage.ug6
    public final String toString() {
        return kotlin.collections.a.t0(new cw(4, this), ", ", this.a.concat("("), ")", null, 56);
    }
}
