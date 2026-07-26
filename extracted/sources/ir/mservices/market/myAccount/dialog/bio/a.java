package ir.mservices.market.myAccount.dialog.bio;

import androidx.fragment.app.FragmentActivity;
import defpackage.h4;
import defpackage.js3;
import defpackage.lw8;
import defpackage.rm1;
import ir.mservices.market.myAccount.dialog.bio.BioAction;
import ir.mservices.market.views.DialogButtonComponent;
import ir.mservices.market.views.MyketProgressState;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements rm1 {
    public final /* synthetic */ DialogButtonComponent a;
    public final /* synthetic */ BioBottomDialogFragment b;

    public a(DialogButtonComponent dialogButtonComponent, BioBottomDialogFragment bioBottomDialogFragment) {
        this.a = dialogButtonComponent;
        this.b = bioBottomDialogFragment;
    }

    @Override // defpackage.rm1
    public final void onCancel() {
    }

    @Override // defpackage.rm1
    public final void onCommit() {
        this.a.setStateCommit(MyketProgressState.c);
        BioBottomDialogFragment bioBottomDialogFragment = this.b;
        bioBottomDialogFragment.P0();
        FragmentActivity fragmentActivityF = bioBottomDialogFragment.F();
        lw8.a(fragmentActivityF != null ? fragmentActivityF.getCurrentFocus() : null);
        h4 h4Var = bioBottomDialogFragment.h1;
        js3.m(h4Var);
        String string = h4Var.x.getEditableText().toString();
        ((BioDialogViewModel) bioBottomDialogFragment.j1.getValue()).r(string.length() == 0 ? BioAction.DeleteBioAction.INSTANCE : new BioAction.UpdateBioAction(string));
    }
}
