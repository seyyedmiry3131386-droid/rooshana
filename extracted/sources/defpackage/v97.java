package defpackage;

import ir.mservices.market.purchaseTransaction.data.PurchaseTransactionDTO;

/* JADX INFO: loaded from: classes.dex */
public final class v97 {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof v97) {
            return this.a == ((v97) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        int i = this.a;
        return i == 0 ? "Button" : i == 1 ? "Checkbox" : i == 2 ? "Switch" : i == 3 ? "RadioButton" : i == 4 ? "Tab" : i == 5 ? "Image" : i == 6 ? "DropdownList" : i == 7 ? "Picker" : i == 8 ? "Carousel" : PurchaseTransactionDTO.PURCHASE_STATUS_UNKNOWN;
    }
}
