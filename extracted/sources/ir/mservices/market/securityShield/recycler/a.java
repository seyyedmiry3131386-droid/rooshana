package ir.mservices.market.securityShield.recycler;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.AlphaAnimation;
import androidx.appcompat.widget.AppCompatImageView;
import defpackage.a79;
import defpackage.bt2;
import defpackage.cc7;
import defpackage.js3;
import defpackage.lw;
import defpackage.lw8;
import defpackage.qg5;
import defpackage.qj;
import defpackage.qs6;
import defpackage.rs6;
import defpackage.yq6;
import defpackage.z73;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends qg5 {
    public static final /* synthetic */ int z = 0;
    public lw8 w;
    public z73 x;
    public ValueAnimator y;

    @Override // defpackage.qg5
    public final void s(MyketRecyclerData myketRecyclerData) {
        DeviceScanData deviceScanData = (DeviceScanData) myketRecyclerData;
        js3.p(deviceScanData, "data");
        if (deviceScanData.c == null) {
            MyketTextView myketTextView = y().x;
            View view = this.a;
            myketTextView.setText(view.getResources().getString(rs6.processing_device_scan));
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 4);
            valueAnimatorOfInt.setDuration(1500L);
            valueAnimatorOfInt.addUpdateListener(new qj(5, this));
            valueAnimatorOfInt.setRepeatCount(-1);
            valueAnimatorOfInt.setRepeatMode(1);
            this.y = valueAnimatorOfInt;
            valueAnimatorOfInt.start();
            y().v.setAnimation(qs6.security_shiled);
            y().v.setRepeatCount(-1);
            y().v.f();
            bt2.G(cc7.q(view), null, null, new DeviceScanViewHolder$onAttach$1(deviceScanData, this, null), 3);
        }
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        DeviceScanData deviceScanData = (DeviceScanData) myketRecyclerData;
        js3.p(deviceScanData, "data");
        Integer num = deviceScanData.d;
        Integer num2 = deviceScanData.c;
        if (num2 != null) {
            ValueAnimator valueAnimator = this.y;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.y = null;
            y().v.setRepeatCount(0);
            if (num2.intValue() == 0) {
                x(y().v.h.j() ? yq6.ic_securityshield_no_threatfound_empty : yq6.ic_securityshield_no_threatfound);
            } else {
                y().v.clearAnimation();
                y().v.setVisibility(4);
                x(yq6.ic_securityshield_threat_found);
            }
            MyketTextView myketTextView = y().z;
            View view = this.a;
            myketTextView.setText(num != null ? view.getResources().getString(num.intValue()) : deviceScanData.b);
            ValueAnimator valueAnimator2 = this.y;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            this.y = null;
            y().v.setRepeatCount(0);
            y().x.setText(view.getResources().getString(rs6.last_scan_date, view.getResources().getString(rs6.today)));
            y().w.setText("");
        }
    }

    @Override // defpackage.qg5
    public final void u(MyketRecyclerData myketRecyclerData) {
        js3.p((DeviceScanData) myketRecyclerData, "data");
        ValueAnimator valueAnimator = this.y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.y = null;
        y().v.setRepeatCount(0);
        z(0);
        y().x.setText("");
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof z73) {
            this.x = (z73) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }

    public final void x(int i) {
        if (y().v.h.j()) {
            AppCompatImageView appCompatImageView = y().y;
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(800L);
            alphaAnimation.setFillAfter(true);
            appCompatImageView.startAnimation(alphaAnimation);
        }
        y().y.setImageResource(i);
    }

    public final z73 y() {
        z73 z73Var = this.x;
        if (z73Var != null) {
            return z73Var;
        }
        js3.V("binding");
        throw null;
    }

    public final void z(int i) {
        String string = this.a.getResources().getString(rs6.percentage, Integer.valueOf(i));
        js3.o(string, "getString(...)");
        MyketTextView myketTextView = y().z;
        lw8 lw8Var = this.w;
        if (lw8Var != null) {
            myketTextView.setText(lw8.e(lw8Var, string));
        } else {
            js3.V("uiUtils");
            throw null;
        }
    }
}
