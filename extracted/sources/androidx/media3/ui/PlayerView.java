package androidx.media3.ui;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.image.ImageOutput;
import androidx.media3.exoplayer.video.VideoDecoderGLSurfaceView;
import androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView;
import androidx.media3.ui.PlayerView;
import com.google.common.collect.ImmutableList;
import defpackage.bq6;
import defpackage.bt6;
import defpackage.dd6;
import defpackage.gb6;
import defpackage.hg6;
import defpackage.hs6;
import defpackage.i3;
import defpackage.ig6;
import defpackage.ir6;
import defpackage.iw;
import defpackage.j29;
import defpackage.jg6;
import defpackage.ju6;
import defpackage.kg6;
import defpackage.ld6;
import defpackage.m32;
import defpackage.qd6;
import defpackage.qm5;
import defpackage.vq6;
import defpackage.vy2;
import defpackage.w59;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class PlayerView extends FrameLayout {
    public static final /* synthetic */ int G = 0;
    public CharSequence A;
    public int B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public final hg6 a;
    public final AspectRatioFrameLayout b;
    public final View c;
    public final View d;
    public final boolean e;
    public final kg6 f;
    public final ImageView g;
    public final ImageView h;
    public final SubtitleView i;
    public final View j;
    public final TextView k;
    public final PlayerControlView l;
    public final FrameLayout m;
    public final FrameLayout n;
    public final Handler o;
    public final Class p;
    public final Method q;
    public final Object r;
    public gb6 s;
    public boolean t;
    public ld6 u;
    public int v;
    public int w;
    public Drawable x;
    public int y;
    public boolean z;

    public PlayerView(Context context) {
        this(context, null);
    }

    public static void a(PlayerView playerView, Bitmap bitmap) {
        playerView.setImage(new BitmapDrawable(playerView.getResources(), bitmap));
        gb6 gb6Var = playerView.s;
        if (gb6Var != null && gb6Var.f0(30) && gb6Var.G().a(2)) {
            return;
        }
        ImageView imageView = playerView.g;
        if (imageView != null) {
            imageView.setVisibility(0);
            playerView.n();
        }
        View view = playerView.c;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    private void setImage(Drawable drawable) {
        ImageView imageView = this.g;
        if (imageView == null) {
            return;
        }
        imageView.setImageDrawable(drawable);
        n();
    }

    private void setImageOutput(gb6 gb6Var) {
        Class cls = this.p;
        if (cls == null || !cls.isAssignableFrom(gb6Var.getClass())) {
            return;
        }
        try {
            Method method = this.q;
            method.getClass();
            Object obj = this.r;
            obj.getClass();
            method.invoke(gb6Var, obj);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    public final boolean b() {
        gb6 gb6Var = this.s;
        return gb6Var != null && this.r != null && gb6Var.f0(30) && gb6Var.G().a(4);
    }

    public final void c() {
        ImageView imageView = this.g;
        if (imageView != null) {
            imageView.setVisibility(4);
        }
        if (imageView != null) {
            imageView.setImageResource(R.color.transparent);
        }
    }

    public final boolean d() {
        gb6 gb6Var = this.s;
        return gb6Var != null && gb6Var.f0(16) && this.s.h() && this.s.l();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        kg6 kg6Var;
        super.dispatchDraw(canvas);
        if (Build.VERSION.SDK_INT == 34 && (kg6Var = this.f) != null && this.F) {
            kg6Var.b();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        gb6 gb6Var = this.s;
        if (gb6Var != null && gb6Var.f0(16) && this.s.h()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        int keyCode = keyEvent.getKeyCode();
        boolean z = keyCode == 19 || keyCode == 270 || keyCode == 22 || keyCode == 271 || keyCode == 20 || keyCode == 269 || keyCode == 21 || keyCode == 268 || keyCode == 23;
        PlayerControlView playerControlView = this.l;
        if (z && o() && !playerControlView.j()) {
            e(true);
            return true;
        }
        if ((o() && playerControlView.d(keyEvent)) || super.dispatchKeyEvent(keyEvent)) {
            e(true);
            return true;
        }
        if (z && o()) {
            e(true);
        }
        return false;
    }

    public final void e(boolean z) {
        if (!(d() && this.D) && o()) {
            PlayerControlView playerControlView = this.l;
            boolean z2 = playerControlView.j() && playerControlView.getShowTimeoutMs() <= 0;
            boolean zG = g();
            if ((z || z2 || zG) && o()) {
                playerControlView.setShowTimeoutMs(zG ? 0 : this.B);
                playerControlView.m();
            }
        }
    }

    public final boolean f(Drawable drawable) {
        ImageView imageView = this.h;
        if (imageView != null && drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                float width = intrinsicWidth / intrinsicHeight;
                ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
                if (this.v == 2) {
                    width = getWidth() / getHeight();
                    scaleType = ImageView.ScaleType.CENTER_CROP;
                }
                AspectRatioFrameLayout aspectRatioFrameLayout = this.b;
                if (aspectRatioFrameLayout != null) {
                    aspectRatioFrameLayout.setAspectRatio(width);
                }
                imageView.setScaleType(scaleType);
                imageView.setImageDrawable(drawable);
                imageView.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    public final boolean g() {
        gb6 gb6Var = this.s;
        if (gb6Var == null) {
            return true;
        }
        int iE = gb6Var.e();
        if (!this.C) {
            return false;
        }
        if (this.s.f0(17) && this.s.S().p()) {
            return false;
        }
        if (iE != 1 && iE != 4) {
            gb6 gb6Var2 = this.s;
            gb6Var2.getClass();
            if (gb6Var2.l()) {
                return false;
            }
        }
        return true;
    }

    public List<qm5> getAdOverlayInfos() {
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.n;
        if (frameLayout != null) {
            arrayList.add(new qm5(3, frameLayout));
        }
        PlayerControlView playerControlView = this.l;
        if (playerControlView != null) {
            arrayList.add(new qm5(3, playerControlView));
        }
        return ImmutableList.n(arrayList);
    }

    public ViewGroup getAdViewGroup() {
        FrameLayout frameLayout = this.m;
        vy2.u(frameLayout, "exo_ad_overlay must be present for ad playback");
        return frameLayout;
    }

    public int getArtworkDisplayMode() {
        return this.v;
    }

    public boolean getControllerAutoShow() {
        return this.C;
    }

    public boolean getControllerHideOnTouch() {
        return this.E;
    }

    public int getControllerShowTimeoutMs() {
        return this.B;
    }

    public Drawable getDefaultArtwork() {
        return this.x;
    }

    public int getImageDisplayMode() {
        return this.w;
    }

    public FrameLayout getOverlayFrameLayout() {
        return this.n;
    }

    public gb6 getPlayer() {
        return this.s;
    }

    public int getResizeMode() {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.b;
        vy2.t(aspectRatioFrameLayout);
        return aspectRatioFrameLayout.getResizeMode();
    }

    public SubtitleView getSubtitleView() {
        return this.i;
    }

    @Deprecated
    public boolean getUseArtwork() {
        return this.v != 0;
    }

    public boolean getUseController() {
        return this.t;
    }

    public View getVideoSurfaceView() {
        return this.d;
    }

    public final void h() {
        if (!o() || this.s == null) {
            return;
        }
        PlayerControlView playerControlView = this.l;
        if (!playerControlView.j()) {
            e(true);
        } else if (this.E) {
            playerControlView.g();
        }
    }

    public final void i() {
        gb6 gb6Var = this.s;
        w59 w59VarR = gb6Var != null ? gb6Var.r() : w59.d;
        int i = w59VarR.a;
        int i2 = w59VarR.b;
        float f = this.e ? 0.0f : (i2 == 0 || i == 0) ? 0.0f : (i * w59VarR.c) / i2;
        AspectRatioFrameLayout aspectRatioFrameLayout = this.b;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setAspectRatio(f);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j() {
        /*
            r5 = this;
            android.view.View r0 = r5.j
            if (r0 == 0) goto L29
            gb6 r1 = r5.s
            r2 = 0
            if (r1 == 0) goto L20
            int r1 = r1.e()
            r3 = 2
            if (r1 != r3) goto L20
            int r1 = r5.y
            r4 = 1
            if (r1 == r3) goto L21
            if (r1 != r4) goto L20
            gb6 r1 = r5.s
            boolean r1 = r1.l()
            if (r1 == 0) goto L20
            goto L21
        L20:
            r4 = r2
        L21:
            if (r4 == 0) goto L24
            goto L26
        L24:
            r2 = 8
        L26:
            r0.setVisibility(r2)
        L29:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.PlayerView.j():void");
    }

    public final void k() {
        PlayerControlView playerControlView = this.l;
        if (playerControlView == null || !this.t) {
            setContentDescription(null);
        } else if (playerControlView.j()) {
            setContentDescription(this.E ? getResources().getString(bt6.exo_controls_hide) : null);
        } else {
            setContentDescription(getResources().getString(bt6.exo_controls_show));
        }
    }

    public final void l() {
        TextView textView = this.k;
        if (textView != null) {
            CharSequence charSequence = this.A;
            if (charSequence != null) {
                textView.setText(charSequence);
                textView.setVisibility(0);
            } else {
                gb6 gb6Var = this.s;
                if (gb6Var != null) {
                    gb6Var.B();
                }
                textView.setVisibility(8);
            }
        }
    }

    public final void m(boolean z) {
        byte[] bArr;
        Drawable drawable;
        gb6 gb6Var = this.s;
        boolean zF = false;
        boolean z2 = (gb6Var == null || !gb6Var.f0(30) || gb6Var.G().a.isEmpty()) ? false : true;
        boolean z3 = this.z;
        ImageView imageView = this.h;
        View view = this.c;
        if (!z3 && (!z2 || z)) {
            if (imageView != null) {
                imageView.setImageResource(R.color.transparent);
                imageView.setVisibility(4);
            }
            if (view != null) {
                view.setVisibility(0);
            }
            c();
        }
        if (z2) {
            gb6 gb6Var2 = this.s;
            boolean z4 = gb6Var2 != null && gb6Var2.f0(30) && gb6Var2.G().a(2);
            boolean zB = b();
            if (!z4 && !zB) {
                if (view != null) {
                    view.setVisibility(0);
                }
                c();
            }
            ImageView imageView2 = this.g;
            boolean z5 = (view == null || view.getVisibility() != 4 || imageView2 == null || (drawable = imageView2.getDrawable()) == null || drawable.getAlpha() == 0) ? false : true;
            if (zB && !z4 && z5) {
                if (view != null) {
                    view.setVisibility(0);
                }
                if (imageView2 != null) {
                    imageView2.setVisibility(0);
                    n();
                }
            } else if (z4 && !zB && z5) {
                c();
            }
            if (!z4 && !zB && this.v != 0) {
                vy2.t(imageView);
                if (gb6Var != null && gb6Var.f0(18) && (bArr = gb6Var.b0().k) != null) {
                    zF = f(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
                }
                if (zF || f(this.x)) {
                    return;
                }
            }
            if (imageView != null) {
                imageView.setImageResource(R.color.transparent);
                imageView.setVisibility(4);
            }
        }
    }

    public final void n() {
        Drawable drawable;
        AspectRatioFrameLayout aspectRatioFrameLayout;
        ImageView imageView = this.g;
        if (imageView == null || (drawable = imageView.getDrawable()) == null) {
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            return;
        }
        float width = intrinsicWidth / intrinsicHeight;
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
        if (this.w == 1) {
            width = getWidth() / getHeight();
            scaleType = ImageView.ScaleType.CENTER_CROP;
        }
        if (imageView.getVisibility() == 0 && (aspectRatioFrameLayout = this.b) != null) {
            aspectRatioFrameLayout.setAspectRatio(width);
        }
        imageView.setScaleType(scaleType);
    }

    public final boolean o() {
        if (!this.t) {
            return false;
        }
        vy2.t(this.l);
        return true;
    }

    @Override // android.view.View
    public final boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!o() || this.s == null) {
            return false;
        }
        e(true);
        return true;
    }

    @Override // android.view.View
    public final boolean performClick() {
        h();
        return super.performClick();
    }

    public void setArtworkDisplayMode(int i) {
        vy2.s(i == 0 || this.h != null);
        if (this.v != i) {
            this.v = i;
            m(false);
        }
    }

    public void setAspectRatioListener(iw iwVar) {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.b;
        vy2.t(aspectRatioFrameLayout);
        aspectRatioFrameLayout.setAspectRatioListener(iwVar);
    }

    public void setControllerAnimationEnabled(boolean z) {
        PlayerControlView playerControlView = this.l;
        vy2.t(playerControlView);
        playerControlView.setAnimationEnabled(z);
    }

    public void setControllerAutoShow(boolean z) {
        this.C = z;
    }

    public void setControllerHideDuringAds(boolean z) {
        this.D = z;
    }

    public void setControllerHideOnTouch(boolean z) {
        vy2.t(this.l);
        this.E = z;
        k();
    }

    @Deprecated
    public void setControllerOnFullScreenModeChangedListener(dd6 dd6Var) {
        PlayerControlView playerControlView = this.l;
        vy2.t(playerControlView);
        playerControlView.setOnFullScreenModeChangedListener(dd6Var);
    }

    public void setControllerShowTimeoutMs(int i) {
        PlayerControlView playerControlView = this.l;
        vy2.t(playerControlView);
        this.B = i;
        if (playerControlView.j()) {
            boolean zG = g();
            if (o()) {
                playerControlView.setShowTimeoutMs(zG ? 0 : this.B);
                playerControlView.m();
            }
        }
    }

    public void setControllerVisibilityListener(ig6 ig6Var) {
        if (ig6Var != null) {
            setControllerVisibilityListener((ld6) null);
        }
    }

    public void setCustomErrorMessage(CharSequence charSequence) {
        vy2.s(this.k != null);
        this.A = charSequence;
        l();
    }

    public void setDefaultArtwork(Drawable drawable) {
        if (this.x != drawable) {
            this.x = drawable;
            m(false);
        }
    }

    public void setEnableComposeSurfaceSyncWorkaround(boolean z) {
        this.F = z;
    }

    public void setErrorMessageProvider(m32 m32Var) {
        if (m32Var != null) {
            l();
        }
    }

    public void setExtraAdGroupMarkers(long[] jArr, boolean[] zArr) {
        PlayerControlView playerControlView = this.l;
        vy2.t(playerControlView);
        playerControlView.setExtraAdGroupMarkers(jArr, zArr);
    }

    public void setFullscreenButtonClickListener(jg6 jg6Var) {
        PlayerControlView playerControlView = this.l;
        vy2.t(playerControlView);
        playerControlView.setOnFullScreenModeChangedListener(this.a);
    }

    public void setFullscreenButtonState(boolean z) {
        PlayerControlView playerControlView = this.l;
        vy2.t(playerControlView);
        playerControlView.p(z);
    }

    public void setImageDisplayMode(int i) {
        vy2.s(this.g != null);
        if (this.w != i) {
            this.w = i;
            n();
        }
    }

    public void setKeepContentOnPlayerReset(boolean z) {
        if (this.z != z) {
            this.z = z;
            m(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setPlayer(defpackage.gb6 r10) {
        /*
            Method dump skipped, instruction units count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.PlayerView.setPlayer(gb6):void");
    }

    public void setRepeatToggleModes(int i) {
        PlayerControlView playerControlView = this.l;
        vy2.t(playerControlView);
        playerControlView.setRepeatToggleModes(i);
    }

    public void setResizeMode(int i) {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.b;
        vy2.t(aspectRatioFrameLayout);
        aspectRatioFrameLayout.setResizeMode(i);
    }

    public void setShowBuffering(int i) {
        if (this.y != i) {
            this.y = i;
            j();
        }
    }

    public void setShowFastForwardButton(boolean z) {
        PlayerControlView playerControlView = this.l;
        vy2.t(playerControlView);
        playerControlView.setShowFastForwardButton(z);
    }

    @Deprecated
    public void setShowMultiWindowTimeBar(boolean z) {
        PlayerControlView playerControlView = this.l;
        vy2.t(playerControlView);
        playerControlView.setShowMultiWindowTimeBar(z);
    }

    public void setShowNextButton(boolean z) {
        PlayerControlView playerControlView = this.l;
        vy2.t(playerControlView);
        playerControlView.setShowNextButton(z);
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z) {
        PlayerControlView playerControlView = this.l;
        vy2.t(playerControlView);
        playerControlView.setShowPlayButtonIfPlaybackIsSuppressed(z);
    }

    public void setShowPreviousButton(boolean z) {
        PlayerControlView playerControlView = this.l;
        vy2.t(playerControlView);
        playerControlView.setShowPreviousButton(z);
    }

    public void setShowRewindButton(boolean z) {
        PlayerControlView playerControlView = this.l;
        vy2.t(playerControlView);
        playerControlView.setShowRewindButton(z);
    }

    public void setShowShuffleButton(boolean z) {
        PlayerControlView playerControlView = this.l;
        vy2.t(playerControlView);
        playerControlView.setShowShuffleButton(z);
    }

    public void setShowSubtitleButton(boolean z) {
        PlayerControlView playerControlView = this.l;
        vy2.t(playerControlView);
        playerControlView.setShowSubtitleButton(z);
    }

    public void setShowVrButton(boolean z) {
        PlayerControlView playerControlView = this.l;
        vy2.t(playerControlView);
        playerControlView.setShowVrButton(z);
    }

    public void setShutterBackgroundColor(int i) {
        View view = this.c;
        if (view != null) {
            view.setBackgroundColor(i);
        }
    }

    public void setTimeBarScrubbingEnabled(boolean z) {
        PlayerControlView playerControlView = this.l;
        vy2.t(playerControlView);
        playerControlView.setTimeBarScrubbingEnabled(z);
    }

    @Deprecated
    public void setUseArtwork(boolean z) {
        setArtworkDisplayMode(!z ? 1 : 0);
    }

    public void setUseController(boolean z) {
        boolean z2 = true;
        PlayerControlView playerControlView = this.l;
        vy2.s((z && playerControlView == null) ? false : true);
        if (!z && !hasOnClickListeners()) {
            z2 = false;
        }
        setClickable(z2);
        if (this.t == z) {
            return;
        }
        this.t = z;
        if (o()) {
            playerControlView.setPlayer(this.s);
        } else if (playerControlView != null) {
            playerControlView.g();
            playerControlView.setPlayer(null);
        }
        k();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        View view = this.d;
        if (view instanceof SurfaceView) {
            view.setVisibility(i);
        }
    }

    public PlayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Deprecated
    public void setControllerVisibilityListener(ld6 ld6Var) {
        PlayerControlView playerControlView = this.l;
        vy2.t(playerControlView);
        CopyOnWriteArrayList copyOnWriteArrayList = playerControlView.j;
        ld6 ld6Var2 = this.u;
        if (ld6Var2 == ld6Var) {
            return;
        }
        if (ld6Var2 != null) {
            copyOnWriteArrayList.remove(ld6Var2);
        }
        this.u = ld6Var;
        if (ld6Var != null) {
            copyOnWriteArrayList.add(ld6Var);
            setControllerVisibilityListener((ig6) null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PlayerView(Context context, AttributeSet attributeSet, int i) {
        int i2;
        int i3;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z5;
        boolean z6;
        boolean z7;
        Class<ExoPlayer> cls;
        Object objNewProxyInstance;
        Method method;
        int i11;
        super(context, attributeSet, i);
        hg6 hg6Var = new hg6(this);
        this.a = hg6Var;
        this.o = new Handler(Looper.getMainLooper());
        if (isInEditMode()) {
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = false;
            this.f = null;
            this.g = null;
            this.h = null;
            this.i = null;
            this.j = null;
            this.k = null;
            this.l = null;
            this.m = null;
            this.n = null;
            this.p = null;
            this.q = null;
            this.r = null;
            ImageView imageView = new ImageView(context);
            Resources resources = getResources();
            int i12 = vq6.exo_edit_mode_logo;
            String str = j29.a;
            imageView.setImageDrawable(resources.getDrawable(i12, context.getTheme()));
            imageView.setBackgroundColor(resources.getColor(bq6.exo_edit_mode_background_color, null));
            addView(imageView);
            return;
        }
        int i13 = hs6.exo_player_view;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, ju6.PlayerView, i, 0);
            try {
                boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(ju6.PlayerView_shutter_background_color);
                int color = typedArrayObtainStyledAttributes.getColor(ju6.PlayerView_shutter_background_color, 0);
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(ju6.PlayerView_player_layout_id, i13);
                boolean z8 = typedArrayObtainStyledAttributes.getBoolean(ju6.PlayerView_use_artwork, true);
                int i14 = typedArrayObtainStyledAttributes.getInt(ju6.PlayerView_artwork_display_mode, 1);
                int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(ju6.PlayerView_default_artwork, 0);
                int i15 = typedArrayObtainStyledAttributes.getInt(ju6.PlayerView_image_display_mode, 0);
                boolean z9 = typedArrayObtainStyledAttributes.getBoolean(ju6.PlayerView_use_controller, true);
                int i16 = typedArrayObtainStyledAttributes.getInt(ju6.PlayerView_surface_type, 1);
                int i17 = typedArrayObtainStyledAttributes.getInt(ju6.PlayerView_resize_mode, 0);
                i2 = typedArrayObtainStyledAttributes.getInt(ju6.PlayerView_show_timeout, 5000);
                boolean z10 = typedArrayObtainStyledAttributes.getBoolean(ju6.PlayerView_hide_on_touch, true);
                boolean z11 = typedArrayObtainStyledAttributes.getBoolean(ju6.PlayerView_auto_show, true);
                int integer = typedArrayObtainStyledAttributes.getInteger(ju6.PlayerView_show_buffering, 0);
                this.z = typedArrayObtainStyledAttributes.getBoolean(ju6.PlayerView_keep_content_on_player_reset, this.z);
                boolean z12 = typedArrayObtainStyledAttributes.getBoolean(ju6.PlayerView_hide_during_ads, true);
                typedArrayObtainStyledAttributes.recycle();
                i5 = resourceId2;
                z2 = z10;
                z5 = zHasValue;
                i6 = i17;
                z4 = z12;
                i3 = resourceId;
                z = z9;
                z3 = z11;
                z6 = z8;
                i8 = i15;
                i10 = i14;
                i9 = color;
                i7 = i16;
                i4 = integer;
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            i2 = 5000;
            i3 = i13;
            z = true;
            z2 = true;
            z3 = true;
            z4 = true;
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i7 = 1;
            i8 = 0;
            i9 = 0;
            i10 = 1;
            z5 = false;
            z6 = true;
        }
        LayoutInflater.from(context).inflate(i3, this);
        setDescendantFocusability(262144);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(ir6.exo_content_frame);
        this.b = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setResizeMode(i6);
        }
        View viewFindViewById = findViewById(ir6.exo_shutter);
        this.c = viewFindViewById;
        if (viewFindViewById != null && z5) {
            viewFindViewById.setBackgroundColor(i9);
        }
        if (aspectRatioFrameLayout != null && i7 != 0) {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (i7 == 2) {
                this.d = new TextureView(context);
            } else if (i7 == 3) {
                try {
                    int i18 = SphericalGLSurfaceView.l;
                    this.d = (View) SphericalGLSurfaceView.class.getConstructor(Context.class).newInstance(context);
                    z7 = true;
                    this.d.setLayoutParams(layoutParams);
                    this.d.setOnClickListener(hg6Var);
                    this.d.setClickable(false);
                    aspectRatioFrameLayout.addView(this.d, 0);
                } catch (Exception e) {
                    throw new IllegalStateException("spherical_gl_surface_view requires an ExoPlayer dependency", e);
                }
            } else if (i7 != 4) {
                SurfaceView surfaceView = new SurfaceView(context);
                if (Build.VERSION.SDK_INT >= 34) {
                    i3.B(surfaceView);
                }
                this.d = surfaceView;
            } else {
                try {
                    int i19 = VideoDecoderGLSurfaceView.b;
                    this.d = (View) VideoDecoderGLSurfaceView.class.getConstructor(Context.class).newInstance(context);
                } catch (Exception e2) {
                    throw new IllegalStateException("video_decoder_gl_surface_view requires an ExoPlayer dependency", e2);
                }
            }
            z7 = false;
            this.d.setLayoutParams(layoutParams);
            this.d.setOnClickListener(hg6Var);
            this.d.setClickable(false);
            aspectRatioFrameLayout.addView(this.d, 0);
        } else {
            this.d = null;
            z7 = false;
        }
        this.e = z7;
        this.f = Build.VERSION.SDK_INT == 34 ? new kg6() : null;
        this.m = (FrameLayout) findViewById(ir6.exo_ad_overlay);
        this.n = (FrameLayout) findViewById(ir6.exo_overlay);
        this.g = (ImageView) findViewById(ir6.exo_image);
        this.w = i8;
        try {
            cls = ExoPlayer.class;
            method = cls.getMethod("setImageOutput", ImageOutput.class);
            objNewProxyInstance = Proxy.newProxyInstance(ImageOutput.class.getClassLoader(), new Class[]{ImageOutput.class}, new InvocationHandler() { // from class: gg6
                @Override // java.lang.reflect.InvocationHandler
                public final Object invoke(Object obj, Method method2, Object[] objArr) {
                    int i20 = PlayerView.G;
                    if (!method2.getName().equals("onImageAvailable")) {
                        return null;
                    }
                    Bitmap bitmap = (Bitmap) objArr[1];
                    PlayerView playerView = this.a;
                    playerView.o.post(new lo4(playerView, bitmap, 22));
                    return null;
                }
            });
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            cls = null;
            objNewProxyInstance = null;
            method = null;
        }
        this.p = cls;
        this.q = method;
        this.r = objNewProxyInstance;
        ImageView imageView2 = (ImageView) findViewById(ir6.exo_artwork);
        this.h = imageView2;
        this.v = (!z6 || i10 == 0 || imageView2 == null) ? 0 : i10;
        if (i5 != 0) {
            this.x = ContextCompat.getDrawable(getContext(), i5);
        }
        SubtitleView subtitleView = (SubtitleView) findViewById(ir6.exo_subtitles);
        this.i = subtitleView;
        if (subtitleView != null) {
            subtitleView.setUserDefaultStyle();
            subtitleView.setUserDefaultTextSize();
        }
        View viewFindViewById2 = findViewById(ir6.exo_buffering);
        this.j = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setVisibility(8);
        }
        this.y = i4;
        TextView textView = (TextView) findViewById(ir6.exo_error_message);
        this.k = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        PlayerControlView playerControlView = (PlayerControlView) findViewById(ir6.exo_controller);
        View viewFindViewById3 = findViewById(ir6.exo_controller_placeholder);
        if (playerControlView != null) {
            this.l = playerControlView;
            i11 = 0;
        } else if (viewFindViewById3 != null) {
            i11 = 0;
            PlayerControlView playerControlView2 = new PlayerControlView(context, null, 0, attributeSet);
            this.l = playerControlView2;
            playerControlView2.setId(ir6.exo_controller);
            playerControlView2.setLayoutParams(viewFindViewById3.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById3.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById3);
            viewGroup.removeView(viewFindViewById3);
            viewGroup.addView(playerControlView2, iIndexOfChild);
        } else {
            i11 = 0;
            this.l = null;
        }
        PlayerControlView playerControlView3 = this.l;
        this.B = playerControlView3 != null ? i2 : i11;
        this.E = z2;
        this.C = z3;
        this.D = z4;
        this.t = (!z || playerControlView3 == null) ? i11 : 1;
        if (playerControlView3 != null) {
            qd6 qd6Var = playerControlView3.a;
            int i20 = qd6Var.z;
            if (i20 != 3 && i20 != 2) {
                qd6Var.f();
                qd6Var.i(2);
            }
            PlayerControlView playerControlView4 = this.l;
            hg6 hg6Var2 = this.a;
            playerControlView4.getClass();
            hg6Var2.getClass();
            playerControlView4.j.add(hg6Var2);
        }
        if (z) {
            setClickable(true);
        }
        k();
    }
}
