package ir.mservices.market.version2.fragments.dialog;

import android.app.Dialog;
import android.content.Context;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import defpackage.f57;
import defpackage.ho6;
import defpackage.io6;
import defpackage.jo6;
import defpackage.js6;
import defpackage.lw;
import defpackage.nt6;
import defpackage.p3;
import defpackage.pq6;
import defpackage.rr6;
import defpackage.sj8;
import defpackage.uv1;
import defpackage.yq6;
import defpackage.zk8;
import defpackage.zy2;
import ir.mservices.market.version2.fragments.base.BaseNewDialogFragment;
import ir.myket.core.utils.GraphicUtils$Dimension;

/* JADX INFO: loaded from: classes3.dex */
public class PushNotifDialogFragment extends zy2 {
    public jo6 c1;

    public PushNotifDialogFragment() {
        super(4);
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog C0(Bundle bundle) {
        jo6 jo6Var = this.c1;
        String str = jo6Var.b;
        String str2 = jo6Var.c;
        lw.c(str, "Url is empty in PushNotifDialogFragment");
        Dialog dialog = new Dialog(F(), nt6.MyketDialogTheme);
        dialog.setContentView(js6.dialog_push_notif);
        dialog.findViewById(rr6.layout).getBackground().setColorFilter(sj8.b().l, PorterDuff.Mode.MULTIPLY);
        TextView textView = (TextView) dialog.findViewById(rr6.textTitle);
        WebView webView = (WebView) dialog.findViewById(rr6.webView);
        ImageView imageView = (ImageView) dialog.findViewById(rr6.dialogIcon);
        String str3 = this.c1.d;
        textView.setTextColor(sj8.b().m);
        if (str3 == null || TextUtils.isEmpty(str3)) {
            imageView.setImageResource(yq6.app_icon_gradient);
        } else {
            ((f57) zk8.Q(this, str3).k(yq6.icon)).W(uv1.b()).P(imageView);
        }
        webView.getSettings().setJavaScriptEnabled(true);
        textView.setText(str2);
        webView.getSettings().setMixedContentMode(2);
        webView.loadUrl(str);
        int dimensionPixelSize = K().getDimensionPixelSize(pq6.push_notif_dialog_margin);
        int dimensionPixelSize2 = K().getDimensionPixelSize(pq6.margin_default_v2_double);
        GraphicUtils$Dimension graphicUtils$DimensionG = p3.g(F());
        int i = graphicUtils$DimensionG.a;
        int i2 = graphicUtils$DimensionG.b;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(dialog.getWindow().getAttributes());
        layoutParams.width = i - dimensionPixelSize;
        layoutParams.height = i2 - dimensionPixelSize2;
        dialog.getWindow().setAttributes(layoutParams);
        webView.getSettings().setDefaultTextEncodingName("utf-8");
        webView.setWebChromeClient(new ho6(0, webView));
        webView.setWebViewClient(new io6(0, this));
        BaseNewDialogFragment.I0(dialog.getWindow());
        M0(dialog);
        return dialog;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewDialogFragment
    public final DialogDataModel K0() {
        return this.c1.a;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewDialogFragment
    public final String L0() {
        return getClass().getSimpleName();
    }

    @Override // defpackage.zy2, ir.mservices.market.version2.fragments.base.BaseNewDialogFragment, ir.mservices.market.version2.fragments.base.Hilt_BaseNewDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public final void W(Context context) {
        this.c1 = jo6.fromBundle(p0());
        super.W(context);
    }
}
