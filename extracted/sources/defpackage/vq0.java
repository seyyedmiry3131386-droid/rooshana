package defpackage;

import android.R;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class vq0 extends t62 {
    public final /* synthetic */ Chip q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vq0(Chip chip, Chip chip2) {
        super(chip2);
        this.q = chip;
    }

    @Override // defpackage.t62
    public final int n(float f, float f2) {
        int i = Chip.x;
        Chip chip = this.q;
        return (chip.d() && chip.getCloseIconTouchBounds().contains(f, f2)) ? 1 : 0;
    }

    @Override // defpackage.t62
    public final void o(ArrayList arrayList) {
        xq0 xq0Var;
        arrayList.add(0);
        int i = Chip.x;
        Chip chip = this.q;
        if (!chip.d() || (xq0Var = chip.e) == null || !xq0Var.U || chip.h == null) {
            return;
        }
        arrayList.add(1);
    }

    @Override // defpackage.t62
    public final boolean s(int i, int i2, Bundle bundle) {
        boolean z = false;
        if (i2 == 16) {
            Chip chip = this.q;
            if (i == 0) {
                return chip.performClick();
            }
            if (i == 1) {
                chip.playSoundEffect(0);
                View.OnClickListener onClickListener = chip.h;
                if (onClickListener != null) {
                    onClickListener.onClick(chip);
                    z = true;
                }
                if (chip.t) {
                    chip.s.x(1, 1);
                }
            }
        }
        return z;
    }

    @Override // defpackage.t62
    public final void t(t3 t3Var) {
        AccessibilityNodeInfo accessibilityNodeInfo = t3Var.a;
        Chip chip = this.q;
        xq0 xq0Var = chip.e;
        accessibilityNodeInfo.setCheckable(xq0Var != null && xq0Var.x0);
        accessibilityNodeInfo.setClickable(chip.isClickable());
        t3Var.m(chip.getAccessibilityClassName());
        t3Var.z(chip.getText());
    }

    @Override // defpackage.t62
    public final void u(int i, t3 t3Var) {
        AccessibilityNodeInfo accessibilityNodeInfo = t3Var.a;
        if (i != 1) {
            t3Var.p("");
            accessibilityNodeInfo.setBoundsInParent(Chip.y);
            return;
        }
        Chip chip = this.q;
        CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
        if (closeIconContentDescription != null) {
            t3Var.p(closeIconContentDescription);
        } else {
            CharSequence text = chip.getText();
            t3Var.p(chip.getContext().getString(ft6.mtrl_chip_close_icon_content_description, TextUtils.isEmpty(text) ? "" : text).trim());
        }
        accessibilityNodeInfo.setBoundsInParent(chip.getCloseIconTouchBoundsInt());
        t3Var.b(o3.g);
        accessibilityNodeInfo.setEnabled(chip.isEnabled());
        t3Var.m(Button.class.getName());
    }

    @Override // defpackage.t62
    public final void v(int i, boolean z) {
        Chip chip = this.q;
        if (i == 1) {
            chip.n = z;
        }
        xq0 xq0Var = chip.e;
        boolean z2 = chip.n;
        boolean zC0 = false;
        if (xq0Var.V != null) {
            zC0 = xq0Var.c0(z2 ? new int[]{R.attr.state_pressed, R.attr.state_enabled} : xq0.m1);
        }
        if (zC0) {
            chip.refreshDrawableState();
        }
    }
}
