package androidx.compose.ui.window;

import android.R;
import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.bp2;
import defpackage.do1;
import defpackage.dp2;
import defpackage.j27;
import defpackage.j97;
import defpackage.js3;
import defpackage.jt6;
import defpackage.jy0;
import defpackage.o27;
import defpackage.qj1;
import defpackage.tx8;
import defpackage.ur6;
import defpackage.vl;
import defpackage.wl;
import defpackage.yh0;
import defpackage.z27;
import defpackage.zn1;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class h extends jy0 {
    public bp2 e;
    public zn1 f;
    public final View g;
    public final g h;
    public boolean i;

    public h(bp2 bp2Var, zn1 zn1Var, View view, LayoutDirection layoutDirection, qj1 qj1Var, UUID uuid) {
        super(new ContextThemeWrapper(view.getContext(), zn1Var.e ? jt6.DialogWindowTheme : jt6.FloatingDialogWindowTheme), 0);
        this.e = bp2Var;
        this.f = zn1Var;
        this.g = view;
        float f = 8;
        Window window = getWindow();
        if (window == null) {
            throw new IllegalStateException("Dialog has no window");
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(R.color.transparent);
        j97.d(window, this.f.e);
        window.setGravity(17);
        if (!this.f.e) {
            window.addFlags(65792);
            WindowManager.LayoutParams attributes = window.getAttributes();
            int i = Build.VERSION.SDK_INT;
            if (i >= 28) {
                vl.a.a(attributes);
            }
            if (i >= 30) {
                wl wlVar = wl.a;
                wlVar.b(attributes, 0);
                wlVar.c(attributes, 0);
            }
            window.setAttributes(attributes);
        }
        g gVar = new g(getContext(), window);
        setTitle(this.f.f);
        gVar.setTag(ur6.compose_view_saveable_id_tag, "Dialog:" + uuid);
        gVar.setClipChildren(false);
        gVar.setElevation(qj1Var.S(f));
        gVar.setOutlineProvider(new do1(0));
        this.h = gVar;
        View decorView = window.getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            e(viewGroup);
        }
        setContentView(gVar);
        j27.k(gVar, j27.d(view));
        z27.l(gVar, z27.g(view));
        o27.i(gVar, o27.e(view));
        f(this.e, this.f, layoutDirection);
        yh0.k(c(), this, new dp2() { // from class: androidx.compose.ui.window.DialogWrapper$2
            {
                super(1);
            }

            @Override // defpackage.dp2
            public final Object invoke(Object obj) {
                h hVar = this.g;
                if (hVar.f.a) {
                    hVar.e.invoke();
                }
                return tx8.a;
            }
        });
    }

    public static final void e(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof g) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            if (viewGroup2 != null) {
                e(viewGroup2);
            }
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }

    public final void f(bp2 bp2Var, zn1 zn1Var, LayoutDirection layoutDirection) {
        int i;
        this.e = bp2Var;
        this.f = zn1Var;
        SecureFlagPolicy secureFlagPolicy = zn1Var.c;
        boolean zB = d.b(this.g);
        int iOrdinal = secureFlagPolicy.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                zB = true;
            } else {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                zB = false;
            }
        }
        Window window = getWindow();
        js3.m(window);
        window.setFlags(zB ? 8192 : -8193, 8192);
        int iOrdinal2 = layoutDirection.ordinal();
        if (iOrdinal2 == 0) {
            i = 0;
        } else {
            if (iOrdinal2 != 1) {
                throw new NoWhenBranchMatchedException();
            }
            i = 1;
        }
        g gVar = this.h;
        gVar.setLayoutDirection(i);
        boolean z = zn1Var.e;
        boolean z2 = zn1Var.d;
        Window window2 = gVar.i;
        boolean z3 = (gVar.m && z2 == gVar.k && z == gVar.l) ? false : true;
        gVar.k = z2;
        gVar.l = z;
        if (z3) {
            WindowManager.LayoutParams attributes = window2.getAttributes();
            int i2 = z2 ? -2 : -1;
            if (i2 != attributes.width || !gVar.m) {
                window2.setLayout(i2, -2);
                gVar.m = true;
            }
        }
        setCanceledOnTouchOutside(zn1Var.b);
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setSoftInputMode(z ? 0 : Build.VERSION.SDK_INT < 31 ? 16 : 48);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (!this.f.a || !keyEvent.isTracking() || keyEvent.isCanceled() || i != 111) {
            return super.onKeyUp(i, keyEvent);
        }
        this.e.invoke();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x008b  */
    @Override // android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            boolean r0 = super.onTouchEvent(r10)
            zn1 r1 = r9.f
            boolean r1 = r1.b
            r2 = 3
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L8b
            androidx.compose.ui.window.g r1 = r9.h
            r1.getClass()
            float r5 = r10.getX()
            boolean r6 = java.lang.Float.isInfinite(r5)
            if (r6 != 0) goto L6e
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 != 0) goto L6e
            float r5 = r10.getY()
            boolean r6 = java.lang.Float.isInfinite(r5)
            if (r6 != 0) goto L6e
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 != 0) goto L6e
            android.view.View r5 = r1.getChildAt(r3)
            if (r5 != 0) goto L39
            goto L6e
        L39:
            int r6 = r1.getLeft()
            int r7 = r5.getLeft()
            int r7 = r7 + r6
            int r6 = r5.getWidth()
            int r6 = r6 + r7
            int r1 = r1.getTop()
            int r8 = r5.getTop()
            int r8 = r8 + r1
            int r1 = r5.getHeight()
            int r1 = r1 + r8
            float r5 = r10.getX()
            int r5 = defpackage.ok4.V(r5)
            if (r7 > r5) goto L6e
            if (r5 > r6) goto L6e
            float r5 = r10.getY()
            int r5 = defpackage.ok4.V(r5)
            if (r8 > r5) goto L6e
            if (r5 > r1) goto L6e
            goto L8b
        L6e:
            int r10 = r10.getActionMasked()
            if (r10 == 0) goto L88
            if (r10 == r4) goto L7c
            if (r10 == r2) goto L79
            goto L95
        L79:
            r9.i = r3
            return r0
        L7c:
            boolean r10 = r9.i
            if (r10 == 0) goto L95
            bp2 r10 = r9.e
            r10.invoke()
            r9.i = r3
            return r4
        L88:
            r9.i = r4
            return r4
        L8b:
            int r10 = r10.getActionMasked()
            if (r10 == 0) goto L96
            if (r10 == r4) goto L96
            if (r10 == r2) goto L96
        L95:
            return r0
        L96:
            r9.i = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.h.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
