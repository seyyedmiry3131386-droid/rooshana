package defpackage;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Looper;
import android.widget.ImageView;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class pv1 implements ir8, ax2, dv {
    public final /* synthetic */ int a;
    public boolean b;

    public /* synthetic */ pv1(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    @Override // defpackage.ir8
    public boolean a(Object obj, aj3 aj3Var) {
        Drawable drawable = (Drawable) obj;
        ImageView imageView = aj3Var.a;
        Drawable drawable2 = imageView.getDrawable();
        if (drawable2 == null) {
            drawable2 = new ColorDrawable(0);
        }
        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{drawable2, drawable});
        transitionDrawable.setCrossFadeEnabled(this.b);
        transitionDrawable.startTransition(300);
        imageView.setImageDrawable(transitionDrawable);
        return true;
    }

    @Override // defpackage.ax2
    public boolean b(dy7 dy7Var) {
        return this.b;
    }

    public void c(boolean z) {
        switch (this.a) {
            case 6:
                if (this.b != z) {
                    this.b = z;
                    break;
                }
                break;
            default:
                if (this.b != z) {
                    this.b = z;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.dv, defpackage.hv
    public float e() {
        return 0;
    }

    @Override // defpackage.dv
    public void k(qj1 qj1Var, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
        js3.p(qj1Var, "<this>");
        js3.p(layoutDirection, "layoutDirection");
        int i2 = i / 2;
        int i3 = (int) (i * (this.b ? 0.27f : 0.16f));
        int i4 = i2 - i3;
        if (iArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        iArr2[0] = i4 - (iArr[0] / 2);
        int length = iArr2.length - 1;
        int i5 = i2 + i3;
        if (iArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        iArr2[length] = i5 - (iArr[iArr.length - 1] / 2);
        if (iArr2.length - 1 > 1) {
            iArr2[1] = (i - iArr[1]) / 2;
        }
    }

    @Override // defpackage.ax2
    public boolean n() {
        return this.b;
    }

    public pv1(Context context, Looper looper, td8 td8Var, int i) {
        this.a = i;
        switch (i) {
            case 7:
                context.getApplicationContext();
                td8Var.a(looper, null);
                break;
            default:
                new js8(context.getApplicationContext());
                td8Var.a(looper, null);
                break;
        }
    }
}
