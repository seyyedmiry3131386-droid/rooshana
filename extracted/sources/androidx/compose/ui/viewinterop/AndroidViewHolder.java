package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.node.p;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.s;
import defpackage.ba4;
import defpackage.bp2;
import defpackage.bt2;
import defpackage.c26;
import defpackage.cf;
import defpackage.ct2;
import defpackage.d8;
import defpackage.dp2;
import defpackage.dz0;
import defpackage.e71;
import defpackage.ex4;
import defpackage.fs8;
import defpackage.g51;
import defpackage.g64;
import defpackage.gx4;
import defpackage.h69;
import defpackage.hn7;
import defpackage.hs9;
import defpackage.hv1;
import defpackage.hx4;
import defpackage.hy5;
import defpackage.if9;
import defpackage.is3;
import defpackage.j27;
import defpackage.j97;
import defpackage.js3;
import defpackage.lf9;
import defpackage.mm5;
import defpackage.ms5;
import defpackage.no3;
import defpackage.o27;
import defpackage.ok4;
import defpackage.q69;
import defpackage.qd7;
import defpackage.qj1;
import defpackage.qp2;
import defpackage.rn3;
import defpackage.tb1;
import defpackage.ti;
import defpackage.ti1;
import defpackage.tm0;
import defpackage.tx8;
import defpackage.ue8;
import defpackage.ur6;
import defpackage.uy6;
import defpackage.v04;
import defpackage.ve;
import defpackage.wn5;
import defpackage.wu8;
import defpackage.y40;
import defpackage.yh0;
import defpackage.z4;
import defpackage.zb5;
import defpackage.zq3;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
public class AndroidViewHolder extends ViewGroup implements mm5, dz0, hy5, ms5 {
    public static final dp2 A = new dp2() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$Companion$OnCommitAffectingUpdate$1
        @Override // defpackage.dp2
        public final Object invoke(Object obj) {
            AndroidViewHolder androidViewHolder = (AndroidViewHolder) obj;
            androidViewHolder.getHandler().post(new d8(4, androidViewHolder.r));
            return tx8.a;
        }
    };
    public final androidx.compose.ui.input.nestedscroll.a a;
    public final View b;
    public final Owner c;
    public bp2 d;
    public boolean e;
    public bp2 f;
    public bp2 g;
    public hx4 h;
    public dp2 i;
    public qj1 j;
    public dp2 k;
    public g64 l;
    public qd7 m;
    public final int[] n;
    public long o;
    public lf9 p;
    public dp2 q;
    public final bp2 r;
    public final bp2 s;
    public dp2 t;
    public final int[] u;
    public int v;
    public int w;
    public final ba4 x;
    public boolean y;
    public final androidx.compose.ui.node.h z;

    /* JADX INFO: renamed from: androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedFling$1, reason: invalid class name */
    @tb1(c = "androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedFling$1", f = "AndroidViewHolder.android.kt", l = {633, 635}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public int a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ AndroidViewHolder c;
        public final /* synthetic */ long d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z, AndroidViewHolder androidViewHolder, long j, g51 g51Var) {
            super(2, g51Var);
            this.b = z;
            this.c = androidViewHolder;
            this.d = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return new AnonymousClass1(this.b, this.c, this.d, g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
        
            if (r11 == r0) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
        
            if (r11 == r0) goto L18;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
                int r1 = r10.a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1d
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                kotlin.b.b(r11)
                goto L4d
            L10:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L18:
                kotlin.b.b(r11)
                r6 = r10
                goto L37
            L1d:
                kotlin.b.b(r11)
                boolean r11 = r10.b
                androidx.compose.ui.viewinterop.AndroidViewHolder r1 = r10.c
                if (r11 != 0) goto L3d
                androidx.compose.ui.input.nestedscroll.a r4 = r1.a
                r10.a = r3
                r5 = 0
                long r7 = r10.d
                r9 = r10
                java.lang.Object r11 = r4.a(r5, r7, r9)
                r6 = r9
                if (r11 != r0) goto L37
                goto L4c
            L37:
                e49 r11 = (defpackage.e49) r11
                r11.getClass()
                goto L52
            L3d:
                r6 = r10
                androidx.compose.ui.input.nestedscroll.a r1 = r1.a
                r6.a = r2
                long r2 = r6.d
                r4 = 0
                java.lang.Object r11 = r1.a(r2, r4, r6)
                if (r11 != r0) goto L4d
            L4c:
                return r0
            L4d:
                e49 r11 = (defpackage.e49) r11
                r11.getClass()
            L52:
                tx8 r11 = defpackage.tx8.a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.viewinterop.AndroidViewHolder.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedPreFling$1, reason: invalid class name and case insensitive filesystem */
    @tb1(c = "androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedPreFling$1", f = "AndroidViewHolder.android.kt", l = {644}, m = "invokeSuspend", v = 1)
    final class C00411 extends SuspendLambda implements qp2 {
        public int a;
        public final /* synthetic */ long c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00411(long j, g51 g51Var) {
            super(2, g51Var);
            this.c = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return AndroidViewHolder.this.new C00411(this.c, g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((C00411) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            int i = this.a;
            if (i == 0) {
                kotlin.b.b(obj);
                androidx.compose.ui.input.nestedscroll.a aVar = AndroidViewHolder.this.a;
                this.a = 1;
                if (aVar.b(this.c, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            return tx8.a;
        }
    }

    public AndroidViewHolder(Context context, androidx.compose.runtime.a aVar, int i, androidx.compose.ui.input.nestedscroll.a aVar2, View view, Owner owner) {
        super(context);
        this.a = aVar2;
        this.b = view;
        this.c = owner;
        LinkedHashMap linkedHashMap = s.a;
        setTag(ur6.androidx_compose_ui_view_composition_context, aVar);
        setSaveFromParentEnabled(false);
        addView(view);
        q69.t(this, new ti(this, 0));
        h69.m(this, this);
        this.d = new bp2() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$update$1
            @Override // defpackage.bp2
            public final /* bridge */ /* synthetic */ Object invoke() {
                return tx8.a;
            }
        };
        this.f = new bp2() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$reset$1
            @Override // defpackage.bp2
            public final /* bridge */ /* synthetic */ Object invoke() {
                return tx8.a;
            }
        };
        this.g = new bp2() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$release$1
            @Override // defpackage.bp2
            public final /* bridge */ /* synthetic */ Object invoke() {
                return tx8.a;
            }
        };
        this.h = ex4.b;
        this.j = yh0.c();
        this.n = new int[2];
        this.o = 0L;
        this.r = new AndroidViewHolder$runUpdate$1(this);
        this.s = new bp2() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$runInvalidate$1
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                this.g.getLayoutNode().O();
                return tx8.a;
            }
        };
        this.u = new int[2];
        this.v = Integer.MIN_VALUE;
        this.w = Integer.MIN_VALUE;
        this.x = new ba4();
        final androidx.compose.ui.node.h hVar = new androidx.compose.ui.node.h(3);
        hVar.q = this;
        final hx4 hx4VarD = hs9.N(wn5.A(androidx.compose.ui.input.pointer.d.a(hn7.a(androidx.compose.ui.input.nestedscroll.c.a(ct2.a, aVar2), true, new dp2() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$coreModifier$1
            @Override // defpackage.dp2
            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return tx8.a;
            }
        }), this), new dp2() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$coreModifier$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.dp2
            public final Object invoke(Object obj) {
                tm0 tm0VarV = ((hv1) obj).X().v();
                AndroidViewHolder androidViewHolder = this.g;
                if (androidViewHolder.getView().getVisibility() != 8) {
                    androidViewHolder.y = true;
                    Owner owner2 = hVar.p;
                    AndroidComposeView androidComposeView = owner2 instanceof AndroidComposeView ? (AndroidComposeView) owner2 : null;
                    if (androidComposeView != null) {
                        Canvas canvasA = ve.a(tm0VarV);
                        androidComposeView.getAndroidViewsHandler$ui().getClass();
                        this.draw(canvasA);
                    }
                    androidViewHolder.y = false;
                }
                return tx8.a;
            }
        }), new dp2() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$coreModifier$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.dp2
            public final Object invoke(Object obj) {
                WindowInsets windowInsetsG;
                androidx.compose.ui.node.h hVar2 = hVar;
                AndroidViewHolder androidViewHolder = this.g;
                ct2.f(androidViewHolder, hVar2);
                ((AndroidComposeView) androidViewHolder.c).G = true;
                int[] iArr = androidViewHolder.n;
                int i2 = iArr[0];
                int i3 = iArr[1];
                androidViewHolder.getView().getLocationOnScreen(iArr);
                long j = androidViewHolder.o;
                long jK = ((v04) obj).k();
                androidViewHolder.o = jK;
                lf9 lf9Var = androidViewHolder.p;
                if (lf9Var != null && ((i2 != iArr[0] || i3 != iArr[1] || !zq3.b(j, jK)) && (windowInsetsG = androidViewHolder.l(lf9Var).g()) != null)) {
                    androidViewHolder.getView().dispatchApplyWindowInsets(windowInsetsG);
                }
                return tx8.a;
            }
        }).d(new c(new AndroidViewHolder$layoutNode$1$coreModifier$4(this)));
        hVar.B0(this.h.d(hx4VarD));
        this.i = new dp2() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.dp2
            public final Object invoke(Object obj) {
                hVar.B0(((hx4) obj).d(hx4VarD));
                return tx8.a;
            }
        };
        hVar.x0(this.j);
        this.k = new dp2() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$2
            {
                super(1);
            }

            @Override // defpackage.dp2
            public final Object invoke(Object obj) {
                hVar.x0((qj1) obj);
                return tx8.a;
            }
        };
        hVar.N = new dp2() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.dp2
            public final Object invoke(Object obj) {
                Owner owner2 = (Owner) obj;
                AndroidComposeView androidComposeView = owner2 instanceof AndroidComposeView ? (AndroidComposeView) owner2 : null;
                AndroidViewHolder androidViewHolder = this.g;
                if (androidComposeView != null) {
                    HashMap<AndroidViewHolder, androidx.compose.ui.node.h> holderToLayoutNode = androidComposeView.getAndroidViewsHandler$ui().getHolderToLayoutNode();
                    androidx.compose.ui.node.h hVar2 = hVar;
                    holderToLayoutNode.put(androidViewHolder, hVar2);
                    androidComposeView.getAndroidViewsHandler$ui().addView(androidViewHolder);
                    androidComposeView.getAndroidViewsHandler$ui().getLayoutNodeToHolder().put(hVar2, androidViewHolder);
                    androidViewHolder.setImportantForAccessibility(1);
                    q69.q(androidViewHolder, new cf(androidComposeView, hVar2, androidComposeView));
                }
                if (androidViewHolder.getView().getParent() != androidViewHolder) {
                    androidViewHolder.addView(androidViewHolder.getView());
                }
                return tx8.a;
            }
        };
        hVar.O = new dp2() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$4
            {
                super(1);
            }

            @Override // defpackage.dp2
            public final Object invoke(Object obj) {
                Owner owner2 = (Owner) obj;
                AndroidComposeView androidComposeView = owner2 instanceof AndroidComposeView ? (AndroidComposeView) owner2 : null;
                AndroidViewHolder androidViewHolder = this.g;
                if (androidComposeView != null) {
                    androidComposeView.getAndroidViewsHandler$ui().removeViewInLayout(androidViewHolder);
                    wu8.h(androidComposeView.getAndroidViewsHandler$ui().getLayoutNodeToHolder()).remove(androidComposeView.getAndroidViewsHandler$ui().getHolderToLayoutNode().remove(androidViewHolder));
                    androidViewHolder.setImportantForAccessibility(0);
                }
                androidViewHolder.removeAllViewsInLayout();
                return tx8.a;
            }
        };
        hVar.A0(new a(this, hVar));
        this.z = hVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final p getSnapshotObserver() {
        if (!isAttachedToWindow()) {
            rn3.b("Expected AndroidViewHolder to be attached when observing reads.");
        }
        return this.c.getSnapshotObserver();
    }

    public static final int j(AndroidViewHolder androidViewHolder, int i, int i2, int i3) {
        return (i3 >= 0 || i == i2) ? View.MeasureSpec.makeMeasureSpec(ok4.t(i3, i, i2), 1073741824) : (i3 != -2 || i2 == Integer.MAX_VALUE) ? (i3 != -1 || i2 == Integer.MAX_VALUE) ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(i2, 1073741824) : View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE);
    }

    public static no3 k(no3 no3Var, int i, int i2, int i3, int i4) {
        int i5 = no3Var.a - i;
        if (i5 < 0) {
            i5 = 0;
        }
        int i6 = no3Var.b - i2;
        if (i6 < 0) {
            i6 = 0;
        }
        int i7 = no3Var.c - i3;
        if (i7 < 0) {
            i7 = 0;
        }
        int i8 = no3Var.d - i4;
        return no3.c(i5, i6, i7, i8 >= 0 ? i8 : 0);
    }

    @Override // defpackage.dz0
    public final void a() {
        this.g.invoke();
    }

    @Override // defpackage.dz0
    public final void b() {
        this.f.invoke();
        removeAllViewsInLayout();
    }

    @Override // defpackage.lm5
    public final void c(int i, View view) {
        ba4 ba4Var = this.x;
        if (i == 1) {
            ba4Var.b = 0;
        } else {
            ba4Var.a = 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [zb5] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r18v5 */
    /* JADX WARN: Type inference failed for: r18v6, types: [zb5] */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r18v8 */
    /* JADX WARN: Type inference failed for: r18v9 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29, types: [gx4] */
    /* JADX WARN: Type inference failed for: r1v30, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36, types: [gx4] */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r2v12 */
    @Override // defpackage.mm5
    public final void d(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        char c;
        long j;
        androidx.compose.ui.input.nestedscroll.d dVar;
        fs8 fs8Var;
        z4 z4Var;
        ?? J;
        if (this.b.isNestedScrollingEnabled()) {
            byte b = -1;
            float f = -1;
            char c2 = ' ';
            long j2 = 4294967295L;
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(i * f)) << 32) | (((long) Float.floatToRawIntBits(i2 * f)) & 4294967295L);
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(i4 * f)) & 4294967295L) | (((long) Float.floatToRawIntBits(i3 * f)) << 32);
            int i6 = i5 == 0 ? 1 : 2;
            androidx.compose.ui.input.nestedscroll.d dVar2 = this.a.a;
            if (dVar2 == null || !dVar2.n) {
                c = ' ';
                j = 4294967295L;
                dVar = null;
            } else {
                if (!dVar2.a.n) {
                    rn3.b("visitAncestors called on an unattached node");
                }
                gx4 gx4Var = dVar2.a.e;
                androidx.compose.ui.node.h hVarH = y40.H(dVar2);
                loop0: while (true) {
                    if (hVarH == null) {
                        c = c2;
                        j = j2;
                        fs8Var = null;
                        break;
                    }
                    c = c2;
                    if ((((gx4) hVarH.H.g).d & 262144) != 0) {
                        while (gx4Var != null) {
                            if ((gx4Var.c & 262144) != 0) {
                                ?? r1 = gx4Var;
                                ?? r18 = 0;
                                while (r1 != 0) {
                                    byte b2 = b;
                                    if (r1 instanceof fs8) {
                                        fs8 fs8Var2 = (fs8) r1;
                                        j = j2;
                                        if (js3.i(dVar2.l(), fs8Var2.l()) && androidx.compose.ui.input.nestedscroll.d.class == fs8Var2.getClass()) {
                                            fs8Var = fs8Var2;
                                            break loop0;
                                        }
                                    } else {
                                        j = j2;
                                        if ((r1.c & 262144) != 0 && (r1 instanceof ti1)) {
                                            gx4 gx4Var2 = ((ti1) r1).p;
                                            int i7 = 0;
                                            J = r1;
                                            r18 = r18;
                                            while (gx4Var2 != null) {
                                                if ((gx4Var2.c & 262144) != 0) {
                                                    i7++;
                                                    if (i7 == 1) {
                                                        J = gx4Var2;
                                                    } else {
                                                        ?? zb5Var = r18 == 0 ? new zb5(0, new gx4[16]) : r18;
                                                        if (J != 0) {
                                                            zb5Var.b(J);
                                                            J = 0;
                                                        }
                                                        zb5Var.b(gx4Var2);
                                                        r18 = zb5Var;
                                                    }
                                                }
                                                gx4Var2 = gx4Var2.f;
                                                J = J;
                                                r18 = r18;
                                            }
                                            if (i7 == 1) {
                                            }
                                        }
                                        b = b2;
                                        j2 = j;
                                        r1 = J;
                                        r18 = r18;
                                    }
                                    J = y40.j(r18);
                                    b = b2;
                                    j2 = j;
                                    r1 = J;
                                    r18 = r18;
                                }
                            }
                            gx4Var = gx4Var.e;
                            b = b;
                            j2 = j2;
                        }
                    }
                    byte b3 = b;
                    long j3 = j2;
                    hVarH = hVarH.F();
                    gx4Var = (hVarH == null || (z4Var = hVarH.H) == null) ? null : (ue8) z4Var.f;
                    c2 = c;
                    b = b3;
                    j2 = j3;
                }
                dVar = (androidx.compose.ui.input.nestedscroll.d) fs8Var;
            }
            long jU = dVar != null ? dVar.u(jFloatToRawIntBits, i6, jFloatToRawIntBits2) : 0L;
            iArr[0] = ok4.V(Float.intBitsToFloat((int) (jU >> c))) * (-1);
            iArr[1] = ok4.V(Float.intBitsToFloat((int) (jU & j))) * (-1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15, types: [gx4] */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8, types: [gx4] */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [zb5] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7, types: [zb5] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v4 */
    @Override // defpackage.lm5
    public final void f(View view, int i, int i2, int i3, int i4, int i5) {
        androidx.compose.ui.input.nestedscroll.d dVar;
        fs8 fs8Var;
        z4 z4Var;
        ?? zb5Var;
        ?? J;
        int i6;
        if (this.b.isNestedScrollingEnabled()) {
            float f = -1;
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(i * f)) << 32) | (((long) Float.floatToRawIntBits(i2 * f)) & 4294967295L);
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(i3 * f)) << 32) | (((long) Float.floatToRawIntBits(i4 * f)) & 4294967295L);
            int i7 = i5 == 0 ? 1 : 2;
            androidx.compose.ui.input.nestedscroll.d dVar2 = this.a.a;
            if (dVar2 == null || !dVar2.n) {
                dVar = null;
            } else {
                if (!dVar2.a.n) {
                    rn3.b("visitAncestors called on an unattached node");
                }
                gx4 gx4Var = dVar2.a.e;
                androidx.compose.ui.node.h hVarH = y40.H(dVar2);
                loop0: while (true) {
                    if (hVarH == null) {
                        fs8Var = null;
                        break;
                    }
                    int i8 = 262144;
                    if ((((gx4) hVarH.H.g).d & 262144) != 0) {
                        while (gx4Var != null) {
                            if ((gx4Var.c & i8) != 0) {
                                ?? r11 = gx4Var;
                                ?? r13 = 0;
                                while (r11 != 0) {
                                    if (r11 instanceof fs8) {
                                        fs8 fs8Var2 = (fs8) r11;
                                        if (js3.i(dVar2.l(), fs8Var2.l()) && androidx.compose.ui.input.nestedscroll.d.class == fs8Var2.getClass()) {
                                            fs8Var = fs8Var2;
                                            break loop0;
                                        }
                                    } else {
                                        if ((r11.c & i8) != 0 && (r11 instanceof ti1)) {
                                            gx4 gx4Var2 = ((ti1) r11).p;
                                            int i9 = 0;
                                            J = r11;
                                            zb5Var = r13;
                                            while (gx4Var2 != null) {
                                                int i10 = i8;
                                                if ((gx4Var2.c & i10) != 0) {
                                                    i9++;
                                                    zb5Var = zb5Var;
                                                    if (i9 == 1) {
                                                        J = gx4Var2;
                                                    } else {
                                                        if (zb5Var == 0) {
                                                            zb5Var = new zb5(0, new gx4[16]);
                                                        }
                                                        if (J != 0) {
                                                            zb5Var.b(J);
                                                            J = 0;
                                                        }
                                                        zb5Var.b(gx4Var2);
                                                    }
                                                }
                                                gx4Var2 = gx4Var2.f;
                                                i8 = i10;
                                                J = J;
                                                zb5Var = zb5Var;
                                            }
                                            i6 = i8;
                                            zb5Var = zb5Var;
                                            if (i9 == 1) {
                                            }
                                            i8 = i6;
                                            r11 = J;
                                            r13 = zb5Var;
                                        }
                                        J = y40.j(zb5Var);
                                        i8 = i6;
                                        r11 = J;
                                        r13 = zb5Var;
                                    }
                                    i6 = i8;
                                    zb5Var = r13;
                                    J = y40.j(zb5Var);
                                    i8 = i6;
                                    r11 = J;
                                    r13 = zb5Var;
                                }
                            }
                            gx4Var = gx4Var.e;
                            i8 = i8;
                        }
                    }
                    hVarH = hVarH.F();
                    gx4Var = (hVarH == null || (z4Var = hVarH.H) == null) ? null : (ue8) z4Var.f;
                }
                dVar = (androidx.compose.ui.input.nestedscroll.d) fs8Var;
            }
            if (dVar != null) {
                dVar.u(jFloatToRawIntBits, i7, jFloatToRawIntBits2);
            }
        }
    }

    @Override // defpackage.lm5
    public final boolean g(View view, View view2, int i, int i2) {
        return ((i & 2) == 0 && (i & 1) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        int[] iArr = this.u;
        getLocationInWindow(iArr);
        int i = iArr[0];
        region.op(i, iArr[1], getWidth() + i, getHeight() + iArr[1], Region.Op.DIFFERENCE);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    public final qj1 getDensity() {
        return this.j;
    }

    public final View getInteropView() {
        return this.b;
    }

    public final androidx.compose.ui.node.h getLayoutNode() {
        return this.z;
    }

    @Override // android.view.View
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.b.getLayoutParams();
        return layoutParams == null ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    public final g64 getLifecycleOwner() {
        return this.l;
    }

    public final hx4 getModifier() {
        return this.h;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        ba4 ba4Var = this.x;
        return ba4Var.b | ba4Var.a;
    }

    public final dp2 getOnDensityChanged$ui() {
        return this.k;
    }

    public final dp2 getOnModifierChanged$ui() {
        return this.i;
    }

    public final dp2 getOnRequestDisallowInterceptTouchEvent$ui() {
        return this.t;
    }

    public final bp2 getRelease() {
        return this.g;
    }

    public final bp2 getReset() {
        return this.f;
    }

    public final qd7 getSavedStateRegistryOwner() {
        return this.m;
    }

    public final bp2 getUpdate() {
        return this.d;
    }

    public final View getView() {
        return this.b;
    }

    @Override // defpackage.lm5
    public final void h(View view, View view2, int i, int i2) {
        ba4 ba4Var = this.x;
        if (i2 == 1) {
            ba4Var.b = i;
        } else {
            ba4Var.a = i;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15, types: [gx4] */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8, types: [gx4] */
    /* JADX WARN: Type inference failed for: r14v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v6, types: [zb5] */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r16v9 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14, types: [zb5] */
    /* JADX WARN: Type inference failed for: r7v17 */
    @Override // defpackage.lm5
    public final void i(View view, int i, int i2, int[] iArr, int i3) {
        char c;
        long j;
        z4 z4Var;
        byte b;
        ?? r16;
        ?? J;
        long j2;
        if (this.b.isNestedScrollingEnabled()) {
            byte b2 = -1;
            float f = -1;
            char c2 = ' ';
            long j3 = 4294967295L;
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(i2 * f)) & 4294967295L) | (((long) Float.floatToRawIntBits(i * f)) << 32);
            int i4 = i3 == 0 ? 1 : 2;
            androidx.compose.ui.input.nestedscroll.d dVar = this.a.a;
            androidx.compose.ui.input.nestedscroll.d dVar2 = null;
            fs8 fs8Var = null;
            if (dVar == null || !dVar.n) {
                c = ' ';
                j = 4294967295L;
            } else {
                if (!dVar.a.n) {
                    rn3.b("visitAncestors called on an unattached node");
                }
                gx4 gx4Var = dVar.a.e;
                androidx.compose.ui.node.h hVarH = y40.H(dVar);
                loop0: while (true) {
                    if (hVarH == null) {
                        c = c2;
                        break;
                    }
                    if ((((gx4) hVarH.H.g).d & 262144) != 0) {
                        while (gx4Var != null) {
                            if ((gx4Var.c & 262144) != 0) {
                                ?? r162 = 0;
                                ?? r14 = gx4Var;
                                while (r14 != 0) {
                                    c = c2;
                                    if (r14 instanceof fs8) {
                                        fs8 fs8Var2 = (fs8) r14;
                                        b = b2;
                                        if (js3.i(dVar.l(), fs8Var2.l()) && androidx.compose.ui.input.nestedscroll.d.class == fs8Var2.getClass()) {
                                            fs8Var = fs8Var2;
                                            break loop0;
                                        }
                                    } else {
                                        b = b2;
                                        if ((r14.c & 262144) != 0 && (r14 instanceof ti1)) {
                                            gx4 gx4Var2 = ((ti1) r14).p;
                                            int i5 = 0;
                                            J = r14;
                                            r16 = r162;
                                            while (gx4Var2 != null) {
                                                long j4 = j3;
                                                if ((gx4Var2.c & 262144) != 0) {
                                                    i5++;
                                                    if (i5 == 1) {
                                                        J = gx4Var2;
                                                    } else {
                                                        ?? zb5Var = r16 == 0 ? new zb5(0, new gx4[16]) : r16;
                                                        if (J != 0) {
                                                            zb5Var.b(J);
                                                            J = 0;
                                                        }
                                                        zb5Var.b(gx4Var2);
                                                        r16 = zb5Var;
                                                    }
                                                }
                                                gx4Var2 = gx4Var2.f;
                                                j3 = j4;
                                                J = J;
                                                r16 = r16;
                                            }
                                            j2 = j3;
                                            r16 = r16;
                                            if (i5 == 1) {
                                            }
                                            c2 = c;
                                            b2 = b;
                                            j3 = j2;
                                            r14 = J;
                                            r162 = r16;
                                        }
                                        J = y40.j(r16);
                                        c2 = c;
                                        b2 = b;
                                        j3 = j2;
                                        r14 = J;
                                        r162 = r16;
                                    }
                                    j2 = j3;
                                    r16 = r162;
                                    J = y40.j(r16);
                                    c2 = c;
                                    b2 = b;
                                    j3 = j2;
                                    r14 = J;
                                    r162 = r16;
                                }
                            }
                            gx4Var = gx4Var.e;
                            c2 = c2;
                            b2 = b2;
                            j3 = j3;
                        }
                    }
                    char c3 = c2;
                    byte b3 = b2;
                    long j5 = j3;
                    hVarH = hVarH.F();
                    gx4Var = (hVarH == null || (z4Var = hVarH.H) == null) ? null : (ue8) z4Var.f;
                    c2 = c3;
                    b2 = b3;
                    j3 = j5;
                }
                j = j3;
                dVar2 = (androidx.compose.ui.input.nestedscroll.d) fs8Var;
            }
            long jG = dVar2 != null ? dVar2.G(i4, jFloatToRawIntBits) : 0L;
            iArr[0] = ok4.V(Float.intBitsToFloat((int) (jG >> c))) * (-1);
            iArr[1] = ok4.V(Float.intBitsToFloat((int) (jG & j))) * (-1);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        if (!this.y) {
            this.z.O();
            return null;
        }
        this.b.postOnAnimation(new d8(3, this.s));
        return null;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.b.isNestedScrollingEnabled();
    }

    public final lf9 l(lf9 lf9Var) {
        if9 if9Var = lf9Var.a;
        no3 no3VarG = if9Var.g(-1);
        no3 no3Var = no3.e;
        if (!no3VarG.equals(no3Var) || !if9Var.h(-9).equals(no3Var) || if9Var.f() != null) {
            androidx.compose.ui.node.e eVar = (androidx.compose.ui.node.e) this.z.H.d;
            if (eVar.V.n) {
                long jI = is3.I(eVar.K(0L));
                int i = (int) (jI >> 32);
                if (i < 0) {
                    i = 0;
                }
                int i2 = (int) (jI & 4294967295L);
                if (i2 < 0) {
                    i2 = 0;
                }
                long jK = c26.t(eVar).k();
                int i3 = (int) (jK >> 32);
                int i4 = (int) (jK & 4294967295L);
                long j = eVar.c;
                long jI2 = is3.I(eVar.K((((long) Float.floatToRawIntBits((int) (j >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L)));
                int i5 = i3 - ((int) (jI2 >> 32));
                if (i5 < 0) {
                    i5 = 0;
                }
                int i6 = i4 - ((int) (4294967295L & jI2));
                int i7 = i6 >= 0 ? i6 : 0;
                if (i != 0 || i2 != 0 || i5 != 0 || i7 != 0) {
                    return lf9Var.a.n(i, i2, i5, i7);
                }
            }
        }
        return lf9Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((AndroidViewHolder$runUpdate$1) this.r).invoke();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        if (!this.y) {
            this.z.O();
        } else {
            this.b.postOnAnimation(new d8(3, this.s));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getSnapshotObserver().a.b(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.b.layout(0, 0, i3 - i, i4 - i2);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        View view = this.b;
        if (view.getParent() != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
            return;
        }
        if (view.getVisibility() == 8) {
            setMeasuredDimension(0, 0);
            return;
        }
        view.measure(i, i2);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
        this.v = i;
        this.w = i2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.b.isNestedScrollingEnabled()) {
            return false;
        }
        bt2.G(this.a.c(), null, null, new AnonymousClass1(z, this, j97.a(f * (-1.0f), f2 * (-1.0f)), null), 3);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        if (!this.b.isNestedScrollingEnabled()) {
            return false;
        }
        bt2.G(this.a.c(), null, null, new C00411(j97.a(f * (-1.0f), f2 * (-1.0f)), null), 3);
        return false;
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
    }

    @Override // defpackage.hy5
    public final boolean p() {
        return isAttachedToWindow();
    }

    @Override // defpackage.ms5
    public final lf9 q(View view, lf9 lf9Var) {
        this.p = new lf9(lf9Var);
        return l(lf9Var);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        dp2 dp2Var = this.q;
        if (dp2Var == null) {
            return true;
        }
        dp2Var.invoke(rect != null ? uy6.t(rect) : null);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        dp2 dp2Var = this.t;
        if (dp2Var != null) {
            dp2Var.invoke(Boolean.valueOf(z));
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public final void setDensity(qj1 qj1Var) {
        if (qj1Var != this.j) {
            this.j = qj1Var;
            dp2 dp2Var = this.k;
            if (dp2Var != null) {
                dp2Var.invoke(qj1Var);
            }
        }
    }

    public final void setLifecycleOwner(g64 g64Var) {
        if (g64Var != this.l) {
            this.l = g64Var;
            j27.k(this, g64Var);
        }
    }

    public final void setModifier(hx4 hx4Var) {
        if (hx4Var != this.h) {
            this.h = hx4Var;
            dp2 dp2Var = this.i;
            if (dp2Var != null) {
                dp2Var.invoke(hx4Var);
            }
        }
    }

    public final void setOnDensityChanged$ui(dp2 dp2Var) {
        this.k = dp2Var;
    }

    public final void setOnModifierChanged$ui(dp2 dp2Var) {
        this.i = dp2Var;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui(dp2 dp2Var) {
        this.t = dp2Var;
    }

    public final void setRelease(bp2 bp2Var) {
        this.g = bp2Var;
    }

    public final void setReset(bp2 bp2Var) {
        this.f = bp2Var;
    }

    public final void setSavedStateRegistryOwner(qd7 qd7Var) {
        if (qd7Var != this.m) {
            this.m = qd7Var;
            o27.i(this, qd7Var);
        }
    }

    public final void setUpdate(bp2 bp2Var) {
        this.d = bp2Var;
        this.e = true;
        ((AndroidViewHolder$runUpdate$1) this.r).invoke();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }
}
