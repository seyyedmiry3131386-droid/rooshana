package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.text.TextUtils;
import com.android.volley.VolleyError;
import com.google.android.gms.cloudmessaging.CloudMessage;
import ir.mservices.market.activity.PermissionDialogActivity;
import ir.mservices.market.core.notification.a;
import ir.mservices.market.data.permission.Permission;
import ir.mservices.market.data.permission.PermissionResult;
import ir.mservices.market.data.permission.Quality;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes.dex */
public final class w42 implements Runnable {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;

    public /* synthetic */ w42() {
        this.a = 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Permission[] permissionArr;
        Permission permission;
        Parcelable[] parcelableArr;
        int i;
        ox9 ox9VarA;
        boolean z = true;
        Object objCall = null;
        Object[] objArr = 0;
        switch (this.a) {
            case 0:
                ry ryVar = (ry) this.c;
                x47 x47Var = (x47) this.b;
                if (x47Var.l()) {
                    x47Var.e("canceled-at-delivery");
                    return;
                }
                VolleyError volleyError = (VolleyError) ryVar.e;
                if (volleyError == null) {
                    x47Var.d(ryVar.c);
                } else {
                    x47Var.c(volleyError);
                }
                if (ryVar.b) {
                    x47Var.a("intermediate-response");
                } else {
                    x47Var.e("done");
                }
                Runnable runnable = (Runnable) this.d;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                PermissionResult permissionResult = PermissionResult.DENIED;
                PermissionDialogActivity permissionDialogActivity = (PermissionDialogActivity) this.d;
                String[] strArr = (String[]) this.b;
                int[] iArr = (int[]) this.c;
                int i2 = PermissionDialogActivity.F0;
                if (permissionDialogActivity.getIntent().getExtras() != null) {
                    Parcelable[] parcelableArrayExtra = permissionDialogActivity.getIntent().getParcelableArrayExtra("BUNDLE_KEY_PERMISSIONS");
                    if (parcelableArrayExtra != null) {
                        Object objNewInstance = Array.newInstance((Class<?>) Permission.class, parcelableArrayExtra.length);
                        js3.n(objNewInstance, "null cannot be cast to non-null type kotlin.Array<T of ir.myket.core.utils.BundleUtils.Companion.getParcelableArray>");
                        parcelableArr = (Parcelable[]) objNewInstance;
                        System.arraycopy(parcelableArrayExtra, 0, parcelableArr, 0, parcelableArrayExtra.length);
                    } else {
                        parcelableArr = null;
                    }
                    permissionArr = (Permission[]) parcelableArr;
                } else {
                    permissionArr = null;
                }
                ArrayList arrayList = new ArrayList();
                if (permissionArr != null) {
                    int i3 = 0;
                    while (i3 < strArr.length) {
                        int length = permissionArr.length;
                        int i4 = 0;
                        while (true) {
                            if (i4 < length) {
                                permission = permissionArr[i4];
                                if (!permission.b.equals(strArr[i3])) {
                                    i4++;
                                }
                            } else {
                                permission = null;
                            }
                        }
                        if (permission != null) {
                            permission.d = i3 < iArr.length ? permissionDialogActivity.k0(iArr[i3], permission.b) : permissionResult;
                            arrayList.add(permission);
                        } else {
                            lw.g(null, "All requested permissions must be available", null);
                        }
                        i3++;
                    }
                }
                PermissionResult permissionResult2 = PermissionResult.DENIED_FOREVER;
                Iterator it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Permission permission2 = (Permission) it.next();
                        if ((permission2.a == 3 && permission2.d == permissionResult2) || permission2.d == permissionResult) {
                            permissionDialogActivity.A0.j(lu7.k, !(Build.VERSION.SDK_INT < 33 ? a.d(permissionDialogActivity, "download") : d7.b(permissionDialogActivity, "android.permission.POST_NOTIFICATIONS")));
                        }
                        if (permission2.d == permissionResult2) {
                        }
                    } else {
                        z = false;
                    }
                }
                Permission[] permissionArr2 = (Permission[]) arrayList.toArray(new Permission[0]);
                if (z) {
                    for (Permission permission3 : permissionArr2) {
                        if (permission3.e == Quality.MANDATORY) {
                            permissionDialogActivity.q0(permissionArr2);
                            return;
                        }
                    }
                }
                permissionDialogActivity.o0(permissionArr2);
                permissionDialogActivity.finish();
                return;
            case 2:
                try {
                    objCall = ((ci2) this.b).call();
                    break;
                } catch (Exception unused) {
                }
                ((Handler) this.d).post(new g6(24, (di2) this.c, objCall, objArr == true ? 1 : 0));
                return;
            default:
                CloudMessage cloudMessage = (CloudMessage) this.c;
                Intent intent = cloudMessage.a;
                String stringExtra = intent.getStringExtra("google.message_id");
                if (stringExtra == null) {
                    stringExtra = intent.getStringExtra("message_id");
                }
                if (TextUtils.isEmpty(stringExtra)) {
                    ox9VarA = z67.g(null);
                } else {
                    Bundle bundle = new Bundle();
                    Intent intent2 = cloudMessage.a;
                    String stringExtra2 = intent2.getStringExtra("google.message_id");
                    if (stringExtra2 == null) {
                        stringExtra2 = intent2.getStringExtra("message_id");
                    }
                    bundle.putString("google.message_id", stringExtra2);
                    Intent intent3 = cloudMessage.a;
                    Integer numValueOf = intent3.hasExtra("google.product_id") ? Integer.valueOf(intent3.getIntExtra("google.product_id", 0)) : null;
                    if (numValueOf != null) {
                        bundle.putInt("google.product_id", numValueOf.intValue());
                    }
                    Context context = (Context) this.b;
                    bundle.putBoolean("supports_message_handled", true);
                    jx9 jx9VarZ = jx9.z(context);
                    synchronized (jx9VarZ) {
                        i = jx9VarZ.a;
                        jx9VarZ.a = i + 1;
                    }
                    ox9VarA = jx9VarZ.A(new kw9(i, 2, bundle, 0));
                }
                ox9VarA.h(ko9.b, new ck4(26, (CountDownLatch) this.d));
                return;
        }
    }

    public /* synthetic */ w42(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public w42(PermissionDialogActivity permissionDialogActivity, String[] strArr, int[] iArr) {
        this.a = 1;
        this.d = permissionDialogActivity;
        this.b = strArr;
        this.c = iArr;
    }
}
