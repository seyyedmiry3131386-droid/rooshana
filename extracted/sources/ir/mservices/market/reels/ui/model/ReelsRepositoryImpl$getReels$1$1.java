package ir.mservices.market.reels.ui.model;

import com.google.gson.reflect.TypeToken;
import com.j256.ormlite.stmt.query.SimpleComparison;
import defpackage.dy3;
import defpackage.f88;
import defpackage.g51;
import defpackage.js3;
import defpackage.sp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.ut4;
import defpackage.v17;
import defpackage.z57;
import ir.mservices.market.reels.data.ReelsDto;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.reels.ui.model.ReelsRepositoryImpl$getReels$1$1", f = "ReelsRepositoryImpl.kt", l = {30}, m = "invokeSuspend", v = 1)
final class ReelsRepositoryImpl$getReels$1$1 extends SuspendLambda implements sp2 {
    public int a;
    public /* synthetic */ int b;
    public /* synthetic */ int c;
    public final /* synthetic */ ut4 d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Map f;
    public final /* synthetic */ String g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReelsRepositoryImpl$getReels$1$1(ut4 ut4Var, Object obj, Map map, String str, g51 g51Var) {
        super(4, g51Var);
        this.d = ut4Var;
        this.e = obj;
        this.f = map;
        this.g = str;
    }

    @Override // defpackage.sp2
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        ((Boolean) obj3).booleanValue();
        Map map = this.f;
        String str = this.g;
        ReelsRepositoryImpl$getReels$1$1 reelsRepositoryImpl$getReels$1$1 = new ReelsRepositoryImpl$getReels$1$1(this.d, this.e, map, str, (g51) obj4);
        reelsRepositoryImpl$getReels$1$1.b = iIntValue;
        reelsRepositoryImpl$getReels$1$1.c = iIntValue2;
        return reelsRepositoryImpl$getReels$1$1.invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Map mapI;
        int i = this.b;
        int i2 = this.c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i3 = this.a;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
            return obj;
        }
        b.b(obj);
        v17 v17Var = (v17) this.d.b;
        int i4 = (i2 / i) + 1;
        this.b = i;
        this.c = i2;
        this.a = 1;
        v17Var.getClass();
        Map mapI2 = this.f;
        if (mapI2 == null) {
            mapI2 = kotlin.collections.b.I();
        }
        LinkedHashMap linkedHashMapP = kotlin.collections.b.P(mapI2, kotlin.collections.b.M(new Pair("page", String.valueOf(i4))));
        String str = this.g;
        if (str != null) {
            List listY0 = f88.y0(str, new String[]{"&"}, 6);
            ArrayList arrayList = new ArrayList();
            Iterator it = listY0.iterator();
            while (it.hasNext()) {
                List listY02 = f88.y0((String) it.next(), new String[]{SimpleComparison.EQUAL_TO_OPERATION}, 2);
                if (listY02.size() != 2) {
                    listY02 = null;
                }
                Pair pair = listY02 != null ? new Pair(listY02.get(0), listY02.get(1)) : null;
                if (pair != null) {
                    arrayList.add(pair);
                }
            }
            mapI = kotlin.collections.b.S(arrayList);
        } else {
            mapI = kotlin.collections.b.I();
        }
        z57 z57VarCreateRequestUrl = v17Var.createRequestUrl("reel-api", "v2/reel/recomm", null, v17Var.getCommonQueryParam(kotlin.collections.b.U(kotlin.collections.b.P(linkedHashMapP, mapI))), false);
        Type type = new TypeToken<ReelsDto>() { // from class: ir.mservices.market.reels.services.ReelsService$getReels$2
        }.getType();
        js3.o(type, "getType(...)");
        js3.m(z57VarCreateRequestUrl);
        Object objV = dy3.v(v17Var, type, z57VarCreateRequestUrl, this.e, this, 504);
        return objV == coroutineSingletons ? coroutineSingletons : objV;
    }
}
