package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.bottomsheet.BottomSheetDragHandleView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.datepicker.MaterialCalendar;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;

/* JADX INFO: loaded from: classes.dex */
public final class n90 extends h3 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ n90(int i, Object obj) {
        this.d = i;
        this.e = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    @Override // defpackage.h3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c(android.view.View r3, android.view.accessibility.AccessibilityEvent r4) {
        /*
            r2 = this;
            int r0 = r2.d
            switch(r0) {
                case 3: goto L4f;
                case 7: goto L9;
                default: goto L5;
            }
        L5:
            super.c(r3, r4)
            return
        L9:
            java.lang.Object r0 = r2.e
            androidx.viewpager.widget.ViewPager r0 = (androidx.viewpager.widget.ViewPager) r0
            super.c(r3, r4)
            java.lang.Class<androidx.viewpager.widget.ViewPager> r3 = androidx.viewpager.widget.ViewPager.class
            java.lang.String r3 = r3.getName()
            r4.setClassName(r3)
            kz5 r3 = r0.e
            if (r3 == 0) goto L29
            dg7 r3 = (defpackage.dg7) r3
            java.util.ArrayList r3 = r3.h
            int r3 = r3.size()
            r1 = 1
            if (r3 <= r1) goto L29
            goto L2a
        L29:
            r1 = 0
        L2a:
            r4.setScrollable(r1)
            int r3 = r4.getEventType()
            r1 = 4096(0x1000, float:5.74E-42)
            if (r3 != r1) goto L4e
            kz5 r3 = r0.e
            if (r3 == 0) goto L4e
            dg7 r3 = (defpackage.dg7) r3
            java.util.ArrayList r3 = r3.h
            int r3 = r3.size()
            r4.setItemCount(r3)
            int r3 = r0.f
            r4.setFromIndex(r3)
            int r3 = r0.f
            r4.setToIndex(r3)
        L4e:
            return
        L4f:
            super.c(r3, r4)
            java.lang.Object r3 = r2.e
            com.google.android.material.internal.CheckableImageButton r3 = (com.google.android.material.internal.CheckableImageButton) r3
            boolean r3 = r3.d
            r4.setChecked(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n90.c(android.view.View, android.view.accessibility.AccessibilityEvent):void");
    }

    @Override // defpackage.h3
    public void d(View view, t3 t3Var) {
        int i;
        int i2 = this.d;
        z = false;
        boolean z = false;
        Object obj = this.e;
        View.AccessibilityDelegate accessibilityDelegate = this.a;
        switch (i2) {
            case 0:
                AccessibilityNodeInfo accessibilityNodeInfo = t3Var.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                t3Var.a(1048576);
                accessibilityNodeInfo.setDismissable(true);
                break;
            case 1:
                AccessibilityNodeInfo accessibilityNodeInfo2 = t3Var.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                if (((if0) obj).k) {
                    t3Var.a(1048576);
                    accessibilityNodeInfo2.setDismissable(true);
                } else {
                    accessibilityNodeInfo2.setDismissable(false);
                }
                break;
            case 2:
            default:
                super.d(view, t3Var);
                break;
            case 3:
                AccessibilityNodeInfo accessibilityNodeInfo3 = t3Var.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo3);
                CheckableImageButton checkableImageButton = (CheckableImageButton) obj;
                accessibilityNodeInfo3.setCheckable(checkableImageButton.e);
                accessibilityNodeInfo3.setChecked(checkableImageButton.d);
                break;
            case 4:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, t3Var.a);
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj;
                int i3 = MaterialButtonToggleGroup.r;
                if (view instanceof MaterialButton) {
                    int i4 = 0;
                    for (int i5 = 0; i5 < materialButtonToggleGroup.getChildCount(); i5++) {
                        if (materialButtonToggleGroup.getChildAt(i5) == view) {
                            i = i4;
                        } else {
                            if ((materialButtonToggleGroup.getChildAt(i5) instanceof MaterialButton) && materialButtonToggleGroup.getChildAt(i5).getVisibility() != 8) {
                                i4++;
                            }
                        }
                    }
                    i = -1;
                } else {
                    i = -1;
                }
                t3Var.o(s3.a(0, 1, i, 1, false, ((MaterialButton) view).o));
                break;
            case 5:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, t3Var.a);
                MaterialCalendar materialCalendar = (MaterialCalendar) obj;
                t3Var.b(new o3(16, materialCalendar.N0.getVisibility() == 0 ? materialCalendar.L(ft6.mtrl_picker_toggle_to_year_selection) : materialCalendar.L(ft6.mtrl_picker_toggle_to_day_selection)));
                break;
            case 6:
                AccessibilityNodeInfo accessibilityNodeInfo4 = t3Var.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo4);
                accessibilityNodeInfo4.setCheckable(((NavigationMenuItemView) obj).x);
                break;
            case 7:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, t3Var.a);
                t3Var.m(ViewPager.class.getName());
                ViewPager viewPager = (ViewPager) obj;
                kz5 kz5Var = viewPager.e;
                if (kz5Var != null && ((dg7) kz5Var).h.size() > 1) {
                    z = true;
                }
                t3Var.w(z);
                if (viewPager.canScrollHorizontally(1)) {
                    t3Var.a(4096);
                }
                if (viewPager.canScrollHorizontally(-1)) {
                    t3Var.a(8192);
                }
                break;
        }
    }

    @Override // defpackage.h3
    public void e(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.d) {
            case 2:
                super.e(view, accessibilityEvent);
                if (accessibilityEvent.getEventType() == 1) {
                    BottomSheetDragHandleView bottomSheetDragHandleView = (BottomSheetDragHandleView) this.e;
                    int i = BottomSheetDragHandleView.m;
                    bottomSheetDragHandleView.c();
                }
                break;
            default:
                super.e(view, accessibilityEvent);
                break;
        }
    }

    @Override // defpackage.h3
    public boolean g(View view, int i, Bundle bundle) {
        switch (this.d) {
            case 0:
                if (i != 1048576) {
                    return super.g(view, i, bundle);
                }
                ((xz7) ((r90) this.e)).a(3);
                return true;
            case 1:
                if (i == 1048576) {
                    if0 if0Var = (if0) this.e;
                    if (if0Var.k) {
                        if0Var.cancel();
                        return true;
                    }
                }
                return super.g(view, i, bundle);
            case 7:
                ViewPager viewPager = (ViewPager) this.e;
                if (super.g(view, i, bundle)) {
                    return true;
                }
                if (i != 4096) {
                    if (i == 8192 && viewPager.canScrollHorizontally(-1)) {
                        viewPager.setCurrentItem(viewPager.f - 1);
                        return true;
                    }
                } else if (viewPager.canScrollHorizontally(1)) {
                    viewPager.setCurrentItem(viewPager.f + 1);
                    return true;
                }
                return false;
            default:
                return super.g(view, i, bundle);
        }
    }
}
