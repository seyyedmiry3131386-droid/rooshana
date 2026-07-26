package defpackage;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.appcompat.widget.AppCompatSpinner;
import io.sentry.android.core.t0;

/* JADX INFO: loaded from: classes.dex */
public final class wn implements bo, DialogInterface.OnClickListener {
    public ld a;
    public xn b;
    public CharSequence c;
    public final /* synthetic */ AppCompatSpinner d;

    public wn(AppCompatSpinner appCompatSpinner) {
        this.d = appCompatSpinner;
    }

    @Override // defpackage.bo
    public final boolean b() {
        ld ldVar = this.a;
        if (ldVar != null) {
            return ldVar.isShowing();
        }
        return false;
    }

    @Override // defpackage.bo
    public final int c() {
        return 0;
    }

    @Override // defpackage.bo
    public final void dismiss() {
        ld ldVar = this.a;
        if (ldVar != null) {
            ldVar.dismiss();
            this.a = null;
        }
    }

    @Override // defpackage.bo
    public final void e(int i) {
        t0.d("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.bo
    public final CharSequence f() {
        return this.c;
    }

    @Override // defpackage.bo
    public final Drawable g() {
        return null;
    }

    @Override // defpackage.bo
    public final void h(CharSequence charSequence) {
        this.c = charSequence;
    }

    @Override // defpackage.bo
    public final void i(Drawable drawable) {
        t0.d("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.bo
    public final void j(int i) {
        t0.d("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.bo
    public final void l(int i) {
        t0.d("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.bo
    public final void n(int i, int i2) {
        if (this.b == null) {
            return;
        }
        AppCompatSpinner appCompatSpinner = this.d;
        kd kdVar = new kd(appCompatSpinner.getPopupContext());
        CharSequence charSequence = this.c;
        if (charSequence != null) {
            kdVar.setTitle(charSequence);
        }
        xn xnVar = this.b;
        int selectedItemPosition = appCompatSpinner.getSelectedItemPosition();
        gd gdVar = kdVar.a;
        gdVar.k = xnVar;
        gdVar.l = this;
        gdVar.o = selectedItemPosition;
        gdVar.n = true;
        ld ldVarCreate = kdVar.create();
        this.a = ldVarCreate;
        AlertController$RecycleListView alertController$RecycleListView = ldVarCreate.g.e;
        alertController$RecycleListView.setTextDirection(i);
        alertController$RecycleListView.setTextAlignment(i2);
        this.a.show();
    }

    @Override // defpackage.bo
    public final int o() {
        return 0;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        AppCompatSpinner appCompatSpinner = this.d;
        appCompatSpinner.setSelection(i);
        if (appCompatSpinner.getOnItemClickListener() != null) {
            appCompatSpinner.performItemClick(null, i, this.b.getItemId(i));
        }
        dismiss();
    }

    @Override // defpackage.bo
    public final void p(ListAdapter listAdapter) {
        this.b = (xn) listAdapter;
    }
}
