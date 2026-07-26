package ir.mservices.market.securityShield;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import defpackage.bn6;
import defpackage.bt2;
import defpackage.dp3;
import defpackage.ia0;
import defpackage.il7;
import defpackage.ja1;
import defpackage.js3;
import defpackage.kc7;
import defpackage.kt;
import defpackage.li1;
import defpackage.lu7;
import defpackage.ly5;
import defpackage.o40;
import defpackage.rj;
import defpackage.rs6;
import defpackage.rv6;
import defpackage.t32;
import defpackage.vd7;
import defpackage.vl8;
import defpackage.wz5;
import defpackage.y97;
import defpackage.yz5;
import ir.mservices.market.securityShield.recycler.DeviceScanData;
import ir.mservices.market.version2.webapi.responsedto.HarmfulAppData;
import ir.mservices.market.viewModel.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class SecurityShieldViewModel extends c {
    public final rv6 A;
    public final l B;
    public final rv6 C;
    public List D;
    public List E;
    public List F;
    public List G;
    public ProcessState H;
    public final Random I;
    public HarmfulAppData J;
    public AnimatorSet K;
    public li1 L;
    public final bn6 t;
    public final lu7 u;
    public final dp3 v;
    public final ir.mservices.market.common.install.a w;
    public final vl8 x;
    public final kc7 y;
    public final l z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SecurityShieldViewModel(bn6 bn6Var, lu7 lu7Var, dp3 dp3Var, ir.mservices.market.common.install.a aVar, vl8 vl8Var, kc7 kc7Var) {
        super(true);
        js3.p(lu7Var, "sharedPreferencesProxy");
        js3.p(dp3Var, "installManager");
        js3.p(aVar, "installedAppsManager");
        js3.p(vl8Var, "timeUtils");
        js3.p(kc7Var, "safetyNetClient");
        this.t = bn6Var;
        this.u = lu7Var;
        this.v = dp3Var;
        this.w = aVar;
        this.x = vl8Var;
        this.y = kc7Var;
        l lVarB = ja1.b(ScanState.a);
        this.z = lVarB;
        this.A = new rv6(lVarB);
        l lVarB2 = ja1.b(0);
        this.B = lVarB2;
        this.C = new rv6(lVarB2);
        this.I = new Random();
        this.J = new HarmfulAppData();
        t32.b().l(this, false);
    }

    public static void u(SecurityShieldViewModel securityShieldViewModel) {
        securityShieldViewModel.getClass();
        bt2.G(y97.G(securityShieldViewModel), null, null, new SecurityShieldViewModel$sendHarmfulAppsToServer$1(null, securityShieldViewModel, null), 3);
    }

    public static void x(SecurityShieldViewModel securityShieldViewModel, String str, Integer num, Integer num2, int i) {
        if ((i & 1) != 0) {
            str = "";
        }
        String str2 = str;
        if ((i & 4) != 0) {
            num2 = null;
        }
        securityShieldViewModel.g(new wz5(new vd7(17), new ia0(securityShieldViewModel, str2, num, num2, 2)));
    }

    @Override // ir.mservices.market.viewModel.c, defpackage.k79
    public final void d() {
        super.d();
        t32.b().o(this);
        Collection collection = this.D;
        if (collection == null) {
            collection = EmptyList.a;
        }
        Iterable iterable = this.E;
        if (iterable == null) {
            iterable = EmptyList.a;
        }
        ArrayList arrayListZ0 = kotlin.collections.a.z0(iterable, collection);
        Iterable iterable2 = this.F;
        if (iterable2 == null) {
            iterable2 = EmptyList.a;
        }
        ArrayList arrayListZ02 = kotlin.collections.a.z0(iterable2, arrayListZ0);
        AnimatorSet animatorSet = this.K;
        Iterable childAnimations = animatorSet != null ? animatorSet.getChildAnimations() : null;
        if (childAnimations == null) {
            childAnimations = EmptyList.a;
        }
        for (Animator animator : kotlin.collections.a.z0(childAnimations, arrayListZ02)) {
            if (animator instanceof ValueAnimator) {
                ((ValueAnimator) animator).removeAllUpdateListeners();
            }
            animator.cancel();
            animator.removeAllListeners();
        }
        AnimatorSet animatorSet2 = this.K;
        if (animatorSet2 != null) {
            animatorSet2.removeAllListeners();
        }
        AnimatorSet animatorSet3 = this.K;
        if (animatorSet3 != null) {
            animatorSet3.cancel();
        }
        AnimatorSet animatorSet4 = this.K;
        if (animatorSet4 != null) {
            animatorSet4.end();
        }
        this.K = null;
        this.L = null;
    }

    @Override // ir.mservices.market.viewModel.c
    public final void e() {
        DeviceScanData deviceScanData;
        boolean zV = v();
        rv6 rv6Var = this.C;
        Integer num = null;
        if (zV) {
            bt2.G(y97.G(this), null, null, new SecurityShieldViewModel$startScan$1(this, null), 3);
            deviceScanData = new DeviceScanData(14, rv6Var, num);
        } else {
            deviceScanData = new DeviceScanData(2, rv6Var, Integer.valueOf(rs6.device_scan_no_harmful_app_detected));
        }
        p(new SecurityShieldViewModel$doRequest$1(deviceScanData, this, null));
    }

    public final void onEvent(ly5 ly5Var) {
        js3.p(ly5Var, "event");
        if (js3.i(ly5Var.b.getAction(), "android.intent.action.PACKAGE_REMOVED")) {
            String str = ly5Var.a;
            js3.o(str, "getPackageName(...)");
            t(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof ir.mservices.market.securityShield.SecurityShieldViewModel$checkHarmfulApps$1
            if (r0 == 0) goto L13
            r0 = r6
            ir.mservices.market.securityShield.SecurityShieldViewModel$checkHarmfulApps$1 r0 = (ir.mservices.market.securityShield.SecurityShieldViewModel$checkHarmfulApps$1) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ir.mservices.market.securityShield.SecurityShieldViewModel$checkHarmfulApps$1 r0 = new ir.mservices.market.securityShield.SecurityShieldViewModel$checkHarmfulApps$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            kotlin.b.b(r6)     // Catch: java.lang.Throwable -> L28
            goto L40
        L28:
            r6 = move-exception
            goto L43
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            kotlin.b.b(r6)
            ir.mservices.market.common.install.a r6 = r5.w     // Catch: java.lang.Throwable -> L28
            r0.c = r4     // Catch: java.lang.Throwable -> L28
            java.lang.Object r6 = r6.a(r3, r4, r0)     // Catch: java.lang.Throwable -> L28
            if (r6 != r1) goto L40
            return r1
        L40:
            java.util.List r6 = (java.util.List) r6     // Catch: java.lang.Throwable -> L28
            goto L47
        L43:
            kotlin.Result$Failure r6 = kotlin.b.a(r6)
        L47:
            boolean r0 = r6 instanceof kotlin.Result.Failure
            if (r0 != 0) goto L4f
            java.util.List r6 = (java.util.List) r6
            r5.G = r6
        L4f:
            bn6 r6 = r5.t
            r6.getClass()
            gu2 r0 = defpackage.gu2.e
            java.lang.Object r6 = r6.b
            android.content.Context r6 = (android.content.Context) r6
            r1 = 13000000(0xc65d40, float:1.821688E-38)
            int r6 = r0.b(r6, r1)
            if (r6 != 0) goto L9b
            fu0 r6 = defpackage.y97.G(r5)
            ir.mservices.market.securityShield.SecurityShieldViewModel$checkIsVerifyAppsEnabled$1 r0 = new ir.mservices.market.securityShield.SecurityShieldViewModel$checkIsVerifyAppsEnabled$1
            r1 = 0
            r0.<init>(r5, r1)
            r2 = 3
            li1 r6 = defpackage.bt2.G(r6, r1, r1, r0, r2)
            r5.L = r6
            kc7 r6 = r5.y
            r6.getClass()
            cf0 r0 = defpackage.cf0.b()
            r1 = 4201(0x1069, float:5.887E-42)
            r0.b = r1
            js8 r1 = new js8
            r1.<init>(r6)
            r0.d = r1
            cf0 r0 = r0.a()
            ox9 r6 = r6.f(r3, r0)
            ts5 r0 = new ts5
            r1 = 14
            r0.<init>(r1, r5)
            r6.g(r0)
            goto L9e
        L9b:
            u(r5)
        L9e:
            tx8 r6 = defpackage.tx8.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.securityShield.SecurityShieldViewModel.r(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final ValueAnimator s(int i, int i2) {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i, i2);
        Random random = this.I;
        valueAnimatorOfInt.setDuration((random.nextInt(4) + 1) * 1000);
        valueAnimatorOfInt.setStartDelay((random.nextInt(2) + 1) * 1000);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ir.mservices.market.securityShield.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int iIntValue = ((Integer) o40.v(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Int")).intValue();
                SecurityShieldViewModel securityShieldViewModel = this.a;
                if (iIntValue != 100) {
                    securityShieldViewModel.y(iIntValue);
                } else {
                    securityShieldViewModel.y(iIntValue);
                    bt2.G(y97.G(securityShieldViewModel), null, null, new SecurityShieldViewModel$createAnimator$1$1$1(securityShieldViewModel, null), 3);
                }
            }
        });
        return valueAnimatorOfInt;
    }

    public final void t(String str) {
        g(new yz5(new kt(str, 10)));
        this.J.getAppList().remove(str);
        if (this.J.getAppList().isEmpty()) {
            ScanState scanState = ScanState.b;
            l lVar = this.z;
            lVar.getClass();
            lVar.p(null, scanState);
        }
        y(100);
        if (this.J.getHarmfulAppsSize() != 0) {
            x(this, this.J.getTitle(), Integer.valueOf(this.J.getHarmfulAppsSize()), null, 4);
        } else {
            x(this, null, 0, Integer.valueOf(rs6.device_scan_no_harmful_app_detected), 1);
        }
    }

    public final boolean v() {
        String str = lu7.s0;
        lu7 lu7Var = this.u;
        return lu7Var.d(str) == 0 || (lu7Var.d(str) + 300000) - System.currentTimeMillis() <= 0;
    }

    public final void w() {
        AnimatorSet animatorSet = this.K;
        if ((animatorSet == null || !animatorSet.isStarted()) && this.H != null) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.addListener(new rj(7, this));
            this.K = animatorSet2;
            ProcessState processState = this.H;
            int i = processState == null ? -1 : il7.a[processState.ordinal()];
            if (i == 1) {
                AnimatorSet animatorSet3 = this.K;
                if (animatorSet3 != null) {
                    animatorSet3.playSequentially(this.D);
                }
                AnimatorSet animatorSet4 = this.K;
                if (animatorSet4 != null) {
                    animatorSet4.start();
                }
                this.D = null;
            } else if (i == 2) {
                AnimatorSet animatorSet5 = this.K;
                if (animatorSet5 != null) {
                    animatorSet5.playSequentially(this.E);
                }
                AnimatorSet animatorSet6 = this.K;
                if (animatorSet6 != null) {
                    animatorSet6.start();
                }
                this.E = null;
            } else if (i == 3) {
                List list = this.E;
                if (list == null) {
                    AnimatorSet animatorSet7 = this.K;
                    if (animatorSet7 != null) {
                        animatorSet7.playSequentially(this.F);
                    }
                } else {
                    AnimatorSet animatorSet8 = this.K;
                    if (animatorSet8 != null) {
                        Iterable iterable = this.F;
                        if (iterable == null) {
                            iterable = EmptyList.a;
                        }
                        animatorSet8.playSequentially(kotlin.collections.a.z0(iterable, list));
                    }
                }
                AnimatorSet animatorSet9 = this.K;
                if (animatorSet9 != null) {
                    animatorSet9.start();
                }
            } else if (i == 4) {
                AnimatorSet animatorSet10 = this.K;
                if (animatorSet10 != null) {
                    Collection collection = this.E;
                    if (collection == null) {
                        collection = EmptyList.a;
                    }
                    Iterable iterable2 = this.F;
                    if (iterable2 == null) {
                        iterable2 = EmptyList.a;
                    }
                    animatorSet10.playSequentially(kotlin.collections.a.z0(iterable2, collection));
                }
                AnimatorSet animatorSet11 = this.K;
                if (animatorSet11 != null) {
                    animatorSet11.start();
                }
            }
            this.H = null;
        }
    }

    public final void y(int i) {
        bt2.G(y97.G(this), null, null, new SecurityShieldViewModel$updateProgressState$1(this, i, null), 3);
    }
}
