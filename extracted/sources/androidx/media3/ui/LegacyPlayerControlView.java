package androidx.media3.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.media3.ui.LegacyPlayerControlView;
import defpackage.am8;
import defpackage.bt6;
import defpackage.gb6;
import defpackage.gs6;
import defpackage.hs6;
import defpackage.ir6;
import defpackage.j29;
import defpackage.ju6;
import defpackage.ll8;
import defpackage.lp4;
import defpackage.t44;
import defpackage.u44;
import defpackage.v44;
import defpackage.vq6;
import defpackage.vy2;
import defpackage.yl8;
import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class LegacyPlayerControlView extends FrameLayout {
    public static final /* synthetic */ int B0 = 0;
    public final Drawable A;
    public long A0;
    public final Drawable B;
    public final float C;
    public final float D;
    public final String E;
    public final String F;
    public gb6 G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public int M;
    public int N;
    public int O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public long U;
    public long[] V;
    public boolean[] W;
    public final u44 a;
    public final CopyOnWriteArrayList b;
    public final View c;
    public final View d;
    public final View e;
    public final View f;
    public final View g;
    public final View h;
    public final ImageView i;
    public final ImageView j;
    public final View k;
    public final TextView l;
    public final TextView m;
    public final ll8 n;
    public final StringBuilder o;
    public final Formatter p;
    public final yl8 q;
    public final am8 r;
    public final t44 s;
    public final t44 t;
    public final Drawable u;
    public final Drawable v;
    public final Drawable w;
    public final String x;
    public long[] x0;
    public final String y;
    public boolean[] y0;
    public final String z;
    public long z0;

    static {
        lp4.a("media3.ui");
    }

    public LegacyPlayerControlView(Context context) {
        this(context, null);
    }

    public final void a() {
        if (c()) {
            setVisibility(8);
            Iterator it = this.b.iterator();
            if (it.hasNext()) {
                if (it.next() != null) {
                    throw new ClassCastException();
                }
                getVisibility();
                throw null;
            }
            removeCallbacks(this.s);
            removeCallbacks(this.t);
            this.U = -9223372036854775807L;
        }
    }

    public final void b() {
        t44 t44Var = this.t;
        removeCallbacks(t44Var);
        if (this.M <= 0) {
            this.U = -9223372036854775807L;
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        long j = this.M;
        this.U = jUptimeMillis + j;
        if (this.H) {
            postDelayed(t44Var, j);
        }
    }

    public final boolean c() {
        return getVisibility() == 0;
    }

    public final void d(boolean z, boolean z2, View view) {
        if (view == null) {
            return;
        }
        view.setEnabled(z2);
        view.setAlpha(z2 ? this.C : this.D);
        view.setVisibility(z ? 0 : 8);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        gb6 gb6Var = this.G;
        if (gb6Var == null || !(keyCode == 90 || keyCode == 89 || keyCode == 85 || keyCode == 79 || keyCode == 126 || keyCode == 127 || keyCode == 87 || keyCode == 88)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getAction() != 0) {
            return true;
        }
        if (keyCode == 90) {
            if (gb6Var.e() == 4) {
                return true;
            }
            gb6Var.Y();
            return true;
        }
        if (keyCode == 89) {
            gb6Var.a0();
            return true;
        }
        if (keyEvent.getRepeatCount() != 0) {
            return true;
        }
        if (keyCode == 79 || keyCode == 85) {
            j29.N(gb6Var, this.J);
            return true;
        }
        if (keyCode == 87) {
            gb6Var.X();
            return true;
        }
        if (keyCode == 88) {
            gb6Var.z();
            return true;
        }
        if (keyCode == 126) {
            j29.M(gb6Var);
            return true;
        }
        if (keyCode != 127) {
            return true;
        }
        j29.L(gb6Var);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            removeCallbacks(this.t);
        } else if (motionEvent.getAction() == 1) {
            b();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e() {
        boolean zF0;
        boolean zF02;
        boolean zF03;
        boolean zF04;
        boolean zF05;
        if (c() && this.H) {
            gb6 gb6Var = this.G;
            if (gb6Var != null) {
                zF0 = gb6Var.f0(5);
                zF03 = gb6Var.f0(7);
                zF04 = gb6Var.f0(11);
                zF05 = gb6Var.f0(12);
                zF02 = gb6Var.f0(9);
            } else {
                zF0 = false;
                zF02 = false;
                zF03 = false;
                zF04 = false;
                zF05 = false;
            }
            d(this.R, zF03, this.c);
            d(this.P, zF04, this.h);
            d(this.Q, zF05, this.g);
            d(this.S, zF02, this.d);
            ll8 ll8Var = this.n;
            if (ll8Var != null) {
                ll8Var.setEnabled(zF0);
            }
        }
    }

    public final void f() {
        boolean z;
        boolean z2;
        if (c() && this.H) {
            boolean zG0 = j29.g0(this.G, this.J);
            View view = this.e;
            if (view != null) {
                z = !zG0 && view.isFocused();
                z2 = !zG0 && view.isAccessibilityFocused();
                view.setVisibility(zG0 ? 0 : 8);
            } else {
                z = false;
                z2 = false;
            }
            View view2 = this.f;
            if (view2 != null) {
                z |= zG0 && view2.isFocused();
                z2 |= zG0 && view2.isAccessibilityFocused();
                view2.setVisibility(zG0 ? 8 : 0);
            }
            if (z) {
                boolean zG02 = j29.g0(this.G, this.J);
                if (zG02 && view != null) {
                    view.requestFocus();
                } else if (!zG02 && view2 != null) {
                    view2.requestFocus();
                }
            }
            if (z2) {
                boolean zG03 = j29.g0(this.G, this.J);
                if (zG03 && view != null) {
                    view.sendAccessibilityEvent(8);
                } else {
                    if (zG03 || view2 == null) {
                        return;
                    }
                    view2.sendAccessibilityEvent(8);
                }
            }
        }
    }

    public final void g() {
        long jF;
        long jW;
        if (c() && this.H) {
            gb6 gb6Var = this.G;
            if (gb6Var != null) {
                jF = gb6Var.F() + this.z0;
                jW = gb6Var.W() + this.z0;
            } else {
                jF = 0;
                jW = 0;
            }
            boolean z = jF != this.A0;
            this.A0 = jF;
            TextView textView = this.m;
            if (textView != null && !this.L && z) {
                textView.setText(j29.G(this.o, this.p, jF));
            }
            ll8 ll8Var = this.n;
            if (ll8Var != null) {
                ll8Var.setPosition(jF);
                ll8Var.setBufferedPosition(jW);
            }
            t44 t44Var = this.s;
            removeCallbacks(t44Var);
            int iE = gb6Var == null ? 1 : gb6Var.e();
            if (gb6Var != null && gb6Var.H()) {
                long jMin = Math.min(ll8Var != null ? ll8Var.getPreferredUpdateDelay() : 1000L, 1000 - (jF % 1000));
                float f = gb6Var.g().a;
                postDelayed(t44Var, j29.j(f > 0.0f ? (long) (jMin / f) : 1000L, this.N, 1000L));
            } else {
                if (iE == 4 || iE == 1) {
                    return;
                }
                postDelayed(t44Var, 1000L);
            }
        }
    }

    public gb6 getPlayer() {
        return this.G;
    }

    public int getRepeatToggleModes() {
        return this.O;
    }

    public boolean getShowShuffleButton() {
        return this.T;
    }

    public int getShowTimeoutMs() {
        return this.M;
    }

    public boolean getShowVrButton() {
        View view = this.k;
        return view != null && view.getVisibility() == 0;
    }

    public final void h() {
        ImageView imageView;
        if (c() && this.H && (imageView = this.i) != null) {
            if (this.O == 0) {
                d(false, false, imageView);
                return;
            }
            gb6 gb6Var = this.G;
            String str = this.x;
            Drawable drawable = this.u;
            if (gb6Var == null) {
                d(true, false, imageView);
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
                return;
            }
            d(true, true, imageView);
            int iF = gb6Var.f();
            if (iF == 0) {
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
            } else if (iF == 1) {
                imageView.setImageDrawable(this.v);
                imageView.setContentDescription(this.y);
            } else if (iF == 2) {
                imageView.setImageDrawable(this.w);
                imageView.setContentDescription(this.z);
            }
            imageView.setVisibility(0);
        }
    }

    public final void i() {
        ImageView imageView;
        if (c() && this.H && (imageView = this.j) != null) {
            gb6 gb6Var = this.G;
            if (!this.T) {
                d(false, false, imageView);
                return;
            }
            String str = this.F;
            Drawable drawable = this.B;
            if (gb6Var == null) {
                d(true, false, imageView);
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
                return;
            }
            d(true, true, imageView);
            if (gb6Var.U()) {
                drawable = this.A;
            }
            imageView.setImageDrawable(drawable);
            if (gb6Var.U()) {
                str = this.E;
            }
            imageView.setContentDescription(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003a A[EDGE_INSN: B:17:0x003a->B:18:0x003b BREAK  A[LOOP:0: B:11:0x0028->B:15:0x0035]] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j() {
        /*
            Method dump skipped, instruction units count: 408
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.LegacyPlayerControlView.j():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.H = true;
        long j = this.U;
        if (j != -9223372036854775807L) {
            long jUptimeMillis = j - SystemClock.uptimeMillis();
            if (jUptimeMillis <= 0) {
                a();
            } else {
                postDelayed(this.t, jUptimeMillis);
            }
        } else if (c()) {
            b();
        }
        f();
        e();
        h();
        i();
        j();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.H = false;
        removeCallbacks(this.s);
        removeCallbacks(this.t);
    }

    public void setExtraAdGroupMarkers(long[] jArr, boolean[] zArr) {
        if (jArr == null) {
            this.x0 = new long[0];
            this.y0 = new boolean[0];
        } else {
            zArr.getClass();
            vy2.j(jArr.length == zArr.length);
            this.x0 = jArr;
            this.y0 = zArr;
        }
        j();
    }

    public void setPlayer(gb6 gb6Var) {
        vy2.s(Looper.myLooper() == Looper.getMainLooper());
        vy2.j(gb6Var == null || gb6Var.g0() == Looper.getMainLooper());
        gb6 gb6Var2 = this.G;
        if (gb6Var2 == gb6Var) {
            return;
        }
        u44 u44Var = this.a;
        if (gb6Var2 != null) {
            gb6Var2.O(u44Var);
        }
        this.G = gb6Var;
        if (gb6Var != null) {
            gb6Var.n(u44Var);
        }
        f();
        e();
        h();
        i();
        j();
    }

    public void setRepeatToggleModes(int i) {
        this.O = i;
        gb6 gb6Var = this.G;
        if (gb6Var != null) {
            int iF = gb6Var.f();
            if (i == 0 && iF != 0) {
                this.G.N(0);
            } else if (i == 1 && iF == 2) {
                this.G.N(1);
            } else if (i == 2 && iF == 1) {
                this.G.N(2);
            }
        }
        h();
    }

    public void setShowFastForwardButton(boolean z) {
        this.Q = z;
        e();
    }

    @Deprecated
    public void setShowMultiWindowTimeBar(boolean z) {
        this.I = z;
        j();
    }

    public void setShowNextButton(boolean z) {
        this.S = z;
        e();
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z) {
        this.J = z;
        f();
    }

    public void setShowPreviousButton(boolean z) {
        this.R = z;
        e();
    }

    public void setShowRewindButton(boolean z) {
        this.P = z;
        e();
    }

    public void setShowShuffleButton(boolean z) {
        this.T = z;
        i();
    }

    public void setShowTimeoutMs(int i) {
        this.M = i;
        if (c()) {
            b();
        }
    }

    public void setShowVrButton(boolean z) {
        View view = this.k;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
        }
    }

    public void setTimeBarMinUpdateInterval(int i) {
        this.N = j29.i(i, 16, 1000);
    }

    public void setVrButtonListener(View.OnClickListener onClickListener) {
        View view = this.k;
        if (view != null) {
            view.setOnClickListener(onClickListener);
            d(getShowVrButton(), onClickListener != null, view);
        }
    }

    public LegacyPlayerControlView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [t44] */
    /* JADX WARN: Type inference failed for: r1v3, types: [t44] */
    public LegacyPlayerControlView(Context context, AttributeSet attributeSet, int i) {
        Context context2;
        super(context, attributeSet, i);
        int resourceId = hs6.exo_legacy_player_control_view;
        this.J = true;
        this.M = 5000;
        this.O = 0;
        this.N = ErrorDTO.CODE_PACKAGE_NAME_NOT_IN_MYKET_ERROR;
        this.U = -9223372036854775807L;
        this.P = true;
        this.Q = true;
        this.R = true;
        this.S = true;
        this.T = false;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, ju6.LegacyPlayerControlView, i, 0);
            try {
                this.M = typedArrayObtainStyledAttributes.getInt(ju6.LegacyPlayerControlView_show_timeout, this.M);
                resourceId = typedArrayObtainStyledAttributes.getResourceId(ju6.LegacyPlayerControlView_controller_layout_id, resourceId);
                this.O = typedArrayObtainStyledAttributes.getInt(ju6.LegacyPlayerControlView_repeat_toggle_modes, this.O);
                this.P = typedArrayObtainStyledAttributes.getBoolean(ju6.LegacyPlayerControlView_show_rewind_button, this.P);
                this.Q = typedArrayObtainStyledAttributes.getBoolean(ju6.LegacyPlayerControlView_show_fastforward_button, this.Q);
                this.R = typedArrayObtainStyledAttributes.getBoolean(ju6.LegacyPlayerControlView_show_previous_button, this.R);
                this.S = typedArrayObtainStyledAttributes.getBoolean(ju6.LegacyPlayerControlView_show_next_button, this.S);
                this.T = typedArrayObtainStyledAttributes.getBoolean(ju6.LegacyPlayerControlView_show_shuffle_button, this.T);
                setTimeBarMinUpdateInterval(typedArrayObtainStyledAttributes.getInt(ju6.LegacyPlayerControlView_time_bar_min_update_interval, this.N));
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
        this.b = new CopyOnWriteArrayList();
        this.q = new yl8();
        this.r = new am8();
        StringBuilder sb = new StringBuilder();
        this.o = sb;
        this.p = new Formatter(sb, Locale.getDefault());
        this.V = new long[0];
        this.W = new boolean[0];
        this.x0 = new long[0];
        this.y0 = new boolean[0];
        u44 u44Var = new u44(this);
        this.a = u44Var;
        final int i2 = 0;
        this.s = new Runnable(this) { // from class: t44
            public final /* synthetic */ LegacyPlayerControlView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i3 = i2;
                LegacyPlayerControlView legacyPlayerControlView = this.b;
                switch (i3) {
                    case 0:
                        int i4 = LegacyPlayerControlView.B0;
                        legacyPlayerControlView.g();
                        break;
                    default:
                        legacyPlayerControlView.a();
                        break;
                }
            }
        };
        final int i3 = 1;
        this.t = new Runnable(this) { // from class: t44
            public final /* synthetic */ LegacyPlayerControlView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i32 = i3;
                LegacyPlayerControlView legacyPlayerControlView = this.b;
                switch (i32) {
                    case 0:
                        int i4 = LegacyPlayerControlView.B0;
                        legacyPlayerControlView.g();
                        break;
                    default:
                        legacyPlayerControlView.a();
                        break;
                }
            }
        };
        LayoutInflater.from(context).inflate(resourceId, this);
        setDescendantFocusability(262144);
        ll8 ll8Var = (ll8) findViewById(ir6.exo_progress);
        View viewFindViewById = findViewById(ir6.exo_progress_placeholder);
        if (ll8Var != null) {
            this.n = ll8Var;
            context2 = context;
        } else if (viewFindViewById != null) {
            context2 = context;
            DefaultTimeBar defaultTimeBar = new DefaultTimeBar(context2, null, 0, attributeSet, 0);
            defaultTimeBar.setId(ir6.exo_progress);
            defaultTimeBar.setLayoutParams(viewFindViewById.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById);
            viewGroup.removeView(viewFindViewById);
            viewGroup.addView(defaultTimeBar, iIndexOfChild);
            this.n = defaultTimeBar;
        } else {
            context2 = context;
            this.n = null;
        }
        this.l = (TextView) findViewById(ir6.exo_duration);
        this.m = (TextView) findViewById(ir6.exo_position);
        ll8 ll8Var2 = this.n;
        if (ll8Var2 != null) {
            ((DefaultTimeBar) ll8Var2).x.add(u44Var);
        }
        View viewFindViewById2 = findViewById(ir6.exo_play);
        this.e = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(u44Var);
        }
        View viewFindViewById3 = findViewById(ir6.exo_pause);
        this.f = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(u44Var);
        }
        View viewFindViewById4 = findViewById(ir6.exo_prev);
        this.c = viewFindViewById4;
        if (viewFindViewById4 != null) {
            viewFindViewById4.setOnClickListener(u44Var);
        }
        View viewFindViewById5 = findViewById(ir6.exo_next);
        this.d = viewFindViewById5;
        if (viewFindViewById5 != null) {
            viewFindViewById5.setOnClickListener(u44Var);
        }
        View viewFindViewById6 = findViewById(ir6.exo_rew);
        this.h = viewFindViewById6;
        if (viewFindViewById6 != null) {
            viewFindViewById6.setOnClickListener(u44Var);
        }
        View viewFindViewById7 = findViewById(ir6.exo_ffwd);
        this.g = viewFindViewById7;
        if (viewFindViewById7 != null) {
            viewFindViewById7.setOnClickListener(u44Var);
        }
        ImageView imageView = (ImageView) findViewById(ir6.exo_repeat_toggle);
        this.i = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(u44Var);
        }
        ImageView imageView2 = (ImageView) findViewById(ir6.exo_shuffle);
        this.j = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(u44Var);
        }
        View viewFindViewById8 = findViewById(ir6.exo_vr);
        this.k = viewFindViewById8;
        setShowVrButton(false);
        d(false, false, viewFindViewById8);
        Resources resources = context2.getResources();
        this.C = resources.getInteger(gs6.exo_media_button_opacity_percentage_enabled) / 100.0f;
        this.D = resources.getInteger(gs6.exo_media_button_opacity_percentage_disabled) / 100.0f;
        this.u = resources.getDrawable(vq6.exo_legacy_controls_repeat_off, context2.getTheme());
        this.v = resources.getDrawable(vq6.exo_legacy_controls_repeat_one, context2.getTheme());
        this.w = resources.getDrawable(vq6.exo_legacy_controls_repeat_all, context2.getTheme());
        this.A = resources.getDrawable(vq6.exo_legacy_controls_shuffle_on, context2.getTheme());
        this.B = resources.getDrawable(vq6.exo_legacy_controls_shuffle_off, context2.getTheme());
        this.x = resources.getString(bt6.exo_controls_repeat_off_description);
        this.y = resources.getString(bt6.exo_controls_repeat_one_description);
        this.z = resources.getString(bt6.exo_controls_repeat_all_description);
        this.E = resources.getString(bt6.exo_controls_shuffle_on_description);
        this.F = resources.getString(bt6.exo_controls_shuffle_off_description);
        this.A0 = -9223372036854775807L;
    }

    public void setProgressUpdateListener(v44 v44Var) {
    }
}
