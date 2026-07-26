package ir.mservices.market.version2.fragments.dialog;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import defpackage.b74;
import defpackage.c74;
import defpackage.js6;
import defpackage.pq6;
import defpackage.rr6;
import defpackage.sj8;
import defpackage.y97;
import ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment;
import ir.mservices.market.version2.ui.recycler.data.LineMenuItemData;
import ir.mservices.market.views.MyketTextView;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class LineMenuBottomDialogFragment extends BaseNewBottomDialogFragment {
    public LinearLayout e1;
    public MyketTextView f1;
    public c74 g1;

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment
    public final DialogDataModel L0() {
        return this.g1.a;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment
    public final String M0() {
        return getClass().getSimpleName();
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment, ir.mservices.market.version2.fragments.base.Hilt_BaseNewBottomDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public final void W(Context context) {
        this.g1 = c74.fromBundle(p0());
        super.W(context);
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public final void X(Bundle bundle) {
        super.X(bundle);
        this.Z0 = true;
        this.a1 = true;
    }

    @Override // androidx.fragment.app.d
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(js6.line_menu_dialog, viewGroup, false);
        this.e1 = (LinearLayout) viewInflate.findViewById(rr6.content);
        MyketTextView myketTextView = (MyketTextView) viewInflate.findViewById(rr6.title);
        this.f1 = myketTextView;
        myketTextView.setTextColor(sj8.b().n);
        return viewInflate;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment, androidx.fragment.app.d
    public final void k0(View view, Bundle bundle) {
        super.k0(view, bundle);
        String str = this.g1.c;
        if (TextUtils.isEmpty(str)) {
            this.f1.setVisibility(8);
        } else {
            this.f1.setVisibility(0);
            this.f1.setText(str);
        }
        this.e1.removeAllViews();
        for (LineMenuItemData lineMenuItemData : new ArrayList(Arrays.asList(this.g1.b))) {
            LinearLayout linearLayout = this.e1;
            MyketTextView myketTextView = new MyketTextView(view.getContext());
            myketTextView.setText(lineMenuItemData.b);
            int i = lineMenuItemData.c;
            if (i != 0) {
                myketTextView.setTextColor(i);
            } else {
                myketTextView.setTextColor(sj8.b().m);
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            int dimensionPixelSize = K().getDimensionPixelSize(pq6.space_16);
            myketTextView.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
            myketTextView.setGravity(17);
            myketTextView.setLayoutParams(layoutParams);
            myketTextView.setBackgroundDrawable(y97.B(0.0f, 0, 3));
            myketTextView.setTextSize(0, K().getDimension(pq6.font_size_large));
            myketTextView.setOnClickListener(new b74(this, lineMenuItemData, 0));
            linearLayout.addView(myketTextView);
        }
    }
}
