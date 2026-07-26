package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import com.google.android.material.carousel.CarouselLayoutManager;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class gn0 extends h {
    public final Paint a;
    public List b;

    public gn0() {
        Paint paint = new Paint();
        this.a = paint;
        this.b = DesugarCollections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    @Override // androidx.recyclerview.widget.h
    public final void c(Canvas canvas, RecyclerView recyclerView) {
        Canvas canvas2;
        float dimension = recyclerView.getResources().getDimension(oq6.m3_carousel_debug_keyline_width);
        Paint paint = this.a;
        paint.setStrokeWidth(dimension);
        for (cz3 cz3Var : this.b) {
            paint.setColor(sv0.b(cz3Var.c, -65281, -16776961));
            if (((CarouselLayoutManager) recyclerView.getLayoutManager()).S0()) {
                canvas2 = canvas;
                canvas2.drawLine(cz3Var.b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).y.g(), cz3Var.b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).y.c(), paint);
            } else {
                float fD = ((CarouselLayoutManager) recyclerView.getLayoutManager()).y.d();
                float f = cz3Var.b;
                float fE = ((CarouselLayoutManager) recyclerView.getLayoutManager()).y.e();
                float f2 = cz3Var.b;
                canvas2 = canvas;
                canvas2.drawLine(fD, f, fE, f2, paint);
            }
            canvas = canvas2;
        }
    }
}
