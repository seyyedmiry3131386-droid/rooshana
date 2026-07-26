package defpackage;

import ir.mservices.market.purchaseTransaction.data.PurchaseTransactionDTO;

/* JADX INFO: loaded from: classes.dex */
public final class hh6 {
    public final int a;

    public static String a(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? PurchaseTransactionDTO.PURCHASE_STATUS_UNKNOWN : "Eraser" : "Stylus" : "Mouse" : "Touch";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hh6) {
            return this.a == ((hh6) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return a(this.a);
    }
}
