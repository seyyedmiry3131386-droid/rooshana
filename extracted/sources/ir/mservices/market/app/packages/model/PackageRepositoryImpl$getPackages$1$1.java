package ir.mservices.market.app.packages.model;

import com.google.gson.reflect.TypeToken;
import defpackage.dy3;
import defpackage.f88;
import defpackage.g51;
import defpackage.hl5;
import defpackage.js3;
import defpackage.l99;
import defpackage.n99;
import defpackage.ry5;
import defpackage.sp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.z57;
import ir.mservices.market.app.packages.data.PackageDto;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.packages.model.PackageRepositoryImpl$getPackages$1$1", f = "PackageRepositoryImpl.kt", l = {34}, m = "invokeSuspend", v = 1)
final class PackageRepositoryImpl$getPackages$1$1 extends SuspendLambda implements sp2 {
    public int a;
    public /* synthetic */ int b;
    public /* synthetic */ int c;
    public /* synthetic */ boolean d;
    public final /* synthetic */ String e;
    public final /* synthetic */ hl5 f;
    public final /* synthetic */ String g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PackageRepositoryImpl$getPackages$1$1(g51 g51Var, hl5 hl5Var, Object obj, String str, String str2) {
        super(4, g51Var);
        this.e = str;
        this.f = hl5Var;
        this.g = str2;
        this.h = obj;
    }

    @Override // defpackage.sp2
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        String str = this.g;
        PackageRepositoryImpl$getPackages$1$1 packageRepositoryImpl$getPackages$1$1 = new PackageRepositoryImpl$getPackages$1$1((g51) obj4, this.f, this.h, this.e, str);
        packageRepositoryImpl$getPackages$1$1.b = iIntValue;
        packageRepositoryImpl$getPackages$1$1.c = iIntValue2;
        packageRepositoryImpl$getPackages$1$1.d = zBooleanValue;
        return packageRepositoryImpl$getPackages$1$1.invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.b;
        int i2 = this.c;
        boolean z = this.d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i3 = this.a;
        if (i3 == 0) {
            b.b(obj);
            String str = this.e;
            if (f88.n0(str)) {
                return new l99(PackageDto.Companion.getEmpty());
            }
            ry5 ry5Var = (ry5) this.f.b;
            this.b = i;
            this.c = i2;
            this.d = z;
            this.a = 1;
            ry5Var.getClass();
            LinkedHashMap linkedHashMapO = kotlin.collections.b.O(new Pair("packageKey", str));
            LinkedHashMap linkedHashMapO2 = kotlin.collections.b.O(new Pair("limit", String.valueOf(i)), new Pair("offset", String.valueOf(i2)));
            String str2 = this.g;
            if (str2 != null) {
                if (f88.n0(str2)) {
                    str2 = null;
                }
                if (str2 != null) {
                    linkedHashMapO2.put("refId", str2);
                }
            }
            z57 z57VarCreateRequestUrl = ry5Var.createRequestUrl("v1/applications", "package/{packageKey}", linkedHashMapO, ry5Var.getCommonQueryParam(linkedHashMapO2));
            Type type = new TypeToken<PackageDto>() { // from class: ir.mservices.market.app.packages.service.PackageService$getPackage$4
            }.getType();
            js3.o(type, "getType(...)");
            js3.m(z57VarCreateRequestUrl);
            obj = dy3.v(ry5Var, type, z57VarCreateRequestUrl, this.h, this, 504);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
        }
        n99 n99Var = (n99) obj;
        return n99Var instanceof l99 ? new l99(hl5.e((PackageDto) ((l99) n99Var).a, z)) : n99Var;
    }
}
