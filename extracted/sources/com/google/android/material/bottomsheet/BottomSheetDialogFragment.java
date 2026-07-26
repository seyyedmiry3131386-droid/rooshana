package com.google.android.material.bottomsheet;

import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.TypedValue;
import androidx.appcompat.app.AppCompatDialogFragment;
import defpackage.gf0;
import defpackage.if0;
import defpackage.mt6;
import defpackage.vp6;

/* JADX INFO: loaded from: classes.dex */
public class BottomSheetDialogFragment extends AppCompatDialogFragment {
    @Override // androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public Dialog C0(Bundle bundle) {
        Context contextH = H();
        int i = this.F0;
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            i = contextH.getTheme().resolveAttribute(vp6.bottomSheetDialogTheme, typedValue, true) ? typedValue.resourceId : mt6.Theme_Design_Light_BottomSheetDialog;
        }
        if0 if0Var = new if0(contextH, i);
        if0Var.k = true;
        if0Var.l = true;
        if0Var.q = new gf0(0, if0Var);
        if0Var.e().g(1);
        TypedArray typedArrayObtainStyledAttributes = if0Var.getContext().getTheme().obtainStyledAttributes(new int[]{vp6.enableEdgeToEdge});
        if0Var.o = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return if0Var;
    }

    @Override // androidx.fragment.app.DialogFragment
    public void z0() {
        Dialog dialog = this.L0;
        if (dialog instanceof if0) {
            boolean z = ((if0) dialog).h().I;
        }
        A0(false, false);
    }
}
