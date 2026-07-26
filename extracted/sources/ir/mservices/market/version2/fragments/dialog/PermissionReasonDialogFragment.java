package ir.mservices.market.version2.fragments.dialog;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;
import defpackage.b77;
import defpackage.e56;
import defpackage.hh2;
import defpackage.js3;
import defpackage.js6;
import defpackage.nt6;
import defpackage.pq6;
import defpackage.q39;
import defpackage.rr6;
import defpackage.rs6;
import defpackage.sj8;
import ir.mservices.market.data.permission.PermissionReason;
import ir.mservices.market.version2.fragments.base.BaseNewDialogFragment;
import ir.mservices.market.views.DialogButtonComponent;
import ir.mservices.market.views.DialogHeaderComponent;

/* JADX INFO: loaded from: classes3.dex */
public class PermissionReasonDialogFragment extends BaseNewDialogFragment {
    public e56 Y0;

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog C0(Bundle bundle) {
        Drawable drawable;
        Dialog dialog = new Dialog(F(), nt6.MyketDialogTheme);
        dialog.setContentView(js6.dialog_permission_reason);
        dialog.findViewById(rr6.container_badge).getBackground().setColorFilter(sj8.b().l, PorterDuff.Mode.MULTIPLY);
        PermissionReason permissionReason = this.Y0.c;
        DialogHeaderComponent dialogHeaderComponent = (DialogHeaderComponent) dialog.findViewById(rr6.header);
        TextView textView = (TextView) dialog.findViewById(rr6.description);
        TextView textView2 = (TextView) dialog.findViewById(rr6.last_word);
        DialogButtonComponent dialogButtonComponent = (DialogButtonComponent) dialog.findViewById(rr6.dialog_button);
        textView.setTextColor(sj8.b().n);
        String string = TextUtils.isEmpty(this.Y0.c.g) ? K().getString(rs6.access_txt_btn) : this.Y0.c.g;
        String string2 = TextUtils.isEmpty(this.Y0.c.h) ? K().getString(rs6.not_now) : this.Y0.c.h;
        textView2.setTextColor(sj8.b().A);
        boolean z = permissionReason.d;
        int i = permissionReason.a;
        if (z) {
            string2 = null;
        }
        dialogButtonComponent.setTitles(string, string2);
        dialogButtonComponent.setOnClickListener(new hh2(27, this, permissionReason, false));
        dialogHeaderComponent.setTitle(permissionReason.b);
        if (i != 0) {
            Resources resourcesK = K();
            js3.p(resourcesK, "res");
            try {
                drawable = q39.a(resourcesK, i, null);
                if (drawable == null) {
                    ThreadLocal threadLocal = b77.a;
                    drawable = resourcesK.getDrawable(i, null);
                    if (drawable == null) {
                        throw new Resources.NotFoundException();
                    }
                }
            } catch (Exception unused) {
                ThreadLocal threadLocal2 = b77.a;
                drawable = resourcesK.getDrawable(i, null);
                if (drawable == null) {
                    throw new Resources.NotFoundException();
                }
            }
            dialogHeaderComponent.setImage(drawable, pq6.dialog_header_circle_image_size);
        }
        dialogHeaderComponent.setComponentGravity(DialogHeaderComponent.ComponentGravity.a);
        textView.setText(permissionReason.c);
        if (this.Y0.b) {
            textView2.setVisibility(0);
        } else {
            textView2.setVisibility(8);
        }
        BaseNewDialogFragment.I0(dialog.getWindow());
        M0(dialog);
        return dialog;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewDialogFragment
    public final DialogDataModel K0() {
        return this.Y0.a;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewDialogFragment
    public final String L0() {
        return getClass().getSimpleName();
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewDialogFragment, ir.mservices.market.version2.fragments.base.Hilt_BaseNewDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public final void W(Context context) {
        this.Y0 = e56.fromBundle(p0());
        super.W(context);
    }
}
