package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class qd8 extends View {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ sd8 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qd8(sd8 sd8Var, Context context, ViewGroup viewGroup) {
        super(context);
        this.b = sd8Var;
        this.a = viewGroup;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        Drawable background = this.a.getBackground();
        int color = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0;
        sd8 sd8Var = this.b;
        if (sd8Var.e != color) {
            sd8Var.e = color;
            for (int size = sd8Var.b.size() - 1; size >= 0; size--) {
                ((an6) sd8Var.b.get(size)).b(color);
            }
        }
    }
}
