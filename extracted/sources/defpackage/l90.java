package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.ValueAnimator;
import android.os.Handler;
import android.os.Message;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.c;
import com.google.android.material.snackbar.BaseTransientBottomBar$Behavior;
import com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class l90 implements Handler.Callback {
    public final /* synthetic */ int a;

    public /* synthetic */ l90(int i) {
        this.a = i;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        int i = 1;
        int height = 0;
        switch (this.a) {
            case 0:
                int i2 = message.what;
                if (i2 != 0) {
                    if (i2 != 1) {
                        return false;
                    }
                    r90 r90Var = (r90) message.obj;
                    int i3 = message.arg1;
                    BaseTransientBottomBar$SnackbarBaseLayout baseTransientBottomBar$SnackbarBaseLayout = r90Var.i;
                    AccessibilityManager accessibilityManager = r90Var.w;
                    if ((accessibilityManager != null && ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) == null || !enabledAccessibilityServiceList.isEmpty())) || baseTransientBottomBar$SnackbarBaseLayout.getVisibility() != 0) {
                        r90Var.d(i3);
                        return true;
                    }
                    if (baseTransientBottomBar$SnackbarBaseLayout.getAnimationMode() == 1) {
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                        valueAnimatorOfFloat.setInterpolator(r90Var.d);
                        valueAnimatorOfFloat.addUpdateListener(new j90(r90Var, height));
                        valueAnimatorOfFloat.setDuration(r90Var.b);
                        valueAnimatorOfFloat.addListener(new i90(r90Var, i3, height));
                        valueAnimatorOfFloat.start();
                        return true;
                    }
                    ValueAnimator valueAnimator = new ValueAnimator();
                    BaseTransientBottomBar$SnackbarBaseLayout baseTransientBottomBar$SnackbarBaseLayout2 = r90Var.i;
                    int height2 = baseTransientBottomBar$SnackbarBaseLayout2.getHeight();
                    ViewGroup.LayoutParams layoutParams = baseTransientBottomBar$SnackbarBaseLayout2.getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        height2 += ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                    }
                    valueAnimator.setIntValues(0, height2);
                    valueAnimator.setInterpolator(r90Var.e);
                    valueAnimator.setDuration(r90Var.c);
                    valueAnimator.addListener(new i90(r90Var, i3, i));
                    valueAnimator.addUpdateListener(new j90(r90Var, 3));
                    valueAnimator.start();
                    return true;
                }
                r90 r90Var2 = (r90) message.obj;
                BaseTransientBottomBar$SnackbarBaseLayout baseTransientBottomBar$SnackbarBaseLayout3 = r90Var2.i;
                ViewGroup viewGroup = r90Var2.g;
                if (baseTransientBottomBar$SnackbarBaseLayout3.getParent() == null) {
                    ViewGroup.LayoutParams layoutParams2 = baseTransientBottomBar$SnackbarBaseLayout3.getLayoutParams();
                    if (layoutParams2 instanceof c) {
                        c cVar = (c) layoutParams2;
                        BaseTransientBottomBar$Behavior baseTransientBottomBar$Behavior = new BaseTransientBottomBar$Behavior();
                        qm5 qm5Var = baseTransientBottomBar$Behavior.i;
                        qm5Var.getClass();
                        qm5Var.b = r90Var2.x;
                        baseTransientBottomBar$Behavior.b = new nm5(8, r90Var2);
                        cVar.b(baseTransientBottomBar$Behavior);
                        if (r90Var2.b() == null) {
                            cVar.g = 80;
                        }
                    }
                    baseTransientBottomBar$SnackbarBaseLayout3.k = true;
                    viewGroup.addView(baseTransientBottomBar$SnackbarBaseLayout3);
                    baseTransientBottomBar$SnackbarBaseLayout3.k = false;
                    if (r90Var2.b() != null) {
                        int[] iArr = new int[2];
                        r90Var2.b().getLocationOnScreen(iArr);
                        int i4 = iArr[1];
                        int[] iArr2 = new int[2];
                        viewGroup.getLocationOnScreen(iArr2);
                        height = (viewGroup.getHeight() + iArr2[1]) - i4;
                    }
                    r90Var2.r = height;
                    r90Var2.g();
                    baseTransientBottomBar$SnackbarBaseLayout3.setVisibility(4);
                }
                if (baseTransientBottomBar$SnackbarBaseLayout3.isLaidOut()) {
                    r90Var2.f();
                    return true;
                }
                r90Var2.u = true;
                return true;
            default:
                if (message.what != 1) {
                    return false;
                }
                ((g67) message.obj).a();
                return true;
        }
    }
}
