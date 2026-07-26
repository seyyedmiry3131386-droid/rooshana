package defpackage;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment;

/* JADX INFO: loaded from: classes3.dex */
public final class i80 extends bf0 {
    public final /* synthetic */ if0 a;
    public final /* synthetic */ BaseNewBottomDialogFragment b;

    public i80(if0 if0Var, BaseNewBottomDialogFragment baseNewBottomDialogFragment) {
        this.a = if0Var;
        this.b = baseNewBottomDialogFragment;
    }

    @Override // defpackage.bf0
    public final void c(int i, View view) {
        BottomSheetBehavior bottomSheetBehavior;
        if (i == 5) {
            this.a.dismiss();
        }
        if (i != 1 || (bottomSheetBehavior = this.b.d1) == null) {
            return;
        }
        bottomSheetBehavior.O(3);
    }

    @Override // defpackage.bf0
    public final void b(View view) {
    }
}
