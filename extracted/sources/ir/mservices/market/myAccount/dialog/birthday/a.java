package ir.mservices.market.myAccount.dialog.birthday;

import defpackage.js3;
import defpackage.rm1;
import defpackage.rs6;
import defpackage.zb0;
import ir.mservices.market.myAccount.dialog.birthday.BirthDayAction;
import ir.mservices.market.views.MyketProgressState;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements rm1 {
    public final /* synthetic */ BirthdayBottomDialogFragment a;

    public a(BirthdayBottomDialogFragment birthdayBottomDialogFragment) {
        this.a = birthdayBottomDialogFragment;
    }

    @Override // defpackage.rm1
    public final void onCancel() {
    }

    @Override // defpackage.rm1
    public final void onCommit() {
        MyketProgressState myketProgressState = MyketProgressState.c;
        BirthdayBottomDialogFragment birthdayBottomDialogFragment = this.a;
        birthdayBottomDialogFragment.V0(myketProgressState);
        zb0 zb0Var = birthdayBottomDialogFragment.h1;
        js3.m(zb0Var);
        String date = zb0Var.v.getDate();
        if (date != null) {
            ((BirthdayDialogViewModel) birthdayBottomDialogFragment.j1.getValue()).r(new BirthDayAction.UpdateBirthdayAction(date));
            zb0 zb0Var2 = birthdayBottomDialogFragment.h1;
            js3.m(zb0Var2);
            zb0Var2.y.setVisibility(4);
            return;
        }
        zb0 zb0Var3 = birthdayBottomDialogFragment.h1;
        js3.m(zb0Var3);
        MyketTextView myketTextView = zb0Var3.y;
        js3.m(myketTextView);
        myketTextView.setVisibility(0);
        myketTextView.setText(myketTextView.getResources().getString(rs6.birthday_select_wrong_date_error_message));
        birthdayBottomDialogFragment.V0(MyketProgressState.b);
    }
}
