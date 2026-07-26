package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bumptech.glide.a;
import ir.mservices.market.app.suggest.detail.recycler.PlayScreenshotData;

/* JADX INFO: loaded from: classes3.dex */
public final class oa6 extends d91 {
    public final /* synthetic */ pa6 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ PlayScreenshotData f;

    public oa6(pa6 pa6Var, int i, PlayScreenshotData playScreenshotData) {
        this.d = pa6Var;
        this.e = i;
        this.f = playScreenshotData;
    }

    @Override // defpackage.ve8
    public final void i(Object obj, ir8 ir8Var) {
        Drawable drawable = (Drawable) obj;
        pa6 pa6Var = this.d;
        j73 j73Var = pa6Var.x;
        if (j73Var == null) {
            js3.V("binding");
            throw null;
        }
        ImageView imageView = j73Var.v;
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int i = this.e;
        layoutParams.width = (intrinsicWidth * i) / drawable.getIntrinsicHeight();
        imageView.getLayoutParams().height = i;
        View view = pa6Var.a;
        ((f57) a.f(view).r(drawable).J(new fo0(), new na7(view.getResources().getDimensionPixelSize(pq6.default_image_corner_radius)))).P(imageView);
        qg5.v(imageView, pa6Var.w, pa6Var, this.f);
    }

    @Override // defpackage.ve8
    public final void j(Drawable drawable) {
    }
}
