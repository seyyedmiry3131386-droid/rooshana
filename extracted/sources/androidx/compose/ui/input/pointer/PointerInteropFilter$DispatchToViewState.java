package androidx.compose.ui.input.pointer;

import ir.mservices.market.purchaseTransaction.data.PurchaseTransactionDTO;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
final class PointerInteropFilter$DispatchToViewState {
    public static final PointerInteropFilter$DispatchToViewState a;
    public static final PointerInteropFilter$DispatchToViewState b;
    public static final PointerInteropFilter$DispatchToViewState c;
    public static final /* synthetic */ PointerInteropFilter$DispatchToViewState[] d;

    static {
        PointerInteropFilter$DispatchToViewState pointerInteropFilter$DispatchToViewState = new PointerInteropFilter$DispatchToViewState(PurchaseTransactionDTO.PURCHASE_STATUS_UNKNOWN, 0);
        a = pointerInteropFilter$DispatchToViewState;
        PointerInteropFilter$DispatchToViewState pointerInteropFilter$DispatchToViewState2 = new PointerInteropFilter$DispatchToViewState("Dispatching", 1);
        b = pointerInteropFilter$DispatchToViewState2;
        PointerInteropFilter$DispatchToViewState pointerInteropFilter$DispatchToViewState3 = new PointerInteropFilter$DispatchToViewState("NotDispatching", 2);
        c = pointerInteropFilter$DispatchToViewState3;
        PointerInteropFilter$DispatchToViewState[] pointerInteropFilter$DispatchToViewStateArr = {pointerInteropFilter$DispatchToViewState, pointerInteropFilter$DispatchToViewState2, pointerInteropFilter$DispatchToViewState3};
        d = pointerInteropFilter$DispatchToViewStateArr;
        kotlin.enums.a.a(pointerInteropFilter$DispatchToViewStateArr);
    }

    public static PointerInteropFilter$DispatchToViewState valueOf(String str) {
        return (PointerInteropFilter$DispatchToViewState) Enum.valueOf(PointerInteropFilter$DispatchToViewState.class, str);
    }

    public static PointerInteropFilter$DispatchToViewState[] values() {
        return (PointerInteropFilter$DispatchToViewState[]) d.clone();
    }
}
