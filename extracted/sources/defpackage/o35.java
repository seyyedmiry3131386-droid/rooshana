package defpackage;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bumptech.glide.load.DataSource;
import ir.mservices.market.movie.ui.home.recycler.a;

/* JADX INFO: loaded from: classes3.dex */
public final class o35 implements p57 {
    public final /* synthetic */ a a;
    public final /* synthetic */ float b;

    public o35(a aVar, float f) {
        this.a = aVar;
        this.b = f;
    }

    @Override // defpackage.p57
    public final boolean b(Object obj, Object obj2, ve8 ve8Var, DataSource dataSource) {
        a aVar = this.a;
        ImageView imageView = aVar.M().y;
        imageView.setImageDrawable((Drawable) obj);
        imageView.setTranslationX(this.b);
        imageView.setScaleX(1.0f * (aVar.x ? 1 : -1));
        return true;
    }

    @Override // defpackage.p57
    public final void a(Object obj, ve8 ve8Var) {
    }
}
