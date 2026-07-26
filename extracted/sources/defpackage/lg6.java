package defpackage;

import ir.myket.movie.common.domain.models.AdInfo;
import ir.myket.player.viewmodel.e;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: loaded from: classes3.dex */
public final class lg6 implements xe2 {
    public final /* synthetic */ xe2 a;
    public final /* synthetic */ e b;
    public final /* synthetic */ AdInfo c;
    public final /* synthetic */ String d;

    public lg6(xe2 xe2Var, e eVar, AdInfo adInfo, String str) {
        this.a = xe2Var;
        this.b = eVar;
        this.c = adInfo;
        this.d = str;
    }

    @Override // defpackage.xe2
    public final Object a(ze2 ze2Var, g51 g51Var) {
        Object objA = this.a.a(new a61(ze2Var, this.b, this.c, this.d, 2), g51Var);
        return objA == CoroutineSingletons.a ? objA : tx8.a;
    }
}
