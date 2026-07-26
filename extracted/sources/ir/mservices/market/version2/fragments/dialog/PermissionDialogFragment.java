package ir.mservices.market.version2.fragments.dialog;

import android.app.Dialog;
import android.content.Context;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.fa1;
import defpackage.js6;
import defpackage.nt6;
import defpackage.pq6;
import defpackage.rr6;
import defpackage.rs6;
import defpackage.sj8;
import defpackage.vo4;
import defpackage.yq6;
import ir.mservices.market.app.detail.data.PermissionDto;
import ir.mservices.market.version2.fragments.base.BaseNewDialogFragment;
import ir.mservices.market.views.AppIconView;
import ir.mservices.market.views.DialogButtonComponent;
import ir.mservices.market.views.DialogHeaderComponent;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class PermissionDialogFragment extends BaseNewDialogFragment {
    public c Y0;

    public static class PermissionList implements Serializable {
        public List a;
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog C0(Bundle bundle) {
        Dialog dialog = new Dialog(F(), nt6.MyketDialogTheme);
        dialog.setContentView(js6.application_permissions);
        dialog.findViewById(rr6.layout).getBackground().setColorFilter(sj8.b().l, PorterDuff.Mode.MULTIPLY);
        LinearLayout linearLayout = (LinearLayout) dialog.findViewById(rr6.permission_items);
        DialogButtonComponent dialogButtonComponent = (DialogButtonComponent) dialog.findViewById(rr6.buttons);
        DialogHeaderComponent dialogHeaderComponent = (DialogHeaderComponent) dialog.findViewById(rr6.header);
        AppIconView appIconView = new AppIconView(F());
        int dimensionPixelSize = K().getDimensionPixelSize(pq6.dialog_header_side_image_size);
        appIconView.setLayoutParams(new ViewGroup.LayoutParams(dimensionPixelSize, dimensionPixelSize));
        appIconView.setErrorImageResId(yq6.icon);
        c cVar = this.Y0;
        String str = cVar.b;
        String str2 = cVar.c;
        String str3 = cVar.d;
        PermissionList permissionList = cVar.e;
        dialogHeaderComponent.setTitle(str);
        dialogHeaderComponent.setSubtitle(str2);
        appIconView.setImageUrl(str3);
        dialogHeaderComponent.setImageView(appIconView);
        dialogButtonComponent.setTitles(null, L(rs6.button_ok));
        dialogHeaderComponent.setComponentGravity(DialogHeaderComponent.ComponentGravity.b);
        List list = permissionList.a;
        for (int i = 0; i < list.size(); i++) {
            PermissionDto permissionDto = (PermissionDto) list.get(i);
            View view = fa1.c(F().getLayoutInflater(), js6.permissions_item, null, false).l;
            TextView textView = (TextView) view.findViewById(rr6.title);
            TextView textView2 = (TextView) view.findViewById(rr6.description);
            textView.setText(permissionDto.getTitle());
            if (TextUtils.isEmpty(permissionDto.getDescription())) {
                textView2.setVisibility(8);
            } else {
                textView2.setText(permissionDto.getDescription());
                textView2.setVisibility(0);
            }
            linearLayout.addView(view);
        }
        dialogButtonComponent.setOnClickListener(new vo4(4, this));
        BaseNewDialogFragment.I0(dialog.getWindow());
        M0(dialog);
        return dialog;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewDialogFragment
    public final String J0() {
        return this.g.getString("BUNDLE_KEY_TITLE");
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
        this.Y0 = c.fromBundle(p0());
        super.W(context);
    }
}
