package ir.mservices.market.myAccount;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.bt2;
import defpackage.c5;
import defpackage.e71;
import defpackage.g51;
import defpackage.h99;
import defpackage.ja1;
import defpackage.js3;
import defpackage.l99;
import defpackage.lu7;
import defpackage.n99;
import defpackage.pv6;
import defpackage.qp2;
import defpackage.ru7;
import defpackage.rv6;
import defpackage.s71;
import defpackage.t32;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.vb7;
import defpackage.vy2;
import defpackage.wv8;
import defpackage.y97;
import defpackage.z4;
import defpackage.zb2;
import ir.mservices.market.common.ui.recycler.DividerData;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.common.ui.recycler.RecyclerItem;
import ir.mservices.market.myAccount.recycler.MyAccountItemData;
import ir.mservices.market.myAccount.recycler.MyAccountLinkItemData;
import ir.mservices.market.version2.webapi.responsedto.AvatarDto;
import ir.mservices.market.viewModel.c;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public class BaseMyAccountViewModel extends c {
    public final i A;
    public final pv6 B;
    public final l C;
    public final l D;
    public final rv6 E;
    public final l F;
    public final z4 t;
    public final wv8 u;
    public final c5 v;
    public final i w;
    public final pv6 x;
    public final i y;
    public final pv6 z;

    /* JADX INFO: renamed from: ir.mservices.market.myAccount.BaseMyAccountViewModel$onEvent$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.myAccount.BaseMyAccountViewModel$onEvent$1", f = "BaseMyAccountViewModel.kt", l = {274, 283}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public BaseMyAccountViewModel a;
        public String b;
        public Object c;
        public int d;
        public int e;
        public final /* synthetic */ s71 f;
        public final /* synthetic */ BaseMyAccountViewModel g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(s71 s71Var, BaseMyAccountViewModel baseMyAccountViewModel, g51 g51Var) {
            super(2, g51Var);
            this.f = s71Var;
            this.g = baseMyAccountViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return new AnonymousClass1(this.f, this.g, g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            BaseMyAccountViewModel baseMyAccountViewModel;
            String str;
            int i;
            String str2;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            int i2 = this.e;
            if (i2 == 0) {
                b.b(obj);
                String path = this.f.a.getPath();
                if (path != null) {
                    baseMyAccountViewModel = this.g;
                    wv8 wv8Var = baseMyAccountViewModel.u;
                    this.a = baseMyAccountViewModel;
                    this.b = path;
                    this.d = 0;
                    this.e = 1;
                    Object objU = wv8Var.U(path, null, this);
                    if (objU != coroutineSingletons) {
                        str = path;
                        obj = objU;
                        i = 0;
                    }
                    return coroutineSingletons;
                }
                return tx8.a;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str2 = this.b;
                baseMyAccountViewModel = this.a;
                b.b(obj);
                baseMyAccountViewModel.s(false);
                zb2.f(new File(str2).getParentFile());
                return tx8.a;
            }
            int i3 = this.d;
            str = this.b;
            BaseMyAccountViewModel baseMyAccountViewModel2 = this.a;
            b.b(obj);
            i = i3;
            baseMyAccountViewModel = baseMyAccountViewModel2;
            n99 n99Var = (n99) obj;
            if (n99Var instanceof l99) {
                baseMyAccountViewModel.v.h.j(((AvatarDto) ((l99) n99Var).a).getAvatarUrl());
                baseMyAccountViewModel.s(false);
                zb2.f(new File(str).getParentFile());
            } else if (n99Var instanceof h99) {
                i iVar = baseMyAccountViewModel.y;
                String translatedMessage = ((h99) n99Var).a.getTranslatedMessage();
                if (translatedMessage == null) {
                    translatedMessage = "";
                }
                this.a = baseMyAccountViewModel;
                this.b = str;
                this.c = obj;
                this.d = i;
                this.e = 2;
                if (iVar.emit(translatedMessage, this) != coroutineSingletons) {
                    str2 = str;
                    baseMyAccountViewModel.s(false);
                    zb2.f(new File(str2).getParentFile());
                }
                return coroutineSingletons;
            }
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseMyAccountViewModel(z4 z4Var, wv8 wv8Var, c5 c5Var) {
        super(true);
        js3.p(c5Var, "accountManager");
        this.t = z4Var;
        this.u = wv8Var;
        this.v = c5Var;
        i iVarE = vy2.e(0, 7, null);
        this.w = iVarE;
        this.x = new pv6(iVarE);
        i iVarE2 = vy2.e(0, 7, null);
        this.y = iVarE2;
        this.z = new pv6(iVarE2);
        i iVarE3 = vy2.e(0, 7, null);
        this.A = iVarE3;
        this.B = new pv6(iVarE3);
        this.C = ja1.b(new LinkedHashMap());
        l lVarB = ja1.b(Boolean.FALSE);
        this.D = lVarB;
        this.E = new rv6(lVarB);
        this.F = ja1.b(kotlin.collections.b.I());
        t32.b().l(this, false);
    }

    @Override // ir.mservices.market.viewModel.c, defpackage.k79
    public final void d() {
        super.d();
        t32.b().o(this);
    }

    @Override // ir.mservices.market.viewModel.c
    public final void e() {
        p(new BaseMyAccountViewModel$doRequest$1(this, null));
    }

    public final void onEvent(s71 s71Var) {
        js3.p(s71Var, "event");
        s(true);
        if (!s71Var.b || s71Var.a == null) {
            return;
        }
        bt2.G(y97.G(this), null, null, new AnonymousClass1(s71Var, this, null), 3);
    }

    public final rv6 r(MyAccountItemsType myAccountItemsType) {
        return d.A(new vb7(new BaseMyAccountViewModel$getItemValueFlow$$inlined$transform$1(this.C, null, myAccountItemsType)), y97.G(this), ru7.b, new Pair(MyAccountItemsType.d, ""));
    }

    public final void s(boolean z) {
        bt2.G(y97.G(this), null, null, new BaseMyAccountViewModel$updateAvatar$1(this, z, null), 3);
    }

    public final RecyclerItem setDivider(RecyclerItem recyclerItem, RecyclerItem recyclerItem2) {
        if (recyclerItem != null && recyclerItem2 != null) {
            MyketRecyclerData myketRecyclerData = recyclerItem2.c;
            MyketRecyclerData myketRecyclerData2 = recyclerItem.c;
            if (myketRecyclerData2 instanceof MyAccountItemData) {
                if (!(myketRecyclerData instanceof MyAccountItemData)) {
                    return null;
                }
                DividerData dividerData = new DividerData();
                dividerData.b = false;
                return new RecyclerItem(dividerData);
            }
            if ((myketRecyclerData2 instanceof MyAccountLinkItemData) && (myketRecyclerData instanceof MyAccountLinkItemData)) {
                DividerData dividerData2 = new DividerData();
                dividerData2.b = false;
                return new RecyclerItem(dividerData2);
            }
        }
        return null;
    }

    public final void t(Pair pair) {
        l lVar;
        Object value;
        l lVar2;
        Object value2;
        Object obj = pair.b;
        do {
            lVar = this.D;
            value = lVar.getValue();
            ((Boolean) value).getClass();
        } while (!lVar.n(value, Boolean.TRUE));
        do {
            lVar2 = this.C;
            value2 = lVar2.getValue();
        } while (!lVar2.n(value2, kotlin.collections.b.P((Map) value2, kotlin.collections.b.M(pair))));
        int iOrdinal = ((MyAccountItemsType) pair.a).ordinal();
        c5 c5Var = this.v;
        if (iOrdinal == 1) {
            z4 z4Var = c5Var.h;
            String str = (String) obj;
            z4Var.c = str;
            z4Var.i(str, lu7.i, false);
            return;
        }
        if (iOrdinal != 2) {
            return;
        }
        z4 z4Var2 = c5Var.h;
        String str2 = (String) obj;
        z4Var2.d = str2;
        z4Var2.i(str2, lu7.l, true);
    }

    public final void u(MyAccountItemsType myAccountItemsType, String str, Object obj) {
        js3.p(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        bt2.G(y97.G(this), null, null, new BaseMyAccountViewModel$uploadInfo$1(this, myAccountItemsType, str, obj, null), 3);
    }
}
