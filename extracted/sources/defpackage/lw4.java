package defpackage;

import android.R;
import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.compose.animation.core.a;
import androidx.compose.material3.f;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.SecureFlagPolicy;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class lw4 extends jy0 {
    public bp2 e;
    public uw4 f;
    public long g;
    public final View h;
    public final kw4 i;

    public lw4(bp2 bp2Var, uw4 uw4Var, long j, View view, LayoutDirection layoutDirection, qj1 qj1Var, UUID uuid, a aVar, e71 e71Var) {
        super(new ContextThemeWrapper(view.getContext(), it6.EdgeToEdgeFloatingDialogWindowTheme), 0);
        this.e = bp2Var;
        this.f = uw4Var;
        this.g = j;
        this.h = view;
        float f = 8;
        Window window = getWindow();
        if (window == null) {
            throw new IllegalStateException("Dialog has no window");
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(R.color.transparent);
        j97.d(window, false);
        kw4 kw4Var = new kw4(getContext());
        kw4Var.setTag(ur6.compose_view_saveable_id_tag, "Dialog:" + uuid);
        kw4Var.setClipChildren(false);
        kw4Var.setElevation(qj1Var.S(f));
        kw4Var.setOutlineProvider(new do1(1));
        this.i = kw4Var;
        setContentView(kw4Var);
        j27.k(kw4Var, j27.d(view));
        z27.l(kw4Var, z27.g(view));
        o27.i(kw4Var, o27.e(view));
        e(this.e, this.f, this.g, layoutDirection);
        hl5 hl5Var = new hl5(window.getDecorView());
        int i = Build.VERSION.SDK_INT;
        sa7 pf9Var = i >= 35 ? new pf9(window, hl5Var) : i >= 30 ? new of9(window, hl5Var) : i >= 26 ? new nf9(window, hl5Var) : new mf9(window, hl5Var);
        Boolean bool = this.f.d;
        pf9Var.m(bool != null ? bool.booleanValue() : vy2.J(this.g));
        Boolean bool2 = this.f.e;
        pf9Var.l(bool2 != null ? bool2.booleanValue() : vy2.J(this.g));
        c().a(this, new f(this.f.b, e71Var, aVar, new hk3(10, this)));
    }

    public final void e(bp2 bp2Var, uw4 uw4Var, long j, LayoutDirection layoutDirection) {
        this.e = bp2Var;
        this.f = uw4Var;
        this.g = j;
        SecureFlagPolicy secureFlagPolicy = uw4Var.a;
        ViewGroup.LayoutParams layoutParams = this.h.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        int i = 1;
        boolean z = (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
        int iOrdinal = secureFlagPolicy.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                z = true;
            } else {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                z = false;
            }
        }
        Window window = getWindow();
        js3.m(window);
        window.setFlags(z ? 8192 : -8193, 8192);
        int iOrdinal2 = layoutDirection.ordinal();
        if (iOrdinal2 == 0) {
            i = 0;
        } else if (iOrdinal2 != 1) {
            throw new NoWhenBranchMatchedException();
        }
        this.i.setLayoutDirection(i);
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setLayout(-1, -1);
        }
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setSoftInputMode(Build.VERSION.SDK_INT >= 30 ? 48 : 16);
        }
    }

    @Override // android.app.Dialog
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (zOnTouchEvent) {
            this.e.invoke();
        }
        return zOnTouchEvent;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }
}
