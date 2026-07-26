package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class fb3 extends a79 {
    public final ImageView v;
    public final CardView w;
    public final FrameLayout x;

    public fb3(ea1 ea1Var, View view, ImageView imageView, CardView cardView, FrameLayout frameLayout) {
        super(0, view, ea1Var);
        this.v = imageView;
        this.w = cardView;
        this.x = frameLayout;
    }
}
