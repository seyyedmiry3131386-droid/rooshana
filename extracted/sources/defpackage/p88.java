package defpackage;

import ir.mservices.market.purchaseTransaction.data.PurchaseTransactionDTO;

/* JADX INFO: loaded from: classes.dex */
public final class p88 extends iv1 {
    public final float a;
    public final float b;
    public final int c;
    public final int d;

    public p88(float f, float f2, int i, int i2, int i3) {
        f2 = (i3 & 2) != 0 ? 4.0f : f2;
        i = (i3 & 4) != 0 ? 0 : i;
        i2 = (i3 & 8) != 0 ? 0 : i2;
        this.a = f;
        this.b = f2;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p88)) {
            return false;
        }
        p88 p88Var = (p88) obj;
        return this.a == p88Var.a && this.b == p88Var.b && this.c == p88Var.c && this.d == p88Var.d;
    }

    public final int hashCode() {
        return (((dw1.g(this.b, Float.floatToIntBits(this.a) * 31, 31) + this.c) * 31) + this.d) * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Stroke(width=");
        sb.append(this.a);
        sb.append(", miter=");
        sb.append(this.b);
        sb.append(", cap=");
        String str = PurchaseTransactionDTO.PURCHASE_STATUS_UNKNOWN;
        int i = this.c;
        sb.append((Object) (i == 0 ? "Butt" : i == 1 ? "Round" : i == 2 ? "Square" : PurchaseTransactionDTO.PURCHASE_STATUS_UNKNOWN));
        sb.append(", join=");
        int i2 = this.d;
        if (i2 == 0) {
            str = "Miter";
        } else if (i2 == 1) {
            str = "Round";
        } else if (i2 == 2) {
            str = "Bevel";
        }
        sb.append((Object) str);
        sb.append(", pathEffect=null)");
        return sb.toString();
    }
}
