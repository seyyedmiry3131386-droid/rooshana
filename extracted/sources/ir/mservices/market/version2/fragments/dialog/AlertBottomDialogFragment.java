package ir.mservices.market.version2.fragments.dialog;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import defpackage.bd;
import defpackage.js6;
import defpackage.pj9;
import defpackage.rr6;
import defpackage.sj8;
import defpackage.v4;
import ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment;
import ir.mservices.market.views.DialogButtonComponent;
import ir.mservices.market.views.DialogHeaderComponent;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public class AlertBottomDialogFragment extends BaseNewBottomDialogFragment {
    public DialogButtonComponent e1;
    public MyketTextView f1;
    public DialogHeaderComponent g1;
    public View h1;
    public bd i1;

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment
    public final String K0() {
        return this.i1.b;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment
    public final DialogDataModel L0() {
        return this.i1.a;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment
    public final String M0() {
        return getClass().getSimpleName();
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment, ir.mservices.market.version2.fragments.base.Hilt_BaseNewBottomDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public final void W(Context context) {
        this.i1 = bd.fromBundle(p0());
        super.W(context);
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public final void X(Bundle bundle) {
        super.X(bundle);
        this.b1 = this.i1.f;
        this.a1 = true;
        this.Z0 = true;
    }

    @Override // androidx.fragment.app.d
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(js6.alert_dialog_bottom, viewGroup, false);
        this.f1 = (MyketTextView) viewInflate.findViewById(rr6.description);
        this.e1 = (DialogButtonComponent) viewInflate.findViewById(rr6.dialog_button);
        this.g1 = (DialogHeaderComponent) viewInflate.findViewById(rr6.header);
        this.h1 = viewInflate.findViewById(rr6.divider);
        return viewInflate;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public final void b0() {
        super.b0();
        this.e1 = null;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment, androidx.fragment.app.d
    public final void k0(View view, Bundle bundle) {
        super.k0(view, bundle);
        this.g1.setTitle(this.i1.b);
        bd bdVar = this.i1;
        String str = bdVar.c;
        this.h1.setVisibility(TextUtils.isEmpty(bdVar.b) ? 8 : 0);
        this.h1.setBackgroundColor(sj8.b().v);
        this.f1.setTextColor(sj8.b().n);
        if (TextUtils.isEmpty(str)) {
            this.f1.setVisibility(8);
        } else {
            this.f1.setTextFromHtml(str, 0, TextView.BufferType.SPANNABLE, new v4(1, this), false);
            this.f1.setMovementMethod(LinkMovementMethod.getInstance());
            this.f1.setVisibility(0);
        }
        this.f1.setTextColor(sj8.b().n);
        DialogButtonComponent dialogButtonComponent = this.e1;
        bd bdVar2 = this.i1;
        dialogButtonComponent.setTitles(bdVar2.d, bdVar2.e);
        this.e1.setOnClickListener(new pj9(this));
    }
}
