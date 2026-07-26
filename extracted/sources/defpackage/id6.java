package defpackage;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.media3.ui.PlayerControlView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.g;
import androidx.recyclerview.widget.o;

/* JADX INFO: loaded from: classes.dex */
public final class id6 extends g {
    public final String[] d;
    public final String[] e;
    public final Drawable[] f;
    public final /* synthetic */ PlayerControlView g;

    public id6(PlayerControlView playerControlView, String[] strArr, Drawable[] drawableArr) {
        this.g = playerControlView;
        this.d = strArr;
        this.e = new String[strArr.length];
        this.f = drawableArr;
    }

    @Override // androidx.recyclerview.widget.g
    public final int c() {
        return this.d.length;
    }

    @Override // androidx.recyclerview.widget.g
    public final long d(int i) {
        return i;
    }

    @Override // androidx.recyclerview.widget.g
    public final void l(o oVar, int i) {
        hd6 hd6Var = (hd6) oVar;
        View view = hd6Var.a;
        if (x(i)) {
            view.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        } else {
            view.setLayoutParams(new RecyclerView.LayoutParams(0, 0));
        }
        TextView textView = hd6Var.u;
        ImageView imageView = hd6Var.w;
        TextView textView2 = hd6Var.v;
        textView.setText(this.d[i]);
        String str = this.e[i];
        if (str == null) {
            textView2.setVisibility(8);
        } else {
            textView2.setText(str);
        }
        Drawable drawable = this.f[i];
        if (drawable == null) {
            imageView.setVisibility(8);
        } else {
            imageView.setImageDrawable(drawable);
        }
    }

    @Override // androidx.recyclerview.widget.g
    public final o n(ViewGroup viewGroup, int i) {
        PlayerControlView playerControlView = this.g;
        return new hd6(playerControlView, LayoutInflater.from(playerControlView.getContext()).inflate(hs6.exo_styled_settings_list_item, viewGroup, false));
    }

    public final boolean x(int i) {
        PlayerControlView playerControlView = this.g;
        gb6 gb6Var = playerControlView.M0;
        if (gb6Var == null) {
            return false;
        }
        if (i == 0) {
            return gb6Var.f0(13);
        }
        if (i != 1) {
            return true;
        }
        return gb6Var.f0(30) && playerControlView.M0.f0(29);
    }
}
