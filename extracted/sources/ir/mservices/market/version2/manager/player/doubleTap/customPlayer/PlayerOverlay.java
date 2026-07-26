package ir.mservices.market.version2.manager.player.doubleTap.customPlayer;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import defpackage.b7;
import defpackage.bp2;
import defpackage.bu6;
import defpackage.e62;
import defpackage.js3;
import defpackage.js6;
import defpackage.kr1;
import defpackage.nt6;
import defpackage.o06;
import defpackage.pq6;
import defpackage.rr6;
import defpackage.sj8;
import defpackage.wv8;
import defpackage.xd6;
import defpackage.yk7;
import defpackage.yq6;
import ir.mservices.market.version2.fragments.IbexFragment;
import ir.mservices.market.version2.manager.player.doubleTap.DoubleTapPlayerView;
import ir.mservices.market.version2.manager.player.doubleTap.customPlayer.PlayerOverlay;
import ir.mservices.market.version2.manager.player.doubleTap.customPlayer.views.CircleClipTapView;
import ir.mservices.market.version2.manager.player.doubleTap.customPlayer.views.SecondsView;

/* JADX INFO: loaded from: classes3.dex */
public final class PlayerOverlay extends ConstraintLayout implements xd6 {
    public final ConstraintLayout q;
    public final SecondsView r;
    public final CircleClipTapView s;
    public final int t;
    public DoubleTapPlayerView u;
    public e62 v;
    public wv8 w;
    public final int x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerOverlay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        js3.p(context, "context");
        this.t = -1;
        LayoutInflater.from(context).inflate(js6.player_overlay, (ViewGroup) this, true);
        View viewFindViewById = findViewById(rr6.root_constraint_layout);
        js3.o(viewFindViewById, "findViewById(...)");
        this.q = (ConstraintLayout) viewFindViewById;
        View viewFindViewById2 = findViewById(rr6.seconds_view);
        js3.o(viewFindViewById2, "findViewById(...)");
        SecondsView secondsView = (SecondsView) viewFindViewById2;
        this.r = secondsView;
        View viewFindViewById3 = findViewById(rr6.circle_clip_tap_view);
        js3.o(viewFindViewById3, "findViewById(...)");
        CircleClipTapView circleClipTapView = (CircleClipTapView) viewFindViewById3;
        this.s = circleClipTapView;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, bu6.PlayerOverlay, 0, 0);
            js3.o(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
            this.t = typedArrayObtainStyledAttributes.getResourceId(bu6.PlayerOverlay_player_playerView, -1);
            setAnimationDuration(typedArrayObtainStyledAttributes.getInt(bu6.PlayerOverlay_player_animationDuration, 650));
            this.x = typedArrayObtainStyledAttributes.getInt(bu6.PlayerOverlay_player_seekSeconds, 10);
            setIconAnimationDuration(typedArrayObtainStyledAttributes.getInt(bu6.PlayerOverlay_player_iconAnimationDuration, 750));
            setArcSize$MyKet_primaryClientProductMyketRelease(typedArrayObtainStyledAttributes.getDimensionPixelSize(bu6.PlayerOverlay_player_arcSize, getContext().getResources().getDimensionPixelSize(pq6.dtpv_player_arc_size)));
            setTapCircleColor(typedArrayObtainStyledAttributes.getColor(bu6.PlayerOverlay_player_tapCircleColor, sj8.b().I.c));
            setCircleBackgroundColor(typedArrayObtainStyledAttributes.getColor(bu6.PlayerOverlay_player_backgroundCircleColor, sj8.b().I.c));
            setTextAppearance(typedArrayObtainStyledAttributes.getResourceId(bu6.PlayerOverlay_player_textAppearance, nt6.PlayerSecondsTextAppearance));
            setIcon(typedArrayObtainStyledAttributes.getResourceId(bu6.PlayerOverlay_player_icon, yq6.ic_play));
            typedArrayObtainStyledAttributes.recycle();
        } else {
            setArcSize$MyKet_primaryClientProductMyketRelease(getContext().getResources().getDimensionPixelSize(pq6.dtpv_player_arc_size));
            setTapCircleColor(sj8.b().I.c);
            setCircleBackgroundColor(sj8.b().I.c);
            setAnimationDuration(650L);
            setIconAnimationDuration(750L);
            this.x = 10;
            setTextAppearance(nt6.PlayerSecondsTextAppearance);
        }
        secondsView.setForward(true);
        t(true);
        circleClipTapView.setPerformAtEnd(new o06(5, this));
    }

    private final void setAnimationDuration(long j) {
        this.s.setAnimationDuration(j);
    }

    private final void setCircleBackgroundColor(int i) {
        this.s.setCircleBackgroundColor(i);
    }

    private final void setIcon(int i) {
        SecondsView secondsView = this.r;
        secondsView.t();
        secondsView.setIcon(i);
    }

    private final void setIconAnimationDuration(long j) {
        this.r.setCycleDuration(j);
    }

    private final void setTapCircleColor(int i) {
        this.s.setCircleColor(i);
    }

    private final void setTextAppearance(int i) {
        this.r.getTextView().setTextAppearance(i);
        this.y = i;
    }

    public final long getAnimationDuration() {
        return this.s.getAnimationDuration();
    }

    public final float getArcSize() {
        return this.s.getArcSize();
    }

    public final int getCircleBackgroundColor() {
        return this.s.getCircleBackgroundColor();
    }

    public final int getIcon() {
        return this.r.getIcon();
    }

    public final long getIconAnimationDuration() {
        return this.r.getCycleDuration();
    }

    public final TextView getSecondsTextView() {
        return this.r.getTextView();
    }

    public final int getSeekSeconds() {
        return this.x;
    }

    public final int getTapCircleColor() {
        return this.s.getCircleColor();
    }

    public final int getTextAppearance() {
        return this.y;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.t != -1) {
            Object parent = getParent();
            js3.n(parent, "null cannot be cast to non-null type android.view.View");
            View viewFindViewById = ((View) parent).findViewById(this.t);
            js3.n(viewFindViewById, "null cannot be cast to non-null type ir.mservices.market.version2.manager.player.doubleTap.DoubleTapPlayerView");
            this.u = (DoubleTapPlayerView) viewFindViewById;
        }
    }

    public final void setArcSize$MyKet_primaryClientProductMyketRelease(float f) {
        this.s.setArcSize(f);
    }

    public final void t(boolean z) {
        d dVar = new d();
        ConstraintLayout constraintLayout = this.q;
        dVar.f(constraintLayout);
        SecondsView secondsView = this.r;
        if (z) {
            dVar.e(secondsView.getId(), 7);
            dVar.h(secondsView.getId(), 6, 0, 6);
        } else {
            dVar.e(secondsView.getId(), 6);
            dVar.h(secondsView.getId(), 7, 0, 7);
        }
        secondsView.t();
        yk7 yk7Var = secondsView.D;
        if (yk7Var != null) {
            yk7Var.start();
        }
        dVar.b(constraintLayout);
    }

    public final void u(final float f, final float f2) {
        DoubleTapPlayerView doubleTapPlayerView;
        Boolean boolQ;
        e62 e62Var = this.v;
        if (e62Var == null || (doubleTapPlayerView = this.u) == null) {
            return;
        }
        if (this.w != null) {
            js3.m(doubleTapPlayerView);
            boolQ = wv8.Q(e62Var, doubleTapPlayerView, f);
        } else {
            boolQ = null;
        }
        int visibility = getVisibility();
        SecondsView secondsView = this.r;
        if (visibility != 0) {
            if (boolQ == null) {
                return;
            }
            wv8 wv8Var = this.w;
            if (wv8Var != null) {
                ((DoubleTapPlayerView) wv8Var.b).setUseController(false);
                ((IbexFragment) wv8Var.c).m1().t(false);
                ((PlayerOverlay) wv8Var.d).setVisibility(0);
            }
            secondsView.setVisibility(0);
            secondsView.t();
            yk7 yk7Var = secondsView.D;
            if (yk7Var != null) {
                yk7Var.start();
            }
        }
        boolean zI = js3.i(boolQ, Boolean.FALSE);
        CircleClipTapView circleClipTapView = this.s;
        if (zI) {
            if (secondsView.B) {
                t(false);
                secondsView.setForward(false);
                secondsView.setSeconds(0);
            }
            final int i = 0;
            circleClipTapView.a(new bp2(this) { // from class: gf6
                public final /* synthetic */ PlayerOverlay b;

                {
                    this.b = this;
                }

                @Override // defpackage.bp2
                public final Object invoke() {
                    switch (i) {
                        case 0:
                            this.b.s.c(f, f2);
                            break;
                        default:
                            this.b.s.c(f, f2);
                            break;
                    }
                    return tx8.a;
                }
            });
            secondsView.setSeconds(secondsView.getSeconds() + this.x);
            e62 e62Var2 = this.v;
            v(e62Var2 != null ? Long.valueOf(e62Var2.d0() - ((long) (this.x * 1000))) : null);
            return;
        }
        if (js3.i(boolQ, Boolean.TRUE)) {
            if (!secondsView.B) {
                t(true);
                secondsView.setForward(true);
                secondsView.setSeconds(0);
            }
            final int i2 = 1;
            circleClipTapView.a(new bp2(this) { // from class: gf6
                public final /* synthetic */ PlayerOverlay b;

                {
                    this.b = this;
                }

                @Override // defpackage.bp2
                public final Object invoke() {
                    switch (i2) {
                        case 0:
                            this.b.s.c(f, f2);
                            break;
                        default:
                            this.b.s.c(f, f2);
                            break;
                    }
                    return tx8.a;
                }
            });
            secondsView.setSeconds(secondsView.getSeconds() + this.x);
            e62 e62Var3 = this.v;
            v(e62Var3 != null ? Long.valueOf(e62Var3.d0() + ((long) (this.x * 1000))) : null);
        }
    }

    public final void v(Long l) {
        if (l == null) {
            return;
        }
        if (l.longValue() <= 0) {
            e62 e62Var = this.v;
            if (e62Var != null) {
                e62Var.q0(5, 0L);
                return;
            }
            return;
        }
        e62 e62Var2 = this.v;
        if (e62Var2 != null) {
            long duration = e62Var2.getDuration();
            if (l.longValue() >= duration) {
                e62 e62Var3 = this.v;
                if (e62Var3 != null) {
                    e62Var3.q0(5, duration);
                    return;
                }
                return;
            }
        }
        DoubleTapPlayerView doubleTapPlayerView = this.u;
        if (doubleTapPlayerView != null) {
            kr1 kr1Var = doubleTapPlayerView.I;
            kr1Var.e = true;
            Handler handler = kr1Var.b;
            b7 b7Var = kr1Var.c;
            handler.removeCallbacks(b7Var);
            handler.postDelayed(b7Var, kr1Var.f);
        }
        e62 e62Var4 = this.v;
        if (e62Var4 != null) {
            e62Var4.q0(5, l.longValue());
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PlayerOverlay(Context context) {
        this(context, null);
        js3.p(context, "context");
        setVisibility(4);
    }
}
