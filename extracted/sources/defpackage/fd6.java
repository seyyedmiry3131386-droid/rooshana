package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.ui.PlayerControlView;
import androidx.recyclerview.widget.g;
import androidx.recyclerview.widget.o;

/* JADX INFO: loaded from: classes.dex */
public final class fd6 extends g {
    public final String[] d;
    public final float[] e;
    public int f;
    public final /* synthetic */ PlayerControlView g;

    public fd6(PlayerControlView playerControlView, String[] strArr, float[] fArr) {
        this.g = playerControlView;
        this.d = strArr;
        this.e = fArr;
    }

    @Override // androidx.recyclerview.widget.g
    public final int c() {
        return this.d.length;
    }

    @Override // androidx.recyclerview.widget.g
    public final void l(o oVar, final int i) {
        jd6 jd6Var = (jd6) oVar;
        View view = jd6Var.v;
        View view2 = jd6Var.a;
        String[] strArr = this.d;
        if (i < strArr.length) {
            jd6Var.u.setText(strArr[i]);
        }
        if (i == this.f) {
            view2.setSelected(true);
            view.setVisibility(0);
        } else {
            view2.setSelected(false);
            view.setVisibility(4);
        }
        view2.setOnClickListener(new View.OnClickListener() { // from class: ed6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                fd6 fd6Var = this.a;
                PlayerControlView playerControlView = fd6Var.g;
                int i2 = fd6Var.f;
                int i3 = i;
                if (i3 != i2) {
                    playerControlView.setPlaybackSpeed(fd6Var.e[i3]);
                }
                playerControlView.q.dismiss();
            }
        });
    }

    @Override // androidx.recyclerview.widget.g
    public final o n(ViewGroup viewGroup, int i) {
        return new jd6(LayoutInflater.from(this.g.getContext()).inflate(hs6.exo_styled_sub_settings_list_item, viewGroup, false));
    }
}
