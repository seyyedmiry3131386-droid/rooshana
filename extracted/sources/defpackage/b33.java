package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.cardview.widget.CardView;
import ir.mservices.market.views.AppIconView;
import ir.mservices.market.views.FastDownloadView;
import ir.mservices.market.views.MyketAdInfoView;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b33 extends a79 {
    public final CardView A;
    public final FastDownloadView B;
    public final MyketAdInfoView v;
    public final AppIconView w;
    public final RelativeLayout x;
    public final MyketTextView y;
    public final ImageView z;

    public b33(ea1 ea1Var, View view, MyketAdInfoView myketAdInfoView, AppIconView appIconView, RelativeLayout relativeLayout, MyketTextView myketTextView, ImageView imageView, CardView cardView, FastDownloadView fastDownloadView) {
        super(0, view, ea1Var);
        this.v = myketAdInfoView;
        this.w = appIconView;
        this.x = relativeLayout;
        this.y = myketTextView;
        this.z = imageView;
        this.A = cardView;
        this.B = fastDownloadView;
    }
}
