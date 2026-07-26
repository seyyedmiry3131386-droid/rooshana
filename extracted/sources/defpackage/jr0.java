package defpackage;

import android.widget.ImageView;
import ir.mservices.market.screenshots.DraggableScreenshotFragment;
import me.relex.circleindicator.CircleIndicator;

/* JADX INFO: loaded from: classes3.dex */
public final class jr0 implements i89 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jr0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.i89
    public final void b(int i) {
        int i2 = this.a;
    }

    @Override // defpackage.i89
    public final void c(int i) {
        switch (this.a) {
            case 0:
                CircleIndicator circleIndicator = (CircleIndicator) this.b;
                if (circleIndicator.k.getAdapter() == null || ((dg7) circleIndicator.k.getAdapter()).h.size() <= 0) {
                    return;
                }
                circleIndicator.a(i);
                return;
            default:
                DraggableScreenshotFragment draggableScreenshotFragment = (DraggableScreenshotFragment) this.b;
                dg7 dg7Var = draggableScreenshotFragment.c1;
                uo2 uo2Var = draggableScreenshotFragment.b1;
                js3.m(uo2Var);
                ImageView imageView = uo2Var.w;
                js3.o(imageView, "arrowRight");
                uo2 uo2Var2 = draggableScreenshotFragment.b1;
                js3.m(uo2Var2);
                ImageView imageView2 = uo2Var2.v;
                js3.o(imageView2, "arrowLeft");
                DraggableScreenshotFragment.P0(i, dg7Var, imageView, imageView2);
                uo2 uo2Var3 = draggableScreenshotFragment.b1;
                js3.m(uo2Var3);
                CircleIndicator circleIndicator2 = uo2Var3.x;
                dg7 dg7Var2 = draggableScreenshotFragment.c1;
                d04 d04Var = draggableScreenshotFragment.a1;
                if (d04Var == null) {
                    js3.V("languageHelper");
                    throw null;
                }
                if (d04Var.f()) {
                    i = ((dg7Var2 != null ? dg7Var2.h.size() : 0) - 1) - i;
                }
                circleIndicator2.a(i);
                return;
        }
    }

    @Override // defpackage.i89
    public final void d(int i, float f) {
        int i2 = this.a;
    }

    private final void a(int i) {
    }

    private final void e(int i) {
    }

    private final void f(int i, float f) {
    }

    private final void g(int i, float f) {
    }
}
