package defpackage;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.view.KeyEvent;
import ir.mservices.market.login.ui.BaseLoginDialogFragment;
import ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment;
import ir.mservices.market.version2.fragments.dialog.DialogResult;
import ir.mservices.market.version2.fragments.dialog.KidsModeDeActiveBottomDialogFragment;

/* JADX INFO: loaded from: classes3.dex */
public final class u70 implements DialogInterface.OnKeyListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ BaseNewBottomDialogFragment b;

    public /* synthetic */ u70(BaseNewBottomDialogFragment baseNewBottomDialogFragment, int i) {
        this.a = i;
        this.b = baseNewBottomDialogFragment;
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        switch (this.a) {
            case 0:
                BaseLoginDialogFragment baseLoginDialogFragment = (BaseLoginDialogFragment) this.b;
                js3.p(dialogInterface, "dialog");
                js3.p(keyEvent, "event");
                if (i != 4 || keyEvent.getAction() != 1) {
                    return false;
                }
                if (!baseLoginDialogFragment.Y0()) {
                    return true;
                }
                baseLoginDialogFragment.R0(DialogResult.b, new Bundle());
                return true;
            default:
                KidsModeDeActiveBottomDialogFragment kidsModeDeActiveBottomDialogFragment = (KidsModeDeActiveBottomDialogFragment) this.b;
                js3.p(dialogInterface, "dialog");
                js3.p(keyEvent, "event");
                if (i != 67 || keyEvent.getAction() != 1) {
                    return false;
                }
                jz3 jz3Var = kidsModeDeActiveBottomDialogFragment.i1;
                js3.m(jz3Var);
                Editable text = jz3Var.B.getText();
                if (text == null || f88.n0(text)) {
                    jz3 jz3Var2 = kidsModeDeActiveBottomDialogFragment.i1;
                    js3.m(jz3Var2);
                    Editable text2 = jz3Var2.x.getText();
                    if (text2 == null || f88.n0(text2)) {
                        jz3 jz3Var3 = kidsModeDeActiveBottomDialogFragment.i1;
                        js3.m(jz3Var3);
                        jz3Var3.x.requestFocus();
                    } else {
                        jz3 jz3Var4 = kidsModeDeActiveBottomDialogFragment.i1;
                        js3.m(jz3Var4);
                        jz3Var4.x.setText("");
                        jz3 jz3Var5 = kidsModeDeActiveBottomDialogFragment.i1;
                        js3.m(jz3Var5);
                        jz3Var5.x.requestFocus();
                        jz3 jz3Var6 = kidsModeDeActiveBottomDialogFragment.i1;
                        js3.m(jz3Var6);
                        jz3Var6.v.setCommitButtonEnable(false, sj8.b().d);
                    }
                } else {
                    jz3 jz3Var7 = kidsModeDeActiveBottomDialogFragment.i1;
                    js3.m(jz3Var7);
                    jz3Var7.B.setText("");
                    jz3 jz3Var8 = kidsModeDeActiveBottomDialogFragment.i1;
                    js3.m(jz3Var8);
                    jz3Var8.B.requestFocus();
                    jz3 jz3Var9 = kidsModeDeActiveBottomDialogFragment.i1;
                    js3.m(jz3Var9);
                    jz3Var9.v.setCommitButtonEnable(false, sj8.b().d);
                }
                return true;
        }
    }
}
