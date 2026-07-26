package com.google.android.gms.common;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import defpackage.rq4;

/* JADX INFO: loaded from: classes.dex */
public class SupportErrorDialogFragment extends DialogFragment {
    public Dialog Q0;
    public DialogInterface.OnCancelListener R0;
    public AlertDialog S0;

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog C0(Bundle bundle) {
        Dialog dialog = this.Q0;
        if (dialog != null) {
            return dialog;
        }
        this.H0 = false;
        if (this.S0 == null) {
            Context contextH = H();
            rq4.n(contextH);
            this.S0 = new AlertDialog.Builder(contextH).create();
        }
        return this.S0;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.R0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
