package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.Group;
import androidx.media3.ui.DefaultTimeBar;
import androidx.media3.ui.PlayerControlView;
import androidx.recyclerview.widget.o;
import androidx.viewpager2.widget.ViewPager2;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.common.ui.recycler.RecyclerItem;
import ir.mservices.market.reels.data.AnalyticsEventDto;
import ir.mservices.market.reels.data.ReelDto;
import ir.mservices.market.reels.ui.ReelsFragment;
import ir.mservices.market.reels.ui.recycler.ReelAdData;
import ir.mservices.market.reels.ui.recycler.ReelData;
import ir.mservices.market.reels.ui.recycler.a;
import ir.mservices.market.reels.ui.recycler.b;
import ir.mservices.market.views.MyketTextView;
import ir.myket.callback.domain.models.CallbackUrlType;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class zz0 extends o89 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ zz0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.o89
    public final void a(int i) {
        b bVarN1;
        switch (this.a) {
            case 0:
                try {
                    Iterator it = ((ArrayList) this.b).iterator();
                    while (it.hasNext()) {
                        ((o89) it.next()).a(i);
                        break;
                    }
                    return;
                } catch (ConcurrentModificationException e) {
                    throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e);
                }
            case 1:
                ((wm2) this.b).e(false);
                return;
            default:
                ReelsFragment reelsFragment = (ReelsFragment) this.b;
                if (i != 0) {
                    if (i == 1 && (bVarN1 = ReelsFragment.n1(reelsFragment)) != null) {
                        q07 q07Var = bVarN1.M;
                        if (q07Var == null) {
                            js3.V("binding");
                            throw null;
                        }
                        if (q07Var.y.l()) {
                            bVarN1.L(false);
                            return;
                        }
                        return;
                    }
                    return;
                }
                reelsFragment.f1 = false;
                if (reelsFragment.g1) {
                    int iM1 = reelsFragment.m1();
                    km2 km2Var = reelsFragment.a1;
                    js3.m(km2Var);
                    ViewPager2 viewPager2 = km2Var.B;
                    js3.o(viewPager2, "viewPager");
                    o oVarI = a27.h(viewPager2).I(iM1);
                    u80 u80Var = (u80) (oVarI instanceof u80 ? oVarI : null);
                    if (u80Var != null) {
                        u80Var.C();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // defpackage.o89
    public void b(int i, float f, int i2) {
        v07 v07Var;
        switch (this.a) {
            case 0:
                try {
                    Iterator it = ((ArrayList) this.b).iterator();
                    while (it.hasNext()) {
                        ((o89) it.next()).b(i, f, i2);
                        break;
                    }
                    return;
                } catch (ConcurrentModificationException e) {
                    throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e);
                }
            case 1:
            default:
                return;
            case 2:
                ReelsFragment reelsFragment = (ReelsFragment) this.b;
                if (i == (reelsFragment.Z0 != null ? r5.c() : 0) - 1 && reelsFragment.b1 && (v07Var = reelsFragment.Z0) != null) {
                    v07Var.C();
                    return;
                }
                return;
        }
    }

    @Override // defpackage.o89
    public final void c(int i) {
        p07 p07VarH;
        Handler handler;
        ReelAdData reelAdData;
        String skipCallback;
        switch (this.a) {
            case 0:
                try {
                    Iterator it = ((ArrayList) this.b).iterator();
                    while (it.hasNext()) {
                        ((o89) it.next()).c(i);
                        break;
                    }
                    return;
                } catch (ConcurrentModificationException e) {
                    throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e);
                }
            case 1:
                ((wm2) this.b).e(false);
                return;
            default:
                ReelsFragment reelsFragment = (ReelsFragment) this.b;
                reelsFragment.g1 = false;
                km2 km2Var = reelsFragment.a1;
                js3.m(km2Var);
                ViewPager2 viewPager2 = km2Var.B;
                js3.o(viewPager2, "viewPager");
                o oVarI = a27.h(viewPager2).I(i);
                if (!(oVarI instanceof a)) {
                    oVarI = null;
                }
                int i2 = 1;
                if (((a) oVarI) != null) {
                    ((ReelsFragment) this.b).r1(true);
                }
                ReelsFragment reelsFragment2 = (ReelsFragment) this.b;
                if (!reelsFragment2.f1) {
                    v07 v07Var = reelsFragment2.Z0;
                    int iM1 = reelsFragment2.m1();
                    if (v07Var != null) {
                        RecyclerItem recyclerItem = (RecyclerItem) kotlin.collections.a.q0(iM1, (ArrayList) v07Var.D().d);
                        MyketRecyclerData myketRecyclerData = recyclerItem != null ? recyclerItem.c : null;
                        if (!(myketRecyclerData instanceof ReelAdData)) {
                            myketRecyclerData = null;
                        }
                        reelAdData = (ReelAdData) myketRecyclerData;
                    } else {
                        reelAdData = null;
                    }
                    if (reelAdData != null && (skipCallback = reelAdData.b.getContent().getSkipCallback()) != null) {
                        reelsFragment2.l1().b(new ql0(skipCallback, CallbackUrlType.l, 0));
                    }
                }
                km2 km2Var2 = ((ReelsFragment) this.b).a1;
                js3.m(km2Var2);
                FrameLayout frameLayout = km2Var2.y;
                js3.o(frameLayout, "progressLayout");
                if (frameLayout.getVisibility() == 0) {
                    km2 km2Var3 = ((ReelsFragment) this.b).a1;
                    js3.m(km2Var3);
                    km2Var3.x.d(false);
                    km2 km2Var4 = ((ReelsFragment) this.b).a1;
                    js3.m(km2Var4);
                    km2Var4.y.setVisibility(8);
                }
                if (((ReelsFragment) this.b).m1() < i) {
                    ReelsFragment reelsFragment3 = (ReelsFragment) this.b;
                    ReelData reelDataC = w07.c(reelsFragment3.Z0, reelsFragment3.m1());
                    if (reelDataC != null) {
                        ReelDto reelDto = reelDataC.b;
                        b bVarN1 = ReelsFragment.n1(reelsFragment3);
                        p07 p07VarH2 = reelDataC.h;
                        if (!(p07VarH2 != null ? p07VarH2.e : false)) {
                            if (bVarN1 != null) {
                                String reelId = reelDto.getReelId();
                                Map<String, String> params = reelDto.getParams();
                                int i3 = b.B0;
                                p07VarH2 = bVarN1.H(reelId, params, false);
                            } else {
                                p07VarH2 = null;
                            }
                        }
                        AnalyticsEventDto analyticsEventDto = reelDataC.c;
                        String strK1 = ReelsFragment.k1(analyticsEventDto != null ? analyticsEventDto.getScrollUp() : null, p07VarH2);
                        if (strK1 != null) {
                            reelsFragment3.l1().b(new ql0(strK1, CallbackUrlType.l, 0));
                        }
                    }
                } else if (((ReelsFragment) this.b).m1() > i) {
                    ReelsFragment reelsFragment4 = (ReelsFragment) this.b;
                    ReelData reelDataC2 = w07.c(reelsFragment4.Z0, reelsFragment4.m1());
                    if (reelDataC2 != null) {
                        ReelDto reelDto2 = reelDataC2.b;
                        b bVarN12 = ReelsFragment.n1(reelsFragment4);
                        AnalyticsEventDto analyticsEventDto2 = reelDataC2.c;
                        String scrollDown = analyticsEventDto2 != null ? analyticsEventDto2.getScrollDown() : null;
                        if (bVarN12 != null) {
                            String reelId2 = reelDto2.getReelId();
                            Map<String, String> params2 = reelDto2.getParams();
                            int i4 = b.B0;
                            p07VarH = bVarN12.H(reelId2, params2, false);
                        } else {
                            p07VarH = null;
                        }
                        String strK12 = ReelsFragment.k1(scrollDown, p07VarH);
                        if (strK12 != null) {
                            reelsFragment4.l1().b(new ql0(strK12, CallbackUrlType.l, 0));
                        }
                    }
                }
                ReelsFragment reelsFragment5 = (ReelsFragment) this.b;
                int iM12 = reelsFragment5.m1();
                km2 km2Var5 = reelsFragment5.a1;
                js3.m(km2Var5);
                ViewPager2 viewPager22 = km2Var5.B;
                js3.o(viewPager22, "viewPager");
                o oVarI2 = a27.h(viewPager22).I(iM12);
                if (!(oVarI2 instanceof u80)) {
                    oVarI2 = null;
                }
                u80 u80Var = (u80) oVarI2;
                if (u80Var != null) {
                    u80Var.B();
                }
                ReelsFragment reelsFragment6 = (ReelsFragment) this.b;
                v07 v07Var2 = reelsFragment6.Z0;
                if (v07Var2 != null) {
                    RecyclerItem recyclerItem2 = (RecyclerItem) kotlin.collections.a.q0(i, (ArrayList) v07Var2.D().d);
                    MyketRecyclerData myketRecyclerData2 = recyclerItem2 != null ? recyclerItem2.c : null;
                    if (!(myketRecyclerData2 != null)) {
                        myketRecyclerData2 = null;
                    }
                    if (myketRecyclerData2 != null) {
                        if (myketRecyclerData2 instanceof ReelData) {
                            km2 km2Var6 = reelsFragment6.a1;
                            js3.m(km2Var6);
                            ViewPager2 viewPager23 = km2Var6.B;
                            js3.o(viewPager23, "viewPager");
                            o oVarI3 = a27.h(viewPager23).I(i);
                            if (!(oVarI3 instanceof b)) {
                                oVarI3 = null;
                            }
                            b bVar = (b) oVarI3;
                            if (bVar != null) {
                                bVar.z();
                                synchronized (zk8.class) {
                                    handler = zk8.a;
                                    if (handler == null) {
                                        handler = new Handler(Looper.getMainLooper());
                                        zk8.a = handler;
                                    }
                                    break;
                                }
                                bVar.T = handler;
                                q6 q6Var = new q6(28, bVar);
                                bVar.U = q6Var;
                                handler.post(q6Var);
                                t07 t07Var = new t07(bVar);
                                bVar.P = t07Var;
                                q07 q07Var = bVar.M;
                                if (q07Var == null) {
                                    js3.V("binding");
                                    throw null;
                                }
                                DefaultTimeBar defaultTimeBar = q07Var.C;
                                defaultTimeBar.getClass();
                                defaultTimeBar.x.add(t07Var);
                                p80 p80Var = new p80(i2, bVar);
                                bVar.N = p80Var;
                                q07 q07Var2 = bVar.M;
                                if (q07Var2 == null) {
                                    js3.V("binding");
                                    throw null;
                                }
                                PlayerControlView playerControlView = q07Var2.y;
                                playerControlView.getClass();
                                playerControlView.j.add(p80Var);
                                bVar.I().setImageResource(yq6.ic_pause);
                                q07 q07Var3 = bVar.M;
                                if (q07Var3 == null) {
                                    js3.V("binding");
                                    throw null;
                                }
                                PlayerControlView playerControlView2 = q07Var3.y;
                                bVar.N(playerControlView2.l());
                                if (!playerControlView2.l()) {
                                    og5 og5Var = bVar.G;
                                    View view = bVar.a;
                                    js3.o(view, "itemView");
                                    og5Var.m(view, bVar, Boolean.FALSE);
                                }
                                MyketTextView myketTextView = q07Var3.N;
                                js3.m(myketTextView);
                                if (myketTextView.getVisibility() == 0) {
                                    myketTextView.setVisibility(8);
                                }
                                Group group = q07Var3.O;
                                if (bVar.V == null) {
                                    js3.m(group);
                                    if (group.getVisibility() != 0) {
                                        group.setVisibility(0);
                                    }
                                }
                            }
                        } else if (myketRecyclerData2 instanceof ReelAdData) {
                            km2 km2Var7 = reelsFragment6.a1;
                            js3.m(km2Var7);
                            ViewPager2 viewPager24 = km2Var7.B;
                            js3.o(viewPager24, "viewPager");
                            o oVarI4 = a27.h(viewPager24).I(i);
                            a aVar = (a) (oVarI4 instanceof a ? oVarI4 : null);
                            if (aVar != null) {
                                aVar.B();
                                aVar.H((ReelAdData) myketRecyclerData2);
                            }
                        }
                    }
                }
                ((ReelsFragment) this.b).Y0 = i;
                return;
        }
    }

    public zz0() {
        this.a = 0;
        this.b = new ArrayList(3);
    }
}
