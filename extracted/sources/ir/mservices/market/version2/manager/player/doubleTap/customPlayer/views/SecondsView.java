package ir.mservices.market.version2.manager.player.doubleTap.customPlayer.views;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.bp2;
import defpackage.dp2;
import defpackage.js3;
import defpackage.js6;
import defpackage.kh2;
import defpackage.lw8;
import defpackage.rr6;
import defpackage.rs6;
import defpackage.yk7;
import defpackage.yq6;
import defpackage.yz3;
import ir.mservices.market.version2.manager.player.doubleTap.customPlayer.views.SecondsView;

/* JADX INFO: loaded from: classes3.dex */
public final class SecondsView extends Hilt_SecondsView {
    public static final /* synthetic */ int I = 0;
    public int A;
    public boolean B;
    public int C;
    public yk7 D;
    public yk7 E;
    public yk7 F;
    public yk7 G;
    public yk7 H;
    public lw8 s;
    public final LinearLayout t;
    public final TextView u;
    public final ImageView v;
    public final ImageView w;
    public final ImageView x;
    public ValueAnimator y;
    public long z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SecondsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        js3.p(context, "context");
        LayoutInflater.from(context).inflate(js6.player_seconds_view, (ViewGroup) this, true);
        View viewFindViewById = findViewById(rr6.triangle_container);
        js3.o(viewFindViewById, "findViewById(...)");
        LinearLayout linearLayout = (LinearLayout) viewFindViewById;
        this.t = linearLayout;
        View viewFindViewById2 = findViewById(rr6.tv_seconds);
        js3.o(viewFindViewById2, "findViewById(...)");
        this.u = (TextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(rr6.icon_1);
        js3.o(viewFindViewById3, "findViewById(...)");
        this.v = (ImageView) viewFindViewById3;
        View viewFindViewById4 = findViewById(rr6.icon_2);
        js3.o(viewFindViewById4, "findViewById(...)");
        this.w = (ImageView) viewFindViewById4;
        View viewFindViewById5 = findViewById(rr6.icon_3);
        js3.o(viewFindViewById5, "findViewById(...)");
        this.x = (ImageView) viewFindViewById5;
        linearLayout.setLayoutDirection(0);
        this.z = 750L;
        this.B = true;
        this.C = yq6.ic_play;
        final int i = 0;
        final int i2 = 3;
        final int i3 = 8;
        this.D = new yk7(this, new bp2(this) { // from class: wk7
            public final /* synthetic */ SecondsView b;

            {
                this.b = this;
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                switch (i) {
                    case 0:
                        SecondsView secondsView = this.b;
                        secondsView.v.setAlpha(0.0f);
                        secondsView.w.setAlpha(0.0f);
                        secondsView.x.setAlpha(0.0f);
                        break;
                    case 1:
                        yk7 yk7Var = this.b.F;
                        if (yk7Var != null) {
                            yk7Var.start();
                        }
                        return tx8.a;
                    case 2:
                        SecondsView secondsView2 = this.b;
                        secondsView2.v.setAlpha(1.0f);
                        secondsView2.w.setAlpha(1.0f);
                        secondsView2.x.setAlpha(0.0f);
                        break;
                    case 3:
                        yk7 yk7Var2 = this.b.G;
                        if (yk7Var2 != null) {
                            yk7Var2.start();
                        }
                        return tx8.a;
                    case 4:
                        SecondsView secondsView3 = this.b;
                        secondsView3.v.setAlpha(0.0f);
                        secondsView3.w.setAlpha(1.0f);
                        secondsView3.x.setAlpha(1.0f);
                        break;
                    case 5:
                        yk7 yk7Var3 = this.b.H;
                        if (yk7Var3 != null) {
                            yk7Var3.start();
                        }
                        return tx8.a;
                    case 6:
                        SecondsView secondsView4 = this.b;
                        secondsView4.v.setAlpha(0.0f);
                        secondsView4.w.setAlpha(0.0f);
                        secondsView4.x.setAlpha(1.0f);
                        break;
                    case 7:
                        yk7 yk7Var4 = this.b.D;
                        if (yk7Var4 != null) {
                            yk7Var4.start();
                        }
                        return tx8.a;
                    case 8:
                        yk7 yk7Var5 = this.b.E;
                        if (yk7Var5 != null) {
                            yk7Var5.start();
                        }
                        return tx8.a;
                    default:
                        SecondsView secondsView5 = this.b;
                        secondsView5.v.setAlpha(1.0f);
                        secondsView5.w.setAlpha(0.0f);
                        secondsView5.x.setAlpha(0.0f);
                        break;
                }
                return tx8.a;
            }
        }, new dp2(this) { // from class: xk7
            public final /* synthetic */ SecondsView b;

            {
                this.b = this;
            }

            @Override // defpackage.dp2
            public final Object invoke(Object obj) {
                int i4 = i2;
                float fFloatValue = ((Float) obj).floatValue();
                switch (i4) {
                    case 0:
                        SecondsView secondsView = this.b;
                        ImageView imageView = secondsView.v;
                        ImageView imageView2 = secondsView.x;
                        imageView.setAlpha(1.0f - imageView2.getAlpha());
                        imageView2.setAlpha(fFloatValue);
                        break;
                    case 1:
                        this.b.w.setAlpha(1.0f - fFloatValue);
                        break;
                    case 2:
                        this.b.x.setAlpha(1.0f - fFloatValue);
                        break;
                    case 3:
                        this.b.v.setAlpha(fFloatValue);
                        break;
                    default:
                        this.b.w.setAlpha(fFloatValue);
                        break;
                }
                return tx8.a;
            }
        }, new bp2(this) { // from class: wk7
            public final /* synthetic */ SecondsView b;

            {
                this.b = this;
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        SecondsView secondsView = this.b;
                        secondsView.v.setAlpha(0.0f);
                        secondsView.w.setAlpha(0.0f);
                        secondsView.x.setAlpha(0.0f);
                        break;
                    case 1:
                        yk7 yk7Var = this.b.F;
                        if (yk7Var != null) {
                            yk7Var.start();
                        }
                        return tx8.a;
                    case 2:
                        SecondsView secondsView2 = this.b;
                        secondsView2.v.setAlpha(1.0f);
                        secondsView2.w.setAlpha(1.0f);
                        secondsView2.x.setAlpha(0.0f);
                        break;
                    case 3:
                        yk7 yk7Var2 = this.b.G;
                        if (yk7Var2 != null) {
                            yk7Var2.start();
                        }
                        return tx8.a;
                    case 4:
                        SecondsView secondsView3 = this.b;
                        secondsView3.v.setAlpha(0.0f);
                        secondsView3.w.setAlpha(1.0f);
                        secondsView3.x.setAlpha(1.0f);
                        break;
                    case 5:
                        yk7 yk7Var3 = this.b.H;
                        if (yk7Var3 != null) {
                            yk7Var3.start();
                        }
                        return tx8.a;
                    case 6:
                        SecondsView secondsView4 = this.b;
                        secondsView4.v.setAlpha(0.0f);
                        secondsView4.w.setAlpha(0.0f);
                        secondsView4.x.setAlpha(1.0f);
                        break;
                    case 7:
                        yk7 yk7Var4 = this.b.D;
                        if (yk7Var4 != null) {
                            yk7Var4.start();
                        }
                        return tx8.a;
                    case 8:
                        yk7 yk7Var5 = this.b.E;
                        if (yk7Var5 != null) {
                            yk7Var5.start();
                        }
                        return tx8.a;
                    default:
                        SecondsView secondsView5 = this.b;
                        secondsView5.v.setAlpha(1.0f);
                        secondsView5.w.setAlpha(0.0f);
                        secondsView5.x.setAlpha(0.0f);
                        break;
                }
                return tx8.a;
            }
        });
        final int i4 = 9;
        final int i5 = 4;
        final int i6 = 1;
        this.E = new yk7(this, new bp2(this) { // from class: wk7
            public final /* synthetic */ SecondsView b;

            {
                this.b = this;
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        SecondsView secondsView = this.b;
                        secondsView.v.setAlpha(0.0f);
                        secondsView.w.setAlpha(0.0f);
                        secondsView.x.setAlpha(0.0f);
                        break;
                    case 1:
                        yk7 yk7Var = this.b.F;
                        if (yk7Var != null) {
                            yk7Var.start();
                        }
                        return tx8.a;
                    case 2:
                        SecondsView secondsView2 = this.b;
                        secondsView2.v.setAlpha(1.0f);
                        secondsView2.w.setAlpha(1.0f);
                        secondsView2.x.setAlpha(0.0f);
                        break;
                    case 3:
                        yk7 yk7Var2 = this.b.G;
                        if (yk7Var2 != null) {
                            yk7Var2.start();
                        }
                        return tx8.a;
                    case 4:
                        SecondsView secondsView3 = this.b;
                        secondsView3.v.setAlpha(0.0f);
                        secondsView3.w.setAlpha(1.0f);
                        secondsView3.x.setAlpha(1.0f);
                        break;
                    case 5:
                        yk7 yk7Var3 = this.b.H;
                        if (yk7Var3 != null) {
                            yk7Var3.start();
                        }
                        return tx8.a;
                    case 6:
                        SecondsView secondsView4 = this.b;
                        secondsView4.v.setAlpha(0.0f);
                        secondsView4.w.setAlpha(0.0f);
                        secondsView4.x.setAlpha(1.0f);
                        break;
                    case 7:
                        yk7 yk7Var4 = this.b.D;
                        if (yk7Var4 != null) {
                            yk7Var4.start();
                        }
                        return tx8.a;
                    case 8:
                        yk7 yk7Var5 = this.b.E;
                        if (yk7Var5 != null) {
                            yk7Var5.start();
                        }
                        return tx8.a;
                    default:
                        SecondsView secondsView5 = this.b;
                        secondsView5.v.setAlpha(1.0f);
                        secondsView5.w.setAlpha(0.0f);
                        secondsView5.x.setAlpha(0.0f);
                        break;
                }
                return tx8.a;
            }
        }, new dp2(this) { // from class: xk7
            public final /* synthetic */ SecondsView b;

            {
                this.b = this;
            }

            @Override // defpackage.dp2
            public final Object invoke(Object obj) {
                int i42 = i5;
                float fFloatValue = ((Float) obj).floatValue();
                switch (i42) {
                    case 0:
                        SecondsView secondsView = this.b;
                        ImageView imageView = secondsView.v;
                        ImageView imageView2 = secondsView.x;
                        imageView.setAlpha(1.0f - imageView2.getAlpha());
                        imageView2.setAlpha(fFloatValue);
                        break;
                    case 1:
                        this.b.w.setAlpha(1.0f - fFloatValue);
                        break;
                    case 2:
                        this.b.x.setAlpha(1.0f - fFloatValue);
                        break;
                    case 3:
                        this.b.v.setAlpha(fFloatValue);
                        break;
                    default:
                        this.b.w.setAlpha(fFloatValue);
                        break;
                }
                return tx8.a;
            }
        }, new bp2(this) { // from class: wk7
            public final /* synthetic */ SecondsView b;

            {
                this.b = this;
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                switch (i6) {
                    case 0:
                        SecondsView secondsView = this.b;
                        secondsView.v.setAlpha(0.0f);
                        secondsView.w.setAlpha(0.0f);
                        secondsView.x.setAlpha(0.0f);
                        break;
                    case 1:
                        yk7 yk7Var = this.b.F;
                        if (yk7Var != null) {
                            yk7Var.start();
                        }
                        return tx8.a;
                    case 2:
                        SecondsView secondsView2 = this.b;
                        secondsView2.v.setAlpha(1.0f);
                        secondsView2.w.setAlpha(1.0f);
                        secondsView2.x.setAlpha(0.0f);
                        break;
                    case 3:
                        yk7 yk7Var2 = this.b.G;
                        if (yk7Var2 != null) {
                            yk7Var2.start();
                        }
                        return tx8.a;
                    case 4:
                        SecondsView secondsView3 = this.b;
                        secondsView3.v.setAlpha(0.0f);
                        secondsView3.w.setAlpha(1.0f);
                        secondsView3.x.setAlpha(1.0f);
                        break;
                    case 5:
                        yk7 yk7Var3 = this.b.H;
                        if (yk7Var3 != null) {
                            yk7Var3.start();
                        }
                        return tx8.a;
                    case 6:
                        SecondsView secondsView4 = this.b;
                        secondsView4.v.setAlpha(0.0f);
                        secondsView4.w.setAlpha(0.0f);
                        secondsView4.x.setAlpha(1.0f);
                        break;
                    case 7:
                        yk7 yk7Var4 = this.b.D;
                        if (yk7Var4 != null) {
                            yk7Var4.start();
                        }
                        return tx8.a;
                    case 8:
                        yk7 yk7Var5 = this.b.E;
                        if (yk7Var5 != null) {
                            yk7Var5.start();
                        }
                        return tx8.a;
                    default:
                        SecondsView secondsView5 = this.b;
                        secondsView5.v.setAlpha(1.0f);
                        secondsView5.w.setAlpha(0.0f);
                        secondsView5.x.setAlpha(0.0f);
                        break;
                }
                return tx8.a;
            }
        });
        final int i7 = 2;
        final int i8 = 0;
        final int i9 = 3;
        this.F = new yk7(this, new bp2(this) { // from class: wk7
            public final /* synthetic */ SecondsView b;

            {
                this.b = this;
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        SecondsView secondsView = this.b;
                        secondsView.v.setAlpha(0.0f);
                        secondsView.w.setAlpha(0.0f);
                        secondsView.x.setAlpha(0.0f);
                        break;
                    case 1:
                        yk7 yk7Var = this.b.F;
                        if (yk7Var != null) {
                            yk7Var.start();
                        }
                        return tx8.a;
                    case 2:
                        SecondsView secondsView2 = this.b;
                        secondsView2.v.setAlpha(1.0f);
                        secondsView2.w.setAlpha(1.0f);
                        secondsView2.x.setAlpha(0.0f);
                        break;
                    case 3:
                        yk7 yk7Var2 = this.b.G;
                        if (yk7Var2 != null) {
                            yk7Var2.start();
                        }
                        return tx8.a;
                    case 4:
                        SecondsView secondsView3 = this.b;
                        secondsView3.v.setAlpha(0.0f);
                        secondsView3.w.setAlpha(1.0f);
                        secondsView3.x.setAlpha(1.0f);
                        break;
                    case 5:
                        yk7 yk7Var3 = this.b.H;
                        if (yk7Var3 != null) {
                            yk7Var3.start();
                        }
                        return tx8.a;
                    case 6:
                        SecondsView secondsView4 = this.b;
                        secondsView4.v.setAlpha(0.0f);
                        secondsView4.w.setAlpha(0.0f);
                        secondsView4.x.setAlpha(1.0f);
                        break;
                    case 7:
                        yk7 yk7Var4 = this.b.D;
                        if (yk7Var4 != null) {
                            yk7Var4.start();
                        }
                        return tx8.a;
                    case 8:
                        yk7 yk7Var5 = this.b.E;
                        if (yk7Var5 != null) {
                            yk7Var5.start();
                        }
                        return tx8.a;
                    default:
                        SecondsView secondsView5 = this.b;
                        secondsView5.v.setAlpha(1.0f);
                        secondsView5.w.setAlpha(0.0f);
                        secondsView5.x.setAlpha(0.0f);
                        break;
                }
                return tx8.a;
            }
        }, new dp2(this) { // from class: xk7
            public final /* synthetic */ SecondsView b;

            {
                this.b = this;
            }

            @Override // defpackage.dp2
            public final Object invoke(Object obj) {
                int i42 = i8;
                float fFloatValue = ((Float) obj).floatValue();
                switch (i42) {
                    case 0:
                        SecondsView secondsView = this.b;
                        ImageView imageView = secondsView.v;
                        ImageView imageView2 = secondsView.x;
                        imageView.setAlpha(1.0f - imageView2.getAlpha());
                        imageView2.setAlpha(fFloatValue);
                        break;
                    case 1:
                        this.b.w.setAlpha(1.0f - fFloatValue);
                        break;
                    case 2:
                        this.b.x.setAlpha(1.0f - fFloatValue);
                        break;
                    case 3:
                        this.b.v.setAlpha(fFloatValue);
                        break;
                    default:
                        this.b.w.setAlpha(fFloatValue);
                        break;
                }
                return tx8.a;
            }
        }, new bp2(this) { // from class: wk7
            public final /* synthetic */ SecondsView b;

            {
                this.b = this;
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                switch (i9) {
                    case 0:
                        SecondsView secondsView = this.b;
                        secondsView.v.setAlpha(0.0f);
                        secondsView.w.setAlpha(0.0f);
                        secondsView.x.setAlpha(0.0f);
                        break;
                    case 1:
                        yk7 yk7Var = this.b.F;
                        if (yk7Var != null) {
                            yk7Var.start();
                        }
                        return tx8.a;
                    case 2:
                        SecondsView secondsView2 = this.b;
                        secondsView2.v.setAlpha(1.0f);
                        secondsView2.w.setAlpha(1.0f);
                        secondsView2.x.setAlpha(0.0f);
                        break;
                    case 3:
                        yk7 yk7Var2 = this.b.G;
                        if (yk7Var2 != null) {
                            yk7Var2.start();
                        }
                        return tx8.a;
                    case 4:
                        SecondsView secondsView3 = this.b;
                        secondsView3.v.setAlpha(0.0f);
                        secondsView3.w.setAlpha(1.0f);
                        secondsView3.x.setAlpha(1.0f);
                        break;
                    case 5:
                        yk7 yk7Var3 = this.b.H;
                        if (yk7Var3 != null) {
                            yk7Var3.start();
                        }
                        return tx8.a;
                    case 6:
                        SecondsView secondsView4 = this.b;
                        secondsView4.v.setAlpha(0.0f);
                        secondsView4.w.setAlpha(0.0f);
                        secondsView4.x.setAlpha(1.0f);
                        break;
                    case 7:
                        yk7 yk7Var4 = this.b.D;
                        if (yk7Var4 != null) {
                            yk7Var4.start();
                        }
                        return tx8.a;
                    case 8:
                        yk7 yk7Var5 = this.b.E;
                        if (yk7Var5 != null) {
                            yk7Var5.start();
                        }
                        return tx8.a;
                    default:
                        SecondsView secondsView5 = this.b;
                        secondsView5.v.setAlpha(1.0f);
                        secondsView5.w.setAlpha(0.0f);
                        secondsView5.x.setAlpha(0.0f);
                        break;
                }
                return tx8.a;
            }
        });
        final int i10 = 4;
        final int i11 = 1;
        final int i12 = 5;
        this.G = new yk7(this, new bp2(this) { // from class: wk7
            public final /* synthetic */ SecondsView b;

            {
                this.b = this;
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        SecondsView secondsView = this.b;
                        secondsView.v.setAlpha(0.0f);
                        secondsView.w.setAlpha(0.0f);
                        secondsView.x.setAlpha(0.0f);
                        break;
                    case 1:
                        yk7 yk7Var = this.b.F;
                        if (yk7Var != null) {
                            yk7Var.start();
                        }
                        return tx8.a;
                    case 2:
                        SecondsView secondsView2 = this.b;
                        secondsView2.v.setAlpha(1.0f);
                        secondsView2.w.setAlpha(1.0f);
                        secondsView2.x.setAlpha(0.0f);
                        break;
                    case 3:
                        yk7 yk7Var2 = this.b.G;
                        if (yk7Var2 != null) {
                            yk7Var2.start();
                        }
                        return tx8.a;
                    case 4:
                        SecondsView secondsView3 = this.b;
                        secondsView3.v.setAlpha(0.0f);
                        secondsView3.w.setAlpha(1.0f);
                        secondsView3.x.setAlpha(1.0f);
                        break;
                    case 5:
                        yk7 yk7Var3 = this.b.H;
                        if (yk7Var3 != null) {
                            yk7Var3.start();
                        }
                        return tx8.a;
                    case 6:
                        SecondsView secondsView4 = this.b;
                        secondsView4.v.setAlpha(0.0f);
                        secondsView4.w.setAlpha(0.0f);
                        secondsView4.x.setAlpha(1.0f);
                        break;
                    case 7:
                        yk7 yk7Var4 = this.b.D;
                        if (yk7Var4 != null) {
                            yk7Var4.start();
                        }
                        return tx8.a;
                    case 8:
                        yk7 yk7Var5 = this.b.E;
                        if (yk7Var5 != null) {
                            yk7Var5.start();
                        }
                        return tx8.a;
                    default:
                        SecondsView secondsView5 = this.b;
                        secondsView5.v.setAlpha(1.0f);
                        secondsView5.w.setAlpha(0.0f);
                        secondsView5.x.setAlpha(0.0f);
                        break;
                }
                return tx8.a;
            }
        }, new dp2(this) { // from class: xk7
            public final /* synthetic */ SecondsView b;

            {
                this.b = this;
            }

            @Override // defpackage.dp2
            public final Object invoke(Object obj) {
                int i42 = i11;
                float fFloatValue = ((Float) obj).floatValue();
                switch (i42) {
                    case 0:
                        SecondsView secondsView = this.b;
                        ImageView imageView = secondsView.v;
                        ImageView imageView2 = secondsView.x;
                        imageView.setAlpha(1.0f - imageView2.getAlpha());
                        imageView2.setAlpha(fFloatValue);
                        break;
                    case 1:
                        this.b.w.setAlpha(1.0f - fFloatValue);
                        break;
                    case 2:
                        this.b.x.setAlpha(1.0f - fFloatValue);
                        break;
                    case 3:
                        this.b.v.setAlpha(fFloatValue);
                        break;
                    default:
                        this.b.w.setAlpha(fFloatValue);
                        break;
                }
                return tx8.a;
            }
        }, new bp2(this) { // from class: wk7
            public final /* synthetic */ SecondsView b;

            {
                this.b = this;
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        SecondsView secondsView = this.b;
                        secondsView.v.setAlpha(0.0f);
                        secondsView.w.setAlpha(0.0f);
                        secondsView.x.setAlpha(0.0f);
                        break;
                    case 1:
                        yk7 yk7Var = this.b.F;
                        if (yk7Var != null) {
                            yk7Var.start();
                        }
                        return tx8.a;
                    case 2:
                        SecondsView secondsView2 = this.b;
                        secondsView2.v.setAlpha(1.0f);
                        secondsView2.w.setAlpha(1.0f);
                        secondsView2.x.setAlpha(0.0f);
                        break;
                    case 3:
                        yk7 yk7Var2 = this.b.G;
                        if (yk7Var2 != null) {
                            yk7Var2.start();
                        }
                        return tx8.a;
                    case 4:
                        SecondsView secondsView3 = this.b;
                        secondsView3.v.setAlpha(0.0f);
                        secondsView3.w.setAlpha(1.0f);
                        secondsView3.x.setAlpha(1.0f);
                        break;
                    case 5:
                        yk7 yk7Var3 = this.b.H;
                        if (yk7Var3 != null) {
                            yk7Var3.start();
                        }
                        return tx8.a;
                    case 6:
                        SecondsView secondsView4 = this.b;
                        secondsView4.v.setAlpha(0.0f);
                        secondsView4.w.setAlpha(0.0f);
                        secondsView4.x.setAlpha(1.0f);
                        break;
                    case 7:
                        yk7 yk7Var4 = this.b.D;
                        if (yk7Var4 != null) {
                            yk7Var4.start();
                        }
                        return tx8.a;
                    case 8:
                        yk7 yk7Var5 = this.b.E;
                        if (yk7Var5 != null) {
                            yk7Var5.start();
                        }
                        return tx8.a;
                    default:
                        SecondsView secondsView5 = this.b;
                        secondsView5.v.setAlpha(1.0f);
                        secondsView5.w.setAlpha(0.0f);
                        secondsView5.x.setAlpha(0.0f);
                        break;
                }
                return tx8.a;
            }
        });
        final int i13 = 6;
        final int i14 = 2;
        final int i15 = 7;
        this.H = new yk7(this, new bp2(this) { // from class: wk7
            public final /* synthetic */ SecondsView b;

            {
                this.b = this;
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        SecondsView secondsView = this.b;
                        secondsView.v.setAlpha(0.0f);
                        secondsView.w.setAlpha(0.0f);
                        secondsView.x.setAlpha(0.0f);
                        break;
                    case 1:
                        yk7 yk7Var = this.b.F;
                        if (yk7Var != null) {
                            yk7Var.start();
                        }
                        return tx8.a;
                    case 2:
                        SecondsView secondsView2 = this.b;
                        secondsView2.v.setAlpha(1.0f);
                        secondsView2.w.setAlpha(1.0f);
                        secondsView2.x.setAlpha(0.0f);
                        break;
                    case 3:
                        yk7 yk7Var2 = this.b.G;
                        if (yk7Var2 != null) {
                            yk7Var2.start();
                        }
                        return tx8.a;
                    case 4:
                        SecondsView secondsView3 = this.b;
                        secondsView3.v.setAlpha(0.0f);
                        secondsView3.w.setAlpha(1.0f);
                        secondsView3.x.setAlpha(1.0f);
                        break;
                    case 5:
                        yk7 yk7Var3 = this.b.H;
                        if (yk7Var3 != null) {
                            yk7Var3.start();
                        }
                        return tx8.a;
                    case 6:
                        SecondsView secondsView4 = this.b;
                        secondsView4.v.setAlpha(0.0f);
                        secondsView4.w.setAlpha(0.0f);
                        secondsView4.x.setAlpha(1.0f);
                        break;
                    case 7:
                        yk7 yk7Var4 = this.b.D;
                        if (yk7Var4 != null) {
                            yk7Var4.start();
                        }
                        return tx8.a;
                    case 8:
                        yk7 yk7Var5 = this.b.E;
                        if (yk7Var5 != null) {
                            yk7Var5.start();
                        }
                        return tx8.a;
                    default:
                        SecondsView secondsView5 = this.b;
                        secondsView5.v.setAlpha(1.0f);
                        secondsView5.w.setAlpha(0.0f);
                        secondsView5.x.setAlpha(0.0f);
                        break;
                }
                return tx8.a;
            }
        }, new dp2(this) { // from class: xk7
            public final /* synthetic */ SecondsView b;

            {
                this.b = this;
            }

            @Override // defpackage.dp2
            public final Object invoke(Object obj) {
                int i42 = i14;
                float fFloatValue = ((Float) obj).floatValue();
                switch (i42) {
                    case 0:
                        SecondsView secondsView = this.b;
                        ImageView imageView = secondsView.v;
                        ImageView imageView2 = secondsView.x;
                        imageView.setAlpha(1.0f - imageView2.getAlpha());
                        imageView2.setAlpha(fFloatValue);
                        break;
                    case 1:
                        this.b.w.setAlpha(1.0f - fFloatValue);
                        break;
                    case 2:
                        this.b.x.setAlpha(1.0f - fFloatValue);
                        break;
                    case 3:
                        this.b.v.setAlpha(fFloatValue);
                        break;
                    default:
                        this.b.w.setAlpha(fFloatValue);
                        break;
                }
                return tx8.a;
            }
        }, new bp2(this) { // from class: wk7
            public final /* synthetic */ SecondsView b;

            {
                this.b = this;
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        SecondsView secondsView = this.b;
                        secondsView.v.setAlpha(0.0f);
                        secondsView.w.setAlpha(0.0f);
                        secondsView.x.setAlpha(0.0f);
                        break;
                    case 1:
                        yk7 yk7Var = this.b.F;
                        if (yk7Var != null) {
                            yk7Var.start();
                        }
                        return tx8.a;
                    case 2:
                        SecondsView secondsView2 = this.b;
                        secondsView2.v.setAlpha(1.0f);
                        secondsView2.w.setAlpha(1.0f);
                        secondsView2.x.setAlpha(0.0f);
                        break;
                    case 3:
                        yk7 yk7Var2 = this.b.G;
                        if (yk7Var2 != null) {
                            yk7Var2.start();
                        }
                        return tx8.a;
                    case 4:
                        SecondsView secondsView3 = this.b;
                        secondsView3.v.setAlpha(0.0f);
                        secondsView3.w.setAlpha(1.0f);
                        secondsView3.x.setAlpha(1.0f);
                        break;
                    case 5:
                        yk7 yk7Var3 = this.b.H;
                        if (yk7Var3 != null) {
                            yk7Var3.start();
                        }
                        return tx8.a;
                    case 6:
                        SecondsView secondsView4 = this.b;
                        secondsView4.v.setAlpha(0.0f);
                        secondsView4.w.setAlpha(0.0f);
                        secondsView4.x.setAlpha(1.0f);
                        break;
                    case 7:
                        yk7 yk7Var4 = this.b.D;
                        if (yk7Var4 != null) {
                            yk7Var4.start();
                        }
                        return tx8.a;
                    case 8:
                        yk7 yk7Var5 = this.b.E;
                        if (yk7Var5 != null) {
                            yk7Var5.start();
                        }
                        return tx8.a;
                    default:
                        SecondsView secondsView5 = this.b;
                        secondsView5.v.setAlpha(1.0f);
                        secondsView5.w.setAlpha(0.0f);
                        secondsView5.x.setAlpha(0.0f);
                        break;
                }
                return tx8.a;
            }
        });
    }

    public final long getCycleDuration() {
        return this.z;
    }

    public final int getIcon() {
        return this.C;
    }

    public final int getSeconds() {
        return this.A;
    }

    public final TextView getTextView() {
        return this.u;
    }

    public final lw8 getUiUtils() {
        lw8 lw8Var = this.s;
        if (lw8Var != null) {
            return lw8Var;
        }
        js3.V("uiUtils");
        throw null;
    }

    public final void setCycleDuration(long j) {
        yk7 yk7Var = this.D;
        if (yk7Var != null) {
            yk7Var.setDuration(j / ((long) 5));
        }
        yk7 yk7Var2 = this.E;
        if (yk7Var2 != null) {
            yk7Var2.setDuration(j / ((long) 5));
        }
        yk7 yk7Var3 = this.F;
        if (yk7Var3 != null) {
            yk7Var3.setDuration(j / ((long) 5));
        }
        yk7 yk7Var4 = this.G;
        if (yk7Var4 != null) {
            yk7Var4.setDuration(j / ((long) 5));
        }
        yk7 yk7Var5 = this.H;
        if (yk7Var5 != null) {
            yk7Var5.setDuration(j / ((long) 5));
        }
        this.z = j;
    }

    public final void setForward(boolean z) {
        this.t.setRotation(z ? 0.0f : 180.0f);
        this.B = z;
    }

    public final void setIcon(int i) {
        if (i > 0) {
            this.v.setImageResource(i);
            this.w.setImageResource(i);
            this.x.setImageResource(i);
        }
        this.C = i;
    }

    public final void setSeconds(int i) {
        String strE = lw8.e(getUiUtils(), this.B ? getContext().getResources().getString(rs6.forward_ten_second, Integer.valueOf(i)) : getContext().getResources().getString(rs6.backward_ten_second, Integer.valueOf(i)));
        TextView textView = this.u;
        textView.setText(strE);
        textView.setTypeface((Typeface) kh2.b.a.b);
        textView.setTextSize(18.0f);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 1.5f, 1.0f);
        valueAnimatorOfFloat.setDuration(500L);
        valueAnimatorOfFloat.addUpdateListener(new yz3(1, textView));
        valueAnimatorOfFloat.start();
        this.y = valueAnimatorOfFloat;
        this.A = i;
    }

    public final void setUiUtils(lw8 lw8Var) {
        js3.p(lw8Var, "<set-?>");
        this.s = lw8Var;
    }

    public final void t() {
        yk7 yk7Var = this.D;
        if (yk7Var != null) {
            yk7Var.cancel();
        }
        yk7 yk7Var2 = this.E;
        if (yk7Var2 != null) {
            yk7Var2.cancel();
        }
        yk7 yk7Var3 = this.F;
        if (yk7Var3 != null) {
            yk7Var3.cancel();
        }
        yk7 yk7Var4 = this.G;
        if (yk7Var4 != null) {
            yk7Var4.cancel();
        }
        yk7 yk7Var5 = this.H;
        if (yk7Var5 != null) {
            yk7Var5.cancel();
        }
        ValueAnimator valueAnimator = this.y;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
        }
        ValueAnimator valueAnimator2 = this.y;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.v.setAlpha(0.0f);
        this.w.setAlpha(0.0f);
        this.x.setAlpha(0.0f);
    }
}
