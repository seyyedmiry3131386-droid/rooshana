package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.o;
import androidx.compose.foundation.gestures.q;
import androidx.compose.foundation.text.KeyCommand;
import androidx.compose.material3.p;
import androidx.compose.ui.node.i;
import androidx.compose.ui.semantics.f;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.d;
import androidx.lifecycle.Lifecycle$Event;
import androidx.lifecycle.Lifecycle$State;
import androidx.media3.exoplayer.ExoPlayer;
import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$DisplayCommandV2;
import defpackage.bt2;
import ir.mservices.market.app.update.common.manager.a;
import ir.mservices.market.app.update.recycler.AppUpdateData;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.movie.data.webapi.BackgroundImageDto;
import ir.mservices.market.movie.data.webapi.CommonDataKt;
import ir.mservices.market.movie.data.webapi.HomeMovieListDto;
import ir.mservices.market.movie.data.webapi.MovieDto;
import ir.mservices.market.movie.streamers.recycler.StreamerMovieData;
import ir.mservices.market.movie.ui.common.MovieHomeMovieData;
import ir.mservices.market.views.MyketRatingBar;
import ir.mservices.market.views.SeriesBackground;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.b;
import kotlin.jvm.internal.MutablePropertyReference0;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vt implements dp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ vt(wb5 wb5Var, ArrayList arrayList, List list, boolean z) {
        this.a = 11;
        this.b = wb5Var;
        this.c = arrayList;
        this.d = list;
    }

    private final Object b(Object obj) {
        Integer numE;
        Integer numD;
        Integer numD2;
        Integer numE2;
        ri8 ri8Var;
        ri8 ri8Var2;
        si8 si8Var;
        si8 si8Var2;
        ri8 ri8Var3;
        ri8 ri8Var4;
        si8 si8Var3;
        si8 si8Var4;
        Integer numD3;
        Integer numE3;
        Integer numE4;
        Integer numD4;
        bn6 bn6Var;
        KeyCommand keyCommand = (KeyCommand) this.b;
        kh8 kh8Var = (kh8) this.c;
        Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) this.d;
        mh8 mh8Var = (mh8) obj;
        int i = 4;
        int i2 = 13;
        zh8 zh8Var = null;
        switch (keyCommand.ordinal()) {
            case 0:
                mh8Var.e.a = null;
                if (mh8Var.g.b.length() > 0) {
                    if (zi8.d(mh8Var.f)) {
                        mh8Var.i();
                    } else if (!mh8Var.f()) {
                        int iF = zi8.f(mh8Var.f);
                        mh8Var.q(iF, iF);
                    } else {
                        int iG = zi8.g(mh8Var.f);
                        mh8Var.q(iG, iG);
                    }
                }
                break;
            case 1:
                mh8Var.e.a = null;
                if (mh8Var.g.b.length() > 0) {
                    if (zi8.d(mh8Var.f)) {
                        mh8Var.m();
                    } else if (!mh8Var.f()) {
                        int iG2 = zi8.g(mh8Var.f);
                        mh8Var.q(iG2, iG2);
                    } else {
                        int iF2 = zi8.f(mh8Var.f);
                        mh8Var.q(iF2, iF2);
                    }
                }
                break;
            case 2:
                yi8 yi8Var = mh8Var.e;
                yi8Var.a = null;
                ll llVar = mh8Var.g;
                String str = llVar.b;
                String str2 = llVar.b;
                if (str.length() > 0) {
                    if (!mh8Var.f()) {
                        yi8Var.a = null;
                        if (str2.length() > 0 && (numE = mh8Var.e()) != null) {
                            int iIntValue = numE.intValue();
                            mh8Var.q(iIntValue, iIntValue);
                        }
                    } else {
                        yi8Var.a = null;
                        if (str2.length() > 0 && (numD = mh8Var.d()) != null) {
                            int iIntValue2 = numD.intValue();
                            mh8Var.q(iIntValue2, iIntValue2);
                        }
                    }
                }
                break;
            case 3:
                yi8 yi8Var2 = mh8Var.e;
                yi8Var2.a = null;
                ll llVar2 = mh8Var.g;
                String str3 = llVar2.b;
                String str4 = llVar2.b;
                if (str3.length() > 0) {
                    if (!mh8Var.f()) {
                        yi8Var2.a = null;
                        if (str4.length() > 0 && (numD2 = mh8Var.d()) != null) {
                            int iIntValue3 = numD2.intValue();
                            mh8Var.q(iIntValue3, iIntValue3);
                        }
                    } else {
                        yi8Var2.a = null;
                        if (str4.length() > 0 && (numE2 = mh8Var.e()) != null) {
                            int iIntValue4 = numE2.intValue();
                            mh8Var.q(iIntValue4, iIntValue4);
                        }
                    }
                }
                break;
            case 4:
                mh8Var.j();
                break;
            case 5:
                mh8Var.l();
                break;
            case 6:
                mh8Var.o();
                break;
            case 7:
                mh8Var.n();
                break;
            case 8:
                mh8Var.e.a = null;
                if (mh8Var.g.b.length() > 0) {
                    if (!mh8Var.f()) {
                        mh8Var.n();
                    } else {
                        mh8Var.o();
                    }
                }
                break;
            case 9:
                mh8Var.e.a = null;
                if (mh8Var.g.b.length() > 0) {
                    if (!mh8Var.f()) {
                        mh8Var.o();
                    } else {
                        mh8Var.n();
                    }
                }
                break;
            case 10:
                if (mh8Var.g.b.length() > 0 && (ri8Var = mh8Var.c) != null) {
                    int iG3 = mh8Var.g(ri8Var, -1);
                    mh8Var.q(iG3, iG3);
                }
                break;
            case 11:
                if (mh8Var.g.b.length() > 0 && (ri8Var2 = mh8Var.c) != null) {
                    int iG4 = mh8Var.g(ri8Var2, 1);
                    mh8Var.q(iG4, iG4);
                }
                break;
            case 12:
            case 48:
                break;
            case 13:
                if (mh8Var.g.b.length() > 0 && (si8Var = mh8Var.i) != null) {
                    int iH = mh8Var.h(si8Var, -1);
                    mh8Var.q(iH, iH);
                }
                break;
            case 14:
                if (mh8Var.g.b.length() > 0 && (si8Var2 = mh8Var.i) != null) {
                    int iH2 = mh8Var.h(si8Var2, 1);
                    mh8Var.q(iH2, iH2);
                }
                break;
            case 15:
                mh8Var.e.a = null;
                if (mh8Var.g.b.length() > 0) {
                    mh8Var.q(0, 0);
                }
                break;
            case 16:
                mh8Var.e.a = null;
                ll llVar3 = mh8Var.g;
                if (llVar3.b.length() > 0) {
                    int length = llVar3.b.length();
                    mh8Var.q(length, length);
                }
                break;
            case 17:
                kh8Var.b.f(false);
                break;
            case 18:
                kh8Var.b.s();
                break;
            case 19:
                kh8Var.b.h();
                break;
            case 20:
                List listA = mh8Var.a(new lc8(3));
                if (listA != null) {
                    kh8Var.a(listA);
                }
                break;
            case 21:
                List listA2 = mh8Var.a(new lc8(i));
                if (listA2 != null) {
                    kh8Var.a(listA2);
                }
                break;
            case 22:
                List listA3 = mh8Var.a(new lc8(5));
                if (listA3 != null) {
                    kh8Var.a(listA3);
                }
                break;
            case 23:
                List listA4 = mh8Var.a(new lc8(6));
                if (listA4 != null) {
                    kh8Var.a(listA4);
                }
                break;
            case 24:
                List listA5 = mh8Var.a(new lc8(7));
                if (listA5 != null) {
                    kh8Var.a(listA5);
                }
                break;
            case 25:
                List listA6 = mh8Var.a(new lc8(8));
                if (listA6 != null) {
                    kh8Var.a(listA6);
                }
                break;
            case 26:
                mh8Var.e.a = null;
                ll llVar4 = mh8Var.g;
                if (llVar4.b.length() > 0) {
                    mh8Var.q(0, llVar4.b.length());
                }
                break;
            case 27:
                mh8Var.i();
                mh8Var.p();
                break;
            case 28:
                mh8Var.m();
                mh8Var.p();
                break;
            case 29:
                if (mh8Var.g.b.length() > 0 && (ri8Var3 = mh8Var.c) != null) {
                    int iG5 = mh8Var.g(ri8Var3, -1);
                    mh8Var.q(iG5, iG5);
                }
                mh8Var.p();
                break;
            case 30:
                if (mh8Var.g.b.length() > 0 && (ri8Var4 = mh8Var.c) != null) {
                    int iG6 = mh8Var.g(ri8Var4, 1);
                    mh8Var.q(iG6, iG6);
                }
                mh8Var.p();
                break;
            case 31:
                if (mh8Var.g.b.length() > 0 && (si8Var3 = mh8Var.i) != null) {
                    int iH3 = mh8Var.h(si8Var3, -1);
                    mh8Var.q(iH3, iH3);
                }
                mh8Var.p();
                break;
            case 32:
                if (mh8Var.g.b.length() > 0 && (si8Var4 = mh8Var.i) != null) {
                    int iH4 = mh8Var.h(si8Var4, 1);
                    mh8Var.q(iH4, iH4);
                }
                mh8Var.p();
                break;
            case 33:
                mh8Var.e.a = null;
                if (mh8Var.g.b.length() > 0) {
                    mh8Var.q(0, 0);
                }
                mh8Var.p();
                break;
            case 34:
                mh8Var.e.a = null;
                ll llVar5 = mh8Var.g;
                if (llVar5.b.length() > 0) {
                    int length2 = llVar5.b.length();
                    mh8Var.q(length2, length2);
                }
                mh8Var.p();
                break;
            case 35:
                yi8 yi8Var3 = mh8Var.e;
                yi8Var3.a = null;
                ll llVar6 = mh8Var.g;
                String str5 = llVar6.b;
                String str6 = llVar6.b;
                if (str5.length() > 0) {
                    if (mh8Var.f()) {
                        yi8Var3.a = null;
                        if (str6.length() > 0 && (numE3 = mh8Var.e()) != null) {
                            int iIntValue5 = numE3.intValue();
                            mh8Var.q(iIntValue5, iIntValue5);
                        }
                    } else {
                        yi8Var3.a = null;
                        if (str6.length() > 0 && (numD3 = mh8Var.d()) != null) {
                            int iIntValue6 = numD3.intValue();
                            mh8Var.q(iIntValue6, iIntValue6);
                        }
                    }
                }
                mh8Var.p();
                break;
            case 36:
                yi8 yi8Var4 = mh8Var.e;
                yi8Var4.a = null;
                ll llVar7 = mh8Var.g;
                String str7 = llVar7.b;
                String str8 = llVar7.b;
                if (str7.length() > 0) {
                    if (mh8Var.f()) {
                        yi8Var4.a = null;
                        if (str8.length() > 0 && (numD4 = mh8Var.d()) != null) {
                            int iIntValue7 = numD4.intValue();
                            mh8Var.q(iIntValue7, iIntValue7);
                        }
                    } else {
                        yi8Var4.a = null;
                        if (str8.length() > 0 && (numE4 = mh8Var.e()) != null) {
                            int iIntValue8 = numE4.intValue();
                            mh8Var.q(iIntValue8, iIntValue8);
                        }
                    }
                }
                mh8Var.p();
                break;
            case 37:
                mh8Var.j();
                mh8Var.p();
                break;
            case 38:
                mh8Var.l();
                mh8Var.p();
                break;
            case 39:
                mh8Var.o();
                mh8Var.p();
                break;
            case 40:
                mh8Var.n();
                mh8Var.p();
                break;
            case 41:
                mh8Var.e.a = null;
                if (mh8Var.g.b.length() > 0) {
                    if (mh8Var.f()) {
                        mh8Var.o();
                    } else {
                        mh8Var.n();
                    }
                }
                mh8Var.p();
                break;
            case 42:
                mh8Var.e.a = null;
                if (mh8Var.g.b.length() > 0) {
                    if (mh8Var.f()) {
                        mh8Var.n();
                    } else {
                        mh8Var.o();
                    }
                }
                mh8Var.p();
                break;
            case 43:
                mh8Var.e.a = null;
                if (mh8Var.g.b.length() > 0) {
                    long j = mh8Var.f;
                    int i3 = zi8.c;
                    int i4 = (int) (j & 4294967295L);
                    mh8Var.q(i4, i4);
                }
                break;
            case MutationPayload$DisplayCommandV2.ERRORVIEWANNOTATIONPAYLOAD_FIELD_NUMBER /* 44 */:
                if (!kh8Var.e) {
                    kh8Var.a(br9.B(new xw0("\n", 1)));
                } else {
                    ref$BooleanRef.a = kh8Var.a.x.b.r.x(kh8Var.l);
                }
                break;
            case MutationPayload$DisplayCommandV2.DRAWRENDEREDITABLEPAYLOAD_FIELD_NUMBER /* 45 */:
                if (!kh8Var.e) {
                    kh8Var.a(br9.B(new xw0("\t", 1)));
                } else {
                    ref$BooleanRef.a = false;
                }
                break;
            case 46:
                px8 px8Var = kh8Var.h;
                if (px8Var != null) {
                    px8Var.a(zh8.a(mh8Var.h, mh8Var.g, mh8Var.f, 4));
                }
                px8 px8Var2 = kh8Var.h;
                if (px8Var2 != null) {
                    bn6 bn6Var2 = px8Var2.a;
                    if (bn6Var2 != null && (bn6Var = (bn6) bn6Var2.b) != null) {
                        px8Var2.a = bn6Var;
                        px8Var2.c -= ((zh8) bn6Var2.c).a.b.length();
                        px8Var2.b = new bn6(px8Var2.b, (zh8) bn6Var2.c, i2);
                        zh8Var = (zh8) bn6Var.c;
                    }
                    if (zh8Var != null) {
                        kh8Var.k.invoke(zh8Var);
                    }
                }
                break;
            case 47:
                px8 px8Var3 = kh8Var.h;
                if (px8Var3 != null) {
                    bn6 bn6Var3 = px8Var3.b;
                    if (bn6Var3 != null) {
                        px8Var3.b = (bn6) bn6Var3.b;
                        zh8 zh8Var2 = (zh8) bn6Var3.c;
                        px8Var3.a = new bn6(px8Var3.a, zh8Var2, i2);
                        px8Var3.c = zh8Var2.a.b.length() + px8Var3.c;
                        zh8Var = (zh8) bn6Var3.c;
                    }
                    if (zh8Var != null) {
                        kh8Var.k.invoke(zh8Var);
                    }
                }
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return tx8.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r21v1 */
    /* JADX WARN: Type inference failed for: r21v10 */
    /* JADX WARN: Type inference failed for: r21v2, types: [tm0] */
    @Override // defpackage.dp2
    public final Object invoke(Object obj) throws Throwable {
        FragmentActivity fragmentActivityQ;
        ws5 ws5VarC;
        ?? r21;
        tm0 tm0Var;
        Object value;
        x44 x44Var;
        int i = this.a;
        int i2 = 3;
        int i3 = 5;
        int i4 = 2;
        final int i5 = 1;
        final int i6 = 0;
        tx8 tx8Var = tx8.a;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                vz8 vz8Var = (vz8) obj4;
                a aVar = (a) obj3;
                String str = (String) obj2;
                if (vz8Var != null) {
                    Map mapI = (Map) aVar.h.getValue();
                    if (mapI == null) {
                        mapI = b.I();
                    }
                    vz8Var.a(mapI, str);
                }
                return tx8Var;
            case 1:
                AppUpdateData appUpdateData = (AppUpdateData) obj4;
                ir.mservices.market.app.update.recycler.a aVar2 = (ir.mservices.market.app.update.recycler.a) obj2;
                ((Integer) obj).intValue();
                appUpdateData.n = ((MyketRatingBar) obj3).getRating();
                og5 og5Var = aVar2.z;
                MyketRatingBar myketRatingBar = aVar2.V;
                js3.o(myketRatingBar, "ratingBar");
                og5Var.m(myketRatingBar, aVar2, appUpdateData);
                return tx8Var;
            case 2:
                dp2 dp2Var = (dp2) obj4;
                wb5 wb5Var = (wb5) obj2;
                zh8 zh8Var = (zh8) obj;
                ((wb5) obj3).setValue(zh8Var);
                boolean zI = js3.i((String) wb5Var.getValue(), zh8Var.a.b);
                ll llVar = zh8Var.a;
                wb5Var.setValue(llVar.b);
                if (!zI) {
                    dp2Var.invoke(llVar.b);
                }
                return tx8Var;
            case 3:
                final e71 e71Var = (e71) obj4;
                final p pVar = (p) obj3;
                bp2 bp2Var = new bp2() { // from class: androidx.compose.material3.internal.g
                    @Override // defpackage.bp2
                    public final Object invoke() {
                        bt2.G(e71Var, null, null, new BasicTooltipKt$anchorSemantics$1$1$1(pVar, null), 3);
                        return Boolean.TRUE;
                    }
                };
                ox3[] ox3VarArr = f.a;
                ((nn7) obj).a(androidx.compose.ui.semantics.a.c, new e3((String) obj2, bp2Var));
                return tx8Var;
            case 4:
                Context context = (Context) obj4;
                ub5 ub5Var = (ub5) obj3;
                Configuration configuration = (Configuration) obj2;
                vd6 vd6Var = (vd6) obj;
                js3.p(vd6Var, "it");
                if (vd6Var instanceof rd6) {
                    FragmentActivity fragmentActivityQ2 = y40.q(context);
                    if (fragmentActivityQ2 != null && (ws5VarC = fragmentActivityQ2.c()) != null) {
                        ws5VarC.b();
                    }
                } else if (vd6Var instanceof sd6) {
                    ub5Var.e(((sd6) vd6Var).a);
                } else if ((vd6Var instanceof ud6) && (fragmentActivityQ = y40.q(context)) != null) {
                    fragmentActivityQ.setRequestedOrientation(configuration.orientation == 2 ? 7 : 6);
                }
                return tx8Var;
            case 5:
                androidx.compose.foundation.gestures.b bVar = (androidx.compose.foundation.gestures.b) obj4;
                wt3 wt3Var = (wt3) obj3;
                dh7 dh7Var = (dh7) obj2;
                float fFloatValue = ((Float) obj).floatValue();
                float f = bVar.q ? 1.0f : -1.0f;
                o oVar = bVar.p;
                long jE = oVar.e(oVar.h(f * fFloatValue));
                o oVar2 = dh7Var.a;
                float fG = oVar.g(oVar.e(oVar2.c(oVar2.k, jE, 1))) * f;
                if (Math.abs(fG) < Math.abs(fFloatValue)) {
                    CancellationException cancellationException = new CancellationException("Scroll animation cancelled because scroll was not consumed (" + fG + " < " + fFloatValue + ')');
                    cancellationException.initCause(null);
                    wt3Var.g(cancellationException);
                }
                return tx8Var;
            case 6:
                x44 x44Var2 = (x44) obj4;
                long j = ((zh8) obj3).b;
                rr5 rr5Var = (rr5) obj2;
                hv1 hv1Var = (hv1) obj;
                si8 si8VarD = x44Var2.d();
                if (si8VarD != null) {
                    tm0 tm0VarV = hv1Var.X().v();
                    long j2 = ((zi8) ((s08) x44Var2.A).getValue()).a;
                    long j3 = j;
                    long j4 = ((zi8) ((s08) x44Var2.B).getValue()).a;
                    ri8 ri8Var = si8VarD.a;
                    qi8 qi8Var = ri8Var.a;
                    q95 q95Var = ri8Var.b;
                    jx9 jx9Var = x44Var2.y;
                    long j5 = x44Var2.z;
                    if (!zi8.d(j2)) {
                        jx9Var.p(j5);
                        int iQ = rr5Var.q(zi8.g(j2));
                        int iQ2 = rr5Var.q(zi8.f(j2));
                        if (iQ != iQ2) {
                            tm0VarV.q(ri8Var.h(iQ, iQ2), jx9Var);
                        }
                    } else if (!zi8.d(j4)) {
                        long jB = qi8Var.b.b();
                        zu0 zu0Var = jB != 16 ? new zu0(jB) : null;
                        long j6 = zu0Var != null ? zu0Var.a : zu0.b;
                        jx9Var.p(zu0.b(zu0.d(j6) * 0.2f, j6));
                        int iQ3 = rr5Var.q(zi8.g(j4));
                        int iQ4 = rr5Var.q(zi8.f(j4));
                        if (iQ3 != iQ4) {
                            tm0VarV.q(ri8Var.h(iQ3, iQ4), jx9Var);
                        }
                    } else if (!zi8.d(j3)) {
                        jx9Var.p(j5);
                        int iQ5 = rr5Var.q(zi8.g(j3));
                        int iQ6 = rr5Var.q(zi8.f(j3));
                        if (iQ5 != iQ6) {
                            tm0VarV.q(ri8Var.h(iQ5, iQ6), jx9Var);
                        }
                    }
                    long j7 = ri8Var.c;
                    boolean z = ((((float) ((int) (j7 >> 32))) > q95Var.d ? 1 : (((float) ((int) (j7 >> 32))) == q95Var.d ? 0 : -1)) < 0 || q95Var.c || (((float) ((int) (j7 & 4294967295L))) > q95Var.e ? 1 : (((float) ((int) (j7 & 4294967295L))) == q95Var.e ? 0 : -1)) < 0) && qi8Var.f != 3;
                    if (z) {
                        sy6 sy6VarC = ry7.c(0L, (((long) Float.floatToRawIntBits((int) (j7 & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (j7 >> 32))) << 32));
                        tm0VarV.e();
                        tm0VarV.s(sy6VarC);
                    }
                    c28 c28Var = qi8Var.b.a;
                    qg8 qg8Var = c28Var.m;
                    bi8 bi8Var = c28Var.a;
                    if (qg8Var == null) {
                        qg8Var = qg8.b;
                    }
                    qg8 qg8Var2 = qg8Var;
                    ur7 ur7Var = c28Var.n;
                    if (ur7Var == null) {
                        ur7Var = ur7.d;
                    }
                    ur7 ur7Var2 = ur7Var;
                    iv1 iv1Var = c28Var.p;
                    if (iv1Var == null) {
                        iv1Var = dc2.a;
                    }
                    iv1 iv1Var2 = iv1Var;
                    try {
                        ch0 ch0VarE = bi8Var.e();
                        ai8 ai8Var = ai8.a;
                        try {
                            if (ch0VarE != null) {
                                tm0Var = tm0VarV;
                                q95.j(q95Var, tm0Var, ch0VarE, bi8Var != ai8Var ? bi8Var.a() : 1.0f, ur7Var2, qg8Var2, iv1Var2);
                            } else {
                                tm0Var = tm0VarV;
                                q95.i(q95Var, tm0Var, bi8Var != ai8Var ? bi8Var.b() : zu0.b, ur7Var2, qg8Var2, iv1Var2);
                            }
                            if (z) {
                                tm0Var.o();
                            }
                        } catch (Throwable th) {
                            th = th;
                            r21 = j3;
                            if (z) {
                                r21.o();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        r21 = tm0VarV;
                    }
                }
                return tx8Var;
            case 7:
                Ref$FloatRef ref$FloatRef = (Ref$FloatRef) obj4;
                rk rkVar = (rk) obj;
                float fFloatValue2 = ((Number) ((s08) rkVar.e).getValue()).floatValue() - ref$FloatRef.a;
                float f2 = ((ch7) obj3).f(fFloatValue2);
                ref$FloatRef.a = ((Number) ((s08) rkVar.e).getValue()).floatValue();
                ((Ref$FloatRef) obj2).a = ((Number) rkVar.a.a().invoke(rkVar.f)).floatValue();
                if (Math.abs(fFloatValue2 - f2) > 0.5f) {
                    rkVar.a();
                }
                return tx8Var;
            case 8:
                Context context2 = (Context) obj3;
                mg8 mg8Var = (mg8) obj2;
                b51 b51Var = (b51) obj;
                List list = ((zf8) obj4).a;
                int size = list.size();
                for (int i7 = 0; i7 < size; i7++) {
                    yf8 yf8Var = (yf8) list.get(i7);
                    if (yf8Var instanceof ig8) {
                        ig8 ig8Var = (ig8) yf8Var;
                        b51.b(b51Var, new g8(i, ig8Var), ig8Var.c == 0 ? null : new androidx.compose.runtime.internal.a(-1930700965, new nh1(i6, ig8Var), true), new d(ig8Var, mg8Var, 19), 6);
                    } else if (yf8Var instanceof ng8) {
                        if (Build.VERSION.SDK_INT >= 28) {
                            u96.k(b51Var, context2, (ng8) yf8Var);
                        }
                    } else if (yf8Var instanceof lg8) {
                        b51Var.a.add(br9.c);
                    }
                }
                return tx8Var;
            case 9:
                yu1 yu1Var = (yu1) obj3;
                b96 b96Var = (b96) obj2;
                a96 a96Var = (a96) obj;
                float fD = ((el4) obj4).Q() ? yu1Var.o.d().d(yu1Var.o.h.getValue()) : yu1Var.o.g();
                Orientation orientation = yu1Var.q;
                float f3 = orientation == Orientation.b ? fD : 0.0f;
                if (orientation != Orientation.a) {
                    fD = 0.0f;
                }
                a96Var.a = true;
                a96Var.g(b96Var, ok4.V(f3), ok4.V(fD), 0.0f);
                a96Var.a = false;
                return tx8Var;
            case 10:
                dm2 dm2Var = (dm2) obj4;
                d dVar = (d) obj3;
                ei5 ei5Var = (ei5) obj2;
                g64 g64Var = (g64) obj;
                ArrayList arrayList = dm2Var.g;
                if (arrayList == null || !arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (js3.i(((Pair) it.next()).a, dVar.B)) {
                        }
                    }
                    i5 = 0;
                } else {
                    i5 = 0;
                }
                if (g64Var != null && i5 == 0) {
                    zn2 zn2VarN = dVar.N();
                    zn2VarN.b();
                    i64 i64Var = zn2VarN.e;
                    if (i64Var.d.compareTo(Lifecycle$State.c) >= 0) {
                        i64Var.a((f64) dm2Var.i.invoke(ei5Var));
                    }
                }
                return tx8Var;
            case 11:
                wb5 wb5Var2 = (wb5) obj4;
                ArrayList arrayList2 = (ArrayList) obj3;
                List list2 = (List) obj2;
                a96 a96Var2 = (a96) obj;
                a96Var2.a = true;
                int size2 = arrayList2.size();
                for (int i8 = 0; i8 < size2; i8++) {
                    ((w34) arrayList2.get(i8)).b(a96Var2);
                }
                int size3 = list2.size();
                for (int i9 = 0; i9 < size3; i9++) {
                    ((w34) list2.get(i9)).b(a96Var2);
                }
                a96Var2.a = false;
                wb5Var2.getValue();
                return tx8Var;
            case 12:
                g64 g64Var2 = (g64) obj4;
                wx0 wx0Var = new wx0((Lifecycle$Event) obj3, (wb5) obj2, i2);
                g64Var2.D().a(wx0Var);
                return new qf(g64Var2, wx0Var, i3);
            case 13:
                g64 g64Var3 = (g64) obj4;
                final l64 l64Var = (l64) obj3;
                final dp2 dp2Var2 = (dp2) obj2;
                final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                b64 b64Var = new b64() { // from class: y54
                    @Override // defpackage.b64
                    public final void g(g64 g64Var4, Lifecycle$Event lifecycle$Event) {
                        switch (i5) {
                            case 0:
                                p64 p64Var = (p64) l64Var;
                                int i10 = a64.a[lifecycle$Event.ordinal()];
                                Ref$ObjectRef ref$ObjectRef2 = ref$ObjectRef;
                                if (i10 == 1) {
                                    ref$ObjectRef2.a = dp2Var2.invoke(p64Var);
                                    break;
                                } else if (i10 == 2) {
                                    a9 a9Var = (a9) ref$ObjectRef2.a;
                                    if (a9Var != null) {
                                        a9Var.a();
                                    }
                                    ref$ObjectRef2.a = null;
                                    break;
                                }
                                break;
                            default:
                                l64 l64Var2 = (l64) l64Var;
                                int i11 = a64.a[lifecycle$Event.ordinal()];
                                Ref$ObjectRef ref$ObjectRef3 = ref$ObjectRef;
                                if (i11 == 3) {
                                    ref$ObjectRef3.a = dp2Var2.invoke(l64Var2);
                                    break;
                                } else if (i11 == 4) {
                                    b9 b9Var = (b9) ref$ObjectRef3.a;
                                    if (b9Var != null) {
                                        b9Var.a();
                                    }
                                    ref$ObjectRef3.a = null;
                                    break;
                                }
                                break;
                        }
                    }
                };
                g64Var3.D().a(b64Var);
                return new lj(g64Var3, b64Var, ref$ObjectRef, i5);
            case 14:
                g64 g64Var4 = (g64) obj4;
                final p64 p64Var = (p64) obj3;
                final dp2 dp2Var3 = (dp2) obj2;
                final Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                b64 b64Var2 = new b64() { // from class: y54
                    @Override // defpackage.b64
                    public final void g(g64 g64Var42, Lifecycle$Event lifecycle$Event) {
                        switch (i6) {
                            case 0:
                                p64 p64Var2 = (p64) p64Var;
                                int i10 = a64.a[lifecycle$Event.ordinal()];
                                Ref$ObjectRef ref$ObjectRef22 = ref$ObjectRef2;
                                if (i10 == 1) {
                                    ref$ObjectRef22.a = dp2Var3.invoke(p64Var2);
                                    break;
                                } else if (i10 == 2) {
                                    a9 a9Var = (a9) ref$ObjectRef22.a;
                                    if (a9Var != null) {
                                        a9Var.a();
                                    }
                                    ref$ObjectRef22.a = null;
                                    break;
                                }
                                break;
                            default:
                                l64 l64Var2 = (l64) p64Var;
                                int i11 = a64.a[lifecycle$Event.ordinal()];
                                Ref$ObjectRef ref$ObjectRef3 = ref$ObjectRef2;
                                if (i11 == 3) {
                                    ref$ObjectRef3.a = dp2Var3.invoke(l64Var2);
                                    break;
                                } else if (i11 == 4) {
                                    b9 b9Var = (b9) ref$ObjectRef3.a;
                                    if (b9Var != null) {
                                        b9Var.a();
                                    }
                                    ref$ObjectRef3.a = null;
                                    break;
                                }
                                break;
                        }
                    }
                };
                g64Var4.D().a(b64Var2);
                return new lj(g64Var4, b64Var2, ref$ObjectRef2, i4);
            case 15:
                ArrayList arrayList3 = (ArrayList) obj3;
                String str2 = (String) obj2;
                HomeMovieListDto homeMovieListDto = (HomeMovieListDto) obj;
                js3.p(homeMovieListDto, "movieDto");
                l lVar = ((y05) obj4).g;
                do {
                    value = lVar.getValue();
                } while (!lVar.n(value, b.P((Map) value, b.M(new Pair(str2, homeMovieListDto)))));
                if (homeMovieListDto.getBackgroundImage() != null) {
                    arrayList3.add(0, new MovieHomeMovieData(MovieDto.Companion.getEmpty(), null, null, 14, 0));
                }
                List<MovieDto> movies = homeMovieListDto.getMovies();
                ArrayList arrayList4 = new ArrayList(wu0.V(movies, 10));
                for (MovieDto movieDto : movies) {
                    BackgroundImageDto backgroundImage = homeMovieListDto.getBackgroundImage();
                    String textColor = backgroundImage != null ? backgroundImage.getTextColor() : null;
                    BackgroundImageDto backgroundImage2 = homeMovieListDto.getBackgroundImage();
                    arrayList4.add(new MovieHomeMovieData(movieDto, textColor, backgroundImage2 != null ? backgroundImage2.getSpaceCount() : null, homeMovieListDto.getBackgroundImage() != null ? 2 : 1));
                }
                arrayList3.addAll(arrayList4);
                ArrayList arrayList5 = new ArrayList(wu0.V(arrayList3, 10));
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    bl4.G((MyketRecyclerData) it2.next(), arrayList5);
                }
                return arrayList5;
            case 16:
                g05 g05Var = (g05) obj3;
                s35 s35Var = (s35) obj2;
                Drawable drawable = (Drawable) obj;
                js3.p(drawable, "drawable");
                if (js3.i(((MovieHomeMovieData) obj4).a.getType(), CommonDataKt.MOVIE_TYPE_SERIES)) {
                    SeriesBackground seriesBackground = g05Var.A;
                    seriesBackground.setVisibility(0);
                    seriesBackground.setBackgroundWidth(s35Var.A);
                    seriesBackground.setImageDrawable(drawable);
                }
                return tx8Var;
            case 17:
                lk5 lk5Var = (lk5) obj4;
                cz0 cz0Var = (cz0) obj3;
                ai0 ai0Var = (ai0) obj2;
                if (lk5Var.e == null) {
                    lk5Var.e = cz0Var;
                    ai0.d(ai0Var, cz0Var);
                    return new qf(cz0Var, lk5Var, i);
                }
                throw new IllegalArgumentException(("NavigationEventState '" + lk5Var + "' is already registered with a NavigationEventHandler '" + cz0Var + "'.").toString());
            case 18:
                wy5 wy5Var = (wy5) obj3;
                pd pdVar = (pd) obj2;
                i iVar = (i) obj;
                long j8 = ((ey7) ((MutablePropertyReference0) ((bp2) obj4)).get()).a;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (j8 >> 32));
                if (fIntBitsToFloat > 0.0f) {
                    float fS = iVar.S(gx5.a);
                    vm0 vm0Var = iVar.a;
                    float fA = pdVar.a(ok4.V(fIntBitsToFloat), ok4.V((Float.intBitsToFloat((int) (vm0Var.b.A() >> 32)) - r11) - iVar.S(wy5Var.b(iVar.getLayoutDirection()))), iVar.getLayoutDirection()) + iVar.S(wy5Var.a(iVar.getLayoutDirection()));
                    float f4 = 2;
                    float f5 = fIntBitsToFloat / f4;
                    float f6 = fA + f5;
                    float f7 = (f6 - f5) - fS;
                    float f8 = f7 < 0.0f ? 0.0f : f7;
                    float f9 = f6 + f5 + fS;
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (vm0Var.b.A() >> 32));
                    float f10 = f9 > fIntBitsToFloat2 ? fIntBitsToFloat2 : f9;
                    float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j8 & 4294967295L));
                    float f11 = (-fIntBitsToFloat3) / f4;
                    float f12 = fIntBitsToFloat3 / f4;
                    wv8 wv8Var = vm0Var.b;
                    long jA = wv8Var.A();
                    wv8Var.v().e();
                    try {
                        ((wv8) ((nm5) wv8Var.b).b).v().m(f8, f11, f10, f12, 0);
                        iVar.a();
                    } finally {
                        o40.F(wv8Var, jA);
                    }
                } else {
                    iVar.a();
                }
                return tx8Var;
            case 19:
                cd7 cd7Var = (cd7) obj4;
                id7 id7Var = (id7) obj2;
                rb5 rb5Var = cd7Var.b;
                if (!rb5Var.b(obj3)) {
                    cd7Var.a.remove(obj3);
                    rb5Var.m(obj3, id7Var);
                    return new lj(cd7Var, obj3, id7Var, 4);
                }
                throw new IllegalArgumentException(("Key " + obj3 + " was used multiple times ").toString());
            case 20:
                wx7 wx7Var = (wx7) obj4;
                y45 y45Var = (y45) obj3;
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) obj2;
                ah6 ah6Var = (ah6) obj;
                long j9 = ah6Var.c;
                androidx.compose.foundation.text.selection.f fVar = (androidx.compose.foundation.text.selection.f) wx7Var.c;
                if (fVar.n() && fVar.q().a.b.length() != 0 && (x44Var = fVar.d) != null && x44Var.d() != null) {
                    wx7Var.d(fVar.q(), j9, false, y45Var);
                    i6 = 1;
                }
                if (i6 != 0) {
                    ah6Var.a();
                    ref$BooleanRef.a = true;
                }
                return tx8Var;
            case 21:
                sy0 sy0Var = (sy0) obj2;
                Throwable th3 = (Throwable) obj;
                ((n) obj4).invoke(th3);
                kotlinx.coroutines.channels.a aVar3 = (kotlinx.coroutines.channels.a) ((o77) obj3).c;
                aVar3.p(th3, false);
                while (true) {
                    Object objB = jp0.b(aVar3.i());
                    if (objB == null) {
                        return tx8Var;
                    }
                    sy0Var.invoke(objB, th3);
                }
                break;
            case 22:
                q93 q93Var = (q93) obj3;
                v68 v68Var = (v68) obj2;
                Drawable drawable2 = (Drawable) obj;
                js3.p(drawable2, "drawable");
                if (js3.i(((StreamerMovieData) obj4).a.getType(), CommonDataKt.MOVIE_TYPE_SERIES)) {
                    SeriesBackground seriesBackground2 = q93Var.y;
                    js3.m(seriesBackground2);
                    seriesBackground2.setVisibility(0);
                    seriesBackground2.setBackgroundWidth(v68Var.a.getResources().getDimensionPixelSize(pq6.movie_episode_banner_portrait_width));
                    seriesBackground2.setImageDrawable(drawable2);
                }
                return tx8Var;
            case 23:
                dp2 dp2Var4 = (dp2) obj3;
                ji8 ji8Var = (ji8) ((Ref$ObjectRef) obj2).a;
                zh8 zh8VarL = ((do3) obj4).l((List) obj);
                if (ji8Var != null) {
                    ji8Var.a(null, zh8VarL);
                }
                dp2Var4.invoke(zh8VarL);
                return tx8Var;
            case 24:
                return b(obj);
            default:
                ExoPlayer exoPlayer = (ExoPlayer) obj4;
                View view = (View) obj3;
                js3.p((zp1) obj, "$this$DisposableEffect");
                wp4 wp4Var = new wp4((wb5) obj2, view, exoPlayer, i4);
                ((e62) exoPlayer).m.a(wp4Var);
                ry7.s(view, exoPlayer);
                return new lj(exoPlayer, wp4Var, view, i3);
        }
    }

    public /* synthetic */ vt(androidx.compose.foundation.gestures.b bVar, q qVar, wt3 wt3Var, dh7 dh7Var) {
        this.a = 5;
        this.b = bVar;
        this.c = wt3Var;
        this.d = dh7Var;
    }

    public /* synthetic */ vt(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public /* synthetic */ vt(String str, e71 e71Var, p pVar) {
        this.a = 3;
        this.d = str;
        this.b = e71Var;
        this.c = pVar;
    }

    public /* synthetic */ vt(Ref$FloatRef ref$FloatRef, ch7 ch7Var, Ref$FloatRef ref$FloatRef2, qe1 qe1Var) {
        this.a = 7;
        this.b = ref$FloatRef;
        this.c = ch7Var;
        this.d = ref$FloatRef2;
    }
}
