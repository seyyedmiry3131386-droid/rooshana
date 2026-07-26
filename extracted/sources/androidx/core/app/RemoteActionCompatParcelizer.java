package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import defpackage.q49;
import defpackage.r49;
import defpackage.s49;

/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(q49 q49Var) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        s49 s49VarH = remoteActionCompat.a;
        boolean z = true;
        if (q49Var.e(1)) {
            s49VarH = q49Var.h();
        }
        remoteActionCompat.a = (IconCompat) s49VarH;
        CharSequence charSequence = remoteActionCompat.b;
        if (q49Var.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((r49) q49Var).e);
        }
        remoteActionCompat.b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.c;
        if (q49Var.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((r49) q49Var).e);
        }
        remoteActionCompat.c = charSequence2;
        remoteActionCompat.d = (PendingIntent) q49Var.g(remoteActionCompat.d, 4);
        boolean z2 = remoteActionCompat.e;
        if (q49Var.e(5)) {
            z2 = ((r49) q49Var).e.readInt() != 0;
        }
        remoteActionCompat.e = z2;
        boolean z3 = remoteActionCompat.f;
        if (!q49Var.e(6)) {
            z = z3;
        } else if (((r49) q49Var).e.readInt() == 0) {
            z = false;
        }
        remoteActionCompat.f = z;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, q49 q49Var) {
        q49Var.getClass();
        IconCompat iconCompat = remoteActionCompat.a;
        q49Var.i(1);
        q49Var.l(iconCompat);
        CharSequence charSequence = remoteActionCompat.b;
        q49Var.i(2);
        Parcel parcel = ((r49) q49Var).e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.c;
        q49Var.i(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        q49Var.k(remoteActionCompat.d, 4);
        boolean z = remoteActionCompat.e;
        q49Var.i(5);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = remoteActionCompat.f;
        q49Var.i(6);
        parcel.writeInt(z2 ? 1 : 0);
    }
}
