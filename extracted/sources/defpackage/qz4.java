package defpackage;

import ir.myket.player.domain.models.AdType;

/* JADX INFO: loaded from: classes3.dex */
public final class qz4 {
    public final int a;
    public final AdType b;
    public final q8 c;
    public final t9 d;
    public final db e;
    public final i8 f;
    public final wa g;

    public qz4(int i, AdType adType, q8 q8Var, t9 t9Var, db dbVar, i8 i8Var, wa waVar) {
        this.a = i;
        this.b = adType;
        this.c = q8Var;
        this.d = t9Var;
        this.e = dbVar;
        this.f = i8Var;
        this.g = waVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qz4)) {
            return false;
        }
        qz4 qz4Var = (qz4) obj;
        return this.a == qz4Var.a && this.b == qz4Var.b && js3.i(this.c, qz4Var.c) && js3.i(this.d, qz4Var.d) && js3.i(this.e, qz4Var.e) && js3.i(this.f, qz4Var.f) && js3.i(this.g, qz4Var.g);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a * 31)) * 31)) * 31;
        t9 t9Var = this.d;
        int iHashCode2 = (iHashCode + (t9Var == null ? 0 : t9Var.hashCode())) * 31;
        db dbVar = this.e;
        int iHashCode3 = (iHashCode2 + (dbVar == null ? 0 : dbVar.hashCode())) * 31;
        i8 i8Var = this.f;
        int iHashCode4 = (iHashCode3 + (i8Var == null ? 0 : i8Var.hashCode())) * 31;
        wa waVar = this.g;
        return iHashCode4 + (waVar != null ? waVar.hashCode() : 0);
    }

    public final String toString() {
        return "MovieAd(sequenceNumber=" + this.a + ", type=" + this.b + ", content=" + this.c + ", endCard=" + this.d + ", progressBarConfig=" + this.e + ", appInfo=" + this.f + ", linkInfo=" + this.g + ")";
    }
}
