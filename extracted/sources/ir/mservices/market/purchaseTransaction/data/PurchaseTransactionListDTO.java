package ir.mservices.market.purchaseTransaction.data;

import defpackage.bf5;
import defpackage.js3;
import defpackage.vo7;
import defpackage.yd1;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class PurchaseTransactionListDTO implements Serializable, bf5 {

    @vo7("eol")
    private final boolean eol;

    @vo7("transactions")
    private final List<PurchaseTransactionDTO> transactions;

    public PurchaseTransactionListDTO(List<PurchaseTransactionDTO> list, boolean z) {
        js3.p(list, "transactions");
        this.transactions = list;
        this.eol = z;
    }

    @Override // defpackage.bf5
    public boolean endOfList() {
        return this.eol;
    }

    public final boolean getEol() {
        return this.eol;
    }

    public final List<PurchaseTransactionDTO> getTransactions() {
        return this.transactions;
    }

    public /* synthetic */ PurchaseTransactionListDTO(List list, boolean z, int i, yd1 yd1Var) {
        this(list, (i & 2) != 0 ? false : z);
    }
}
