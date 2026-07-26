package ir.mservices.market.version2.manager.player;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import androidx.media3.ui.DefaultTimeBar;
import defpackage.e62;
import defpackage.hw5;
import defpackage.js3;
import defpackage.k6;
import defpackage.lw8;
import defpackage.q6;
import defpackage.sj8;
import defpackage.w91;
import defpackage.wg3;
import defpackage.xg3;
import defpackage.y97;
import defpackage.yq6;
import ir.mservices.market.movie.data.webapi.CommonDataKt;
import ir.mservices.market.theme.AlphaColor;
import ir.mservices.market.theme.ThemeData;
import ir.mservices.market.version2.ApplicationLauncher;
import ir.mservices.market.version2.fragments.IbexFragment;
import ir.mservices.market.version2.manager.player.IbexController;
import ir.mservices.market.views.MyketTextView;
import java.io.Serializable;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final class IbexController extends k6 implements Serializable {
    public final IbexFragment c;
    public final xg3 d;
    public final lw8 e;
    public final Handler f;
    public final q6 g;
    public final ThemeData h;

    public IbexController(IbexFragment ibexFragment, xg3 xg3Var, Context context) {
        this.c = ibexFragment;
        this.d = xg3Var;
        ThemeData themeDataC = sj8.c(sj8.f);
        this.h = themeDataC;
        hw5 hw5VarB = ApplicationLauncher.o.b();
        js3.o(hw5VarB, "appComponent(...)");
        w91 w91Var = (w91) hw5VarB;
        this.e = (lw8) w91Var.E.get();
        ImageView imageView = xg3Var.A;
        imageView.setBackground(y97.w(sj8.c(sj8.f).O.c));
        ImageView imageView2 = xg3Var.v;
        imageView2.setBackground(y97.w(sj8.c(sj8.f).O.c));
        ImageView imageView3 = xg3Var.y;
        imageView3.setBackground(y97.w(sj8.c(sj8.f).O.c));
        ImageView imageView4 = xg3Var.z;
        imageView4.setBackground(y97.w(sj8.c(sj8.f).O.c));
        xg3Var.w.setBackgroundColor(themeDataC.J.e);
        MyketTextView myketTextView = xg3Var.B;
        AlphaColor alphaColor = themeDataC.I;
        myketTextView.setTextColor(alphaColor.a);
        MyketTextView myketTextView2 = xg3Var.C;
        int i = alphaColor.a;
        myketTextView2.setTextColor(i);
        DefaultTimeBar defaultTimeBar = xg3Var.x;
        defaultTimeBar.setUnplayedColor(i);
        defaultTimeBar.x.add(new wg3(xg3Var, this));
        final int i2 = 0;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: vg3
            public final /* synthetic */ IbexController b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, z49] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        k6.i(this.b);
                        return;
                    case 1:
                        ?? r9 = this.b.a;
                        if (r9 != 0) {
                            r9.f();
                            return;
                        }
                        return;
                    case 2:
                        IbexFragment ibexFragment2 = this.b.c;
                        e62 e62Var = ibexFragment2.l1;
                        if (e62Var == null) {
                            js3.V("exoPlayer");
                            throw null;
                        }
                        long jD0 = e62Var.d0() + ((long) 10000);
                        e62 e62Var2 = ibexFragment2.l1;
                        if (e62Var2 == null) {
                            js3.V("exoPlayer");
                            throw null;
                        }
                        if (jD0 < e62Var2.getDuration()) {
                            e62 e62Var3 = ibexFragment2.l1;
                            if (e62Var3 != null) {
                                e62Var3.q0(5, jD0);
                                return;
                            } else {
                                js3.V("exoPlayer");
                                throw null;
                            }
                        }
                        e62 e62Var4 = ibexFragment2.l1;
                        if (e62Var4 != null) {
                            e62Var4.q0(5, e62Var4.getDuration());
                            return;
                        } else {
                            js3.V("exoPlayer");
                            throw null;
                        }
                    default:
                        IbexFragment ibexFragment3 = this.b.c;
                        e62 e62Var5 = ibexFragment3.l1;
                        if (e62Var5 == null) {
                            js3.V("exoPlayer");
                            throw null;
                        }
                        long jD02 = e62Var5.d0() - ((long) 10000);
                        if (jD02 > 0) {
                            e62 e62Var6 = ibexFragment3.l1;
                            if (e62Var6 != null) {
                                e62Var6.q0(5, jD02);
                                return;
                            } else {
                                js3.V("exoPlayer");
                                throw null;
                            }
                        }
                        e62 e62Var7 = ibexFragment3.l1;
                        if (e62Var7 != null) {
                            e62Var7.q0(5, 0L);
                            return;
                        } else {
                            js3.V("exoPlayer");
                            throw null;
                        }
                }
            }
        });
        final int i3 = 1;
        imageView4.setOnClickListener(new View.OnClickListener(this) { // from class: vg3
            public final /* synthetic */ IbexController b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, z49] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        k6.i(this.b);
                        return;
                    case 1:
                        ?? r9 = this.b.a;
                        if (r9 != 0) {
                            r9.f();
                            return;
                        }
                        return;
                    case 2:
                        IbexFragment ibexFragment2 = this.b.c;
                        e62 e62Var = ibexFragment2.l1;
                        if (e62Var == null) {
                            js3.V("exoPlayer");
                            throw null;
                        }
                        long jD0 = e62Var.d0() + ((long) 10000);
                        e62 e62Var2 = ibexFragment2.l1;
                        if (e62Var2 == null) {
                            js3.V("exoPlayer");
                            throw null;
                        }
                        if (jD0 < e62Var2.getDuration()) {
                            e62 e62Var3 = ibexFragment2.l1;
                            if (e62Var3 != null) {
                                e62Var3.q0(5, jD0);
                                return;
                            } else {
                                js3.V("exoPlayer");
                                throw null;
                            }
                        }
                        e62 e62Var4 = ibexFragment2.l1;
                        if (e62Var4 != null) {
                            e62Var4.q0(5, e62Var4.getDuration());
                            return;
                        } else {
                            js3.V("exoPlayer");
                            throw null;
                        }
                    default:
                        IbexFragment ibexFragment3 = this.b.c;
                        e62 e62Var5 = ibexFragment3.l1;
                        if (e62Var5 == null) {
                            js3.V("exoPlayer");
                            throw null;
                        }
                        long jD02 = e62Var5.d0() - ((long) 10000);
                        if (jD02 > 0) {
                            e62 e62Var6 = ibexFragment3.l1;
                            if (e62Var6 != null) {
                                e62Var6.q0(5, jD02);
                                return;
                            } else {
                                js3.V("exoPlayer");
                                throw null;
                            }
                        }
                        e62 e62Var7 = ibexFragment3.l1;
                        if (e62Var7 != null) {
                            e62Var7.q0(5, 0L);
                            return;
                        } else {
                            js3.V("exoPlayer");
                            throw null;
                        }
                }
            }
        });
        final int i4 = 2;
        imageView3.setOnClickListener(new View.OnClickListener(this) { // from class: vg3
            public final /* synthetic */ IbexController b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, z49] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i4) {
                    case 0:
                        k6.i(this.b);
                        return;
                    case 1:
                        ?? r9 = this.b.a;
                        if (r9 != 0) {
                            r9.f();
                            return;
                        }
                        return;
                    case 2:
                        IbexFragment ibexFragment2 = this.b.c;
                        e62 e62Var = ibexFragment2.l1;
                        if (e62Var == null) {
                            js3.V("exoPlayer");
                            throw null;
                        }
                        long jD0 = e62Var.d0() + ((long) 10000);
                        e62 e62Var2 = ibexFragment2.l1;
                        if (e62Var2 == null) {
                            js3.V("exoPlayer");
                            throw null;
                        }
                        if (jD0 < e62Var2.getDuration()) {
                            e62 e62Var3 = ibexFragment2.l1;
                            if (e62Var3 != null) {
                                e62Var3.q0(5, jD0);
                                return;
                            } else {
                                js3.V("exoPlayer");
                                throw null;
                            }
                        }
                        e62 e62Var4 = ibexFragment2.l1;
                        if (e62Var4 != null) {
                            e62Var4.q0(5, e62Var4.getDuration());
                            return;
                        } else {
                            js3.V("exoPlayer");
                            throw null;
                        }
                    default:
                        IbexFragment ibexFragment3 = this.b.c;
                        e62 e62Var5 = ibexFragment3.l1;
                        if (e62Var5 == null) {
                            js3.V("exoPlayer");
                            throw null;
                        }
                        long jD02 = e62Var5.d0() - ((long) 10000);
                        if (jD02 > 0) {
                            e62 e62Var6 = ibexFragment3.l1;
                            if (e62Var6 != null) {
                                e62Var6.q0(5, jD02);
                                return;
                            } else {
                                js3.V("exoPlayer");
                                throw null;
                            }
                        }
                        e62 e62Var7 = ibexFragment3.l1;
                        if (e62Var7 != null) {
                            e62Var7.q0(5, 0L);
                            return;
                        } else {
                            js3.V("exoPlayer");
                            throw null;
                        }
                }
            }
        });
        final int i5 = 3;
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: vg3
            public final /* synthetic */ IbexController b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, z49] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i5) {
                    case 0:
                        k6.i(this.b);
                        return;
                    case 1:
                        ?? r9 = this.b.a;
                        if (r9 != 0) {
                            r9.f();
                            return;
                        }
                        return;
                    case 2:
                        IbexFragment ibexFragment2 = this.b.c;
                        e62 e62Var = ibexFragment2.l1;
                        if (e62Var == null) {
                            js3.V("exoPlayer");
                            throw null;
                        }
                        long jD0 = e62Var.d0() + ((long) 10000);
                        e62 e62Var2 = ibexFragment2.l1;
                        if (e62Var2 == null) {
                            js3.V("exoPlayer");
                            throw null;
                        }
                        if (jD0 < e62Var2.getDuration()) {
                            e62 e62Var3 = ibexFragment2.l1;
                            if (e62Var3 != null) {
                                e62Var3.q0(5, jD0);
                                return;
                            } else {
                                js3.V("exoPlayer");
                                throw null;
                            }
                        }
                        e62 e62Var4 = ibexFragment2.l1;
                        if (e62Var4 != null) {
                            e62Var4.q0(5, e62Var4.getDuration());
                            return;
                        } else {
                            js3.V("exoPlayer");
                            throw null;
                        }
                    default:
                        IbexFragment ibexFragment3 = this.b.c;
                        e62 e62Var5 = ibexFragment3.l1;
                        if (e62Var5 == null) {
                            js3.V("exoPlayer");
                            throw null;
                        }
                        long jD02 = e62Var5.d0() - ((long) 10000);
                        if (jD02 > 0) {
                            e62 e62Var6 = ibexFragment3.l1;
                            if (e62Var6 != null) {
                                e62Var6.q0(5, jD02);
                                return;
                            } else {
                                js3.V("exoPlayer");
                                throw null;
                            }
                        }
                        e62 e62Var7 = ibexFragment3.l1;
                        if (e62Var7 != null) {
                            e62Var7.q0(5, 0L);
                            return;
                        } else {
                            js3.V("exoPlayer");
                            throw null;
                        }
                }
            }
        });
        Handler handler = new Handler();
        this.f = handler;
        q6 q6Var = new q6(16, this);
        this.g = q6Var;
        handler.post(q6Var);
    }

    public static final void w(IbexController ibexController) {
        xg3 xg3Var = ibexController.d;
        MyketTextView myketTextView = xg3Var.B;
        lw8 lw8Var = ibexController.e;
        if (lw8Var == null) {
            js3.V("uiUtils");
            throw null;
        }
        IbexFragment ibexFragment = ibexController.c;
        e62 e62Var = ibexFragment.l1;
        if (e62Var == null) {
            js3.V("exoPlayer");
            throw null;
        }
        myketTextView.setText(lw8Var.c((int) e62Var.d0()));
        MyketTextView myketTextView2 = xg3Var.C;
        lw8 lw8Var2 = ibexController.e;
        if (lw8Var2 == null) {
            js3.V("uiUtils");
            throw null;
        }
        e62 e62Var2 = ibexFragment.l1;
        if (e62Var2 == null) {
            js3.V("exoPlayer");
            throw null;
        }
        long duration = e62Var2.getDuration();
        e62 e62Var3 = ibexFragment.l1;
        if (e62Var3 != null) {
            myketTextView2.setText(lw8Var2.c((int) Math.max(duration - e62Var3.d0(), 0L)));
        } else {
            js3.V("exoPlayer");
            throw null;
        }
    }

    @Override // defpackage.k6
    public final void l(boolean z) {
        int i;
        ImageView imageView = this.d.A;
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
        this.d.w.setVisibility(z ? 0 : 8);
    }

    @Override // defpackage.k6
    public final void v(boolean z) {
        ImageView imageView = this.d.A;
        js3.o(imageView, CommonDataKt.RESTRICTION_BUTTON_ACTION_PLAY);
        imageView.setVisibility(!z ? 4 : 0);
    }
}
