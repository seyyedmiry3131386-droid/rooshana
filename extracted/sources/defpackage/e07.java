package defpackage;

import android.os.Build;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class e07 implements Runnable {
    public int a;
    public int b;
    public OverScroller c;
    public Interpolator d;
    public boolean e;
    public boolean f;
    public final /* synthetic */ RecyclerView g;

    public e07(RecyclerView recyclerView) {
        this.g = recyclerView;
        e60 e60Var = RecyclerView.g1;
        this.d = e60Var;
        this.e = false;
        this.f = false;
        this.c = new OverScroller(recyclerView.getContext(), e60Var);
    }

    public final void a(int i, int i2) {
        RecyclerView recyclerView = this.g;
        recyclerView.setScrollState(2);
        this.b = 0;
        this.a = 0;
        Interpolator interpolator = this.d;
        e60 e60Var = RecyclerView.g1;
        if (interpolator != e60Var) {
            this.d = e60Var;
            this.c = new OverScroller(recyclerView.getContext(), e60Var);
        }
        this.c.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        b();
    }

    public final void b() {
        if (this.e) {
            this.f = true;
            return;
        }
        RecyclerView recyclerView = this.g;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = q69.a;
        recyclerView.postOnAnimation(this);
    }

    public final void c(int i, int i2, int i3, Interpolator interpolator) {
        RecyclerView recyclerView = this.g;
        if (i3 == Integer.MIN_VALUE) {
            int iAbs = Math.abs(i);
            int iAbs2 = Math.abs(i2);
            boolean z = iAbs > iAbs2;
            int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z) {
                iAbs = iAbs2;
            }
            i3 = Math.min((int) (((iAbs / width) + 1.0f) * 300.0f), 2000);
        }
        int i4 = i3;
        if (interpolator == null) {
            interpolator = RecyclerView.g1;
        }
        if (this.d != interpolator) {
            this.d = interpolator;
            this.c = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.b = 0;
        this.a = 0;
        recyclerView.setScrollState(2);
        this.c.startScroll(0, 0, i, i2, i4);
        b();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        int i3;
        int i4;
        RecyclerView recyclerView = this.g;
        int[] iArr = recyclerView.Q0;
        if (recyclerView.n == null) {
            recyclerView.removeCallbacks(this);
            this.c.abortAnimation();
            return;
        }
        this.f = false;
        this.e = true;
        recyclerView.p();
        OverScroller overScroller = this.c;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i5 = currX - this.a;
            int i6 = currY - this.b;
            this.a = currX;
            this.b = currY;
            int iO = RecyclerView.o(i5, recyclerView.I, recyclerView.K, recyclerView.getWidth());
            int iO2 = RecyclerView.o(i6, recyclerView.J, recyclerView.L, recyclerView.getHeight());
            int[] iArr2 = recyclerView.Q0;
            iArr2[0] = 0;
            iArr2[1] = 0;
            if (recyclerView.v(iO, iO2, 1, iArr2, null)) {
                iO -= iArr[0];
                iO2 -= iArr[1];
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.n(iO, iO2);
            }
            if (recyclerView.m != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                recyclerView.j0(iO, iO2, iArr);
                int i7 = iArr[0];
                int i8 = iArr[1];
                int i9 = iO - i7;
                int i10 = iO2 - i8;
                a07 a07Var = recyclerView.n.e;
                if (a07Var != null && !a07Var.d && a07Var.e) {
                    int iB = recyclerView.E0.b();
                    if (iB == 0) {
                        a07Var.d();
                    } else if (a07Var.a >= iB) {
                        a07Var.a = iB - 1;
                        a07Var.b(i7, i8);
                    } else {
                        a07Var.b(i7, i8);
                    }
                }
                i = i9;
                i3 = i7;
                i2 = i10;
                i4 = i8;
            } else {
                i = iO;
                i2 = iO2;
                i3 = 0;
                i4 = 0;
            }
            if (!recyclerView.p.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.Q0;
            iArr3[0] = 0;
            iArr3[1] = 0;
            recyclerView.w(i3, i4, i, i2, null, 1, iArr3);
            int i11 = i - iArr[0];
            int i12 = i2 - iArr[1];
            if (i3 != 0 || i4 != 0) {
                recyclerView.x(i3, i4);
            }
            if (!recyclerView.awakenScrollBars()) {
                recyclerView.invalidate();
            }
            boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i11 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i12 != 0));
            a07 a07Var2 = recyclerView.n.e;
            if ((a07Var2 == null || !a07Var2.d) && z) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    int i13 = i11 < 0 ? -currVelocity : i11 > 0 ? currVelocity : 0;
                    if (i12 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i12 <= 0) {
                        currVelocity = 0;
                    }
                    if (i13 < 0) {
                        recyclerView.z();
                        if (recyclerView.I.isFinished()) {
                            recyclerView.I.onAbsorb(-i13);
                        }
                    } else if (i13 > 0) {
                        recyclerView.A();
                        if (recyclerView.K.isFinished()) {
                            recyclerView.K.onAbsorb(i13);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.B();
                        if (recyclerView.J.isFinished()) {
                            recyclerView.J.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.y();
                        if (recyclerView.L.isFinished()) {
                            recyclerView.L.onAbsorb(currVelocity);
                        }
                    }
                    if (i13 != 0 || currVelocity != 0) {
                        recyclerView.postInvalidateOnAnimation();
                    }
                }
                if (RecyclerView.e1) {
                    sr0 sr0Var = recyclerView.D0;
                    int[] iArr4 = sr0Var.c;
                    if (iArr4 != null) {
                        Arrays.fill(iArr4, -1);
                    }
                    sr0Var.d = 0;
                }
            } else {
                b();
                jq2 jq2Var = recyclerView.C0;
                if (jq2Var != null) {
                    jq2Var.a(recyclerView, i3, i4);
                }
            }
            if (Build.VERSION.SDK_INT >= 35) {
                nz6.a(recyclerView, Math.abs(overScroller.getCurrVelocity()));
            }
        }
        a07 a07Var3 = recyclerView.n.e;
        if (a07Var3 != null && a07Var3.d) {
            a07Var3.b(0, 0);
        }
        this.e = false;
        if (!this.f) {
            recyclerView.setScrollState(0);
            recyclerView.r0(1);
        } else {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap = q69.a;
            recyclerView.postOnAnimation(this);
        }
    }
}
