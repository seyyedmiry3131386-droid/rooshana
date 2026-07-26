package ir.mservices.market.version2.fragments.content;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import defpackage.cc7;
import defpackage.ez2;
import defpackage.g76;
import defpackage.js6;
import defpackage.q6;
import defpackage.q71;
import defpackage.r5;
import defpackage.r71;
import defpackage.r79;
import defpackage.rr6;
import defpackage.rs6;
import defpackage.s71;
import defpackage.sj8;
import defpackage.t32;
import defpackage.t40;
import defpackage.t71;
import defpackage.y97;
import defpackage.yq2;
import ir.mservices.market.activity.BaseFragmentContentActivity;
import ir.mservices.market.version2.ui.crop.CropImageView;

/* JADX INFO: loaded from: classes3.dex */
public class CropContentFragment extends ez2 {
    public static final /* synthetic */ int c1 = 0;
    public g76 V0;
    public CropImageView W0;
    public ImageButton X0;
    public ImageButton Y0;
    public ImageButton Z0;
    public ProgressBar a1;
    public t71 b1;

    public CropContentFragment() {
        this.T0 = false;
        this.U0 = false;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final String C() {
        return L(rs6.page_name_crop);
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final String Q0(BaseFragmentContentActivity baseFragmentContentActivity) {
        return baseFragmentContentActivity.getString(rs6.page_title_crop);
    }

    @Override // defpackage.ez2, ir.mservices.market.common.base.BaseContentFragment, ir.mservices.market.version2.fragments.base.BaseNavigationFragment, defpackage.cz2, androidx.fragment.app.d
    public final void W(Context context) {
        this.b1 = t71.fromBundle(p0());
        super.W(context);
    }

    @Override // androidx.fragment.app.d
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(js6.fragment_crop, viewGroup, false);
        cc7.e(viewInflate);
        CropImageView cropImageView = (CropImageView) viewInflate.findViewById(rr6.crop_image);
        this.W0 = cropImageView;
        cropImageView.setBackgroundColor(sj8.b().N);
        this.W0.setOverlayColor(sj8.b().K);
        this.X0 = (ImageButton) viewInflate.findViewById(rr6.crop_rotate_left);
        this.Y0 = (ImageButton) viewInflate.findViewById(rr6.crop_rotate_right);
        this.Z0 = (ImageButton) viewInflate.findViewById(rr6.crop_done);
        this.a1 = (ProgressBar) viewInflate.findViewById(rr6.loading);
        Drawable drawable = this.X0.getDrawable();
        int i = sj8.b().m;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        drawable.setColorFilter(i, mode);
        this.X0.setBackground(y97.x());
        this.Y0.getDrawable().setColorFilter(sj8.b().m, mode);
        this.Y0.setBackground(y97.x());
        this.Z0.getDrawable().setColorFilter(sj8.b().m, mode);
        this.Z0.setBackground(y97.x());
        return viewInflate;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final boolean b1() {
        return false;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final boolean c1() {
        return false;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final yq2 e1() {
        t32.b().j(new s71(null, false, this.b1.c));
        return t40.g;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment, androidx.fragment.app.d
    public final void k0(View view, Bundle bundle) {
        super.k0(view, bundle);
        this.W0.setHandleColor(sj8.b().c);
        this.W0.setFrameColor(sj8.b().c);
        this.W0.setGuideColor(sj8.b().c);
        String str = this.b1.b;
        if (TextUtils.isEmpty(str)) {
            this.W0.setCropMode(CropImageView.CropMode.SQUARE);
        } else {
            this.W0.setCropMode(CropImageView.CropMode.valueOf(str));
        }
        this.W0.setCompressFormat(Bitmap.CompressFormat.JPEG);
        this.W0.setCompressQuality(70);
        this.W0.setOutputMaxSize(1024, 1024);
        Uri uri = this.b1.a;
        if (uri != null) {
            this.a1.setVisibility(0);
            CropImageView cropImageView = this.W0;
            cropImageView.y = new r79(14, this);
            cropImageView.D = uri;
            cropImageView.B.submit(new q6(6, cropImageView));
        }
        this.Z0.setOnClickListener(new r5(3, this));
        this.X0.setOnClickListener(new q71(this));
        this.Y0.setOnClickListener(new r71(this));
    }
}
