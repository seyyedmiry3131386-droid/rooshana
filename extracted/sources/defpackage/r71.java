package defpackage;

import android.view.View;
import ir.mservices.market.version2.fragments.content.CropContentFragment;
import ir.mservices.market.version2.ui.crop.CropImageView;

/* JADX INFO: loaded from: classes3.dex */
public final class r71 implements View.OnClickListener {
    public final /* synthetic */ CropContentFragment a;

    public r71(CropContentFragment cropContentFragment) {
        this.a = cropContentFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        CropContentFragment cropContentFragment = this.a;
        if (cropContentFragment.W0.getDrawable() != null) {
            cropContentFragment.W0.u(CropImageView.RotateDegrees.ROTATE_90D);
        }
    }
}
