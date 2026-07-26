package defpackage;

import ir.mservices.market.purchaseTransaction.data.PurchaseTransactionDTO;

/* JADX INFO: loaded from: classes.dex */
public final class yh3 {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof yh3) {
            return this.a == ((yh3) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        int i = this.a;
        return i == 0 ? "Argb8888" : i == 1 ? "Alpha8" : i == 2 ? "Rgb565" : i == 3 ? "F16" : i == 4 ? "Gpu" : PurchaseTransactionDTO.PURCHASE_STATUS_UNKNOWN;
    }
}
