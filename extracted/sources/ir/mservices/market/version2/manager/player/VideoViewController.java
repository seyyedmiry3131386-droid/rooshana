package ir.mservices.market.version2.manager.player;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.ImageView;
import defpackage.hw5;
import defpackage.js3;
import defpackage.k6;
import defpackage.sj8;
import defpackage.y97;
import defpackage.yq6;
import defpackage.z59;
import ir.mservices.market.movie.data.webapi.CommonDataKt;
import ir.mservices.market.version2.ApplicationLauncher;
import ir.mservices.market.version2.manager.player.VideoViewController;
import java.io.Serializable;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final class VideoViewController extends k6 implements Serializable {
    public final z59 c;

    public VideoViewController(z59 z59Var, Context context) {
        this.c = z59Var;
        z59Var.w.setBackgroundColor(sj8.b().J.e);
        z59Var.A.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{sj8.c(sj8.f).J.f, sj8.c(sj8.f).N}));
        z59Var.v.setBackground(new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{sj8.c(sj8.f).J.e, sj8.c(sj8.f).N}));
        ImageView imageView = z59Var.z;
        imageView.setBackground(y97.w(sj8.c(sj8.f).O.c));
        ImageView imageView2 = z59Var.y;
        imageView2.setBackground(y97.w(sj8.c(sj8.f).O.c));
        hw5 hw5VarB = ApplicationLauncher.o.b();
        js3.o(hw5VarB, "appComponent(...)");
        final int i = 0;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: y59
            public final /* synthetic */ VideoViewController b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, z49] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i) {
                    case 0:
                        k6.i(this.b);
                        break;
                    default:
                        ?? r1 = this.b.a;
                        if (r1 != 0) {
                            r1.f();
                        }
                        break;
                }
            }
        });
        final int i2 = 1;
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: y59
            public final /* synthetic */ VideoViewController b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, z49] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        k6.i(this.b);
                        break;
                    default:
                        ?? r1 = this.b.a;
                        if (r1 != 0) {
                            r1.f();
                        }
                        break;
                }
            }
        });
        z59Var.x.setUnplayedColor(sj8.b().I.a);
    }

    @Override // defpackage.k6
    public final void l(boolean z) {
        int i;
        ImageView imageView = this.c.z;
        if (z) {
            i = yq6.ic_pause;
        } else {
            if (z) {
                throw new NoWhenBranchMatchedException();
            }
            i = yq6.ic_play;
        }
        imageView.setImageResource(i);
    }

    @Override // defpackage.k6
    public final void t(boolean z) {
        this.c.w.setVisibility(z ? 0 : 8);
    }

    @Override // defpackage.k6
    public final void v(boolean z) {
        ImageView imageView = this.c.z;
        js3.o(imageView, CommonDataKt.RESTRICTION_BUTTON_ACTION_PLAY);
        imageView.setVisibility(!z ? 4 : 0);
    }
}
