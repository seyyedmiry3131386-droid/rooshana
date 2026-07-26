package defpackage;

import android.app.Notification;

/* JADX INFO: loaded from: classes.dex */
public final class jp5 {
    public final String a;
    public final int b;
    public final Notification c;

    public jp5(String str, int i, Notification notification) {
        this.a = str;
        this.b = i;
        this.c = notification;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotifyTask[packageName:");
        sb.append(this.a);
        sb.append(", id:");
        return dw1.k(this.b, ", tag:null]", sb);
    }
}
