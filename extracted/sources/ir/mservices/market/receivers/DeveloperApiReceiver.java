package ir.mservices.market.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import defpackage.cv;
import defpackage.dp2;
import defpackage.js3;
import defpackage.lw;
import defpackage.vp7;
import ir.mservices.market.receivers.DeveloperApiReceiver;

/* JADX INFO: loaded from: classes3.dex */
public final class DeveloperApiReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int b = 0;
    public vp7 a;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(final Context context, final Intent intent) {
        js3.p(context, "context");
        js3.p(intent, "intent");
        String action = intent.getAction();
        if (action == null) {
            lw.g(null, "DeveloperApiReceiver, onReceive(), intent extra is null", null);
            return;
        }
        this.a = new vp7(22);
        switch (action.hashCode()) {
            case -1570255406:
                if (action.equals("ir.mservices.market.developerPing")) {
                    String stringExtra = intent.getStringExtra("PACKAGE_NAME");
                    Bundle bundle = new Bundle();
                    bundle.putString("SECURE", intent.getStringExtra("SECURE"));
                    context.sendBroadcast(cv.o(stringExtra, "ir.mservices.market.developerPing", bundle));
                    return;
                }
                break;
            case -1469016945:
                if (action.equals("ir.mservices.market.getAccountInfo")) {
                    int intExtra = intent.getIntExtra("MINIMUM_API_VERSION", 0);
                    String stringExtra2 = intent.getStringExtra("PACKAGE_NAME");
                    vp7 vp7Var = this.a;
                    if (vp7Var == null) {
                        js3.V("api");
                        throw null;
                    }
                    Bundle bundleH = vp7Var.H(intExtra);
                    bundleH.putString("SECURE", intent.getStringExtra("SECURE"));
                    context.sendBroadcast(cv.o(stringExtra2, "ir.mservices.market.getAccountInfo", bundleH));
                    return;
                }
                break;
            case -1124839814:
                if (action.equals("ir.mservices.market.loadData")) {
                    int intExtra2 = intent.getIntExtra("MINIMUM_API_VERSION", 0);
                    final String stringExtra3 = intent.getStringExtra("PACKAGE_NAME");
                    vp7 vp7Var2 = this.a;
                    if (vp7Var2 == null) {
                        js3.V("api");
                        throw null;
                    }
                    final int i = 1;
                    vp7Var2.i0(intExtra2, stringExtra3, new dp2() { // from class: wk1
                        @Override // defpackage.dp2
                        public final Object invoke(Object obj) {
                            int i2 = i;
                            tx8 tx8Var = tx8.a;
                            Intent intent2 = intent;
                            Context context2 = context;
                            String str = stringExtra3;
                            Bundle bundle2 = (Bundle) obj;
                            switch (i2) {
                                case 0:
                                    int i3 = DeveloperApiReceiver.b;
                                    js3.p(bundle2, "it");
                                    bundle2.putString("SECURE", intent2.getStringExtra("SECURE"));
                                    context2.sendBroadcast(cv.o(str, "ir.mservices.market.getAppUpdate", bundle2));
                                    break;
                                case 1:
                                    int i4 = DeveloperApiReceiver.b;
                                    js3.p(bundle2, "it");
                                    bundle2.putString("SECURE", intent2.getStringExtra("SECURE"));
                                    context2.sendBroadcast(cv.o(str, "ir.mservices.market.loadData", bundle2));
                                    break;
                                default:
                                    int i5 = DeveloperApiReceiver.b;
                                    js3.p(bundle2, "it");
                                    bundle2.putString("SECURE", intent2.getStringExtra("SECURE"));
                                    context2.sendBroadcast(cv.o(str, "ir.mservices.market.saveData", bundle2));
                                    break;
                            }
                            return tx8Var;
                        }
                    });
                    return;
                }
                break;
            case -748083311:
                if (action.equals("ir.mservices.market.saveData")) {
                    int intExtra3 = intent.getIntExtra("MINIMUM_API_VERSION", 0);
                    final String stringExtra4 = intent.getStringExtra("PACKAGE_NAME");
                    String stringExtra5 = intent.getStringExtra("PAYLOAD");
                    vp7 vp7Var3 = this.a;
                    if (vp7Var3 == null) {
                        js3.V("api");
                        throw null;
                    }
                    final int i2 = 2;
                    vp7Var3.x0(intExtra3, new dp2() { // from class: wk1
                        @Override // defpackage.dp2
                        public final Object invoke(Object obj) {
                            int i22 = i2;
                            tx8 tx8Var = tx8.a;
                            Intent intent2 = intent;
                            Context context2 = context;
                            String str = stringExtra4;
                            Bundle bundle2 = (Bundle) obj;
                            switch (i22) {
                                case 0:
                                    int i3 = DeveloperApiReceiver.b;
                                    js3.p(bundle2, "it");
                                    bundle2.putString("SECURE", intent2.getStringExtra("SECURE"));
                                    context2.sendBroadcast(cv.o(str, "ir.mservices.market.getAppUpdate", bundle2));
                                    break;
                                case 1:
                                    int i4 = DeveloperApiReceiver.b;
                                    js3.p(bundle2, "it");
                                    bundle2.putString("SECURE", intent2.getStringExtra("SECURE"));
                                    context2.sendBroadcast(cv.o(str, "ir.mservices.market.loadData", bundle2));
                                    break;
                                default:
                                    int i5 = DeveloperApiReceiver.b;
                                    js3.p(bundle2, "it");
                                    bundle2.putString("SECURE", intent2.getStringExtra("SECURE"));
                                    context2.sendBroadcast(cv.o(str, "ir.mservices.market.saveData", bundle2));
                                    break;
                            }
                            return tx8Var;
                        }
                    }, stringExtra4, stringExtra5);
                    return;
                }
                break;
            case -198129846:
                if (action.equals("ir.mservices.market.isUserLogin")) {
                    int intExtra4 = intent.getIntExtra("MINIMUM_API_VERSION", 0);
                    String stringExtra6 = intent.getStringExtra("PACKAGE_NAME");
                    vp7 vp7Var4 = this.a;
                    if (vp7Var4 == null) {
                        js3.V("api");
                        throw null;
                    }
                    int i3 = intExtra4 <= 3 ? vp7Var4.I().d() ? 4 : 5 : 1;
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("SECURE", intent.getStringExtra("SECURE"));
                    bundle2.putInt("RESPONSE_CODE", i3);
                    context.sendBroadcast(cv.o(stringExtra6, "ir.mservices.market.isUserLogin", bundle2));
                    return;
                }
                break;
            case 18306927:
                if (action.equals("ir.mservices.market.developerSupport")) {
                    int intExtra5 = intent.getIntExtra("MINIMUM_API_VERSION", 0);
                    String stringExtra7 = intent.getStringExtra("PACKAGE_NAME");
                    if (this.a == null) {
                        js3.V("api");
                        throw null;
                    }
                    int i4 = intExtra5 <= 3 ? 1 : 0;
                    Bundle bundle3 = new Bundle();
                    bundle3.putString("SECURE", intent.getStringExtra("SECURE"));
                    bundle3.putInt("RESPONSE_CODE", i4 ^ 1);
                    context.sendBroadcast(cv.o(stringExtra7, "ir.mservices.market.developerSupport", bundle3));
                    return;
                }
                break;
            case 433243998:
                if (action.equals("ir.mservices.market.getAppUpdate")) {
                    int intExtra6 = intent.getIntExtra("MINIMUM_API_VERSION", 0);
                    final String stringExtra8 = intent.getStringExtra("PACKAGE_NAME");
                    vp7 vp7Var5 = this.a;
                    if (vp7Var5 == null) {
                        js3.V("api");
                        throw null;
                    }
                    final int i5 = 0;
                    vp7Var5.L(intExtra6, stringExtra8, new dp2() { // from class: wk1
                        @Override // defpackage.dp2
                        public final Object invoke(Object obj) {
                            int i22 = i5;
                            tx8 tx8Var = tx8.a;
                            Intent intent2 = intent;
                            Context context2 = context;
                            String str = stringExtra8;
                            Bundle bundle22 = (Bundle) obj;
                            switch (i22) {
                                case 0:
                                    int i32 = DeveloperApiReceiver.b;
                                    js3.p(bundle22, "it");
                                    bundle22.putString("SECURE", intent2.getStringExtra("SECURE"));
                                    context2.sendBroadcast(cv.o(str, "ir.mservices.market.getAppUpdate", bundle22));
                                    break;
                                case 1:
                                    int i42 = DeveloperApiReceiver.b;
                                    js3.p(bundle22, "it");
                                    bundle22.putString("SECURE", intent2.getStringExtra("SECURE"));
                                    context2.sendBroadcast(cv.o(str, "ir.mservices.market.loadData", bundle22));
                                    break;
                                default:
                                    int i52 = DeveloperApiReceiver.b;
                                    js3.p(bundle22, "it");
                                    bundle22.putString("SECURE", intent2.getStringExtra("SECURE"));
                                    context2.sendBroadcast(cv.o(str, "ir.mservices.market.saveData", bundle22));
                                    break;
                            }
                            return tx8Var;
                        }
                    });
                    return;
                }
                break;
        }
        lw.g(null, "DeveloperApiReceiver, onReceive() with an unknown action, action=".concat(action), null);
    }
}
