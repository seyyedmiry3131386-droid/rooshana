package ir.mservices.market.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import defpackage.dk3;
import defpackage.fv;
import defpackage.js3;
import defpackage.lw;
import defpackage.sp2;
import defpackage.vp7;
import ir.mservices.market.receivers.InAppBillingReceiver;

/* JADX INFO: loaded from: classes3.dex */
public final class InAppBillingReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int c = 0;
    public vp7 a;
    public vp7 b;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(final Context context, final Intent intent) {
        Throwable th;
        js3.p(context, "context");
        js3.p(intent, "intent");
        String action = intent.getAction();
        if (action == null) {
            lw.g(null, "IabReceiver, onReceive(), intent extra is null", null);
            return;
        }
        this.a = new vp7(3);
        this.b = new vp7("IabReceiver", "RECEIVER");
        switch (action.hashCode()) {
            case -1663300066:
                th = null;
                if (action.equals("ir.mservices.market.billingSupport")) {
                    int intExtra = intent.getIntExtra("apiVersion", 0);
                    String stringExtra = intent.getStringExtra("packageName");
                    if (this.a == null) {
                        js3.V("iab");
                        throw null;
                    }
                    int iC0 = vp7.c0(intExtra, stringExtra, "inapp");
                    if (this.a == null) {
                        js3.V("iab");
                        throw null;
                    }
                    int iC02 = vp7.c0(intExtra, stringExtra, "subs");
                    vp7 vp7Var = this.b;
                    if (vp7Var == null) {
                        js3.V("paymentLogger");
                        throw null;
                    }
                    vp7Var.p0(intExtra, iC0, stringExtra, "inapp", "billing-support-error");
                    Bundle bundle = new Bundle();
                    bundle.putString("secure", intent.getStringExtra("secure"));
                    bundle.putBoolean("subscriptionSupport", iC02 == 0);
                    bundle.putInt("RESPONSE_CODE", iC0);
                    context.sendBroadcast(fv.i(stringExtra, "ir.mservices.market.billingSupport", bundle));
                    return;
                }
                lw.g(th, "IabReceiver, onReceive() with an unknown action, action=".concat(action), th);
                return;
            case -1226633781:
                th = null;
                if (action.equals("ir.mservices.market.purchase")) {
                    int intExtra2 = intent.getIntExtra("apiVersion", 0);
                    String stringExtra2 = intent.getStringExtra("packageName");
                    String stringExtra3 = intent.getStringExtra("itemType");
                    String stringExtra4 = intent.getStringExtra("sku");
                    String stringExtra5 = intent.getStringExtra("developerPayload");
                    vp7 vp7Var2 = this.a;
                    if (vp7Var2 == null) {
                        js3.V("iab");
                        throw null;
                    }
                    Bundle bundleN = vp7Var2.N(intExtra2, stringExtra2, stringExtra4, stringExtra3, stringExtra5);
                    bundleN.putString("secure", intent.getStringExtra("secure"));
                    vp7 vp7Var3 = this.b;
                    if (vp7Var3 == null) {
                        js3.V("paymentLogger");
                        throw null;
                    }
                    String string = bundleN.getString("RESPONSE_MESSAGE", "no-message");
                    js3.o(string, "getString(...)");
                    vp7Var3.m0(intExtra2, stringExtra2, stringExtra4, stringExtra3, stringExtra5, bundleN, string);
                    bundleN.remove("RESPONSE_MESSAGE");
                    context.sendBroadcast(fv.i(stringExtra2, "ir.mservices.market.purchase", bundleN));
                    return;
                }
                lw.g(th, "IabReceiver, onReceive() with an unknown action, action=".concat(action), th);
                return;
            case -816414916:
                th = null;
                if (action.equals("ir.mservices.market.ping")) {
                    String stringExtra6 = intent.getStringExtra("packageName");
                    if (this.b == null) {
                        js3.V("paymentLogger");
                        throw null;
                    }
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("secure", intent.getStringExtra("secure"));
                    context.sendBroadcast(fv.i(stringExtra6, "ir.mservices.market.ping", bundle2));
                    return;
                }
                lw.g(th, "IabReceiver, onReceive() with an unknown action, action=".concat(action), th);
                return;
            case 1026213956:
                th = null;
                if (action.equals("ir.mservices.market.skuDetail")) {
                    final int intExtra3 = intent.getIntExtra("apiVersion", 0);
                    final String stringExtra7 = intent.getStringExtra("packageName");
                    final String stringExtra8 = intent.getStringExtra("itemType");
                    final Bundle bundle3 = new Bundle();
                    bundle3.putStringArrayList("ITEM_ID_LIST", intent.getStringArrayListExtra("ITEM_ID_LIST"));
                    vp7 vp7Var4 = this.a;
                    if (vp7Var4 == null) {
                        js3.V("iab");
                        throw null;
                    }
                    final int i = 1;
                    vp7Var4.Y(intExtra3, stringExtra7, stringExtra8, bundle3, new sp2() { // from class: gk3
                        @Override // defpackage.sp2
                        public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                            int i2 = i;
                            tx8 tx8Var = tx8.a;
                            Object obj5 = bundle3;
                            InAppBillingReceiver inAppBillingReceiver = this;
                            Context context2 = context;
                            Intent intent2 = intent;
                            switch (i2) {
                                case 0:
                                    String str = (String) obj5;
                                    Bundle bundle4 = (Bundle) obj;
                                    String str2 = (String) obj2;
                                    String str3 = (String) obj3;
                                    String str4 = (String) obj4;
                                    int i3 = InAppBillingReceiver.c;
                                    js3.p(bundle4, "it");
                                    js3.p(str2, "suffix");
                                    js3.p(str3, "message");
                                    js3.p(str4, "host");
                                    bundle4.putString("secure", intent2.getStringExtra("secure"));
                                    String str5 = stringExtra7;
                                    context2.sendBroadcast(fv.i(str5, "ir.mservices.market.getPurchase", bundle4));
                                    vp7 vp7Var5 = inAppBillingReceiver.b;
                                    if (vp7Var5 != null) {
                                        vp7Var5.n0(str2, intExtra3, str5, stringExtra8, str, bundle4, str3, str4);
                                        return tx8Var;
                                    }
                                    js3.V("paymentLogger");
                                    throw null;
                                default:
                                    Bundle bundle5 = (Bundle) obj5;
                                    Bundle bundle6 = (Bundle) obj;
                                    String str6 = (String) obj2;
                                    String str7 = (String) obj3;
                                    String str8 = (String) obj4;
                                    int i4 = InAppBillingReceiver.c;
                                    js3.p(bundle6, "it");
                                    js3.p(str6, "suffix");
                                    js3.p(str7, "message");
                                    js3.p(str8, "host");
                                    bundle6.putString("secure", intent2.getStringExtra("secure"));
                                    String str9 = stringExtra7;
                                    context2.sendBroadcast(fv.i(str9, "ir.mservices.market.skuDetail", bundle6));
                                    vp7 vp7Var6 = inAppBillingReceiver.b;
                                    if (vp7Var6 != null) {
                                        vp7Var6.o0(str6, intExtra3, str9, stringExtra8, bundle5, bundle6, str7, str8);
                                        return tx8Var;
                                    }
                                    js3.V("paymentLogger");
                                    throw null;
                            }
                        }
                    });
                    return;
                }
                lw.g(th, "IabReceiver, onReceive() with an unknown action, action=".concat(action), th);
                return;
            case 2102637042:
                th = null;
                if (action.equals("ir.mservices.market.consume")) {
                    int intExtra4 = intent.getIntExtra("apiVersion", 0);
                    String stringExtra9 = intent.getStringExtra("packageName");
                    String stringExtra10 = intent.getStringExtra("token");
                    vp7 vp7Var5 = this.a;
                    if (vp7Var5 != null) {
                        vp7Var5.w(intExtra4, stringExtra9, stringExtra10, new dk3(stringExtra9, context, this, intExtra4, stringExtra10, intent));
                        return;
                    } else {
                        js3.V("iab");
                        throw null;
                    }
                }
                lw.g(th, "IabReceiver, onReceive() with an unknown action, action=".concat(action), th);
                return;
            case 2122845549:
                if (action.equals("ir.mservices.market.getPurchase")) {
                    final int intExtra5 = intent.getIntExtra("apiVersion", 0);
                    final String stringExtra11 = intent.getStringExtra("packageName");
                    final String stringExtra12 = intent.getStringExtra("itemType");
                    final String stringExtra13 = intent.getStringExtra("token");
                    vp7 vp7Var6 = this.a;
                    if (vp7Var6 == null) {
                        js3.V("iab");
                        throw null;
                    }
                    final int i2 = 0;
                    vp7Var6.W(intExtra5, stringExtra11, stringExtra12, new sp2() { // from class: gk3
                        @Override // defpackage.sp2
                        public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                            int i22 = i2;
                            tx8 tx8Var = tx8.a;
                            Object obj5 = stringExtra13;
                            InAppBillingReceiver inAppBillingReceiver = this;
                            Context context2 = context;
                            Intent intent2 = intent;
                            switch (i22) {
                                case 0:
                                    String str = (String) obj5;
                                    Bundle bundle4 = (Bundle) obj;
                                    String str2 = (String) obj2;
                                    String str3 = (String) obj3;
                                    String str4 = (String) obj4;
                                    int i3 = InAppBillingReceiver.c;
                                    js3.p(bundle4, "it");
                                    js3.p(str2, "suffix");
                                    js3.p(str3, "message");
                                    js3.p(str4, "host");
                                    bundle4.putString("secure", intent2.getStringExtra("secure"));
                                    String str5 = stringExtra11;
                                    context2.sendBroadcast(fv.i(str5, "ir.mservices.market.getPurchase", bundle4));
                                    vp7 vp7Var52 = inAppBillingReceiver.b;
                                    if (vp7Var52 != null) {
                                        vp7Var52.n0(str2, intExtra5, str5, stringExtra12, str, bundle4, str3, str4);
                                        return tx8Var;
                                    }
                                    js3.V("paymentLogger");
                                    throw null;
                                default:
                                    Bundle bundle5 = (Bundle) obj5;
                                    Bundle bundle6 = (Bundle) obj;
                                    String str6 = (String) obj2;
                                    String str7 = (String) obj3;
                                    String str8 = (String) obj4;
                                    int i4 = InAppBillingReceiver.c;
                                    js3.p(bundle6, "it");
                                    js3.p(str6, "suffix");
                                    js3.p(str7, "message");
                                    js3.p(str8, "host");
                                    bundle6.putString("secure", intent2.getStringExtra("secure"));
                                    String str9 = stringExtra11;
                                    context2.sendBroadcast(fv.i(str9, "ir.mservices.market.skuDetail", bundle6));
                                    vp7 vp7Var62 = inAppBillingReceiver.b;
                                    if (vp7Var62 != null) {
                                        vp7Var62.o0(str6, intExtra5, str9, stringExtra12, bundle5, bundle6, str7, str8);
                                        return tx8Var;
                                    }
                                    js3.V("paymentLogger");
                                    throw null;
                            }
                        }
                    });
                    return;
                }
            default:
                th = null;
                lw.g(th, "IabReceiver, onReceive() with an unknown action, action=".concat(action), th);
                return;
        }
    }
}
