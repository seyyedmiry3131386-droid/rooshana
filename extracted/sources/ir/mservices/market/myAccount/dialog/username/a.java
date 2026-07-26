package ir.mservices.market.myAccount.dialog.username;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import defpackage.bt2;
import defpackage.c29;
import defpackage.f88;
import defpackage.j5;
import defpackage.js3;
import defpackage.lw8;
import defpackage.rm1;
import defpackage.rs6;
import defpackage.sj8;
import defpackage.y97;
import ir.mservices.market.myAccount.dialog.username.UsernameAction;
import ir.mservices.market.views.MyketProgressState;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements rm1 {
    public final /* synthetic */ UsernameBottomDialogFragment a;

    public a(UsernameBottomDialogFragment usernameBottomDialogFragment) {
        this.a = usernameBottomDialogFragment;
    }

    @Override // defpackage.rm1
    public final void onCancel() {
    }

    @Override // defpackage.rm1
    public final void onCommit() {
        UsernameBottomDialogFragment usernameBottomDialogFragment = this.a;
        usernameBottomDialogFragment.P0();
        lw8.b(usernameBottomDialogFragment.F());
        j5 j5Var = usernameBottomDialogFragment.j1;
        js3.m(j5Var);
        String string = j5Var.C.getEditableText().toString();
        if (f88.n0(string)) {
            j5 j5Var2 = usernameBottomDialogFragment.j1;
            js3.m(j5Var2);
            j5Var2.z.getBackground().setColorFilter(new PorterDuffColorFilter(sj8.b().A, PorterDuff.Mode.MULTIPLY));
            j5 j5Var3 = usernameBottomDialogFragment.j1;
            js3.m(j5Var3);
            MyketTextView myketTextView = j5Var3.y;
            myketTextView.setVisibility(0);
            myketTextView.setText(usernameBottomDialogFragment.L(rs6.link_state_title_length_error));
            return;
        }
        MyketProgressState myketProgressState = MyketProgressState.c;
        j5 j5Var4 = usernameBottomDialogFragment.j1;
        js3.m(j5Var4);
        j5Var4.v.setStateCommit(myketProgressState);
        if (js3.i(((c29) usernameBottomDialogFragment.i1.getValue()).b, string)) {
            usernameBottomDialogFragment.V0();
            return;
        }
        UsernameDialogViewModel usernameDialogViewModel = (UsernameDialogViewModel) usernameBottomDialogFragment.k1.getValue();
        bt2.G(y97.G(usernameDialogViewModel), null, null, new UsernameDialogViewModel$onUploadUsernameAction$1(usernameDialogViewModel, new UsernameAction.UpdateUsernameAction(string), null), 3);
    }
}
