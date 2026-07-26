package ir.mservices.market.purchaseTransaction.recycler;

import defpackage.g32;
import defpackage.is3;
import defpackage.js3;
import defpackage.js6;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.purchaseTransaction.data.PurchaseTransactionDTO;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class PurchaseTransactionData implements MyketRecyclerData, Serializable, g32 {
    public static final int c = js6.purchase_transaction_item;
    public final PurchaseTransactionDTO a;
    public final String b;

    public PurchaseTransactionData(PurchaseTransactionDTO purchaseTransactionDTO) {
        js3.p(purchaseTransactionDTO, "purchaseTransactionDTO");
        this.a = purchaseTransactionDTO;
        long j = is3.p + 1;
        is3.p = j;
        this.b = String.valueOf(j);
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return c;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!PurchaseTransactionData.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        js3.n(obj, "null cannot be cast to non-null type ir.mservices.market.purchaseTransaction.recycler.PurchaseTransactionData");
        PurchaseTransactionData purchaseTransactionData = (PurchaseTransactionData) obj;
        return js3.i(this.a, purchaseTransactionData.a) && js3.i(this.b, purchaseTransactionData.b);
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return this.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
