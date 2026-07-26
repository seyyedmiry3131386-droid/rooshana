package androidx.compose.ui.platform;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.StrictMode;
import android.os.SystemClock;
import android.os.Trace;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillManager;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.ui.focus.FocusStateImpl;
import androidx.compose.ui.node.Invalidation;
import androidx.compose.ui.node.LayoutNode$UsageByParent;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$2;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import androidx.lifecycle.DefaultLifecycleObserver;
import defpackage.a18;
import defpackage.a96;
import defpackage.aa7;
import defpackage.ad;
import defpackage.af;
import defpackage.ai0;
import defpackage.al0;
import defpackage.al4;
import defpackage.aq3;
import defpackage.bf;
import defpackage.bl4;
import defpackage.bm;
import defpackage.bp2;
import defpackage.c26;
import defpackage.cf0;
import defpackage.ch6;
import defpackage.cj1;
import defpackage.cj3;
import defpackage.ck1;
import defpackage.d8;
import defpackage.df;
import defpackage.dh6;
import defpackage.do3;
import defpackage.dp2;
import defpackage.e30;
import defpackage.e8;
import defpackage.ef;
import defpackage.eg2;
import defpackage.eo3;
import defpackage.ev2;
import defpackage.fo3;
import defpackage.fy5;
import defpackage.fz1;
import defpackage.g08;
import defpackage.g12;
import defpackage.g27;
import defpackage.g64;
import defpackage.g7;
import defpackage.gh6;
import defpackage.go3;
import defpackage.gx4;
import defpackage.h18;
import defpackage.h30;
import defpackage.h31;
import defpackage.he9;
import defpackage.hf;
import defpackage.hj8;
import defpackage.hn3;
import defpackage.ho3;
import defpackage.hy2;
import defpackage.i64;
import defpackage.i87;
import defpackage.ie9;
import defpackage.ih2;
import defpackage.ii8;
import defpackage.iz1;
import defpackage.j27;
import defpackage.j71;
import defpackage.ja1;
import defpackage.jf;
import defpackage.jg2;
import defpackage.jh;
import defpackage.js3;
import defpackage.k30;
import defpackage.ke1;
import defpackage.kg2;
import defpackage.kx4;
import defpackage.l30;
import defpackage.l44;
import defpackage.lg2;
import defpackage.m30;
import defpackage.m64;
import defpackage.mb5;
import defpackage.mf;
import defpackage.mn7;
import defpackage.n64;
import defpackage.n96;
import defpackage.nc2;
import defpackage.ng;
import defpackage.o27;
import defpackage.o40;
import defpackage.o64;
import defpackage.o77;
import defpackage.of;
import defpackage.og2;
import defpackage.oh2;
import defpackage.ov;
import defpackage.pk4;
import defpackage.pm0;
import defpackage.pp1;
import defpackage.ps0;
import defpackage.pt2;
import defpackage.py4;
import defpackage.py6;
import defpackage.q10;
import defpackage.q6;
import defpackage.q69;
import defpackage.qc9;
import defpackage.qd7;
import defpackage.qe;
import defpackage.qj1;
import defpackage.qk4;
import defpackage.qq3;
import defpackage.rb5;
import defpackage.re;
import defpackage.rg9;
import defpackage.rn3;
import defpackage.rn6;
import defpackage.ro3;
import defpackage.rq4;
import defpackage.s08;
import defpackage.se;
import defpackage.si;
import defpackage.sl3;
import defpackage.sy6;
import defpackage.t15;
import defpackage.t61;
import defpackage.te1;
import defpackage.tf1;
import defpackage.th0;
import defpackage.ti1;
import defpackage.ts5;
import defpackage.tx8;
import defpackage.tz2;
import defpackage.u79;
import defpackage.ue;
import defpackage.ue4;
import defpackage.ue8;
import defpackage.uj1;
import defpackage.up5;
import defpackage.ur6;
import defpackage.uw5;
import defpackage.uy6;
import defpackage.v69;
import defpackage.vp5;
import defpackage.vy2;
import defpackage.w61;
import defpackage.wb5;
import defpackage.wm0;
import defpackage.wp5;
import defpackage.wu8;
import defpackage.wv8;
import defpackage.x79;
import defpackage.xe4;
import defpackage.xi6;
import defpackage.xl;
import defpackage.xl2;
import defpackage.xp5;
import defpackage.xq2;
import defpackage.y40;
import defpackage.ya5;
import defpackage.ye;
import defpackage.yg6;
import defpackage.yj1;
import defpackage.ym3;
import defpackage.yw2;
import defpackage.z27;
import defpackage.z4;
import defpackage.z97;
import defpackage.za5;
import defpackage.zb5;
import defpackage.zc;
import defpackage.ze;
import defpackage.zg6;
import defpackage.zh8;
import defpackage.zi8;
import defpackage.zk0;
import defpackage.zk4;
import defpackage.zk8;
import defpackage.zp7;
import defpackage.zz1;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidComposeView extends ViewGroup implements Owner, n96, aa7, qk4, DefaultLifecycleObserver, uw5, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnTouchModeChangeListener, kg2 {
    public static Class h1;
    public static Method i1;
    public static Method j1;
    public static final mb5 k1 = new mb5();
    public static ad l1;
    public static Method m1;
    public final qe A;
    public long A0;
    public final ng B;
    public boolean B0;
    public final m30 C;
    public long C0;
    public final mb5 D;
    public final wb5 D0;
    public mb5 E;
    public final ck1 E0;
    public boolean F;
    public dp2 F0;
    public boolean G;
    public final androidx.compose.ui.text.input.d G0;
    public final ke1 H;
    public final ii8 H0;
    public final ai0 I;
    public final AtomicReference I0;
    public final wb5 J;
    public final cj1 J0;
    public final re K;
    public final th0 K0;
    public final androidx.compose.ui.autofill.a L;
    public final wb5 L0;
    public boolean M;
    public final wb5 M0;
    public final ze N;
    public final te1 N0;
    public final ye O;
    public final ho3 O0;
    public final androidx.compose.ui.node.p P;
    public final kx4 P0;
    public boolean Q;
    public final g Q0;
    public AndroidViewsHandler R;
    public MotionEvent R0;
    public h31 S;
    public long S0;
    public boolean T;
    public final rn6 T0;
    public final al4 U;
    public final mb5 U0;
    public long V;
    public float V0;
    public final int[] W;
    public float W0;
    public final q6 X0;
    public final af Y0;
    public boolean Z0;
    public long a;
    public final cf0 a1;
    public final boolean b;
    public final bp2 b1;
    public ym3 c;
    public final zk0 c1;
    public final androidx.compose.ui.node.i d;
    public boolean d1;
    public m64 e;
    public final androidx.compose.ui.scrollcapture.c e1;
    public n64 f;
    public View f1;
    public i87 g;
    public final df g1;
    public final ov h;
    public final af i;
    public final wb5 j;
    public final View k;
    public final boolean l;
    public final androidx.compose.ui.focus.c m;
    public w61 n;
    public final androidx.compose.ui.draganddrop.a o;
    public final l44 p;
    public final wm0 q;
    public final si r;
    public final ro3 s;
    public final androidx.compose.ui.node.h t;
    public final ya5 u;
    public final androidx.compose.ui.spatial.a v;
    public final AndroidComposeView w;
    public final mn7 x;
    public final float[] x0;
    public final c y;
    public final float[] y0;
    public androidx.compose.ui.contentcapture.b z;
    public final float[] z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidComposeView(Context context, w61 w61Var) {
        androidx.compose.ui.autofill.a aVar;
        zk0 al0Var;
        super(context);
        final AndroidComposeView androidComposeView = this;
        androidComposeView.a = 9205357640488583168L;
        int i = 1;
        androidComposeView.b = true;
        androidComposeView.d = new androidx.compose.ui.node.i();
        androidComposeView.g = fz1.k;
        androidComposeView.h = new ov();
        androidComposeView.i = new af(androidComposeView, 0);
        uj1 uj1VarF = xq2.f(context);
        hy2 hy2Var = hy2.r;
        androidComposeView.j = androidx.compose.runtime.g.g(uj1VarF, hy2Var);
        int i2 = Build.VERSION.SDK_INT;
        boolean z = i2 >= 35;
        androidComposeView.l = z;
        g12 g12Var = new g12();
        androidComposeView.m = new androidx.compose.ui.focus.c(androidComposeView, androidComposeView);
        androidComposeView.n = w61Var;
        androidComposeView.o = new androidx.compose.ui.draganddrop.a();
        androidComposeView.p = new l44();
        androidComposeView.q = new wm0();
        androidComposeView.r = new si(ViewConfiguration.get(context));
        androidComposeView.s = new ro3();
        androidx.compose.ui.node.h hVar = new androidx.compose.ui.node.h(3);
        hVar.A0(androidx.compose.ui.layout.l.b);
        hVar.x0(androidComposeView.getDensity());
        hVar.C0(androidComposeView.getViewConfiguration());
        hVar.B0(bl4.g(new ef(androidComposeView), ((androidx.compose.ui.focus.c) androidComposeView.getFocusOwner()).e).d(androidComposeView.getDragAndDropManager().c));
        androidComposeView.t = hVar;
        ya5 ya5Var = qq3.a;
        androidComposeView.u = new ya5();
        androidComposeView.getLayoutNodes();
        androidComposeView.v = new androidx.compose.ui.spatial.a();
        androidComposeView.w = androidComposeView;
        androidComposeView.x = new mn7(androidComposeView.getRoot(), g12Var, androidComposeView.getLayoutNodes());
        c cVar = new c(androidComposeView);
        androidComposeView.y = cVar;
        androidComposeView.z = new androidx.compose.ui.contentcapture.b(androidComposeView, new AndroidComposeView$contentCaptureManager$1(0, androidComposeView, d.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/contentcapture/ContentCaptureSessionWrapper;", 1));
        qe qeVar = new qe();
        Object systemService = context.getSystemService("accessibility");
        js3.n(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        androidComposeView.A = qeVar;
        androidComposeView.B = new ng(androidComposeView);
        androidComposeView.C = new m30();
        androidComposeView.D = new mb5();
        androidComposeView.H = new ke1(1);
        androidx.compose.ui.node.h root = androidComposeView.getRoot();
        ai0 ai0Var = new ai0();
        ai0Var.b = root;
        ai0Var.c = new androidx.compose.ui.input.pointer.a((androidx.compose.ui.node.e) root.H.d);
        ai0Var.d = new t15(6);
        ai0Var.e = new tz2();
        androidComposeView.I = ai0Var;
        androidComposeView.J = androidx.compose.runtime.g.h(new Configuration(context.getResources().getConfiguration()));
        androidComposeView.K = f() ? new re(androidComposeView, androidComposeView.getAutofillTree()) : null;
        if (f()) {
            AutofillManager autofillManagerC = se.c(context.getSystemService(se.d()));
            if (autofillManagerC == null) {
                throw t61.r("Autofill service could not be located.");
            }
            androidComposeView = this;
            aVar = new androidx.compose.ui.autofill.a(new k30(autofillManagerC), getSemanticsOwner(), this, getRectManager(), context.getPackageName());
        } else {
            aVar = null;
        }
        androidComposeView.L = aVar;
        androidComposeView.N = new ze(context);
        androidComposeView.O = new ye(androidComposeView.getClipboardManager());
        androidComposeView.P = new androidx.compose.ui.node.p(new dp2() { // from class: androidx.compose.ui.platform.AndroidComposeView$snapshotObserver$1
            {
                super(1);
            }

            @Override // defpackage.dp2
            public final Object invoke(Object obj) {
                bp2 bp2Var = (bp2) obj;
                AndroidComposeView androidComposeView2 = this.g;
                androidComposeView2.getUncaughtExceptionHandler$ui();
                Handler handler = androidComposeView2.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    bp2Var.invoke();
                } else {
                    Handler handler2 = androidComposeView2.getHandler();
                    if (handler2 != null) {
                        handler2.post(new d8(1, bp2Var));
                    }
                }
                return tx8.a;
            }
        });
        androidComposeView.U = new al4(androidComposeView.getRoot());
        long j = Integer.MAX_VALUE;
        androidComposeView.V = (j & 4294967295L) | (j << 32);
        androidComposeView.W = new int[]{0, 0};
        float[] fArrA = pk4.a();
        androidComposeView.x0 = fArrA;
        androidComposeView.y0 = pk4.a();
        androidComposeView.z0 = pk4.a();
        androidComposeView.A0 = -1L;
        androidComposeView.C0 = 9187343241974906880L;
        androidComposeView.D0 = androidx.compose.runtime.g.h(null);
        androidComposeView.E0 = androidx.compose.runtime.g.c(new bp2() { // from class: androidx.compose.ui.platform.AndroidComposeView$viewTreeOwners$2
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return this.g.get_viewTreeOwners();
            }
        });
        androidx.compose.ui.text.input.d dVar = new androidx.compose.ui.text.input.d(androidComposeView.getView(), androidComposeView);
        androidComposeView.G0 = dVar;
        ((AndroidComposeView_androidKt$platformTextInputServiceInterceptor$1) d.a).getClass();
        androidComposeView.H0 = new ii8(dVar);
        androidComposeView.I0 = new AtomicReference(null);
        androidComposeView.J0 = new cj1(androidComposeView.getTextInputService());
        androidComposeView.K0 = new th0(25);
        androidComposeView.L0 = androidx.compose.runtime.g.g(wu8.o(context), hy2Var);
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        int[] iArr = jg2.a;
        LayoutDirection layoutDirection2 = layoutDirection != 0 ? layoutDirection != 1 ? null : LayoutDirection.b : LayoutDirection.a;
        androidComposeView.M0 = androidx.compose.runtime.g.h(layoutDirection2 == null ? LayoutDirection.a : layoutDirection2);
        androidComposeView.N0 = new te1(i, androidComposeView);
        androidComposeView.O0 = new ho3(androidComposeView.isInTouchMode() ? 1 : 2, new dp2() { // from class: androidx.compose.ui.platform.AndroidComposeView$_inputModeManager$1
            {
                super(1);
            }

            @Override // defpackage.dp2
            public final Object invoke(Object obj) {
                int i3 = ((fo3) obj).a;
                AndroidComposeView androidComposeView2 = this.g;
                boolean zRequestFocusFromTouch = true;
                if (i3 == 1) {
                    zRequestFocusFromTouch = androidComposeView2.isInTouchMode();
                } else if (i3 != 2) {
                    zRequestFocusFromTouch = false;
                } else if (androidComposeView2.isInTouchMode()) {
                    zRequestFocusFromTouch = androidComposeView2.requestFocusFromTouch();
                }
                return Boolean.valueOf(zRequestFocusFromTouch);
            }
        });
        androidComposeView.P0 = new kx4(androidComposeView);
        final g gVar = new g();
        new sl3(new bp2() { // from class: androidx.compose.ui.platform.AndroidTextToolbar$textActionModeCallback$1
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return tx8.a;
            }
        });
        TextToolbarStatus[] textToolbarStatusArr = TextToolbarStatus.a;
        androidComposeView.Q0 = gVar;
        androidComposeView.T0 = new rn6(15);
        androidComposeView.U0 = new mb5();
        androidComposeView.X0 = new q6(i, androidComposeView);
        androidComposeView.Y0 = new af(androidComposeView, i);
        androidComposeView.a1 = new cf0(context, new AndroidComposeView$indirectPointerNavigationGestureDetector$1(androidComposeView));
        androidComposeView.b1 = new bp2() { // from class: androidx.compose.ui.platform.AndroidComposeView$resendMotionEventOnLayout$1
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                int actionMasked;
                AndroidComposeView androidComposeView2 = this.g;
                MotionEvent motionEvent = androidComposeView2.R0;
                if (motionEvent != null && ((actionMasked = motionEvent.getActionMasked()) == 7 || actionMasked == 9)) {
                    androidComposeView2.S0 = SystemClock.uptimeMillis();
                    androidComposeView2.post(androidComposeView2.X0);
                }
                return tx8.a;
            }
        };
        if (i2 < 29) {
            do3 do3Var = new do3();
            do3Var.a = fArrA;
            do3Var.b = new int[2];
            al0Var = do3Var;
        } else {
            al0Var = new al0();
        }
        androidComposeView.c1 = al0Var;
        androidComposeView.addOnAttachStateChangeListener(androidComposeView.z);
        androidComposeView.setWillNotDraw(false);
        androidComposeView.setFocusable(true);
        if (i2 >= 26) {
            of.a.a(androidComposeView, 1, false);
        }
        androidComposeView.setFocusableInTouchMode(true);
        androidComposeView.setClipChildren(false);
        q69.q(androidComposeView, cVar);
        androidComposeView.setOnDragListener(androidComposeView.getDragAndDropManager());
        androidComposeView.getRoot().d(androidComposeView);
        if (i2 >= 29) {
            jf.a.a(androidComposeView);
        }
        if (z) {
            View view = new View(context);
            view.setLayoutParams(new ViewGroup.LayoutParams(1, 1));
            view.setTag(ur6.hide_in_inspector_tag, Boolean.TRUE);
            androidComposeView.k = view;
            androidComposeView.addView(view, -1);
        }
        androidComposeView.e1 = i2 >= 31 ? new androidx.compose.ui.scrollcapture.c() : null;
        androidComposeView.g1 = new df(androidComposeView);
    }

    public static final void b(AndroidComposeView androidComposeView, int i, AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        int iD;
        c cVar = androidComposeView.y;
        if (js3.i(str, cVar.E)) {
            int iD2 = cVar.C.d(i);
            if (iD2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iD2);
                return;
            }
            return;
        }
        if (!js3.i(str, cVar.F) || (iD = cVar.D.d(i)) == -1) {
            return;
        }
        accessibilityNodeInfo.getExtras().putInt(str, iD);
    }

    public static boolean f() {
        return Build.VERSION.SDK_INT >= 26;
    }

    @yj1
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui$annotations() {
    }

    /* JADX INFO: renamed from: getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui$annotations, reason: not valid java name */
    public static /* synthetic */ void m3getPrimaryDirectionalMotionAxisOverridedqNNBbU$ui$annotations() {
    }

    public static /* synthetic */ void getRoot$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    @yj1
    public static /* synthetic */ void getTextInputService$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final bf get_viewTreeOwners() {
        return (bf) ((s08) this.D0).getValue();
    }

    public static void h(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof AndroidComposeView) {
                ((AndroidComposeView) childAt).x();
            } else if (childAt instanceof ViewGroup) {
                h((ViewGroup) childAt);
            }
        }
    }

    public static long i(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            return (((long) 0) << 32) | ((long) size);
        }
        if (mode == 0) {
            return (((long) 0) << 32) | ((long) Integer.MAX_VALUE);
        }
        if (mode != 1073741824) {
            throw new IllegalStateException();
        }
        long j = size;
        return j | (j << 32);
    }

    public static View j(int i, View view) throws NoSuchMethodException {
        if (Build.VERSION.SDK_INT < 29) {
            Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", null);
            declaredMethod.setAccessible(true);
            if (js3.i(declaredMethod.invoke(view, null), Integer.valueOf(i))) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View viewJ = j(i, viewGroup.getChildAt(i2));
                    if (viewJ != null) {
                        return viewJ;
                    }
                }
            }
        }
        return null;
    }

    public static void m(androidx.compose.ui.node.h hVar) {
        hVar.P();
        zb5 zb5VarL = hVar.L();
        Object[] objArr = zb5VarL.a;
        int i = zb5VarL.c;
        for (int i2 = 0; i2 < i; i2++) {
            m((androidx.compose.ui.node.h) objArr[i2]);
        }
    }

    public static boolean o(MotionEvent motionEvent) {
        boolean z = (Float.floatToRawIntBits(motionEvent.getX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawY()) & Integer.MAX_VALUE) >= 2139095040;
        if (!z) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i = 1; i < pointerCount; i++) {
                z = (Float.floatToRawIntBits(motionEvent.getX(i)) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY(i)) & Integer.MAX_VALUE) >= 2139095040 || (Build.VERSION.SDK_INT >= 29 && !py4.a.a(motionEvent, i));
                if (z) {
                    break;
                }
            }
        }
        return z;
    }

    private void setDensity(qj1 qj1Var) {
        ((s08) this.j).setValue(qj1Var);
    }

    private void setFontFamilyResolver(oh2 oh2Var) {
        ((s08) this.L0).setValue(oh2Var);
    }

    private void setLayoutDirection(LayoutDirection layoutDirection) {
        ((s08) this.M0).setValue(layoutDirection);
    }

    private final void set_viewTreeOwners(bf bfVar) {
        ((s08) this.D0).setValue(bfVar);
    }

    public final void A(androidx.compose.ui.node.h hVar, boolean z, boolean z2) {
        al4 al4Var = this.U;
        if (!z) {
            al4Var.getClass();
            int iOrdinal = hVar.v().ordinal();
            if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
                return;
            }
            if (iOrdinal != 4) {
                throw new NoWhenBranchMatchedException();
            }
            androidx.compose.ui.node.h hVarF = hVar.F();
            boolean z3 = hVarF == null || hVarF.V();
            if (!z2) {
                if (hVar.A()) {
                    return;
                }
                if (hVar.u() && hVar.V() == z3 && hVar.V() == hVar.W()) {
                    return;
                }
            }
            hVar.b0();
            if (!hVar.R && hVar.W() && z3) {
                if ((hVarF == null || !hVarF.u()) && (hVarF == null || !hVarF.A())) {
                    al4Var.b.g(hVar, Invalidation.d);
                }
                if (al4Var.d) {
                    return;
                }
                F(null);
                return;
            }
            return;
        }
        wv8 wv8Var = al4Var.b;
        int iOrdinal2 = hVar.v().ordinal();
        if (iOrdinal2 != 0) {
            if (iOrdinal2 == 1) {
                return;
            }
            if (iOrdinal2 != 2) {
                if (iOrdinal2 == 3) {
                    return;
                }
                if (iOrdinal2 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        if ((hVar.x() || hVar.w()) && !z2) {
            return;
        }
        hVar.c0();
        hVar.b0();
        if (hVar.R) {
            return;
        }
        androidx.compose.ui.node.h hVarF2 = hVar.F();
        if (js3.i(hVar.X(), Boolean.TRUE) && ((hVarF2 == null || !hVarF2.x()) && (hVarF2 == null || !hVarF2.w()))) {
            wv8Var.g(hVar, Invalidation.b);
        } else if (hVar.V() && ((hVarF2 == null || !hVarF2.u()) && (hVarF2 == null || !hVarF2.A()))) {
            wv8Var.g(hVar, Invalidation.d);
        }
        if (al4Var.d) {
            return;
        }
        F(null);
    }

    public final void B() {
        c cVar = this.y;
        cVar.y = true;
        if (cVar.v() && !cVar.J) {
            cVar.J = true;
            cVar.j.post(cVar.L);
        }
        androidx.compose.ui.contentcapture.b bVar = this.z;
        bVar.g = true;
        if (!bVar.e() || bVar.n) {
            return;
        }
        bVar.n = true;
        bVar.i.post(bVar.o);
    }

    public final void C() {
        if (this.B0) {
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (jCurrentAnimationTimeMillis != this.A0) {
            this.A0 = jCurrentAnimationTimeMillis;
            zk0 zk0Var = this.c1;
            float[] fArr = this.y0;
            zk0Var.b(this, fArr);
            c26.F(fArr, this.z0);
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            int[] iArr = this.W;
            view.getLocationOnScreen(iArr);
            float f = iArr[0];
            float f2 = iArr[1];
            view.getLocationInWindow(iArr);
            this.C0 = (((long) Float.floatToRawIntBits(f - iArr[0])) << 32) | (((long) Float.floatToRawIntBits(f2 - iArr[1])) & 4294967295L);
        }
    }

    public final void D(MotionEvent motionEvent) {
        this.A0 = AnimationUtils.currentAnimationTimeMillis();
        zk0 zk0Var = this.c1;
        float[] fArr = this.y0;
        zk0Var.b(this, fArr);
        c26.F(fArr, this.z0);
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        long jB = pk4.b((((long) Float.floatToRawIntBits(x)) << 32) | (((long) Float.floatToRawIntBits(y)) & 4294967295L), fArr);
        float rawX = motionEvent.getRawX() - Float.intBitsToFloat((int) (jB >> 32));
        float rawY = motionEvent.getRawY() - Float.intBitsToFloat((int) (jB & 4294967295L));
        this.C0 = (((long) Float.floatToRawIntBits(rawX)) << 32) | (((long) Float.floatToRawIntBits(rawY)) & 4294967295L);
    }

    public final boolean E() {
        if (isFocused()) {
            return true;
        }
        return super.requestFocus(130, null);
    }

    public final void F(androidx.compose.ui.node.h hVar) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (hVar != null) {
            while (hVar != null && hVar.B() == LayoutNode$UsageByParent.a) {
                if (!this.T) {
                    androidx.compose.ui.node.h hVarF = hVar.F();
                    if (hVarF == null) {
                        break;
                    }
                    long j = ((androidx.compose.ui.node.e) hVarF.H.d).d;
                    if (h31.f(j) && h31.e(j)) {
                        break;
                    }
                }
                hVar = hVar.F();
            }
            if (hVar == getRoot()) {
                requestLayout();
                return;
            }
        }
        if (getWidth() == 0 || getHeight() == 0) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    public final long G(long j) {
        C();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (this.C0 >> 32));
        return pk4.b((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (this.C0 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32), this.z0);
    }

    public final int H(MotionEvent motionEvent) {
        Object obj;
        if (this.d1) {
            this.d1 = false;
            int metaState = motionEvent.getMetaState();
            this.p.getClass();
            ((s08) ie9.a).setValue(new gh6(metaState));
        }
        ke1 ke1Var = this.H;
        nc2 nc2VarC = ke1Var.c(motionEvent, this);
        int actionMasked = motionEvent.getActionMasked();
        ai0 ai0Var = this.I;
        if (nc2VarC == null) {
            if (!ai0Var.a) {
                ((ue4) ((t15) ai0Var.d).b).b();
                ((androidx.compose.ui.input.pointer.a) ai0Var.c).c();
            }
            return 0;
        }
        List list = (List) nc2VarC.c;
        int size = list.size() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                obj = list.get(size);
                if (((ch6) obj).e && (actionMasked == 0 || actionMasked == 5)) {
                    break;
                }
                if (i < 0) {
                    break;
                }
                size = i;
            }
            obj = null;
        } else {
            obj = null;
        }
        ch6 ch6Var = (ch6) obj;
        if (ch6Var != null) {
            this.a = ch6Var.d;
        }
        int iV = ai0Var.v(nc2VarC, this, p(motionEvent));
        nc2VarC.b = null;
        if ((actionMasked != 0 && actionMasked != 5) || (iV & 1) != 0) {
            return iV;
        }
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        ((SparseBooleanArray) ke1Var.e).delete(pointerId);
        ((SparseLongArray) ke1Var.d).delete(pointerId);
        return iV;
    }

    public final void I(MotionEvent motionEvent, int i, long j, boolean z) {
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                actionIndex = motionEvent.getActionIndex();
            }
        } else if (i != 9 && i != 10) {
            actionIndex = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (actionIndex >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i2 = 0; i2 < pointerCount; i2++) {
            pointerPropertiesArr[i2] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i3 = 0; i3 < pointerCount; i3++) {
            pointerCoordsArr[i3] = new MotionEvent.PointerCoords();
        }
        int i4 = 0;
        while (i4 < pointerCount) {
            int i5 = ((actionIndex < 0 || i4 < actionIndex) ? 0 : 1) + i4;
            motionEvent.getPointerProperties(i5, pointerPropertiesArr[i4]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i4];
            motionEvent.getPointerCoords(i5, pointerCoords);
            float f = pointerCoords.x;
            long jS = s((((long) Float.floatToRawIntBits(pointerCoords.y)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32));
            pointerCoords.x = Float.intBitsToFloat((int) (jS >> 32));
            pointerCoords.y = Float.intBitsToFloat((int) (jS & 4294967295L));
            i4++;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j : motionEvent.getDownTime(), j, i, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        nc2 nc2VarC = this.H.c(motionEventObtain, this);
        js3.m(nc2VarC);
        this.I.v(nc2VarC, this, true);
        motionEventObtain.recycle();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void J(defpackage.qp2 r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof androidx.compose.ui.platform.AndroidComposeView$textInputSession$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.ui.platform.AndroidComposeView$textInputSession$1 r0 = (androidx.compose.ui.platform.AndroidComposeView$textInputSession$1) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            androidx.compose.ui.platform.AndroidComposeView$textInputSession$1 r0 = new androidx.compose.ui.platform.AndroidComposeView$textInputSession$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2b:
            kotlin.b.b(r6)
            goto L42
        L2f:
            kotlin.b.b(r6)
            androidx.compose.ui.platform.AndroidComposeView$textInputSession$2 r6 = new androidx.compose.ui.platform.AndroidComposeView$textInputSession$2
            r6.<init>()
            r0.c = r3
            java.util.concurrent.atomic.AtomicReference r2 = r4.I0
            java.lang.Object r5 = androidx.compose.ui.b.d(r2, r6, r5, r0)
            if (r5 != r1) goto L42
            return
        L42:
            kotlin.KotlinNothingValueException r5 = new kotlin.KotlinNothingValueException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.J(qp2, kotlin.coroutines.jvm.internal.ContinuationImpl):void");
    }

    public final void K(Configuration configuration) {
        Configuration configuration2 = getConfiguration();
        if (js3.i(configuration2, configuration)) {
            return;
        }
        setConfiguration(new Configuration(configuration));
        if (configuration2.fontScale != configuration.fontScale || configuration2.densityDpi != configuration.densityDpi) {
            setDensity(xq2.f(getContext()));
        }
        dp2 dp2Var = d.a;
        if ((configuration2.diff(configuration) & (-1342235264)) != 0) {
            this.p.getClass();
        }
        int i = Build.VERSION.SDK_INT;
        if ((i >= 31 ? configuration2.fontWeightAdjustment : 0) != (i >= 31 ? configuration.fontWeightAdjustment : 0)) {
            setFontFamilyResolver(wu8.o(getContext()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void L() {
        /*
            Method dump skipped, instruction units count: 313
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.L():void");
    }

    public final void M(float f) {
        if (this.l) {
            if (f > 0.0f) {
                if (Float.isNaN(this.V0) || f > this.V0) {
                    this.V0 = f;
                    return;
                }
                return;
            }
            if (f < 0.0f) {
                if (Float.isNaN(this.W0) || f < this.W0) {
                    this.W0 = f;
                }
            }
        }
    }

    @Override // defpackage.kg2
    public final void a(androidx.compose.ui.focus.d dVar, androidx.compose.ui.focus.d dVar2) {
        z4 z4Var;
        z4 z4Var2;
        if (dVar != null) {
            androidx.compose.ui.focus.d dVar3 = dVar;
            if (!dVar3.a.n) {
                rn3.b("visitAncestors called on an unattached node");
            }
            gx4 gx4Var = dVar3.a;
            androidx.compose.ui.node.h hVarH = y40.H(dVar);
            LinkedHashSet linkedHashSet = null;
            ArrayList arrayList = null;
            while (hVarH != null) {
                if ((((gx4) hVarH.H.g).d & 2097152) != 0) {
                    while (gx4Var != null) {
                        if ((gx4Var.c & 2097152) != 0) {
                            gx4 gx4VarJ = gx4Var;
                            zb5 zb5Var = null;
                            while (gx4VarJ != null) {
                                if (gx4VarJ instanceof hn3) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(gx4VarJ);
                                } else if ((gx4VarJ.c & 2097152) != 0 && (gx4VarJ instanceof ti1)) {
                                    int i = 0;
                                    for (gx4 gx4Var2 = ((ti1) gx4VarJ).p; gx4Var2 != null; gx4Var2 = gx4Var2.f) {
                                        if ((gx4Var2.c & 2097152) != 0) {
                                            i++;
                                            if (i == 1) {
                                                gx4VarJ = gx4Var2;
                                            } else {
                                                if (zb5Var == null) {
                                                    zb5Var = new zb5(0, new gx4[16]);
                                                }
                                                if (gx4VarJ != null) {
                                                    zb5Var.b(gx4VarJ);
                                                    gx4VarJ = null;
                                                }
                                                zb5Var.b(gx4Var2);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                gx4VarJ = y40.j(zb5Var);
                            }
                        }
                        gx4Var = gx4Var.e;
                    }
                }
                hVarH = hVarH.F();
                gx4Var = (hVarH == null || (z4Var2 = hVarH.H) == null) ? null : (ue8) z4Var2.f;
            }
            if (arrayList == null) {
                return;
            }
            if (dVar2 != null) {
                if (!dVar2.a.n) {
                    rn3.b("visitAncestors called on an unattached node");
                }
                gx4 gx4Var3 = dVar2.a;
                androidx.compose.ui.node.h hVarH2 = y40.H(dVar2);
                LinkedHashSet linkedHashSet2 = null;
                while (hVarH2 != null) {
                    if ((((gx4) hVarH2.H.g).d & 2097152) != 0) {
                        while (gx4Var3 != null) {
                            if ((gx4Var3.c & 2097152) != 0) {
                                gx4 gx4VarJ2 = gx4Var3;
                                zb5 zb5Var2 = null;
                                while (gx4VarJ2 != null) {
                                    if (gx4VarJ2 instanceof hn3) {
                                        if (linkedHashSet2 == null) {
                                            linkedHashSet2 = new LinkedHashSet();
                                        }
                                        linkedHashSet2.add(gx4VarJ2);
                                    } else if ((gx4VarJ2.c & 2097152) != 0 && (gx4VarJ2 instanceof ti1)) {
                                        int i2 = 0;
                                        for (gx4 gx4Var4 = ((ti1) gx4VarJ2).p; gx4Var4 != null; gx4Var4 = gx4Var4.f) {
                                            if ((gx4Var4.c & 2097152) != 0) {
                                                i2++;
                                                if (i2 == 1) {
                                                    gx4VarJ2 = gx4Var4;
                                                } else {
                                                    if (zb5Var2 == null) {
                                                        zb5Var2 = new zb5(0, new gx4[16]);
                                                    }
                                                    if (gx4VarJ2 != null) {
                                                        zb5Var2.b(gx4VarJ2);
                                                        gx4VarJ2 = null;
                                                    }
                                                    zb5Var2.b(gx4Var4);
                                                }
                                            }
                                        }
                                        if (i2 == 1) {
                                        }
                                    }
                                    gx4VarJ2 = y40.j(zb5Var2);
                                }
                            }
                            gx4Var3 = gx4Var3.e;
                        }
                    }
                    hVarH2 = hVarH2.F();
                    gx4Var3 = (hVarH2 == null || (z4Var = hVarH2.H) == null) ? null : (ue8) z4Var.f;
                }
                linkedHashSet = linkedHashSet2;
            }
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                hn3 hn3Var = (hn3) arrayList.get(i3);
                if (!(linkedHashSet != null ? linkedHashSet.contains(hn3Var) : false)) {
                    hn3Var.V();
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        androidx.compose.ui.focus.d dVar = ((androidx.compose.ui.focus.c) getFocusOwner()).c;
        if (!dVar.n) {
            return;
        }
        if (!dVar.a.n) {
            rn3.b("visitSubtreeIf called on an unattached node");
        }
        zb5 zb5Var = new zb5(0, new gx4[16]);
        gx4 gx4Var = dVar.a;
        gx4 gx4Var2 = gx4Var.f;
        if (gx4Var2 == null) {
            y40.g(zb5Var, gx4Var);
        } else {
            zb5Var.b(gx4Var2);
        }
        while (true) {
            int i3 = zb5Var.c;
            if (i3 == 0) {
                return;
            }
            gx4 gx4Var3 = (gx4) zb5Var.l(i3 - 1);
            if ((gx4Var3.d & 1024) != 0) {
                for (gx4 gx4Var4 = gx4Var3; gx4Var4 != null && gx4Var4.n; gx4Var4 = gx4Var4.f) {
                    if ((gx4Var4.c & 1024) != 0) {
                        gx4 gx4VarJ = gx4Var4;
                        zb5 zb5Var2 = null;
                        while (gx4VarJ != null) {
                            if (gx4VarJ instanceof androidx.compose.ui.focus.d) {
                                androidx.compose.ui.focus.d dVar2 = (androidx.compose.ui.focus.d) gx4VarJ;
                                if (dVar2.n && dVar2.E0().a) {
                                    super.addFocusables(arrayList, i, i2);
                                    androidx.compose.ui.focus.d dVar3 = ((androidx.compose.ui.focus.c) getFocusOwner()).c;
                                    if (dVar3.n) {
                                        if (!dVar3.a.n) {
                                            rn3.b("visitSubtreeIf called on an unattached node");
                                        }
                                        zb5 zb5Var3 = new zb5(0, new gx4[16]);
                                        gx4 gx4Var5 = dVar3.a;
                                        gx4 gx4Var6 = gx4Var5.f;
                                        if (gx4Var6 == null) {
                                            y40.g(zb5Var3, gx4Var5);
                                        } else {
                                            zb5Var3.b(gx4Var6);
                                        }
                                        while (true) {
                                            int i4 = zb5Var3.c;
                                            if (i4 == 0) {
                                                break;
                                            }
                                            gx4 gx4Var7 = (gx4) zb5Var3.l(i4 - 1);
                                            if ((gx4Var7.d & 1024) != 0) {
                                                for (gx4 gx4Var8 = gx4Var7; gx4Var8 != null && gx4Var8.n; gx4Var8 = gx4Var8.f) {
                                                    if ((gx4Var8.c & 1024) != 0) {
                                                        gx4 gx4VarJ2 = gx4Var8;
                                                        zb5 zb5Var4 = null;
                                                        while (gx4VarJ2 != null) {
                                                            if (gx4VarJ2 instanceof androidx.compose.ui.focus.d) {
                                                                androidx.compose.ui.focus.d dVar4 = (androidx.compose.ui.focus.d) gx4VarJ2;
                                                                if (dVar4.n) {
                                                                    og2 og2VarE0 = dVar4.E0();
                                                                    if (dVar4.n && !dVar4.o && og2VarE0.a) {
                                                                        return;
                                                                    }
                                                                }
                                                            } else if ((gx4VarJ2.c & 1024) != 0 && (gx4VarJ2 instanceof ti1)) {
                                                                int i5 = 0;
                                                                for (gx4 gx4Var9 = ((ti1) gx4VarJ2).p; gx4Var9 != null; gx4Var9 = gx4Var9.f) {
                                                                    if ((gx4Var9.c & 1024) != 0) {
                                                                        i5++;
                                                                        if (i5 == 1) {
                                                                            gx4VarJ2 = gx4Var9;
                                                                        } else {
                                                                            if (zb5Var4 == null) {
                                                                                zb5Var4 = new zb5(0, new gx4[16]);
                                                                            }
                                                                            if (gx4VarJ2 != null) {
                                                                                zb5Var4.b(gx4VarJ2);
                                                                                gx4VarJ2 = null;
                                                                            }
                                                                            zb5Var4.b(gx4Var9);
                                                                        }
                                                                    }
                                                                }
                                                                if (i5 == 1) {
                                                                }
                                                            }
                                                            gx4VarJ2 = y40.j(zb5Var4);
                                                        }
                                                    }
                                                }
                                            }
                                            y40.g(zb5Var3, gx4Var7);
                                        }
                                    }
                                    if (arrayList != null) {
                                        arrayList.remove(this);
                                        return;
                                    }
                                    return;
                                }
                            } else if ((gx4VarJ.c & 1024) != 0 && (gx4VarJ instanceof ti1)) {
                                int i6 = 0;
                                for (gx4 gx4Var10 = ((ti1) gx4VarJ).p; gx4Var10 != null; gx4Var10 = gx4Var10.f) {
                                    if ((gx4Var10.c & 1024) != 0) {
                                        i6++;
                                        if (i6 == 1) {
                                            gx4VarJ = gx4Var10;
                                        } else {
                                            if (zb5Var2 == null) {
                                                zb5Var2 = new zb5(0, new gx4[16]);
                                            }
                                            if (gx4VarJ != null) {
                                                zb5Var2.b(gx4VarJ);
                                                gx4VarJ = null;
                                            }
                                            zb5Var2.b(gx4Var10);
                                        }
                                    }
                                }
                                if (i6 == 1) {
                                }
                            }
                            gx4VarJ = y40.j(zb5Var2);
                        }
                    }
                }
            }
            y40.g(zb5Var, gx4Var3);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        addView(view, -1);
    }

    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        if (f()) {
            androidx.compose.ui.autofill.a aVar = this.L;
            if (aVar != null) {
                aVar.b(sparseArray);
            }
            re reVar = this.K;
            if (reVar != null) {
                aq3.o(reVar, sparseArray);
            }
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.y.m(i, this.a, false);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return this.y.m(i, this.a, true);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (!isAttachedToWindow()) {
            m(getRoot());
        }
        t(true);
        g08.j().m();
        this.F = true;
        wm0 wm0Var = this.q;
        ue ueVar = wm0Var.a;
        Canvas canvas2 = ueVar.a;
        ueVar.a = canvas;
        getRoot().j(ueVar, null);
        wm0Var.a.a = canvas2;
        mb5 mb5Var = this.D;
        if (mb5Var.e()) {
            int i = mb5Var.b;
            for (int i2 = 0; i2 < i; i2++) {
                ((fy5) mb5Var.b(i2)).k();
            }
        }
        if (ViewLayer.i) {
            int iSave = canvas.save();
            canvas.clipRect(0.0f, 0.0f, 0.0f, 0.0f);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(iSave);
        }
        mb5Var.j();
        this.F = false;
        mb5 mb5Var2 = this.E;
        if (mb5Var2 != null) {
            mb5Var.h(mb5Var2);
            mb5Var2.j();
        }
        if (this.l) {
            bm.a(this, this.V0);
            View view = this.k;
            if (view == null) {
                js3.V("frameRateCategoryView");
                throw null;
            }
            bm.a(view, this.W0);
            if (!Float.isNaN(this.W0)) {
                view.invalidate();
                drawChild(canvas, view, getDrawingTime());
            }
            this.V0 = Float.NaN;
            this.W0 = Float.NaN;
        }
        getRectManager().a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0504 A[PHI: r6
      0x0504: PHI (r6v52 ??) = (r6v75 ??), (r6v76 ??), (r6v77 ??) binds: [B:308:0x04c5, B:310:0x04c9, B:325:0x04fd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:460:0x06e7 A[PHI: r5
      0x06e7: PHI (r5v38 ??) = (r5v94 ??), (r5v95 ??), (r5v96 ??) binds: [B:441:0x06ac, B:443:0x06b0, B:458:0x06e2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r32v0 */
    /* JADX WARN: Type inference failed for: r32v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r32v2 */
    /* JADX WARN: Type inference failed for: r38v0 */
    /* JADX WARN: Type inference failed for: r38v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r38v2 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v32, types: [gx4] */
    /* JADX WARN: Type inference failed for: r4v33, types: [gx4] */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v35, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v37 */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r4v67 */
    /* JADX WARN: Type inference failed for: r4v68 */
    /* JADX WARN: Type inference failed for: r4v69 */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v38, types: [zb5] */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v42, types: [zb5] */
    /* JADX WARN: Type inference failed for: r5v49 */
    /* JADX WARN: Type inference failed for: r5v50 */
    /* JADX WARN: Type inference failed for: r5v59 */
    /* JADX WARN: Type inference failed for: r5v60, types: [gx4] */
    /* JADX WARN: Type inference failed for: r5v61, types: [gx4] */
    /* JADX WARN: Type inference failed for: r5v62 */
    /* JADX WARN: Type inference failed for: r5v63, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v64 */
    /* JADX WARN: Type inference failed for: r5v65 */
    /* JADX WARN: Type inference failed for: r5v66 */
    /* JADX WARN: Type inference failed for: r5v67 */
    /* JADX WARN: Type inference failed for: r5v86 */
    /* JADX WARN: Type inference failed for: r5v87 */
    /* JADX WARN: Type inference failed for: r5v88 */
    /* JADX WARN: Type inference failed for: r5v89 */
    /* JADX WARN: Type inference failed for: r5v90 */
    /* JADX WARN: Type inference failed for: r5v91 */
    /* JADX WARN: Type inference failed for: r5v92 */
    /* JADX WARN: Type inference failed for: r5v93 */
    /* JADX WARN: Type inference failed for: r5v94 */
    /* JADX WARN: Type inference failed for: r5v95 */
    /* JADX WARN: Type inference failed for: r5v96 */
    /* JADX WARN: Type inference failed for: r6v32 */
    /* JADX WARN: Type inference failed for: r6v50 */
    /* JADX WARN: Type inference failed for: r6v51 */
    /* JADX WARN: Type inference failed for: r6v52, types: [zb5] */
    /* JADX WARN: Type inference failed for: r6v53 */
    /* JADX WARN: Type inference failed for: r6v54 */
    /* JADX WARN: Type inference failed for: r6v55 */
    /* JADX WARN: Type inference failed for: r6v56, types: [zb5] */
    /* JADX WARN: Type inference failed for: r6v70 */
    /* JADX WARN: Type inference failed for: r6v71 */
    /* JADX WARN: Type inference failed for: r6v72 */
    /* JADX WARN: Type inference failed for: r6v73 */
    /* JADX WARN: Type inference failed for: r6v74 */
    /* JADX WARN: Type inference failed for: r6v75 */
    /* JADX WARN: Type inference failed for: r6v76 */
    /* JADX WARN: Type inference failed for: r6v77 */
    /* JADX WARN: Type inference failed for: r7v40 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean dispatchGenericMotionEvent(final android.view.MotionEvent r43) {
        /*
            Method dump skipped, instruction units count: 2021
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.dispatchGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x015e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean dispatchHoverEvent(android.view.MotionEvent r24) {
        /*
            Method dump skipped, instruction units count: 359
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.dispatchHoverEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(final KeyEvent keyEvent) {
        if (!isFocused()) {
            return ((androidx.compose.ui.focus.c) getFocusOwner()).d(keyEvent, new bp2() { // from class: androidx.compose.ui.platform.AndroidComposeView.dispatchKeyEvent.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.bp2
                public final Object invoke() {
                    return Boolean.valueOf(AndroidComposeView.super.dispatchKeyEvent(keyEvent));
                }
            });
        }
        int metaState = keyEvent.getMetaState();
        this.p.getClass();
        ((s08) ie9.a).setValue(new gh6(metaState));
        return ((androidx.compose.ui.focus.c) getFocusOwner()).d(keyEvent, new bp2() { // from class: androidx.compose.ui.focus.FocusOwner$dispatchKeyEvent$1
            @Override // defpackage.bp2
            public final /* bridge */ /* synthetic */ Object invoke() {
                return Boolean.FALSE;
            }
        }) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        z4 z4Var;
        if (isFocused()) {
            androidx.compose.ui.focus.c cVar = (androidx.compose.ui.focus.c) getFocusOwner();
            if (cVar.d.e) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated.");
            } else {
                androidx.compose.ui.focus.d dVarA = zk8.A(cVar.c);
                if (dVarA != null) {
                    if (!dVarA.a.n) {
                        rn3.b("visitAncestors called on an unattached node");
                    }
                    gx4 gx4Var = dVarA.a;
                    androidx.compose.ui.node.h hVarH = y40.H(dVarA);
                    while (hVarH != null) {
                        if ((((gx4) hVarH.H.g).d & 131072) != 0) {
                            while (gx4Var != null) {
                                if ((gx4Var.c & 131072) != 0) {
                                    gx4 gx4VarJ = gx4Var;
                                    zb5 zb5Var = null;
                                    while (gx4VarJ != null) {
                                        if ((gx4VarJ.c & 131072) != 0 && (gx4VarJ instanceof ti1)) {
                                            int i = 0;
                                            for (gx4 gx4Var2 = ((ti1) gx4VarJ).p; gx4Var2 != null; gx4Var2 = gx4Var2.f) {
                                                if ((gx4Var2.c & 131072) != 0) {
                                                    i++;
                                                    if (i == 1) {
                                                        gx4VarJ = gx4Var2;
                                                    } else {
                                                        if (zb5Var == null) {
                                                            zb5Var = new zb5(0, new gx4[16]);
                                                        }
                                                        if (gx4VarJ != null) {
                                                            zb5Var.b(gx4VarJ);
                                                            gx4VarJ = null;
                                                        }
                                                        zb5Var.b(gx4Var2);
                                                    }
                                                }
                                            }
                                            if (i == 1) {
                                            }
                                        }
                                        gx4VarJ = y40.j(zb5Var);
                                    }
                                }
                                gx4Var = gx4Var.e;
                            }
                        }
                        hVarH = hVarH.F();
                        gx4Var = (hVarH == null || (z4Var = hVarH.H) == null) ? null : (ue8) z4Var.f;
                    }
                }
            }
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideStructure(ViewStructure viewStructure) {
        if (Build.VERSION.SDK_INT < 28) {
            hf.a.a(viewStructure, getView());
        } else {
            super.dispatchProvideStructure(viewStructure);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object q10Var;
        androidx.compose.ui.focus.d dVarF;
        if (this.Z0) {
            af afVar = this.Y0;
            removeCallbacks(afVar);
            MotionEvent motionEvent2 = this.R0;
            js3.m(motionEvent2);
            if (motionEvent.getActionMasked() == 0 && motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
                this.Z0 = false;
            } else {
                afVar.run();
            }
        }
        if (!o(motionEvent) && isAttachedToWindow() && (motionEvent.getActionMasked() != 2 || q(motionEvent))) {
            int iL = l(motionEvent);
            if ((iL & 2) != 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            boolean z = motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5;
            boolean z2 = motionEvent.isFromSource(8194) || motionEvent.isFromSource(1048584);
            if (z && z2) {
                Object parent = getParent();
                View view = parent instanceof View ? (View) parent : null;
                if (view == null || (q10Var = view.getTag(ur6.auto_clear_focus_behavior_tag)) == null) {
                    q10Var = new q10(1);
                }
                if (q10Var.equals(new q10(1)) && (dVarF = ((androidx.compose.ui.focus.c) getFocusOwner()).f()) != null) {
                    androidx.compose.ui.node.m mVarG = y40.G(dVarF);
                    if (!c26.t(mVarG).I(mVarG, true).a((((long) Float.floatToRawIntBits(motionEvent.getX())) << 32) | (((long) Float.floatToRawIntBits(motionEvent.getY())) & 4294967295L))) {
                        ((androidx.compose.ui.focus.c) getFocusOwner()).b(8, false, true);
                    }
                }
            }
            if ((iL & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    public final View findViewByAccessibilityIdTraversal(int i) throws IllegalAccessException, InvocationTargetException {
        try {
            if (Build.VERSION.SDK_INT < 29) {
                return j(i, this);
            }
            Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(this, Integer.valueOf(i));
            if (objInvoke instanceof View) {
                return (View) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i) {
        sy6 sy6VarA;
        if (view == null || this.U.c) {
            return super.focusSearch(view, i);
        }
        View rootView = getRootView();
        js3.n(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus((ViewGroup) rootView, view, i);
        if (viewFindNextFocus == null || !d.a(this, viewFindNextFocus)) {
            viewFindNextFocus = null;
        }
        if (view == this) {
            androidx.compose.ui.focus.d dVarA = zk8.A(((androidx.compose.ui.focus.c) getFocusOwner()).c);
            sy6VarA = dVarA != null ? zk8.C(dVarA) : null;
            if (sy6VarA == null) {
                sy6VarA = jg2.a(view, this);
            }
        } else {
            sy6VarA = jg2.a(view, this);
        }
        eg2 eg2VarD = jg2.d(i);
        int i2 = eg2VarD != null ? eg2VarD.a : 6;
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        if (((androidx.compose.ui.focus.c) getFocusOwner()).e(i2, sy6VarA, new dp2() { // from class: androidx.compose.ui.platform.AndroidComposeView$focusSearch$searchResult$1
            {
                super(1);
            }

            @Override // defpackage.dp2
            public final Object invoke(Object obj) {
                ref$ObjectRef.a = (androidx.compose.ui.focus.d) obj;
                return Boolean.TRUE;
            }
        }) == null) {
            return view;
        }
        Object obj = ref$ObjectRef.a;
        if (obj == null) {
            if (viewFindNextFocus == null) {
                return super.focusSearch(view, i);
            }
        } else if (viewFindNextFocus == null || i2 == 1 || i2 == 2 || androidx.compose.ui.focus.e.k(zk8.C((androidx.compose.ui.focus.d) obj), jg2.a(viewFindNextFocus, this), sy6VarA, i2)) {
            return this;
        }
        return viewFindNextFocus;
    }

    public final AndroidViewsHandler getAndroidViewsHandler$ui() {
        if (this.R == null) {
            AndroidViewsHandler androidViewsHandler = new AndroidViewsHandler(getContext());
            this.R = androidViewsHandler;
            addView(androidViewsHandler, -1);
            requestLayout();
        }
        AndroidViewsHandler androidViewsHandler2 = this.R;
        js3.m(androidViewsHandler2);
        return androidViewsHandler2;
    }

    @Override // androidx.compose.ui.node.Owner
    public e30 getAutofill() {
        return this.K;
    }

    @Override // androidx.compose.ui.node.Owner
    public l30 getAutofillManager() {
        return this.L;
    }

    @Override // androidx.compose.ui.node.Owner
    public m30 getAutofillTree() {
        return this.C;
    }

    public final Configuration getConfiguration() {
        return (Configuration) ((s08) this.J).getValue();
    }

    public final androidx.compose.ui.contentcapture.b getContentCaptureManager$ui() {
        return this.z;
    }

    @Override // androidx.compose.ui.node.Owner
    public w61 getCoroutineContext() {
        return this.n;
    }

    @Override // androidx.compose.ui.node.Owner
    public qj1 getDensity() {
        return (qj1) ((s08) this.j).getValue();
    }

    @Override // defpackage.n96
    public sy6 getEmbeddedViewFocusRect() {
        if (isFocused()) {
            androidx.compose.ui.focus.d dVarA = zk8.A(((androidx.compose.ui.focus.c) getFocusOwner()).c);
            if (dVarA != null) {
                return zk8.C(dVarA);
            }
            return null;
        }
        View viewFindFocus = findFocus();
        if (viewFindFocus != null) {
            return jg2.a(viewFindFocus, this);
        }
        return null;
    }

    @Override // androidx.compose.ui.node.Owner
    public lg2 getFocusOwner() {
        return this.m;
    }

    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        sy6 embeddedViewFocusRect = getEmbeddedViewFocusRect();
        if (embeddedViewFocusRect != null) {
            rect.left = Math.round(embeddedViewFocusRect.a);
            rect.top = Math.round(embeddedViewFocusRect.b);
            rect.right = Math.round(embeddedViewFocusRect.c);
            rect.bottom = Math.round(embeddedViewFocusRect.d);
            return;
        }
        if (js3.i(((androidx.compose.ui.focus.c) getFocusOwner()).e(6, null, new dp2() { // from class: androidx.compose.ui.platform.AndroidComposeView.getFocusedRect.1
            @Override // defpackage.dp2
            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return Boolean.TRUE;
            }
        }), Boolean.TRUE)) {
            super.getFocusedRect(rect);
        } else {
            rect.set(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        }
    }

    @Override // androidx.compose.ui.node.Owner
    public oh2 getFontFamilyResolver() {
        return (oh2) ((s08) this.L0).getValue();
    }

    @Override // androidx.compose.ui.node.Owner
    public ih2 getFontLoader() {
        return this.K0;
    }

    public final m64 getFrameEndScheduler$ui() {
        return this.e;
    }

    @Override // androidx.compose.ui.node.Owner
    public ev2 getGraphicsContext() {
        return this.B;
    }

    @Override // androidx.compose.ui.node.Owner
    public yw2 getHapticFeedBack() {
        return this.N0;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return this.U.b.F() || !this.h.isEmpty();
    }

    @Override // android.view.View
    public int getImportantForAutofill() {
        return 1;
    }

    @Override // androidx.compose.ui.node.Owner
    public go3 getInputModeManager() {
        return this.O0;
    }

    public final ro3 getInsetsListener() {
        return this.s;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui() {
        return this.A0;
    }

    @Override // android.view.View, android.view.ViewParent, androidx.compose.ui.node.Owner
    public LayoutDirection getLayoutDirection() {
        return (LayoutDirection) ((s08) this.M0).getValue();
    }

    public long getMeasureIteration() {
        al4 al4Var = this.U;
        if (!al4Var.c) {
            rn3.a("measureIteration should be only used during the measure/layout pass");
        }
        return al4Var.g;
    }

    public kx4 getModifierLocalManager() {
        return this.P0;
    }

    @Override // androidx.compose.ui.node.Owner
    public a96 getPlacementScope() {
        dp2 dp2Var = androidx.compose.ui.layout.k.a;
        return new xe4(1, this);
    }

    @Override // androidx.compose.ui.node.Owner
    public zg6 getPointerIconService() {
        return this.g1;
    }

    /* JADX INFO: renamed from: getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui, reason: not valid java name */
    public final ym3 m4getPrimaryDirectionalMotionAxisOverridedqNNBbU$ui() {
        return this.c;
    }

    @Override // androidx.compose.ui.node.Owner
    public androidx.compose.ui.spatial.a getRectManager() {
        return this.v;
    }

    @Override // androidx.compose.ui.node.Owner
    public i87 getRetainedValuesStore() {
        return this.g;
    }

    @Override // androidx.compose.ui.node.Owner
    public androidx.compose.ui.node.h getRoot() {
        return this.t;
    }

    public aa7 getRootForTest() {
        return this.w;
    }

    public final boolean getScrollCaptureInProgress$ui() {
        androidx.compose.ui.scrollcapture.c cVar;
        if (Build.VERSION.SDK_INT < 31 || (cVar = this.e1) == null) {
            return false;
        }
        return ((Boolean) ((s08) cVar.a).getValue()).booleanValue();
    }

    @Override // androidx.compose.ui.node.Owner
    public mn7 getSemanticsOwner() {
        return this.x;
    }

    @Override // androidx.compose.ui.node.Owner
    public androidx.compose.ui.node.i getSharedDrawScope() {
        return this.d;
    }

    @Override // androidx.compose.ui.node.Owner
    public boolean getShowLayoutBounds() {
        return Build.VERSION.SDK_INT >= 30 ? xl.a.a(this) : this.Q;
    }

    @Override // androidx.compose.ui.node.Owner
    public androidx.compose.ui.node.p getSnapshotObserver() {
        return this.P;
    }

    @Override // androidx.compose.ui.node.Owner
    public h18 getSoftwareKeyboardController() {
        return this.J0;
    }

    @Override // androidx.compose.ui.node.Owner
    public ii8 getTextInputService() {
        return this.H0;
    }

    @Override // androidx.compose.ui.node.Owner
    public hj8 getTextToolbar() {
        return this.Q0;
    }

    public final z97 getUncaughtExceptionHandler$ui() {
        return null;
    }

    public View getView() {
        return this;
    }

    @Override // androidx.compose.ui.node.Owner
    public v69 getViewConfiguration() {
        return this.r;
    }

    public final bf getViewTreeOwners() {
        return (bf) this.E0.getValue();
    }

    @Override // androidx.compose.ui.node.Owner
    public he9 getWindowInfo() {
        return this.p;
    }

    public final androidx.compose.ui.autofill.a get_autofillManager$ui() {
        return this.L;
    }

    public final void k(androidx.compose.ui.node.h hVar, boolean z) {
        this.U.f(hVar, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int l(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instruction units count: 381
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.l(android.view.MotionEvent):int");
    }

    public final void n(androidx.compose.ui.node.h hVar) {
        this.U.p(hVar, false);
        zb5 zb5VarL = hVar.L();
        Object[] objArr = zb5VarL.a;
        int i = zb5VarL.c;
        for (int i2 = 0; i2 < i; i2++) {
            n((androidx.compose.ui.node.h) objArr[i2]);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        i87 i87Var;
        i64 i64VarD;
        Object obj;
        re reVar;
        super.onAttachedToWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30) {
            setShowLayoutBounds(ja1.w());
        }
        this.s.onViewAttachedToWindow(this);
        int i2 = 0;
        if (i > 28) {
            if (l1 == null) {
                ad adVar = new ad(i);
                l1 = adVar;
                StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
                try {
                    if (h1 == null) {
                        h1 = Class.forName("android.os.SystemProperties");
                    }
                    if (j1 == null) {
                        StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
                        Class cls = h1;
                        j1 = cls != null ? cls.getDeclaredMethod("addChangeCallback", Runnable.class) : null;
                    }
                    Method method = j1;
                    if (method != null) {
                        method.invoke(null, adVar);
                    }
                } catch (Throwable unused) {
                }
                StrictMode.setVmPolicy(vmPolicy);
            }
            mb5 mb5Var = k1;
            synchronized (mb5Var) {
                mb5Var.g(this);
            }
        }
        ((s08) this.p.a).setValue(Boolean.valueOf(hasWindowFocus()));
        l44 l44Var = this.p;
        new bp2() { // from class: androidx.compose.ui.platform.AndroidComposeView.onAttachedToWindow.1
            @Override // defpackage.bp2
            public final Object invoke() {
                return rq4.g(AndroidComposeView.this);
            }
        };
        l44Var.getClass();
        n(getRoot());
        m(getRoot());
        getSnapshotObserver().a.e();
        if (f() && (reVar = this.K) != null) {
            h30.a.a(reVar);
        }
        g64 g64VarD = j27.d(this);
        qd7 qd7VarE = o27.e(this);
        x79 x79VarG = z27.g(this);
        m64 m64Var = this.e;
        if (g64VarD == null || x79VarG == null || m64Var == null) {
            i87Var = null;
        } else {
            u79 u79VarM = x79VarG.m();
            xl2 xl2Var = new xl2(3);
            j71 j71Var = j71.b;
            js3.p(u79VarM, "store");
            js3.p(j71Var, "extras");
            o77 o77Var = new o77(u79VarM, xl2Var, j71Var);
            ps0 ps0VarA = g27.a(o64.class);
            String strB = ps0VarA.b();
            if (strB == null) {
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
            o64 o64Var = (o64) o77Var.u(ps0VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB));
            Object parent = getParent();
            js3.n(parent, "null cannot be cast to non-null type android.view.View");
            int id = ((View) parent).getId();
            ya5 ya5Var = o64Var.b;
            Object objB = ya5Var.b(id);
            if (objB == null) {
                objB = new mb5(1);
                ya5Var.h(id, objB);
            }
            mb5 mb5Var2 = (mb5) objB;
            Object[] objArr = mb5Var2.a;
            int i3 = mb5Var2.b;
            while (true) {
                if (i2 >= i3) {
                    obj = null;
                    break;
                }
                obj = objArr[i2];
                if (!((n64) obj).c) {
                    break;
                } else {
                    i2++;
                }
            }
            n64 n64Var = (n64) obj;
            if (n64Var == null) {
                n64Var = new n64();
                mb5Var2.g(n64Var);
            }
            n64Var.c = true;
            this.f = n64Var;
            i87Var = n64Var.b;
        }
        if (i87Var == null) {
            i87Var = fz1.k;
        }
        this.g = i87Var;
        bf viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners == null || (g64VarD != null && qd7VarE != null && (g64VarD != viewTreeOwners.a || qd7VarE != viewTreeOwners.b || x79VarG != viewTreeOwners.c))) {
            if (g64VarD == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
            }
            if (qd7VarE == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
            }
            if (viewTreeOwners != null && (i64VarD = viewTreeOwners.a.D()) != null) {
                i64VarD.f(this);
            }
            g64VarD.D().a(this);
            bf bfVar = new bf(g64VarD, qd7VarE, x79VarG);
            set_viewTreeOwners(bfVar);
            dp2 dp2Var = this.F0;
            if (dp2Var != null) {
                dp2Var.invoke(bfVar);
            }
            this.F0 = null;
        }
        ((s08) this.O0.b).setValue(new fo3(isInTouchMode() ? 1 : 2));
        bf viewTreeOwners2 = getViewTreeOwners();
        i64 i64VarD2 = viewTreeOwners2 != null ? viewTreeOwners2.a.D() : null;
        if (i64VarD2 == null) {
            throw t61.r("No lifecycle owner exists");
        }
        i64VarD2.a(this);
        i64VarD2.a(this.z);
        getViewTreeObserver().addOnGlobalLayoutListener(this);
        getViewTreeObserver().addOnScrollChangedListener(this);
        getViewTreeObserver().addOnTouchModeChangeListener(this);
        if (Build.VERSION.SDK_INT >= 31) {
            mf.a.b(this);
        }
        androidx.compose.ui.autofill.a aVar = this.L;
        if (aVar != null) {
            ((androidx.compose.ui.focus.c) getFocusOwner()).g.g(aVar);
            getSemanticsOwner().d.g(aVar);
        }
        ((androidx.compose.ui.focus.c) getFocusOwner()).g.g(this);
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        zp7 zp7Var = (zp7) this.I0.get();
        f fVar = (f) (zp7Var != null ? zp7Var.b : null);
        if (fVar == null) {
            return this.G0.d;
        }
        zp7 zp7Var2 = (zp7) fVar.d.get();
        eo3 eo3Var = (eo3) (zp7Var2 != null ? zp7Var2.b : null);
        return eo3Var != null && (eo3Var.e ^ true);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        K(configuration);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(g64 g64Var) {
        tf1.a(this, g64Var);
    }

    @Override // android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        int i;
        zp7 zp7Var = (zp7) this.I0.get();
        f fVar = (f) (zp7Var != null ? zp7Var.b : null);
        if (fVar == null) {
            androidx.compose.ui.text.input.d dVar = this.G0;
            if (dVar.d) {
                cj3 cj3Var = dVar.h;
                zh8 zh8Var = dVar.g;
                int i2 = cj3Var.d;
                if (i2 == 1) {
                    i = 0;
                } else if (i2 == 0) {
                    i = 1;
                } else if (i2 == 2) {
                    i = 2;
                } else if (i2 == 6) {
                    i = 5;
                } else if (i2 == 5) {
                    i = 7;
                } else if (i2 == 3) {
                    i = 3;
                } else if (i2 == 4) {
                    i = 4;
                } else {
                    if (i2 != 7) {
                        throw new IllegalStateException("invalid ImeAction");
                    }
                    i = 6;
                }
                editorInfo.imeOptions = i;
                int i3 = cj3Var.c;
                if (i3 == 1) {
                    editorInfo.inputType = 1;
                } else if (i3 == 2) {
                    editorInfo.inputType = 1;
                    editorInfo.imeOptions = Integer.MIN_VALUE | i;
                } else if (i3 == 3) {
                    editorInfo.inputType = 2;
                } else if (i3 == 4) {
                    editorInfo.inputType = 3;
                } else if (i3 == 5) {
                    editorInfo.inputType = 17;
                } else if (i3 == 6) {
                    editorInfo.inputType = 33;
                } else if (i3 == 7) {
                    editorInfo.inputType = 129;
                } else if (i3 == 8) {
                    editorInfo.inputType = 18;
                } else {
                    if (i3 != 9) {
                        throw new IllegalStateException("Invalid Keyboard Type");
                    }
                    editorInfo.inputType = 8194;
                }
                int i4 = editorInfo.inputType;
                if ((i4 & 1) == 1) {
                    editorInfo.inputType = i4 | 131072;
                    if (i2 == 1) {
                        editorInfo.imeOptions |= 1073741824;
                    }
                }
                int i5 = editorInfo.inputType;
                if ((i5 & 1) == 1) {
                    int i6 = cj3Var.a;
                    if (i6 == 1) {
                        editorInfo.inputType = i5 | 4096;
                    } else if (i6 == 2) {
                        editorInfo.inputType = i5 | 8192;
                    } else if (i6 == 3) {
                        editorInfo.inputType = i5 | 16384;
                    }
                    if (cj3Var.b) {
                        editorInfo.inputType |= 32768;
                    }
                }
                long j = zh8Var.b;
                int i7 = zi8.c;
                editorInfo.initialSelStart = (int) (j >> 32);
                editorInfo.initialSelEnd = (int) (j & 4294967295L);
                iz1.c(editorInfo, zh8Var.a.b);
                editorInfo.imeOptions |= 33554432;
                if (zz1.d()) {
                    zz1.a().i(editorInfo);
                }
                py6 py6Var = new py6(dVar.g, new t15(14, dVar), dVar.h.b);
                dVar.i.add(new WeakReference(py6Var));
                return py6Var;
            }
        } else {
            zp7 zp7Var2 = (zp7) fVar.d.get();
            final eo3 eo3Var = (eo3) (zp7Var2 != null ? zp7Var2.b : null);
            if (eo3Var != null) {
                synchronized (eo3Var.c) {
                    if (eo3Var.e) {
                        return null;
                    }
                    InputConnection inputConnectionA = eo3Var.a.a(editorInfo);
                    dp2 dp2Var = new dp2() { // from class: androidx.compose.ui.platform.InputMethodSession$createInputConnection$1$1
                        {
                            super(1);
                        }

                        @Override // defpackage.dp2
                        public final Object invoke(Object obj) {
                            up5 up5Var = (up5) obj;
                            InputConnection inputConnection = up5Var.b;
                            if (inputConnection != null) {
                                up5Var.a(inputConnection);
                                up5Var.b = null;
                            }
                            eo3 eo3Var2 = eo3Var;
                            zb5 zb5Var = eo3Var2.d;
                            Object[] objArr = zb5Var.a;
                            int i8 = zb5Var.c;
                            int i9 = 0;
                            while (true) {
                                if (i9 >= i8) {
                                    i9 = -1;
                                    break;
                                }
                                if (js3.i((qc9) objArr[i9], up5Var)) {
                                    break;
                                }
                                i9++;
                            }
                            if (i9 >= 0) {
                                zb5Var.l(i9);
                            }
                            if (zb5Var.c == 0) {
                                ((AndroidPlatformTextInputSession$startInputMethod$2.AnonymousClass1) eo3Var2.b).invoke();
                            }
                            return tx8.a;
                        }
                    };
                    int i8 = Build.VERSION.SDK_INT;
                    InputConnection xp5Var = i8 >= 34 ? new xp5(inputConnectionA, dp2Var) : i8 >= 25 ? new wp5(inputConnectionA, dp2Var) : i8 >= 24 ? new vp5(inputConnectionA, dp2Var) : new up5(inputConnectionA, dp2Var);
                    eo3Var.d.b(new qc9(xp5Var));
                    return xp5Var;
                }
            }
        }
        return null;
    }

    @Override // android.view.View
    public final void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer consumer) {
        androidx.compose.ui.contentcapture.b bVar = this.z;
        bVar.getClass();
        zc.o(bVar, jArr, consumer);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onDestroy(g64 g64Var) {
        tf1.b(this, g64Var);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        re reVar;
        super.onDetachedFromWindow();
        this.s.onViewDetachedFromWindow(this);
        if (this.l) {
            View view = this.k;
            if (view == null) {
                js3.V("frameRateCategoryView");
                throw null;
            }
            removeView(view);
        }
        int i = Build.VERSION.SDK_INT;
        if (i > 28) {
            mb5 mb5Var = k1;
            synchronized (mb5Var) {
                mb5Var.k(this);
            }
        }
        a18 a18Var = getSnapshotObserver().a;
        ts5 ts5Var = a18Var.h;
        if (ts5Var != null) {
            ts5Var.b();
        }
        a18Var.a();
        this.p.getClass();
        bf viewTreeOwners = getViewTreeOwners();
        i64 i64VarD = viewTreeOwners != null ? viewTreeOwners.a.D() : null;
        if (i64VarD == null) {
            throw t61.r("No lifecycle owner exists");
        }
        i64VarD.f(this.z);
        i64VarD.f(this);
        if (f() && (reVar = this.K) != null) {
            h30.a.b(reVar);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this);
        getViewTreeObserver().removeOnScrollChangedListener(this);
        getViewTreeObserver().removeOnTouchModeChangeListener(this);
        n64 n64Var = this.f;
        if (n64Var != null) {
            n64Var.c = false;
        }
        this.f = null;
        if (i >= 31) {
            mf.a.a(this);
        }
        androidx.compose.ui.autofill.a aVar = this.L;
        if (aVar != null) {
            getSemanticsOwner().d.k(aVar);
            ((androidx.compose.ui.focus.c) getFocusOwner()).g.k(aVar);
        }
        androidx.compose.ui.spatial.a rectManager = getRectManager();
        d8 d8Var = rectManager.g;
        if (d8Var != null) {
            Handler handler = e8.a;
            if ((o40.O(d8Var) ? d8Var : null) != null) {
                e8.a.removeCallbacks(d8Var);
            }
            rectManager.g = null;
        }
        ((androidx.compose.ui.focus.c) getFocusOwner()).g.k(this);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (z || hasFocus()) {
            return;
        }
        androidx.compose.ui.focus.c cVar = (androidx.compose.ui.focus.c) getFocusOwner();
        androidx.compose.ui.focus.e.d(cVar.c, true);
        if (cVar.f() != null) {
            androidx.compose.ui.focus.d dVarF = cVar.f();
            cVar.i(null);
            if (dVarF != null) {
                dVarF.D0(FocusStateImpl.a, FocusStateImpl.c);
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.A0 = 0L;
        L();
        int i = Build.VERSION.SDK_INT;
        if (32 > i || i >= 34) {
            return;
        }
        K(getResources().getConfiguration());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.A0 = 0L;
        this.U.j(this.b1);
        this.S = null;
        L();
        if (this.R != null) {
            getAndroidViewsHandler$ui().layout(0, 0, i3 - i, i4 - i2);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        al4 al4Var = this.U;
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                n(getRoot());
            }
            long jI = i(i);
            long jI2 = i(i2);
            long jX = vy2.x((int) (jI >>> 32), (int) (jI & 4294967295L), (int) (jI2 >>> 32), (int) (4294967295L & jI2));
            h31 h31Var = this.S;
            if (h31Var == null) {
                this.S = new h31(jX);
                this.T = false;
            } else if (!h31.b(h31Var.a, jX)) {
                this.T = true;
            }
            al4Var.q(jX);
            al4Var.l();
            setMeasuredDimension(getRoot().I(), getRoot().s());
            if (this.R != null) {
                getAndroidViewsHandler$ui().measure(View.MeasureSpec.makeMeasureSpec(getRoot().I(), 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().s(), 1073741824));
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onPause(g64 g64Var) {
        tf1.c(this, g64Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00b1  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onProvideAutofillVirtualStructure(android.view.ViewStructure r12, int r13) {
        /*
            Method dump skipped, instruction units count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.onProvideAutofillVirtualStructure(android.view.ViewStructure, int):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        yg6 yg6Var;
        int toolType = motionEvent.getToolType(i);
        if (motionEvent.isFromSource(8194) || !motionEvent.isFromSource(16386) || (!(toolType == 2 || toolType == 4) || (yg6Var = ((df) getPointerIconService()).a) == null)) {
            return super.onResolvePointerIcon(motionEvent, i);
        }
        Context context = getContext();
        return yg6Var instanceof jh ? PointerIcon.getSystemIcon(context, ((jh) yg6Var).b) : PointerIcon.getSystemIcon(context, 1000);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(g64 g64Var) {
        pm0 pm0VarV;
        if (Build.VERSION.SDK_INT < 30) {
            setShowLayoutBounds(ja1.w());
        }
        final n64 n64Var = this.f;
        if (n64Var != null) {
            m64 m64Var = this.e;
            js3.m(m64Var);
            pt2 pt2Var = n64Var.a;
            pp1 pp1Var = (pp1) pt2Var.b;
            if (!pp1Var.a || pp1Var.c) {
                return;
            }
            try {
                pm0VarV = ((rg9) m64Var).a.v(new bp2() { // from class: androidx.compose.ui.platform.LifecycleRetainedValuesStoreOwner$RetainedValuesStoreEntry$stopRetainingExitedValues$1
                    {
                        super(0);
                    }

                    @Override // defpackage.bp2
                    public final Object invoke() {
                        pp1 pp1Var2 = (pp1) n64Var.a.b;
                        if (!pp1Var2.b) {
                            if (pp1Var2.c) {
                                xi6.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                            }
                            pp1Var2.b();
                            pp1Var2.c = true;
                        }
                        return tx8.a;
                    }
                });
            } catch (CancellationException unused) {
                pp1 pp1Var2 = (pp1) pt2Var.b;
                if (!pp1Var2.b) {
                    if (pp1Var2.c) {
                        xi6.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    pp1Var2.b();
                    pp1Var2.c = true;
                }
                pm0VarV = null;
            }
            pm0 pm0Var = n64Var.d;
            if (pm0Var != null) {
                pm0Var.cancel();
            }
            n64Var.d = pm0VarV;
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        if (this.b) {
            int[] iArr = jg2.a;
            LayoutDirection layoutDirection = i != 0 ? i != 1 ? null : LayoutDirection.b : LayoutDirection.a;
            if (layoutDirection == null) {
                layoutDirection = LayoutDirection.a;
            }
            setLayoutDirection(layoutDirection);
        }
    }

    @Override // android.view.View
    public final void onScrollCaptureSearch(Rect rect, Point point, Consumer consumer) {
        androidx.compose.ui.scrollcapture.c cVar;
        if (Build.VERSION.SDK_INT < 31 || (cVar = this.e1) == null) {
            return;
        }
        cVar.a(this, getSemanticsOwner(), getCoroutineContext(), consumer);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        L();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStart(g64 g64Var) {
        tf1.e(this, g64Var);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(g64 g64Var) {
        n64 n64Var = this.f;
        if (n64Var != null) {
            pp1 pp1Var = (pp1) n64Var.a.b;
            if (pp1Var.a && !pp1Var.c) {
                pm0 pm0Var = n64Var.d;
                if (pm0Var != null) {
                    pm0Var.cancel();
                }
                n64Var.d = null;
                return;
            }
            if (pp1Var.b) {
                return;
            }
            if (!pp1Var.c) {
                xi6.a("ManagedValuesStore tried to leave composition twice. Is the store installed in multiple places?");
            }
            if (!((rb5) pp1Var.d).i()) {
                xi6.a("Attempted to start retaining exited values with pending exited values");
            }
            pp1Var.c = false;
        }
    }

    @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
    public final void onTouchModeChanged(boolean z) {
        ((s08) this.O0.b).setValue(new fo3(z ? 1 : 2));
    }

    @Override // android.view.View
    public final void onVirtualViewTranslationResponses(LongSparseArray longSparseArray) {
        androidx.compose.ui.contentcapture.b bVar = this.z;
        bVar.getClass();
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        if (js3.i(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            zc.e(bVar, longSparseArray);
        } else {
            bVar.a.post(new g7(bVar, longSparseArray, 1));
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        boolean zW;
        ((s08) this.p.a).setValue(Boolean.valueOf(z));
        this.d1 = true;
        super.onWindowFocusChanged(z);
        if (!z || Build.VERSION.SDK_INT >= 30 || getShowLayoutBounds() == (zW = ja1.w())) {
            return;
        }
        setShowLayoutBounds(zW);
        m(getRoot());
    }

    public final boolean p(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        return 0.0f <= x && x <= ((float) getWidth()) && 0.0f <= y && y <= ((float) getHeight());
    }

    public final boolean q(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        return (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.R0) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) ? false : true;
    }

    public final void r(float[] fArr) {
        C();
        pk4.e(fArr, this.y0);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (this.C0 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.C0 & 4294967295L));
        dp2 dp2Var = d.a;
        float[] fArr2 = this.x0;
        pk4.d(fArr2);
        pk4.f(fArr2, fIntBitsToFloat, fIntBitsToFloat2);
        d.c(fArr, fArr2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        if (!isFocused()) {
            eg2 eg2VarD = jg2.d(i);
            final int i2 = eg2VarD != null ? eg2VarD.a : 7;
            Boolean boolE = ((androidx.compose.ui.focus.c) getFocusOwner()).e(i2, rect != null ? uy6.t(rect) : null, new dp2() { // from class: androidx.compose.ui.platform.AndroidComposeView$requestFocusBypassUnfocusableComposeView$requestFocusWithPrevRect$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.dp2
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(((androidx.compose.ui.focus.d) obj).J0(i2));
                }
            });
            Boolean bool = Boolean.TRUE;
            if (!js3.i(boolE, bool)) {
                if (!js3.i(((androidx.compose.ui.focus.c) getFocusOwner()).e(i2, null, new dp2() { // from class: androidx.compose.ui.platform.AndroidComposeView$requestFocusBypassUnfocusableComposeView$requestFocusWithoutPrevRect$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // defpackage.dp2
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(((androidx.compose.ui.focus.d) obj).J0(i2));
                    }
                }), bool)) {
                    if (!hasFocus()) {
                        return false;
                    }
                    if (i2 == 1 || i2 == 2) {
                        return ((androidx.compose.ui.focus.c) getFocusOwner()).h(i2);
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public final long s(long j) {
        C();
        long jB = pk4.b(j, this.y0);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (this.C0 >> 32)) + Float.intBitsToFloat((int) (jB >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (this.C0 & 4294967295L)) + Float.intBitsToFloat((int) (jB & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public void setAccessibilityEventBatchIntervalMillis(long j) {
        this.y.h = j;
    }

    public final void setConfiguration(Configuration configuration) {
        ((s08) this.J).setValue(configuration);
    }

    public final void setContentCaptureManager$ui(androidx.compose.ui.contentcapture.b bVar) {
        this.z = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [gx4] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [gx4] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [zb5] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [zb5] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v5 */
    public void setCoroutineContext(w61 w61Var) {
        this.n = w61Var;
        gx4 gx4Var = (gx4) getRoot().H.g;
        if (gx4Var instanceof androidx.compose.ui.input.pointer.f) {
            ((androidx.compose.ui.input.pointer.f) gx4Var).E0();
        }
        if (!gx4Var.a.n) {
            rn3.b("visitSubtreeIf called on an unattached node");
        }
        zb5 zb5Var = new zb5(0, new gx4[16]);
        gx4 gx4Var2 = gx4Var.a;
        gx4 gx4Var3 = gx4Var2.f;
        if (gx4Var3 == null) {
            y40.g(zb5Var, gx4Var2);
        } else {
            zb5Var.b(gx4Var3);
        }
        while (true) {
            int i = zb5Var.c;
            if (i == 0) {
                return;
            }
            gx4 gx4Var4 = (gx4) zb5Var.l(i - 1);
            if ((gx4Var4.d & 16) != 0) {
                for (gx4 gx4Var5 = gx4Var4; gx4Var5 != null && gx4Var5.n; gx4Var5 = gx4Var5.f) {
                    if ((gx4Var5.c & 16) != 0) {
                        ?? J = gx4Var5;
                        ?? zb5Var2 = 0;
                        while (J != 0) {
                            if (J instanceof dh6) {
                                dh6 dh6Var = (dh6) J;
                                if (dh6Var instanceof androidx.compose.ui.input.pointer.f) {
                                    ((androidx.compose.ui.input.pointer.f) dh6Var).E0();
                                }
                            } else if ((J.c & 16) != 0 && (J instanceof ti1)) {
                                gx4 gx4Var6 = ((ti1) J).p;
                                int i2 = 0;
                                J = J;
                                zb5Var2 = zb5Var2;
                                while (gx4Var6 != null) {
                                    if ((gx4Var6.c & 16) != 0) {
                                        i2++;
                                        zb5Var2 = zb5Var2;
                                        if (i2 == 1) {
                                            J = gx4Var6;
                                        } else {
                                            if (zb5Var2 == 0) {
                                                zb5Var2 = new zb5(0, new gx4[16]);
                                            }
                                            if (J != 0) {
                                                zb5Var2.b(J);
                                                J = 0;
                                            }
                                            zb5Var2.b(gx4Var6);
                                        }
                                    }
                                    gx4Var6 = gx4Var6.f;
                                    J = J;
                                    zb5Var2 = zb5Var2;
                                }
                                if (i2 == 1) {
                                }
                            }
                            J = y40.j(zb5Var2);
                        }
                    }
                }
            }
            y40.g(zb5Var, gx4Var4);
        }
    }

    public final void setFrameEndScheduler$ui(m64 m64Var) {
        this.e = m64Var;
    }

    public final void setLastMatrixRecalculationAnimationTime$ui(long j) {
        this.A0 = j;
    }

    public final void setOnViewTreeOwnersAvailable(dp2 dp2Var) {
        bf viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            dp2Var.invoke(viewTreeOwners);
        }
        if (isAttachedToWindow()) {
            return;
        }
        this.F0 = dp2Var;
    }

    /* JADX INFO: renamed from: setPrimaryDirectionalMotionAxisOverride-r2epLt8$ui, reason: not valid java name */
    public final void m5setPrimaryDirectionalMotionAxisOverrider2epLt8$ui(ym3 ym3Var) {
        this.c = ym3Var;
    }

    @Override // androidx.compose.ui.node.Owner
    public void setShowLayoutBounds(boolean z) {
        this.Q = z;
    }

    public void setUncaughtExceptionHandler(z97 z97Var) {
        this.U.getClass();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final void t(boolean z) {
        bp2 bp2Var;
        al4 al4Var = this.U;
        if (al4Var.b.F() || ((zb5) al4Var.e.b).c != 0) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            if (z) {
                try {
                    bp2Var = this.b1;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            } else {
                bp2Var = null;
            }
            if (al4Var.j(bp2Var)) {
                requestLayout();
            }
            al4Var.a(false);
            if (this.G) {
                getViewTreeObserver().dispatchOnGlobalLayout();
                this.G = false;
            }
            Trace.endSection();
        }
    }

    public final void u(androidx.compose.ui.node.h hVar, long j) {
        al4 al4Var = this.U;
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            al4Var.k(hVar, j);
            if (!al4Var.b.F()) {
                al4Var.a(false);
                if (this.G) {
                    getViewTreeObserver().dispatchOnGlobalLayout();
                    this.G = false;
                }
            }
            getRectManager().a();
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final boolean v(int i) {
        if (i == 7 || i == 8) {
            return false;
        }
        Integer numC = jg2.c(i);
        if (numC == null) {
            throw t61.r("Invalid focus direction");
        }
        int iIntValue = numC.intValue();
        androidx.compose.ui.focus.d dVarF = ((androidx.compose.ui.focus.c) getFocusOwner()).f();
        if (dVarF == null) {
            throw new IllegalStateException("findNextViewInEmbeddedView called when owner does not have anything focused.");
        }
        Integer numC2 = jg2.c(i);
        if (numC2 == null) {
            throw t61.r("Invalid focus direction");
        }
        int iIntValue2 = numC2.intValue();
        AndroidViewHolder androidViewHolder = y40.H(dVarF).q;
        View interopView = androidViewHolder != null ? androidViewHolder.getInteropView() : null;
        View viewFindFocus = findFocus();
        FocusFinder focusFinder = FocusFinder.getInstance();
        View rootView = getRootView();
        js3.n(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
        View viewFindNextFocus = focusFinder.findNextFocus((ViewGroup) rootView, viewFindFocus, iIntValue2);
        if (viewFindNextFocus == null || interopView == null || !d.a(interopView, viewFindNextFocus)) {
            viewFindNextFocus = null;
        }
        if (viewFindNextFocus != null) {
            return jg2.b(viewFindNextFocus, Integer.valueOf(iIntValue), null);
        }
        return false;
    }

    public final void w(fy5 fy5Var, boolean z) {
        mb5 mb5Var = this.D;
        if (!z) {
            if (this.F) {
                return;
            }
            mb5Var.k(fy5Var);
            mb5 mb5Var2 = this.E;
            if (mb5Var2 != null) {
                mb5Var2.k(fy5Var);
                return;
            }
            return;
        }
        if (!this.F) {
            mb5Var.g(fy5Var);
            return;
        }
        mb5 mb5Var3 = this.E;
        if (mb5Var3 == null) {
            mb5Var3 = new mb5();
            this.E = mb5Var3;
        }
        mb5Var3.g(fy5Var);
    }

    public final void x() {
        mb5 mb5Var;
        int i;
        androidx.compose.ui.autofill.a aVar;
        if (this.M) {
            getSnapshotObserver().a();
            this.M = false;
        }
        AndroidViewsHandler androidViewsHandler = this.R;
        if (androidViewsHandler != null) {
            h(androidViewsHandler);
        }
        if (f() && (aVar = this.L) != null) {
            za5 za5Var = aVar.h;
            if (za5Var.d == 0 && aVar.i) {
                aVar.a.a();
                aVar.i = false;
            }
            if (za5Var.d != 0) {
                aVar.i = true;
            }
        }
        loop0: while (true) {
            mb5Var = this.U0;
            if (!mb5Var.e() || mb5Var.b(0) == null) {
                return;
            }
            int i2 = mb5Var.b;
            i = 0;
            while (i < i2) {
                bp2 bp2Var = (bp2) mb5Var.b(i);
                if (i < 0 || i >= mb5Var.b) {
                    break loop0;
                }
                Object[] objArr = mb5Var.a;
                Object obj = objArr[i];
                objArr[i] = null;
                if (bp2Var != null) {
                    bp2Var.invoke();
                }
                i++;
            }
            mb5Var.m(0, i2);
        }
        mb5Var.f(i);
        throw null;
    }

    public final void y(androidx.compose.ui.node.h hVar) {
        c cVar = this.y;
        cVar.y = true;
        if (cVar.v()) {
            cVar.w(hVar);
        }
        androidx.compose.ui.contentcapture.b bVar = this.z;
        bVar.g = true;
        if (bVar.e()) {
            bVar.h.o(tx8.a);
        }
    }

    public final void z(androidx.compose.ui.node.h hVar, boolean z, boolean z2, boolean z3) {
        androidx.compose.ui.node.h hVarF;
        androidx.compose.ui.node.h hVarF2;
        al4 al4Var = this.U;
        if (!z) {
            if (al4Var.p(hVar, z2) && z3) {
                F(hVar);
                return;
            }
            return;
        }
        wv8 wv8Var = al4Var.b;
        if (hVar.j == null) {
            rn3.b("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
        }
        int iOrdinal = hVar.v().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return;
            }
            if (iOrdinal != 2 && iOrdinal != 3) {
                if (iOrdinal != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                if (!hVar.x() || z2) {
                    hVar.d0();
                    hVar.e0();
                    if (hVar.R) {
                        return;
                    }
                    if ((js3.i(hVar.X(), Boolean.TRUE) || al4.h(hVar)) && ((hVarF = hVar.F()) == null || !hVarF.x())) {
                        wv8Var.g(hVar, Invalidation.a);
                    } else if ((hVar.V() || al4.i(hVar)) && ((hVarF2 = hVar.F()) == null || !hVarF2.A())) {
                        wv8Var.g(hVar, Invalidation.c);
                    }
                    if (al4Var.d || !z3) {
                        return;
                    }
                    F(hVar);
                    return;
                }
                return;
            }
        }
        al4Var.h.b(new zk4(hVar, true, z2));
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        js3.m(view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addViewInLayout(view, i, layoutParams, true);
    }

    @Override // androidx.compose.ui.node.Owner
    public qe getAccessibilityManager() {
        return this.A;
    }

    @Override // androidx.compose.ui.node.Owner
    public ye getClipboard() {
        return this.O;
    }

    @Override // androidx.compose.ui.node.Owner
    public ze getClipboardManager() {
        return this.N;
    }

    @Override // androidx.compose.ui.node.Owner
    public androidx.compose.ui.draganddrop.a getDragAndDropManager() {
        return this.o;
    }

    public ya5 getLayoutNodes() {
        return this.u;
    }

    @Override // androidx.compose.ui.node.Owner
    public AndroidComposeView getOutOfFrameExecutor() {
        if (isAttachedToWindow()) {
            return this;
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        layoutParamsGenerateDefaultLayoutParams.width = i;
        layoutParamsGenerateDefaultLayoutParams.height = i2;
        addViewInLayout(view, -1, layoutParamsGenerateDefaultLayoutParams, true);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, i, layoutParams, true);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, -1, layoutParams, true);
    }

    public final void setUncaughtExceptionHandler$ui(z97 z97Var) {
    }
}
