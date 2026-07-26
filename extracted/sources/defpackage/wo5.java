package defpackage;

import ir.mservices.market.data.permission.Permission;

/* JADX INFO: loaded from: classes3.dex */
public final class wo5 {
    public ee a;

    public void onEvent(ns1 ns1Var) {
        dw1.y("notification_download_dialog");
    }

    public void onEvent(c56 c56Var) {
        Permission permission;
        Permission[] permissionArr = c56Var.a;
        int length = permissionArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                permission = null;
                break;
            }
            permission = permissionArr[i];
            if (permission.a == 3) {
                break;
            } else {
                i++;
            }
        }
        if (permission != null) {
            this.a.b("notification_permission", "type", permission.c.f);
        }
    }
}
