package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.appcompat.widget.ActivityChooserView;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.b;
import androidx.appcompat.widget.e;
import com.google.android.material.internal.NavigationMenuView;
import com.google.android.material.navigation.NavigationView;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class v6 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v6(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        b bVar;
        fu4 fu4Var;
        Activity activity2;
        switch (this.a) {
            case 0:
                ActivityChooserView activityChooserView = (ActivityChooserView) this.b;
                if (activityChooserView.b()) {
                    if (!activityChooserView.isShown()) {
                        activityChooserView.getListPopupWindow().dismiss();
                        break;
                    } else {
                        activityChooserView.getListPopupWindow().a();
                        l6 l6Var = activityChooserView.g;
                        if (l6Var != null && (bVar = l6Var.a) != null && (fu4Var = bVar.e) != null) {
                            fu4Var.l(bVar.c);
                            break;
                        }
                    }
                }
                break;
            case 1:
                AppCompatSpinner appCompatSpinner = (AppCompatSpinner) this.b;
                if (!appCompatSpinner.getInternalPopup().b()) {
                    appCompatSpinner.f.n(appCompatSpinner.getTextDirection(), appCompatSpinner.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = appCompatSpinner.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                }
                break;
            case 2:
                ao aoVar = (ao) this.b;
                AppCompatSpinner appCompatSpinner2 = aoVar.H;
                aoVar.getClass();
                if (appCompatSpinner2.isAttachedToWindow() && appCompatSpinner2.getGlobalVisibleRect(aoVar.F)) {
                    aoVar.s();
                    aoVar.a();
                } else {
                    aoVar.dismiss();
                }
                break;
            case 3:
                on0 on0Var = (on0) this.b;
                ArrayList arrayList = on0Var.h;
                if (on0Var.b() && arrayList.size() > 0 && !((nn0) arrayList.get(0)).a.y) {
                    View view = on0Var.o;
                    if (view != null && view.isShown()) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((nn0) it.next()).a.a();
                        }
                    } else {
                        on0Var.dismiss();
                    }
                    break;
                }
                break;
            case 4:
                NavigationView navigationView = (NavigationView) this.b;
                int[] iArr = navigationView.k;
                navigationView.getLocationOnScreen(iArr);
                boolean z = true;
                boolean z2 = iArr[1] == 0;
                bl5 bl5Var = navigationView.i;
                if (bl5Var.x != z2) {
                    bl5Var.x = z2;
                    int i = (bl5Var.b.getChildCount() <= 0 && bl5Var.x) ? bl5Var.z : 0;
                    NavigationMenuView navigationMenuView = bl5Var.a;
                    navigationMenuView.setPadding(0, i, 0, navigationMenuView.getPaddingBottom());
                }
                navigationView.setDrawTopInsetForeground(z2 && navigationView.n);
                boolean z3 = navigationView.getLayoutDirection() == 1;
                int i2 = iArr[0];
                navigationView.setDrawLeftInsetForeground((i2 == 0 || navigationView.getWidth() + i2 == 0) && (!z3 ? !navigationView.p : !navigationView.q));
                Context context = navigationView.getContext();
                while (true) {
                    if (!(context instanceof ContextWrapper)) {
                        activity2 = null;
                    } else if (context instanceof Activity) {
                        activity2 = (Activity) context;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                }
                if (activity2 != null) {
                    Rect rectK = ib7.k(activity2);
                    navigationView.setDrawBottomInsetForeground((rectK.height() - navigationView.getHeight() == iArr[1]) && (Color.alpha(activity2.getWindow().getNavigationBarColor()) != 0) && navigationView.o);
                    if ((rectK.width() != iArr[0] && rectK.width() - navigationView.getWidth() != iArr[0]) || (!z3 ? !navigationView.q : !navigationView.p)) {
                        z = false;
                    }
                    navigationView.setDrawRightInsetForeground(z);
                }
                break;
            default:
                l48 l48Var = (l48) this.b;
                e eVar = l48Var.h;
                if (l48Var.b() && !eVar.y) {
                    View view2 = l48Var.m;
                    if (view2 != null && view2.isShown()) {
                        eVar.a();
                    } else {
                        l48Var.dismiss();
                    }
                    break;
                }
                break;
        }
    }
}
