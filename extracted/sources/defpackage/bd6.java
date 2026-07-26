package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.media3.ui.PlayerControlView;
import androidx.recyclerview.widget.g;
import androidx.recyclerview.widget.o;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class bd6 extends g {
    public List d = new ArrayList();
    public final /* synthetic */ PlayerControlView e;
    public final /* synthetic */ int f;
    public final /* synthetic */ PlayerControlView g;

    public bd6(PlayerControlView playerControlView, int i) {
        this.f = i;
        this.g = playerControlView;
        this.e = playerControlView;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A(defpackage.jd6 r7, int r8) {
        /*
            r6 = this;
            androidx.media3.ui.PlayerControlView r0 = r6.e
            gb6 r0 = r0.M0
            if (r0 != 0) goto L7
            return
        L7:
            if (r8 != 0) goto L7a
            int r8 = r6.f
            switch(r8) {
                case 0: goto L4d;
                default: goto Le;
            }
        Le:
            android.widget.TextView r8 = r7.u
            int r0 = defpackage.bt6.exo_track_selection_none
            r8.setText(r0)
            r8 = 0
            r0 = r8
        L17:
            java.util.List r1 = r6.d
            int r1 = r1.size()
            if (r0 >= r1) goto L36
            java.util.List r1 = r6.d
            java.lang.Object r1 = r1.get(r0)
            kd6 r1 = (defpackage.kd6) r1
            qp8 r2 = r1.a
            int r1 = r1.b
            boolean[] r2 = r2.e
            boolean r1 = r2[r1]
            if (r1 == 0) goto L33
            r0 = r8
            goto L37
        L33:
            int r0 = r0 + 1
            goto L17
        L36:
            r0 = 1
        L37:
            android.view.View r1 = r7.v
            if (r0 == 0) goto L3c
            goto L3d
        L3c:
            r8 = 4
        L3d:
            r1.setVisibility(r8)
            android.view.View r7 = r7.a
            cd r8 = new cd
            r0 = 24
            r8.<init>(r0, r6)
            r7.setOnClickListener(r8)
            goto L79
        L4d:
            android.widget.TextView r8 = r7.u
            int r0 = defpackage.bt6.exo_track_selection_auto
            r8.setText(r0)
            androidx.media3.ui.PlayerControlView r8 = r6.g
            gb6 r8 = r8.M0
            r8.getClass()
            hp8 r8 = r8.V()
            boolean r8 = r6.x(r8)
            android.view.View r0 = r7.v
            if (r8 == 0) goto L69
            r8 = 4
            goto L6a
        L69:
            r8 = 0
        L6a:
            r0.setVisibility(r8)
            android.view.View r7 = r7.a
            cd r8 = new cd
            r0 = 22
            r8.<init>(r0, r6)
            r7.setOnClickListener(r8)
        L79:
            return
        L7a:
            java.util.List r1 = r6.d
            r2 = 1
            int r8 = r8 - r2
            java.lang.Object r8 = r1.get(r8)
            kd6 r8 = (defpackage.kd6) r8
            qp8 r1 = r8.a
            yo8 r1 = r1.b
            hp8 r3 = r0.V()
            com.google.common.collect.ImmutableMap r3 = r3.D
            java.lang.Object r3 = r3.get(r1)
            r4 = 0
            if (r3 == 0) goto La0
            qp8 r3 = r8.a
            int r5 = r8.b
            boolean[] r3 = r3.e
            boolean r3 = r3[r5]
            if (r3 == 0) goto La0
            goto La1
        La0:
            r2 = r4
        La1:
            android.widget.TextView r3 = r7.u
            java.lang.String r5 = r8.c
            r3.setText(r5)
            android.view.View r3 = r7.v
            if (r2 == 0) goto Lad
            goto Lae
        Lad:
            r4 = 4
        Lae:
            r3.setVisibility(r4)
            android.view.View r7 = r7.a
            w95 r2 = new w95
            r2.<init>(r6, r0, r1, r8)
            r7.setOnClickListener(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bd6.A(jd6, int):void");
    }

    @Override // androidx.recyclerview.widget.g
    public final int c() {
        if (this.d.isEmpty()) {
            return 0;
        }
        return this.d.size() + 1;
    }

    @Override // androidx.recyclerview.widget.g
    public /* bridge */ /* synthetic */ void l(o oVar, int i) {
        switch (this.f) {
            case 1:
                z((jd6) oVar, i);
                break;
            default:
                z((jd6) oVar, i);
                break;
        }
    }

    @Override // androidx.recyclerview.widget.g
    public final o n(ViewGroup viewGroup, int i) {
        return new jd6(LayoutInflater.from(this.e.getContext()).inflate(hs6.exo_styled_sub_settings_list_item, viewGroup, false));
    }

    public boolean x(hp8 hp8Var) {
        for (int i = 0; i < this.d.size(); i++) {
            if (hp8Var.D.containsKey(((kd6) this.d.get(i)).a.b)) {
                return true;
            }
        }
        return false;
    }

    public void y(List list) {
        PlayerControlView playerControlView = this.g;
        ImageView imageView = playerControlView.C;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= list.size()) {
                break;
            }
            kd6 kd6Var = (kd6) list.get(i);
            if (kd6Var.a.e[kd6Var.b]) {
                z = true;
                break;
            }
            i++;
        }
        if (imageView != null) {
            imageView.setImageDrawable(z ? playerControlView.E0 : playerControlView.F0);
            imageView.setContentDescription(z ? playerControlView.G0 : playerControlView.H0);
        }
        this.d = list;
    }

    public void z(jd6 jd6Var, int i) {
        switch (this.f) {
            case 1:
                A(jd6Var, i);
                if (i > 0) {
                    kd6 kd6Var = (kd6) this.d.get(i - 1);
                    jd6Var.v.setVisibility(kd6Var.a.e[kd6Var.b] ? 0 : 4);
                }
                break;
            default:
                A(jd6Var, i);
                break;
        }
    }

    private final void B(String str) {
    }
}
