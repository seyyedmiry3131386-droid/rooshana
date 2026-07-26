package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import ir.mservices.market.version2.fragments.dialog.KidsModeDeActiveBottomDialogFragment;
import ir.mservices.market.views.DialogButtonComponent;

/* JADX INFO: loaded from: classes3.dex */
public final class gz3 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ KidsModeDeActiveBottomDialogFragment b;

    public /* synthetic */ gz3(KidsModeDeActiveBottomDialogFragment kidsModeDeActiveBottomDialogFragment, int i) {
        this.a = i;
        this.b = kidsModeDeActiveBottomDialogFragment;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.a) {
            case 0:
                KidsModeDeActiveBottomDialogFragment kidsModeDeActiveBottomDialogFragment = this.b;
                js3.p(editable, "s");
                try {
                    if (editable.length() != 1) {
                        if (editable.length() > 1) {
                            throw new IllegalStateException("Text is not an Integer.");
                        }
                        return;
                    }
                    Integer.parseInt(editable.toString());
                    jz3 jz3Var = kidsModeDeActiveBottomDialogFragment.i1;
                    js3.m(jz3Var);
                    jz3Var.w.setVisibility(4);
                    jz3 jz3Var2 = kidsModeDeActiveBottomDialogFragment.i1;
                    js3.m(jz3Var2);
                    jz3Var2.x.clearFocus();
                    jz3 jz3Var3 = kidsModeDeActiveBottomDialogFragment.i1;
                    js3.m(jz3Var3);
                    jz3Var3.B.requestFocus();
                    jz3 jz3Var4 = kidsModeDeActiveBottomDialogFragment.i1;
                    js3.m(jz3Var4);
                    DialogButtonComponent dialogButtonComponent = jz3Var4.v;
                    js3.m(kidsModeDeActiveBottomDialogFragment.i1);
                    dialogButtonComponent.setCommitButtonEnable(!f88.n0(String.valueOf(r1.B.getText())), sj8.b().d);
                    return;
                } catch (Exception unused) {
                    jz3 jz3Var5 = kidsModeDeActiveBottomDialogFragment.i1;
                    js3.m(jz3Var5);
                    jz3Var5.x.setText("");
                    return;
                }
            default:
                KidsModeDeActiveBottomDialogFragment kidsModeDeActiveBottomDialogFragment2 = this.b;
                js3.p(editable, "s");
                try {
                    if (editable.length() != 1) {
                        if (editable.length() > 1) {
                            throw new IllegalStateException("Text is not an Integer.");
                        }
                        return;
                    }
                    Integer.parseInt(editable.toString());
                    jz3 jz3Var6 = kidsModeDeActiveBottomDialogFragment2.i1;
                    js3.m(jz3Var6);
                    jz3Var6.w.setVisibility(4);
                    jz3 jz3Var7 = kidsModeDeActiveBottomDialogFragment2.i1;
                    js3.m(jz3Var7);
                    jz3Var7.B.clearFocus();
                    jz3 jz3Var8 = kidsModeDeActiveBottomDialogFragment2.i1;
                    js3.m(jz3Var8);
                    jz3Var8.v.requestFocus();
                    jz3 jz3Var9 = kidsModeDeActiveBottomDialogFragment2.i1;
                    js3.m(jz3Var9);
                    DialogButtonComponent dialogButtonComponent2 = jz3Var9.v;
                    js3.m(kidsModeDeActiveBottomDialogFragment2.i1);
                    dialogButtonComponent2.setCommitButtonEnable(!f88.n0(String.valueOf(r1.x.getText())), sj8.b().d);
                    return;
                } catch (Exception unused2) {
                    jz3 jz3Var10 = kidsModeDeActiveBottomDialogFragment2.i1;
                    js3.m(jz3Var10);
                    jz3Var10.B.setText("");
                    return;
                }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.a) {
        }
        js3.p(charSequence, "s");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.a) {
        }
        js3.p(charSequence, "s");
    }
}
