package defpackage;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bumptech.glide.load.DataSource;
import ir.mservices.market.screenshots.ScreenshotFragment;
import ir.mservices.market.version2.fragments.SingleImageFragment;
import ir.mservices.market.views.ScreenshotView;

/* JADX INFO: loaded from: classes3.dex */
public final class qc implements p57 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qc(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.p57
    public final void a(Object obj, ve8 ve8Var) {
        switch (this.a) {
            case 0:
                ImageView imageView = ((rc) this.b).x().y;
                js3.o(imageView, "icon");
                imageView.setVisibility(8);
                return;
            case 1:
                ImageView imageView2 = ((rc) this.b).y().y;
                js3.o(imageView2, "image");
                imageView2.setVisibility(8);
                return;
            case 2:
                ImageView imageView3 = ((rc) this.b).z().y;
                js3.o(imageView3, "image");
                imageView3.setVisibility(8);
                return;
            case 3:
                w63 w63Var = ((zx5) this.b).x;
                if (w63Var == null) {
                    js3.V("binding");
                    throw null;
                }
                ImageView imageView4 = w63Var.x;
                js3.o(imageView4, "image");
                imageView4.setVisibility(8);
                return;
            case 4:
                js3.p(obj, "model");
                js3.p(ve8Var, "target");
                uf7 uf7Var = ((ScreenshotFragment) this.b).A0;
                js3.m(uf7Var);
                uf7Var.v.d(false);
                return;
            case 5:
                bp2 onError = ((ScreenshotView) this.b).getOnError();
                if (onError != null) {
                    onError.invoke();
                    return;
                }
                return;
            default:
                tm2 tm2Var = ((SingleImageFragment) this.b).M0;
                js3.m(tm2Var);
                tm2Var.w.setVisibility(8);
                return;
        }
    }

    @Override // defpackage.p57
    public final boolean b(Object obj, Object obj2, ve8 ve8Var, DataSource dataSource) {
        switch (this.a) {
            case 0:
                ImageView imageView = ((rc) this.b).x().y;
                js3.o(imageView, "icon");
                imageView.setVisibility(0);
                break;
            case 1:
                ImageView imageView2 = ((rc) this.b).y().y;
                js3.o(imageView2, "image");
                imageView2.setVisibility(0);
                break;
            case 2:
                ImageView imageView3 = ((rc) this.b).z().y;
                js3.o(imageView3, "image");
                imageView3.setVisibility(0);
                break;
            case 3:
                break;
            case 4:
                js3.p(obj2, "model");
                js3.p(ve8Var, "target");
                js3.p(dataSource, "dataSource");
                ScreenshotFragment screenshotFragment = (ScreenshotFragment) this.b;
                uf7 uf7Var = screenshotFragment.A0;
                js3.m(uf7Var);
                uf7Var.v.d(false);
                uf7 uf7Var2 = screenshotFragment.A0;
                js3.m(uf7Var2);
                uf7Var2.w.setZoomable(true);
                break;
            case 5:
                Drawable drawable = (Drawable) obj;
                dp2 onLoad = ((ScreenshotView) this.b).getOnLoad();
                if (onLoad != null) {
                    onLoad.invoke(drawable);
                }
                break;
            default:
                tm2 tm2Var = ((SingleImageFragment) this.b).M0;
                js3.m(tm2Var);
                tm2Var.w.setVisibility(8);
                break;
        }
        return false;
    }
}
