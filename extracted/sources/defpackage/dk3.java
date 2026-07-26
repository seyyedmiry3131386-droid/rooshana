package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import ir.mservices.market.receivers.InAppBillingReceiver;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class dk3 implements sp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ Object g;

    public /* synthetic */ dk3(t0 t0Var, fk3 fk3Var, int i, String str, String str2, Object obj, int i2) {
        this.a = i2;
        this.b = t0Var;
        this.c = fk3Var;
        this.d = i;
        this.e = str;
        this.f = str2;
        this.g = obj;
    }

    @Override // defpackage.sp2
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.a;
        tx8 tx8Var = tx8.a;
        Object obj5 = this.g;
        Object obj6 = this.c;
        Object obj7 = this.b;
        switch (i) {
            case 0:
                String str = (String) obj5;
                Bundle bundle = (Bundle) obj;
                String str2 = (String) obj2;
                String str3 = (String) obj3;
                String str4 = (String) obj4;
                js3.p(bundle, "it");
                js3.p(str2, "suffix");
                js3.p(str3, "message");
                js3.p(str4, "host");
                ((t0) obj7).D(bundle);
                ((fk3) obj6).o.n0(str2, this.d, this.e, this.f, str, bundle, str3, str4);
                return tx8Var;
            case 1:
                Bundle bundle2 = (Bundle) obj5;
                Bundle bundle3 = (Bundle) obj;
                String str5 = (String) obj2;
                String str6 = (String) obj3;
                String str7 = (String) obj4;
                js3.p(bundle3, "it");
                js3.p(str5, "suffix");
                js3.p(str6, "message");
                js3.p(str7, "host");
                ((t0) obj7).D(bundle3);
                ((fk3) obj6).o.o0(str5, this.d, this.e, this.f, bundle2, bundle3, str6, str7);
                return tx8Var;
            default:
                int iIntValue = ((Integer) obj).intValue();
                String str8 = (String) obj2;
                String str9 = (String) obj3;
                String str10 = (String) obj4;
                int i2 = InAppBillingReceiver.c;
                js3.p(str8, "suffix");
                js3.p(str9, "message");
                js3.p(str10, "host");
                Bundle bundle4 = new Bundle();
                bundle4.putString("secure", ((Intent) obj5).getStringExtra("secure"));
                bundle4.putInt("RESPONSE_CODE", iIntValue);
                String str11 = this.e;
                ((Context) obj7).sendBroadcast(fv.i(str11, "ir.mservices.market.consume", bundle4));
                vp7 vp7Var = ((InAppBillingReceiver) obj6).b;
                if (vp7Var != null) {
                    vp7Var.k0(this.d, iIntValue, str8, str11, this.f, str9, str10);
                    return tx8Var;
                }
                js3.V("paymentLogger");
                throw null;
        }
    }

    public /* synthetic */ dk3(String str, Context context, InAppBillingReceiver inAppBillingReceiver, int i, String str2, Intent intent) {
        this.a = 2;
        this.e = str;
        this.b = context;
        this.c = inAppBillingReceiver;
        this.d = i;
        this.f = str2;
        this.g = intent;
    }
}
