package defpackage;

import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.constraintlayout.widget.Group;
import ir.mservices.market.app.detail.reivews.recycler.a;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements ze2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;

    public /* synthetic */ e(a aVar, int i) {
        this.a = i;
        this.b = aVar;
    }

    @Override // defpackage.ze2
    public final Object emit(Object obj, g51 g51Var) {
        int i = this.a;
        tx8 tx8Var = tx8.a;
        a aVar = this.b;
        switch (i) {
            case 0:
                Boolean bool = (Boolean) obj;
                int i2 = a.A;
                View view = aVar.a;
                Resources resources = view.getResources();
                js3.o(resources, "getResources(...)");
                Drawable drawableK = p3.k(resources, yq6.ic_like);
                Drawable drawableMutate = drawableK.mutate();
                int i3 = js3.i(bool, Boolean.TRUE) ? sj8.b().x : sj8.b().n;
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
                drawableMutate.setColorFilter(new PorterDuffColorFilter(i3, mode));
                aVar.x().z.setImageDrawable(drawableK);
                Resources resources2 = view.getResources();
                js3.o(resources2, "getResources(...)");
                Drawable drawableK2 = p3.k(resources2, yq6.ic_dislike);
                drawableK2.mutate().setColorFilter(new PorterDuffColorFilter(js3.i(bool, Boolean.FALSE) ? sj8.b().A : sj8.b().n, mode));
                aVar.x().w.setImageDrawable(drawableK2);
                break;
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                Group group = aVar.x().A;
                js3.o(group, "likeLayout");
                group.setVisibility(zBooleanValue ? 0 : 8);
                break;
        }
        return tx8Var;
    }
}
