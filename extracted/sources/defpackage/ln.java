package defpackage;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.m;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ln extends zm implements mt4, LayoutInflater.Factory2 {
    public static final fw7 F0 = new fw7(0);
    public static final int[] G0 = {R.attr.windowBackground};
    public static final boolean H0 = !"robolectric".equals(Build.FINGERPRINT);
    public boolean A;
    public Rect A0;
    public ViewGroup B;
    public Rect B0;
    public TextView C;
    public uo C0;
    public View D;
    public OnBackInvokedDispatcher D0;
    public boolean E;
    public OnBackInvokedCallback E0;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public kn[] M;
    public kn N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public Configuration S;
    public final int T;
    public int U;
    public int V;
    public boolean W;
    public hn X;
    public hn Y;
    public boolean Z;
    public final Object j;
    public final Context k;
    public Window l;
    public gn m;
    public final Object n;
    public zk8 o;
    public ac8 p;
    public CharSequence q;
    public jc1 r;
    public r79 s;
    public pj9 t;
    public k6 u;
    public ActionBarContextView v;
    public PopupWindow w;
    public an x;
    public int x0;
    public boolean z0;
    public x89 y = null;
    public final boolean z = true;
    public final an y0 = new an(this, 0);

    public ln(Context context, Window window, tm tmVar, Object obj) {
        AppCompatActivity appCompatActivity = null;
        this.T = -100;
        this.k = context;
        this.n = tmVar;
        this.j = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (!(context instanceof AppCompatActivity)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        } else {
                            context = ((ContextWrapper) context).getBaseContext();
                        }
                    } else {
                        appCompatActivity = (AppCompatActivity) context;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (appCompatActivity != null) {
                this.T = ((ln) appCompatActivity.O()).T;
            }
        }
        if (this.T == -100) {
            String name = this.j.getClass().getName();
            fw7 fw7Var = F0;
            Integer num = (Integer) fw7Var.get(name);
            if (num != null) {
                this.T = num.intValue();
                fw7Var.remove(this.j.getClass().getName());
            }
        }
        if (window != null) {
            n(window);
        }
        pn.d();
    }

    public static yc4 p(Context context) {
        yc4 yc4Var;
        yc4 yc4VarB;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33 || (yc4Var = zm.c) == null) {
            return null;
        }
        ad4 ad4Var = yc4Var.a;
        yc4 yc4VarZ = z(context.getApplicationContext().getResources().getConfiguration());
        int i2 = 0;
        if (i < 24) {
            yc4VarB = ad4Var.isEmpty() ? yc4.b : yc4.b(cn.b(ad4Var.get(0)));
        } else if (ad4Var.isEmpty()) {
            yc4VarB = yc4.b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (i2 < yc4VarZ.a.size() + ad4Var.size()) {
                Locale locale = i2 < ad4Var.size() ? ad4Var.get(i2) : yc4VarZ.a.get(i2 - ad4Var.size());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i2++;
            }
            yc4VarB = yc4.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
        }
        return yc4VarB.a.isEmpty() ? yc4VarZ : yc4VarB;
    }

    public static Configuration t(Context context, int i, yc4 yc4Var, Configuration configuration, boolean z) {
        int i2 = i != 1 ? i != 2 ? z ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & (-49));
        if (yc4Var != null) {
            ad4 ad4Var = yc4Var.a;
            if (Build.VERSION.SDK_INT >= 24) {
                dn.d(configuration2, yc4Var);
                return configuration2;
            }
            configuration2.setLocale(ad4Var.get(0));
            configuration2.setLayoutDirection(ad4Var.get(0));
        }
        return configuration2;
    }

    public static yc4 z(Configuration configuration) {
        return Build.VERSION.SDK_INT >= 24 ? dn.b(configuration) : yc4.b(cn.b(configuration.locale));
    }

    public final kn A(int i) {
        kn[] knVarArr = this.M;
        if (knVarArr == null || knVarArr.length <= i) {
            kn[] knVarArr2 = new kn[i + 1];
            if (knVarArr != null) {
                System.arraycopy(knVarArr, 0, knVarArr2, 0, knVarArr.length);
            }
            this.M = knVarArr2;
            knVarArr = knVarArr2;
        }
        kn knVar = knVarArr[i];
        if (knVar != null) {
            return knVar;
        }
        kn knVar2 = new kn();
        knVar2.a = i;
        knVar2.n = false;
        knVarArr[i] = knVar2;
        return knVar2;
    }

    public final void B() {
        w();
        if (this.G && this.o == null) {
            Object obj = this.j;
            if (obj instanceof Activity) {
                this.o = new ge9((Activity) obj, this.H);
            } else if (obj instanceof Dialog) {
                this.o = new ge9((Dialog) obj);
            }
            zk8 zk8Var = this.o;
            if (zk8Var != null) {
                zk8Var.c0(this.z0);
            }
        }
    }

    public final void C(int i) {
        this.x0 = (1 << i) | this.x0;
        if (this.Z) {
            return;
        }
        View decorView = this.l.getDecorView();
        WeakHashMap weakHashMap = q69.a;
        decorView.postOnAnimation(this.y0);
        this.Z = true;
    }

    public final int D(Context context, int i) {
        if (i != -100) {
            if (i != -1) {
                if (i != 0) {
                    if (i != 1 && i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                        }
                        if (this.Y == null) {
                            this.Y = new hn(this, context);
                        }
                        return this.Y.h();
                    }
                } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    return y(context).h();
                }
            }
            return i;
        }
        return -1;
    }

    public final boolean E() {
        boolean z = this.O;
        this.O = false;
        kn knVarA = A(0);
        if (!knVarA.m) {
            k6 k6Var = this.u;
            if (k6Var != null) {
                k6Var.a();
                return true;
            }
            B();
            zk8 zk8Var = this.o;
            if (zk8Var == null || !zk8Var.v()) {
                return false;
            }
        } else if (!z) {
            s(knVarA, true);
            return true;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x0175, code lost:
    
        if (r2.g.getCount() > 0) goto L88;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void F(defpackage.kn r18, android.view.KeyEvent r19) {
        /*
            Method dump skipped, instruction units count: 473
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ln.F(kn, android.view.KeyEvent):void");
    }

    public final boolean G(kn knVar, int i, KeyEvent keyEvent) {
        ot4 ot4Var;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((knVar.k || H(knVar, keyEvent)) && (ot4Var = knVar.h) != null) {
            return ot4Var.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean H(defpackage.kn r12, android.view.KeyEvent r13) {
        /*
            Method dump skipped, instruction units count: 355
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ln.H(kn, android.view.KeyEvent):boolean");
    }

    public final void I() {
        if (this.A) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void J() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z = false;
            if (this.D0 != null && (A(0).m || this.u != null)) {
                z = true;
            }
            if (z && this.E0 == null) {
                this.E0 = fn.b(this.D0, this);
            } else {
                if (z || (onBackInvokedCallback = this.E0) == null) {
                    return;
                }
                fn.c(this.D0, onBackInvokedCallback);
                this.E0 = null;
            }
        }
    }

    @Override // defpackage.zm
    public final void a() {
        if (this.o != null) {
            B();
            if (this.o.K()) {
                return;
            }
            C(0);
        }
    }

    @Override // defpackage.mt4
    public final boolean c(ot4 ot4Var, MenuItem menuItem) {
        kn knVar;
        Window.Callback callback = this.l.getCallback();
        if (callback != null && !this.R) {
            ot4 ot4VarK = ot4Var.k();
            kn[] knVarArr = this.M;
            int length = knVarArr != null ? knVarArr.length : 0;
            int i = 0;
            while (true) {
                if (i < length) {
                    knVar = knVarArr[i];
                    if (knVar != null && knVar.h == ot4VarK) {
                        break;
                    }
                    i++;
                } else {
                    knVar = null;
                    break;
                }
            }
            if (knVar != null) {
                return callback.onMenuItemSelected(knVar.a, menuItem);
            }
        }
        return false;
    }

    @Override // defpackage.zm
    public final void d() throws IllegalAccessException {
        String strH0;
        this.P = true;
        m(false, true);
        x();
        Object obj = this.j;
        if (obj instanceof Activity) {
            try {
                Activity activity2 = (Activity) obj;
                try {
                    strH0 = yq2.h0(activity2, activity2.getComponentName());
                } catch (PackageManager.NameNotFoundException e) {
                    throw new IllegalArgumentException(e);
                }
            } catch (IllegalArgumentException unused) {
                strH0 = null;
            }
            if (strH0 != null) {
                zk8 zk8Var = this.o;
                if (zk8Var == null) {
                    this.z0 = true;
                } else {
                    zk8Var.c0(true);
                }
            }
            synchronized (zm.h) {
                zm.f(this);
                zm.g.add(new WeakReference(this));
            }
        }
        this.S = new Configuration(this.k.getResources().getConfiguration());
        this.Q = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    @Override // defpackage.zm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.j
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L11
            java.lang.Object r0 = defpackage.zm.h
            monitor-enter(r0)
            defpackage.zm.f(r3)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            goto L11
        Le:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
        L11:
            boolean r0 = r3.Z
            if (r0 == 0) goto L20
            android.view.Window r0 = r3.l
            android.view.View r0 = r0.getDecorView()
            an r1 = r3.y0
            r0.removeCallbacks(r1)
        L20:
            r0 = 1
            r3.R = r0
            int r0 = r3.T
            r1 = -100
            if (r0 == r1) goto L4d
            java.lang.Object r0 = r3.j
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L4d
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L4d
            fw7 r0 = defpackage.ln.F0
            java.lang.Object r1 = r3.j
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.T
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L5c
        L4d:
            fw7 r0 = defpackage.ln.F0
            java.lang.Object r1 = r3.j
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L5c:
            zk8 r0 = r3.o
            if (r0 == 0) goto L63
            r0.S()
        L63:
            hn r0 = r3.X
            if (r0 == 0) goto L6a
            r0.e()
        L6a:
            hn r0 = r3.Y
            if (r0 == 0) goto L71
            r0.e()
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ln.e():void");
    }

    @Override // defpackage.zm
    public final boolean g(int i) {
        if (i == 8) {
            i = 108;
        } else if (i == 9) {
            i = 109;
        }
        if (this.K && i == 108) {
            return false;
        }
        if (this.G && i == 1) {
            this.G = false;
        }
        if (i == 1) {
            I();
            this.K = true;
            return true;
        }
        if (i == 2) {
            I();
            this.E = true;
            return true;
        }
        if (i == 5) {
            I();
            this.F = true;
            return true;
        }
        if (i == 10) {
            I();
            this.I = true;
            return true;
        }
        if (i == 108) {
            I();
            this.G = true;
            return true;
        }
        if (i != 109) {
            return this.l.requestFeature(i);
        }
        I();
        this.H = true;
        return true;
    }

    @Override // defpackage.zm
    public final void h(int i) {
        w();
        ViewGroup viewGroup = (ViewGroup) this.B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.k).inflate(i, viewGroup);
        this.m.a(this.l.getCallback());
    }

    @Override // defpackage.zm
    public final void i(View view) {
        w();
        ViewGroup viewGroup = (ViewGroup) this.B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.m.a(this.l.getCallback());
    }

    @Override // defpackage.zm
    public final void j(View view, ViewGroup.LayoutParams layoutParams) {
        w();
        ViewGroup viewGroup = (ViewGroup) this.B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.m.a(this.l.getCallback());
    }

    @Override // defpackage.zm
    public final void l(CharSequence charSequence) {
        this.q = charSequence;
        jc1 jc1Var = this.r;
        if (jc1Var != null) {
            jc1Var.setWindowTitle(charSequence);
            return;
        }
        zk8 zk8Var = this.o;
        if (zk8Var != null) {
            zk8Var.l0(charSequence);
            return;
        }
        TextView textView = this.C;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m(boolean r17, boolean r18) throws java.lang.IllegalAccessException {
        /*
            Method dump skipped, instruction units count: 618
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ln.m(boolean, boolean):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n(android.view.Window r4) {
        /*
            r3 = this;
            android.view.Window r0 = r3.l
            java.lang.String r1 = "AppCompat has already installed itself into the Window"
            if (r0 != 0) goto L66
            android.view.Window$Callback r0 = r4.getCallback()
            boolean r2 = r0 instanceof defpackage.gn
            if (r2 != 0) goto L60
            gn r1 = new gn
            r1.<init>(r3, r0)
            r3.m = r1
            r4.setCallback(r1)
            android.content.Context r0 = r3.k
            int[] r1 = defpackage.ln.G0
            r2 = 0
            sk6 r0 = defpackage.sk6.C(r0, r2, r1)
            r1 = 0
            android.graphics.drawable.Drawable r1 = r0.w(r1)
            if (r1 == 0) goto L2b
            r4.setBackgroundDrawable(r1)
        L2b:
            r0.G()
            r3.l = r4
            int r4 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            if (r4 < r0) goto L5f
            android.window.OnBackInvokedDispatcher r4 = r3.D0
            if (r4 != 0) goto L5f
            if (r4 == 0) goto L45
            android.window.OnBackInvokedCallback r0 = r3.E0
            if (r0 == 0) goto L45
            defpackage.fn.c(r4, r0)
            r3.E0 = r2
        L45:
            java.lang.Object r4 = r3.j
            boolean r0 = r4 instanceof android.app.Activity
            if (r0 == 0) goto L5a
            android.app.Activity r4 = (android.app.Activity) r4
            android.view.Window r0 = r4.getWindow()
            if (r0 == 0) goto L5a
            android.window.OnBackInvokedDispatcher r4 = defpackage.fn.a(r4)
            r3.D0 = r4
            goto L5c
        L5a:
            r3.D0 = r2
        L5c:
            r3.J()
        L5f:
            return
        L60:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            r4.<init>(r1)
            throw r4
        L66:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            r4.<init>(r1)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ln.n(android.view.Window):void");
    }

    @Override // defpackage.mt4
    public final void o(ot4 ot4Var) {
        jc1 jc1Var = this.r;
        if (jc1Var == null || !((ActionBarOverlayLayout) jc1Var).b() || (ViewConfiguration.get(this.k).hasPermanentMenuKey() && !((ActionBarOverlayLayout) this.r).l())) {
            kn knVarA = A(0);
            knVarA.n = true;
            s(knVarA, false);
            F(knVarA, null);
            return;
        }
        Window.Callback callback = this.l.getCallback();
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.r;
        actionBarOverlayLayout.m();
        if (((m) actionBarOverlayLayout.e).a.s()) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.r;
            actionBarOverlayLayout2.m();
            ((m) actionBarOverlayLayout2.e).b();
            if (this.R) {
                return;
            }
            callback.onPanelClosed(108, A(0).h);
            return;
        }
        if (callback == null || this.R) {
            return;
        }
        if (this.Z && (1 & this.x0) != 0) {
            View decorView = this.l.getDecorView();
            an anVar = this.y0;
            decorView.removeCallbacks(anVar);
            anVar.run();
        }
        kn knVarA2 = A(0);
        ot4 ot4Var2 = knVarA2.h;
        if (ot4Var2 == null || knVarA2.o || !callback.onPreparePanel(0, knVarA2.g, ot4Var2)) {
            return;
        }
        callback.onMenuOpened(108, knVarA2.h);
        ActionBarOverlayLayout actionBarOverlayLayout3 = (ActionBarOverlayLayout) this.r;
        actionBarOverlayLayout3.m();
        ((m) actionBarOverlayLayout3.e).a.z();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:114:0x01c0
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // android.view.LayoutInflater.Factory2
    public final android.view.View onCreateView(android.view.View r9, java.lang.String r10, android.content.Context r11, android.util.AttributeSet r12) {
        /*
            Method dump skipped, instruction units count: 688
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ln.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    public final void q(int i, kn knVar, ot4 ot4Var) {
        if (ot4Var == null) {
            if (knVar == null && i >= 0) {
                kn[] knVarArr = this.M;
                if (i < knVarArr.length) {
                    knVar = knVarArr[i];
                }
            }
            if (knVar != null) {
                ot4Var = knVar.h;
            }
        }
        if ((knVar == null || knVar.m) && !this.R) {
            gn gnVar = this.m;
            Window.Callback callback = this.l.getCallback();
            gnVar.getClass();
            try {
                gnVar.e = true;
                callback.onPanelClosed(i, ot4Var);
            } finally {
                gnVar.e = false;
            }
        }
    }

    public final void r(ot4 ot4Var) {
        if (this.L) {
            return;
        }
        this.L = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.r;
        actionBarOverlayLayout.m();
        ((m) actionBarOverlayLayout.e).a();
        Window.Callback callback = this.l.getCallback();
        if (callback != null && !this.R) {
            callback.onPanelClosed(108, ot4Var);
        }
        this.L = false;
    }

    public final void s(kn knVar, boolean z) {
        jn jnVar;
        jc1 jc1Var;
        if (z && knVar.a == 0 && (jc1Var = this.r) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) jc1Var;
            actionBarOverlayLayout.m();
            if (((m) actionBarOverlayLayout.e).a.s()) {
                r(knVar.h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.k.getSystemService("window");
        if (windowManager != null && knVar.m && (jnVar = knVar.e) != null) {
            windowManager.removeView(jnVar);
            if (z) {
                q(knVar.a, knVar, null);
            }
        }
        knVar.k = false;
        knVar.l = false;
        knVar.m = false;
        knVar.f = null;
        knVar.n = true;
        if (this.N == knVar) {
            this.N = null;
        }
        if (knVar.a == 0) {
            J();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean u(android.view.KeyEvent r7) {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ln.u(android.view.KeyEvent):boolean");
    }

    public final void v(int i) {
        kn knVarA = A(i);
        if (knVarA.h != null) {
            Bundle bundle = new Bundle();
            knVarA.h.u(bundle);
            if (bundle.size() > 0) {
                knVarA.p = bundle;
            }
            knVarA.h.y();
            knVarA.h.clear();
        }
        knVarA.o = true;
        knVarA.n = true;
        if ((i == 108 || i == 0) && this.r != null) {
            kn knVarA2 = A(0);
            knVarA2.k = false;
            H(knVarA2, null);
        }
    }

    public final void w() {
        ViewGroup viewGroup;
        if (this.A) {
            return;
        }
        int[] iArr = lu6.AppCompatTheme;
        Context context = this.k;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!typedArrayObtainStyledAttributes.hasValue(lu6.AppCompatTheme_windowActionBar)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(lu6.AppCompatTheme_windowNoTitle, false)) {
            g(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(lu6.AppCompatTheme_windowActionBar, false)) {
            g(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(lu6.AppCompatTheme_windowActionBarOverlay, false)) {
            g(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(lu6.AppCompatTheme_windowActionModeOverlay, false)) {
            g(10);
        }
        this.J = typedArrayObtainStyledAttributes.getBoolean(lu6.AppCompatTheme_android_windowIsFloating, false);
        typedArrayObtainStyledAttributes.recycle();
        x();
        this.l.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        int i = 5;
        if (this.K) {
            viewGroup = this.I ? (ViewGroup) layoutInflaterFrom.inflate(ls6.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(ls6.abc_screen_simple, (ViewGroup) null);
        } else if (this.J) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(ls6.abc_dialog_title_material, (ViewGroup) null);
            this.H = false;
            this.G = false;
        } else if (this.G) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(xp6.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new f51(context, typedValue.resourceId) : context).inflate(ls6.abc_screen_toolbar, (ViewGroup) null);
            jc1 jc1Var = (jc1) viewGroup.findViewById(pr6.decor_content_parent);
            this.r = jc1Var;
            jc1Var.setWindowCallback(this.l.getCallback());
            if (this.H) {
                ((ActionBarOverlayLayout) this.r).k(109);
            }
            if (this.E) {
                ((ActionBarOverlayLayout) this.r).k(2);
            }
            if (this.F) {
                ((ActionBarOverlayLayout) this.r).k(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            StringBuilder sb = new StringBuilder("AppCompat does not support the current theme features: { windowActionBar: ");
            sb.append(this.G);
            sb.append(", windowActionBarOverlay: ");
            sb.append(this.H);
            sb.append(", android:windowIsFloating: ");
            sb.append(this.J);
            sb.append(", windowActionModeOverlay: ");
            sb.append(this.I);
            sb.append(", windowNoTitle: ");
            throw new IllegalArgumentException(t61.l(sb, this.K, " }"));
        }
        nm5 nm5Var = new nm5(4, this);
        WeakHashMap weakHashMap = q69.a;
        h69.m(viewGroup, nm5Var);
        if (this.r == null) {
            this.C = (TextView) viewGroup.findViewById(pr6.title);
        }
        boolean z = ca9.a;
        try {
            Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(viewGroup, null);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(pr6.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.l.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.l.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new qm5(i, this));
        this.B = viewGroup;
        Object obj = this.j;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.q;
        if (!TextUtils.isEmpty(title)) {
            jc1 jc1Var2 = this.r;
            if (jc1Var2 != null) {
                jc1Var2.setWindowTitle(title);
            } else {
                zk8 zk8Var = this.o;
                if (zk8Var != null) {
                    zk8Var.l0(title);
                } else {
                    TextView textView = this.C;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.B.findViewById(R.id.content);
        View decorView = this.l.getDecorView();
        contentFrameLayout2.setDecorPadding(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(lu6.AppCompatTheme);
        typedArrayObtainStyledAttributes2.getValue(lu6.AppCompatTheme_windowMinWidthMajor, contentFrameLayout2.getMinWidthMajor());
        typedArrayObtainStyledAttributes2.getValue(lu6.AppCompatTheme_windowMinWidthMinor, contentFrameLayout2.getMinWidthMinor());
        if (typedArrayObtainStyledAttributes2.hasValue(lu6.AppCompatTheme_windowFixedWidthMajor)) {
            typedArrayObtainStyledAttributes2.getValue(lu6.AppCompatTheme_windowFixedWidthMajor, contentFrameLayout2.getFixedWidthMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(lu6.AppCompatTheme_windowFixedWidthMinor)) {
            typedArrayObtainStyledAttributes2.getValue(lu6.AppCompatTheme_windowFixedWidthMinor, contentFrameLayout2.getFixedWidthMinor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(lu6.AppCompatTheme_windowFixedHeightMajor)) {
            typedArrayObtainStyledAttributes2.getValue(lu6.AppCompatTheme_windowFixedHeightMajor, contentFrameLayout2.getFixedHeightMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(lu6.AppCompatTheme_windowFixedHeightMinor)) {
            typedArrayObtainStyledAttributes2.getValue(lu6.AppCompatTheme_windowFixedHeightMinor, contentFrameLayout2.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.A = true;
        kn knVarA = A(0);
        if (this.R || knVarA.h != null) {
            return;
        }
        C(108);
    }

    public final void x() {
        if (this.l == null) {
            Object obj = this.j;
            if (obj instanceof Activity) {
                n(((Activity) obj).getWindow());
            }
        }
        if (this.l == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final y y(Context context) {
        if (this.X == null) {
            if (sk6.e == null) {
                Context applicationContext = context.getApplicationContext();
                sk6.e = new sk6(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.X = new hn(this, sk6.e);
        }
        return this.X;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
