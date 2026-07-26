package defpackage;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import ir.mservices.market.views.MovieTagView;

/* JADX INFO: loaded from: classes3.dex */
public final class t75 extends d91 {
    public final /* synthetic */ MovieTagView d;

    public t75(MovieTagView movieTagView) {
        this.d = movieTagView;
    }

    @Override // defpackage.ve8
    public final void i(Object obj, ir8 ir8Var) {
        MovieTagView movieTagView = this.d;
        int dimensionPixelSize = movieTagView.getResources().getDimensionPixelSize(pq6.movie_tag_icon_size);
        ImageView imageView = movieTagView.c.w;
        imageView.getLayoutParams().width = (int) (dimensionPixelSize * (r4.getIntrinsicWidth() / r4.getIntrinsicHeight()));
        imageView.requestLayout();
        imageView.setImageDrawable((Drawable) obj);
    }

    @Override // defpackage.ve8
    public final void j(Drawable drawable) {
        this.d.c.w.setImageDrawable(drawable);
    }
}
