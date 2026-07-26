package defpackage;

import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import ir.mservices.market.myMarket.recycler.MyMarketData;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public class sd5 extends qg5 {
    public final og5 w;
    public final ImageView x;
    public final MyketTextView y;

    public sd5(View view, og5 og5Var) {
        Drawable drawable;
        super(view);
        this.w = og5Var;
        View viewFindViewById = view.findViewById(rr6.icon);
        js3.o(viewFindViewById, "findViewById(...)");
        this.x = (ImageView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(rr6.title);
        js3.o(viewFindViewById2, "findViewById(...)");
        this.y = (MyketTextView) viewFindViewById2;
        ImageView imageView = (ImageView) view.findViewById(rr6.arrow);
        Resources resources = view.getResources();
        js3.o(resources, "getResources(...)");
        int i = yq6.ic_arrow_end;
        try {
            drawable = q39.a(resources, i, null);
            if (drawable == null) {
                ThreadLocal threadLocal = b77.a;
                drawable = resources.getDrawable(i, null);
                if (drawable == null) {
                    throw new Resources.NotFoundException();
                }
            }
        } catch (Exception unused) {
            ThreadLocal threadLocal2 = b77.a;
            drawable = resources.getDrawable(i, null);
            if (drawable == null) {
                throw new Resources.NotFoundException();
            }
        }
        imageView.setImageDrawable(drawable.mutate());
        imageView.getDrawable().setColorFilter(new PorterDuffColorFilter(sj8.b().n, PorterDuff.Mode.MULTIPLY));
    }

    @Override // defpackage.qg5
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void t(MyMarketData myMarketData) {
        Drawable drawable;
        js3.p(myMarketData, "data");
        View view = this.a;
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(pq6.space_16);
        int dimensionPixelSize2 = view.getResources().getDimensionPixelSize(pq6.space_4) + view.getResources().getDimensionPixelSize(pq6.space_xl);
        view.setPadding(dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize);
        int i = sj8.b().m;
        MyketTextView myketTextView = this.y;
        myketTextView.setTextColor(i);
        myketTextView.setText(myMarketData.b);
        Resources resources = view.getResources();
        js3.o(resources, "getResources(...)");
        int i2 = myMarketData.a;
        try {
            drawable = q39.a(resources, i2, null);
            if (drawable == null) {
                ThreadLocal threadLocal = b77.a;
                drawable = resources.getDrawable(i2, null);
                if (drawable == null) {
                    throw new Resources.NotFoundException();
                }
            }
        } catch (Exception unused) {
            ThreadLocal threadLocal2 = b77.a;
            drawable = resources.getDrawable(i2, null);
            if (drawable == null) {
                throw new Resources.NotFoundException();
            }
        }
        Drawable drawableMutate = drawable.mutate();
        drawableMutate.setColorFilter(new PorterDuffColorFilter(myMarketData.d ? sj8.b().c : sj8.b().n, PorterDuff.Mode.MULTIPLY));
        this.x.setImageDrawable(drawableMutate);
        qg5.v(view, this.w, this, myMarketData);
    }
}
