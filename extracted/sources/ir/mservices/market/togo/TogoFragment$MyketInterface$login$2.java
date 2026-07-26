package ir.mservices.market.togo;

import androidx.fragment.app.FragmentActivity;
import defpackage.g51;
import defpackage.is3;
import defpackage.js3;
import defpackage.pk5;
import defpackage.qp2;
import defpackage.rs6;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.wd4;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.login.data.LoginData;
import ir.mservices.market.login.data.PhoneBindData;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.togo.TogoFragment$MyketInterface$login$2", f = "TogoFragment.kt", l = {}, m = "invokeSuspend", v = 1)
public final class TogoFragment$MyketInterface$login$2 extends SuspendLambda implements qp2 {
    public final /* synthetic */ TogoFragment a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ String g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TogoFragment$MyketInterface$login$2(TogoFragment togoFragment, String str, String str2, String str3, String str4, String str5, String str6, g51 g51Var) {
        super(2, g51Var);
        this.a = togoFragment;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new TogoFragment$MyketInterface$login$2(this.a, this.b, this.c, this.d, this.e, this.f, this.g, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        TogoFragment$MyketInterface$login$2 togoFragment$MyketInterface$login$2 = (TogoFragment$MyketInterface$login$2) create((FragmentActivity) obj, (g51) obj2);
        tx8 tx8Var = tx8.a;
        togoFragment$MyketInterface$login$2.invokeSuspend(tx8Var);
        return tx8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        kotlin.b.b(obj);
        int i = TogoFragment.o1;
        TogoFragment togoFragment = this.a;
        DialogDataModel dialogDataModel = new DialogDataModel(togoFragment.m1(), "DIALOG_KEY_LOGIN_TOGO", is3.g(new Pair("BUNDLE_KEY_SUCCESS_CALLBACK", this.b), new Pair("BUNDLE_KEY_ERROR_CALLBACK", this.c)), 8);
        PhoneBindData phoneBindData = new PhoneBindData("");
        String strL = togoFragment.L(rs6.login_label_togo);
        js3.o(strL, "getString(...)");
        pk5.g(togoFragment.J0, new NavIntentDirections.Login(new wd4(dialogDataModel, new LoginData(phoneBindData, this.d, strL, this.e, this.f, this.g, (String) null, 960))), -1);
        return tx8.a;
    }
}
