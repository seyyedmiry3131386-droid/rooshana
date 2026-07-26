package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.GestureDetector;
import android.view.View;
import androidx.compose.ui.platform.n;
import com.google.android.gms.common.Feature;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class cf0 implements dq2 {
    public final /* synthetic */ int a;
    public int b;
    public boolean c;
    public Object d;
    public Object e;

    public /* synthetic */ cf0() {
        this.a = 4;
    }

    public static cf0 b() {
        cf0 cf0Var = new cf0();
        cf0Var.c = true;
        cf0Var.b = 0;
        return cf0Var;
    }

    public cf0 a() {
        rq4.h("execute parameter required", ((q37) this.d) != null);
        return new cf0(this, (Feature[]) this.e, this.c, this.b);
    }

    public void c(int i) {
        switch (this.a) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.e;
                WeakReference weakReference = bottomSheetBehavior.W;
                if (weakReference != null && weakReference.get() != null) {
                    this.b = i;
                    if (!this.c) {
                        ((View) bottomSheetBehavior.W.get()).postOnAnimation((q6) this.d);
                        this.c = true;
                    }
                    break;
                }
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.e;
                WeakReference weakReference2 = sideSheetBehavior.p;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.b = i;
                    if (!this.c) {
                        ((View) sideSheetBehavior.p.get()).postOnAnimation((u03) this.d);
                        this.c = true;
                    }
                    break;
                }
                break;
        }
    }

    @Override // defpackage.dq2
    public void onFailure(Throwable th) {
        if (this.c) {
            return;
        }
        wn5.k0("NotificationProvider", "Failed to load bitmap: " + th.getMessage());
    }

    @Override // defpackage.dq2
    public void onSuccess(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        fp5 fp5Var = (fp5) this.d;
        if (this.c) {
            return;
        }
        fp5Var.e(bitmap);
        y52 y52Var = (y52) this.e;
        dc0 dc0Var = new dc0(this.b, fp5Var.b());
        xp4 xp4Var = (xp4) y52Var.b;
        xp4Var.e.execute(new up4(y52Var.a, 0, xp4Var, (jq4) y52Var.c, dc0Var));
    }

    public cf0(cf0 cf0Var, Feature[] featureArr, boolean z, int i) {
        this.a = 6;
        this.e = cf0Var;
        this.d = featureArr;
        boolean z2 = false;
        if (featureArr != null && z) {
            z2 = true;
        }
        this.c = z2;
        this.b = i;
    }

    public cf0(jx9 jx9Var, x41 x41Var, int i) {
        this.a = 5;
        this.e = jx9Var;
        this.d = x41Var;
        this.c = true;
        this.b = i;
    }

    public cf0(int i, fp5 fp5Var, y52 y52Var) {
        this.a = 1;
        this.b = i;
        this.d = fp5Var;
        this.e = y52Var;
    }

    public cf0(SideSheetBehavior sideSheetBehavior) {
        this.a = 3;
        this.e = sideSheetBehavior;
        this.d = new u03(27, this);
    }

    public cf0(BottomSheetBehavior bottomSheetBehavior) {
        this.a = 0;
        this.e = bottomSheetBehavior;
        this.d = new q6(3, this);
    }

    public cf0(Context context, dp2 dp2Var) {
        this.a = 2;
        this.d = dp2Var;
        this.b = 0;
        this.e = new GestureDetector(context, new n(this));
    }
}
